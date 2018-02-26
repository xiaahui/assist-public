package ch.hilbri.assist.mapping.ui.metrics;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.impl.AbstractMetricImpl;

/* We need to implement IPartListener2, because we want to get notified, if the active editor changes */
public class MetricsView implements IPartListener2 {

	/*
	 * We would like to have a reference to this view so that others can refresh the
	 * content too
	 */
	public static MetricsView INSTANCE;

	/* Table which contains metric entries */
	private Table tblSelectedMetrics;
	private TableViewer tblSelectedMetricsViewer;

	/*
	 * ComboBox which contains the metrics which are available
	 */
	private Combo cbxAvailableMetrics;

	/* ComboBox which contains available weights */
	private Combo cbxWeight;

	/*
	 * A reference to the current multipage editor which contains the results and
	 * the current metrics
	 */
	private MultiPageEditor currentEditor;

	/* We need this reference to clear the buttons */
	private MetricTableEntryLabelProvider lblProvider;
	private Button btnEvaluateResults;

	/* Public constructor to store the handle for us */
	public MetricsView() {
		INSTANCE = this;
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(final Composite parentMain) {

		parentMain.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		parentMain.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite mainComposite = new Composite(parentMain, SWT.NONE);
		mainComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		GridLayout gl_mainComposite = new GridLayout(8, false);
		gl_mainComposite.horizontalSpacing = 10;
		mainComposite.setLayout(gl_mainComposite);

		Label lblSelectMetricType = new Label(mainComposite, SWT.NONE);
		lblSelectMetricType.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblSelectMetricType.setText("Metric:");

		cbxAvailableMetrics = new Combo(mainComposite, SWT.READ_ONLY);
		GridData gd_cbxAvailableMetrics = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_cbxAvailableMetrics.widthHint = 241;
		cbxAvailableMetrics.setLayoutData(gd_cbxAvailableMetrics);
		cbxAvailableMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));

		Label lblWeight = new Label(mainComposite, SWT.NONE);
		lblWeight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblWeight.setText("Weight:");

		cbxWeight = new Combo(mainComposite, SWT.READ_ONLY);
		cbxWeight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		cbxWeight.setItems(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" });
		cbxWeight.setVisibleItemCount(5);
		Button btnAddMetric = new Button(mainComposite, SWT.NONE);
		btnAddMetric.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnAddMetric.setText("Add Metric");
		btnAddMetric.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/add.gif"));
		btnAddMetric.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent event) {
				widgetSelected(event);
			}

			public void widgetSelected(SelectionEvent event) {

				// Do nothing if we do not have an editor which we are working
				// with
				if (currentEditor == null)
					return;

				// Do nothing, if nothing is selected
				if ((cbxAvailableMetrics.getSelectionIndex() == -1) || (cbxWeight.getSelectionIndex() == -1)) {
					MessageDialog dlg = new MessageDialog(null, "Selection of metric and weight required", null,
							"Please select a metric and a weight from the drop down lists.", MessageDialog.INFORMATION,
							new String[] { "OK" }, 0);
					dlg.open();
					return;
				}

				// Create new MetricTableEntry
				int selectedMetricIndex = cbxAvailableMetrics.getSelectionIndex();
				int selectedWeight = Integer.parseInt(cbxWeight.getItem(cbxWeight.getSelectionIndex()));

				// Create a new metrics instance
				// we need to do this since we do not know the specific
				// class of the abstract metric - could be custom!
				List<AbstractMetric> availMetrics = currentEditor.getAvailableMetricsList();
				Class<? extends AbstractMetric> metricClass = availMetrics.get(selectedMetricIndex).getClass();
				Constructor<?> metricClassConstructor = metricClass.getConstructors()[0];

				try {
					// Create a new instance
					AbstractMetric newMetricObject = (AbstractMetric) metricClassConstructor.newInstance();
					newMetricObject.setWeight(selectedWeight);

					// Add new entry to data
					currentEditor.getSelectedMetricsList().add(newMetricObject);

					// Add input to table
					tblSelectedMetricsViewer.setInput(currentEditor.getSelectedMetricsList());

				} catch (Exception e) {
					e.printStackTrace();
				}

				// Clear selection
				cbxAvailableMetrics.deselectAll();
				cbxWeight.deselectAll();
			}
		});

		Button btnReloadMetrics = new Button(mainComposite, SWT.NONE);
		btnReloadMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnReloadMetrics.setText("Load custom metrics");
		btnReloadMetrics.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/refresh.gif"));
		btnReloadMetrics.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (currentEditor == null) {
					MessageDialog dlg = new MessageDialog(null, "Current editor contains no mapping specification",
							null,
							"The current editor window does not contain a mapping specification. "
									+ "Please open or select an editor tab with a mapping specification. "
									+ "New custom metrics will be added to the currently active editor only.",
							MessageDialog.INFORMATION, new String[] { "OK" }, 0);
					dlg.open();
					return;
				}

				// This will hold our new metrics
				List<AbstractMetric> newCustomMetrics = new ArrayList<AbstractMetric>();

				// Determine the location where we have to look for new metrics
				IFileEditorInput input = (IFileEditorInput) currentEditor.getEditorInput();
				IProject activeProject = input.getFile().getProject();
				IPath activeProjectPath = activeProject.getLocation();
				IPath metricsPath = activeProjectPath.append("Compiled-metrics/");

				// Triggering a build for this project
				try {
					activeProject.build(IncrementalProjectBuilder.FULL_BUILD, null);
				} catch (CoreException e2) {
					// ConsoleCommands.writeErrorLineToConsole("Build error");
					return;
				}

				// Asking the user which metric is to be imported and preselect
				// all entries
				ListSelectionDialog dialog = new ListSelectionDialog(currentEditor.getSite().getShell(),
						metricsPath.append("metrics"), new CompiledMetricsProvider(), new LabelProvider(),
						"Select the metrics which you want to import:");
				dialog.setTitle("Metric selection");
				dialog.setInitialSelections((new CompiledMetricsProvider()).getElements(metricsPath.append("metrics")));
				if (dialog.open() != Window.OK)
					return;

				// Clear old custom metrics in the currentModel
				List<AbstractMetric> removalList = new ArrayList<AbstractMetric>();
				for (AbstractMetric m : currentEditor.getAvailableMetricsList())
					if (!m.isBuiltIn())
						removalList.add(m);
				currentEditor.getAvailableMetricsList().removeAll(removalList);

				try {

					// Create the classloader for our new metrics
					URL url = new URL("file://" + metricsPath.toPortableString());
					URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { url },
							getClass().getClassLoader());

					for (Object obj : dialog.getResult()) {
						// Get the class name
						String className = (String) obj;

						// Get the new class
						Class<? extends AbstractMetricImpl> metricClass = Class
								.forName("metrics." + className, true, classLoader)
								.asSubclass(AbstractMetricImpl.class);
						classLoader.close();

						// Create a new instance of this metric
						AbstractMetric metric = metricClass.getDeclaredConstructor().newInstance();

						// Add the newly created metric to the temporary list of
						// found metrics
						newCustomMetrics.add(metric);
					}

					// Add the new metrics
					currentEditor.getAvailableMetricsList().addAll(newCustomMetrics);

				} catch (ClassNotFoundException | IOException | InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException | NoSuchMethodException
						| SecurityException e1) {
					e1.printStackTrace();
				}

				// Refresh UI with updated data from the UI model
				refreshEntries(currentEditor);
				// restoreTableFromCurrentModel();
				// fillComboBoxWithAvailableMetrics();
			}
		});

		btnEvaluateResults = new Button(mainComposite, SWT.NONE);
		btnEvaluateResults.setEnabled(false);
		btnEvaluateResults.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnEvaluateResults.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/evaluate.gif"));
		btnEvaluateResults.setText("Evaluate results");
		btnEvaluateResults.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (currentEditor != null && currentEditor.getMappingResultsCount() > 0) {
					ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
							currentEditor.getSite().getShell());
					try {
						progressDialog.run(true, false, new EvaluateJob(currentEditor));
					} catch (InvocationTargetException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}

				else {
					MessageDialog dlg = new MessageDialog(null, "No results found", null,
							"No results were found for analysis. Please generate valid deployments.",
							MessageDialog.INFORMATION, new String[] { "OK" }, 0);
					dlg.open();
				}
			}
		});

		Label lblOverflow = new Label(mainComposite, SWT.NONE);
		lblOverflow.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblOverflow.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group grpSelectedMetrics = new Group(mainComposite, SWT.NONE);
		grpSelectedMetrics.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 8, 1));
		grpSelectedMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		FillLayout fl_grpSelectedMetrics = new FillLayout(SWT.HORIZONTAL);
		fl_grpSelectedMetrics.marginHeight = 5;
		fl_grpSelectedMetrics.marginWidth = 5;
		grpSelectedMetrics.setLayout(fl_grpSelectedMetrics);
		grpSelectedMetrics.setText("Selected Metrics");

		Composite composite = new Composite(grpSelectedMetrics, SWT.NONE);
		TableColumnLayout tcl_composite = new TableColumnLayout();
		composite.setLayout(tcl_composite);

		tblSelectedMetricsViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		tblSelectedMetrics = tblSelectedMetricsViewer.getTable();
		tblSelectedMetrics.setHeaderVisible(true);
		tblSelectedMetrics.setLinesVisible(true);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
		tableViewerColumn.setLabelProvider(new MetricTableEntryLabelProvider(tblSelectedMetrics, this));
		TableColumn tblclmnIndex = tableViewerColumn.getColumn();
		tcl_composite.setColumnData(tblclmnIndex, new ColumnPixelData(60, true, true));
		tblclmnIndex.setText("Index");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
		tableViewerColumn_1.setLabelProvider(new MetricTableEntryLabelProvider(tblSelectedMetrics, this));
		TableColumn tblclmnMetric = tableViewerColumn_1.getColumn();
		tcl_composite.setColumnData(tblclmnMetric, new ColumnPixelData(260, true, true));
		tblclmnMetric.setText("Metric");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
		tableViewerColumn_2.setLabelProvider(new MetricTableEntryLabelProvider(tblSelectedMetrics, this));
		TableColumn tblclmnType = tableViewerColumn_2.getColumn();
		tcl_composite.setColumnData(tblclmnType, new ColumnPixelData(90, true, true));
		tblclmnType.setText("Type");

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
		tableViewerColumn_3.setLabelProvider(new MetricTableEntryLabelProvider(tblSelectedMetrics, this));
		TableColumn tblclmnWeight = tableViewerColumn_3.getColumn();
		tcl_composite.setColumnData(tblclmnWeight, new ColumnPixelData(60, true, true));
		tblclmnWeight.setText("Weight");

		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
		lblProvider = new MetricTableEntryLabelProvider(tblSelectedMetrics, this);
		tableViewerColumn_4.setLabelProvider(lblProvider);
		TableColumn tblclmnRemove = tableViewerColumn_4.getColumn();
		tcl_composite.setColumnData(tblclmnRemove, new ColumnPixelData(60, true, true));
		tblclmnRemove.setText("Remove");
		tblSelectedMetricsViewer.setContentProvider(new MetricTableContentProvider());

		// We want to get notified, when the active part changes
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(this);

		// We could have been created lazyly - so we should try to find out
		// about the current editor
		refreshEntries(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor());

	}

	/*
	 * We want to switch to a new editor window - so we need to find out, if that is
	 * indeed a multipageditor and if we can retrieve some metrics from it
	 */
	public void refreshEntries(IWorkbenchPart partRef) {
		// Should we clear the current editor?
		if (partRef == null) {
			currentEditor = null;
		}
		// Apparantly, there is a real editor to talk to
		else if (partRef instanceof MultiPageEditor) {
			// Store the current editor that we think we are dealing with now
			currentEditor = (MultiPageEditor) partRef;

			// Load the list of available metrics
			String[] newItems = currentEditor.getAvailableMetricsList().stream()
					.map(m -> m.getName() + " (" + (m.isBuiltIn() ? "built-in" : "custom") + ")")
					.collect(Collectors.toList()).toArray(new String[0]);
			cbxAvailableMetrics.setItems(newItems);

			// Load the list of selected metrics to the table
			lblProvider.clearAllButtons();
			tblSelectedMetricsViewer.setInput(currentEditor.getSelectedMetricsList());

			// If there are some results to be evaluated, then we should enable the button
			btnEvaluateResults.setEnabled(currentEditor.getMappingResultsCount() > 0);
		}
	}

	void removeEntryFromTable(AbstractMetric entry) {
		// Remove the entry (and the delete button)
		currentEditor.getSelectedMetricsList().remove(entry);
		lblProvider.clearButton(entry);

		// Update the viewer with the new data
		tblSelectedMetricsViewer.setInput(currentEditor.getSelectedMetricsList());

		// Update the UI model
		// saveTableToCurrentModel();
	}

	// void saveTableToCurrentModel() {
	// if (currentModel != null) {
	// currentModel.getSelectedMetricsList().clear();
	// currentModel.getSelectedMetricsList().addAll(tblSelectedMetricsData);
	// }
	// }

	// void restoreTableFromCurrentModel() {
	// if (currentModel != null) {
	//
	// // Remove the old stuff
	// tblSelectedMetricsData.clear();
	// lblProvider.clearAllButtons();
	//
	// // Get the new stuff
	// tblSelectedMetricsData.addAll(currentModel.getSelectedMetricsList());
	// tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
	//
	// // Clear pre-selection
	// cbxAvailableMetrics.deselectAll();
	// cbxWeight.deselectAll();
	// }
	// }

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		refreshEntries(partRef.getPart(false));
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		refreshEntries(null);
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
	}

}

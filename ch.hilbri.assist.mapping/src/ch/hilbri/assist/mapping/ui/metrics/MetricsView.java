package ch.hilbri.assist.mapping.ui.metrics;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
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
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

public class MetricsView {
	
	/* Table which contains metric entries */
	private Table tblSelectedMetrics;
	private TableViewer tblSelectedMetricsViewer;
	
	/* ComboBox which contains the metrics which are available in the UI model */
	private Combo cbxAvailableMetrics;
	
	/* ComboBox which contains available weights */
	private Combo cbxWeight;
	
	/* A reference to the UI model which contains the results and the current metrics */
	private MultiPageEditor currentEditor;

	/* A list which holds the current entries in the table (selected metrics) */
	private List<AbstractMetric> tblSelectedMetricsData; 
	
	/* We need this reference to clear the buttons */
	private MetricTableEntryLabelProvider lblProvider;
	
	/**
	 * Public constructor
	 */
	public MetricsView() {
		tblSelectedMetricsData = new ArrayList<AbstractMetric>();
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
		cbxWeight.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
		cbxWeight.setVisibleItemCount(5);
		Button btnAddMetric = new Button(mainComposite, SWT.NONE);
		btnAddMetric.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnAddMetric.setText("Add Metric");
		btnAddMetric.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/add.gif"));
		btnAddMetric.addSelectionListener(new SelectionListener() {
			
			public void widgetDefaultSelected(SelectionEvent event) { widgetSelected(event);  }
			
			public void widgetSelected(SelectionEvent event) {
				
//				if (currentModel == null) return;
				
				// Do nothing, if nothing is selected
				if ((cbxAvailableMetrics.getSelectionIndex() == -1) || 
				    (cbxWeight.getSelectionIndex() == -1)) {
					MessageDialog dlg = new MessageDialog(null, "Select metric and weight", null, 
							"Please select a metric and a weight from the drop down lists.", 
							MessageDialog.INFORMATION, 
							new String[] { "OK" }, 0);
					dlg.open();
					return;
				}
				
				// Create new MetricTableEntry
//				int selectedMetricIndex = cbxAvailableMetrics.getSelectionIndex();
//				int selectedWeight = Integer.parseInt(cbxWeight.getItem(cbxWeight.getSelectionIndex()));
				
				// Create a new metrics instance
				// we need to do this since we do not know the specific 
				// class of the abstract metric - could be custom!
//				Class<? extends AbstractMetric> metricClass = currentModel.getAvailableMetricsList().get(selectedMetricIndex).getClass();
//				Constructor<?> metricClassConstructor = metricClass.getConstructors()[0];
		
//				try {
					// Create a new instance
//					AbstractMetric newMetricObject = (AbstractMetric) metricClassConstructor.newInstance();
//					newMetricObject.setWeight(selectedWeight);

					// Add new entry to data
//					tblSelectedMetricsData.add(newMetricObject);
					
					// Add input to table
					tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
					
//				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) { e.printStackTrace(); }
				
				// Store updated table in the model
				saveTableToCurrentModel();

				// Clear selection
				cbxAvailableMetrics.deselectAll();;
				cbxWeight.deselectAll();;
		    }
			});
		
		Button btnReloadMetrics = new Button(mainComposite, SWT.NONE);
		btnReloadMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnReloadMetrics.setText("Load custom metrics");
		btnReloadMetrics.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/refresh.gif"));
		btnReloadMetrics.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) { widgetSelected(e); }
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (currentEditor == null) {
					MessageDialog dlg = new MessageDialog(null, "Current editor contains no mapping specification", null, 
							"The current editor window does not contain a mapping specification. " +
							"Please open or select an editor tab with a mapping specification. " + 
							"New custom metrics will be added to the currently active editor only.", 
							MessageDialog.INFORMATION, 
							new String[] { "OK" }, 0);
					dlg.open();
					return;
				}
				
				
				// This will hold our new metrics
				List<AbstractMetric> newCustomMetrics = new ArrayList<AbstractMetric>();
				
				// Determine the location where we have to look for new metrics
				IFileEditorInput input = (IFileEditorInput)currentEditor.getEditorInput() ;
				IProject activeProject = input.getFile().getProject();
				IPath activeProjectPath = activeProject.getLocation();
				IPath metricsPath = activeProjectPath.append("Compiled-metrics/");

				// Triggering a build for this project
				try { activeProject.build(IncrementalProjectBuilder.FULL_BUILD, null);	} 
				catch (CoreException e2) { 
//					ConsoleCommands.writeErrorLineToConsole("Build error"); 
					return; 
				}

				// Asking the user which metric is to be imported and preselect all entries
				ListSelectionDialog dialog = new ListSelectionDialog(currentEditor.getSite().getShell(), 
													metricsPath.append("metrics"), 
													new CompiledMetricsProvider(), 
													new LabelProvider(),
													"Select the metrics which you want to import:");
				dialog.setTitle("Metric selection");
				dialog.setInitialSelections((new CompiledMetricsProvider()).getElements(metricsPath.append("metrics")));
				if (dialog.open() != Window.OK) return;
				
				// Clear old custom metrics in the currentModel
//				for (AbstractMetric m : currentModel.getAvailableMetricsList()) 
//					if (!m.isBuiltIn())
//						currentModel.getAvailableMetricsList().remove(m);
				
				try {
					
					// Create the classloader for our new metrics
					URL url = new URL("file:/" + metricsPath.toPortableString());
					URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] {url}, getClass().getClassLoader());

					for (Object obj : dialog.getResult()) {
						// Get the class name
						String className = (String) obj;
						
						// Get the new class
						Class<? extends AbstractMetricImpl> metricClass = Class.forName("metrics." + className, true, classLoader).asSubclass(AbstractMetricImpl.class);
						classLoader.close();

						// Create a new instance of this metric
						AbstractMetric metric  = metricClass.getDeclaredConstructor().newInstance();
						
						// Add the newly created metric to the temporary list of found metrics
						newCustomMetrics.add(metric);
					}
					
					// Add the new metrics
//					currentModel.getAvailableMetricsList().addAll(newCustomMetrics);
					
				} catch (ClassNotFoundException | IOException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e1) {
					e1.printStackTrace();
				}
				
				// Refresh UI with updated data from the UI model
				restoreTableFromCurrentModel();
				fillComboBoxWithAvailableMetrics();
			}
		});
		
		
		Button btnEvaluateResults = new Button(mainComposite, SWT.NONE);
		btnEvaluateResults.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnEvaluateResults.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/evaluate.gif"));
		btnEvaluateResults.setText("Evaluate results");
		btnEvaluateResults.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) { widgetSelected(e); }

			@Override
			public void widgetSelected(SelectionEvent e) {
//				if (currentModel != null) {
//
//					if ((currentModel.getResults() != null) && (currentModel.getResults().size() > 0)) {
//						
//						ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(currentEditor.getSite().getShell());
//						try {
//							progressDialog.run(true, false, new EvaluateJob(currentModel));
//						} catch (InvocationTargetException | InterruptedException e1) {
//							e1.printStackTrace();
//						}
//					}
//					else {
//						MessageDialog dlg = new MessageDialog(null, "No results found", null, 
//											"No results were found for analysis. Please generate valid deployments.", 
//											MessageDialog.INFORMATION, 
//											new String[] { "OK" }, 0);
//						dlg.open();
//					}
//				}
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
	}
	
		
	
	private void fillComboBoxWithAvailableMetrics() {
//		if (currentModel != null) {
//			
//			String[] newItems = new String[currentModel.getAvailableMetricsList().size()];
//			int ctr = 0;
//			
//			for (AbstractMetric metric : currentModel.getAvailableMetricsList()) 
//				newItems[ctr++] = metric.getName() + " (" + (metric.isBuiltIn()? "built-in" : "custom") + ")";
//			
//			cbxAvailableMetrics.setItems(newItems);
//		}
	}
	
	void removeEntryFromTable(AbstractMetric entry) {
		// Remove the entry (and the delete button)
		tblSelectedMetricsData.remove(entry);
		lblProvider.clearButton(entry);
		
		// Update the viewer with the new data
		tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
		
		// Update the UI model
		saveTableToCurrentModel();
	}
	
	void saveTableToCurrentModel() {
//		if (currentModel != null) {
//			currentModel.getSelectedMetricsList().clear();
//			currentModel.getSelectedMetricsList().addAll(tblSelectedMetricsData);
//		}
	}
	
	void restoreTableFromCurrentModel() {
//		if (currentModel != null) {
//			
//			// Remove the old stuff
//			tblSelectedMetricsData.clear();
//			lblProvider.clearAllButtons();
//
//			// Get the new stuff
//			tblSelectedMetricsData.addAll(currentModel.getSelectedMetricsList());
//			tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
//			
//			// Clear pre-selection
//			cbxAvailableMetrics.deselectAll();
//			cbxWeight.deselectAll();
//		}
	}
	
}

package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.PlatformUI;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.application.helpers.Helpers;
import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.analysis.metrics.custom.MetricLoader;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.result.mapping.AbstractMetric;


public class MetricTableView {
	private Table							table;

	private TableViewer						tableViewer;

	private ArrayList<MetricTableElement>	elementlist;

	private ArrayList<AbstractMetric>		metricsList;

	private DetailedResultsViewUiModel		model						= null;

	public static final String				SET_METRIC_CONTENT_PROVIDER	= "set_metric_content_provider";

	public static final String				EDITOR_CLOSED				= "editor_closed";

	private static final String				INDEX						= "Index";
	
	private static final String				WEIGHT						= "Weight";

	private static final String				METRIC						= "Metric";

	private static final String				TYPE						= "Type";

	private static final String[]			PROPS						= { INDEX, WEIGHT, METRIC, TYPE };

	private Label							tbMessageLabel;

	public MetricTableView() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(final Composite parentMain) {
		GridLayout gl_parentMain = new GridLayout(1, false);
		gl_parentMain.verticalSpacing = 0;
		gl_parentMain.marginWidth = 0;
		gl_parentMain.marginHeight = 0;
		gl_parentMain.horizontalSpacing = 0;
		parentMain.setLayout(gl_parentMain);
		parentMain.setLayoutData(new GridData(SWT.FILL, SWT.FILL));

		setupMetricToolbar(parentMain);

		setupTable(parentMain);
	}

	/**
	 * Initialises the toolbar of the metric table with all its functionalities
	 */
	private void setupMetricToolbar(Composite parentMain) {
		Composite toolbarComposite = new Composite(parentMain, SWT.NONE);

		Display display = parentMain.getDisplay();
		Color bgWhite = new Color(null, 255, 255, 255);
		Image bgImg = new Image(display, getClass().getClassLoader().getResourceAsStream("/icons/metricTable/toolbar_bg_img.gif"));
		Image loadImage = new Image(display, getClass().getClassLoader().getResourceAsStream("/icons/metricTable/toolbar_load_metric.gif"));
		Image addImage = new Image(display, getClass().getClassLoader().getResourceAsStream("/icons/metricTable/toolbar_add_metric.gif"));
		Image evaluateImage = new Image(display, getClass().getClassLoader().getResourceAsStream("/icons/metricTable/toolbar_evaluate.gif"));

		ToolBar toolBar = new ToolBar(toolbarComposite, SWT.FLAT | SWT.RIGHT);
		toolBar.setSize(1500, 22);
		toolBar.setBackground(bgWhite);
		toolBar.setBackgroundImage(bgImg);
		GridLayout gridLayout = new GridLayout();
		gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.numColumns = 1;
		toolbarComposite.setLayout(gridLayout);
		GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gridData.grabExcessHorizontalSpace = true;
		toolbarComposite.setLayoutData(gridData);

		ToolItem tltmLoadMetric = new ToolItem(toolBar, SWT.NONE);
		tltmLoadMetric.setImage(loadImage);
		tltmLoadMetric.setToolTipText("Load Metric(s) from Metric projects in the workspace");
		tltmLoadMetric.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				DetailedResultsViewUiModel model = getAndCheckModel();
				if (model == null) return;
				List<AbstractMetric> newMetrics = MetricLoader.loadMetric(metricsList, model);
				if (newMetrics != null) {
					if (newMetrics.size() == 0) return;

					// Inserts the loaded metrics or overrides existing ones
					newMetrics: for (AbstractMetric metric : newMetrics) {

						// Checks if the metric is already in the table and updates it if necessary
						for (MetricTableElement tmp : elementlist) {
							if (tmp.getMetric().getName().equals(metric.getName())) {
								tmp.setMetric(tmp.getMetricPostitionInList());
								continue newMetrics;
							}
						}

						// If its a completely new metric, it is added as a new element
						for (int i = 0; i < metricsList.size(); i++) {
							if (metric == metricsList.get(i)) {
								MetricTableElement element = new MetricTableElement(metric, i, metricsList);
								elementlist.add(element);
							}
						}
					}
					tableViewer.refresh();
					refreshMetricComboBox();
				} else {
					sendMessageToMetricTable(tbMessageLabel, "An error occured while loading metrics. Please check the console for more information.", true);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		ToolItem tltmAddMetric = new ToolItem(toolBar, SWT.NONE);
		tltmAddMetric.setImage(addImage);
		tltmAddMetric.setToolTipText("Add a new Metric to to table.");
		tltmAddMetric.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (elementlist.size() == metricsList.size()) {
					sendMessageToMetricTable(tbMessageLabel, "All available metrics are already in use.", false);
					return;
				}
				int pos = 0;
				metricLoop: for (int i = 0; i < metricsList.size(); i++) {
					for (MetricTableElement tmp : elementlist) {
						if (tmp.getMetricPostitionInList() == i) {
							continue metricLoop;
						}
					}
					pos = i;
					break;
				}
				// int pos = elementlist.size() % metricsList.size();
				MetricTableElement element = new MetricTableElement(metricsList.get(pos), pos, metricsList);
				elementlist.add(element);
				tableViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		ToolItem tltmEvaluateAndSort = new ToolItem(toolBar, SWT.NONE);
		tltmEvaluateAndSort.setImage(evaluateImage);
		tltmEvaluateAndSort.setToolTipText("Evaluate and Sort Metrics in the corresponding Mapping Editor.");
		tltmEvaluateAndSort.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent es) {
				final ArrayList<AbstractMetric> analysis = new ArrayList<AbstractMetric>();
				for (MetricTableElement tmp : elementlist) {
					analysis.add(tmp.getMetric());
				}

				DetailedResultsViewUiModel model = getAndCheckModel();
				if (model == null) return;

				if (model.getResults() == null) {
					MessageDialog noResultsFoundDialog = new MessageDialog(null, "No results found", null, "No results were found to evaluate for the current Mapping Editor" + (model.getEditor() != null ? " \"" + model.getEditor().getPartName() + "\". Maybe you need to compute them first" : "")
							+ ".", MessageDialog.INFORMATION, new String[] { "OK" }, 0);
					noResultsFoundDialog.open();
					return;
				}

				/*
				 * Compute the results and update the data
				 */
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
				try {
					progressDialog.run(true, true, new EvaluateJob(analysis));
				} catch (InvocationTargetException e) {
					ConsoleCommands.writeErrorLineToConsole("InvocationTargetException while starting project scanner.");
					e.printStackTrace();
					return;
				} catch (InterruptedException e) {
					ConsoleCommands.writeErrorLineToConsole("InterruptedException while scanning projects.");
					e.printStackTrace();
					return;
				}

				// IntegerProperty currentIndex =
				// detailedResultsViewUiModel.indexToDrawProperty();
				// drawTreeView(currentIndex.get());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		ToolItem tltmSeperator_1 = new ToolItem(toolBar, SWT.SEPARATOR);
		tltmSeperator_1.setText("Seperator");

		ToolItem tltmSeperator = new ToolItem(toolBar, SWT.SEPARATOR);
		tltmSeperator.setWidth(toolBar.getBounds().width - tltmLoadMetric.getBounds().width - tltmAddMetric.getBounds().width - tltmEvaluateAndSort.getBounds().width);
		tbMessageLabel = new Label(toolBar, SWT.NONE);
		tbMessageLabel.setBackgroundImage(bgImg);
		tltmSeperator.setControl(tbMessageLabel);
	}

	/**
	 * Initialises the metric table
	 */
	private void setupTable(Composite parentMain) {
		final ScrolledComposite scrollComposite = new ScrolledComposite(parentMain, SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd_scrollComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_scrollComposite.horizontalAlignment = SWT.FILL;
		gd_scrollComposite.widthHint = 500;
		gd_scrollComposite.verticalAlignment = SWT.FILL;
		// gd_scrollComposite.grabExcessHorizontalSpace = true;
		gd_scrollComposite.grabExcessVerticalSpace = true;
		scrollComposite.setLayoutData(gd_scrollComposite);

		final Composite parent = new Composite(scrollComposite, SWT.NONE);

		FillLayout rl_parent = new FillLayout();
		rl_parent.spacing = 0;
		parent.setLayout(rl_parent);

		elementlist = new ArrayList<MetricTableElement>();

		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new MetricContentProvider());

		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// ----------------------Weight Column---------------------
		TableColumn tblclmnIndexColumn = new TableColumn(table, SWT.LEFT);
		tblclmnIndexColumn.setToolTipText("Displays the metrics index.");
		tblclmnIndexColumn.setWidth(100);
		tblclmnIndexColumn.setText("Index");
				
		// ----------------------Weight Column---------------------
		TableColumn tblclmnWeightColumn = new TableColumn(table, SWT.LEFT);
		tblclmnWeightColumn.setToolTipText("Displays the metrics weight. Can be edited by clicking in the cell.");
		tblclmnWeightColumn.setWidth(100);
		tblclmnWeightColumn.setText("Weight");

		// ---------------------metric Column---------------
		TableColumn tblclmnMetricColumn = new TableColumn(table, SWT.LEFT);
		tblclmnMetricColumn.setToolTipText("Shows the chosen metrics. A combobox with the possible metrics will show up by clicking in the cell.");
		tblclmnMetricColumn.setWidth(155);
		tblclmnMetricColumn.setText("Metric");

		// ---------------------Type Column---------------
		TableColumn tblclmnTypeColumn = new TableColumn(table, SWT.LEFT);
		tblclmnTypeColumn.setToolTipText("Indicates wheter the metric is a built-in or a custom metric.");
		tblclmnTypeColumn.setWidth(100);
		tblclmnTypeColumn.setText("Type");

		// ----------------Remove Column-------------
		TableColumn tblclmnRemoveColumn = new TableColumn(table, SWT.LEFT);
		tblclmnRemoveColumn.setToolTipText("By clicking on the button you can remove the metric in the corresponding row.");
		tblclmnRemoveColumn.setWidth(60);
		tblclmnRemoveColumn.setText("Remove");

		tableViewer.setInput(elementlist);

		scrollComposite.setContent(parent);
		scrollComposite.setExpandVertical(true);
		scrollComposite.setExpandHorizontal(true);
		// scrollComposite.setAlwaysShowScrollBars(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(parent.computeSize(r.width, SWT.DEFAULT));
			}
		});

		// Enable scrolling
		Helpers.installMouseWheelScrollRecursively(scrollComposite);
	}

	@PreDestroy
	public void dispose() {
		saveMetricList();
	}

	/**
	 * Saves the current state of the metric table inside the model of the related Mapping Editor
	 */
	private void saveMetricList() {
		if (model == null) return;
		ArrayList<AbstractMetric> usedMetrics = model.getUsedMetricList();
		if (usedMetrics == null) {
			usedMetrics = new ArrayList<AbstractMetric>();
			model.setUsedMetricList(usedMetrics);
		} else {
			usedMetrics.clear();
		}
		for (MetricTableElement tmp : elementlist) {
			usedMetrics.add(tmp.getMetric());
		}
	}

	/**
	 * Refreshs the tables combobox considering changes in the metricsList
	 */
	private void refreshMetricComboBox() {
		CellEditor[] cellEditors = tableViewer.getCellEditors();
		cellEditors[1] = new MetricComboBoxCellEditor();
	}

	@Focus
	public void setFocus() {
	}

	/**
	 * The method receives the broadcast from a Mapping Editor with the model of the focused editor.
	 * 
	 * @param obj
	 *            Object array with size 2 which holds the DetailedResultsViewUiModel as first and MultiPageEditor as
	 */
	@Inject
	@Optional
	public void setMetricContentProvider(@UIEventTopic(SET_METRIC_CONTENT_PROVIDER) MultiPageEditor editor) {
		DetailedResultsViewUiModel model = editor.getDetailedResultViewUiModel();

		if (model.getEditor() == editor) {
			if (this.model != model) {
				if (this.model != null) {
					saveMetricList();
				}
				this.model = model;
				elementlist.clear();
				this.metricsList = model.getMetricList();

				initialiseTable();

			}
		}
	}

	/**
	 * In case an editor is closed, this method gets a broadcast and clears the table.
	 * 
	 * @param editor
	 */
	@Inject
	@Optional
	public void editorClosed(@UIEventTopic(EDITOR_CLOSED) MultiPageEditor editor) {
		if (model == null) return;
		if (model.getEditor() == editor) {
			this.model = null;
			tableViewer.getLabelProvider().dispose();
			elementlist.clear();
			tableViewer.refresh();
		}
	}

	private void initialiseTable() {
		ArrayList<AbstractMetric> usedMetrics = model.getUsedMetricList();
		if (usedMetrics != null) {
			for (AbstractMetric tmp : usedMetrics) {
				for (int i = 0; i < metricsList.size(); i++) {
					if (tmp == metricsList.get(i)) {
						MetricTableElement element = new MetricTableElement(metricsList.get(i), i, metricsList);
						elementlist.add(element);
					}
				}
			}
		} else {
			MetricTableElement element = new MetricTableElement(metricsList.get(0), 0, metricsList);
			elementlist.add(element);
		}
		CellEditor[] editors = new CellEditor[3];
//		editors[0] = new TextCellEditor(table);
		editors[1] = new TextCellEditor(table);
		editors[2] = new MetricComboBoxCellEditor();

		tableViewer.setLabelProvider(new MetricLabelProvider());
		tableViewer.setColumnProperties(PROPS);
		tableViewer.setCellModifier(new MetricCellModifier(tableViewer));
		tableViewer.setCellEditors(editors);
		tableViewer.refresh();

	}

	private String[] getMetricsAsArray() {
		if (metricsList != null) {
			String[] metrics = new String[metricsList.size()];
			for (int i = 0; i < metricsList.size(); i++) {
				metrics[i] = metricsList.get(i).getName();
			}
			return metrics;
		}
		return null;
	}

	/**
	 * Checks if there is a valid model from an open editor. If there is none or the editor has been closed, a message
	 * will indicate that
	 * 
	 * @return The valid model or null, if there is none or the editor closed
	 */
	private DetailedResultsViewUiModel getAndCheckModel() {
		if (model == null) {
			MessageDialog noResultsFoundDialog = new MessageDialog(null, "No Model found", null, "Please select a Mapping Editor to obtain a valid model.", MessageDialog.INFORMATION, new String[] { "OK" }, 0);
			noResultsFoundDialog.open();
			return null;
		} else {
			return model;
		}
	}

	/**
	 * Sends a message to the metric table which will be shown to the user in the given label and disapears after 5
	 * seconds
	 * 
	 * @param label
	 * @param message
	 */
	public static void sendMessageToMetricTable(final Label label, final String message, final boolean errorMsg) {
		if (label.isDisposed()) return;

		Job messageJob = new Job("Update Message") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final Display display = label.getDisplay();
				final Color labelColor;
				if (errorMsg) {
					labelColor = new Color(display, 255, 0, 0);
				} else {
					labelColor = new Color(display, 0, 0, 0);
				}

				display.asyncExec(new Runnable() {

					@Override
					public void run() {
						FontData fontData = label.getFont().getFontData()[0];
						Font font = new Font(display, new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
						label.setFont(font);
						label.setForeground(labelColor);
						label.setText(message);
					}
				});
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				display.asyncExec(new Runnable() {

					@Override
					public void run() {
						if (!label.isDisposed()) if (label.getText().equals(message)) {
							label.setText("");
						}
					}
				});
				return Status.OK_STATUS;
			}

		};

		messageJob.schedule();
	}

	// ---------------------classes---------------------

	/**
	 * This class provides the content for the metric table
	 */

	class MetricContentProvider implements IStructuredContentProvider {
		/**
		 * Returns the Metric objects
		 */
		public Object[] getElements(Object inputElement) {
			return ((ArrayList<?>) inputElement).toArray();
		}

		/**
		 * Disposes any created resources
		 */
		public void dispose() {
			// Do nothing
		}

		/**
		 * Called when the input changes
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// Ignore
		}
	}

	private class MetricCellModifier implements ICellModifier {
		private TableViewer	viewer;

		public MetricCellModifier(TableViewer viewer) {
			this.viewer = viewer;
		}

		@Override
		public boolean canModify(Object element, String property) {
			return true;
		}

		@Override
		public Object getValue(Object element, String property) {
			MetricTableElement metric = (MetricTableElement) element;
			if (WEIGHT.equals(property)) {
				return String.valueOf(metric.getWeight());
			} else if (METRIC.equals(property)) {
				return metric.getMetricPostitionInList();
			} else if (TYPE.equals(property)) {
				if (metric.isBuiltIn()) {
					return "Built-in";
				} else {
					return "Custom";
				}
			} else if (INDEX.equals(property)) {
				return table.indexOf((TableItem) element);
			}else {
				return null;
			}
		}

		@Override
		public void modify(Object element, String property, Object value) {
			TableItem item = (TableItem) element;
			MetricTableElement metric = (MetricTableElement) item.getData();
			if (WEIGHT.equals(property)) {
				try {
					metric.setWeight(Integer.parseInt(String.valueOf(value)));
				} catch (NumberFormatException e) {

				}
			} else if (METRIC.equals(property)) {
				if (value instanceof Integer) {
					int pos = (int) value;
					metric.setMetric(pos);
				}
			} 
			viewer.update(item.getData(), null);
		}

	}

	private class MetricLabelProvider extends CellLabelProvider {

		Map<Object, Button>	buttons	= new HashMap<Object, Button>();
		TableEditor			editor;

		@Override
		public void update(final ViewerCell cell) {
			final MetricTableElement metric = (MetricTableElement) cell.getElement();
			switch (cell.getColumnIndex()) {
			case 0:
				cell.setText(String.valueOf(table.indexOf((TableItem) cell.getItem())+1));
				break;
			case 1:
				cell.setText(String.valueOf(metric.getWeight()));
				break;
			case 2:
				cell.setText(metric.getName());
				break;
			case 3:
				if (metric.isBuiltIn()) {
					cell.setText("Built-in");
				} else {
					cell.setText("Custom");
				}
				break;
			case 4:
				final Button button;
				if (buttons.containsKey(cell.getElement())) {
					button = buttons.get(cell.getElement());
				} else {
					button = new Button((Composite) cell.getViewerRow().getControl(), SWT.NONE);
					button.addSelectionListener(new SelectionListener() {

						@Override
						public void widgetSelected(SelectionEvent e) {
							if (elementlist.size() > 0) {
								MessageDialog metricRemoveDialog = new MessageDialog(null, "Remove Metric", null, "Are you sure you want to remove the Metric \"" + metric.getName() + "\"?", MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);
								int result = metricRemoveDialog.open();
								if (result == 0) {
									elementlist.remove(metric);
									button.getDisplay().asyncExec(new Runnable() {

										@Override
										public void run() {
											buttons.remove(cell.getElement());
											button.dispose();
											tableViewer.refresh();
										}
									});

								}
							}
						}

						@Override
						public void widgetDefaultSelected(SelectionEvent e) {

						}
					});
					buttons.put(cell.getElement(), button);
				}

				Image bgImg = new Image(table.getDisplay(), getClass().getClassLoader().getResourceAsStream("/icons/metricTable/remove_metric.gif"));
				button.setImage(bgImg);
				editor = new TableEditor(table);
				editor.grabHorizontal = true;
				editor.grabVertical = true;
				TableItem item = (TableItem) cell.getItem();
				editor.setEditor(button, item, 4);
				editor.layout();
				break;
			}

		}

		@Override
		public void dispose() {
			for (Button tmp : buttons.values()) {
				tmp.dispose();
			}
			super.dispose();
		}

		@Override
		public void dispose(ColumnViewer viewer, ViewerColumn column) {
			super.dispose(viewer, column);

		}
	}

	private class MetricComboBoxCellEditor extends ComboBoxCellEditor {

		public MetricComboBoxCellEditor() {
			super(table, getMetricsAsArray(), SWT.READ_ONLY, elementlist, tbMessageLabel);
		}

		@Override
		public String[] getItems() {
			return super.getItems();
		}

	}

	private class EvaluateJob implements IRunnableWithProgress {

		private ArrayList<AbstractMetric>	analysis;

		public EvaluateJob(ArrayList<AbstractMetric> analysis) {
			this.analysis = analysis;
		}

		@Override
		public void run(IProgressMonitor monitor) {
			monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);
			ResultsAnalysis.evaluate(model.getResults(), analysis);
			Collections.sort(model.getResults());
			model.setResultsList(model.getResults());
			monitor.done();
		}
	}
}

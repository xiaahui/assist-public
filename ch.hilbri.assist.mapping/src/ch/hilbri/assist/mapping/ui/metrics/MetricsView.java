package ch.hilbri.assist.mapping.ui.metrics;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
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
import org.eclipse.wb.swt.ResourceManager;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class MetricsView {
	
	/* Internal messages from the detailed results view, so we get notified if the editor changes */
	public static final String	MSG_CURRENT_EDITOR_SWITCHED	= "assist/mapping/current_editor_switched";
	public static final String	MSG_CURRENT_EDITOR_CLOSED	= "assist/mapping/current_editor_closed";

	/* Table which contains metric entries */
	private Table tblSelectedMetrics;
	private TableViewer tblSelectedMetricsViewer;
	
	/* ComboBox which contains the metrics which are available in the UI model */
	private Combo cbxAvailableMetrics;
	
	/* ComboBox which contains available weights */
	private Combo cbxWeight;
	
	/* A reference to the UI model which contains the results and the current metrics */
	private MultiPageEditor currentEditor;
	private DetailedResultsViewUiModel currentModel;

	/* A list which holds the current entries in the table (selected metrics) */
	private List<AbstractMetric> tblSelectedMetricsData; 
	
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
		GridLayout gl_parentMain = new GridLayout(8, false);
		gl_parentMain.horizontalSpacing = 10;
		parentMain.setLayout(gl_parentMain);
		
		Label lblSelectMetricType = new Label(parentMain, SWT.NONE);
		lblSelectMetricType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSelectMetricType.setText("Metric:");
		
		cbxAvailableMetrics = new Combo(parentMain, SWT.READ_ONLY);
		GridData gd_cbxAvailableMetrics = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_cbxAvailableMetrics.widthHint = 260;
		cbxAvailableMetrics.setLayoutData(gd_cbxAvailableMetrics);
	
		Label lblWeight = new Label(parentMain, SWT.NONE);
		lblWeight.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWeight.setText("Weight:");
		
		cbxWeight = new Combo(parentMain, SWT.READ_ONLY);
		cbxWeight.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
		cbxWeight.setVisibleItemCount(5);
		cbxWeight.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Button btnAddMetric = new Button(parentMain, SWT.NONE);
		btnAddMetric.setText("Add Metric");
		btnAddMetric.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/add.gif"));
		btnAddMetric.addSelectionListener(new SelectionListener() {
			
			public void widgetDefaultSelected(SelectionEvent event) { widgetSelected(event);  }
			
			public void widgetSelected(SelectionEvent event) {
		    
				// Create new MetricTableEntry
				int selectedMetricIndex = cbxAvailableMetrics.getSelectionIndex();
				int selectedWeight = Integer.parseInt(cbxWeight.getItem(cbxWeight.getSelectionIndex()));
				AbstractMetric newEntry = EcoreUtil.copy(currentModel.getAvailableMetricsList().get(selectedMetricIndex));
				newEntry.setWeight(selectedWeight);

				// Add new entry to data
				tblSelectedMetricsData.add(newEntry);
				
				// Add input to table
				tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
		    }
	    });
		
		Button btnReloadMetrics = new Button(parentMain, SWT.NONE);
		btnReloadMetrics.setText("Load custom metrics");
		btnReloadMetrics.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/refresh.gif"));
		
		Button btnEvaluateResults = new Button(parentMain, SWT.NONE);
		btnEvaluateResults.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/evaluate.gif"));
		btnEvaluateResults.setText("Evaluate results");
		
		Label label = new Label(parentMain, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
				
		Group grpSelectedMetrics = new Group(parentMain, SWT.NONE);
		grpSelectedMetrics.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpSelectedMetrics.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 8, 1));
		grpSelectedMetrics.setText("Selected metrics");
		
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
		tableViewerColumn_4.setLabelProvider(new MetricTableEntryLabelProvider(tblSelectedMetrics, this));
		TableColumn tblclmnRemove = tableViewerColumn_4.getColumn();
		tcl_composite.setColumnData(tblclmnRemove, new ColumnPixelData(60, true, true));
		tblclmnRemove.setText("Remove");
		tblSelectedMetricsViewer.setContentProvider(new MetricTableContentProvider());
	}
	
	/**
	 * The method receives the broadcast from a Mapping Editor with the model of the focused editor.
	 */
	@Inject
	@Optional
	private void processMessageEditorSwitched(@UIEventTopic(MSG_CURRENT_EDITOR_SWITCHED) MultiPageEditor newEditor) {
		if (newEditor != currentEditor) {
			/* Store the current metric selection */
			storeMetricsFromTableEntriesInCurrentModel();
			
			/* Change editor and model */
			DetailedResultsViewUiModel newModel = newEditor.getDetailedResultViewUiModel();
			currentEditor = newEditor;
			currentModel = newModel;
			
			/* Restore the data */
			
			/* Fill the combobox with available metrics */
			fillComboBoxWithAvailableMetrics();
		}
	}

	/**
	 * In case an editor is closed, this method gets a broadcast and clears the table.
	 * 
	 * @param closedEditor
	 */
	@Inject
	@Optional
	private void processMessageEditorClosed(@UIEventTopic(MSG_CURRENT_EDITOR_CLOSED) MultiPageEditor closedEditor) {
		/* Did the editor for our current model close? */
		if (currentEditor == closedEditor) { 
			currentModel = null;
			currentEditor = null;
		} 
	}
	
	private void fillComboBoxWithAvailableMetrics() {
		if (currentModel != null) {
			
			String[] newItems = new String[currentModel.getAvailableMetricsList().size()];
			int ctr = 0;
			
			for (AbstractMetric metric : currentModel.getAvailableMetricsList()) 
				newItems[ctr++] = metric.getName() + " (" + (metric.isBuiltIn()? "built-in" : "custom") + ")";
			
			cbxAvailableMetrics.setItems(newItems);
		}
	}
	
	void removeEntryFromTable(AbstractMetric entry) {
		tblSelectedMetricsData.remove(entry);
		tblSelectedMetricsViewer.setInput(tblSelectedMetricsData);
	}
	
	void storeMetricsFromTableEntriesInCurrentModel() {
		currentModel.getSelectedMetricsList().clear();
		currentModel.getSelectedMetricsList().addAll(tblSelectedMetricsData);
	}
	
	void restoreTableEntriesFromCurrentModel() {
		tblSelectedMetricsData.clear();
		tblSelectedMetricsData.addAll(currentModel.getSelectedMetricsList());
	}
	
}

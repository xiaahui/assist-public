package ch.hilbri.assist.mapping.ui.metrics;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.wb.swt.ResourceManager;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class MetricTableView {
	
	/* Internal messages from the detailed results view, so we get notified if the editor changes */
	public static final String	MSG_CURRENT_EDITOR_SWITCHED	= "assist/mapping/current_editor_switched";
	public static final String	MSG_CURRENT_EDITOR_CLOSED	= "assist/mapping/current_editor_closed";

	/* Table which contains metric entries */
	private Table table;
	
	/* ComboBox which contains the metrics which are available in the UI model */
	private Combo cbxAvailableMetrics;
	
	/* A reference to the UI model which contains the results and the current metrics */
	private MultiPageEditor currentEditor;
	private DetailedResultsViewUiModel currentModel;
	
	

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
		gd_cbxAvailableMetrics.widthHint = 259;
		cbxAvailableMetrics.setLayoutData(gd_cbxAvailableMetrics);
	
		Label lblWeight = new Label(parentMain, SWT.NONE);
		lblWeight.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWeight.setText("Weight:");
		
		Combo combo = new Combo(parentMain, SWT.READ_ONLY);
		combo.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
		combo.setVisibleItemCount(5);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Button btnNewButton = new Button(parentMain, SWT.NONE);
		btnNewButton.setText("Add Metric");
		btnNewButton.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/add.gif"));
		
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
		composite.setLayout(new TableColumnLayout());
		
		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	}
	
	/**
	 * The method receives the broadcast from a Mapping Editor with the model of the focused editor.
	 */
	@Inject
	@Optional
	private void processMessageEditorSwitched(@UIEventTopic(MSG_CURRENT_EDITOR_SWITCHED) MultiPageEditor newEditor) {
		if (newEditor != currentEditor) {
			DetailedResultsViewUiModel newModel = newEditor.getDetailedResultViewUiModel();
			currentEditor = newEditor;
			currentModel = newModel;
			
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
	
}

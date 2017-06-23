package ch.hilbri.assist.mapping.ui.multipageeditor.results;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.mapping.model.result.Result;

public class DetailedResults extends Composite {

	private Text textFilter;
	private Table tblResult;

	private List<Result> mappingResults = null;
	private int curResultIndex = -1;
	private Result curResult = null;
	private Button btnFirst;
	private Button btnPrev;
	private Button btnGotoResult;
	private Button btnNext;
	private Button btnLast;
	private Composite compositeResultNumber;
	private Label lblResultNum;
	private TableViewer tblviewerResult;
	private TableColumn tblclmnProcessor;
	private TableViewerColumn tableViewerColumn_2;
	private TableColumn tblclmnApplication;
	private TableViewerColumn tableViewerColumn;
	private TableColumn tblclmnTask;
	private TableViewerColumn tableViewerColumn_1;
	private TableColumn tblclmnCore;
	private TableViewerColumn tableViewerColumn_3;
	private TableColumn tblclmnBoard;
	private TableViewerColumn tableViewerColumn_4;
	private TableColumn tblclmnBox;
	private TableViewerColumn tableViewerColumn_5;
	private TableColumn tblclmnCompartment;
	private TableViewerColumn tableViewerColumn_6;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DetailedResults(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		setLayout(new GridLayout(1, false));
		
		compositeResultNumber = new Composite(this, SWT.NONE);
		GridLayout gl_compositeResultNumber = new GridLayout(2, false);
		gl_compositeResultNumber.marginWidth = 0;
		compositeResultNumber.setLayout(gl_compositeResultNumber);
		compositeResultNumber.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		compositeResultNumber.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label lblResult = new Label(compositeResultNumber, SWT.NONE);
		lblResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblResult.setText("Result:");
		
		lblResultNum = new Label(compositeResultNumber, SWT.NONE);
		lblResultNum.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		lblResultNum.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label lblFilterHintText = new Label(this, SWT.NONE);
		lblFilterHintText.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblFilterHintText.setText("Please select filter");
		
		textFilter = new Text(this, SWT.BORDER);
		GridData gd_textFilter = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_textFilter.widthHint = 387;
		textFilter.setLayoutData(gd_textFilter);
		
		Composite compositeResultData = new Composite(this, SWT.NONE);
		compositeResultData.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		GridLayout gl_compositeResultData = new GridLayout(1, false);
		gl_compositeResultData.marginHeight = 0;
		gl_compositeResultData.marginWidth = 0;
		compositeResultData.setLayout(gl_compositeResultData);
		GridData gd_compositeResultData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_compositeResultData.widthHint = 548;
		gd_compositeResultData.heightHint = 172;
		compositeResultData.setLayoutData(gd_compositeResultData);
		
		tblviewerResult = new TableViewer(compositeResultData, SWT.BORDER | SWT.FULL_SELECTION);
		tblResult = tblviewerResult.getTable();
		tblResult.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tblResult.setHeaderVisible(true);
		tblResult.setLinesVisible(true);
		
		tableViewerColumn = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(0);
			}
		});
		tblclmnApplication = tableViewerColumn.getColumn();
		tblclmnApplication.setWidth(100);
		tblclmnApplication.setText("Application");
		
		tableViewerColumn_1 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(1);
			}
		});
		tblclmnTask = tableViewerColumn_1.getColumn();
		tblclmnTask.setWidth(100);
		tblclmnTask.setText("Task");
		
		tableViewerColumn_3 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(2);
			}
		});
		tblclmnCore = tableViewerColumn_3.getColumn();
		tblclmnCore.setWidth(100);
		tblclmnCore.setText("Core");
		
		tableViewerColumn_2 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(3);
			}
		});
		tblclmnProcessor = tableViewerColumn_2.getColumn();
		tblclmnProcessor.setWidth(100);
		tblclmnProcessor.setText("Processor");
		
		tableViewerColumn_4 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(4);
			}
		});
		tblclmnBoard = tableViewerColumn_4.getColumn();
		tblclmnBoard.setWidth(100);
		tblclmnBoard.setText("Board");
		
		tableViewerColumn_5 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(5);
			}
		});
		tblclmnBox = tableViewerColumn_5.getColumn();
		tblclmnBox.setWidth(100);
		tblclmnBox.setText("Box");
		
		tableViewerColumn_6 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
			@SuppressWarnings("unchecked")
			public String getText(Object element) {
				return element == null ? "" : ((List<String>) element).get(6);
			}
		});
		tblclmnCompartment = tableViewerColumn_6.getColumn();
		tblclmnCompartment.setWidth(100);
		tblclmnCompartment.setText("Compartment");
		tblviewerResult.setContentProvider(ArrayContentProvider.getInstance());
		
		Composite compositeNavButtons = new Composite(this, SWT.NONE);
		compositeNavButtons.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		RowLayout rl_compositeNavButtons = new RowLayout(SWT.HORIZONTAL);
		rl_compositeNavButtons.justify = true;
		rl_compositeNavButtons.wrap = false;
		compositeNavButtons.setLayout(rl_compositeNavButtons);
		compositeNavButtons.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnFirst = new Button(compositeNavButtons, SWT.NONE);
		btnFirst.setEnabled(false);
		btnFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) { showResult(0); }
		});
		btnFirst.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnFirst.setText("<<");
		
		btnPrev = new Button(compositeNavButtons, SWT.NONE);
		btnPrev.setEnabled(false);
		btnPrev.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (curResultIndex > 0) showResult(curResultIndex - 1);
			}
		});
		btnPrev.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnPrev.setText("< Previous");
		
		btnGotoResult = new Button(compositeNavButtons, SWT.NONE);
		btnGotoResult.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GotoSolutionDialog dlg = new GotoSolutionDialog(e.widget.getDisplay().getActiveShell(), curResultIndex+1);
				if (dlg.open() == Window.OK)
					showResult(dlg.getGotoSolutionIdx());
					
					
			}
		});
		btnGotoResult.setEnabled(false);
		btnGotoResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnGotoResult.setText("Got to...");
		
		btnNext = new Button(compositeNavButtons, SWT.NONE);
		btnNext.setEnabled(false);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if ((curResultIndex + 1) < mappingResults.size()) showResult(curResultIndex + 1);
			}
		});
		btnNext.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNext.setText("Next >");
		
		btnLast = new Button(compositeNavButtons, SWT.NONE);
		btnLast.setEnabled(false);
		btnLast.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showResult(mappingResults.size()-1);
			}
		});
		btnLast.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnLast.setText(">>");
		
		Composite compositeScoreOverview = new Composite(this, SWT.NONE);
		compositeScoreOverview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		compositeScoreOverview.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_compositeScoreOverview = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_compositeScoreOverview.widthHint = 406;
		compositeScoreOverview.setLayoutData(gd_compositeScoreOverview);
		
		Label lblIAmDiagram = new Label(compositeScoreOverview, SWT.CENTER);
		lblIAmDiagram.setText("I am diagram");

	}

	
	public void setResultsList(List<Result> list) {
		clearResults();
		mappingResults = list;
		if ((mappingResults != null) && (mappingResults.size() > 0)) {
			btnGotoResult.setEnabled(true);
			showResult(0);
		}
			
	}

	private void clearResults() {
		curResultIndex = -1;			
		lblResultNum.setText("");
		
		tblviewerResult.setInput(null);
		
		btnFirst.setEnabled(false);
		btnPrev.setEnabled(false);
		btnNext.setEnabled(false);
		btnLast.setEnabled(false);
		btnGotoResult.setEnabled(false);
	}
	
	private void showResult(int index) {
		
		if (index < 0) index = 0;
		if (index > mappingResults.size() - 1) index = mappingResults.size() - 1;
		
		curResultIndex = index;
		curResult = mappingResults.get(curResultIndex);
		lblResultNum.setText(String.format("%d of %d", curResultIndex+1, mappingResults.size()));
		tblviewerResult.setInput(curResult.getDetailedMappingResults());
		
		/* We have just one result */
		if (mappingResults.size() == 1) {
			btnFirst.setEnabled(false);
			btnPrev.setEnabled(false);
			btnNext.setEnabled(false);
			btnLast.setEnabled(false);
		} 
		/* We are at the beginning with more than 1 result in total */
		else if (curResultIndex == 0) {
			btnFirst.setEnabled(false);
			btnPrev.setEnabled(false);
			btnNext.setEnabled(true);
			btnLast.setEnabled(true);			
		} 
		/* We are at the end with more than 1 result in total */
		else if (curResultIndex == mappingResults.size()-1) {
			btnFirst.setEnabled(true);
			btnPrev.setEnabled(true);
			btnNext.setEnabled(false);
			btnLast.setEnabled(false);
		} 
		/* All other cases */
		else {
			btnFirst.setEnabled(true);
			btnPrev.setEnabled(true);
			btnNext.setEnabled(true);
			btnLast.setEnabled(true);
		}
	}
}

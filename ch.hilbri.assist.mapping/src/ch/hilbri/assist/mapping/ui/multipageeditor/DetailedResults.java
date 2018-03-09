package ch.hilbri.assist.mapping.ui.multipageeditor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.draw2d.SWTEventDispatcher;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;
import org.swtchart.Chart;
import org.swtchart.IAxis;
import org.swtchart.ILineSeries;
import org.swtchart.ISeries.SeriesType;
import org.swtchart.LineStyle;
import org.swtchart.Range;

import ch.hilbri.assist.mapping.analysis.metrics.builtin.MaxFreeCapacity;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.MinOrganizationsPerBoard;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.RandomScore;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.UniformCoreLoadDistribution;
import ch.hilbri.assist.mapping.ui.infosheet.InfoSheetView;
import ch.hilbri.assist.mapping.ui.metrics.MetricsView;
import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.SingleMappingElement;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;

public class DetailedResults extends Composite {

	private Text textFilter;
	private Table tblResult;
	private List<MappingResult> mappingResults = null;
	private List<AbstractMetric> selectedMetricsList = new ArrayList<AbstractMetric>();
	private List<AbstractMetric> availableMetricsList = new ArrayList<AbstractMetric>();

	private int curResultIndex = -1;
	private MappingResult curResult = null;
	private Object curSelectedComponent = null;

	private Button btnFirst;
	private Button btnPrev;
	private Button btnGotoResult;
	private Button btnNext;
	private Button btnLast;

	private Label lblSolutionName;
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
	private MappingViewerFilter tableFilter;

	private MultiPageEditor multiPageEditor;
	private Group grpScoreDistribution;
	private Chart scoreOverview;
	private TableCursor tableCursorResult;
	private Button btnSortScore;
	private Button btnSortName;
	private Composite compositeArchitecture;
	private GraphViewer architectureGraph;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public DetailedResults(MultiPageEditor e, Composite parent, int style) {
		super(parent, style);
		multiPageEditor = e;
		setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		setLayout(new GridLayout(3, false));

		lblSolutionName = new Label(this, SWT.NONE);
		lblSolutionName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		lblSolutionName.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblSolutionName.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));

		Label lblFilterHintText = new Label(this, SWT.NONE);
		lblFilterHintText.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblFilterHintText.setText("Filter:");

		textFilter = new Text(this, SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH);
		textFilter.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				tableFilter.setFilterText(textFilter.getText());
				tblviewerResult.refresh();
			}
		});
		textFilter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		compositeArchitecture = new Composite(this, SWT.BORDER);
		compositeArchitecture.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				if ((compositeArchitecture != null) && (architectureGraph != null)) {
					architectureGraph.applyLayout();
					compositeArchitecture.layout();
				}
			}
		});
		compositeArchitecture.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		compositeArchitecture.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_compositeArchitecture = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2);
		gd_compositeArchitecture.widthHint = 99;
		compositeArchitecture.setLayoutData(gd_compositeArchitecture);

		Composite compositeResultData = new Composite(this, SWT.NONE);
		compositeResultData.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		GridLayout gl_compositeResultData = new GridLayout(1, false);
		gl_compositeResultData.marginHeight = 0;
		gl_compositeResultData.marginWidth = 0;
		compositeResultData.setLayout(gl_compositeResultData);
		GridData gd_compositeResultData = new GridData(SWT.FILL, SWT.FILL, false, true, 2, 1);
		gd_compositeResultData.heightHint = 250;
		compositeResultData.setLayoutData(gd_compositeResultData);

		tableFilter = new MappingViewerFilter();
		tblviewerResult = new TableViewer(compositeResultData, SWT.BORDER | SWT.HIDE_SELECTION);
		tblviewerResult.setFilters(tableFilter);

		tblResult = tblviewerResult.getTable();
		GridData gd_tblResult = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_tblResult.widthHint = 420;
		tblResult.setLayoutData(gd_tblResult);
		tblResult.setHeaderVisible(true);
		tblResult.setLinesVisible(true);
		tblResult.addListener(SWT.EraseItem, new Listener() {
			@Override
			public void handleEvent(Event event) {
				event.detail &= ~SWT.HOT;
			}
		});

		tableViewerColumn = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getApplication().getName();
			}
		});
		tblclmnApplication = tableViewerColumn.getColumn();
		tblclmnApplication.setWidth(75);
		tblclmnApplication.setText("Application");

		tableViewerColumn_1 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getTask().getName();
			}
		});
		tblclmnTask = tableViewerColumn_1.getColumn();
		tblclmnTask.setWidth(75);
		tblclmnTask.setText("Task");

		tableViewerColumn_3 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getCore().getName();
			}
		});
		tblclmnCore = tableViewerColumn_3.getColumn();
		tblclmnCore.setWidth(75);
		tblclmnCore.setText("Core");

		tableViewerColumn_2 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getProcessor().getName();
			}
		});
		tblclmnProcessor = tableViewerColumn_2.getColumn();
		tblclmnProcessor.setWidth(75);
		tblclmnProcessor.setText("Processor");

		tableViewerColumn_4 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getBoard().getName();
			}
		});
		tblclmnBoard = tableViewerColumn_4.getColumn();
		tblclmnBoard.setWidth(75);
		tblclmnBoard.setText("Board");

		tableViewerColumn_5 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getBox().getName();
			}
		});
		tblclmnBox = tableViewerColumn_5.getColumn();
		tblclmnBox.setWidth(75);
		tblclmnBox.setText("Box");

		tableViewerColumn_6 = new TableViewerColumn(tblviewerResult, SWT.NONE);
		tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
			public String getText(Object element) {
				return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
						: ((SingleMappingElement) element).getCompartment().getName();
			}
		});
		tblclmnCompartment = tableViewerColumn_6.getColumn();
		tblclmnCompartment.setWidth(75);
		tblclmnCompartment.setText("Compartment");

		tableCursorResult = new TableCursor(tblResult, SWT.NONE);
		tableCursorResult.setForeground(SWTResourceManager.getColor(0, 0, 0));
		tableCursorResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		tableCursorResult.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				TableItem item = tableCursorResult.getRow();
				if (item.getData() instanceof SingleMappingElement) {
					SingleMappingElement elem = (SingleMappingElement) item.getData();
					int column = tableCursorResult.getColumn();
					Object comp;
					switch (column) {
					case 0:
						comp = elem.getApplication();
						break;
					case 1:
						comp = elem.getTask();
						break;
					case 2:
						comp = elem.getCore();
						break;
					case 3:
						comp = elem.getProcessor();
						break;
					case 4:
						comp = elem.getBoard();
						break;
					case 5:
						comp = elem.getBox();
						break;
					case 6:
						comp = elem.getCompartment();
						break;
					default:
						comp = null;
					}
					curSelectedComponent = comp;
					InfoSheetView.INSTANCE.setSelectedComponent(multiPageEditor, curSelectedComponent);
				}
			}
		});
		tblviewerResult.setContentProvider(ArrayContentProvider.getInstance());

		Composite compositeNavButtons = new Composite(this, SWT.NONE);
		compositeNavButtons.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		RowLayout rl_compositeNavButtons = new RowLayout(SWT.HORIZONTAL);
		rl_compositeNavButtons.justify = true;
		rl_compositeNavButtons.wrap = false;
		compositeNavButtons.setLayout(rl_compositeNavButtons);
		compositeNavButtons.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

		btnFirst = new Button(compositeNavButtons, SWT.NONE);
		btnFirst.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/first_result.png"));
		btnFirst.setEnabled(false);
		btnFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showResult(0);
			}
		});
		btnFirst.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnFirst.setText("First");

		btnPrev = new Button(compositeNavButtons, SWT.NONE);
		btnPrev.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/result_prev.gif"));
		btnPrev.setEnabled(false);
		btnPrev.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (curResultIndex > 0)
					showResult(curResultIndex - 1);
			}
		});
		btnPrev.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnPrev.setText("Previous");

		btnGotoResult = new Button(compositeNavButtons, SWT.NONE);
		btnGotoResult.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/goto_input.png"));
		btnGotoResult.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GotoSolutionDialog dlg = new GotoSolutionDialog(e.widget.getDisplay().getActiveShell(),
						curResultIndex + 1);
				if (dlg.open() == Window.OK)
					showResult(dlg.getGotoSolutionIdx());

			}
		});
		btnGotoResult.setEnabled(false);
		btnGotoResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnGotoResult.setText("Got to...");

		btnNext = new Button(compositeNavButtons, SWT.NONE);
		btnNext.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/result_next.gif"));
		btnNext.setEnabled(false);
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if ((curResultIndex + 1) < mappingResults.size())
					showResult(curResultIndex + 1);
			}
		});
		btnNext.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNext.setText("Next");

		btnLast = new Button(compositeNavButtons, SWT.NONE);
		btnLast.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/last_result.png"));
		btnLast.setEnabled(false);
		btnLast.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showResult(mappingResults.size() - 1);
			}
		});
		btnLast.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnLast.setText("Last");

		btnSortScore = new Button(compositeNavButtons, SWT.NONE);
		btnSortScore.setEnabled(false);
		btnSortScore
				.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/results_sort_score.png"));
		btnSortScore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// We want decending sort order
				mappingResults.sort((r1, r2) -> Double.compare(r2.getScaledTotalScore(), r1.getScaledTotalScore()));
				setResultsList(mappingResults);
			}
		});
		btnSortScore.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnSortScore.setText("Sort by score");

		btnSortName = new Button(compositeNavButtons, SWT.NONE);
		btnSortName.setEnabled(false);
		btnSortName.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/results_sort_id.png"));
		btnSortName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				mappingResults.sort((r1, r2) -> Integer.compare(r1.getIndex(), r2.getIndex()));
				setResultsList(mappingResults);
			}
		});
		btnSortName.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnSortName.setText("Sort by index");

		Composite compositeScoreOverview = new Composite(this, SWT.NONE);
		compositeScoreOverview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		compositeScoreOverview.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_compositeScoreOverview = new GridData(SWT.FILL, SWT.BOTTOM, true, false, 3, 1);
		gd_compositeScoreOverview.heightHint = 180;
		gd_compositeScoreOverview.minimumHeight = 180;
		gd_compositeScoreOverview.widthHint = 406;
		compositeScoreOverview.setLayoutData(gd_compositeScoreOverview);

		grpScoreDistribution = new Group(compositeScoreOverview, SWT.NONE);
		grpScoreDistribution.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		FillLayout fl_grpScoreDistribution = new FillLayout(SWT.HORIZONTAL);
		fl_grpScoreDistribution.marginWidth = 5;
		fl_grpScoreDistribution.marginHeight = 5;
		grpScoreDistribution.setLayout(fl_grpScoreDistribution);

		scoreOverview = new Chart(grpScoreDistribution, SWT.NONE);
		scoreOverview.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		scoreOverview.getTitle().setVisible(false);

		IAxis xaxes = scoreOverview.getAxisSet().getXAxes()[0];

		IAxis yaxes = scoreOverview.getAxisSet().getYAxes()[0];

		scoreOverview.getAxisSet().adjustRange();
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		xaxes.getTick().setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		xaxes.getTick().setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		xaxes.getTitle().setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		xaxes.getTitle().setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		xaxes.getTitle().setText("Solutions");
		xaxes.getGrid().setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		xaxes.getGrid().setStyle(LineStyle.NONE);
		xaxes.setRange(new Range(0, 10));
		xaxes.getTick().setFormat(new DecimalFormat("#"));
		yaxes.getTick().setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		yaxes.getTick().setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		yaxes.getTitle().setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		yaxes.getTitle().setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		yaxes.getTitle().setText("Total score (scaled)");
		yaxes.getGrid().setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		yaxes.getGrid().setStyle(LineStyle.DOT);
		yaxes.getTick().setTickMarkStepHint(30);

		/* Preload the available metrics list */
		availableMetricsList.add(new MaxFreeCapacity());
		availableMetricsList.add(new UniformCoreLoadDistribution());
		availableMetricsList.add(new MinOrganizationsPerBoard());
		availableMetricsList.add(new RandomScore());

		/* Clear the page for the initial state */
		clearResults();
	}

	public void setResultsList(List<MappingResult> list) {
		clearResults();

		mappingResults = list;
		if ((mappingResults != null) && (mappingResults.size() > 0)) {

			/* Update the score chart */
			double[] xValues = new double[mappingResults.size()];
			for (int i = 1; i <= mappingResults.size(); i++)
				xValues[i - 1] = i;
			List<Double> yValueList = mappingResults.stream().map(r -> r.getScaledTotalScore())
					.collect(Collectors.toList());
			double[] yValues = yValueList.stream().mapToDouble(Double::doubleValue).toArray();

			ILineSeries lineSeries = (ILineSeries) scoreOverview.getSeriesSet().createSeries(SeriesType.LINE, "scores");
			lineSeries.setYSeries(yValues);
			lineSeries.setXSeries(xValues);
			lineSeries.setSymbolSize(3);
			lineSeries.setSymbolColor(SWTResourceManager.getColor(SWT.COLOR_GRAY));
			lineSeries.setLineColor(SWTResourceManager.getColor(227, 234, 243));
			lineSeries.setLineWidth(4);

			scoreOverview.getLegend().setVisible(false);
			scoreOverview.getAxisSet().adjustRange();

			// Let the y range start from 0
			Range oldRange = scoreOverview.getAxisSet().getYAxes()[0].getRange();
			scoreOverview.getAxisSet().getYAxes()[0].setRange(new Range(0, oldRange.upper));

			btnGotoResult.setEnabled(true);
			btnSortName.setEnabled(true);
			btnSortScore.setEnabled(true);

			showResult(0);
		}

		/*
		 * Let the metrics view know, that we might have new results - so it may have to
		 * enable a button
		 */
		if (MetricsView.INSTANCE != null)
			MetricsView.INSTANCE.refreshEntries(multiPageEditor);
	}

	private void clearResults() {
		curResultIndex = -1;
		lblSolutionName.setText("-- No Solution --");

		tblviewerResult.setInput(null);

		InfoSheetView.INSTANCE.setSelectedResult(multiPageEditor, null);

		btnFirst.setEnabled(false);
		btnPrev.setEnabled(false);
		btnNext.setEnabled(false);
		btnLast.setEnabled(false);
		btnGotoResult.setEnabled(false);
		btnSortName.setEnabled(false);
		btnSortScore.setEnabled(false);
	}

	private void showResult(int index) {

		if (index < 0)
			index = 0;
		if (index > mappingResults.size() - 1)
			index = mappingResults.size() - 1;

		curResultIndex = index;
		curResult = mappingResults.get(curResultIndex);

		/* Send the result to the InfoView */
		InfoSheetView.INSTANCE.setSelectedResult(multiPageEditor, curResult);

		/* Update our own text fields */
		lblSolutionName.setText(curResult.getName());
		tblviewerResult.setInput(curResult.getMappingElements());

		/* Update the graph (topology view) */
		if (architectureGraph != null)
			architectureGraph.getControl().dispose();
		architectureGraph = new GraphViewer(compositeArchitecture, SWT.NONE);
		/* Prevents nodes from being moved with the mouse */
		architectureGraph.getGraphControl().getLightweightSystem().setEventDispatcher(new SWTEventDispatcher() {
			public void dispatchMouseMoved(org.eclipse.swt.events.MouseEvent me) {	/* do nothing */  }
		});
		architectureGraph.setContentProvider(new MappingResultTreeContentProvider());
		architectureGraph.setLabelProvider(new MappingResultTreeLabelProvider());
		architectureGraph.setInput((new MappingResultTreeNode(curResult)).getAllNodesIncludingRoot());
		architectureGraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		architectureGraph.applyLayout();
		compositeArchitecture.layout();

		/* Update the chart */
		/* - delete the old selection */
		if (scoreOverview.getSeriesSet().getSeries("selection") != null)
			scoreOverview.getSeriesSet().deleteSeries("selection");
		/* - create a new selection */
		double[] xValues = { curResultIndex + 1 };
		double[] yValues = { curResult.getScaledTotalScore() };
		ILineSeries lineSeries = (ILineSeries) scoreOverview.getSeriesSet().createSeries(SeriesType.LINE, "selection");
		lineSeries.setYSeries(yValues);
		lineSeries.setXSeries(xValues);
		lineSeries.setSymbolSize(4);
		lineSeries.setSymbolColor(SWTResourceManager.getColor(SWT.COLOR_RED));
		scoreOverview.redraw();

		/* Update the navigation buttons */
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
		else if (curResultIndex == mappingResults.size() - 1) {
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

	public MappingResult getCurrentResult() {
		return curResult;
	}

	public Object getSelectedComponent() {
		return curSelectedComponent;
	}

	public List<MappingResult> getMappingResults() {
		return mappingResults;
	}

	public int getMappingResultsCount() {
		if (mappingResults == null)
			return -1;
		else
			return mappingResults.size();
	}

	public List<AbstractMetric> getSelectedMetricsList() {
		return selectedMetricsList;
	}

	public List<AbstractMetric> getAvailableMetricsList() {
		return availableMetricsList;
	}
}

package ch.hilbri.assist.mapping.ui.multipageeditor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.draw2d.SWTEventDispatcher;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
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

import ch.hilbri.assist.mapping.ui.metrics.MetricTableContentProvider;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.GotoFirstSolution;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.GotoLastSolution;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.GotoNextSolution;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.GotoPreviousSolution;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.GotoSpecificSolution;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.SortSolutionsByName;
import ch.hilbri.assist.mapping.ui.multipageeditor.actions.SortSolutionsByScore;
import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.SingleMappingElement;

public class DetailedResultsPage extends Composite {
    /* Major data elements */
    private int curResultIndex = -1;
    private MappingResult curResult = null;
    private List<MappingResult> mappingResults;
    
    /* Declaring all relevant UI elements */
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Chart scoreOverview;
    private GraphViewer architectureGraph;
    private TableViewer tblviewerResult;
    private MappingViewerFilter tableFilter = new MappingViewerFilter();
    private Composite compositeArchitecture;

    /* Declaring all actions */
    private GotoFirstSolution gotoFirstSolutionAction = new GotoFirstSolution(this);
    private GotoLastSolution gotoLastSolutionAction = new GotoLastSolution(this);
    private GotoNextSolution gotoNextSolutionAction = new GotoNextSolution(this);
    private GotoPreviousSolution gotoPreviousSolutionAction = new GotoPreviousSolution(this);
    private GotoSpecificSolution gotoSpecificSolutionAction = new GotoSpecificSolution(this);
    private SortSolutionsByName sortSolutionsByNameAction = new SortSolutionsByName(this);
    private SortSolutionsByScore sortSolutionsByScore = new SortSolutionsByScore(this);

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public DetailedResultsPage(Composite parent, int style) {
        super(parent, style);
        setLayout(new FillLayout(SWT.HORIZONTAL));

        ScrolledForm mainForm = formToolkit.createScrolledForm(this);
        formToolkit.decorateFormHeading(mainForm.getForm());
        FontDescriptor fontDescriptor = FontDescriptor.createFrom(mainForm.getFont());
        fontDescriptor.setStyle(SWT.BOLD).increaseHeight(1);
        mainForm.setFont(fontDescriptor.createFont(mainForm.getDisplay()));
        mainForm.setText("Mapping Results");

        IToolBarManager toolbarManager = mainForm.getToolBarManager();
        fillToolBar(toolbarManager);

        mainForm.getBody().setLayout(new GridLayout(1, false));

        // Create the section "All Solutions"
        createSectionAllSolutions(mainForm.getBody());

        // Create the section "Current Solution"
        createSectionCurrentSolution(mainForm.getBody());

        // Create the section "Evaluation"
        createSectionEvaluation(mainForm.getBody());
    }

    /**
     * Sets a new list of results to display in this view
     * 
     * @param list
     */

    public void setResultsList(List<MappingResult> list) {
        /* Clear the old data */
        clearResults();
        assert (mappingResults == null);

        /* Store the new data */
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

            // Update the status of the actions
            gotoSpecificSolutionAction.setEnabled(true);
            sortSolutionsByNameAction.setEnabled(true);
            sortSolutionsByScore.setEnabled(true);

            // Go to the first result
            showResult(0);
        }

    }

    /**
     * Shows a specific result out of the mapping results in the current view
     * 
     * @param index
     */
    public void showResult(int index) {

        // Check if the parameter is within the expected bounds
        if (index < 0)
            index = 0;
        if (index > mappingResults.size() - 1)
            index = mappingResults.size() - 1;

        curResultIndex = index;
        curResult = mappingResults.get(curResultIndex);

        /* Update our own text fields */
        // FIXME: lblSolutionName.setText(curResult.getName());
        tblviewerResult.setInput(curResult.getMappingElements());

        /* Update the graph (topology view) */
        if (architectureGraph != null)
            architectureGraph.getControl().dispose();
        architectureGraph = new GraphViewer(compositeArchitecture, SWT.NONE);

        /* Prevents nodes from being moved with the mouse */
        architectureGraph.getGraphControl().getLightweightSystem().setEventDispatcher(new SWTEventDispatcher() {
            public void dispatchMouseMoved(org.eclipse.swt.events.MouseEvent me) {
            }
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
            gotoFirstSolutionAction.setEnabled(false);
            gotoPreviousSolutionAction.setEnabled(false);
            gotoNextSolutionAction.setEnabled(false);
            gotoLastSolutionAction.setEnabled(false);
        }
        /* We are at the beginning with more than 1 result in total */
        else if (curResultIndex == 0) {
            gotoFirstSolutionAction.setEnabled(false);
            gotoPreviousSolutionAction.setEnabled(false);
            gotoNextSolutionAction.setEnabled(true);
            gotoLastSolutionAction.setEnabled(true);
        }
        /* We are at the end with more than 1 result in total */
        else if (curResultIndex == mappingResults.size() - 1) {
            gotoFirstSolutionAction.setEnabled(true);
            gotoPreviousSolutionAction.setEnabled(true);
            gotoNextSolutionAction.setEnabled(false);
            gotoLastSolutionAction.setEnabled(false);
        }
        /* All other cases */
        else {
            gotoFirstSolutionAction.setEnabled(true);
            gotoPreviousSolutionAction.setEnabled(true);
            gotoNextSolutionAction.setEnabled(true);
            gotoLastSolutionAction.setEnabled(true);
        }
    }

    /**
     * Clears the results
     * 
     */
    private void clearResults() {
        curResultIndex = -1;
        // FIXME: lblSolutionName.setText("-- No Solution --");

        tblviewerResult.setInput(null);

        // Disable all actions
        gotoFirstSolutionAction.setEnabled(false);
        gotoPreviousSolutionAction.setEnabled(false);
        gotoNextSolutionAction.setEnabled(false);
        gotoLastSolutionAction.setEnabled(false);
        gotoSpecificSolutionAction.setEnabled(false);
        sortSolutionsByNameAction.setEnabled(false);
        sortSolutionsByScore.setEnabled(false);

        // Delete the list of current results
        mappingResults = null;
    }

    /**
     * Creates the section "All Solutions"
     * 
     * @param parent
     */
    private void createSectionAllSolutions(Composite parent) {
        Section sctnAllSolutions = formToolkit.createSection(parent, Section.EXPANDED | Section.TITLE_BAR);
        GridData gd_sctnAllSolutions = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_sctnAllSolutions.minimumWidth = 770;
        sctnAllSolutions.setLayoutData(gd_sctnAllSolutions);
        formToolkit.paintBordersFor(sctnAllSolutions);
        sctnAllSolutions.setText("All Solutions");
        Composite compAllSolutions = formToolkit.createComposite(sctnAllSolutions, SWT.NONE);
        formToolkit.paintBordersFor(compAllSolutions);
        sctnAllSolutions.setClient(compAllSolutions);
        GridLayout gl_compAllSolutions = new GridLayout(1, false);
        gl_compAllSolutions.marginTop = 5;
        gl_compAllSolutions.marginHeight = 0;
        gl_compAllSolutions.horizontalSpacing = 0;
        gl_compAllSolutions.verticalSpacing = 0;
        gl_compAllSolutions.marginWidth = 0;
        compAllSolutions.setLayout(gl_compAllSolutions);

        createScoreChart(compAllSolutions);
    }

    /**
     * Creates the section "Current Solution"
     * 
     */
    private void createSectionCurrentSolution(Composite parent) {
        Section sctnCurrentSolution = formToolkit.createSection(parent, Section.TITLE_BAR);
        sctnCurrentSolution.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(sctnCurrentSolution);
        sctnCurrentSolution.setText("Current Solution");
        Composite compCurrentSolution = formToolkit.createComposite(sctnCurrentSolution, SWT.NONE);
        formToolkit.paintBordersFor(compCurrentSolution);
        sctnCurrentSolution.setClient(compCurrentSolution);
        GridLayout gl_compCurrentSolution = new GridLayout(1, false);
        gl_compCurrentSolution.marginTop = 5;
        gl_compCurrentSolution.horizontalSpacing = 0;
        gl_compCurrentSolution.marginHeight = 0;
        gl_compCurrentSolution.verticalSpacing = 0;
        gl_compCurrentSolution.marginWidth = 0;
        compCurrentSolution.setLayout(gl_compCurrentSolution);

        CTabFolder tabViews = new CTabFolder(compCurrentSolution, SWT.BORDER | SWT.FLAT);
        tabViews.setHighlightEnabled(false);
        tabViews.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        GridData gd_tabViews = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_tabViews.heightHint = 100;
        tabViews.setLayoutData(gd_tabViews);
        tabViews.setSelectionBackground(
                Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));

        // Tab "Tabular View"
        CTabItem tbtmTabularView = new CTabItem(tabViews, SWT.NONE);
        tbtmTabularView.setText("Tabular View");

        Composite compositeTabularView = new Composite(tabViews, SWT.NONE);
        compositeTabularView.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        tbtmTabularView.setControl(compositeTabularView);
        GridLayout gl_compositeTabularView = new GridLayout(2, false);
        gl_compositeTabularView.verticalSpacing = 10;
        compositeTabularView.setLayout(gl_compositeTabularView);

        Label lblFilterHintText = new Label(compositeTabularView, SWT.NONE);
        lblFilterHintText.setSize(37, 16);
        lblFilterHintText.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        lblFilterHintText.setText("Filter:");

        Text textFilter = new Text(compositeTabularView, SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH);
        textFilter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Composite compositeResultData = new Composite(compositeTabularView, SWT.NONE);
        compositeResultData.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        compositeResultData.setSize(437, 34);
        compositeResultData.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        GridLayout gl_compositeResultData = new GridLayout(1, false);
        gl_compositeResultData.marginHeight = 0;
        gl_compositeResultData.marginWidth = 0;
        compositeResultData.setLayout(gl_compositeResultData);

        tblviewerResult = new TableViewer(compositeResultData, SWT.BORDER | SWT.HIDE_SELECTION);
        tblviewerResult.setFilters(tableFilter);

        Table tblResult = tblviewerResult.getTable();
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

        TableViewerColumn tableViewerColumn = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getApplication().getName();
            }
        });
        TableColumn tblclmnApplication = tableViewerColumn.getColumn();
        tblclmnApplication.setWidth(100);
        tblclmnApplication.setText("Application");

        TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getTask().getName();
            }
        });
        TableColumn tblclmnTask = tableViewerColumn_1.getColumn();
        tblclmnTask.setWidth(100);
        tblclmnTask.setText("Task");

        TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getCore().getName();
            }
        });
        TableColumn tblclmnCore = tableViewerColumn_3.getColumn();
        tblclmnCore.setWidth(100);
        tblclmnCore.setText("Core");

        TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getProcessor().getName();
            }
        });
        TableColumn tblclmnProcessor = tableViewerColumn_2.getColumn();
        tblclmnProcessor.setWidth(100);
        tblclmnProcessor.setText("Processor");

        TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getBoard().getName();
            }
        });
        TableColumn tblclmnBoard = tableViewerColumn_4.getColumn();
        tblclmnBoard.setWidth(100);
        tblclmnBoard.setText("Board");

        TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_5.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getBox().getName();
            }
        });
        TableColumn tblclmnBox = tableViewerColumn_5.getColumn();
        tblclmnBox.setWidth(75);
        tblclmnBox.setText("Box");

        TableViewerColumn tableViewerColumn_6 = new TableViewerColumn(tblviewerResult, SWT.NONE);
        tableViewerColumn_6.setLabelProvider(new ColumnLabelProvider() {
            public String getText(Object element) {
                return ((element == null) || !(element instanceof SingleMappingElement)) ? ""
                        : ((SingleMappingElement) element).getCompartment().getName();
            }
        });
        TableColumn tblclmnCompartment = tableViewerColumn_6.getColumn();
        tblclmnCompartment.setWidth(100);
        tblclmnCompartment.setText("Compartment");

        tblviewerResult.setContentProvider(ArrayContentProvider.getInstance());
        textFilter.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                tableFilter.setFilterText(textFilter.getText());
                tblviewerResult.refresh();
            }
        });

        // Tab "Topology View"
        CTabItem tbtmTopologyview = new CTabItem(tabViews, SWT.NONE);
        tbtmTopologyview.setText("Topology View");

        Composite compositeTopologyView = new Composite(tabViews, SWT.NONE);
        compositeTopologyView.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        tbtmTopologyview.setControl(compositeTopologyView);
        compositeTopologyView.setLayout(new GridLayout(1, false));

        compositeArchitecture = new Composite(compositeTopologyView, SWT.NONE);
        compositeArchitecture.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        compositeArchitecture.setSize(4, 165);
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

        // Tab "Scores"
        CTabItem tbtmScoreview = new CTabItem(tabViews, SWT.NONE);
        tbtmScoreview.setText("Score Details");
        Composite compositeScoreview = new Composite(tabViews, SWT.NONE);
        compositeScoreview.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        tbtmScoreview.setControl(compositeScoreview);
        FillLayout fl_compositeScoreview = new FillLayout(SWT.HORIZONTAL);
        compositeScoreview.setLayout(fl_compositeScoreview);

        TableViewer tblViewerResultMetrics = new TableViewer(compositeScoreview,
                SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
        tblViewerResultMetrics.setContentProvider(ArrayContentProvider.getInstance());
        // tblViewerResultMetrics.setLabelProvider(new
        // MetricScoresTableLabelProvider());

        Table tblResultMetrics = tblViewerResultMetrics.getTable();
        tblResultMetrics.setLinesVisible(true);
        tblResultMetrics.setHeaderVisible(true);
        formToolkit.paintBordersFor(tblResultMetrics);

        TableViewerColumn scoresColumn1 = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
        TableColumn tblclmnMetricName = scoresColumn1.getColumn();
        tblclmnMetricName.setWidth(125);
        tblclmnMetricName.setText("Name");

        TableViewerColumn scoresColumn2 = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
        TableColumn tblclmnScorescaled = scoresColumn2.getColumn();
        tblclmnScorescaled.setWidth(80);
        tblclmnScorescaled.setText("Score");

        TableViewerColumn scoresColumn3 = new TableViewerColumn(tblViewerResultMetrics, SWT.NONE);
        TableColumn tblclmnScore = scoresColumn3.getColumn();
        tblclmnScore.setWidth(80);
        tblclmnScore.setText("Score (abs.)");

        // Set the tab that should be display first
        tabViews.setSelection(tbtmTabularView);
    }

    private void createSectionEvaluation(Composite parent) {
        Section sctnEvaluation = formToolkit.createSection(parent, Section.TWISTIE | Section.TITLE_BAR);
        sctnEvaluation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        formToolkit.paintBordersFor(sctnEvaluation);
        sctnEvaluation.setText("Evaluation");
        Composite compEvaluation = formToolkit.createComposite(sctnEvaluation, SWT.NONE);
        formToolkit.paintBordersFor(compEvaluation);
        sctnEvaluation.setClient(compEvaluation);
        GridData gd_mainComposite = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        gd_mainComposite.heightHint = 125;
        compEvaluation.setLayoutData(gd_mainComposite);
        GridLayout gl_mainComposite = new GridLayout(8, false);
        gl_mainComposite.horizontalSpacing = 10;
        compEvaluation.setLayout(gl_mainComposite);

        Label lblSelectMetricType = new Label(compEvaluation, SWT.NONE);
        lblSelectMetricType.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        lblSelectMetricType.setText("Metric:");

        Combo cbxAvailableMetrics = new Combo(compEvaluation, SWT.READ_ONLY);
        GridData gd_cbxAvailableMetrics = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_cbxAvailableMetrics.widthHint = 241;
        cbxAvailableMetrics.setLayoutData(gd_cbxAvailableMetrics);
        cbxAvailableMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));

        Label lblWeight = new Label(compEvaluation, SWT.NONE);
        lblWeight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        lblWeight.setText("Weight:");

        Combo cbxWeight = new Combo(compEvaluation, SWT.READ_ONLY);
        cbxWeight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        cbxWeight.setItems(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" });
        cbxWeight.setVisibleItemCount(5);
        Button btnAddMetric = new Button(compEvaluation, SWT.NONE);
        btnAddMetric.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
        btnAddMetric.setText("Add");
        btnAddMetric.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/add.gif"));
        btnAddMetric.addSelectionListener(new SelectionListener() {

            public void widgetDefaultSelected(SelectionEvent event) {
                widgetSelected(event);
            }

            public void widgetSelected(SelectionEvent event) {

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
                // List<AbstractMetric> availMetrics = currentEditor.getAvailableMetricsList();
                // Class<? extends AbstractMetric> metricClass =
                // availMetrics.get(selectedMetricIndex).getClass();
                // Constructor<?> metricClassConstructor = metricClass.getConstructors()[0];

                try {
                    // Create a new instance
                    // AbstractMetric newMetricObject = (AbstractMetric)
                    // metricClassConstructor.newInstance();
                    // newMetricObject.setWeight(selectedWeight);

                    // Add new entry to data
                    // currentEditor.getSelectedMetricsList().add(newMetricObject);

                    // Add input to table
                    // tblSelectedMetricsViewer.setInput(currentEditor.getSelectedMetricsList());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Clear selection
                cbxAvailableMetrics.deselectAll();
                cbxWeight.deselectAll();
            }
        });

        Button btnEvaluateResults = new Button(compEvaluation, SWT.NONE);
        btnEvaluateResults.setEnabled(false);
        btnEvaluateResults.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
        btnEvaluateResults.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.mapping", "icons/evaluate.gif"));
        btnEvaluateResults.setText("Evaluate");
        btnEvaluateResults.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }

            @Override
            public void widgetSelected(SelectionEvent e) {
                // if (currentEditor != null && currentEditor.getMappingResultsCount() > 0) {
                // ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
                // currentEditor.getSite().getShell());
                // try {
                // progressDialog.run(true, false, new EvaluateJob(currentEditor));
                // } catch (InvocationTargetException | InterruptedException e1) {
                // e1.printStackTrace();
                // }
                // }
                //
                // else {
                // MessageDialog dlg = new MessageDialog(null, "No results found", null,
                // "No results were found for analysis. Please generate valid deployments.",
                // MessageDialog.INFORMATION, new String[] { "OK" }, 0);
                // dlg.open();
                // }
            }
        });

        Button btnReloadMetrics = new Button(compEvaluation, SWT.NONE);
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
                // if (currentEditor == null) {
                // MessageDialog dlg = new MessageDialog(null, "Current editor contains no
                // mapping specification",
                // null,
                // "The current editor window does not contain a mapping specification. "
                // + "Please open or select an editor tab with a mapping specification. "
                // + "New custom metrics will be added to the currently active editor only.",
                // MessageDialog.INFORMATION, new String[] { "OK" }, 0);
                // dlg.open();
                // return;
                // }

                // This will hold our new metrics
                List<AbstractMetric> newCustomMetrics = new ArrayList<AbstractMetric>();

                // Determine the location where we have to look for new metrics
                // IFileEditorInput input = (IFileEditorInput) currentEditor.getEditorInput();
                // IProject activeProject = input.getFile().getProject();
                // IPath activeProjectPath = activeProject.getLocation();
                // IPath metricsPath = activeProjectPath.append("Compiled-metrics/");
                //
                // // Triggering a build for this project
                // try {
                // activeProject.build(IncrementalProjectBuilder.FULL_BUILD, null);
                // } catch (CoreException e2) {
                // // ConsoleCommands.writeErrorLineToConsole("Build error");
                // return;
                // }

                // Asking the user which metric is to be imported and preselect
                // all entries
                // ListSelectionDialog dialog = new
                // ListSelectionDialog(currentEditor.getSite().getShell(),
                // metricsPath.append("metrics"), new CompiledMetricsProvider(), new
                // LabelProvider(),
                // "Select the metrics which you want to import:");
                // dialog.setTitle("Metric selection");
                // dialog.setInitialSelections((new
                // CompiledMetricsProvider()).getElements(metricsPath.append("metrics")));
                // if (dialog.open() != Window.OK)
                // return;

                // Clear old custom metrics in the currentModel
                // List<AbstractMetric> removalList = new ArrayList<AbstractMetric>();
                // for (AbstractMetric m : currentEditor.getAvailableMetricsList())
                // if (!m.isBuiltIn())
                // removalList.add(m);
                // currentEditor.getAvailableMetricsList().removeAll(removalList);
                //
                // try {
                //
                // // Create the classloader for our new metrics
                // URL url = new URL("file://" + metricsPath.toPortableString());
                // URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { url },
                // getClass().getClassLoader());
                //
                // for (Object obj : dialog.getResult()) {
                // // Get the class name
                // String className = (String) obj;
                //
                // // Get the new class
                // Class<? extends AbstractMetricImpl> metricClass = Class
                // .forName("metrics." + className, true, classLoader)
                // .asSubclass(AbstractMetricImpl.class);
                // classLoader.close();
                //
                // // Create a new instance of this metric
                // AbstractMetric metric = metricClass.getDeclaredConstructor().newInstance();
                //
                // // Add the newly created metric to the temporary list of
                // // found metrics
                // newCustomMetrics.add(metric);
                // }
                //
                // // Add the new metrics
                // currentEditor.getAvailableMetricsList().addAll(newCustomMetrics);
                //
                // } catch (ClassNotFoundException | IOException | InstantiationException |
                // IllegalAccessException
                // | IllegalArgumentException | InvocationTargetException |
                // NoSuchMethodException
                // | SecurityException e1) {
                // e1.printStackTrace();
                // }

                // Refresh UI with updated data from the UI model
                // refreshEntries(currentEditor);
                // restoreTableFromCurrentModel();
                // fillComboBoxWithAvailableMetrics();
            }
        });

        Label lblOverflow = new Label(compEvaluation, SWT.NONE);
        lblOverflow.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        lblOverflow.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Group grpSelectedMetrics = new Group(compEvaluation, SWT.NONE);
        GridData gd_grpSelectedMetrics = new GridData(SWT.FILL, SWT.FILL, true, true, 8, 1);
        gd_grpSelectedMetrics.heightHint = 75;
        grpSelectedMetrics.setLayoutData(gd_grpSelectedMetrics);
        grpSelectedMetrics.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
        FillLayout fl_grpSelectedMetrics = new FillLayout(SWT.HORIZONTAL);
        fl_grpSelectedMetrics.marginHeight = 5;
        fl_grpSelectedMetrics.marginWidth = 5;
        grpSelectedMetrics.setLayout(fl_grpSelectedMetrics);
        grpSelectedMetrics.setText("Selected Metrics");

        Composite composite = new Composite(grpSelectedMetrics, SWT.NONE);
        TableColumnLayout tcl_composite = new TableColumnLayout();
        composite.setLayout(tcl_composite);

        TableViewer tblSelectedMetricsViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
        Table tblSelectedMetrics = tblSelectedMetricsViewer.getTable();
        tblSelectedMetrics.setHeaderVisible(true);
        tblSelectedMetrics.setLinesVisible(true);

        TableViewerColumn tableViewerMetricsColumn = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
        // tableViewerMetricsColumn.setLabelProvider(new
        // MetricTableEntryLabelProvider(tblSelectedMetrics, this));
        TableColumn tblclmnIndex = tableViewerMetricsColumn.getColumn();
        tcl_composite.setColumnData(tblclmnIndex, new ColumnPixelData(60, true, true));
        tblclmnIndex.setText("Index");

        TableViewerColumn tableViewerMetricsColumn_1 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
        // tableViewerMetricsColumn_1.setLabelProvider(new
        // MetricTableEntryLabelProvider(tblSelectedMetrics, this));
        TableColumn tblclmnMetric = tableViewerMetricsColumn_1.getColumn();
        tcl_composite.setColumnData(tblclmnMetric, new ColumnPixelData(260, true, true));
        tblclmnMetric.setText("Metric");

        TableViewerColumn tableViewerMetricsColumn_2 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
        // tableViewerMetricsColumn_2.setLabelProvider(new
        // MetricTableEntryLabelProvider(tblSelectedMetrics, this));
        TableColumn tblclmnType = tableViewerMetricsColumn_2.getColumn();
        tcl_composite.setColumnData(tblclmnType, new ColumnPixelData(90, true, true));
        tblclmnType.setText("Type");

        TableViewerColumn tableViewerMetricsColumn_3 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
        // tableViewerMetricsColumn_3.setLabelProvider(new
        // MetricTableEntryLabelProvider(tblSelectedMetrics, this));
        TableColumn tblclmnWeight = tableViewerMetricsColumn_3.getColumn();
        tcl_composite.setColumnData(tblclmnWeight, new ColumnPixelData(60, true, true));
        tblclmnWeight.setText("Weight");

        TableViewerColumn tableViewerMetricsColumn_4 = new TableViewerColumn(tblSelectedMetricsViewer, SWT.NONE);
        // tableViewerMetricsColumn_4.setLabelProvider(new
        // MetricTableEntryLabelProvider(tblSelectedMetrics, this));
        TableColumn tblclmnRemove = tableViewerMetricsColumn_4.getColumn();
        tcl_composite.setColumnData(tblclmnRemove, new ColumnPixelData(60, true, true));
        tblclmnRemove.setText("Remove");
        tblSelectedMetricsViewer.setContentProvider(new MetricTableContentProvider());

        // // We could have been created lazyly - so we should try to find out
        // // about the current editor
        // refreshEntries(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor());
    }

    /**
     * Creates the score chart
     * 
     * @param composite
     *            parent composite
     */
    private void createScoreChart(Composite composite) {
        scoreOverview = new Chart(composite, SWT.NONE);
        GridData gd_scoreOverview = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
        gd_scoreOverview.heightHint = 125;
        scoreOverview.setLayoutData(gd_scoreOverview);
        scoreOverview.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
        scoreOverview.getTitle().setVisible(false);

        IAxis xaxes = scoreOverview.getAxisSet().getXAxes()[0];
        IAxis yaxes = scoreOverview.getAxisSet().getYAxes()[0];

        scoreOverview.getAxisSet().adjustRange();
        xaxes.setRange(new Range(0, 10));

        xaxes.getTick().setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
        xaxes.getTitle().setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
        xaxes.getGrid().setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
        xaxes.getGrid().setStyle(LineStyle.NONE);
        xaxes.getTitle().setText("Solutions");
        xaxes.getTick().setFormat(new DecimalFormat("#"));

        yaxes.getTick().setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
        yaxes.getTitle().setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
        yaxes.getGrid().setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
        yaxes.getGrid().setStyle(LineStyle.DOT);
        yaxes.getTitle().setText("Score");
        yaxes.getTick().setTickMarkStepHint(30);

        Display display = composite.getDisplay();
        Font smallFont = FontDescriptor.createFrom(xaxes.getTick().getFont()).setStyle(SWT.BOLD).increaseHeight(-1)
                .createFont(display);
        Font xsmallFont = FontDescriptor.createFrom(xaxes.getTick().getFont()).increaseHeight(-2).createFont(display);

        xaxes.getTitle().setFont(smallFont);
        yaxes.getTitle().setFont(smallFont);
        xaxes.getTick().setFont(xsmallFont);
        yaxes.getTick().setFont(smallFont);
    }

    /**
     * Fill the items into the toolbar
     * 
     * @param toolbarManager
     */
    private void fillToolBar(IToolBarManager toolbarManager) {
        toolbarManager.add(gotoPreviousSolutionAction);
        toolbarManager.add(gotoNextSolutionAction);
        toolbarManager.add(gotoFirstSolutionAction);
        toolbarManager.add(gotoLastSolutionAction);
        toolbarManager.add(gotoSpecificSolutionAction);
        toolbarManager.update(true);
    }

    private void removeEntryFromTable(AbstractMetric entry) {
        // Remove the entry (and the delete button)
        // currentEditor.getSelectedMetricsList().remove(entry);
        // lblProvider.clearButton(entry);

        // Update the viewer with the new data
        // tblSelectedMetricsViewer.setInput(currentEditor.getSelectedMetricsList());

        // Update the UI model
        // saveTableToCurrentModel();
    }

    public int getCurResultIndex() {
        return curResultIndex;
    }

    public MappingResult getCurResult() {
        return curResult;
    }

    public List<MappingResult> getMappingResults() {
        return mappingResults;
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
}

package ch.hilbri.assist.mapping.ui.multipageeditor;

import java.text.DecimalFormat;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.swtchart.Chart;
import org.swtchart.IAxis;
import org.swtchart.LineStyle;
import org.swtchart.Range;

public class DetailedResultsPage extends Composite {
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Chart scoreOverview;
    
    /**
     * Create the composite.
     * @param parent
     * @param style
     */
    public DetailedResultsPage(Composite parent, int style) {
        super(parent, style);
        setLayout(new FillLayout(SWT.HORIZONTAL));
        
        ScrolledForm mainForm = formToolkit.createScrolledForm(this);
        formToolkit.decorateFormHeading(mainForm.getForm());
        FontDescriptor fontDescriptor = FontDescriptor.createFrom(mainForm.getFont()).setStyle(SWT.BOLD).increaseHeight(1);
        mainForm.setFont(fontDescriptor.createFont(mainForm.getDisplay()));
        mainForm.setText("Mapping Results");
        IToolBarManager toolbarManager = mainForm.getToolBarManager();  
        fillToolBar(toolbarManager);
        mainForm.getBody().setLayout(new GridLayout(1, false));

        /* ************** SECTION: All Solutions ******************** */
        Section sctnAllSolutions = formToolkit.createSection(mainForm.getBody(), Section.EXPANDED | Section.TITLE_BAR);
        sctnAllSolutions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
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
        
        /* ************** SECTION: Current Solution ******************** */
        Section sctnCurrentSolution = formToolkit.createSection(mainForm.getBody(), Section.TITLE_BAR);
        sctnCurrentSolution.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(sctnCurrentSolution);
        sctnCurrentSolution.setText("Current Solution");   
        Composite compCurrentSolution = formToolkit.createComposite(sctnCurrentSolution, SWT.NONE);
        compCurrentSolution.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
        formToolkit.paintBordersFor(compCurrentSolution);
        sctnCurrentSolution.setClient(compCurrentSolution);
        
        /* ************** SECTION: Evaluation ******************** */
        Section sctnEvaluation = formToolkit.createSection(mainForm.getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnEvaluation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        formToolkit.paintBordersFor(sctnEvaluation);
        sctnEvaluation.setText("Evaluation");
        Composite compEvaluation = formToolkit.createComposite(sctnEvaluation, SWT.NONE);
        compEvaluation.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
        formToolkit.paintBordersFor(compEvaluation);
        sctnEvaluation.setClient(compEvaluation);
        
    }
    
    /**
     * Creates the score chart
     * 
     * @param composite parent composite
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
        Font smallFont = FontDescriptor.createFrom(xaxes.getTick().getFont()).setStyle(SWT.BOLD).increaseHeight(-1).createFont(display);
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
        toolbarManager.add(new Action("Previous Solution", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_prev.gif")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("Next Solution", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_next.gif")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("First Solution", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/first_result.png")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("Last Solution", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/last_result.png")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("Goto Solution", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/goto_input.png")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.update(true);
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
}

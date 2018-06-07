package ch.hilbri.assist.mapping.ui.multipageeditor;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.ResourceManager;

public class DetailedResultsPage extends Composite {
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

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
        
        mainForm.setText("Results");
        
        IToolBarManager toolbarManager = mainForm.getToolBarManager();  
        fillToolBar(toolbarManager);
        
        mainForm.getBody().setLayout(new GridLayout(1, false));
        
        Section sctnAllSolutions = formToolkit.createSection(mainForm.getBody(), Section.EXPANDED | Section.TITLE_BAR);
        sctnAllSolutions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        formToolkit.paintBordersFor(sctnAllSolutions);
        sctnAllSolutions.setText("All Solutions");
        
        Composite compAllSolutions = formToolkit.createComposite(sctnAllSolutions, SWT.NONE);
        formToolkit.paintBordersFor(compAllSolutions);
        sctnAllSolutions.setClient(compAllSolutions);
        
        Section sctnCurrentSolution = formToolkit.createSection(mainForm.getBody(), Section.TITLE_BAR);
        sctnCurrentSolution.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        formToolkit.paintBordersFor(sctnCurrentSolution);
        sctnCurrentSolution.setText("Current Solution");   
        
        Composite compCurrentSolution = formToolkit.createComposite(sctnCurrentSolution, SWT.NONE);
        formToolkit.paintBordersFor(compCurrentSolution);
        sctnCurrentSolution.setClient(compCurrentSolution);
        
        Section sctnEvaluation = formToolkit.createSection(mainForm.getBody(), Section.EXPANDED | Section.TITLE_BAR);
        sctnEvaluation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        formToolkit.paintBordersFor(sctnEvaluation);
        sctnEvaluation.setText("Evaluation");
        
        Composite compEvaluation = formToolkit.createComposite(sctnEvaluation, SWT.NONE);
        formToolkit.paintBordersFor(compEvaluation);
        sctnEvaluation.setClient(compEvaluation);
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

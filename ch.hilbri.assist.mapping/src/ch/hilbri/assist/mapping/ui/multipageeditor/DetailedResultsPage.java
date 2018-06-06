package ch.hilbri.assist.mapping.ui.multipageeditor;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
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
        
        FontDescriptor fontDescriptor = FontDescriptor.createFrom(mainForm.getFont()).setStyle(SWT.BOLD).increaseHeight(2);
        mainForm.setFont(fontDescriptor.createFont(mainForm.getDisplay()));
        mainForm.setText("Solutions:");
        
        IToolBarManager toolbarManager = mainForm.getToolBarManager();  
        fillToolBar(toolbarManager);
        
        mainForm.getBody().setLayout(new GridLayout(1, false));
    }
    
    
    /**
     * Fill the items into the toolbar
     * 
     * @param toolbarManager
     */
    private void fillToolBar(IToolBarManager toolbarManager) {
        toolbarManager.add(new Action("<", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_prev.gif")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action(">", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_next.gif")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("<<", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/first_result.png")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action(">>", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/last_result.png")) {
            @Override
            public void run() {
            }
        });
        toolbarManager.add(new Action("Goto", ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/goto_input.png")) {
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

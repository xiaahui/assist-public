package ch.hilbri.assist.application;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction exitAction;
	private IWorkbenchAction copyAction;
	private IWorkbenchAction pasteAction;
	private IWorkbenchAction cutAction;
	private IWorkbenchAction deleteAction;
	private IWorkbenchAction saveAction;
	
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	
    	//The following actions do not work in windows like the project explorer, if they are not explicitly created here
    	exitAction = ActionFactory.QUIT.create(window);
    	exitAction.setEnabled(true); //set to true or else it will not be enabled
    	register(exitAction); //registers the Action
    	
    	copyAction = ActionFactory.COPY.create(window);
    	copyAction.setEnabled(true); 
    	register(copyAction);
    	
    	cutAction = ActionFactory.CUT.create(window);
    	cutAction.setEnabled(true);
    	register(cutAction);
    	
    	pasteAction = ActionFactory.PASTE.create(window);
    	pasteAction.setEnabled(true);
    	register(pasteAction);
    	
    	deleteAction = ActionFactory.DELETE.create(window);
    	deleteAction.setEnabled(true);
    	register(deleteAction);
    	
    	saveAction = ActionFactory.SAVE.create(window);
    	saveAction.setEnabled(true);
    	register(saveAction);
    	
    	
//        aboutAction = ActionFactory.ABOUT.create(window);
//        register(aboutAction);
//        
//        newWindowAction = ActionFactory.OPEN_NEW_WINDOW.create(window);
//        register(newWindowAction);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    }
    
    protected void fillCoolBar(ICoolBarManager coolBar) {
        IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
        coolBar.add(new ToolBarContributionItem(toolbar, "main"));   
    }
    
}

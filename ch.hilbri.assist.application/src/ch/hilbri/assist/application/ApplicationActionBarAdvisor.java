package ch.hilbri.assist.application;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

//	MenuManager newMenuMgr;
//	IWorkbenchAction newActionItem;
	
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	
    	//The following actions do not work in windows like the project explorer, if they are not explicitly created here
    	IWorkbenchAction exitAction = ActionFactory.QUIT.create(window);
    	exitAction.setEnabled(true); //set to true or else it will not be enabled
    	register(exitAction); //registers the Action
    	
    	IWorkbenchAction copyAction = ActionFactory.COPY.create(window);
    	copyAction.setEnabled(true); 
    	register(copyAction);
    	
    	IWorkbenchAction cutAction = ActionFactory.CUT.create(window);
    	cutAction.setEnabled(true);
    	register(cutAction);
    	
    	IWorkbenchAction  pasteAction = ActionFactory.PASTE.create(window);
    	pasteAction.setEnabled(true);
    	register(pasteAction);
    	
    	IWorkbenchAction deleteAction = ActionFactory.DELETE.create(window);
    	deleteAction.setEnabled(true);
    	register(deleteAction);
    	
//    	newMenuMgr = new MenuManager("&New!", "new");
//        newActionItem = ActionFactory.NEW.create(window);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
//		MenuManager fileMenu = new MenuManager("&Test", "test");
//		menuBar.add(fileMenu);
//		newMenuMgr.add(newActionItem);
//		fileMenu.add(newMenuMgr);
    }
    
}

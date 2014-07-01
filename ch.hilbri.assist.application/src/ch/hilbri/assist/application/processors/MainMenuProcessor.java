package ch.hilbri.assist.application.processors;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuFactory;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * This Processor ensures that the main menu is shown even after reloading the workbench !!!This is a workaround for an eclipse bug: https://bugs.eclipse.org/bugs/show_bug.cgi?id=388808 !!!
 *
 */
public class MainMenuProcessor{
	 
 
	@Execute
	public void run(MApplication app) {
		try {
			MMenu menu = app.getChildren().get(0).getMainMenu();
			if (menu == null) {
				//Main Menu
				menu = MMenuFactory.INSTANCE.createMenu();
				menu.setElementId(PathProvider.APP_MAIN_MENU);	
				
				//Submenu 'File'
				MMenu fileMenu = MMenuFactory.INSTANCE.createMenu();
				fileMenu.setElementId("file");
				fileMenu.setLabel("&File");
				
//				//Seperator Additions
//				MMenuSeparator additions = MMenuFactory.INSTANCE.createMenuSeparator();
//				additions.setElementId("additions");
//				fileMenu.getChildren().add(additions)
//;				
//				//Quit Menu Item
//				MHandledMenuItem item = MMenuFactory.INSTANCE.createHandledMenuItem();
//				List<MCommand> commands = app.getCommands();
//				MCommand command = null;
//				for(MCommand tmp: commands) {
//					if (tmp.getElementId().equals("de.fraunhofer.fokus.precisionpro.application.command.exit")) {
//						command = tmp;
//						break;
//					}
//				}
//				if (command != null) {
//					item.setEnabled(true);
//					item.setToBeRendered(true);
//					item.setVisible(true);
//					item.setCommand(command);
//					item.setLabel("&Exit");
//					item.setElementId("de.fraunhofer.fokus.precisionpro.application.handledmenuitem.quit");
//					fileMenu.getChildren().add(item);
//				}
				
				menu.getChildren().add(fileMenu);
				
				
				//Submenu 'Edit'
//				MMenu editMenu = MMenuFactory.INSTANCE.createMenu();
//				editMenu.setElementId("edit");
				//editMenu.setElementId("edit");
//				editMenu.setLabel("&Edit");
				
//				menu.getChildren().add(editMenu);
//				
//				//Submenu 'Window'
//				MMenu windowMenu = MMenuFactory.INSTANCE.createMenu();
//				windowMenu.setElementId(PathProvider.APP_MAIN_MENU_WINDOW);
//				windowMenu.setLabel("&Window");
//				
//				menu.getChildren().add(windowMenu);
//				
				
				//Declare menu as main menu
				app.getChildren().get(0).setMainMenu(menu);
				
			}			
		} catch (Exception ex) {
		}
	}
}

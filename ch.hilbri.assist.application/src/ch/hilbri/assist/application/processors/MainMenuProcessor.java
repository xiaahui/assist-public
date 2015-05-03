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
				
				menu.getChildren().add(fileMenu);
				
				
				//Submenu 'Edit'
				MMenu editMenu = MMenuFactory.INSTANCE.createMenu();
				editMenu.setElementId("edit");
				editMenu.setLabel("&Edit");
				
				menu.getChildren().add(editMenu);
				
				//Submenu 'Help'
				MMenu helpMenu = MMenuFactory.INSTANCE.createMenu();
				helpMenu.setElementId("help");
				helpMenu.setLabel("&Help");
				
				menu.getChildren().add(helpMenu);
				
				
				//Declare menu as main menu
				app.getChildren().get(0).setMainMenu(menu);
				
			}			
		} catch (Exception ex) {
		}
	}
}

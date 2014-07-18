 
package ch.hilbri.assist.application.handlers;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

import ch.hilbri.assist.application.helpers.Helpers;

public class CloseAllHandler {
	
	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
		MPart editorPart = Helpers.getActiveEditor(application, service);
		if (editorPart == null)
			return false;
		else
			return true;
		
	}
	
	@Execute
	public void execute(ECommandService commandService, EHandlerService handlerService, Logger logger) {
		   
		ParameterizedCommand command = commandService.createCommand("org.eclipse.ui.file.closeAll", null);
		if (handlerService.canExecute(command)) {
			handlerService.executeHandler(command);
		} else {
			logger.warn("Couldn't close the file.");
		}
	}
		
}
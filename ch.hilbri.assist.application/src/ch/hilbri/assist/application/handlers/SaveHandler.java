 
package ch.hilbri.assist.application.handlers;

import javax.inject.Named;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.services.IServiceConstants;

public class SaveHandler {
	
	@CanExecute
	public boolean canExecute(
			@Named(IServiceConstants.ACTIVE_PART) MDirtyable dirtyable) {
		if (dirtyable == null) {
			return false;
		}
		return dirtyable.isDirty();
	}
	
	@Execute
	public void execute(ECommandService commandService, EHandlerService handlerService, Logger logger) {
		   
		ParameterizedCommand command = commandService.createCommand("org.eclipse.ui.file.save", null);
		if (handlerService.canExecute(command)) {
			handlerService.executeHandler(command);
		} else {
			logger.warn("Couldn't save the file.");
		}
	}
		
}
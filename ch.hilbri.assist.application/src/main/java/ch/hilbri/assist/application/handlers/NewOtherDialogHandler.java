package ch.hilbri.assist.application.handlers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * Opens a dialog to create any file/folder/project registered in a wizard
 *
 */
@SuppressWarnings("restriction")
public class NewOtherDialogHandler {

	@Execute
	public void execute(EHandlerService hService, ECommandService cService) {
		
		Command command = cService.getCommand(PathProvider.ECL_NEW_WIZARD);
		if (command.isDefined()) {
			ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_NEW_WIZARD, null);
			if (hService.canExecute(cmd)) {
				hService.executeHandler(cmd);
			}
		}
	}
}

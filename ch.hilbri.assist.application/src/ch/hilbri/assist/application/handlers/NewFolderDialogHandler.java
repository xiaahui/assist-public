package ch.hilbri.assist.application.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * Opens a dialog to create a new folder
 */
@SuppressWarnings("restriction")
public class NewFolderDialogHandler {

	@Execute
	public void execute(EHandlerService hService, ECommandService cService) {

		Command command = cService.getCommand(PathProvider.ECL_NEW_WIZARD);
		if (command.isDefined()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("newWizardId", PathProvider.ECL_WIZARD_NEW_FOLDER);
			ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_WIZARD_NEW_FOLDER, map);
			if (hService.canExecute(cmd)) {
				hService.executeHandler(cmd);
			}
		}
	}
}
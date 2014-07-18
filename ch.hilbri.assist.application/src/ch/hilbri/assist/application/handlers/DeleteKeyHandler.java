package ch.hilbri.assist.application.handlers;

import javax.inject.Named;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

import ch.hilbri.assist.application.helpers.PathProvider;


/**
 * This is (again) a workaround for the keyhandler of the delete key. The global action brought by eclipse isn't working in the project explorer with e4.
 * @author Mirko Liebender
 *
 */
@SuppressWarnings("restriction")
public class DeleteKeyHandler{

	@Execute
	@Optional
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, EHandlerService hService, ECommandService cService, EContextService context) {
		
		for (String tmp : context.getActiveContextIds()) {
			if (tmp.equals(PathProvider.ECL_TEXT_EDITOR_SCOPE)) {
				Command command = cService.getCommand(PathProvider.ECL_COMMAND_DELETE); //Context: [org.eclipse.ui.contexts.dialogAndWindow, org.eclipse.ui.contexts.window, org.eclipse.ui.textEditorScope, org.eclipse.xtext.ui.XtextEditorScope]
				if (command.isDefined()) {
					ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_COMMAND_DELETE, null); 
					if (hService.canExecute(cmd)) {
						hService.executeHandler(cmd);
					}
				}
				return;
			}
		}
		Command command = cService.getCommand(PathProvider.ECL_COMMAND_DELETE_RESOURCES); //Context: [org.eclipse.ui.contexts.dialogAndWindow, org.eclipse.ui.contexts.window]
		if (command.isDefined()) {
			ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_COMMAND_DELETE_RESOURCES, null); 
			if (hService.canExecute(cmd)) {
				hService.executeHandler(cmd);
			}
		}
	}
}

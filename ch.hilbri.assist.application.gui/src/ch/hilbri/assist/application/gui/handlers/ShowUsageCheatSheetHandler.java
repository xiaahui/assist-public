package ch.hilbri.assist.application.gui.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;

import ch.hilbri.assist.application.gui.helpers.PathProvider;

/**
 * Handler for the CheatSheet Dialog
 */
public class ShowUsageCheatSheetHandler {
	
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
			new OpenCheatSheetAction(PathProvider.APP_CHEAT_SHEET_ID).run();
	}
}

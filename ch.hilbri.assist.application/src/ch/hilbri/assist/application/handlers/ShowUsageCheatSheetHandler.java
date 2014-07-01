package ch.hilbri.assist.application.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * Handler for the CheatSheet Dialog
 */
public class ShowUsageCheatSheetHandler {
	
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(PathProvider.ECL_CHEAT_SHEET_VIEW);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}

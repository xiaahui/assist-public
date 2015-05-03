package ch.hilbri.assist.application.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * This handler calls the help information dialog.
 */
public class HelpHandler {

	@CanExecute
	public boolean canExecute(IEclipseContext context, IWorkbench workbench) {
		return false;
	}
	
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Help", "This is the help handler. It has yet to be implemented!"); //  write
																													// help
																													// stuff
	}
}

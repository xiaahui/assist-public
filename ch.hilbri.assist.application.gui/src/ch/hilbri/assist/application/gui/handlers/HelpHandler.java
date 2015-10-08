package ch.hilbri.assist.application.gui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * This handler calls the help information dialog.
 */
public class HelpHandler {

	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Help", "This is the help handler. It has yet to be implemented!"); //  write
																													// help
																													// stuff
	}
}

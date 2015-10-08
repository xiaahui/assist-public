package ch.hilbri.assist.application.gui.handlers;

import java.io.File;

import javax.inject.Named;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class OpenHandler {

	@Execute
	public String execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		FileDialog dialog = new FileDialog(shell);
		String[] extensions = { "*.*" };
		dialog.setFilterExtensions(extensions);
		String selected = dialog.open();

		File fileToOpen = new File(selected);

		if (fileToOpen.exists() && fileToOpen.isFile()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		} else {
			MessageDialog errorDialog = new MessageDialog(shell, "Error", null, "Error opening file", MessageDialog.ERROR, new String[] { "Ok" }, 0);
			errorDialog.open();
		}

		return selected;
	}
}

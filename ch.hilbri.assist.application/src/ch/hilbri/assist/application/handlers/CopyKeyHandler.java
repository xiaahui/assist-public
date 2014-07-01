package ch.hilbri.assist.application.handlers;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Named;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Shell;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * This is (again) a workaround for the keyhandler of the copy key. The global action brought by eclipse isn't working in the
 * project explorer with e4.
 *
 */
@SuppressWarnings({ "restriction", "unchecked" })
public class CopyKeyHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, ESelectionService service, EHandlerService hService, ECommandService cService, EContextService context) {

		for (String tmp : context.getActiveContextIds()) {
			if (tmp.equals(PathProvider.ECL_TEXT_EDITOR_SCOPE)) {
				Command command = cService.getCommand(PathProvider.ECL_COMMAND_COPY); // Context:
																						// [org.eclipse.ui.contexts.dialogAndWindow,
																						// org.eclipse.ui.contexts.window,
																						// org.eclipse.ui.textEditorScope,
																						// org.eclipse.xtext.ui.XtextEditorScope]
				if (command.isDefined()) {
					ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_COMMAND_COPY, null);
					if (hService.canExecute(cmd)) {
						hService.executeHandler(cmd);
					}
				}
				return;
			}
		}

		Clipboard cb = new Clipboard(shell.getDisplay());
		IStructuredSelection sel = (IStructuredSelection) service.getSelection();

		List<String> paths = new LinkedList<String>();
		Iterator<String> iterator = sel.iterator();
		while (iterator.hasNext()) {
			Object firstElement = iterator.next();
			IPath location = null;
			if (firstElement instanceof IResource) {
				// Is it a IResource ?
				IResource resource = (IResource) firstElement;
				// Get the location
				location = resource.getLocation();
			} else if (firstElement instanceof IAdaptable) {
				// Is it a IResource adaptable ?
				IAdaptable adaptable = (IAdaptable) firstElement;
				IResource resource = (IResource) adaptable.getAdapter(IResource.class);
				if (resource != null) {
					// Get the location
					location = resource.getLocation();
				}
			}
			if (location != null) {
				// Get the file for the location
				File file = location.toFile();
				if (file != null) {
					// Add the absolute path to the list
					paths.add(file.getAbsolutePath());
				}
			}
		}
		String[] array = new String[paths.size()];
		for (int i = 0; i < paths.size(); i++) {
			array[i] = paths.get(i);
		}

		cb.setContents(new Object[] { array }, new Transfer[] { FileTransfer.getInstance() });
		cb.dispose();

	}
}

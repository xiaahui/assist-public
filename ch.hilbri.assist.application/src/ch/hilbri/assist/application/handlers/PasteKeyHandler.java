package ch.hilbri.assist.application.handlers;

import java.io.File;
import java.util.ArrayList;

import javax.inject.Named;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.CopyFilesAndFoldersOperation;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * This is (again) a workaround for the keyhandler of the delete key. The global action brought by eclipse isn't working in the
 * project explorer with e4.
 *
 */
@SuppressWarnings("restriction")
public class PasteKeyHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, ESelectionService service, EHandlerService hService, ECommandService cService, EContextService context) {

		for (String tmp : context.getActiveContextIds()) {
			if (tmp.equals(PathProvider.ECL_TEXT_EDITOR_SCOPE)) {
				Command command = cService.getCommand(PathProvider.ECL_COMMAND_PASTE); // Context:
																						// [org.eclipse.ui.contexts.dialogAndWindow,
																						// org.eclipse.ui.contexts.window,
																						// org.eclipse.ui.textEditorScope,
																						// org.eclipse.xtext.ui.XtextEditorScope]
				if (command.isDefined()) {
					ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_COMMAND_PASTE, null);
					if (hService.canExecute(cmd)) {
						hService.executeHandler(cmd);
					}
				}
				return;
			}
		}

		Clipboard cb = new Clipboard(shell.getDisplay());
		FileTransfer transfer = FileTransfer.getInstance();
		Object data = cb.getContents(transfer);
		if (data != null) {
			if (data instanceof String[]) {
				String[] paths = (String[]) data;
				IStructuredSelection sel = (IStructuredSelection) service.getSelection();
				Object firstElement = sel.getFirstElement();
				if (firstElement instanceof IResource) {
					// Is it a IResource ?
					IResource resource = (IResource) firstElement;
					IContainer resContainer;
					if (resource instanceof IContainer) {
						resContainer = (IContainer) resource;
					} else {
						resContainer = resource.getParent();
					}
					if (resContainer != null) {
						CopyFilesAndFoldersOperation op = new CopyFilesAndFoldersOperation(shell);

						ArrayList<IResource> resList = new ArrayList<IResource>();
						ArrayList<String> pathList = new ArrayList<String>();
						IWorkspace workspace = ResourcesPlugin.getWorkspace();
						for (int i = 0; i < paths.length; i++) {
							File tmpFile = new File(paths[i]);
							IPath path = new Path(paths[i]);
							IFile file = workspace.getRoot().getFileForLocation(path);
							if (file != null) {
								if (file.exists()) {
									resList.add(file);
								} else if (tmpFile.isDirectory()) {
									IFolder newFolder = resContainer.getFolder(new Path(tmpFile.getName()));
									if (newFolder.exists()) {
										resList.add(newFolder);
									} else {
										pathList.add(paths[i]);
									}
								}
							} else {
								// if (tmpFile.isDirectory()) {
								// if (tmpFile.getAbsolutePath().equals(resContainer.getLocation().toOSString())) {
								// IFolder newFolder = resContainer.getFolder(resContainer.getFullPath());
								// resList.add(newFolder);
								// } else {
								// pathList.add(paths[i]);
								// }
								// } else { //TODO Project copy doesn't work yet
								pathList.add(paths[i]);
								// }
							}

						}

						IResource[] resArray = new IResource[resList.size()];
						String[] pathArray = new String[pathList.size()];

						for (int i = 0; i < resArray.length; i++) {
							resArray[i] = resList.get(i);
						}

						for (int i = 0; i < pathArray.length; i++) {
							pathArray[i] = pathList.get(i);
						}

						if (resArray.length > 0) {
							op.copyResources(resArray, resContainer);
						}

						if (pathArray.length > 0) {
							op.copyFiles(pathArray, resContainer);
						}
					}
				}
			}
		}
	}
}

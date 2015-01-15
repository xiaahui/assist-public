package ch.hilbri.assist.mapping.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

import ch.hilbri.assist.mapping.importers.excel.ExcelInputTransformator;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

/**
 * @author Robert Hilbrich
 * 
 */
public class ImportFromExcel {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {

		IEditorPart editorPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editorPart == null)
			return false;

		if (editorPart instanceof MultiPageEditor)
			return true;
		else
			return false;
	}

	/**
	 */
	@Execute
	public Object execute(MApplication application, EModelService service,
			IProgressMonitor monitor) {

		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		if (editorPart instanceof MultiPageEditor) {
		
			MultiPageEditor editor = (MultiPageEditor) editorPart;
			editor.doSave(null);
			IEditorInput input = editor.getEditorInput();

			if (input instanceof IFileEditorInput) {
				IResource resource = ((IFileEditorInput) input).getFile();
				IProject project = resource.getProject();

				IFile file = project.getFile(resource.getName());

				FileDialog dialog = new FileDialog(editor.getSite().getShell(),	SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.xls" });
				String filePath = dialog.open();

				if (filePath == null) return null;

				byte[] bytes = ExcelInputTransformator.createMDSLFileInput(filePath).getBytes();
				InputStream source = new ByteArrayInputStream(bytes);

				try { file.setContents(source, IResource.NONE, null); } 
				catch (CoreException e) { e.printStackTrace(); }
			}
		}

		return null;
	}
}

package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

/**
 * @author Robert Hilbrich
 * 
 */
public class ImportFromMagicDraw {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		if (editorPart == null) return false;
//
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//
//				return true;
//			}
//		}
		return false;
	}

	/**
	 */
	@Execute
	public Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {

//		MPart editorPart = Helpers.getActiveEditor(application, service);
//
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				editor.doSave(monitor);
//
//				// FileDialog -> Uml2 File suchen (Modell-Instanz)
//				// UMl2-File als ECore laden
//
//				// UML2EcoreImport uml2ecoreimport = new UML2EcoreImport();
//
//				ResourceLoader resLoader = new ResourceLoader();
//				XMIResource res = resLoader.loadResource(editor);
//
//				// M2M Transformation anstossen und Modell fuer PRECISION PRO
//				// erstellen
//
//				ABM2PPMTransformer transformer = new ABM2PPMTransformer(res);
//
//				IEditorInput input = editor.getEditorInput();
//
//				if (input instanceof IFileEditorInput) {
//					IResource resource = ((IFileEditorInput) input).getFile();
//					IProject project = resource.getProject();
//
//					IFile file = project.getFile(resource.getName());
//
//					byte[] bytes = Transformation.mappingInput(transformer).getBytes();
//					InputStream source = new ByteArrayInputStream(bytes);
//
//					try {
//						file.setContents(source, IResource.NONE, null);
//					} catch (CoreException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//
//			}
//		}
		return null;
	}
}

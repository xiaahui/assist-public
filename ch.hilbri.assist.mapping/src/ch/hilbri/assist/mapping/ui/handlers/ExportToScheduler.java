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
public class ExportToScheduler {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		if (editorPart == null) return false;
//		
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//				
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				
//				/* Wenn wir keine Lösungen haben, dann darf das nicht erlaubt sein. */
//				if (editor.getDetailedResultViewUiModel().getResults().size() == 0) return false;
//				
//				/* Nur wenn wir auch wirklich die Ergebnisse sehen, dann können wir exportieren */
//				if (editor.getActivePage() == 0) return false;
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
//				IEditorInput input = editor.getEditorInput();
//				
//				if (input instanceof IFileEditorInput) {
//				
//					IResource resource = ((IFileEditorInput)input).getFile();
//					IProject project = resource.getProject();
//					
//					DetailedResultsViewUiModel detailedResultsViewUiModel = editor.getDetailedResultViewUiModel(); 
//					
//					String newFileName = FilenameUtils.removeExtension(resource.getName()) + " - " + 
//			                     "Result-ID " + detailedResultsViewUiModel.getCurrentResult().hashCode() + ".sdsl";
//				
//					IFile file = project.getFile(newFileName);
//			    
//					try {
//						if (file.exists()) { file.delete(true, null); }
//					
//			    		byte[] bytes = SchedulingInput.generateSchedulingInput(detailedResultsViewUiModel.getCurrentResult()).getBytes();
//			    		InputStream source = new ByteArrayInputStream(bytes);
//						file.create(source, IResource.NONE, null);
//			    	 
//					} catch (CoreException e) {	e.printStackTrace(); }
//
//				}
//		
//			}
//		}
		return null;	
	}
}

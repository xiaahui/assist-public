package ch.hilbri.assist.scheduling.ui.handlers

import ch.hilbri.assist.application.helpers.Helpers
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.core.runtime.IProgressMonitor

@SuppressWarnings("restriction")
class Generate {
	
	@CanExecute
	def boolean canExecute(MApplication application, EModelService service) {
		val editorPart = Helpers.getActiveEditor(application, service)
		if (editorPart == null) return false
		else return true
		
//		if (editorPart.object instanceof CompatibilityEditor) {
//			val compEditor = editorPart.object as CompatibilityEditor
			
//			if (compEditor.editor instanceof MultiPageEditor) {
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				IEditorInput input = editor.getEditorInput();
//				if (input instanceof IFileEditorInput) {
//					IPath path = ((IFileEditorInput)input).getFile().getLocation();
//					URI uri = URI.createFileURI(path.toOSString());
//					ResourceSet rs = new ResourceSetImpl();
//					Resource resource = rs.getResource(uri, true);
//					
//					/* Searching for errors inside the document? */
//					/* 1) Error with the syntax of the dsl */
//					if (resource.getErrors().size() > 0) {	return false; } 
//					if (resource.getContents().size() == 0) { return false;	}
//					/* 2) Custom validation rule errors */
//					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
//					if (diagnostic.getSeverity() == Diagnostic.ERROR) { 
//						return false; 
//					}
//				
//					return true;
//				}
//			}
}
	
	/**
	 * This handler processes the xtext file and
	 * starts the scheduler
	 */
	@Execute
	def Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
				
		val editorPart = Helpers.getActiveEditor(application, service)
		if (editorPart == null) return null;
	}
		
}
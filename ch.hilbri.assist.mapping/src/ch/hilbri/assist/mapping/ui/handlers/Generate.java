package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;


public class Generate {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		if (editorPart == null) return false;
//		
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//					return true;
//			}
//		}
		return false;
	}
	
	/**
	 * This handler processes the xtext file and
	 * starts the mapper
	 */
	@Execute
	public Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
				
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		if (editorPart == null) return null;
//		
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				editor.resetView();
//				editor.doSave(monitor);
//				IEditorInput input = editor.getEditorInput();
//				if (input instanceof IFileEditorInput) {
//					IPath path = ((IFileEditorInput)input).getFile().getLocation();
//
//					URI uri = URI.createFileURI(path.toOSString());
//					ResourceSet rs = new ResourceSetImpl();
//					Resource resource = rs.getResource(uri, true);
//					
//					/* Searching for errors inside the document? */
//					if (resource.getErrors().size() > 0) {	
//						ConsoleCommands.writeLineToConsole("Eingabe fehlerhaft!"); //TODO ordentliche ausgabe
//						return null; 
//					}
//					
//					/* Create a new model for the input */
//					
//
//					/* Create a new model for the input */
//					MappingDataModel inputModel = null;
//					try {
//						inputModel = new MappingDataModel(resource);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					
//					if (editor instanceof MultiPageEditor) {
//						
//						/* Open the dialog to choose between simple and advanced mode for finding solutions */
//						SimpleOrAdvancedModeDialog soamd = new SimpleOrAdvancedModeDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//						
//						if (soamd.open() == org.eclipse.jface.window.Window.OK) {
//							// User hat OK geklickt
//							/* Create a new background Job for finding all solutions */
//							SolverJob findSolutionsJob = new SolverJob("Find all solutions", inputModel, (MultiPageEditor)editor);
//							findSolutionsJob.setUser(true);
//							switch (soamd.getMode()) {
//							case CONSECUTIVE:
//								findSolutionsJob.setKindOfSolutions(SolutionGenerator.KindOfSolutions.CONSECUTIVE);
//								findSolutionsJob.setMaxSolutions(soamd.getNumberOfSolutions());
//								findSolutionsJob.setMaxTimeOfCalculationInmsec(1); // wird sowieso nicht beachtet
//								break;
//							case RANDOM:
//								findSolutionsJob.setKindOfSolutions(SolutionGenerator.KindOfSolutions.RANDOM);
//								findSolutionsJob.setMaxSolutions(soamd.getNumberOfSolutions());
//								findSolutionsJob.setMaxTimeOfCalculationInmsec(soamd.getSearchTime());
//								break;
//							default:
//								return null;
//							}
//							findSolutionsJob.schedule();
//						} else {
//							// User hat auf Cancel geklickt oder anders beendet
//							
//						}
//						
//						
//						
//					} else {
//						ConsoleCommands.writeLineToConsole("Something went wrong. Couldn't interact with Result View.");
//					}
//				}
//			}
//		}
	return null;	
	}
}

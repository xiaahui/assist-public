package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.application.helpers.Helpers;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.SolverJob;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.searchtypesdialog.SimpleOrAdvancedModeDialog;
import ch.hilbri.assist.model.AssistModel;


public class Generate {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
		MPart editorPart = Helpers.getActiveEditor(application, service);
		if (editorPart == null) return false;
		
		if (editorPart.getObject() instanceof CompatibilityEditor) {
			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
			if (compEditor.getEditor() instanceof MultiPageEditor) {
					return true;
			}
		}
		return false;
	}
	
	/**
	 * This handler processes the xtext file and
	 * starts the mapper
	 */
	@Execute
	public Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
				
		MPart editorPart = Helpers.getActiveEditor(application, service);
		if (editorPart == null) return null;
		
		if (editorPart.getObject() instanceof CompatibilityEditor) {
			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
			if (compEditor.getEditor() instanceof MultiPageEditor) {
				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
				editor.resetView();
				editor.doSave(monitor);
				IEditorInput input = editor.getEditorInput();
				if (input instanceof IFileEditorInput) {
					IPath path = ((IFileEditorInput)input).getFile().getLocation();

					URI uri = URI.createFileURI(path.toOSString());
					ResourceSet rs = new ResourceSetImpl();
					Resource resource = rs.getResource(uri, true);
					
					/* Searching for errors inside the document? */
					if (resource.getErrors().size() > 0) {	
						ConsoleCommands.writeLineToConsole("Input contains errors - it will not be processed."); // ordentliche ausgabe
						return null; 
					}
					
					if (resource.getContents().size() == 0) 
						return null;
					
					
					/* Create a new model for the input */
					
					AssistModel inputModel = (AssistModel) resource.getContents().get(0);
					
					if (editor instanceof MultiPageEditor) {
						
						/* Open the dialog to choose between simple and advanced mode for finding solutions */
						SimpleOrAdvancedModeDialog soamd = new SimpleOrAdvancedModeDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
						
						if (soamd.open() == org.eclipse.jface.window.Window.OK) {
							// User hat OK geklickt
							/* Create a new background Job for finding all solutions */
							SolverJob findSolutionsJob = new SolverJob("Find all mappings", inputModel, (MultiPageEditor)editor);
							findSolutionsJob.setUser(true);
							switch (soamd.getMode()) {
							case CONSECUTIVE:
								findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE);
								findSolutionsJob.setMaxSolutions(soamd.getNumberOfSolutions());
								findSolutionsJob.setMaxTimeOfCalculationInmsec(1); // wird sowieso nicht beachtet
								break;
							case RANDOM:
								findSolutionsJob.setKindOfSolutions(SearchType.RANDOM);
								findSolutionsJob.setMaxSolutions(soamd.getNumberOfSolutions());
								findSolutionsJob.setMaxTimeOfCalculationInmsec(soamd.getSearchTime());
								break;
							default:
								return null;
							}
							findSolutionsJob.schedule();
						} 						
					} 
				}
			}
		}
	return null;	
	}
}

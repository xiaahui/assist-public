package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hilbri.assist.application.helpers.Helpers;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.GuiSolverJob;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.searchtypesdialog.SearchParametersDialog;


@SuppressWarnings("restriction")
public class Generate {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
		MPart editorPart = Helpers.getActiveEditor(application, service);
		if (editorPart == null) return false;
		
		if (editorPart.getObject() instanceof CompatibilityEditor) {
			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
			if (compEditor.getEditor() instanceof MultiPageEditor) {
				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
				IEditorInput input = editor.getEditorInput();
				if (input instanceof IFileEditorInput) {
					IPath path = ((IFileEditorInput)input).getFile().getLocation();
					URI uri = URI.createFileURI(path.toOSString());
					ResourceSet rs = new ResourceSetImpl();
					Resource resource = rs.getResource(uri, true);
					
//					// Resolve all proxies
//					EcoreUtil.resolveAll(resource);

					/* Searching for errors inside the document? */
					/* 1) Error with the syntax of the dsl */
					if (resource.getErrors().size() > 0) {	return false; } 
					
					if (resource.getContents().size() == 0) { return false;	}
					
//					/* 2) Custom validation rule errors */
//					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
//					if (diagnostic.getSeverity() == Diagnostic.ERROR) { 
//						return false; 
//					}
				
					return true;
				}
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
		
		Logger logger 			= LoggerFactory.getLogger(this.getClass());
		
		MPart editorPart = Helpers.getActiveEditor(application, service);
		if (editorPart == null) return null;
		
		if (editorPart.getObject() instanceof CompatibilityEditor) {
			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
			if (compEditor.getEditor() instanceof MultiPageEditor) {
				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
				
				editor.doSave(monitor);
				IEditorInput input = editor.getEditorInput();
				if (input instanceof IFileEditorInput) {
					IPath path = ((IFileEditorInput)input).getFile().getLocation();

					URI uri = URI.createFileURI(path.toOSString());
					ResourceSet rs = new ResourceSetImpl();
					Resource resource = rs.getResource(uri, true);
					
					// Resolve all proxies
					EcoreUtil.resolveAll(resource);
					
					/* Searching for errors inside the document? */
					/* 1) Error with the syntax of the dsl */
					if (resource.getErrors().size() > 0) {	
						logger.info("Input contains errors - it will not be processed."); 
						return null; 
					}
					
					if (resource.getContents().size() == 0) { 
						logger.info("Input is empty - it will not be processed."); 
						return null;
					}
					/* 2) Custom validation rule errors */
					Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
					if (diagnostic.getSeverity() == Diagnostic.ERROR) {
						logger.info("There are still some errors in the input. It will not be processed."); 
						logger.info("  - Message: " + diagnostic.getMessage());
						logger.info("  - Source : " + diagnostic.getSource());
						logger.info("  - Data   : " + diagnostic.getData());
						return null;
					}
					
					
					/* Create a new model for the input */
					AssistModel inputModel = (AssistModel) resource.getContents().get(0);
					
					if (editor instanceof MultiPageEditor) {
						
						/* Open the dialog to choose between simple and advanced mode for finding solutions */
						SearchParametersDialog searchParamDlg = new SearchParametersDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
						
						if (searchParamDlg.open() == org.eclipse.jface.window.Window.OK) {
							// User hat OK geklickt
							
							editor.resetView();
							
							/* Do some garbage collecting to conserve memory */
							System.gc();
							
							/* Create a new background Job for finding all solutions */
							GuiSolverJob findSolutionsJob = new GuiSolverJob("Find all mappings", inputModel, (MultiPageEditor)editor);
							findSolutionsJob.setPriority(Job.LONG);
							findSolutionsJob.setUser(true);
							findSolutionsJob.setSearchStrategy(searchParamDlg.getSearchType());
							findSolutionsJob.setMaxSolutions(searchParamDlg.getNumberOfSolutions());
							findSolutionsJob.setMaxSearchTime(searchParamDlg.getSearchTime());
							findSolutionsJob.setSavePartialSolution(searchParamDlg.getSavePartialSolution());
							findSolutionsJob.schedule();
						} 						
					} 
				}
			}
		}
	return null;	
	}
}

package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import ch.hilbri.assist.mapping.solver.GuiSolverJob;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.searchtypesdialog.SearchParametersDialog;

public class Generate {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
		
		IXtextDocument xtextDocument = EditorUtils.getActiveXtextEditor().getDocument();
		boolean result = xtextDocument.readOnly(
				new IUnitOfWork<Boolean, XtextResource>() {
					public Boolean exec(XtextResource resource) throws Exception {
						EcoreUtil.resolveAll(resource);
					
						/* Searching for errors inside the document? */
						/* - Error with the syntax of the dsl */
						if (resource.getErrors().size() > 0)	return false;  
						
						/* - Size of the document is empty */
						if (resource.getContents().size() == 0)  return false;	
						
						/* - Custom validation rule errors */
						Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
						if (diagnostic.getSeverity() == Diagnostic.ERROR)  return false; 
						
						/* Else */
						return true;
	                }
	    });
		
		return result;
	}

	/**
	 * This handler processes the xtext file and starts the mapper
	 */
	@Execute
	public void execute(MApplication application, EModelService service, IProgressMonitor monitor) {

		/* Find the editors ... */
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
		if (xtextEditor == null) {
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Could not locate the current Xtext editor.");
			return;
		}

		MultiPageEditor multipageEditor = (MultiPageEditor) ((MultiPageEditorSite) xtextEditor.getSite()).getMultiPageEditor();
		if (multipageEditor == null) {
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Could not locate the MultiPageEditor.");
			return;
		}

		/* Reset the views */
		multipageEditor.resetView();
		
		/* Retrieve the URI from the current model */
		URI modelURI = xtextEditor.getDocument().priorityReadOnly(new IUnitOfWork<URI, XtextResource>() {
			public URI exec(XtextResource model) throws Exception {
				return model.getURI();
			}
		});

		if (modelURI == null) {
			MessageDialog.openError(xtextEditor.getShell(), "Error", "Could not locate the URI for the input model.");
			return;
		}
		
		/*
		 * Open the dialog to choose between simple and advanced
		 * mode for finding solutions
		 */
		SearchParametersDialog searchParamDlg = new SearchParametersDialog(xtextEditor.getShell());
		if (searchParamDlg.open() == org.eclipse.jface.window.Window.OK) {

			/* Create a new background Job for finding all solutions */
			GuiSolverJob findSolutionsJob = new GuiSolverJob("Find all mappings", modelURI);
			findSolutionsJob.setEnableVerboseLogging(searchParamDlg.getVerboseLogging());
			findSolutionsJob.setSearchStrategy(searchParamDlg.getVariableSelector(), searchParamDlg.getValueSelector());
			findSolutionsJob.setMaxSolutions(searchParamDlg.getNumberOfSolutions());
			findSolutionsJob.setMaxSearchTime(searchParamDlg.getSearchTime());
			findSolutionsJob.setSavePartialSolution(searchParamDlg.getSavePartialSolution());
			findSolutionsJob.setEnableRestarts(searchParamDlg.getEnableRestarts(), searchParamDlg.getRestartFailCount());
			findSolutionsJob.setNoGoodRecording(searchParamDlg.getNoGoodRecordingRDC());
			findSolutionsJob.setEnableMinimization(searchParamDlg.getEnableMinimization());
			findSolutionsJob.setPriority(Job.LONG);
			findSolutionsJob.setUser(true);
			findSolutionsJob.schedule();
		}
	}
}

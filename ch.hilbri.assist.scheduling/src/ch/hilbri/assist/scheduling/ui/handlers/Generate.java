package ch.hilbri.assist.scheduling.ui.handlers;

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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import ch.hilbri.assist.scheduling.solver.GuiSolverJob;
import ch.hilbri.assist.scheduling.solver.strategies.ValueSelectorTypes;
import ch.hilbri.assist.scheduling.solver.strategies.VariableSelectorTypes;
import ch.hilbri.assist.scheduling.ui.multipageeditor.MultiPageEditor;

public class Generate {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {

		/*
		 * Scheduling generation should only be allowed, if we are actually looking at a
		 * mapping problem
		 */
		XtextEditor editor = EditorUtils.getActiveXtextEditor();
		if (editor != null && !editor.getLanguageName().equals("ch.hilbri.assist.scheduling.dsl.SchedulingDsl"))
			return false;

		/*
		 * If it is a scheduling problem, then we should check, whether the content is
		 * ok
		 */
		IXtextDocument xtextDocument = EditorUtils.getActiveXtextEditor().getDocument();

		boolean result = xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			public Boolean exec(XtextResource resource) throws Exception {
				EcoreUtil.resolveAll(resource);

				/* Searching for errors inside the document? */
				/* - Error with the syntax of the dsl */
				if (resource.getErrors().size() > 0)
					return false;

				/* - Size of the document is empty */
				if (resource.getContents().size() == 0)
					return false;

				/* - Custom validation rule errors */
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
				if (diagnostic.getSeverity() == Diagnostic.ERROR)
					return false;

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
	public void execute(Shell shell, MApplication application, EModelService service, IProgressMonitor monitor) {

		/* Find the editors ... */
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
		if (xtextEditor == null) {
			MessageDialog.openError(shell, "Error", "Could not locate the current Xtext editor.");
			return;
		}

		/* Check if the editor needs saving */
		if (xtextEditor.isDirty()) {
			boolean saveFirst = MessageDialog.openQuestion(shell, "Save Specification",
					"Your specification contains parts which have not been saved yet. These parts will not be considered during the generation process.\n\nSave the specification now?");
			if (saveFirst)
				xtextEditor.doSave(monitor);
		}

		MultiPageEditor multipageEditor = (MultiPageEditor) ((MultiPageEditorSite) xtextEditor.getSite())
				.getMultiPageEditor();
		if (multipageEditor == null) {
			MessageDialog.openError(shell, "Error", "Could not locate the MultiPageEditor.");
			return;
		}

		/* Retrieve the URI from the current model */
		URI modelURI = xtextEditor.getDocument().priorityReadOnly(new IUnitOfWork<URI, XtextResource>() {
			public URI exec(XtextResource model) throws Exception {
				return model.getURI();
			}
		});

		if (modelURI == null) {
			MessageDialog.openError(shell, "Error", "Could not locate the URI for the input model.");
			return;
		}

		/* Create a new background job for finding solutions */
		GuiSolverJob findSolutionsJob = new GuiSolverJob("Find a schedule", modelURI, multipageEditor);
		findSolutionsJob.setEnableVerboseLogging(true);
		findSolutionsJob.setSearchStrategy(VariableSelectorTypes.getDefault(), ValueSelectorTypes.getDefault());
		findSolutionsJob.setMaxSolutions(1);
		findSolutionsJob.setMaxSearchTime(50000);
		findSolutionsJob.setPriority(Job.LONG);
		findSolutionsJob.setUser(true);
		findSolutionsJob.schedule();
	}
}

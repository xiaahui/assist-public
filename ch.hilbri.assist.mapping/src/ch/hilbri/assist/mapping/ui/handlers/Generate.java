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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import ch.hilbri.assist.mapping.solver.GuiSolverJob;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.searchtypesdialog.SearchParametersDialog;

public class Generate {

    @CanExecute
    public boolean canExecute(MApplication application, EModelService service) {

        /*
         * Mapping generation should only be allowed, if we are actually looking at a
         * mapping problem
         */
        IEditorPart currentEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();

        if (currentEditor == null)
            return false;

        if (!(currentEditor instanceof MultiPageEditor))
            return false;

        MultiPageEditor multiPageEditor = (MultiPageEditor) currentEditor;

        XtextEditor xtextEditor = multiPageEditor.getTabEditor();
        if (!xtextEditor.getLanguageName().equals("ch.hilbri.assist.mapping.dsl.MappingDSL"))
            return false;

        /*
         * If it is a mapping problem, then we should check, whether the content is ok
         */
        IXtextDocument xtextDocument = xtextEditor.getDocument();

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
        IEditorPart currentEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

        if (currentEditor == null)
            return;

        if (!(currentEditor instanceof MultiPageEditor))
            return;

        MultiPageEditor multiPageEditor = (MultiPageEditor) currentEditor;

        XtextEditor xtextEditor = multiPageEditor.getTabEditor();
        if (xtextEditor == null || !xtextEditor.getLanguageName().equals("ch.hilbri.assist.mapping.dsl.MappingDSL"))
            return;

        /* Check if the editor needs saving */
        if (xtextEditor.isDirty()) {
            boolean saveFirst = MessageDialog.openQuestion(shell, "Save Specification",
                    "Your specification contains parts which have not been saved yet. These parts will not be considered during the generation process.\n\nSave the specification now?");
            if (saveFirst)
                xtextEditor.doSave(monitor);
        }

        MultiPageEditorSite editorSite = (MultiPageEditorSite) xtextEditor.getSite();
        MultiPageEditor multipageEditor = (MultiPageEditor) editorSite.getMultiPageEditor();
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

        /*
         * Open the dialog to choose between simple and advanced mode for finding
         * solutions
         */
        SearchParametersDialog searchDialog = new SearchParametersDialog(shell);
        if (searchDialog.open() == org.eclipse.jface.window.Window.OK) {

            /* Create a new background Job for finding all solutions */
            GuiSolverJob findSolutionsJob = new GuiSolverJob("Find all mappings", modelURI, multipageEditor);
            findSolutionsJob.setEnableVerboseLogging(searchDialog.getVerboseLogging());
            findSolutionsJob.setSearchStrategy(searchDialog.getVariableSelector(), searchDialog.getValueSelector());
            findSolutionsJob.setMaxSolutions(searchDialog.getNumberOfSolutions());
            findSolutionsJob.setMaxSearchTime(searchDialog.getSearchTime());
            findSolutionsJob.setSavePartialSolution(searchDialog.getSavePartialSolution());
            findSolutionsJob.setEnableRestarts(searchDialog.getEnableRestarts(), searchDialog.getRestartFailCount());
            findSolutionsJob.setNoGoodRecording(searchDialog.getNoGoodRecordingRDC());
            findSolutionsJob.setEnableMinimization(searchDialog.getEnableMinimization());
            findSolutionsJob.setPriority(Job.LONG);
            findSolutionsJob.setUser(true);
            findSolutionsJob.schedule();
        }
    }
}

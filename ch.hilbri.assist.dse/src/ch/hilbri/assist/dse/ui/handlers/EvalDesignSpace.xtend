package ch.hilbri.assist.dse.ui.handlers

import ch.hilbri.assist.dse.evaluation.GuiEvaluationJob
import ch.hilbri.assist.dse.ui.multipageeditor.MultiPageEditor
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.MultiPageEditorSite
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.concurrent.IUnitOfWork

class EvalDesignSpace {

    @CanExecute
    def boolean canExecute(MApplication application, EModelService service) {
        /*
         * Mapping generation should only be allowed, if we are actually looking at a
         * mapping problem
         */
        val currentEditor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
        if (currentEditor === null)
            return false;

        if (!(currentEditor instanceof MultiPageEditor))
            return false;

        val multiPageEditor = currentEditor as MultiPageEditor
        val xtextEditor = multiPageEditor.tabEditor
        if (!xtextEditor.languageName.equals("ch.hilbri.assist.dse.dsl.DSEDsl"))
            return false;

        /*
         * If it is a mapping problem, then we should check, whether the content is ok
         */
        val xtextDocument = xtextEditor.document
        val result = xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
            override Boolean exec(XtextResource resource) throws Exception {
                EcoreUtil.resolveAll(resource);

                /* Searching for errors inside the document? */
                /* - Error with the syntax of the dsl */
                if (resource.errors.size > 0)
                    return false;

                /* - Size of the document is empty */
                if (resource.contents.size == 0)
                    return false;

                /* - Custom validation rule errors */
                val diagnostic = Diagnostician.INSTANCE.validate(resource.contents.get(0));
                if (diagnostic.severity == Diagnostic.ERROR)
                    return false;

                /* Else */
                return true;
            }
        });

        return result;
    }

    @Execute
    def void execute(Shell shell, MApplication application, EModelService service, IProgressMonitor monitor) {

        val currentEditor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
        if (currentEditor === null)
            return;

        if (!(currentEditor instanceof MultiPageEditor))
            return;

        val multiPageEditor = currentEditor as MultiPageEditor
        val xtextEditor = multiPageEditor.tabEditor
        if (!xtextEditor.languageName.equals("ch.hilbri.assist.dse.dsl.DSEDsl"))
            return;

        /* Check if the editor needs saving */
        if (xtextEditor.isDirty()) {
            val saveFirst = MessageDialog.openQuestion(shell, "Save Specification",
                "Your specification contains parts which have not been saved yet. These parts will not be considered during the generation process.\n\nSave the specification now?")
            if (saveFirst)
                xtextEditor.doSave(monitor)
        }

        val editorSite = xtextEditor.site as MultiPageEditorSite
        val multipageEditor = editorSite.multiPageEditor as MultiPageEditor
        if (multipageEditor === null) {
            MessageDialog.openError(shell, "Error", "Could not locate the MultiPageEditor.");
            return;
        }

        /* Retrieve the URI from the current model */
        val modelURI = xtextEditor.document.priorityReadOnly(new IUnitOfWork<URI, XtextResource>() {
            override URI exec(XtextResource model) throws Exception {
                return model.getURI();
            }
        });

        if (modelURI === null) {
            MessageDialog.openError(shell, "Error", "Could not locate the URI for the input model.");
            return;
        }

        val evalJob = new GuiEvaluationJob("Evaluate Design Space", modelURI, multipageEditor)
        evalJob.priority = Job.LONG
        evalJob.user = true
        evalJob.schedule
    }
}

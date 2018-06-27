package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.dse.ui.multipageeditor.MultiPageEditor
import ch.hilbri.assist.model.AssistModel
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.swt.widgets.Display

class GuiEvaluationJob extends Job {

    private MultiPageEditor multiPageEditor
    private Evaluation evaluation
//    private Logger logger = LoggerFactory.getLogger(GuiEvaluationJob)

    new(String name, URI modelURI, MultiPageEditor editor) {
        super(name);

        /* Who is asking to get the results back? */
        multiPageEditor = editor;

        /* Load the model from the URI */
        val rs = new ResourceSetImpl()
        val resource = rs.getResource(modelURI, true)
        val assistModel = resource.contents.get(0) as AssistModel

        evaluation = new Evaluation(assistModel)
    }

    override protected run(IProgressMonitor monitor) {
        monitor.beginTask("Evaluating the design space", 1);
        evaluation.run
        monitor.worked(1);
        if(monitor.isCanceled()) return Status.CANCEL_STATUS;

        monitor.beginTask("Presenting the results", 1);
        Display.getDefault().asyncExec(new Runnable() {
            override void run() {
                multiPageEditor.explorationResults = evaluation.explorationResults
                multiPageEditor.showResultsTab();
            }
        });
        monitor.worked(1)
        
        return Status.OK_STATUS
    }

}

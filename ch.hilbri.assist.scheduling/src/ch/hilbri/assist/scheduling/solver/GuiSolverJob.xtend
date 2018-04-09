package ch.hilbri.assist.scheduling.solver

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.SchedulingResult
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.exceptions.HyperPeriodLengthException
import ch.hilbri.assist.scheduling.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.scheduling.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.scheduling.ui.multipageeditor.MultiPageEditor
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.PlatformUI
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class GuiSolverJob extends Job {

	private AssistSchedulingSolver assistSolver
	private MultiPageEditor multiPageEditor
	private Logger logger = LoggerFactory::getLogger(class)

	new(String name, URI modelURI, MultiPageEditor editor) {
		super(name)
		
		/* Who is asking to get the results back? */
		multiPageEditor = editor
		
		/* Load the model from the URI */
		var ResourceSet rs = new ResourceSetImpl()
		var Resource resource = rs.getResource(modelURI, true)
		var AssistModel assistModel = resource.getContents().get(0) as AssistModel
		
		/* Create the ASSIST Solver */
		assistSolver = new AssistSchedulingSolver(assistModel)
	}

	override protected IStatus run(IProgressMonitor monitor) {
		try {
			monitor.beginTask("Solver initialization", 1)
			assistSolver.runInitialization()
			monitor.worked(1)
			
			if(monitor.isCanceled()) return Status::CANCEL_STATUS
			
			monitor.beginTask("Generating all constraints", 1)
			assistSolver.runConstraintGeneration()
			monitor.worked(1)
			
			if(monitor.isCanceled()) return Status::CANCEL_STATUS
			
			monitor.beginTask("Searching for solutions", 1)
			val t = new GuiSolverJobCancelChecker(monitor)
			t.start()
			assistSolver.setStopCriterion(t)
			assistSolver.runSolutionSearch()
			t.shutdown()
			monitor.worked(1)
			
			if(monitor.isCanceled()) return Status::CANCEL_STATUS
			
			assistSolver.createSolutions()
			
			if (assistSolver.results.size > 0) {
				monitor.beginTask("Presenting the results", 1)
				Display::^default.asyncExec([multiPageEditor.setAndShowResults(assistSolver.results)] as Runnable)
				monitor.worked(1)
			} 
			
			else {
				if (assistSolver.stopCriterionMet) {
					val message = "No solutions were found during the maximum allowed search time." 
					Display::^default.asyncExec([MessageDialog::openError(PlatformUI::workbench.activeWorkbenchWindow.shell, "Result", message)] as Runnable)
				} else {
					val message = "There are no solutions for this scheduling specification."
					Display::^default.asyncExec([MessageDialog::openError(PlatformUI::workbench.activeWorkbenchWindow.shell, "Result", message)] as Runnable)
				}
			}
			
		} 
		catch (HyperPeriodLengthException e) {
			logger.info('''Hyperperiod length was invalid.''')
			logger.info('''«e.explanation»''')
			val title = "Hyperperiod length is not correct"
			val message = '''«e.explanation»'''
			Display::^default.asyncExec([MessageDialog::openError(PlatformUI::workbench.activeWorkbenchWindow.shell, title, message)] as Runnable)
		}
		catch (BasicConstraintsException e) {
			var String constraintName = e.getConstraintName()
			logger.info('''Inconsistency found while processing constraint "«constraintName»"''')
			logger.info('''"«e.explanation»"''')
			val title = "Specification inconsistency detected"
			val message = '''
Your specifications became inconsistent. A correct deployment cannot be generated. 
Constraints: "«constraintName»" 
«e.explanation»'''
			Display::^default.asyncExec([MessageDialog::openError(PlatformUI::workbench.activeWorkbenchWindow.shell, title, message)] as Runnable)
		}

		return Status::OK_STATUS
	}

	def void setMaxSolutions(int maxSolutions) {
		assistSolver.setSolverMaxSolutions(maxSolutions)
	}

	def void setSearchStrategy(VariableSelectorTypes varSelector, ValueSelectorTypes valSelector) {
		assistSolver.setSolverSearchStrategy(varSelector, valSelector)
	}

	def void setMaxSearchTime(long maxTimeInmsec) {
		assistSolver.setSolverTimeLimit(maxTimeInmsec)
	}

	def List<SchedulingResult> getNewSchedulingResults() {
		return assistSolver.getResults()
	}

	def void setEnableRestarts(boolean value, int failCounter) {
		if(value) assistSolver.setEnableRestarts(failCounter)
	}

	def void setEnableVerboseLogging(boolean value) {
		if(value) assistSolver.setEnableVerboseLogging()
	}
}

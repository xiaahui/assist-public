package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hilbri.assist.mapping.model.AssistModelMapping;
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes;
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;

public class GuiSolverJob extends Job {

	private AssistMappingSolver assistSolver;
	private MultiPageEditor multiPageEditor;
	private Logger logger = LoggerFactory.getLogger(GuiSolverJob.class);

	public GuiSolverJob(String name, URI modelURI, MultiPageEditor editor) {
		super(name);
		
		/* Who is asking to get the results back? */
		multiPageEditor = editor;
		
		/* Load the model from the URI */
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(modelURI, true);
		AssistModelMapping assistModel = (AssistModelMapping) resource.getContents().get(0);
		
		/* Create the ASSIST Solver */
		assistSolver = new AssistMappingSolver(assistModel);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			monitor.beginTask("Solver initialization", 1);
			assistSolver.runInitialization();
			monitor.worked(1);

			if (monitor.isCanceled()) return Status.CANCEL_STATUS;

			monitor.beginTask("Generating all constraints", 1);
			assistSolver.runConstraintGeneration();
			monitor.worked(1);

			if (monitor.isCanceled()) return Status.CANCEL_STATUS;

			monitor.beginTask("Searching for solutions", 1);
			GuiSolverJobCancelChecker t = new GuiSolverJobCancelChecker(monitor);
			t.start();
			assistSolver.setStopCriterion(t);
			assistSolver.runSolutionSearch();
			t.shutdown();
			monitor.worked(1);
			
			if (monitor.isCanceled()) return Status.CANCEL_STATUS;

			assistSolver.createSolutions();
			
			if (assistSolver.getResults().size() > 0) {
				monitor.beginTask("Presenting the results", 1);
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						multiPageEditor.setMappingResultsList(assistSolver.getResults());
						multiPageEditor.showResultsTab();
					}
				});
				
				monitor.worked(1);
			} 
			
			else {
				String message;

				if (assistSolver.stopCriterionMet())
					message = "No solutions were found during the maximum allowed search time.";
				else
					message = "There are no solutions for this deployment specification.";

				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								"Result", message);
					}
				});
			}
		} catch (BasicConstraintsException e) {
			String constraintName = e.getConstraintName();
			String message = e.getExplanation();
			logger.info("Inconsistency found while processing constraint \"" + constraintName + "\"");
			logger.info("\"" + message + "\"");
			showMessageInUI(constraintName, message);
			resetView();
		}
		return Status.OK_STATUS;
	}

	private void showMessageInUI(String constraintName, String explanation) {

		String title 	= "Specification inconsistency detected";
		String message 	= "Your specifications became inconsistent. A correct deployment cannot be generated.\n\n"
							+ "Constraints: \"" + constraintName + "\"\n\n" + explanation + "";

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title,
						message);
			}
		});

	}

	private void resetView() {
		if (multiPageEditor != null) {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
//					multiPageEditor.resetView();
				}
			});
		}
	}

	public void setMaxSolutions(int maxSolutions) {
		assistSolver.setSolverMaxSolutions(maxSolutions);
	}

	public void setSearchStrategy(VariableSelectorTypes varSelector, ValueSelectorTypes valSelector) {
		assistSolver.setSolverSearchStrategy(varSelector, valSelector);
	}

	public void setMaxSearchTime(long maxTimeInmsec) {
		assistSolver.setSolverTimeLimit(maxTimeInmsec);
	}

	public void setSavePartialSolution(boolean value) {
		assistSolver.setSavePartialSolution(value);
	}

	public ArrayList<Result> getNewMappingResults() {
		return assistSolver.getResults();
	}
	
	public void setEnableRestarts(boolean value, int failCounter) {
		if (value)
			assistSolver.setEnableRestarts(failCounter);
	}
	
	public void setNoGoodRecording(boolean value) {
		if (value)
			assistSolver.setNoGoodRecording(HardwareArchitectureLevelType.BOARD); // Board level
	}
	
	public void setEnableMinimization(boolean value) {
		if (value)
			assistSolver.setEnableMinimization();
	}
	
	public void setEnableVerboseLogging(boolean value) {
		if (value)
			assistSolver.setEnableVerboseLogging();
	}
	
	
}
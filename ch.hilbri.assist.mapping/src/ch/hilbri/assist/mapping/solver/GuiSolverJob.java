package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class GuiSolverJob extends Job {

	private AssistSolver solver;

	private DetailedResultsViewUiModel detailedResultsViewUiModel;
		
	private MultiPageEditor multiPageEditor;
	
	private Logger logger;
	
	private boolean retrieveExplanation = false;
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param model
	 * @param editor 
	 */
	public GuiSolverJob(String name, AssistModel model, MultiPageEditor editor) {
		super(name);
		this.logger = LoggerFactory.getLogger(GuiSolverJob.class);

		if (editor != null) {
			multiPageEditor = editor;
			detailedResultsViewUiModel = multiPageEditor.getDetailedResultViewUiModel();
			detailedResultsViewUiModel.setEditor(multiPageEditor);
		}

		this.solver = new AssistSolver(model);
	}
			
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {

		long start = System.currentTimeMillis();
		
		try {
			monitor.beginTask("Propagating all constraints", 1);
			solver.propagation();
			monitor.worked(1);

			if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			
			monitor.beginTask("Searching for solutions", 1);
			solver.solutionSearch();
			monitor.worked(1);
			
			if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			
			if (retrieveExplanation) {
				monitor.beginTask("Trying to get an explanation", 1);
				solver.getExplanation();
				monitor.worked(1);
				
				if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			}
			
			if (solver.getResults().size() > 0) {
				monitor.beginTask("Presenting the results", 1);
				showResults(solver.getResults());
				monitor.worked(1);
			} 
			else {
				String message;
				
				if (solver.hasReachedLimit()) message = "No solutions were found during the maximum allowed search time.";
				else						  message = "There are no solutions for this deployment specification.";

				Display.getDefault().asyncExec(new Runnable() {
					public void run() {MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Result", message);}
				});
			}
		}
		catch (BasicConstraintsException e) {
			String constraintName = e.getConstraintName();
			String message = e.getExplanation();
			logger.info("Inconsistency found while processing constraint \"" + constraintName + "\"");
			logger.info("\""+ message + "\"");
			showMessageInUI(constraintName, message);
			resetView();
		}
	
		finally {
			long stop = System.currentTimeMillis();
			logger.info("Elapsed total time (in ms): " + (stop - start)) ;
		}
				
		return Status.OK_STATUS;
	}
		
	private void showMessageInUI(String constraintName, String explanation) {
		
		String title = "Specification inconsistency detected";
		String message = "Your specifications became inconsistent. A correct deployment cannot be generated.\n\n" + 
						 "Constraints: \"" + constraintName + "\"\n\n" +
						 explanation + "";
				
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), title, message);}
		});

	}
	
	private void resetView() {
		if (multiPageEditor != null) {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					multiPageEditor.resetView();
				}
			});
		}
	}
	
	/**
	 * Show the results in the UI
	 * 
	 * @param allResults
	 *            
	 */
	private void showResults(final ArrayList<Result> allResults) {		
		
		detailedResultsViewUiModel.setNewResultsList(allResults);
		detailedResultsViewUiModel.indexToDrawProperty().set(0);
	
		if (multiPageEditor != null) {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {	multiPageEditor.setActiveResultPage();	}
			});
		}
		
	}

	/**
	 * Sets the maximum number of solution.
	 * @param maxSolutions
	 */
	public void setMaxSolutions(int maxSolutions) {
		solver.setSolverMaxSolutions(maxSolutions);
	}

	/**
	 * Sets the searching mode. See {@link SolutionGenerator.KindOfSolutions}
	 * @param kindOfSolutions
	 */
	public void setKindOfSolutions(SearchType searchStrategy) {
		solver.setSolverSearchStrategy(searchStrategy);
	}

	/**
	 * Sets the maximum time for the search in advanced mode.
	 * @param maxTimeOfCalculationInmsec
	 */
	public void setMaxTimeOfCalculationInmsec(long maxTimeOfCalculationInmsec) {
		solver.setSolverTimeLimit(maxTimeOfCalculationInmsec);
	}

	/**
	 * @return the newMappingResults
	 */
	public ArrayList<Result> getNewMappingResults() {
		return solver.getResults();
	}
	
	public void setRetrieveExplanation(boolean value) {
		retrieveExplanation = value;
	}
	
	
}
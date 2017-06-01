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

import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class GuiSolverJob extends Job {

	private AssistSolver assistSolver;

	private DetailedResultsViewUiModel detailedResultsViewUiModel;
		
	private MultiPageEditor multiPageEditor;
	
	private Logger logger;
	
	public GuiSolverJob(String name, URI uri) {
		super(name);
		this.logger = LoggerFactory.getLogger(GuiSolverJob.class);
		
		/* Retrieve the ASSIST model from the URI and load on demand */ 
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		AssistModel inputModel = (AssistModel) resource.getContents().get(0);

		logger.debug("Loaded AssistModel from URI " + uri.toString());
		
		/* Now we can create the AssistSolver */
		this.assistSolver = new AssistSolver(inputModel);
	}
			
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			monitor.beginTask("Solver initialization", 1);
			assistSolver.runInitialization();
			monitor.worked(1);
			
			monitor.beginTask("Generating all constraints", 1);
			assistSolver.runConstraintGeneration();
			monitor.worked(1);

			if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			
			monitor.beginTask("Searching for solutions", 1);
			assistSolver.runSolutionSearch();
			monitor.worked(1);
			
			if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			
			if (assistSolver.getResults().size() > 0) {
				monitor.beginTask("Presenting the results", 1);
				showResults(assistSolver.getResults());
				monitor.worked(1);
			} 
			else {
				String message;
				
				if (assistSolver.hasReachedLimit()) message = "No solutions were found during the maximum allowed search time.";
				else						  		message = "There are no solutions for this deployment specification.";
				
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Result", message);}
				});
				
				detailedResultsViewUiModel.indexToDrawProperty().set(-1);
				
				
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
				public void run() {	multiPageEditor.resetView(); }
			});
		}
	}
	
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

	public void	setMaxSolutions(int maxSolutions) 			 { assistSolver.setSolverMaxSolutions(maxSolutions); 		}
	public void	setSearchStrategy(SearchType searchStrategy) { assistSolver.setSolverSearchStrategy(searchStrategy);	}
	public void setMaxSearchTime(long maxTimeInmsec) 		 { assistSolver.setSolverTimeLimit(maxTimeInmsec); 			}
	public void setSavePartialSolution(boolean value)		 { assistSolver.setSavePartialSolution(value);    			}
	
	public ArrayList<Result> getNewMappingResults()			 { return assistSolver.getResults();						}
}
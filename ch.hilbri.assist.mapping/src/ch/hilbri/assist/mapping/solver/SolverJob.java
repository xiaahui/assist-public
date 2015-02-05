package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.chocosolver.solver.Settings;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.explanations.RecorderExplanationEngine;
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping;
import org.chocosolver.solver.search.loop.monitors.SMF;
import org.chocosolver.solver.search.solution.AllSolutionsRecorder;
import org.chocosolver.solver.search.strategy.ISF;
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
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.constraints.AllApplicationThreadsOnSameBoard;
import ch.hilbri.assist.mapping.solver.constraints.ApplicationProximityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.CoreUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DesignAssuranceLevelConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DissimilarityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.IOAdapterConstraint;
import ch.hilbri.assist.mapping.solver.constraints.NetworkConstraints;
import ch.hilbri.assist.mapping.solver.constraints.NoPermutationsConstraint;
import ch.hilbri.assist.mapping.solver.constraints.RAMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.ROMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.RestrictedDeploymentConstraint;
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class SolverJob extends Job {

	private AssistModel model;
	
	private Solver solver;
	
	private AllSolutionsRecorder recorder;

	private SolverVariablesContainer solverVariables;
	
	private ArrayList<AbstractMappingConstraint> mappingConstraintsList;

	private DetailedResultsViewUiModel detailedResultsViewUiModel;
		
	private MultiPageEditor multiPageEditor;
	
	private Logger logger;
	
	 /*
	 * Dieser Wert definiert eine maximale Anzahl an Deployments, die
	 * gesucht werden. Falls die Grenze ueberschritten wird, wird die
	 * Suche abgebrochen. Dann kann es sein, dass noch weitere Loesungen
	 * vorhanden sind, aber nicht gefunden worden sind.
	 */
	private int maxSolutions;
	

	/*
	 * Gibt an, welche Art der Suche verwendet werden soll:
	 * RANDOM: 		sucht zufaellig im gesamten Loesungsraum
	 * 		   		(Vorteil: Loesungen stammen aus allen Teilen des Loesungsraums)
	 * CONSECUTIVE: sucht "hintereiander" liegende Loesungen
	 * 				(Vorteil: Es kann eindeutig bestimmt werden, ob alle moeglichen Loesungen gefunden wurden)
	 */
	private SearchType searchStrategy;

	/*
	 * Im Advances Mode gibt dies die maximale Suchzeit an, da nicht
	 * festgestellt werden kann, ob alle existierenden Loesungen gefunden wurden.
	 */
	private long maxTimeOfCalculationInmsec;  // in msec
	
	
	private ArrayList<Result> mappingResults;

	
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param model
	 * @param editor 
	 */
	@SuppressWarnings("serial")
	public SolverJob(String name, AssistModel model, MultiPageEditor editor) {
		super(name);
		this.model = model;
		this.logger = LoggerFactory.getLogger(SolverJob.class);


		if (editor != null) {
			multiPageEditor = editor;
			detailedResultsViewUiModel = multiPageEditor.getDetailedResultViewUiModel();
			detailedResultsViewUiModel.setEditor(multiPageEditor);
		}

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>();  
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>();
		
		/* Create a new Solver object */
		this.solver = new Solver();
		this.solver.set(new Settings(){ public boolean enablePropagatorInExplanation() { return true; }});
		
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver);
		solver.set(recorder);
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(this.model, solver);
		
		/* Create a new Constraint to process the system hierarchy */
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables));
		
		/* Create a new constraint to keep the capacity of the cores */
		this.mappingConstraintsList.add(new CoreUtilizationConstraint(model, solver, solverVariables));

		/* Create a new set of constraints to watch for the RAM capacity of the boards */
		this.mappingConstraintsList.add(new RAMUtilizationConstraint(model, solver, solverVariables));
		
		/* Create a new set of constraints to watch for the ROM capacity of the boards */
		this.mappingConstraintsList.add(new ROMUtilizationConstraint(model, solver, solverVariables));
		
		/* Create a new constraint to avoid permuting solutions */
		this.mappingConstraintsList.add(new NoPermutationsConstraint(model, solver, solverVariables));

		/* Create a new Constraint to keep threads of the same application on the same board. */
		this.mappingConstraintsList.add(new AllApplicationThreadsOnSameBoard(model, solver, solverVariables));
		
		/* Create a new Constraint for all i/o adapters (exclusive, shared, protection level, ...) */
		this.mappingConstraintsList.add(new IOAdapterConstraint(model, solver, solverVariables));
		
		/* Create a new Constraint for the design assurance level compatibility of boards and threads */
		this.mappingConstraintsList.add(new DesignAssuranceLevelConstraint(model, solver, solverVariables));
		
		/* Create a new constraint that restricts the applications to their specified hardware elements */
		this.mappingConstraintsList.add(new RestrictedDeploymentConstraint(model, solver, solverVariables));
		
		/* Create a new constraint to restrictions on the proximity of the applications */
		this.mappingConstraintsList.add(new ApplicationProximityConstraint(model, solver, solverVariables));
		
		/* Create a new constraint to obey the dislocality requirements */
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables));

		/* Create a new constraint to obey the dissimilarity requirements */
		this.mappingConstraintsList.add(new DissimilarityConstraint(model, solver, solverVariables));
		
		/* Create a new constraint to take care of the deployment of communication relations to networks between boards */
		this.mappingConstraintsList.add(new NetworkConstraints(model, solver, solverVariables));
	}

	
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {

		long start = System.currentTimeMillis();
		logger.info("---------------------------------------------------------");
		logger.info("Starting a new solver run");
		
		// Set the time limits, solution limits and the search strategy
		configureSolver();
		
		try {
			// Generate and propagate all constraints 
			for (AbstractMappingConstraint constraint : mappingConstraintsList) {
				monitor.beginTask("Processing constraint: \""	+ constraint.getName() + "\"", mappingConstraintsList.size());
				
				constraint.generate();
				
				logger.info("Constraint \"" + constraint.getName() + "\" successfully generated");
				monitor.worked(1);
			};
			
			// Search for a solution
			monitor.beginTask("Searching for solutions", 1);
			solver.findAllSolutions();
			logger.info("Solutions found: " + recorder.getSolutions().size());
			
			if (solver.hasReachedLimit())
				logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)");
			
			monitor.worked(1);
			
			// Did we find a solution? If not, then turn on the explanations ...
			if (recorder.getSolutions().size() == 0) {
				logger.info("No solution found, trying to get an explanation");
				
				solver.getSearchLoop().reset();
				solver.getEngine().flush();
				
				// Conflicts explained
				solver.set(new RecorderExplanationEngine(solver));
				ConflictBasedBackjumping cbj = new ConflictBasedBackjumping(solver.getExplainer());
				cbj.activeUserExplanation(true);
				solver.findSolution();
				
				logger.debug("Solver contents: ");
				logger.debug(solver.toString());
				
				logger.info("Explanation:");
				logger.info(cbj.getUserExplanation().toString());		
			}
			
			// Create the results 
			monitor.beginTask("Creating results", 1);
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions());
			logger.info("Results created: " + mappingResults.size());
			monitor.worked(1);
			
			// Present the results 
			monitor.beginTask("Presenting the results", 1);
			logger.info("Presenting the results");
			showResults(mappingResults);
			monitor.worked(1);
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
	
	
	public void configureSolver() {
		logger.info("Setting time limit to " + this.maxTimeOfCalculationInmsec + "ms");
		SMF.limitTime(solver, this.maxTimeOfCalculationInmsec);
		
		logger.info("Setting max solutions limit to " + this.maxSolutions);
		SMF.limitSolution(solver, this.maxSolutions);
		
		if (this.searchStrategy == SearchType.CONSECUTIVE) {
			logger.info("Setting search strategy to minDomainSize + minValue");
			solver.set(ISF.custom(ISF.minDomainSize_var_selector(),
								  ISF.min_value_selector(),
								  solverVariables.getLocationVariables()));
		}
	}
		
	private void showMessageInUI(String constraintName, String explanation) {
		
		String title = "Specification inconsistency detected";
		String message = "Your specifications became inconsistent. A correct deployment cannot be generated.\n\n" + 
						 "Constraints: \"" + constraintName + "\"\n\n" +
						 "Explanation: " + explanation + "";
				
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
		this.maxSolutions = maxSolutions;
	}

	/**
	 * Sets the searching mode. See {@link SolutionGenerator.KindOfSolutions}
	 * @param kindOfSolutions
	 */
	public void setKindOfSolutions(SearchType kindOfSolutions) {
		this.searchStrategy = kindOfSolutions;
	}

	/**
	 * Sets the maximum time for the search in advanced mode.
	 * @param maxTimeOfCalculationInmsec
	 */
	public void setMaxTimeOfCalculationInmsec(long maxTimeOfCalculationInmsec) {
		this.maxTimeOfCalculationInmsec = maxTimeOfCalculationInmsec;
	}

	/**
	 * @return the newMappingResults
	 */
	public ArrayList<Result> getNewMappingResults() {
		return mappingResults;
	}
	
}
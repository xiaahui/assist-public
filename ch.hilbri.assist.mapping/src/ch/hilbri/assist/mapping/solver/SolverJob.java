package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.chocosolver.solver.Settings;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.exception.ContradictionException;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
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
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class SolverJob extends Job {

	private AssistModel model;
	
	private Solver solver;

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
	private SearchType kindOfSolutions;

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
		
		Settings solverSettings = new Settings(){ 
			private static final long serialVersionUID = 4291880025846224054L;
			public boolean enablePropagatorInExplanation() { return true; }
		};
		solver.set(solverSettings);

		
		
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
		return execute(monitor, true);
	}
	
	/* Die Funktionalitaet der RUN-Methode wurde ausgelagert, um den Zugang fuer einen Test zu ermoeglichen */
	public IStatus execute(IProgressMonitor monitor, boolean presentResults) 
	{
				
		monitor.beginTask("Generating all mappings", 1);

		for (AbstractMappingConstraint constraint : mappingConstraintsList) {

			if (monitor.isCanceled()) return Status.CANCEL_STATUS;
			monitor.subTask("Processing constraint: \""	+ constraint.getName() + "\"");
			
			/* Generate this constraint */
			constraint.generate();
			
			boolean contradiction = false;
			
			try {
				solver.propagate();
			} catch (ContradictionException e) {
				contradiction = true;
				final String constraintName = constraint.getName();
				
				Display.getDefault().asyncExec(new Runnable() {

					public void run() {
						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						MessageDialog.openError(activeShell,
										"Specification inconsistencies",
										"Your specifications have been inconsistent.\n"
												+ "I was unable to generate a valid solution.\n\n"
												+ "Here is the last set of constraints which failed to propagate:\n\n"
												+ ">" + constraintName + "<");
					}
				});
			}
			
			if (contradiction) {
				if (multiPageEditor != null) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {	multiPageEditor.resetView(); }
					});
				}
				return Status.CANCEL_STATUS;
			}

			else monitor.worked(1);
		}

		
		monitor.subTask("Searching for solutions");
		if (runSearchForSolutions(monitor) != Status.OK_STATUS) return Status.CANCEL_STATUS;
		monitor.worked(1);
		 
		if (presentResults == true) { 
			 monitor.subTask("Showing results");
			 showResults(mappingResults);
			 monitor.worked(1);
		}
		 
		return Status.OK_STATUS;
	}
	
	private IStatus runSearchForSolutions(IProgressMonitor monitor) {
		
		logger.debug("Searching for solutions");
		
		AllSolutionsRecorder recorder = new AllSolutionsRecorder(solver);
		solver.set(recorder);
		
		if (this.kindOfSolutions == SearchType.CONSECUTIVE) {
			
			SMF.limitSolution(solver, this.maxSolutions);
			SMF.limitTime(solver, 60 * 60 * 1000 * 4); // 4h max runtime

			solver.set(ISF.custom(ISF.minDomainSize_var_selector(),
								  ISF.randomBound_value_selector(System.currentTimeMillis()),
								  solverVariables.getAllVariables()));
		}

		else {
			// FIXME: Implement me!
			SMF.limitTime(solver, this.maxTimeOfCalculationInmsec);
			return null;
		}
		
		
		solver.findAllSolutions();
		logger.debug(recorder.getSolutions().size() + " solutions found");
		
		mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions());
		
		
		
		// If the search was not successful, we try to get a trace 
		// from the solver ...
		if (recorder.getSolutions().size() == 0) {
			solver.getSearchLoop().reset();
			solver.getEngine().flush();
			
			// Conflicts explained
			RecorderExplanationEngine ree = new RecorderExplanationEngine(solver); 
			solver.set(ree);
			ConflictBasedBackjumping cbj = new ConflictBasedBackjumping(solver.getExplainer());
			cbj.activeUserExplanation(true);
			solver.findSolution();
			
			ConsoleCommands.writeLineToConsole(solver.toString());
			ConsoleCommands.writeLineToConsole("");
			ConsoleCommands.writeLineToConsole(cbj.getUserExplanation().toString());		
		}

		
		
		
		return Status.OK_STATUS;
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
		this.kindOfSolutions = kindOfSolutions;
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
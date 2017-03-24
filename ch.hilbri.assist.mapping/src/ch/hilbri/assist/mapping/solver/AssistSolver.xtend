package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.PartialSolutionSaveMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.preprocessors.CreateMissingThreads
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy
import org.chocosolver.solver.variables.IntVar
import org.eclipse.core.runtime.Platform
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AssistSolver {
	
	private AssistModel 							model
	private Solver 									solver
//	private AllSolutionsRecorder 					recorder
	private SolverVariablesContainer 				solverVariables
	private ArrayList<AbstractMappingConstraint> 	mappingConstraintsList
	private ArrayList<Result> 						mappingResults
	private ArrayList<AbstractModelPreprocessor> 	modelPreprocessors
	private Logger 									logger
	private boolean 								savePartialSolution 		= false
	private PartialSolutionSaveMonitor 				partialSolutionSaveMonitor
	
	new (AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		logger.info('''******************************''')
		logger.info(''' Executing a new AssistSolver''')
		logger.info('''******************************''')
		
		if (Platform.getBundle("ch.hilbri.assist.application") != null) {
			logger.info('''    Version : «Platform.getBundle("ch.hilbri.assist.application").getHeaders().get("Bundle-Version")» ''')
			logger.info('''    Platform: «System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit"»''')
			logger.info('''******************************''')
		}
			
		/* Get the model */
		this.model = model

		/* Create all preprocessors */
		this.modelPreprocessors = new ArrayList
		this.modelPreprocessors.add(new CreateMissingThreads(model))
		// FIXME: add board local networks
					
		/* Create a new Solver object */
//		this.solver = new Solver()
		
		/* Create a new recorder for our solutions */
//		this.recorder = new AllSolutionsRecorder(solver)
//		this.solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(model, solver)
		
		/* Attach the search monitor */
//		this.solver.searchLoop.plugSearchMonitor(new DownBranchMonitor(solverVariables))
//		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
//		this.solver.searchLoop.plugSearchMonitor(new RestartMonitor)
	
		/* Create an empty set of constraints that will be used */
//		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
//		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new CoreUtilizationConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new RAMUtilizationConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new ROMUtilizationConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new NoPermutationsConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new AllApplicationThreadsOnSameBoard(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new IOAdapterConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new DesignAssuranceLevelConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new RestrictedDeploymentConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new ApplicationProximityConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new DissimilarityConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new NetworkConstraints(model, solver, solverVariables))
		
		
		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
	}

	def setSavePartialSolution(boolean value) {
		this.savePartialSolution = value
		
		if (value) {
			logger.info("Enabled saving of partial solutions if no solutions are found")
//			this.partialSolutionSaveMonitor = new PartialSolutionSaveMonitor(solver, solverVariables)
//			this.solver.searchLoop.plugSearchMonitor(partialSolutionSaveMonitor)		
		}
		else {
			logger.info("Disabled saving of partial solutions if no solutions are found")
		}		
	}

	def setSolverTimeLimit(long timeInMs) {
//		SMF.limitTime(solver, timeInMs);
		logger.info("Setting choco-solver search time limit to " + timeInMs + "ms");
	}
	
	def setSolverMaxSolutions(int maxSolutions) {
		logger.info("Setting choco-solver max solutions limit to " + maxSolutions);
//		SMF.limitSolution(solver, maxSolutions);
	}
	
	def setSolverSearchStrategy(SearchType strategy) {
		val List<AbstractStrategy<IntVar>> heuristics = new ArrayList<AbstractStrategy<IntVar>>
		val seed = 23432
		val vars = solverVariables.locationVariables
		
		logger.info("Setting choco-solver search strategy to '" + strategy.humanReadableName + "'")
		
//		switch (strategy) {
//			case SearchType.RANDOM: {
//				heuristics.add(ISF.custom(ISF.random_var_selector(0), ISF.random_value_selector(0), vars))
//			}
//			case SearchType.MIN_DOMAIN_FIRST: {
//				heuristics.add(ISF.minDom_LB(vars))
//			}
//			case SearchType.DOM_OVER_WDEG: {
//				val valueChooser = ISF.min_value_selector
//				heuristics.add(ISF.domOverWDeg(vars, seed, valueChooser))
//			}
//			case SearchType.ACTIVITY: {
//				heuristics.add(ISF.activity(vars, seed))
//				solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(solverVariables.getLocationVariables()))
//			}
//			case SearchType.IMPACT: { // possibly broken
//				heuristics.add(ISF.impact(vars, seed))
//			}
//		}
//		if (strategy != SearchType.ACTIVITY) {
//			solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(null))
//		}
//		solver.set(heuristics)
	}


	def runModelPreprocessors() {
		logger.info("Running pre-processors")
		for (p : this.modelPreprocessors) { 
			logger.info(" - Processing " + p.name)
			if (!p.execute) {
				logger.info('''      There is nothing to be done.''')
			}
		}
	}
	
	def propagation() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver")
		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
	            logger.info('''      No effective constraints found''')
            }
			logger.info('''   done.''')
		}
		val vars = solverVariables.locationVariables
		logger.info('''After initial propagation:''') 
		logger.info('''      «vars.filter[instantiated].size» / «vars.size» location variables instantiated''') 
	}
	
	def solutionSearch() throws BasicConstraintsException {

//		// Clear old results
//		mappingResults.clear
//		
//		logger.info("Initiating choco-solver - searching for a solution")
//		solver.findAllSolutions
//		
//		logger.info('''Solutions found: «recorder.solutions.size»''') 
//		
//		logger.info('''Internal solver statistics: «solver.measures.toOneLineString»''')
//			
//		if (solver.hasReachedLimit)
//			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")
//
//		// Did we find a solution? 
//		if (recorder.solutions.size > 0) {
//			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
//			logger.info('''Results created:  «mappingResults.size»''')
//		} 
//		
//		// should we save a partial solution?
//		else if (savePartialSolution) {
//			mappingResults = ResultFactoryFromSolverSolutions.createPartialResult(model, solverVariables, partialSolutionSaveMonitor.partialSolution)			
//			logger.info('''Created �mappingResults.size� partial solution''')
//		} 
	}
	
	def ArrayList<Result> getResults() 	{ 
		mappingResults
	}
	def hasReachedLimit() 				{ 
//		solver.hasReachedLimit
		true
	}

	// the following methods are for the tests only
	def IntVar[] getLocationVariables() { 
		solverVariables.getLocationVariables()
	}
	def Solver getChocoSolver() 		{ 
		solver
	}
}

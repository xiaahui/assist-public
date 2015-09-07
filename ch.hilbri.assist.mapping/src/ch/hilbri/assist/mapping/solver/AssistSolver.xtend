package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.ConfigurablePinInterfaceTypeConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.ImprovedPairOfColocalitiesConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictInvalidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictValidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.DownBranchMonitor
import ch.hilbri.assist.mapping.solver.monitors.PartialSolutionSaveMonitor
import ch.hilbri.assist.mapping.solver.monitors.RestartMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupCombinations
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupDefinitions
import ch.hilbri.assist.mapping.solver.preprocessors.InvalidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.preprocessors.ValidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.strategies.FirstFailThenMaxRelationDegree
import ch.hilbri.assist.mapping.solver.strategies.HardestColocalitiesFirst
import ch.hilbri.assist.mapping.solver.strategies.HardestDislocalitiesFirst
import ch.hilbri.assist.mapping.solver.strategies.RDCWithShortestDistanceSelector
import ch.hilbri.assist.mapping.solver.strategies.ScarcestIoTypeFirst
import ch.hilbri.assist.mapping.solver.strategies.VariablesInMostDislocalityRelationsFirst
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.ResolutionPolicy
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy
import org.chocosolver.solver.variables.IntVar
import org.eclipse.core.runtime.Platform
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AssistSolver {
	
	private AssistModel model
	private Solver solver
	private AllSolutionsRecorder recorder
	private SolverVariablesContainer solverVariables
	private ArrayList<AbstractMappingConstraint> mappingConstraintsList
	private ArrayList<Result> mappingResults
	private int minimize
	private Logger logger
	private boolean savePartialSolution = false
	private PartialSolutionSaveMonitor partialSolutionSaveMonitor
	
	new (AssistModel model) {
		this(model, #[0], 0)
	}

	new (AssistModel model, List<Integer> locationVariableLvls, int minimize) {
		this.minimize = minimize - 1
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
		val modelPreprocessors = new ArrayList<AbstractModelPreprocessor> 
		modelPreprocessors.add(new EqInterfaceGroupDefinitions(model))
		modelPreprocessors.add(new EqInterfaceGroupCombinations(model))
		modelPreprocessors.add(new ValidDeploymentHardwareElements(model))
		modelPreprocessors.add(new InvalidDeploymentHardwareElements(model))
		
		/* Run all preprocessors */
		logger.info("Running pre-processors")
		for (p : modelPreprocessors) { 
			logger.info(" - Processing " + p.name)
			if (!p.execute) logger.info('''      There is nothing to be done.''')
		}
			
		/* Create a new Solver object */
		this.solver = new Solver()
				
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver)
		this.solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(model, solver, locationVariableLvls)
		
		/* The same solution should not be found twice */
		SMF.nogoodRecordingOnSolution(solverVariables.locationVariables)
		
		/* Attach the search monitors */
		this.solver.searchLoop.plugSearchMonitor(new DownBranchMonitor(solverVariables))
		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
		this.solver.searchLoop.plugSearchMonitor(new RestartMonitor)
		this.solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor())
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables, this.minimize >= 0))
		this.mappingConstraintsList.add(new ConfigurablePinInterfaceTypeConstraint(model, solver, solverVariables))				
		this.mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))

		// Bug: these constraints do not work with configurable interface types 
		// this.mappingConstraintsList.add(new ImprovedColocalitiesConstraint(model, solver, solverVariables))
		// this.mappingConstraintsList.add(new ImprovedPairOfColocalitiesConstraint(model, solver, solverVariables))
		
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
	}


	def setSavePartialSolution(boolean value) {
		this.savePartialSolution = value
		
		if (value) {
			logger.info("Enabled saving of partial solutions if no solutions are found")
			this.partialSolutionSaveMonitor = new PartialSolutionSaveMonitor(solver, solverVariables)
			this.solver.searchLoop.plugSearchMonitor(partialSolutionSaveMonitor)		
		}
		else {
			logger.info("Disabled saving of partial solutions if no solutions are found")
		}		
	}

	def setSolverTimeLimit(long timeInMs) {
		SMF.limitTime(solver, timeInMs);
		logger.info("Setting choco-solver search time limit to " + timeInMs + "ms");
	}
	
	def setSolverMaxSolutions(int maxSolutions) {
		logger.info("Setting choco-solver max solutions limit to " + maxSolutions);
		SMF.limitSolution(solver, maxSolutions);
	}
	
	def setSolverSearchStrategy(SearchType strategy) {
		val List<AbstractStrategy<IntVar>> heuristics = new ArrayList<AbstractStrategy<IntVar>>
		val seed = 12345
		val vars = solverVariables.locationVariables
		
		logger.info("Setting choco-solver search strategy to '" + strategy.humanReadableName + "'")
		
		switch (strategy) {
			
			case MIN_DOMAIN_FIRST_AND_SHORTEST_DISTANCE: {
				heuristics.add(ISF.custom(
									ISF.minDomainSize_var_selector, 
									new RDCWithShortestDistanceSelector(solverVariables, model), 
									vars))
			}
			
			case MIN_DOMAIN_FIRST_AND_RANDOM_CONNECTORS: {
				heuristics.add(ISF.custom(
									ISF.minDomainSize_var_selector, 
									ISF.random_value_selector(seed),
									vars))
			}
			
			case MIN_DOMAIN_FIRST_AND_MIN_VALUE_CONNECTORS: {
				heuristics.add(ISF.custom(
									ISF.minDomainSize_var_selector, 
									ISF.min_value_selector,
									vars))
			}
			
			case MAX_DEGREE_FIRST: {
				val selector = new FirstFailThenMaxRelationDegree(solverVariables, model)
				heuristics.add(ISF.custom(selector, selector, vars))				
			}
			
			case HARDEST_DISLOCALITIES_FIRST: {
				val selector = new HardestDislocalitiesFirst(solverVariables, model)
				heuristics.add(ISF.custom(selector, selector, vars))
			}

			case HARDEST_COLOCALITIES_FIRST: {
				val selector = new HardestColocalitiesFirst(solverVariables, model)
				heuristics.add(ISF.custom(selector, selector, vars))
			}

			case SCARCEST_IOTYPE_FIRST: {
				val selector = new ScarcestIoTypeFirst(solverVariables, model)
				heuristics.add(ISF.custom(selector, ISF.min_value_selector, vars))
			}

			case VARS_IN_MOST_DISLOC: {
				val selector = new VariablesInMostDislocalityRelationsFirst(solverVariables, model)
				heuristics.add(ISF.custom(selector, ISF.min_value_selector, vars))
			}
				
			case RANDOM_RANDOM: {
				heuristics.add(ISF.random_value(vars, seed))
			}
			
			case DOM_OVER_WDEG_MIN_VAL_FIRST: {
				heuristics.add(ISF.domOverWDeg(vars, seed, ISF.min_value_selector))	
			}
			
			case DOM_OVER_WDEG_MIN_VAL_FIRST_VER_1_3: {
				heuristics.add(ISF.domOverWDeg(vars, seed, ISF.min_value_selector))	
				for (c : this.mappingConstraintsList) {
					if (c instanceof ImprovedPairOfColocalitiesConstraint) 
						this.mappingConstraintsList.remove(c)
				}
			}

			case DOM_OVER_WDEG_MIN_VAL_FIRST_RESTARTS: {
				heuristics.add(ISF.domOverWDeg(vars, seed, ISF.min_value_selector))

//				val rm = new RestartManager( 
//											 new GeometricalRestartStrategy(8000, 1),   // 8000 Nodes each time 	
//                							 new NodeCounter(10000),       			    // Go to 10000 nodes max
//                							 solver.getSearchLoop(), 
//                							 40											// # Restarts
//                							)
//        		
//				solver.plugMonitor(rm)
			}

			
			case DOM_OVER_WDEG_CLOSEST_DISTANCE: {
				heuristics.add(ISF.domOverWDeg(vars, seed, new RDCWithShortestDistanceSelector(solverVariables, model)))	
			}
		
			case ACTIVITY: {
				heuristics.add(ISF.activity(vars, seed))
			}
//			case IMPACT: { // possibly broken
//				heuristics.add(ISF.impact(vars, seed))
//			}
			
		}
		
		solver.set(heuristics)
		
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
		val colocs = solverVariables.colocationVariables
		val vars = solverVariables.locationVariables
		logger.info('''After initial propagation:''') 
		logger.info('''      «vars.filter[instantiated].size» / «vars.size» location variables instantiated''') 
		logger.info('''      «colocs.filter[instantiated].size» / «colocs.size» colocation variables instantiated''') 
	}
	
	def solutionSearch() throws BasicConstraintsException {

		// Clear old results
		mappingResults.clear
		
		if (minimize >= 0) {
			if (minimize < 2) {
				val optVar = solverVariables.optimizationVariables.get(minimize)
				logger.info("Initiating choco-solver - searching for the optimal solution using " + optVar)
				solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, optVar)
			} else {
				logger.info("Initiating choco-solver - searching for the pareto optimal solutions")
				solver.findParetoFront(ResolutionPolicy.MINIMIZE, solverVariables.optimizationVariables)
			}
		} else {	
			logger.info("Initiating choco-solver - searching for a solution")
			solver.findAllSolutions
		}
		logger.info('''Solutions found: �recorder.solutions.size�''') 
		
		logger.info('''Internal solver statistics: �solver.measures.toOneLineString�''')
			
	}
	
	def createSolutions() {

		if (solver.hasReachedLimit)
			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

		// Did we find a solution? 
		if (recorder.solutions.size > 0) {
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
			logger.info('''Results created:  �mappingResults.size�''')
		} 
		
		// should we save a partial solution?
		else if (savePartialSolution) {
			mappingResults = ResultFactoryFromSolverSolutions.createPartialResult(model, solverVariables, partialSolutionSaveMonitor.partialSolution)			
			logger.info('''Created �mappingResults.size� partial solution with �mappingResults.get(0).mapping.keySet.size� mapped interfaces''')
		} 
	}


	def ArrayList<Result> getResults() 	{ mappingResults 			}
	def hasReachedLimit() 				{ solver.hasReachedLimit 	}

	// the following methods are for the tests only
	def IntVar[] getLocationVariables() { solverVariables.getLocationVariables(0) }
	def Solver getChocoSolver() 		{ solver }
}

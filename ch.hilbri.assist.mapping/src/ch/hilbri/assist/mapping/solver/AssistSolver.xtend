package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.InterfaceTypeConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictInvalidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictValidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.BacktrackingMonitor
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.strategies.FirstFailThenMaxRelationDegree
import ch.hilbri.assist.mapping.solver.strategies.HardestDislocalitiesFirst
import ch.hilbri.assist.mapping.solver.strategies.ScarcestIoTypeFirst
import ch.hilbri.assist.mapping.solver.strategies.VariablesInMostDislocalityRelationsFirst
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Settings
import org.chocosolver.solver.Solver
import org.chocosolver.solver.explanations.RecorderExplanationEngine
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupDefinitions
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupCombinations
import ch.hilbri.assist.mapping.solver.preprocessors.ValidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.preprocessors.InvalidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.monitors.DownBranchMonitor

class AssistSolver {
	
	private AssistModel model
	private Solver solver
	private AllSolutionsRecorder recorder
	private SolverVariablesContainer solverVariables
	private ArrayList<AbstractMappingConstraint> mappingConstraintsList
	private ArrayList<Result> mappingResults
	private ArrayList<AbstractModelPreprocessor> modelPreprocessors
	private Logger logger
	private int[] locationVariableLevels // do we work with just the LocVars on connector level or other levels as well?
	
	new (AssistModel model, int... locationVariableLevels) {
		this(model, locationVariableLevels as List<Integer>)
	}

	new (AssistModel model, List<Integer> locationVariableLevels) {
		this.logger = LoggerFactory.getLogger(this.class)
		logger.info(">>>> Creating a new AssistSolver instance <<<<")
		
		/* Get the model */
		this.model = model

		/* Create all preprocessors */
		this.modelPreprocessors = new ArrayList
		this.modelPreprocessors.add(new EqInterfaceGroupDefinitions(model))
		this.modelPreprocessors.add(new EqInterfaceGroupCombinations(model))
		this.modelPreprocessors.add(new ValidDeploymentHardwareElements(model))
		this.modelPreprocessors.add(new InvalidDeploymentHardwareElements(model))
			
		/* Create a new Solver object */
		this.solver = new Solver()
		
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(this.model, solver)

		/* Get the list of locationVariableLevels which will be used */
		this.locationVariableLevels = locationVariableLevels

		/* Attach the search monitor */
		this.solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(solver, solverVariables, recorder, locationVariableLevels))
		this.solver.searchLoop.plugSearchMonitor(new DownBranchMonitor(solver))
		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new InterfaceTypeConstraint(model, solver, solverVariables))				
		this.mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables, false))

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
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
	

	def setSolverTimeLimit(long timeInMs) {
		SMF.limitTime(solver, timeInMs);
		logger.info("Setting choco-solver search time limit to " + timeInMs + "ms");
	}
	
	def setSolverMaxSolutions(int maxSolutions) {
		logger.info("Setting choco-solver max solutions limit to " + maxSolutions);
		SMF.limitSolution(solver, maxSolutions);
	}
	
	def setSolverSearchStrategy(SearchType strategy) {
		var AbstractStrategy<IntVar> heuristic
		val seed = 23432
		val vars = solverVariables.getLocationVariables(locationVariableLevels)
		switch (strategy) {
			case SearchType.FIRST_FAIL: {
				heuristic = ISF.minDom_LB(vars)
			}
			case strategy == SearchType.FIRST_FAIL_MAX_DEGREE : {
				val selector = new FirstFailThenMaxRelationDegree(solverVariables, model, locationVariableLevels)
				this.solver.searchLoop.plugSearchMonitor(new BacktrackingMonitor)
				heuristic = ISF.custom(selector, selector, vars)				
			}
			case SearchType.HARDEST_DISLOC: {
				val selector = new HardestDislocalitiesFirst(solverVariables, model)
				heuristic = ISF.custom(selector, selector, vars)				
			}
			case SearchType.SCARCEST_TYPE: {
				val selector = new ScarcestIoTypeFirst(solverVariables, model)
				heuristic = ISF.custom(selector, ISF.min_value_selector, vars)	
			}
			case SearchType.VARS_IN_MOST_DISLOC: {
				val selector = new VariablesInMostDislocalityRelationsFirst(solverVariables, model)
				heuristic = ISF.custom(selector, ISF.min_value_selector, vars)				
			}
			case SearchType.DOM_OVER_WDEG: {
				heuristic = ISF.domOverWDeg(vars, seed)
			}
			case  strategy == SearchType.ACTIVITY || strategy == SearchType.DEFAULT  : 
			{
				heuristic = ISF.activity(vars, seed)
			}
			case SearchType.IMPACT: { // possibly broken
				heuristic = ISF.impact(vars, seed)
			}
			default: {
				logger.info("Unknown search strategy supplied")
			}
		}	
		logger.info("Setting choco-solver search strategy to: " + strategy.toString)
		solver.set(heuristic)
	}

	def propagation() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver");
		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "�constraint.name�"...''')
			if (!constraint.generate()) {
	            logger.info('''      No effective constraints found''')
            }
			logger.info('''   done.''')
		}
	}
	
	def solutionSearch() throws BasicConstraintsException {		
		logger.info("Initiating choco-solver - searching for a solution")
		solver.findAllSolutions
		logger.info('''Solutions found: �recorder.solutions.size�''') 
		
		logger.info('''Internal solver statistics: �solver.measures.toOneLineString�''')
		
			
		if (solver.hasReachedLimit)
			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

		// Did we find a solution? 
		if (recorder.solutions.size > 0) {
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
			logger.info('''Results created:  �mappingResults.size�''')
		} else {
			mappingResults.clear
		}
	}
	
	def getExplanation() {
		logger.info("Trying to get an explanation")
		solver.set(new Settings(){ public override boolean enablePropagatorInExplanation() { return true; }})
		solver.searchLoop.reset
		solver.engine.flush
				
		// Conflicts explained
		solver.set(new RecorderExplanationEngine(solver))
		val cbj = new ConflictBasedBackjumping(solver.getExplainer())
		cbj.activeUserExplanation(true)
		solver.findSolution
	
		logger.debug("Solver contents: ")
		logger.debug(solver.toString)

		if (cbj.getUserExplanation == null) {
			logger.info("No explanation available, because at least one solution was found.")
		} else {
			logger.info('''Explanation: >>�cbj.userExplanation.toString�<<''')
		}
	}

	def ArrayList<Result> getResults() 	{ mappingResults 			}
	def hasReachedLimit() 				{ solver.hasReachedLimit 	}
	def IntVar[] getLocationVariables() 	{ solverVariables.getLocationVariables(0) }
	
}
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
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.DownBranchMonitor
import ch.hilbri.assist.mapping.solver.monitors.RestartMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupCombinations
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupDefinitions
import ch.hilbri.assist.mapping.solver.preprocessors.InvalidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.preprocessors.ValidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.strategies.FirstFailThenMaxRelationDegree
import ch.hilbri.assist.mapping.solver.strategies.HardestDislocalitiesFirst
import ch.hilbri.assist.mapping.solver.strategies.ScarcestIoTypeFirst
import ch.hilbri.assist.mapping.solver.strategies.VariablesInMostDislocalityRelationsFirst
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.ResolutionPolicy
import org.chocosolver.solver.Settings
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.explanations.RecorderExplanationEngine
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping
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
	private ArrayList<AbstractModelPreprocessor> modelPreprocessors
	private boolean optimize = false
	private Logger logger
	private boolean colocsFirst
	
	new (AssistModel model, int... locationVariableLevels) {
		this(model, locationVariableLevels as List<Integer>, false, false)
	}

	new (AssistModel model, List<Integer> locationVariableLvls, boolean useCliquesInDislocalities, boolean colocsFirst) {
		this.colocsFirst = colocsFirst && !model.colocalityRelations.empty
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
		this.modelPreprocessors.add(new EqInterfaceGroupDefinitions(model))
		this.modelPreprocessors.add(new EqInterfaceGroupCombinations(model))
		this.modelPreprocessors.add(new ValidDeploymentHardwareElements(model))
		this.modelPreprocessors.add(new InvalidDeploymentHardwareElements(model))
			
		/* Create a new Solver object */
		this.solver = new Solver()
		
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver)
		this.solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(this.model, this.solver, locationVariableLvls)
		
		/* Attach the search monitor */
		this.solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(solver, solverVariables, recorder))
		this.solver.searchLoop.plugSearchMonitor(new DownBranchMonitor(solver, solverVariables))
		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
		this.solver.searchLoop.plugSearchMonitor(new RestartMonitor)
		
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new InterfaceTypeConstraint(model, solver, solverVariables))				
		this.mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables, useCliquesInDislocalities))

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
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
		val seed = 23432
		val colocs = solverVariables.colocationVariables
		val vars = solverVariables.locationVariables
		
		logger.info("Setting choco-solver search strategy to '" + strategy.humanReadableName + "'")
		
		switch (strategy) {
			case SearchType.RANDOM: {
				if (colocsFirst) heuristics.add(ISF.custom(ISF.random_var_selector(0), ISF.random_value_selector(0), colocs))
				heuristics.add(ISF.custom(ISF.random_var_selector(0), ISF.random_value_selector(0), vars))
			}
			case SearchType.MIN_DOMAIN_FIRST: {
				if (colocsFirst) heuristics.add(ISF.minDom_LB(colocs))
				heuristics.add(ISF.minDom_LB(vars))
			}
			case SearchType.MAX_DEGREE_FIRST: {
				val selector = new FirstFailThenMaxRelationDegree(solverVariables, model)
				if (colocsFirst) heuristics.add(ISF.custom(selector, selector, colocs))				
				heuristics.add(ISF.custom(selector, selector, vars))				
			}
			case SearchType.HARDEST_DISLOCALITIES_FIRST: {
				val selector = new HardestDislocalitiesFirst(solverVariables, model)
				if (colocsFirst) heuristics.add(ISF.custom(selector, selector, colocs))
				heuristics.add(ISF.custom(selector, selector, vars))
			}
			case SearchType.SCARCEST_IOTYPE_FIRST: {
				val selector = new ScarcestIoTypeFirst(solverVariables, model)
				if (colocsFirst) heuristics.add(ISF.custom(selector, ISF.min_value_selector, colocs))
				heuristics.add(ISF.custom(selector, ISF.min_value_selector, vars))
			}
			case SearchType.VARS_IN_MOST_DISLOC: {
				val selector = new VariablesInMostDislocalityRelationsFirst(solverVariables, model)
				if (colocsFirst) heuristics.add(ISF.custom(selector, ISF.min_value_selector, colocs))
				heuristics.add(ISF.custom(selector, ISF.min_value_selector, vars))
			}
			case SearchType.DOM_OVER_WDEG: {
				if (colocsFirst) heuristics.add(ISF.domOverWDeg(colocs, seed))
				heuristics.add(ISF.domOverWDeg(vars, seed))
			}
			case SearchType.ACTIVITY: {
				if (colocsFirst) heuristics.add(ISF.activity(colocs, seed))
				heuristics.add(ISF.activity(vars, seed))
			}
			case SearchType.IMPACT: { // possibly broken
				if (colocsFirst) heuristics.add(ISF.impact(colocs, seed))
				heuristics.add(ISF.impact(vars, seed))
			}
		}	
		
		solver.set(heuristics)		
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
		logger.info("Starting to generate constraints for the choco-solver");
		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
	            logger.info('''      No effective constraints found''')
            }
			logger.info('''   done.''')
		}
	}
	
	def solutionSearch() throws BasicConstraintsException {
		if (optimize) {
			val optVar = solverVariables.optimizationVariable
			solver.post(ICF.atmost_nvalues(solverVariables.getLocationVariables(1), optVar, false))
			logger.info("Initiating choco-solver - searching for the optimal solution using " + optVar)
			solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, optVar)
		} else {	
			logger.info("Initiating choco-solver - searching for a solution")
			solver.findAllSolutions
		}
		logger.info('''Solutions found: «recorder.solutions.size»''') 
		
		logger.info('''Internal solver statistics: «solver.measures.toOneLineString»''')
		
			
		if (solver.hasReachedLimit)
			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

		// Did we find a solution? 
		if (recorder.solutions.size > 0) {
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
			logger.info('''Results created:  «mappingResults.size»''')
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
			logger.info('''Explanation: >>«cbj.userExplanation.toString»<<''')
		}
	}

	def ArrayList<Result> getResults() 	{ mappingResults 			}
	def hasReachedLimit() 				{ solver.hasReachedLimit 	}

	// the following methods are for the tests only
	def IntVar[] getLocationVariables() { solverVariables.getLocationVariables(0) }
	def Solver getChocoSolver() 		{ solver }
}

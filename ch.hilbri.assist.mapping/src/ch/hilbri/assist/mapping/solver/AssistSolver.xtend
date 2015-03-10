package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.InterfaceTypeConstraint
import ch.hilbri.assist.mapping.solver.constraints.OneRouteForEachConnector
import ch.hilbri.assist.mapping.solver.constraints.RestrictInvalidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictValidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.BacktrackingMonitor
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.strategies.FirstFailWithProgressionOutput
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Settings
import org.chocosolver.solver.Solver
import org.chocosolver.solver.explanations.RecorderExplanationEngine
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AssistSolver {
	
	private AssistModel model
	private Solver solver
	private AllSolutionsRecorder recorder
	private SolverVariablesContainer solverVariables
	private ArrayList<AbstractMappingConstraint> mappingConstraintsList
	private ArrayList<Result> mappingResults
	private Logger logger
	
	new (AssistModel model) {
		this.model = model
		this.logger = LoggerFactory.getLogger(this.class)

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		
		/* Create a new Solver object */
		this.solver = new Solver()
		
		/* Attach the search monitor */
		this.solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor)
		this.solver.searchLoop.plugSearchMonitor(new BacktrackingMonitor)
		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
		
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(this.model, solver)
		
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new InterfaceTypeConstraint(model, solver, solverVariables))				
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new OneRouteForEachConnector(model, solver, solverVariables))
		this.mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))

		/* Create a new constraint that restricts the applications to their specified hardware elements */
//		this.mappingConstraintsList.add(new RestrictedDeploymentConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to restrictions on the proximity of the applications */
//		this.mappingConstraintsList.add(new ApplicationProximityConstraint(model, solver, solverVariables))
		

		/* Create a new constraint to obey the dissimilarity requirements */
//		this.mappingConstraintsList.add(new DissimilarityConstraint(model, solver, solverVariables))
		
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
		if (strategy == SearchType.CONSECUTIVE) {
			logger.info("Setting choco-solver search strategy to minDomainSize + minValue")
			solver.set(ISF.custom(new FirstFailWithProgressionOutput(solverVariables, model),
								  ISF.min_value_selector,
								  solverVariables.getLocationVariables))
		} else
			logger.info("Unknown search strategy supplied")
	}

	def propagation() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver");
		for (constraint : mappingConstraintsList) {
			logger.info('''Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
	            logger.info(''' no effective constraints found''')
            }
			logger.info('''done.''')
		}
	}
	
	def solutionSearch() throws BasicConstraintsException {		
		logger.info("Initiating choco-solver - searching for a solution")
		solver.findAllSolutions
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
	
}
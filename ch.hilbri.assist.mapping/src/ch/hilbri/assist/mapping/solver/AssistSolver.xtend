package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.AllApplicationThreadsOnSameBoard
import ch.hilbri.assist.mapping.solver.constraints.ApplicationProximityConstraint
import ch.hilbri.assist.mapping.solver.constraints.CoreUtilizationConstraint
import ch.hilbri.assist.mapping.solver.constraints.DesignAssuranceLevelConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.DissimilarityConstraint
import ch.hilbri.assist.mapping.solver.constraints.IOAdapterConstraint
import ch.hilbri.assist.mapping.solver.constraints.NetworkConstraints
import ch.hilbri.assist.mapping.solver.constraints.NoPermutationsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RAMUtilizationConstraint
import ch.hilbri.assist.mapping.solver.constraints.ROMUtilizationConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictedDeploymentConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.BacktrackingMonitor
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
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor

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
		
		/* Create a new Constraint to process the system hierarchy */
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to keep the capacity of the cores */
		this.mappingConstraintsList.add(new CoreUtilizationConstraint(model, solver, solverVariables))

		/* Create a new set of constraints to watch for the RAM capacity of the boards */
		this.mappingConstraintsList.add(new RAMUtilizationConstraint(model, solver, solverVariables))
		
		/* Create a new set of constraints to watch for the ROM capacity of the boards */
		this.mappingConstraintsList.add(new ROMUtilizationConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to avoid permuting solutions */
		this.mappingConstraintsList.add(new NoPermutationsConstraint(model, solver, solverVariables))

		/* Create a new Constraint to keep threads of the same application on the same board. */
		this.mappingConstraintsList.add(new AllApplicationThreadsOnSameBoard(model, solver, solverVariables))
		
		/* Create a new Constraint for all i/o adapters (exclusive, shared, protection level, ...) */
		this.mappingConstraintsList.add(new IOAdapterConstraint(model, solver, solverVariables))
		
		/* Create a new Constraint for the design assurance level compatibility of boards and threads */
		this.mappingConstraintsList.add(new DesignAssuranceLevelConstraint(model, solver, solverVariables))
		
		/* Create a new constraint that restricts the applications to their specified hardware elements */
		this.mappingConstraintsList.add(new RestrictedDeploymentConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to restrictions on the proximity of the applications */
		this.mappingConstraintsList.add(new ApplicationProximityConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to obey the dislocality requirements */
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))

		/* Create a new constraint to obey the dissimilarity requirements */
		this.mappingConstraintsList.add(new DissimilarityConstraint(model, solver, solverVariables))
		
		/* Create a new constraint to take care of the deployment of communication relations to networks between boards */
		this.mappingConstraintsList.add(new NetworkConstraints(model, solver, solverVariables))
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
			constraint.generate();
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
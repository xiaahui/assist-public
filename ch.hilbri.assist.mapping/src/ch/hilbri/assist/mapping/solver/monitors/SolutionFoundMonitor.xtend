package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SolutionFoundMonitor implements IMonitorSolution {
	
	private AllSolutionsRecorder recorder
	private Logger logger
	private Solver solver
	private SolverVariablesContainer solverVariables
	private int[] locationVariableLevels
	
	new(Solver solver, SolverVariablesContainer solverVariables, AllSolutionsRecorder recorder, int[] locationVariableLevels) {
		this.logger = LoggerFactory.getLogger(this.class)
		
		this.solver = solver
		this.solverVariables = solverVariables
		this.recorder = recorder
		this.locationVariableLevels = locationVariableLevels
	}
	
	override onSolution() {
		logger.info("Solution found.")
		
		// This solution is now forbidden in order to allow strategies and heuristics with a restart policy
		// what are our solution variables?
		val vars = solverVariables.getLocationVariables(locationVariableLevels)

		// what are the (last found) solutions for these variables?		
		val tuples = new Tuples(false)
		tuples.add(vars.map[recorder.lastSolution.getIntVal(it)])
		
		// post a constraint to forbid this solutions during a restart
		solver.post(ICF.table(vars, tuples, "FC")) // FC was the only algo working properly
	}
	
}
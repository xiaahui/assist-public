package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	private Solver solver
	private IntVar[] locationVariables
	private Logger logger
	private int bestProgress = 0
	
	new(Solver solver, SolverVariablesContainer solverVariables) {
		this.solver = solver
		this.locationVariables = solverVariables.locationVariables
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	def calculateProgress() {
		val currentProgress = locationVariables.filter[instantiated].size * 100 / locationVariables.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgress - bestProgress) >= 1) {
			logger.info('''Best solution so far: «String::format("%3d", currentProgress)»% of all variables are instantiated''')
			bestProgress = currentProgress
		}	
	}
	
	override afterDownLeftBranch() {
		calculateProgress
	}
	
	override afterDownRightBranch() {
		calculateProgress
	}
	
	override beforeDownLeftBranch() {
	}
	
	override beforeDownRightBranch() {
	}
	
}
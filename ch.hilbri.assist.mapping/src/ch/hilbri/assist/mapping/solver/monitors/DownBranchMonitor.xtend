package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	private SolverVariablesContainer solverVariables
	private IntVar[] locationVariables
	private Logger logger
	private int bestProgress = 0
	
	new(SolverVariablesContainer solverVariables) {
		this.solverVariables = solverVariables
		this.locationVariables = solverVariables.locationVariables
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	def calculateProgress() {
		val currentProgress = locationVariables.filter[instantiated].size * 100 / locationVariables.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgress - bestProgress) >= 1) {
			val colocProgress = solverVariables.colocationVariables.filter[instantiated].size * 100 / solverVariables.colocationVariables.length
			logger.info('''Solution so far: «String::format("%3d", currentProgress)»% of all location variables and «String::format("%3d", colocProgress)»% of the colocation variables are instantiated''')
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
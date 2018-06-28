package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	IntVar[] locationVariables
	Logger logger
	int bestProgress = 0
	
	new(SolverVariablesContainer solverVariables) {
		this.locationVariables = solverVariables.locationVariablesForCoreLevel
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	def calculateProgress() {
		val currentProgress = locationVariables.filter[instantiated].size * 100 / locationVariables.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgress - bestProgress) >= 1) {
			logger.info('''Search progress: «String::format("%3d", currentProgress)»% of all location variables are instantiated''')
			bestProgress = currentProgress
		}	
	}
	
	
}
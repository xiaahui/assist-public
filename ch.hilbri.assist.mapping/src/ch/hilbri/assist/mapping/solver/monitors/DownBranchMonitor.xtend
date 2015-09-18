package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class DownBranchMonitor implements IMonitorDownBranch {
	
	private SolverVariablesContainer solverVariables
	private IntVar[] locationVariables
	private Logger logger
	private int bestProgress = 0
	
	new(SolverVariablesContainer p_solverVariables) {
		solverVariables = p_solverVariables
		locationVariables = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN)
		logger = LoggerFactory.getLogger(this.class)
	}
	
	def calculateProgress() {
		val instantiatedVarCount = locationVariables.filter[instantiated].size 
		val currentProgress = instantiatedVarCount * 100 / locationVariables.length
		
		/* Only report progress if it actually changes by at least 1% */
		if (Math.abs(currentProgress - bestProgress) >= 1) {
			logger.info('''Search progress: «String::format("%4d", instantiatedVarCount)» (= «currentProgress»%) of all location variables are mapped without violating any specification''')
			bestProgress = currentProgress
		}	
	}
	
	override afterDownLeftBranch() {
	}
	
	override afterDownRightBranch() {
	}
	
	override beforeDownLeftBranch() {
		calculateProgress
	}
	
	override beforeDownRightBranch() {
	}
	
}
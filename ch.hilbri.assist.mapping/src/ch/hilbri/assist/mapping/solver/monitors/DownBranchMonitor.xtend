package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DownBranchMonitor implements IMonitorDownBranch {
	
	private Solver solver
	private Logger logger
	
	new(Solver solver) {
		this.solver = solver
		this.logger = LoggerFactory.getLogger(this.class) 
	}
	
	override afterDownLeftBranch() {
		val currentProgress = solver.vars.filter[instantiated].size * 100 / solver.vars.size
		logger.info('''Search progress:	«String::format("%3d", currentProgress)»% of all variables are instantiated''')
	}
	
	override afterDownRightBranch() {
		val currentProgress = solver.vars.filter[instantiated].size * 100 / solver.vars.size
		logger.info('''Search progress:	«String::format("%3d", currentProgress)»% of all variables are instantiated''')
	}
	
	override beforeDownLeftBranch() {
	}
	
	override beforeDownRightBranch() {
	}
	
}
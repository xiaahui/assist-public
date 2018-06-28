package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorUpBranch
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class BacktrackingMonitor implements IMonitorUpBranch {
	
	Logger logger
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class) 
	}
	
	override afterUpBranch() {
		logger.debug('''Backtracking''')
	}
	
	override beforeUpBranch() {
		
	}
	
}
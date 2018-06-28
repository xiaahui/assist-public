package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorSolution
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SolutionFoundMonitor implements IMonitorSolution {
	
	Logger logger
	int counter = 1 
	
	new() {
		logger = LoggerFactory.getLogger(this.class)
	}
	
	override onSolution() {
		logger.info('''Solution «counter++» found.''')
	}
	
}
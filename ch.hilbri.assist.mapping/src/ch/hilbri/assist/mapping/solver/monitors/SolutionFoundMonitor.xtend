package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorSolution
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SolutionFoundMonitor implements IMonitorSolution {
	
	private Logger logger
	private int counter
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class)
		this.counter = 1
	}
	
	override onSolution() {
		logger.info('''Solution «counter» found.''')
		counter++
	}
	
}
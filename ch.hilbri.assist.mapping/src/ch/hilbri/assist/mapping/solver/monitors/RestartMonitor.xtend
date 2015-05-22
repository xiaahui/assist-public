package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorRestart
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class RestartMonitor implements IMonitorRestart {
	
	private Logger logger
	private int counter
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class)
		this.counter = 1
	}
	
	override afterRestart() {
		logger.info('''Triggering the «counter++». restart of the search.''')
	}
	
	override beforeRestart() {
		
	}
	
}
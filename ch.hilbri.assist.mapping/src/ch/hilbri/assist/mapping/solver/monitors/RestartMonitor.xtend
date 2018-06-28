package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorRestart
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class RestartMonitor implements IMonitorRestart {
	
	Logger logger
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class) 
	}
	
	override afterRestart() {
		logger.info('''Triggering a restart of the search.''')
	}
	
	override beforeRestart() {
		
	}
	
}
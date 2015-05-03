package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.search.loop.monitors.IMonitorClose
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CloseMonitor implements IMonitorClose {
	private Logger logger
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class) 
	}
	override afterClose() {
		logger.info('''Closing the search. Either a configured solver limit was reached or the entire solution space has been explored.''')
	}
	
	override beforeClose() {
	
	}
	
}
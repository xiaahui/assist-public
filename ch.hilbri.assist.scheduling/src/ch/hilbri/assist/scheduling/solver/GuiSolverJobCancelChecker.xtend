package ch.hilbri.assist.scheduling.solver

import org.chocosolver.util.criteria.Criterion
import org.eclipse.core.runtime.IProgressMonitor
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class GuiSolverJobCancelChecker extends Thread implements Criterion {
	private volatile IProgressMonitor monitor
	private volatile boolean quitCancelChecker = false
	private volatile boolean abortSolver = false
	private Logger logger
	
	new(IProgressMonitor monitor) {
		this.monitor = monitor
		this.logger = LoggerFactory.getLogger(class)
	} 
	
	def void shutdown() {
		quitCancelChecker = true
	}
	
	override synchronized void run() {
		while (!quitCancelChecker) {
			if (monitor.isCanceled && !abortSolver)	{
				abortSolver = true
				logger.info('''Received a request to manually abort the solution search from the user interface.''')	
			}
			Thread.sleep(500)
		}
	}
	
	override isMet() {
		abortSolver
	}
	
}

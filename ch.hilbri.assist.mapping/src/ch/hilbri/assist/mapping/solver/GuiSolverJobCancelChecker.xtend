package ch.hilbri.assist.mapping.solver

import org.chocosolver.util.criteria.Criterion
import org.eclipse.core.runtime.IProgressMonitor
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class GuiSolverJobCancelChecker extends Thread implements Criterion {
	volatile IProgressMonitor monitor
	volatile boolean quitCancelChecker = false
	volatile boolean abortSolver = false
	Logger logger
	
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
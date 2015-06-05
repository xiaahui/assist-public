package ch.hilbri.assist.mapping.solver

import org.chocosolver.solver.Solver
import org.eclipse.core.runtime.IProgressMonitor

class GuiSolverJobCancelChecker extends Thread {
	private volatile IProgressMonitor monitor
	private volatile Solver solver
	private volatile boolean finished = false
	
	new(IProgressMonitor monitor, Solver solver) {
		this.monitor = monitor
		this.solver = solver
	} 
	
	def void shutdown() {
		finished = true
	}
	
	override synchronized void run() {
		while (finished == false) {
			if (monitor.isCanceled) solver.searchLoop.interrupt("User interrupt")
			else Thread.sleep(500)
		}
	}
	
}
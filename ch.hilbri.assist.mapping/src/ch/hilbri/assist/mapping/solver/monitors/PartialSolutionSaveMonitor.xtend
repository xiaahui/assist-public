package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class PartialSolutionSaveMonitor implements IMonitorDownBranch {
	private Solver 				 solver
	private IntVar[] 			 locationVariables
	private Logger 				 logger
	private int 				 bestProgress = 0
	private Map<IntVar, Integer> bestSolution
	
	new(Solver solver, SolverVariablesContainer solverVariables) {
		this.solver 			= solver
		this.locationVariables 	= solverVariables.locationVariables
		this.logger 			= LoggerFactory.getLogger(this.class)
		this.bestSolution		= new HashMap
	}
	
	def Map<IntVar, Integer> getPartialSolution() { bestSolution }
	
	def storePartialResult() {
		val currentProgress = locationVariables.filter[instantiated].size * 100 / locationVariables.length
		
		if (currentProgress > bestProgress) {
			bestSolution.clear
			
			for (variable : locationVariables.filter[instantiated])
				bestSolution.put(variable, variable.value)
			
			bestProgress = currentProgress
		}	
	}
	
	override beforeDownLeftBranch() {
		storePartialResult
	}
	
	override afterDownLeftBranch() {}
	override beforeDownRightBranch() {}
	override afterDownRightBranch() {}
}
	
	
package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.Model
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch
import org.chocosolver.solver.variables.IntVar

class PartialSolutionSaveMonitor implements IMonitorDownBranch {
	IntVar[] locationVariables
	int bestProgress = 0
	Map<IntVar, Integer> bestSolution
	
	new(Model solverModel, SolverVariablesContainer solverVariables) {
		this.locationVariables 	= solverVariables.allLocationVariables
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
	
	override beforeDownBranch(boolean left) {
		if (left)
			storePartialResult
	}
}
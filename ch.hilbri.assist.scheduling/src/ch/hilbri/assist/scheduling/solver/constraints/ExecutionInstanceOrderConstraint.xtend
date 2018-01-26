package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

class ExecutionInstanceOrderConstraint extends AbstractSchedulingConstraint {
	
	new(AssistModelScheduling model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Order of execution instances", model, chocoModel, solverVariables)
	}
	
	override generate() throws BasicConstraintsException {
		var worked = false
		
		for (modelTask : model.allTasks) {
			val solverTasks = solverVariables.getSolverTasks(modelTask)
			
			for (i : 1..<solverTasks.length) {
				chocoModel.arithm(solverTasks.get(i-1).end, "<=", solverTasks.get(i).start).post()
				worked = true
			}
			
		}
		
		return worked
		
	}
}
package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException

class EnforcePeriodicityConstraint extends AbstractSchedulingConstraint {
	
	new(AssistModelScheduling model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Enforce periodicity", model, chocoModel, solverVariables)
	}
	
	override generate() throws BasicConstraintsException {
		var worked = false
		
		return worked
	}
	
	
}
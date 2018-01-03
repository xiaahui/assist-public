package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import ch.hilbri.assist.mapping.model.AssistModelMapping

class CoreUtilizationConstraint extends AbstractMappingConstraint {

	new(AssistModelMapping model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("core capacity", model, chocoModel, solverVariables)
	}

	override generate() {

		for (core : model.allCores) {
			val indVars = solverVariables.getIndVars(core) 			// is this task mapped to this core?
			val taskUtils = model.allTasks.map[coreUtilization]     // how much capacity does it require
			
			chocoModel.scalar(indVars, taskUtils, "<=", core.capacity).post
		}		

		propagate()

		return true
	}

}

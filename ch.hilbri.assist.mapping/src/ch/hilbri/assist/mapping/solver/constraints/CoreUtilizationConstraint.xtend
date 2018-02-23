package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model

class CoreUtilizationConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
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

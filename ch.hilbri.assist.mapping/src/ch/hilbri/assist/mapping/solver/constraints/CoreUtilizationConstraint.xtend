package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model

class CoreUtilizationConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("core capacity", model, chocoModel, solverVariables)
	}

	override generate() {

		/* Check if we need to do anything - if there are only tasks with 0 core utilization,
		 * then we can skip this constraint */
		if (model.allTasks.filter[coreUtilization > 0].isNullOrEmpty)
			return false

		for (core : model.allCores) {
			val indVars = solverVariables.getIndVars(core) 			// is this task mapped to this core?
			val taskUtils = model.allTasks.map[coreUtilization]     // how much capacity does it require
			val capacity = core.coreCapacity
			val constraint = chocoModel.scalar(indVars, taskUtils, "<=", capacity)
			constraint.post
		}		

		propagate()

		return true
	}

}

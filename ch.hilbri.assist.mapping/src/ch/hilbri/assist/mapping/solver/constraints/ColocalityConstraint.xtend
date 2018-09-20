package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model

class ColocalityConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("colocality", model, chocoModel, solverVariables)
	}
	
	override generate() {
		var worked = false
		for (relation : model.colocalityRelations) {
			val level = relation.hardwareLevel.value
			val tasks = relation.allTasks.flatten
			val taskVars = tasks.map[solverVariables.getLocationVariablesForTask(it).get(level)]
			
			/* No we require all these variable to take the same value */
			chocoModel.allEqual(taskVars).post
			worked = true
		}
		
		propagate()
		
		return worked
	}
}
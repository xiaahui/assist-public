package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

class ColocalityConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("core capacity", model, chocoModel, solverVariables)
	}
	
	override generate() {
		
		for (relation : model.colocalityRelations) {
			val level = relation.hardwareLevel.value
			val tasks = relation.applications.filter[it instanceof Application]
													.map[(it as Application).tasks]
													.flatten
													.toSet
			val taskVars = tasks.map[solverVariables.getLocationVariablesForTask(it).get(level)]
			
			/* No we require all these variable to take the same value */
			chocoModel.allEqual(taskVars).post
		}
		
		propagate()
		
		true
	}
}
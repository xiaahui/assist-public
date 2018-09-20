package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model
import ch.hilbri.assist.mapping.solver.constraints.RAMorROMCapacityConstraint.RessourceType

class RAMorROMCapacityConstraint extends AbstractMappingConstraint {

	enum RessourceType {
		RAM,
		ROM
	}

	RessourceType type

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables, RessourceType type) {
		super(type.name.toLowerCase + " capacity", model, chocoModel, solverVariables)
		this.type = type
	}

	override generate() {

		/* Check, if we have to do anything */
		if (type == RessourceType.RAM) {
			if (model.allTasks.filter[ramUtilization > 0].isNullOrEmpty) {
				return false
			}
		} else if (type == RessourceType.ROM) {
			if (model.allTasks.filter[romUtilization > 0].isNullOrEmpty) {
				return false
			}
		}
		/* There are some tasks that require ram or ram, so we need to do stuff */
		for (board : model.allBoards) {
			val indVars = solverVariables.getIndVars(board) // is this task mapped to this core?
			var int[] taskUtils
			var int capacity

			if (type == RessourceType.RAM) {
				taskUtils = model.allTasks.map[ramUtilization] // how much capacity does it require
				capacity = board.ramCapacity
			} else if (type == RessourceType.ROM) {
				taskUtils = model.allTasks.map[romUtilization]
				capacity = board.romCapacity
			}

			chocoModel.scalar(indVars, taskUtils, "<=", capacity).post
		}

		propagate()
		true
	}
}

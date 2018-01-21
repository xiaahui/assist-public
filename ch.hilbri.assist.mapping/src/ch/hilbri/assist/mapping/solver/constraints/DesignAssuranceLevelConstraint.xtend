package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.AssistModelMapping
import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType

class DesignAssuranceLevelConstraint extends AbstractMappingConstraint {

	new(AssistModelMapping model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("design assurance level", model, chocoModel, solverVariables)
	}

	override generate() {
		
		/* If there is no application with a criticality level specified, we do not have to do anything */
		if (model.allTasks.filter[application.criticalityLevel > DesignAssuranceLevelType.NONE].nullOrEmpty) 
			return false
		
		/* 
		 * Go through the list of all tasks with criticality levels specified and find out, which
		 * boards would be suitable 										 
		 */
		for (task : model.allTasks.filter[application.criticalityLevel > DesignAssuranceLevelType.NONE]) {
			val criticalityLevel = task.application.criticalityLevel
			
			/* Filter every board with at least this design assurance level */
			val suitableBoardsIdx = model.allBoards.filter[assuranceLevel >= criticalityLevel].map[model.allBoards.indexOf(it)]
			 	
			/* Restrict the board location variable for this task accordingly */
			val taskVar = solverVariables.getLocationVariableForTaskAndLevel(task, HardwareArchitectureLevelType.BOARD)
			chocoModel.member(taskVar, suitableBoardsIdx).post()
		}
		
		return true
	}
}

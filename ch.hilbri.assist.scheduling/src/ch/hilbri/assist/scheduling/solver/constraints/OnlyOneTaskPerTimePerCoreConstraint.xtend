package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

class OnlyOneTaskPerTimePerCoreConstraint extends AbstractSchedulingConstraint {
	
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Only one task per time per core", model, chocoModel, solverVariables)
	}
	
	override generate() throws BasicConstraintsException {

		var worked = false

		/* We need to post a cumulative constraint for all tasks on a given core */
		val tasks2coreMap = model.allTasks.groupBy[assignedCore]

		for (taskList : tasks2coreMap.values) {
			val solverTasks = taskList.map[solverVariables.getSolverTasks(it)].flatten
			
			/* How many "units" does each task consume from the core resource? 1! */
			val capacityVar = chocoModel.intVar(1)
			val heightsVar = chocoModel.intVar(1)
			val heightsVarList = solverTasks.map[heightsVar]
			
			/* Post the constraint */
			chocoModel.cumulative(solverTasks, heightsVarList, capacityVar, true).post()
			worked = true
		}
		
		return worked
	}
	
}
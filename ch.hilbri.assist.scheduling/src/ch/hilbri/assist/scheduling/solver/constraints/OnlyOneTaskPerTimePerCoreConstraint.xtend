package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.Task

class OnlyOneTaskPerTimePerCoreConstraint extends AbstractSchedulingConstraint {
	
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Only one task per time per core", model, chocoModel, solverVariables)
	}
	
	override generate() throws BasicConstraintsException {

		var worked = false

		/* We need to post a cumulative constraint for all tasks on a given core */
		val tasks2coreMap = model.allTasks.groupBy[assignedCore]

		for (taskList : tasks2coreMap.values) {

			/* Choco tasks to represent the real execution instances */
			val realTasks = taskList.map[solverVariables.getSolverTasks(it)].flatten
	
			/* For each of these real tasks, we have to add "virtual/invisible" tasks to reflect the context switching time */
			val contextSwitchingTasks = createContextSwitchingTasks(realTasks)
			
			/* Build the list of all tasks */
			val combinedTaskList = realTasks + contextSwitchingTasks
			
			/* How many "units" does each task consume from the core resource? 1! */
			val heightsVar = chocoModel.intVar(1)
			val heightsVarList = combinedTaskList.map[heightsVar]
			
			/* How much capacity do we have for this core */		
			val capacityVar = chocoModel.intVar(1)
			
			/* Post the constraint */
			chocoModel.cumulative(combinedTaskList, heightsVarList, capacityVar, true).post()
			worked = true
		}
		
		propagate()
		return worked
	}
	
	private def Iterable<Task> createContextSwitchingTasks(Iterable<Task> realTasks) {
		val returnlist = newArrayList()
		
		/* If the context switching time is still set to zero, then
		 * we do not create the additional tasks and just return an empty list here  */
		if (model.taskSwitchDelay <= 0) 
			return returnlist 
		
		/* Otherwise we create these virtual tasks ... */
		for (task : realTasks) {
			/* The context switching task should begin, when its referring task is ending */
			val beginVar = task.end
			
			/* The length of the context switch is given in the input */
			val durationVar = chocoModel.intVar(model.taskSwitchDelay, model.taskSwitchDelay)
			
			/* The end of the context switch is not yet known */
			val endVar = chocoModel.intVar(0, solverVariables.hypLength)	
			
			/* Create the virtual task */
			val contextSwitchingTask = new Task(beginVar, durationVar, endVar)
			
			returnlist.add(contextSwitchingTask)
		}
		
		return returnlist
	}
	
}
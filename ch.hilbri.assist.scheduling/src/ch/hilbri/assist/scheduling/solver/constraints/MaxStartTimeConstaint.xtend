package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

/**
 * The intended semantics corresponds to a deadline for the start, i.e., within 
 * a period of a task, it has to start executing at or before the specified time
 */
class MaxStartTimeConstaint extends AbstractSchedulingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Max start time", model, chocoModel, solverVariables)
	}

	override generate() throws BasicConstraintsException {
		var worked = false

		/* Tasks without a maxStartTime specification have a -1 in this property */
		for (task : model.allTasks.filter[maxStartTime > -1]) {
			val instances = solverVariables.getSolverTasks(task)

			for (i : 0 ..< instances.size) {
				val instance = instances.get(i)
				
				/* the variable "begin" is already restricted to an interval: 
				 * i * period <= task.begin < (i+1) * period - task.duration 
				 * 
				 * --> we just need to restrict the begin a little further:
				 * task.begin <= i * task.period + maxStartTime
				 */
				chocoModel.arithm(instance.start, "<=", i * task.period + task.maxStartTime).post()
				worked = true
			}
		}

		return worked
	}
}

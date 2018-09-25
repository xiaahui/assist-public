package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

/**
 * The intended semantics corresponds to a deadline, i.e., within 
 * a period of a task, it has to finish at or before the specified deadline 
 */
class MaxEndTimeConstaint extends AbstractSchedulingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Max end time (deadline)", model, chocoModel, solverVariables)
	}

	override generate() throws BasicConstraintsException {
		var worked = false

		/* Tasks without a deadline/maxEndTime specification have a -1 in this property */
		for (task : model.allTasks.filter[maxEndTime > -1]) {
			val instances = solverVariables.getSolverTasks(task)

			for (i : 0 ..< instances.size) {
				val instance = instances.get(i)
				
				/* the variable "end" is already restricted to an interval: 
				 * [i * task.period + task.duration, (i + 1) * task.period] 
				 * 
				 * --> we just need to restrict the end a little further:
				 * task.end <= i * task.period + maxEndTime
				 */
				chocoModel.arithm(instance.end, "<=", i* task.period + task.maxEndTime).post()
				worked = true
			}
		}

		return worked
	}
}

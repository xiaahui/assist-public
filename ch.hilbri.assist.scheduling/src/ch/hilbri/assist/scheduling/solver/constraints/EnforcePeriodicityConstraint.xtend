package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException

class EnforcePeriodicityConstraint extends AbstractSchedulingConstraint {

	new(AssistModelScheduling model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("Enforce periodicity", model, chocoModel, solverVariables)
	}

	override generate() throws BasicConstraintsException {
		var worked = false

		/* Go through the list of all tasks and restrict each instance */
		for (task : model.allTasks) {
			val instances = solverVariables.getSolverTasks(task)

			for (i : 0 ..< instances.size) {
				val instance = instances.get(i)

				// i * period <= task.begin < (i+1) * period - duration
				// (additional -1 is used to express less than relation) 
				chocoModel.member(instance.start, i * task.period, (i + 1) * task.period - 1 - task.duration).post()
				
				// i * period + duration <= task.end < (i+1) * period 
				// (additional -1 is used to express less than relation)
				chocoModel.member(instance.end,  i * task.period + task.duration, (i+1) * task.period - 1).post()
			}

		}

		propagate()
		
		return worked
	}

}

package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.PeriodicityType
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model

class EnforcePeriodicityConstraint extends AbstractSchedulingConstraint {

    new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
        super("Enforce periodicity", model, chocoModel, solverVariables)
    }

    override generate() throws BasicConstraintsException {
        var worked = false

        /* Go through the list of all tasks and restrict each instance */
        for (task : model.allTasks) {
            val instances = solverVariables.getSolverTasks(task)

            for (i : 0 ..< instances.size) {
                val instance = instances.get(i)

                // i * period <= task.begin < (i+1) * period - task.duration
                chocoModel.member(instance.start, i * task.period, (i + 1) * task.period - task.duration).post()

                // i * period + duration <= task.end < (i+1) * period 
                // (additional -1 is used to express less than relation)
                chocoModel.member(instance.end, i * task.period + task.duration, (i + 1) * task.period).post()

                // If the periodicity is strict, then between two successive beginning there has to be exactly period length
                if (task.periodicity == PeriodicityType.STRICT) {
                    if (i > 0) {
                        val beginPrevVar = instances.get(i - 1).start
                        val beginCurVar = instances.get(i).start

                        // We post the constraint in the following form:
                        // beginCur - beginPrev = period
                        chocoModel.arithm(beginCurVar, "-", beginPrevVar, "=", task.period).post()
                    }
                }

                // We did some work
                worked = true
            }

        }

        propagate()

        return worked
    }

}

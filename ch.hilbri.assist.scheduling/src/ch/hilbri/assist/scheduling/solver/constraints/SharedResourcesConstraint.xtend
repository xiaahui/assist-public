package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Task
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Model

class SharedResourcesConstraint extends AbstractSchedulingConstraint {
    new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
        super("shared resources with synchronized access", model, chocoModel, solverVariables)
    }

    override generate() throws BasicConstraintsException {
        var worked = false

        /* Go through all hardware elements and check if a shared hardware feature 
         * with synchronized access is defined */
        for (hwElem : model.allHardwareElements) {

            /* Does this hardware element have at least one 
             * feature that is shared and requires synchronized access? */
            for (feature : hwElem.features.filter[isShared && isSynchronizedAccess]) {

                /* Find the list of tasks that are mapped to this hwElem
                 * and require this shared feature                       */
                val relevantTasks = hwElem.allMappedTasks
                                          .filter [
                                               it.featureRequirements.filter[
                                                        it.name == feature.name                         && 
                                                        it.isShared                                     && 
                                                        it.hardwareLevel == hwElem.getHardwareLevel
                                                ]
                                                .size > 0
                                           ]

                /* Do we have some tasks that have to be synchronized? */
                if (!relevantTasks.nullOrEmpty) {

                    /* Add constraint for all execution units of these tasks */
                    /* Find the execution instances for all relevant tasks */
                    val allExecutionInstances = relevantTasks.map[solverVariables.getSolverTasks(it)].flatten

                    /* How many "units" does each task consume from this feature? 1! */
                    val heightsVar = chocoModel.intVar(1)

                    /* We need a heights variable for each execution instance */
                    val heightsVarList = allExecutionInstances.map[heightsVar]

                    /* How much capacity do we have for this feature */
                    val capacityVar = chocoModel.intVar(1)

                    /* Post the choco constraint for these instances */
                    chocoModel.cumulative(allExecutionInstances, heightsVarList, capacityVar, true).post()
                    worked = true
                }
            }
        }

        propagate()
        return worked
    }

    /* Find out, which tasks are executing on (or below) this hardware element */
    private def List<Task> getAllMappedTasks(HardwareElement hwElem) {

        /* Which cores are contained in this hardware element? */
        val relevantCores = newArrayList()
        if (hwElem instanceof Core)
            relevantCores.add(hwElem)
        else if (hwElem instanceof Processor)
            relevantCores.addAll(hwElem.allCores)
        else if (hwElem instanceof Board)
            relevantCores.addAll(hwElem.allCores)
        else if(hwElem instanceof Box) relevantCores.addAll(
            hwElem.allCores) else if(hwElem instanceof Compartment) relevantCores.addAll(hwElem.allCores)

        /* If there are no cores then there can be no tasks */
        if(relevantCores.isNullOrEmpty) return #[]

        /* Now we need to find the tasks that are deployed to one of these cores */
        return model.allTasks.filter[relevantCores.contains(it.assignedCore)].toList
    }

}

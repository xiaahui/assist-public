package ch.hilbri.assist.scheduling.solver.constraints

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Model
import ch.hilbri.assist.model.RestrictionDisjointExecution

class SchedulingRestrictionsConstraint extends AbstractSchedulingConstraint {
    
    new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
        super("scheduling restrictions", model, chocoModel, solverVariables)
    }
    
    override generate() throws BasicConstraintsException {
        var worked = false
        
        for (restriction : model.schedulingRestrictions) {
            
            /* All tasks should start at the same time */
            if (restriction instanceof  RestrictionStartAtTheSameTime) {
                /* Retrieve all execution instances for each task */
                /* --> [ [chocoTask1, chocoTask2, ...], [chocoTask2.1, chocoTask2.2, ...], ... ]  */
                val allChocoTasks = restriction.tasks.map[solverVariables.getSolverTasks(it)]
                
                /* *
                 * Go through each chocoTask in each sublist -> we can assume these list have an equal length,
                 * because we require the period of all tasks to be equal                                      
                 * */
                for (i : 0 ..< allChocoTasks.head.length) {
                    val curChocoTasks = allChocoTasks.map[get(i)]
                    val startVars = curChocoTasks.map[start]
                    chocoModel.allEqual(startVars).post()
                }
                worked = true
            }

            /* All tasks should finish/end at the same time */
            else if (restriction instanceof RestrictionFinishAtTheSameTime) {
                /* Retrieve all execution instances for each task */
                /* --> [ [chocoTask1, chocoTask2, ...], [chocoTask2.1, chocoTask2.2, ...], ... ]  */
                val allChocoTasks = restriction.tasks.map[solverVariables.getSolverTasks(it)]
                
                /* *
                 * Go through each chocoTask in each sublist -> we can assume these list have an equal length,
                 * because we require the period of all tasks to be equal                                      
                 * */
                for (i : 0 ..< allChocoTasks.head.length) {
                    val curChocoTasks = allChocoTasks.map[get(i)]
                    val endVars = curChocoTasks.map[end]
                    chocoModel.allEqual(endVars).post()
                }
                worked = true
            }
            
            /* All tasks should start after the other task has finished (delay is possible!) */
            else if (restriction instanceof RestrictionStartAfterOtherFinished) {
                /* Retrieve all execution instances for each task */
                /* --> [ [chocoTask1, chocoTask2, ...], [chocoTask2.1, chocoTask2.2, ...], ... ]  */
                val allChocoTasks = restriction.tasks.map[solverVariables.getSolverTasks(it)]
                
                /* Do the same for the "other task" */                
                val allChocoTasksForOther = solverVariables.getSolverTasks(restriction.otherTask)
                
                /* *
                 * Go through each chocoTask in each sublist -> we can assume these list have an equal length,
                 * because we require the period of all tasks to be equal                                      
                 * */
                for (i : 0 ..< allChocoTasks.head.length) {
                    val curChocoTasks     = allChocoTasks.map[get(i)]     // List of Choco Tasks 
                    val curChocoOtherTask = allChocoTasksForOther.get(i)  // Only one Choco Task
                    
                    //  allChocoTasks[i].begin >= curChocoOtherTask.end + Delay
                    for (chocoTask : curChocoTasks) {
                        chocoModel.arithm(chocoTask.start, ">=", curChocoOtherTask.end, "+", restriction.delay).post()
                    }
                }
                worked = true
                
            }

            /* All tasks should start after the other task has started (delay is possible) */
            else if (restriction instanceof RestrictionStartAfterOtherStarted) {
                /* Retrieve all execution instances for each task */
                /* --> [ [chocoTask1, chocoTask2, ...], [chocoTask2.1, chocoTask2.2, ...], ... ]  */
                val allChocoTasks = restriction.tasks.map[solverVariables.getSolverTasks(it)]
                
                /* Do the same for the "other task" */                
                val allChocoTasksForOther = solverVariables.getSolverTasks(restriction.otherTask)
                
                /* *
                 * Go through each chocoTask in each sublist -> we can assume these list have an equal length,
                 * because we require the period of all tasks to be equal                                      
                 * */
                for (i : 0 ..< allChocoTasks.head.length) {
                    val curChocoTasks     = allChocoTasks.map[get(i)]     // List of Choco Tasks 
                    val curChocoOtherTask = allChocoTasksForOther.get(i)  // Only one Choco Task
                    
                    //  allChocoTasks[i].begin >= curChocoOtherTask.begin + Delay
                    for (chocoTask : curChocoTasks) {
                        chocoModel.arithm(chocoTask.start, ">=", curChocoOtherTask.start, "+", restriction.delay).post()
                    }
                }
                worked = true
                
            }
            
            /* All tasks of this restriction cannot be executed at the same time (no overlap) */
            else if (restriction instanceof RestrictionDisjointExecution) {
            	/* Retrieve all execution instances for each task */
                /* --> [ [chocoTask1, chocoTask2, ...], [chocoTask2.1, chocoTask2.2, ...], ... ] --> flatten */
            	val allChocoTasks = restriction.tasks.map[solverVariables.getSolverTasks(it)].flatten
            	
            	/* How much capacity do we have */		
				val capacityVar = chocoModel.intVar(1)

            	/* How many "units" does each task consume from this "capacity"? 1!         	 */ 
				val heightsVar = chocoModel.intVar(1)
				val heightsVarList = allChocoTasks.map[heightsVar]
            	            	
            	/* Posting the constraint */
				chocoModel.cumulative(allChocoTasks, heightsVarList, capacityVar, true).post()
            	worked = true
            }
        }
        return worked
    }
}
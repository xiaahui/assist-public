package ch.hilbri.assist.scheduling.solver.strategies

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Task
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.variables.VariableSelector
import org.chocosolver.solver.variables.IntVar
import java.util.HashMap

class RateMonotonicVarSelector implements VariableSelector<IntVar> {

    private AssistModel assistModel
    private SolverVariablesContainer solverVariables

    /* Provide a link from the IntVar to the AssistModel Task */    
    private Map<IntVar, Task> var2taskMap = new HashMap

    /* Provide a link from the IntVar to the index of the execution instance of that task */
    private Map<IntVar, Integer> var2taskExecIdx = new HashMap

    /* Provide a link from the IntVar to a boolean stating, whether it is a "beginning" var */
    private Map<IntVar, Boolean> var2isBeginVar = new HashMap

    new(AssistModel assistModel, SolverVariablesContainer solverVariables, IntVar[] vars) {
        this.assistModel = assistModel
        this.solverVariables = solverVariables
        

        /* Fill the caches */
        for (task : assistModel.allTasks) {
            for (taskExec : solverVariables.getSolverTasks(task)) {
                var2taskMap.put(taskExec.start, task)
                var2taskMap.put(taskExec.end, task)
                var2taskMap.put(taskExec.duration, task)
                
                var2taskExecIdx.put(taskExec.start, solverVariables.getSolverTasks(task).indexOf(taskExec))
                var2taskExecIdx.put(taskExec.end, solverVariables.getSolverTasks(task).indexOf(taskExec))
                var2taskExecIdx.put(taskExec.duration, solverVariables.getSolverTasks(task).indexOf(taskExec))
                
                var2isBeginVar.put(taskExec.start, true)
                var2isBeginVar.put(taskExec.end, false)
                var2isBeginVar.put(taskExec.duration, false)
            }
        }
    }

    override IntVar getVariable(IntVar[] variables) {
        
        /* Sort by the following criteria:
         * - not instantiated
         * - is a start variable (the others are set automatically)
         * - start with the strict periodicity
         * - start with the shortest period
         * - start with the longest duration
         * - sort according 
         */
         
        val list = variables.filter[!instantiated]                  
                            .filter[isBeginVar]
                            .sortBy[var2taskExecIdx.get(it)]                // first execution instances first
                            .sortBy[-var2taskMap.get(it).duration]          // longest durations next
                            .sortBy[var2taskMap.get(it).period]             // shortest periods next
                            .sortBy[var2taskMap.get(it).periodicity.value]  // strict = 0, flexible = 1 --> strict first
                            
        return list.head
        
    }
    
    private def boolean isBeginVar(IntVar intVar) {
        var2isBeginVar.get(intVar)
    }

}

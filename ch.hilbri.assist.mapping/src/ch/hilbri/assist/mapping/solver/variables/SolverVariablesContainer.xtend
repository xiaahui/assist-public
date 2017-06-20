package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Task
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

@Data class SolverVariablesContainer {
	
	/** A map with the tasks as keys and the list of location variables as values */
	@Accessors(NONE) private Map<String, List<IntVar>>	taskToLocationVariablesMap = new HashMap
	
	/** A map with the task for each locationVariable */
	@Accessors(NONE) private Map<IntVar, String>		locationVariableToTaskMap = new HashMap
	
	/* CONSTRUCTOR */
	new(AssistModel assistModel, Model solverModel) {
		
		/* Initialize the hash map for all task-related location variables */
		for (t : assistModel.allTasks) {

			/* Create the location variables for each task */			
			val locVarCore = solverModel.intVar(t.name + "-L0", 0, assistModel.allCores.length-1, false)
			val locVarProc = solverModel.intVar(t.name + "-L1", 0, assistModel.allProcessors.length-1, false)
			val locVarBoard = solverModel.intVar(t.name + "-L2", 0, assistModel.allBoards.length-1, false)
			val locVarBox = solverModel.intVar(t.name + "-L3", 0, assistModel.allBoxes.length-1, false)
			val locVarComp = solverModel.intVar(t.name + "-L4", 0, assistModel.allCompartments.length-1, false)
			
			/* Store these variables in the maps for easy retrieval later */
			taskToLocationVariablesMap.put(t.name, #[locVarCore,locVarProc, locVarBoard, locVarBox, locVarComp])
			
			locationVariableToTaskMap.put(locVarCore, t.name)
			locationVariableToTaskMap.put(locVarProc, t.name)
			locationVariableToTaskMap.put(locVarBoard, t.name)
			locationVariableToTaskMap.put(locVarBox, t.name)
			locationVariableToTaskMap.put(locVarComp, t.name)
		}
	}
	
	def IntVar[] getAllLocationVariables() {
		taskToLocationVariablesMap.values.flatten.sortBy[name]
	}
	
	def IntVar[] getLocationVariablesForLevel(int level) {
		taskToLocationVariablesMap.values.map[get(level)]
	}
	
	def IntVar[] getLocationVariablesForCoreLevel() {
		getLocationVariablesForLevel(0)
	}
	
	def IntVar[] getLocationVariablesForTask(Task task) {
		taskToLocationVariablesMap.get(task.name)
	}

 }
  
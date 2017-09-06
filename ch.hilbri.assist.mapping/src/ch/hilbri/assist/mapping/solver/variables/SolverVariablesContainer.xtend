package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.Task
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar

class SolverVariablesContainer {
	
	/** A map with the tasks as keys and the list of location variables as values */
	private Map<String, List<IntVar>>	taskToLocationVariablesMap = new HashMap
	
	/** A map with the task for each locationVariable */
	private Map<IntVar, String>		locationVariableToTaskMap = new HashMap
	
	/** A matrix of variables as indicators for each task
	 *  d_{i,j} = {0,1}   <-- if d_{i,j} = 1 then task_i is mapped to core_j */
	private var IntVar[][] indVarsCoreLevel
	
	/** Store a reference to the ASSIST Input model */
	private AssistModel assistModel
	
	/** Store a reference to the choco solver */
	private Model solverModel
	
	/* CONSTRUCTOR */
	new(AssistModel assistModel, Model solverModel) {
		
		this.assistModel = assistModel
		this.solverModel = solverModel
		
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
			
			/* We need to create indicator variables for the core-level;
			 * d_{i,j} = {0,1}   <-- if d_{i,j} = 1 then task_i is mapped to core_j */
			indVarsCoreLevel = solverModel.intVarMatrix("indVarCore", assistModel.allTasks.size, assistModel.allCores.size, #[0,1])
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

	def IntVar[] getIndVarsCoreLevel(Task task) {
		indVarsCoreLevel.get(assistModel.allTasks.indexOf(task))
	}
	
	def IntVar[] getIndVarsCoreLevel_TaskIdx(int taskIdx) {
		getIndVarsCoreLevel(assistModel.allTasks.get(taskIdx))
	}
	
	def IntVar[] getIndVarsCoreLevel(Core core) {
		val coreIdx = assistModel.allCores.indexOf(core)
		indVarsCoreLevel.map[it.get(coreIdx)]
	}

	def IntVar[] getIndVarsCoreLevel_CoreIdx(int coreIdx) {
		getIndVarsCoreLevel(assistModel.allCores.get(coreIdx))
	}


 }
  
package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.Task
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar

class SolverVariablesContainer {
	
	/** A map with the tasks as keys and the list of location variables as values */
	private Map<String, List<IntVar>>	taskToLocationVariablesMap = new HashMap
	
	/** A map with the task for each locationVariable */
	private Map<IntVar, String>		locationVariableToTaskMap = new HashMap
	
	/** A matrix of variables as indicators for each task
	 *  d_{i,j} = {0,1}   <-- if d_{i,j} = 1 then task_i is mapped to core_j */
	private var BoolVar[][] indVarsCoreLevel
	
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
		}
		
		/* We need to create indicator variables for the core-level;
		 * d_{i,j} = {0,1}   <-- if d_{i,j} = 1 then task_i is mapped to core_j */
		indVarsCoreLevel = solverModel.boolVarMatrix("indVarCore", assistModel.allTasks.size, assistModel.allCores.size)
	
		for (t : assistModel.allTasks) { 
			/* We go through each core and create the link to the location variable */
			for (j : 0 ..< assistModel.allCores.size) {
				val indicatorVar = getIndVarsCoreLevel(t).get(j)
				val locationVar = getLocationVariablesForTask(t).get(0)
				
				/* We try to define the valid tuples for the relationship between locationVariable of task t
				 * and the indicatorVariable_j, which is only true, if task t is placed on core_j  (false otherwise) */
				 
				val tuples = new Tuples(true)
				for (iter : 0 ..< assistModel.allCores.size)     // = all possible values for location variable of t
					if (iter != j)								
						tuples.add(iter, 0)						// task t is not placed on core j  --> false	
					else									
						tuples.add(iter, 1)						// task t is placed on core j  --> true	
				
				/* Post the table constraint to link the variables */
				solverModel.table(#[locationVar, indicatorVar], tuples, "GAC3rm+").post
			}
			
			/* Each task can be placed to only one core - only one indicator variable of a task can be true (= 1) */
			solverModel.count(1, getIndVarsCoreLevel(t), solverModel.intVar(1)).post
		}
		
		solverModel.solver.propagate()
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

	def BoolVar[] getIndVarsCoreLevel(Task task) {
		indVarsCoreLevel.get(assistModel.allTasks.indexOf(task))
	}
	
	def BoolVar[] getIndVarsCoreLevel_TaskIdx(int taskIdx) {
		getIndVarsCoreLevel(assistModel.allTasks.get(taskIdx))
	}
	
	def BoolVar[] getIndVarsCoreLevel(Core core) {
		val coreIdx = assistModel.allCores.indexOf(core)
		indVarsCoreLevel.map[it.get(coreIdx)]
	}

	def BoolVar[] getIndVarsCoreLevel_CoreIdx(int coreIdx) {
		getIndVarsCoreLevel(assistModel.allCores.get(coreIdx))
	}


 }
  
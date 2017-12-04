package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Board
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.Compartment
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.HardwareElement
import ch.hilbri.assist.mapping.model.Processor
import ch.hilbri.assist.mapping.model.Task
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType

class SolverVariablesContainer {

	/** A map with the tasks as keys and the list of location variables as values */
	private Map<String, List<IntVar>> taskToLocationVariablesMap = new HashMap

	/** A map with the task for each locationVariable */
	private Map<IntVar, String> locationVariableToTaskMap = new HashMap

	/** A 3d matrix of variables as indicators for each task
	 * 	
	 * 	d[i][l][j] = {0,1}
	 * 				- Task i
	 * 				- Hardware level l (core = 0, processor = 1, ...)
	 * 				- Hardware component index j
	 * 
	 *  => Is task i mapped to component with index j on level l? 
	 * 
	 * We could not use a 3D array because of limitations in xtend, 
	 * therefore, we had to resort to Lists of Lists of Lists
	 * */
	private var List<List<List<BoolVar>>> indVars

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
			val locVarCore = solverModel.intVar(t.name + "-L0", 0, assistModel.allCores.length - 1, false)
			val locVarProc = solverModel.intVar(t.name + "-L1", 0, assistModel.allProcessors.length - 1, false)
			val locVarBoard = solverModel.intVar(t.name + "-L2", 0, assistModel.allBoards.length - 1, false)
			val locVarBox = solverModel.intVar(t.name + "-L3", 0, assistModel.allBoxes.length - 1, false)
			val locVarComp = solverModel.intVar(t.name + "-L4", 0, assistModel.allCompartments.length - 1, false)

			/* Store these variables in the maps for easy retrieval later */
			taskToLocationVariablesMap.put(t.name, #[locVarCore, locVarProc, locVarBoard, locVarBox, locVarComp])

			locationVariableToTaskMap.put(locVarCore, t.name)
			locationVariableToTaskMap.put(locVarProc, t.name)
			locationVariableToTaskMap.put(locVarBoard, t.name)
			locationVariableToTaskMap.put(locVarBox, t.name)
			locationVariableToTaskMap.put(locVarComp, t.name)
		}

		/* 	d[i][l][j] = {0,1}
		 * 				- Task i
		 * 				- Hardware level l (core = 0, processor = 1, ...)
		 * 				- Hardware component index j */
		/* Tasks */
		indVars = newArrayList
		for (i : 0 ..< assistModel.allTasks.size) {

			/* For each task, add a new list to hold the levels */
			indVars.add(newArrayList)

			/* Hardware level */
			for (l : 0 ..< 5) {
				/* For each component on that level, add the boolean variables */
				val boolVarArray = solverModel.boolVarArray("d[" + i + "][" + l + "]", assistModel.getAllHardwareElements(l).size)
				indVars.get(i).add(boolVarArray)
			}
		}

		for (t : assistModel.allTasks) {

			/* Go through all levels */
			for (l : 0 ..< 5) {

				/* We go through each hardware element on this level
				 * and create the link to the location variable			 */
				for (j : 0 ..< assistModel.getAllHardwareElements(l).size) {

					/* Which indicator variable should be linked to which location variable? */
					val indicatorVar = getIndVars(t, l).get(j)
					val locationVar = getLocationVariablesForTask(t).get(l)

					/* 	We try to define the valid tuples for the relationship between locationVariable of task t
					 * and the indicatorVariable_j, which is only true, if task t is placed on hw_element_j  (false otherwise) */
					val tuples = new Tuples(true)
					for (iter : 0 ..< assistModel.getAllHardwareElements(l).size) // = all possible values for location variable of t
						if (iter != j)
							tuples.add(iter, 0) // task t is not placed on component j  --> false	
						else
							tuples.add(iter, 1) // task t is placed on component j  --> true	
				
					/* Post the table constraint to link the variables */
					solverModel.table(#[locationVar, indicatorVar], tuples, "GAC3rm+").post
				}
			
			} /* End of level-loop */

			/* Each task can be placed to only one core - only one indicator variable of a task can be true (= 1) */
			solverModel.count(1, getIndVars(t, 0), solverModel.intVar(1)).post
		
		} /* End of tasks-loop */

		solverModel.solver.propagate()
	}

	def IntVar[] getAllLocationVariables() {
		taskToLocationVariablesMap.values.flatten.sortBy[name]
	}

	def IntVar[] getLocationVariablesForLevel(int level) {
		taskToLocationVariablesMap.values.map[get(level)]
	}
	
	def IntVar[] getLocationVariablesForLevel(HardwareArchitectureLevelType level) {
		getLocationVariablesForLevel(level.value)
	}
	
	def IntVar[] getLocationVariablesForCoreLevel() {
		getLocationVariablesForLevel(0)
	}

	def IntVar[] getLocationVariablesForTask(Task task) {
		taskToLocationVariablesMap.get(task.name)
	}

	/**
	 * Retrieves the indication variables for the provided task and the hardware level
	 *  level = 0 --> core level; 
	 *  level = 1 --> processor level; 
	 *  ...
	 * 
	 * @returns a list of boolean variables (global hardware element idx is used as an index)
	 *          (each variable j states if the task t is mapped to the component j of the hardware level level)
	 */
	def BoolVar[] getIndVars(Task task, int level) {
		val taskIdx = assistModel.allTasks.indexOf(task)
		indVars.get(taskIdx).get(level)
	}

	/**
	 * Retrieve the indication variables for the provided hardware element
	 * 
	 * @returns a list of boolean variables 
	 * 			(global task index is used as an index); 
	 * 			each variable states if the task with this id is placed on this component
	 * 
	 */
	def BoolVar[] getIndVars(HardwareElement hw) {
		if (hw instanceof Compartment) {
			indVars.map[get(4).get(assistModel.allCompartments.indexOf(hw))]
		} else if (hw instanceof Box) {
			indVars.map[get(3).get(assistModel.allBoxes.indexOf(hw))]
		} else if (hw instanceof Board) {
			indVars.map[get(2).get(assistModel.allBoards.indexOf(hw))]
		} else if (hw instanceof Processor) {
			indVars.map[get(1).get(assistModel.allProcessors.indexOf(hw))]
		} else if (hw instanceof Core) {
			indVars.map[get(0).get(assistModel.allCores.indexOf(hw))]
		} else
			null
	}
}

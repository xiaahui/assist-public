package ch.hilbri.assist.scheduling.solver.variables

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.apache.commons.math3.util.ArithmeticUtils
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.Task
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.HashMap

class SolverVariablesContainer {

	/** Store a reference to the ASSIST Input model */
	private AssistModelScheduling assistModel

	/** Store a reference to the choco solver */
	private Model solverModel

	/** Length of the hyperPeriod */
	@Accessors(PUBLIC_GETTER) int hypLength = -1

	/** Store a reference to the variables */
	private Map<ch.hilbri.assist.scheduling.model.Task, List<Task>> task2executionInstancesMap = new HashMap

	/* CONSTRUCTOR */
	new(AssistModelScheduling assistModel, Model solverModel) {

		this.assistModel = assistModel
		this.solverModel = solverModel

		solverModel.solver.propagate()

		/* Set the hyperperiod length - based on the least common multiple of their periods */
		if (!assistModel.allTasks.isNullOrEmpty) 
			hypLength = assistModel.allTasks.map[period].reduce[p1, p2 | ArithmeticUtils.lcm(p1,p2)]
		
		/* It is possible to configure a longer hyperperiod as part of the input 
		 * if it is specified (> 0) and larger than our current hyperperiod, 
		 * then we have to prolong our current hyperperiod */
		if ((assistModel.minHypPeriodLength > 0) && (assistModel.minHypPeriodLength > hypLength)) {
			
			// We just have to multiply the hypLength (based on lcm) so often, that is more than the configured limit
			if (assistModel.minHypPeriodLength % hypLength == 0) 
				hypLength = assistModel.minHypPeriodLength
			else
				hypLength = hypLength * ((assistModel.minHypPeriodLength / hypLength) + 1)
		}
		
		
		/* Go through the list of tasks and create a task container for each execution instance */
		for (task : assistModel.allTasks) {
			
			/* How many times will this be executed during the hyperperiod? 
			 * --> should be an int and positiv --> because hypLength was computed based on lcm */
			val executionCount = hypLength / task.period
			val executionInstanceList = new ArrayList<Task>
			for (i : 0 ..< executionCount) {
				val executionInstanceName = task.fullName + '''[«i»]'''
				val startVar = solverModel.intVar(executionInstanceName + "_Start", 0, hypLength - task.duration)
				val durationVar = solverModel.intVar(executionInstanceName + "_Duration", task.duration, task.duration)
				val endVar = solverModel.intVar(executionInstanceName + "_End", 0, hypLength)
				val taskContainer = new Task(startVar, durationVar, endVar)
				executionInstanceList.add(taskContainer)
			}
			task2executionInstancesMap.put(task, executionInstanceList)
		}
	}
	
	
	/** Retrieve all IntVars from the execution instance list */
	def IntVar[] getAllVariables() {
		task2executionInstancesMap.values.flatten  									// just a list of tasks
										 .map[#[it.start, it.duration, it.end]]		// extract intVars from tasks
										 .flatten									// just a list of intVars
	}
	
	/** Retrieve the solver tasks for an ASSIST task */
	def List<Task> getSolverTasks(ch.hilbri.assist.scheduling.model.Task task) {
		task2executionInstancesMap.get(task)
	}

}

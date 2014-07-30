package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.datamodel.model.Core
import ch.hilbri.assist.datamodel.model.Thread
import java.util.ArrayList
import java.util.HashMap
import org.jacop.core.IntVar
import org.jacop.core.Store

@Data class SolverVariablesContainer {
	
	/** A list of location variables for each thread (and each system layer) */
	HashMap<Thread, HashMap<Integer, IntVar>> 	threadLocationVariablesList	= new HashMap 
	
	/** A list of variables; a variable for each core which contains the absolute utilization */
	HashMap<Core, IntVar>						absoluteCoreUtilizationList = new HashMap
	
	/** A list of variables; a variable for each board which contains the absolute ram utilization */
	HashMap<Board, IntVar>						absoluteRamUtilizationList = new HashMap
	
	/** A list of variables; a variable for each board which contains the absolute rom utilization */
	HashMap<Board, IntVar>						absoluteRomUtilizationList = new HashMap
	
	/* CONSTRUCTOR */
	new (AssistModel model, Store constraintStore) {
		
		/* Initialize the hash map for all location variables */
		for (t : model.allThreads) {
			val m = new HashMap<Integer, IntVar>
			for (var i = 1; i <= model.hardwareLevelCount; i++) {
				/* Create a new location variable for each thread;
				 * initialize its domain to 1 .. size of hardware elements in this level */
				m.put(i, new IntVar(constraintStore, "LocVar-" + t.name + "-Level-" + i, 1, model.getAllHardwareElements(i).size))
			}
			threadLocationVariablesList.put(t, m)
		}
		
		/* Initialize the hash map for all utilization variables */
		for (c : model.allCores) 	absoluteCoreUtilizationList.put(c, new IntVar(constraintStore, "AbsCoreUtil-" + c.name, 0, c.capacity))
		for (b : model.allBoards) 	absoluteRamUtilizationList.put(b, new IntVar(constraintStore, "AbsRamUtil-" + b.name, 0, b.ramCapacity))
		for (b : model.allBoards) 	absoluteRomUtilizationList.put(b, new IntVar(constraintStore, "AbsRomUtil-" + b.name, 0, b.romCapacity))
		
	}

	/** Returns a list of Variables which the solver has to generate solutions for */
	def IntVar[] getSolutionVariables() {
		val list = new ArrayList<IntVar>

		// Alle ThreadLocationVariables sind SolutionVariables
		for (threadKey : threadLocationVariablesList.keySet)
			for (levelKey : threadLocationVariablesList.get(threadKey).keySet)
				list.add(threadLocationVariablesList.get(threadKey).get(levelKey))		
		
		// All absolute core utilization variables are relevant for the solution
		for (coreKey : absoluteCoreUtilizationList.keySet)
			list.add(absoluteCoreUtilizationList.get(coreKey))
		
		// All absolute board ram utilization variables are relevant for the solution
		for (boardKey : absoluteRamUtilizationList.keySet)
			list.add(absoluteRamUtilizationList.get(boardKey))
		 
		// All absolute board ram utilization variables are relevant for the solution
		for (boardKey : absoluteRomUtilizationList.keySet)
			list.add(absoluteRomUtilizationList.get(boardKey)) 
		
		return list
	}
	
	/** Returns the location variable for a given thread and a given hardware level */
	def IntVar getThreadLocationVariable(Thread t, int level) {
		return threadLocationVariablesList.get(t).get(level)
	}
	
	/** Returns the index of the location variable for a given thread and hardware level */
	def int getIndexOfThreadLocationInSolutionVariablesList(Thread t, int level) {
		return solutionVariables.indexOf(getThreadLocationVariable(t, level))
	}
	
	/** Returns the variable which contains the absolute utilization for the given core */
	def IntVar getAbsoluteCoreUtilizationVariable(Core c) {
		return absoluteCoreUtilizationList.get(c)
	}
	
	/** Returns the index of the absolute utilization variable of a given core in the solutions variables list */
	def int getIndexOfAbsoluteUtilizationInSolutionVariablesList(Core c) {
		return solutionVariables.indexOf(absoluteCoreUtilizationList.get(c))
	}
	
	/** Returns the variable which contains the absolute ram utilization for the given board */
	def IntVar getAbsoluteRamUtilizationVariable(Board b) {
		return absoluteRamUtilizationList.get(b)
	}
	
	/** Returns the index of the absolute ram utilization variable of a given board in the solutions variables list */
	def int getIndexOfAbsoluteRamUtilizationInSolutionVariablesList(Board b) {
		return solutionVariables.indexOf(absoluteRamUtilizationList.get(b))
	}
	
	/** Returns the variable which contains the absolute ram utilization for the given board */
	def IntVar getAbsoluteRomUtilizationVariable(Board b) {
		return absoluteRomUtilizationList.get(b)
	}
	
	/** Returns the index of the absolute ram utilization variable of a given board in the solutions variables list */
	def int getIndexOfAbsoluteRomUtilizationInSolutionVariablesList(Board b) {
		return solutionVariables.indexOf(absoluteRomUtilizationList.get(b))
	}
}
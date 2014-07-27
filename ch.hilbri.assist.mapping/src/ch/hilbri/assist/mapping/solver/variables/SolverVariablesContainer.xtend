package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Thread
import java.util.ArrayList
import java.util.HashMap
import org.jacop.core.IntVar
import org.jacop.core.Store

@Data class SolverVariablesContainer {
	
	/** A list of location variables for each thread (and each system layer) */
	HashMap<Thread, HashMap<Integer, IntVar>> 	threadLocationVariablesList	= new HashMap 
	
	/** A list of variables; a variable for each core which contains the absolute utilization */
	HashMap<Core, IntVar>						absoluteCoreUtilizationList = new HashMap
	
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
		for (c : model.allCores) {
			absoluteCoreUtilizationList.put(c, new IntVar(constraintStore, "AbsUtilization-" + c.name, 0, c.capacity))
		}
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

//	private ThreadVariablesList threadVariablesList;
//	
//	private CoreVariablesList coreVariablesList;
//	
//	private ExclusiveAdapterRequirementVariablesList exclusiveAdapterVariablesList;
//	
//	private SharedAdapterRequirementVariablesList sharedAdapterVariablesList;
//	
//	private CommunicationVariablesList communicationVariablesList;
//	
//	private IOAdapterVariablesList ioAdapterVariablesList;
//	
//	private SolutionVariablesList solutionVariablesList;
//
//		/* Create the set of Variables needed for a Thread */
//		this.threadVariablesList = new ThreadVariablesList(model, constraintSystem);
//		
//		this.coreVariablesList = new CoreVariablesList(model);
//		
//		this.exclusiveAdapterVariablesList = new ExclusiveAdapterRequirementVariablesList(model, this.threadVariablesList);
//		
//		this.sharedAdapterVariablesList = new SharedAdapterRequirementVariablesList(model, this.threadVariablesList);
//		
//		this.communicationVariablesList = new CommunicationVariablesList(model, constraintSystem);
//		
//		this.ioAdapterVariablesList = new IOAdapterVariablesList(model, constraintSystem);
		
	
}
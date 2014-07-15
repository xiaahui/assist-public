package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Thread
import java.util.ArrayList
import java.util.HashMap
import org.jacop.core.IntVar
import org.jacop.core.Store

@Data class SolverVariablesContainer {
	
	HashMap<Thread, HashMap<Integer, IntVar>> 	threadLocationVariablesList	= new HashMap 
	
	/* CONSTRUCTOR */
	new (AssistModel model, Store constraintStore) {
		
		/* Initialize the hash map for all location variables */
		for (t : model.allThreads) {
			val m = new HashMap<Integer, IntVar>
			for (var i = 1; i <= model.hardwareLevelCount; i++) {
				/* Create a new location variable for each thread;
				 * initialize its domain to 0 .. size of hardware elements -1 in this level */
				m.put(i, new IntVar(constraintStore, "LocVar-" + t.name + "-level-" + i, 1, model.getAllHardwareElements(i).size))
			}
			threadLocationVariablesList.put(t, m)
		}
	}

	def IntVar[] getSolutionVariables() {
		val list = new ArrayList<IntVar>

		// Alle ThreadLocationVariables sind SolutionVariables
		for (threadKey : threadLocationVariablesList.keySet)
			for (levelKey : threadLocationVariablesList.get(threadKey).keySet)
				list.add(threadLocationVariablesList.get(threadKey).get(levelKey))		
		 
		return list
	}
	
	def IntVar getThreadLocationVariable(Thread t, int level) {
		return threadLocationVariablesList.get(t).get(level)
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
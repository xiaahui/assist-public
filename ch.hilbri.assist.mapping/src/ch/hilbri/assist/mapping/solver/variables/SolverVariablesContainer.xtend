package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Thread
import java.util.ArrayList
import java.util.HashMap
import org.jacop.core.IntVar
import org.jacop.core.Store

@Data class SolverVariablesContainer {
	
	ArrayList<IntVar> 							solutionVariablesList 		= new ArrayList
	
	HashMap<Thread, HashMap<Integer, IntVar>> 	threadLocationVariablesList	= new HashMap 
	
	/* CONSTRUCTOR */
	new (AssistModel model, Store constraintStore) {
		
		/* Initialize the hash map for all location variables */
		for (t : model.allThreads) {
			val m = new HashMap<Integer, IntVar>
			for (var i = 0; i < model.hardwareLevelCount; i++) {
				/* Create a new location variable for each thread;
				 * initialize its domain to 0 .. size of hardware elements in this level */
				m.put(i, new IntVar(constraintStore, "LocVar-" + t.name, 0, model.getAllHardwareElements(i).size))
			}
			threadLocationVariablesList.put(t, m)
		}
	}

	

	def IntVar[] getSolutionVariablesAsArray() { 
		return solutionVariablesList.toArray().map[it as IntVar]
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
}
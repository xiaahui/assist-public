package ch.hilbri.assist.mapping.solver.variables

import java.util.ArrayList
import org.jacop.core.IntVar

@Data class SolverVariablesContainer {
	
	ArrayList<IntVar> solutionVariablesList = new ArrayList
	
	def IntVar[] getSolutionVariablesAsArray() { 
		return solutionVariablesList.toArray().map[it as IntVar]
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
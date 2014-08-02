package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.jacop.constraints.XeqY
import org.jacop.core.Store

class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("All threads of an applications should be on the same board", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		for (application : model.applications) {
			if (application.threads.size > 1) {
				for (i : 0 ..< application.threads.size - 1) {
					val var1 = solverVariables.getThreadLocationVariable(application.threads.get(i), HardwareArchitectureLevelType.BOARD_VALUE)
					val var2 = solverVariables.getThreadLocationVariable(application.threads.get(i+1), HardwareArchitectureLevelType.BOARD_VALUE)			
					constraintStore.impose(new XeqY(var1, var2))
				}
			} 
		}
				
		return true
	}
	
}
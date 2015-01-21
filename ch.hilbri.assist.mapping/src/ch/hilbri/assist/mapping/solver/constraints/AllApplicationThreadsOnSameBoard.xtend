package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF

class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("All threads of an applications should be on the same board", model, solver, solverVariables)
	}
	
	override generate() {
		
		for (application : model.applications) {
			if (application.threads.size > 1) {
				for (i : 0 ..< application.threads.size - 1) {
					val var1 = solverVariables.getThreadLocationVariable(application.threads.get(i), HardwareArchitectureLevelType.BOARD_VALUE)
					val var2 = solverVariables.getThreadLocationVariable(application.threads.get(i+1), HardwareArchitectureLevelType.BOARD_VALUE)			
					solver.post(ICF.arithm(var1, "=", var2))
				}
			} 
		}
				
		return true
	}
	
}
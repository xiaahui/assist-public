package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.datamodel.model.Thread
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.allapplicationthreadsonsameboard.TwoThreadsCannotBeDeployedToSameBoard

class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("all applications's threads on the same board", model, solver, solverVariables)
	}
	
	override generate() {
		for (application : model.applications) {
			if (application.threads.size > 1) {
				for (i : 0 ..< application.threads.size - 1) {
					val var1 = solverVariables.getThreadLocationVariable(application.threads.get(i), HardwareArchitectureLevelType.BOARD_VALUE)
					val var2 = solverVariables.getThreadLocationVariable(application.threads.get(i+1), HardwareArchitectureLevelType.BOARD_VALUE)			
					solver.post(ICF.arithm(var1, "=", var2))
					propagate(application.threads.get(i),application.threads.get(i+1))
				}
			} 
		}
		return true
	}
	
	def propagate(Thread t1, Thread t2) {
		try { solver.propagate() }
		catch (ContradictionException e) { 
			throw new TwoThreadsCannotBeDeployedToSameBoard(this, t1, t2)
		}
	}
	
}
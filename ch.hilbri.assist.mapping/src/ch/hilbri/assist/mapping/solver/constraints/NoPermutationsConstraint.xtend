package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF

class NoPermutationsConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("No permutations of threads", model, solver, solverVariables)
	}
	
	override generate() {
		for (app : model.applications) {
			if (app.threads.size > 1) {
				for (i : 0 ..< app.threads.size) {
					for (j : i+1 ..< app.threads.size) {
						val var1 = solverVariables.getThreadLocationVariable(app.threads.get(i), HardwareArchitectureLevelType.CORE_VALUE)
						val var2 = solverVariables.getThreadLocationVariable(app.threads.get(j), HardwareArchitectureLevelType.CORE_VALUE)
						
						solver.post(ICF.arithm(var1, "<=", var2))
					}
				}
			}
		}
		return true
	}
	
}
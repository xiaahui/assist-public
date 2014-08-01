package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.jacop.constraints.XlteqY
import org.jacop.core.Store
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class NoPermutationsConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("No permutations of threads", model, constraintStore, solverVariables)
	}
	
	override generate() {
		for (app : model.applications) {
			if (app.threads.size > 1) {
				for (i : 0 ..< app.threads.size) {
					for (j : i+1 ..< app.threads.size) {
						val var1 = solverVariables.getThreadLocationVariable(app.threads.get(i), HardwareArchitectureLevelType.CORE_VALUE)
						val var2 = solverVariables.getThreadLocationVariable(app.threads.get(j), HardwareArchitectureLevelType.CORE_VALUE)
						
						constraintStore.impose(new XlteqY(var1, var2))
					}
				}
			}
		}
		return true
	}
	
}
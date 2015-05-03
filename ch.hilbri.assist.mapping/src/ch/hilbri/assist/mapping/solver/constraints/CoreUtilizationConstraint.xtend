package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class CoreUtilizationConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("core capacity", model, solver, solverVariables)
	}

	override generate() {

		/* **** Preparations **** */
		/* How much processing capacity does each core offer? */
		val int[] allCoreCapacities = model.allCores.map[capacity]

		/* How much processing capacity does each thread need? */
		val int[] allCoreUtilization = model.allThreads.map[coreUtilization]

		// - create the total sum of core utilization of all applications (+ threads)
		val totalCoreUtilization = allCoreUtilization.reduce[p1, p2|p1 + p2]

		if (totalCoreUtilization <= allCoreCapacities.min) {
			return false
		}

		/* **** Preparing the constraints **** */
		/* 0. The total sum of all threads's core utilization should
		 *    be less than the total sum of all core capacities
		 *    (This is a valid approach, because each applications core utilization is specified independently from the core)
		 */
		if (totalCoreUtilization > allCoreCapacities.reduce[p1, p2|p1 + p2]) {
			throw new BasicConstraintsException(this)
		}

		/*
		 * 1. The sum of the utilization of all applications on each core
		 *    must not exceed its capabilities 
		 */
		val locationVars = model.allThreads.map[t|
			solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.CORE_VALUE)]
		val utilizationVars = model.allCores.map[c|solverVariables.getAbsoluteCoreUtilizationVariable(c)]
		solver.post(ICF.bin_packing(locationVars, allCoreUtilization, utilizationVars, 0))

		try {
			solver.propagate
		} catch (ContradictionException e) {
			throw new BasicConstraintsException(this)
		}

		return true
	}

}

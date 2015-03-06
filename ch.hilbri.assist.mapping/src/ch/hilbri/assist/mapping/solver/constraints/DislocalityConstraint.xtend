package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedDislocally

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dislocality", model, solver, solverVariables)
	}
	
	override generate() {

		for (r : model.dislocalityRelations) {
			
			var int level
			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) 		level = 0
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC)			level = 1
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT)	level = 2
			
			/* level needs to be final */
			val l = level
			
			/* Retrieve the list of all location variables for this level */
			val varList = r.eqInterfaceGroup.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
			
			/* Only post if there are actually elements in it */
			if (varList.size > 1) {
				try { solver.propagate }
				catch (ContradictionException e) {
					throw new InterfaceGroupCannotBeMappedDislocally(this, r.eqInterfaceGroup)
				}
			}
		}

		return true
	}
}
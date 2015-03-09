package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar

class ApplicationProximityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("application proximity (on same)", model, solver, solverVariables)
	}
	
	override generate() {
		for (r : model.colocalityRelations) {
			
			var int level
			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) 		level = 0
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC)			level = 1
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT)	level = 2
			
			var IntVar first = null
			
			for (g : r.eqInterfaceGroups)
				for (iface : g.eqInterfaces) {
					if (first == null) first = solverVariables.getEqInterfaceLocationVariable(iface, level)
					else solver.post(ICF.arithm(first, "=", solverVariables.getEqInterfaceLocationVariable(iface, level)))
				}

			try { solver.propagate }
			catch (ContradictionException e) { throw new BasicConstraintsException(this) }
		}
		return true
	}
	
	
}
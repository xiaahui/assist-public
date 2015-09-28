package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedColocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException

/**
 * This constraints ensures that interfaces are mapped colocally with other
 * interfaces on the same hardware resource; this could mean: compartments,
 * RDCs or connectors 
 * 
 * Colocality for pins is not allowed in the input specification grammar as
 * it makes no sense, because only one interface can be mapped to a single pin
 */

class ColocalityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface colocality", model, solver, solverVariables)
	}
	
	override generate() {
		if (model.colocalityRelations.isNullOrEmpty) return false
		
		for (r : model.colocalityRelations) {
			
			val ifaces = r.allInterfaces.toSet
			val ifaceVarList = ifaces.map[solverVariables.getEqInterfaceLocationVariable(it, r.hardwareLevel)]
			
			if (ifaceVarList.size > 1) {
			
				for (int ifaceIdx : 1 ..< ifaceVarList.size) 
					solver.post(ICF.arithm(ifaceVarList.get(0), "=", ifaceVarList.get(ifaceIdx)))
			
				try { solver.propagate }
				catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedColocally(this, r.allEqInterfaceOrGroupNames, r.hardwareLevel.literal) }
			}
		}
		return true
	}
}
package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedColocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException

class ColocalityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface colocality (on same)", model, solver, solverVariables)
	}
	
	override generate() {
		if (model.colocalityRelations.isNullOrEmpty) return false
		
		for (r : model.colocalityRelations) {
			
			val list = solverVariables.getColocationVariables(r)
			if (list.size > 1) {
				for (int ifaceIdx : 1 ..< list.size) {
					solver.post(ICF.arithm(list.get(0), "=", list.get(ifaceIdx)))
				}
				try { solver.propagate }
				catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedColocally(this, r.allEqInterfaceOrGroupNames, r.hardwareLevel.literal) }
			}
		}
		return true
	}
}
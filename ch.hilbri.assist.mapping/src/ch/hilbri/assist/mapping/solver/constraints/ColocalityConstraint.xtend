package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedColocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
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
			
			var int level
			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) 		level = 0
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC)			level = 1
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT)	level = 2
			
			
			val list = new ArrayList<EqInterface>
			for (ifaceOrGroup : r.eqInterfaceOrGroups)
				if (ifaceOrGroup instanceof EqInterface) 			list.add(ifaceOrGroup)
				else if (ifaceOrGroup instanceof EqInterfaceGroup)	list.addAll(ifaceOrGroup.eqInterfaces)
			
			if (list.size > 1) {
				for (int ifaceIdx : 1 ..< list.size)
					solver.post(
						ICF.arithm(solverVariables.getEqInterfaceLocationVariable(list.get(0),        level), "=", 
								   solverVariables.getEqInterfaceLocationVariable(list.get(ifaceIdx), level)
					))
			
				try { solver.propagate }
				catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedColocally(this, r.allEqInterfaceOrGroupNames, r.hardwareLevel.literal) }
			}
		}
		return true
	}
}
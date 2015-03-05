package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples


class SystemHierarchyConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, solver, solverVariables)
	}
	
	override generate() {
		
		val tuples = new Tuples(true)

		// tuples bauen
		for (int connIdx : 0 ..< model.allConnectors.length) {
				val rdcIdx 	= model.allRDCs.indexOf(model.allConnectors.get(connIdx).eContainer)
				val compIdx = model.allCompartments.indexOf(model.allConnectors.get(connIdx).eContainer.eContainer)
				tuples.add(connIdx, rdcIdx, compIdx) 
		}

		// table constraints bauen		
		for (iface : model.eqInterfaces) {
			val varConn = solverVariables.getEqInterfaceLocationVariable(iface, 0)
			val varRdc = solverVariables.getEqInterfaceLocationVariable(iface, 1)
			val varComp = solverVariables.getEqInterfaceLocationVariable(iface, 2)
			
			val varList = #[varConn, varRdc, varComp]
			
			solver.post(ICF.table(varList, tuples, "GAC3rm+"))	
		}
		
		propagate()
		
		return true
	}
	
}
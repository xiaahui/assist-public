package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.util.tools.ArrayUtils

class SystemHierarchyConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, solver, solverVariables)
	}

	override generate() {

		// channeling for connectors
		val connectorIndicators = solverVariables.getInterfaceConnectorIndicatorVariables()
		for (int i : 0 ..< model.allEqInterfaces.length) {
			val intVar = solverVariables.getEqInterfaceLocationVariable(model.allEqInterfaces.get(i), 0)
			solver.post(ICF.boolean_channeling(ArrayUtils.getColumn(connectorIndicators, i), intVar, 0));
		}

		// building allowed tuples
		val tuples = new Tuples(true)
		for (int connIdx : 0 ..< model.allConnectors.length) {
			val rdcIdx = model.allRDCs.indexOf(model.allConnectors.get(connIdx).eContainer)
			val compIdx = model.allCompartments.indexOf(model.allConnectors.get(connIdx).eContainer.eContainer)
			tuples.add(connIdx, rdcIdx, compIdx)
		}

		// building table constraints reflecting the location hierarchy		
		for (iface : model.eqInterfaces) {
			val varList = #[0, 1, 2].map(l|solverVariables.getEqInterfaceLocationVariable(iface, l))

			solver.post(ICF.table(varList, tuples, ""))
		}

		propagate()

		return true
	}

}

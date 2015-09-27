package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.slf4j.LoggerFactory

/**
 * This constraint is just responsible for building the system hierarchy,
 * the valid "connections" between the various hardware levels:
 * pin-level, connector-level, rdc-level, compartment-level
 */
class SystemHierarchyConstraint extends AbstractMappingConstraint {

	/* Constructor */
	new(AssistModel p_model, Solver p_solver, SolverVariablesContainer p_solverVariables) {
		super("system hierarchy", p_model, p_solver, p_solverVariables)
		logger = LoggerFactory.getLogger(this.class)
	}

	/* Constraint Building Routine */
	override generate() {

		// building allowed tuples
		val tuples = new Tuples(true)
		
		for (int pinIdx : 0 ..< model.pins.length) {
			val conIdx 	= model.connectors.indexOf(model.pins.get(pinIdx).eContainer) 
			val rdcIdx 	= model.RDCs.indexOf(model.pins.get(pinIdx).eContainer.eContainer)
			val comIdx 	= model.compartments.indexOf(model.pins.get(pinIdx).eContainer.eContainer.eContainer)
			tuples.add(pinIdx, conIdx, rdcIdx, comIdx)
		}

		// building table constraints reflecting the location hierarchy		
		for (iface : model.eqInterfaces) {
			val varList = #[0, 1, 2, 3].map(level | solverVariables.getEqInterfaceLocationVariable(iface, level))
			solver.post(ICF.table(varList, tuples, ""))
		}

		propagate

		true
	}
}


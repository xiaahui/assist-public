package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF

class SystemHierarchyConstraint extends AbstractMappingConstraint {
	
	private boolean isMinimizeEnabled
	private boolean useTableConstraintsForSystemHierarchy = true

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables, boolean isMinimizeEnabled) {
		super("system hierarchy", model, solver, solverVariables)
		this.isMinimizeEnabled = isMinimizeEnabled
	}

	override generate() {

		if (useTableConstraintsForSystemHierarchy) {
			// building allowed tuples
			val tuples = new Tuples(true)
			for (int connIdx : 0 ..< model.connectors.length) {
				val rdcIdx = model.RDCs.indexOf(model.connectors.get(connIdx).eContainer)
				val compIdx = model.compartments.indexOf(model.connectors.get(connIdx).eContainer.eContainer)
				tuples.add(connIdx, rdcIdx, compIdx)
			}

			// building table constraints reflecting the location hierarchy		
			for (iface : model.eqInterfaces) {
				val varList = #[0, 1, 2].map(l|solverVariables.getEqInterfaceLocationVariable(iface, l))

				solver.post(ICF.table(varList, tuples, ""))
			}
		} 
		
		// Use Element Constraint for system hierarchy
		else {
			val connector2rdcTable = model.connectors.map[model.RDCs.indexOf(it.rdc)]
			val rdc2compartmentTable = model.RDCs.map[model.compartments.indexOf(it.compartment)]

			for (iface : model.eqInterfaces) {
			
				val connVar = solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.CONNECTOR)
				val rdcVar 	= solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.RDC)
				val compVar = solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.COMPARTMENT)
			
				solver.post(ACF.element(rdcVar, connector2rdcTable, connVar))
				solver.post(ACF.element(compVar, rdc2compartmentTable, rdcVar))
			}
		}

		if (isMinimizeEnabled) {
			
			// Minimize amount of used RDCs
			solver.post(ICF.atmost_nvalues(solverVariables.getLocationVariables(1), solverVariables.optimizationVariables.get(0), false))


			// Minimize cable length
			val cableVars = new ArrayList<IntVar>

			for (iface : model.eqInterfaces) {

				val ifaceVar = solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.RDC)
				
				val cableLengthTable = model.RDCs.map[rdc | 	Math.abs(iface.resourceX - rdc.resourceX) +
																Math.abs(iface.resourceY - rdc.resourceY) + 
																Math.abs(iface.resourceZ - rdc.resourceZ)]

				val cableVar = VF.enumerated("Cable-" + iface.name, 0, cableLengthTable.max, solver)
				solver.post(ACF.element(cableVar, cableLengthTable, ifaceVar))
			}

			solver.post(ICF.sum(cableVars, solverVariables.optimizationVariables.get(1)))
		
		} // isMinimizeEnabled?
	
		propagate()

		return true
	}

}

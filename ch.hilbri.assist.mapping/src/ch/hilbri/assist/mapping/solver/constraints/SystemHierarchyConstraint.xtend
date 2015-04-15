package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
<<<<<<< HEAD
import org.chocosolver.util.tools.ArrayUtils
import org.chocosolver.solver.constraints.^extension.Tuples
import org.eclipse.emf.ecore.EObject
=======
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
>>>>>>> refs/heads/airbus-rdc

class SystemHierarchyConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, solver, solverVariables)
	}

	override generate() {

<<<<<<< HEAD
		// channeling for boards
		val boardIndicators = solverVariables.getThreadBoardIndicatorVariables()
		for (var i = 0; i < model.allThreads.size; i++) {
			val intVar = solverVariables.getThreadLocationVariable(model.allThreads.get(i),
				HardwareArchitectureLevelType.BOARD_VALUE)
			solver.post(ICF.boolean_channeling(ArrayUtils.getColumn(boardIndicators, i), intVar, 0));
		}

		// building allowed tuples
		val tuples = new Tuples(true)
		val cores = model.getAllHardwareElements(HardwareArchitectureLevelType.CORE_VALUE)
		for (int coreIdx : 0 ..< cores.length) {
			var elem = cores.get(coreIdx) as EObject
			var index = newArrayList(coreIdx)
			for (levelCtr : HardwareArchitectureLevelType.CORE_VALUE + 1 .. model.hardwareLevelCount) {
				index.add(model.getAllHardwareElements(levelCtr).indexOf(elem.eContainer))
				elem = elem.eContainer
			}
			tuples.add(index)
		}

		// building table constraints reflecting the location hierarchy		
		val levels = HardwareArchitectureLevelType.CORE_VALUE .. model.hardwareLevelCount
		for (t : model.allThreads) {
			val varList = levels.map(l|solverVariables.getThreadLocationVariable(t, l))
			solver.post(ICF.table(varList, tuples, ""))
		}
=======
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

		solver.post(ICF.atmost_nvalues(solverVariables.getLocationVariables(1), solverVariables.optimizationVariables.get(0), false))

		val cableVars = new ArrayList<IntVar>
		for (iface: model.eqInterfaces) {
			val cableTuples = new Tuples(true)
			val ifaceVar = solverVariables.getEqInterfaceLocationVariable(iface, 1)
			var maxLength = 0
			for (rdcIdx: 0..<model.allRDCs.size) {
				val rdc = model.allRDCs.get(rdcIdx)
				val cableLength = Math.abs(iface.resourceX - rdc.resourceX) +
 							      Math.abs(iface.resourceY - rdc.resourceY) +
								  Math.abs(iface.resourceZ - rdc.resourceZ)
				if (cableLength > maxLength) {
					maxLength = cableLength
				}
				cableTuples.add(rdcIdx, cableLength)
			}
			val cableVar = VF.bounded("Cable-" + iface.name, 0, maxLength, solver)
			solver.post(ICF.table(ifaceVar, cableVar, cableTuples, ""))
			cableVars.add(cableVar)
		}
		solver.post(ICF.sum(cableVars, solverVariables.optimizationVariables.get(1)))
>>>>>>> refs/heads/airbus-rdc

		propagate()

		return true
	}

}

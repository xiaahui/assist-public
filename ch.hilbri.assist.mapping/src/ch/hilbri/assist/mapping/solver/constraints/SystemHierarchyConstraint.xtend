package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver

class SystemHierarchyConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("system hierarchy", model, solver, solverVariables)
	}

	override generate() {

//		// channeling for boards
//		val boardIndicators = solverVariables.getThreadBoardIndicatorVariables()
//		for (var i = 0; i < model.allThreads.size; i++) {
//			val intVar = solverVariables.getThreadLocationVariable(model.allThreads.get(i),
//				HardwareArchitectureLevelType.BOARD_VALUE)
////			solver.post(ICF.boolean_channeling(ArrayUtils.getColumn(boardIndicators, i), intVar, 0));
//		}
//
//		// building allowed tuples
//		val tuples = new Tuples(true)
//		val cores = model.getAllHardwareElements(HardwareArchitectureLevelType.CORE_VALUE)
//		for (int coreIdx : 0 ..< cores.length) {
//			var elem = cores.get(coreIdx) as EObject
//			var index = newArrayList(coreIdx)
//			for (levelCtr : HardwareArchitectureLevelType.CORE_VALUE + 1 .. model.hardwareLevelCount) {
//				index.add(model.getAllHardwareElements(levelCtr).indexOf(elem.eContainer))
//				elem = elem.eContainer
//			}
//			tuples.add(index)
//		}
//
//		// building table constraints reflecting the location hierarchy		
//		val levels = HardwareArchitectureLevelType.CORE_VALUE .. model.hardwareLevelCount
//		for (t : model.allThreads) {
//			val varList = levels.map(l|solverVariables.getThreadLocationVariable(t, l))
////			solver.post(ICF.table(varList, tuples, ""))
//		}
//
//		propagate()

		return true
	}

}

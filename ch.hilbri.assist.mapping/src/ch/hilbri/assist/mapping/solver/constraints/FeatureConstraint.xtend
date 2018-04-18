package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model

class FeatureConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("feature", model, chocoModel, solverVariables)
	}

	override generate() {
//		val minLevel = IOAdapterProtectionLevelType.values.min
//		val usedTypes = IOAdapterType.values.filter[s|
//			!model.allThreads.filter[getExclusiveAdapterRequestCount(s, minLevel) > 0].empty]
//		if (usedTypes.empty) {
//			return false
//		}
//		generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints()
//		generate_MultipleThreads_ExclusiveRequests_incl_ProtectionLevel_Constraints(usedTypes)
		return true
	}

//	def generate_MultipleThreads_ExclusiveRequests_incl_ProtectionLevel_Constraints(IOAdapterType[] usedTypes) {
//		for (bIdx : 0 ..< model.allBoards.size) {
//
//			/* Contains a boolean factor for the weighted sum - is this thread mapped to this board? 
//			 * The index of this list corresponds to the thread index 
//			 * factorList[thread] = true/false <-- is this thread mapped to board b? */
//			val b = model.allBoards.get(bIdx)
//			val factorList = solverVariables.getThreadBoardIndicatorVariables().get(bIdx)
//
//			for (type : usedTypes) {
//				for (level : IOAdapterProtectionLevelType.values) {
//
//					// how many adapters does this board have for the type and level
//					val suiteableIOAdapterCountVar = VF.enumerated(
//						"SuiteableIOAdapterCount-" + b.name + "-" + type + "-" + level, 0,
//						b.getSuitableAdapterCount(type, level), solver)
//
//					// how many io requests with the given type and minimum protection level does each thread require?
//					val requestCountForEachThreadWithProtectionLevelAndType = model.allThreads.map[
//						getExclusiveAdapterRequestCount(type, level)]
//
//					// Define the sum to constrain the deployment
//					solver.post(
//						ICF.scalar(factorList, requestCountForEachThreadWithProtectionLevelAndType, "=",
//							suiteableIOAdapterCountVar))
//
//					try {
////						solver.propagate
//					} catch (ContradictionException e) {
//						throw new BasicConstraintsException(this)
//					}
//
//				}
//			}
//		}
//	}

//	def generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
//		for (t : model.allThreads) {
//			for (exReq : t.application.ioAdapterRequirements.filter[isIsExclusiveOnly]) {
//				// Create a list for each board with the number of suitable adapters which satisfy type and protection level
//				// suiteableAdapterCountPerBoardList[board] = # suiteable adapters w.r.t. type and protection level
//				val suiteableAdapterCountPerBoardList = model.allBoards.map[
//					getSuitableAdapterCount(exReq.adapterType, t.application.ioAdapterProtectionLevel)]
//
//				// Create a new variable with these values as a default domain
//				val suiteableAdapterCountPerBoardVariable = VF.enumerated(
//					"IOVar-" + t.name + "-" + exReq.adapterType + "-" + t.application.ioAdapterProtectionLevel,
//					suiteableAdapterCountPerBoardList.sort, solver)
//
//				/* To which board can we map this thread? */
//				val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t,
//					HardwareArchitectureLevelType.BOARD_VALUE)
//
//				// Link the location variables to the adapterCountVariable
//				solver.post(
//					ICF.element(suiteableAdapterCountPerBoardVariable, suiteableAdapterCountPerBoardList,
//						threadLocationsBoardLevel))
//
//				// Impose constraints on the adapterCountVariable
//				solver.post(ICF.arithm(suiteableAdapterCountPerBoardVariable, ">=", exReq.requiredAdapterCount))
//
//				try {
//					solver.propagate
//				} catch (ContradictionException e) {
//					throw new BasicConstraintsException(this)
//				}
//			}
//		}
//	}

}
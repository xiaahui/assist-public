package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import solver.Solver
import solver.constraints.ICF
import solver.variables.BoolVar
import solver.variables.IntVar
import solver.variables.VF

class ROMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("ROM capacity constraints", model, solver, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much ROM capacity does each board offer? */
		val int[] allRomCapacities = model.allBoards.map[romCapacity]
		
			
		/* Create a set of variables - for each thread a variable which contains the power capabilties of all cores	 */
		val IntVar[] romCapacities = model.allThreads.map[VF.enumerated("RomCap", allRomCapacities.sort, solver)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's rom utilizations should
		 *    be less than the total sum of all rom capacities
		 */
		
		// - create the total sum of rom utilizations of all applications (threads!)
		val totalRomUtilizationFromAllApplicationsVar = VF.fixed("TotalRomUtil", model.allThreads.map[application.romUtilization].reduce[p1, p2 | p1 + p2], solver)
		
		// - create the total sum of all rom capacities
		val totalRomCapacityVar = VF.fixed("TotalRomCap", model.allBoards.map[romCapacity].reduce[p1, p2 | p1 + p2], solver)
		
		// - enforce that the capacity is always larger than the demand
		solver.post(ICF.arithm(totalRomCapacityVar, ">=", totalRomUtilizationFromAllApplicationsVar))
		
		/* 1. If an application requires more rom than a board offers, 
		 *    the application (thread) cannot be mapped to this board
		 */

		for (thread : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevelVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
			
			/* Which rom capacities are still available to use for the mapping of a thread? */
			val threadAvailableRomCapacitiesVar = romCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available rom capacities */
			solver.post(ICF.element(threadAvailableRomCapacitiesVar, allRomCapacities, threadLocationsBoardLevelVar))
			
			/* Impose that the rom capacity of the board must be greater than the required capacity of the thread */
			solver.post(ICF.arithm(threadAvailableRomCapacitiesVar, ">=", thread.application.romUtilization))
		}
		
		/*
		 * 2. The sum of the rom utilizations of all applications on each board
		 *    must not exceed its rom capabilities 
		 */
		for (board : model.allBoards) {
			
			val factorList = new ArrayList<BoolVar>
			val utilizationList = new ArrayList<Integer>()
			
			for (thread : model.allThreads) {

				val threadLocationsBoardLevel 	= solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
				val delta 						= VF.bool("d-" + thread.name + "-" + board.name, solver)   // is this thread being deployed to this board?
				val constraint 					= ICF.arithm(threadLocationsBoardLevel, "=", model.allBoards.indexOf(board))
				constraint.reifyWith(delta) 		
			
				factorList.add(delta)
				utilizationList.add(thread.application.romUtilization)				
			}
			
			solver.post(ICF.scalar(factorList, utilizationList, "=", solverVariables.getAbsoluteRomUtilizationVariable(board)))	
		}
		
		
		return true
	}
}
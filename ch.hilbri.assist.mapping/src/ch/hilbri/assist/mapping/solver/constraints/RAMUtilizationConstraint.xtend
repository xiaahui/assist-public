package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF

class RAMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("RAM capacity constraints", model, solver, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much RAM capacity does each board offer? */
		val int[] allRamCapacities = model.allBoards.map[ramCapacity]
		
		/* Create a set of variables - for each thread a variable which contains the power capabilties of all cores	 */
		val IntVar[] ramCapacities = model.allThreads.map[VF.enumerated("RamCap", allRamCapacities.sort, solver)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's ram utilizations should
		 *    be less than the total sum of all ram capacities
		 */
		
		// - create the total sum of ram utilizations of all applications (threads!)
		val totalRamUtilizationFromAllApplicationsVar = VF.fixed("TotalRamUtil", model.allThreads.map[application.ramUtilization].reduce[p1, p2 | p1 + p2], solver)
		
		// - create the total sum of all ram capacities
		val totalRamCapacityVar = VF.fixed("TotalRamCap", model.allBoards.map[ramCapacity].reduce[p1, p2 | p1 + p2], solver)
		
		// - enforce that the capacity is always larger than the demand
		solver.post(ICF.arithm(totalRamCapacityVar, ">=", totalRamUtilizationFromAllApplicationsVar))
		
		
		/* 1. If an application requires more ram than a board offers, 
		 *    the application (thread) cannot be mapped to this board
		 */

		for (thread : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevelVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
			
			/* Which ram capacities are still available to use for the mapping of a thread? */
			val threadAvailableRamCapacitiesVar = ramCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available ram capacities */
			solver.post(ICF.element(threadAvailableRamCapacitiesVar, allRamCapacities, threadLocationsBoardLevelVar))
			
			/* Impose that the ram capacity of the board must be greater than the required capacity of the thread */
			solver.post(ICF.arithm(threadAvailableRamCapacitiesVar, ">=", thread.application.ramUtilization))
		}
		
		/*
		 * 2. The sum of the ram utilizations of all applications on each board
		 *    must not exceed its ram capabilities 
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
				utilizationList.add(thread.application.ramUtilization)				
			}
			
			solver.post(ICF.scalar(factorList, utilizationList, "=", solverVariables.getAbsoluteRamUtilizationVariable(board)))	
		}
		
		propagate()
		
		return true
	}
	
}
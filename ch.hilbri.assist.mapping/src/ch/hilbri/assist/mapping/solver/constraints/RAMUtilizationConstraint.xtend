package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.exceptions.InsufficientTotalRAMException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar

class RAMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("ram capacity", model, solver, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much RAM capacity does each board offer? */
		val int[] allRamCapacities = model.allBoards.map[ramCapacity]
		
		val totalRamUtilization = model.allThreads.map[application.ramUtilization].reduce[p1, p2 | p1 + p2]
		
		if (totalRamUtilization <= allRamCapacities.min) {
			return false
		}
		
		/* Create a set of variables - for each thread a variable which contains the RAM capacities of all cores	 */
//		val IntVar[] ramCapacities = model.allThreads.map[VF.enumerated("RamCap", allRamCapacities.sort, solver)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's ram utilizations should
		 *    be less than the total sum of all ram capacities
		 */
		
		if (totalRamUtilization > allRamCapacities.reduce[p1, p2 | p1 + p2]) {
			throw new InsufficientTotalRAMException(this)
		}
		
		/* 1. If an application requires more ram than a board offers, 
		 *    the application (thread) cannot be mapped to this board
		 */

		for (thread : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevelVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
			
			/* Which ram capacities are still available to use for the mapping of a thread? */
//			val threadAvailableRamCapacitiesVar = ramCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available ram capacities */
//			solver.post(ICF.element(threadAvailableRamCapacitiesVar, allRamCapacities, threadLocationsBoardLevelVar))
			
			/* Impose that the ram capacity of the board must be greater than the required capacity of the thread */
//			solver.post(ICF.arithm(threadAvailableRamCapacitiesVar, ">=", thread.application.ramUtilization))
			
//			try { solver.propagate }
//			catch (ContradictionException e) { throw new BasicConstraintsException(this)}
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
//				val delta 						= VF.bool("d-" + thread.name + "-" + board.name, solver)   // is this thread being deployed to this board?
//				val constraint 					= ICF.arithm(threadLocationsBoardLevel, "=", model.allBoards.indexOf(board))
//				constraint.reifyWith(delta) 		
			
//				factorList.add(delta)
//				utilizationList.add(thread.application.ramUtilization)				
			}
			
//			solver.post(ICF.scalar(factorList, utilizationList, "=", solverVariables.getAbsoluteRamUtilizationVariable(board)))
			
//			try { solver.propagate }
//			catch (ContradictionException e) { throw new BasicConstraintsException(this)}	
		}
		
		propagate()
		
		return true
	}
	
}
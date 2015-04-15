package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.romcapacity.BoardHasInsufficientROMForAllItsApplications
import ch.hilbri.assist.mapping.solver.exceptions.romcapacity.NoBoardHasEnoughROMForThisApplication
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import ch.hilbri.assist.mapping.solver.exceptions.romcapacity.InsufficientTotalROMException

class ROMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("rom capacity", model, solver, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much ROM capacity does each board offer? */
		val int[] allRomCapacities = model.allBoards.map[romCapacity]
		
		val totalRomUtilization = model.allThreads.map[application.romUtilization].reduce[p1, p2 | p1 + p2]
		
		if (totalRomUtilization <= allRomCapacities.min) {
			return false
		}
		
		/* Create a set of variables - for each thread a variable which contains the ROM capacities of all cores	 */
		val IntVar[] romCapacities = model.allThreads.map[VF.enumerated("RomCap", allRomCapacities.sort, solver)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's rom utilizations should
		 *    be less than the total sum of all ram capacities
		 */
		
		if (totalRomUtilization > allRomCapacities.reduce[p1, p2 | p1 + p2]) {
			throw new InsufficientTotalROMException(this)
		}
		
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
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new NoBoardHasEnoughROMForThisApplication(this, thread.application)}
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
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new BoardHasInsufficientROMForAllItsApplications(this, board)}		
		}
		
		propagate()
		
		return true
	}
}
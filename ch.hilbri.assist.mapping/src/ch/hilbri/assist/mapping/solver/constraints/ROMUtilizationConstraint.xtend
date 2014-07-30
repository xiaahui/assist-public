package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.jacop.constraints.Element
import org.jacop.constraints.Reified
import org.jacop.constraints.SumWeight
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgteqC
import org.jacop.constraints.XgteqY
import org.jacop.core.BooleanVar
import org.jacop.core.BoundDomain
import org.jacop.core.IntVar
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class ROMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("ROM capacity constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much ROM capacity does each board offer? */
		val int[] allRomCapacities = model.allBoards.map[ it | it.romCapacity]
		
		/* Create a domain for integer variables which contain the rom capacities */		
		val romCapacitiesDomain = new IntervalDomain()
		for (romCapacity : allRomCapacities)
			romCapacitiesDomain.addDom(new BoundDomain(romCapacity, romCapacity))
		
		/* Create a set of variables - for each thread a variable which contains the power capabilties of all cores	 */
		val IntVar[] romCapacities = model.allThreads.map [ it | new IntVar(constraintStore, "ROM Capacities", romCapacitiesDomain)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's rom utilizations should
		 *    be less than the total sum of all rom capacities
		 */
		
		// - create the total sum of rom utilizations of all applications (threads!)
		val totalRomUtilizationFromAllApplications = model.allThreads.map[it.application.romUtilization].reduce[p1, p2 | p1 + p2]
		val totalRomUtilizationFromAllApplicationsVar = new IntVar(constraintStore, "TotalRomUtilOfAllApps", totalRomUtilizationFromAllApplications, totalRomUtilizationFromAllApplications)
		
		// - create the total sum of all rom capacities
		val totalRomCapacity = model.allBoards.map[it.romCapacity].reduce[p1, p2 | p1 + p2]
		val totalRomCapacityVar = new IntVar(constraintStore, "TotalRomCapacitiy", totalRomCapacity, totalRomCapacity)
		
		// - enforce that the capacity is always larger than the demand
		constraintStore.impose(new XgteqY(totalRomCapacityVar, totalRomUtilizationFromAllApplicationsVar))
		
		/* 1. If an application requires more rom than a board offers, 
		 *    the application (thread) cannot be mapped to this board
		 */

		for (thread : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevel 		= solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
			
			/* Which rom capacities are still available to use for the mapping of a thread? */
			val threadAvailableRomCapacities 	= romCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available rom capacities */
			constraintStore.impose(new Element(threadLocationsBoardLevel, allRomCapacities, threadAvailableRomCapacities))
			
			/* Impose that the rom capacity of the board must be greater than the required capacity of the thread */
			val romUtil = thread.application.romUtilization
			constraintStore.impose(new XgteqC(threadAvailableRomCapacities, romUtil))
		}
		
		/*
		 * 2. The sum of the rom utilizations of all applications on each board
		 *    must not exceed its rom capabilities 
		 */
		for (board : model.allBoards) {
			
			val factorList = new ArrayList<BooleanVar>
			val utilizationList = new ArrayList<Integer>
			
			for (thread : model.allThreads) {

				val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
				val delta = new BooleanVar(constraintStore, "Delta-for-" + thread.name)

				val constraintXeqC 		= new XeqC(threadLocationsBoardLevel, model.allBoards.indexOf(board)+1)
				val constraintReified 	= new Reified(constraintXeqC, delta) 		

				constraintStore.impose(constraintReified)
			
				factorList.add(delta)
				utilizationList.add(thread.application.romUtilization)				
			}
			
			val absoluteRomUtilization = solverVariables.getAbsoluteRomUtilizationVariable(board)
			val constraintSumWeight = new SumWeight(factorList, utilizationList, absoluteRomUtilization)

			constraintStore.impose(constraintSumWeight)
			
			constraintStore.print()
		}
		
		return true
	}
}
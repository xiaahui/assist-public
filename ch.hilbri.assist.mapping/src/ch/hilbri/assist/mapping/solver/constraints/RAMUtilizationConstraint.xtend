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

class RAMUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("RAM capacity constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		/* **** Preparations **** */
		
		/* How much RAM capacity does each board offer? */
		val int[] allRamCapacities = model.allBoards.map[ it | it.ramCapacity]
		
		/* Create a domain for integer variables which contain the ram capacities */		
		val ramCapacitiesDomain = new IntervalDomain()
		for (ramCapacity : allRamCapacities)
			ramCapacitiesDomain.addDom(new BoundDomain(ramCapacity, ramCapacity))
		
		/* Create a set of variables - for each thread a variable which contains the power capabilties of all cores	 */
		val IntVar[] ramCapacities = model.allThreads.map [ it | new IntVar(constraintStore, "RAM Capacities", ramCapacitiesDomain)]
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all application's ram utilizations should
		 *    be less than the total sum of all ram capacities
		 */
		
		// - create the total sum of ram utilizations of all applications (threads!)
		val totalRamUtilizationFromAllApplications = model.allThreads.map[it.application.ramUtilization].reduce[p1, p2 | p1 + p2]
		val totalRamUtilizationFromAllApplicationsVar = new IntVar(constraintStore, "TotalRamUtilOfAllApps", totalRamUtilizationFromAllApplications, totalRamUtilizationFromAllApplications)
		
		// - create the total sum of all ram capacities
		val totalRamCapacity = model.allBoards.map[it.ramCapacity].reduce[p1, p2 | p1 + p2]
		val totalRamCapacityVar = new IntVar(constraintStore, "TotalRamCapacitiy", totalRamCapacity, totalRamCapacity)
		
		// - enforce that the capacity is always larger than the demand
		constraintStore.impose(new XgteqY(totalRamCapacityVar, totalRamUtilizationFromAllApplicationsVar))
		
		/* 1. If an application requires more ram than a board offers, 
		 *    the application (thread) cannot be mapped to this board
		 */

		for (thread : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevel 		= solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
			
			/* Which ram capacities are still available to use for the mapping of a thread? */
			val threadAvailableRamCapacities 	= ramCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available ram capacities */
			constraintStore.impose(new Element(threadLocationsBoardLevel, allRamCapacities, threadAvailableRamCapacities))
			
			/* Impose that the ram capacity of the board must be greater than the required capacity of the thread */
			val ramUtil = thread.application.ramUtilization
			constraintStore.impose(new XgteqC(threadAvailableRamCapacities, ramUtil))
		}
		
		/*
		 * 2. The sum of the ram utilizations of all applications on each board
		 *    must not exceed its ram capabilities 
		 */
		for (board : model.allBoards) {
			
			val factorList = new ArrayList<BooleanVar>()
			val utilizationList = new ArrayList<Integer>()
			
			for (thread : model.allThreads) {

				val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE)
				val delta = new BooleanVar(constraintStore, "Delta-for-" + thread.name)

				val constraintXeqC 		= new XeqC(threadLocationsBoardLevel, model.allBoards.indexOf(board)+1)
				val constraintReified 	= new Reified(constraintXeqC, delta) 		

				constraintStore.impose(constraintReified)
			
				factorList.add(delta)
				utilizationList.add(thread.application.ramUtilization)				
			}
			
			val absoluteRamUtilization = solverVariables.getAbsoluteRamUtilizationVariable(board)
			val constraintSumWeight = new SumWeight(factorList, utilizationList, absoluteRamUtilization)

			constraintStore.impose(constraintSumWeight)
		}
		
		return true
	}
	
}
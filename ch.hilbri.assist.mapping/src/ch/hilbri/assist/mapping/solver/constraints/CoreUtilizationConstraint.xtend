package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import java.util.ArrayList
import org.jacop.constraints.Element
import org.jacop.constraints.Reified
import org.jacop.constraints.SumWeight
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgteqC
import org.jacop.core.BooleanVar
import org.jacop.core.BoundDomain
import org.jacop.core.IntVar
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class CoreUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("Core utilization", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		
		/* **** Preparations **** */
		
		/* How much processing capacity does each core offer? */
		val int[] allCoreProcessingPowerCapacities = model.allCores.map[ it | it.capacity]
		
		/* Create a domain for integer variables which contains the processing power capacities */		
		val coreProcessingPowerCapacitiesDomain = new IntervalDomain()
		for (powerCapacity : allCoreProcessingPowerCapacities)
			coreProcessingPowerCapacitiesDomain.addDom(new BoundDomain(powerCapacity, powerCapacity))
		
		
		/* Create a set of variables - for each thread a variable which contains the power capabilties of all cores	 */
		val IntVar[] coreProcessingPowerCapacities = model.allThreads.map [ it | new IntVar(constraintStore, "Core Processing Power Capacities", coreProcessingPowerCapacitiesDomain)]
	
		
		/* **** Preparing the constraints **** */	 
		
		/* 1. If an application requires more processing power than a core offers, 
		 *    the application (thread) cannot be mapped to this core
		 */
		

		for (thread : model.allThreads) {

			/* To which cores can we map this thread? */
			val threadLocationsCoreLevel 					= solverVariables.getThreadLocationVariable(thread, model.bottomHardwareLevel.value)
			
			/* Which core capacities are still available to use for the mapping of a thread? */
			val threadAvailableProcessingPowerCapacities	= coreProcessingPowerCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available processing power capacities */
			constraintStore.impose(new Element(threadLocationsCoreLevel, allCoreProcessingPowerCapacities, threadAvailableProcessingPowerCapacities))
			
			/* Impose that the processing capacity of the core must be greater than the required capacity of the thread */
			val coreUtil = thread.coreUtilization
			constraintStore.impose(new XgteqC(threadAvailableProcessingPowerCapacities, coreUtil))
		}
		
		
		/*
		 * 2. The sum of the utilizations of all applications on each core
		 *    must not exceed its capabilities 
		 */
		for (core : model.allCores) {
			
			val factorList = new ArrayList<BooleanVar>
			val utilizationList = new ArrayList<Integer>
			
			for (thread : model.allThreads) {

				val threadLocationsCoreLevel = solverVariables.getThreadLocationVariable(thread, model.bottomHardwareLevel.value)
				val delta = new BooleanVar(constraintStore, "Delta-for-" + thread.name)

				val constraintXeqC 		= new XeqC(threadLocationsCoreLevel, model.allCores.indexOf(core)+1)
				val constraintReified 	= new Reified(constraintXeqC, delta) 		

				constraintStore.impose(constraintReified)
			
				factorList.add(delta)
				utilizationList.add(thread.coreUtilization)				
			}
			
			val absoluteCoreUtilization = solverVariables.getAbsoluteCoreUtilizationVariable(core)
			val constraintSumWeight = new SumWeight(factorList, utilizationList, absoluteCoreUtilization)

			constraintStore.impose(constraintSumWeight)
			
			constraintStore.print()
		}

		
		
		return true

	}
	
}
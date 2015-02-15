package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import ch.hilbri.assist.mapping.solver.exceptions.coreutilization.NoCoreHasEnoughCoreProcessingPowerForThisThread
import ch.hilbri.assist.mapping.solver.exceptions.coreutilization.AllThreadsOnThisCoreExceedItsProcessingPower
import ch.hilbri.assist.mapping.solver.exceptions.coreutilization.TotalProcessingPowerRequestExceedsAvailableProcessingPower

class CoreUtilizationConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("core capacity", model, solver, solverVariables)
	}
	
	override generate() {
		
		
		/* **** Preparations **** */
		
		/* How much processing capacity does each core offer? */
		val int[] allCoreProcessingPowerCapacities = model.allCores.map[capacity]
		
		/* Create a set of variables - for each thread a variable which contains the power capabilities of all cores	 */
		val IntVar[] coreProcessingPowerCapacities = model.allThreads.map[VF.enumerated("CoreCap", allCoreProcessingPowerCapacities.sort, solver)]
	
		
		/* **** Preparing the constraints **** */	 
		
		/* 0. The total sum of all threads's core utilization should
		 *    be less than the total sum of all core capacities
		 *    (This is a valid approach, because each applications core utilization is specified independently from the core)
		 */
		
		// - create the total sum of core utilization of all applications (+ threads)
		val totalCoreUtilizationFromAllApplicationsVar = VF.fixed("TotalCoreUtil", model.allThreads.map[coreUtilization].reduce[p1, p2 | p1 + p2], solver)
		
		// - create the total sum of all core capacities
		val totalCoreCapacityVar = VF.fixed("TotalCoreCapacitiy", model.allCores.map[capacity].reduce[p1, p2 | p1 + p2], solver)
		
		// - enforce that the capacity is always larger than the demand
		solver.post(ICF.arithm(totalCoreCapacityVar, ">=", totalCoreUtilizationFromAllApplicationsVar))
		
		try { solver.propagate }
		catch (ContradictionException e) {
			throw new TotalProcessingPowerRequestExceedsAvailableProcessingPower(this)
		}
		
				
		/* 1. If a thread requires more processing power than a core offers, 
		 *    the application (thread) cannot be mapped to this core
		 */

		for (thread : model.allThreads) {

			/* To which cores can we map this thread? */
			val threadLocationsCoreLevelVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.CORE_VALUE)
			
			/* Which core capacities are still available to use for the mapping of a thread? */
			val threadAvailableProcessingPowerCapacitiesVar	= coreProcessingPowerCapacities.get(model.allThreads.indexOf(thread))
			
			/* Link locations and available processing power capacities */
			solver.post(ICF.element(threadAvailableProcessingPowerCapacitiesVar, allCoreProcessingPowerCapacities, threadLocationsCoreLevelVar))
			
			/* Impose that the processing capacity of the core must be greater than the required capacity of the thread */
			solver.post(ICF.arithm(threadAvailableProcessingPowerCapacitiesVar, ">=", thread.coreUtilization))
		
			try { solver.propagate }
			catch (ContradictionException e){ 
				throw new NoCoreHasEnoughCoreProcessingPowerForThisThread(this, thread)
			}
		
		}
		
		/*
		 * 2. The sum of the utilization of all applications on each core
		 *    must not exceed its capabilities 
		 */
		for (core : model.allCores) {
			
			val factorList = new ArrayList<BoolVar>
			val utilizationList = new ArrayList<Integer>
			
			for (thread : model.allThreads) {

				val threadLocationsCoreLevel 	= solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.CORE_VALUE)
				val delta 						= VF.bool("d-" + thread.name + "-" + core.name, solver)   // is this thread being deployed to this core?
				val constraint 					= ICF.arithm(threadLocationsCoreLevel, "=", model.allCores.indexOf(core))
				constraint.reifyWith(delta)
			
				factorList.add(delta)
				utilizationList.add(thread.coreUtilization)				
			}
			
			solver.post(ICF.scalar(factorList, utilizationList, "=", solverVariables.getAbsoluteCoreUtilizationVariable(core)))

			try { solver.propagate }
			catch (ContradictionException e) {
				throw new AllThreadsOnThisCoreExceedItsProcessingPower(this, core)
			}			
		}

		return true
	}
	
}
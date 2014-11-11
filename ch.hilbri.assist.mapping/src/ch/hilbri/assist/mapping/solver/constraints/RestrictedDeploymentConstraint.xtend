package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.datamodel.model.Box
import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.datamodel.model.Core
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.Processor
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashSet
import org.jacop.constraints.In
import org.jacop.core.BoundDomain
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class RestrictedDeploymentConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("Restricted deployment constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		// Iterate over all threads
		for (t : model.allThreads) {
			
			// Check if there is any restriction specified
			if (!t.application.restrictMappingToHardwareElements.empty) {
				
				val allowedCores = new HashSet<Core>()
			
				// 	determine the set of cores(!) that they can be deployed to
				for (hwElem : t.application.restrictMappingToHardwareElements) {
			 		if (hwElem instanceof Compartment) 		allowedCores.addAll((hwElem as Compartment).allCores)
			 		else if (hwElem instanceof Box) 		allowedCores.addAll((hwElem as Box).allCores)
			 		else if (hwElem instanceof Board) 		allowedCores.addAll((hwElem as Board).allCores)
			 		else if (hwElem instanceof Processor) 	allowedCores.addAll((hwElem as Processor).cores)
			 		else if (hwElem instanceof Core) 		allowedCores.add(hwElem as Core)
			 		else return false
				}
			
				// 	determine the location variable for this thread and its cores
				val threadLocationsCoreLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.CORE_VALUE) 
			
				// restrict this variable according to the allowed cores
				var domain = new IntervalDomain()
				for (core : allowedCores)
					domain.addDom(new BoundDomain(model.allCores.indexOf(core)+1, model.allCores.indexOf(core)+1))
			
				constraintStore.impose(new In(threadLocationsCoreLevel, domain))
			
			}
		}
		
		return true
	}
	
}
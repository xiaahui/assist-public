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
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.restricteddeployment.RestrictingDeploymentOfApplicationFailed

class RestrictedDeploymentConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("restricted deployment", model, solver, solverVariables)
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
			
				solver.post(ICF.member(threadLocationsCoreLevel, allowedCores.map[model.allCores.indexOf(it)]))
				
				try { solver.propagate }
				catch (ContradictionException e) { throw new RestrictingDeploymentOfApplicationFailed(this, t.application)}
			
			}
		}
		
		propagate()
		
		return true
	}
	
}
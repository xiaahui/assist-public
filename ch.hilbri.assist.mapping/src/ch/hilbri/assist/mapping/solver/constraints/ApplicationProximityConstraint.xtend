package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.ApplicationGroup
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Thread
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.jacop.constraints.XeqY
import org.jacop.core.IntVar
import org.jacop.core.Store

class ApplicationProximityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("Application proximity constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		for (relation : model.proximityRelations) {
			val level = relation.hardwareLevel
			
			val threadList = new ArrayList<Thread>()
			for (aog : relation.applicationsOrGroups) 
				if (aog instanceof ApplicationGroup) threadList.addAll((aog as ApplicationGroup).allThreads)
				else if (aog instanceof Application) threadList.addAll((aog as Application).threads)
				else return false
			
			
			val threadVarList = new ArrayList<IntVar>()
			for (t : threadList) threadVarList.add(solverVariables.getThreadLocationVariable(t, level.value))
			
			// JaCoP offers no AllEqual constraint, so we have to formulate that pairwise 
			// Attention: potential performance bottle neck!
			if (threadVarList.size > 1) 
				for (var i = 0; i < threadVarList.size - 1; i++ ) 
					constraintStore.impose(new XeqY(threadVarList.get(i), threadVarList.get(i+1)))
			
		}
		
		return true
	}
	
}
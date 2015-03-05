package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver

class ApplicationProximityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("application proximity (on same)", model, solver, solverVariables)
	}
	
	override generate() {
//		
//		for (relation : model.proximityRelations) {
//			
//			val level = relation.hardwareLevel
//			
//			val threadList = new ArrayList<Thread>()
//			for (aog : relation.applicationsOrGroups) 
//				if (aog instanceof ApplicationGroup) threadList.addAll((aog as ApplicationGroup).allThreads)
//				else if (aog instanceof Application) threadList.addAll((aog as Application).threads)
//				else return false
//			
//			
//			val threadVarList = new ArrayList<IntVar>()
//			for (t : threadList) threadVarList.add(solverVariables.getThreadLocationVariable(t, level.value))
//			
//			if (threadVarList.size > 1) 
//				for (var i = 0; i < threadVarList.size - 1; i++ ) { 
//					solver.post(ICF.arithm(threadVarList.get(i), "=", threadVarList.get(i+1)))
//					propagate(threadList.get(i).application, threadList.get(i+1).application, level)
//				}
//		}
		
		return true
	}
	
//	def propagate(Application a1, Application a2, HardwareArchitectureLevelType level) {
//		try { solver.propagate() }
//		catch (ContradictionException e) { 
//			throw new TwoApplicationsCouldNotBeDeployedToTheSameHardwareElement(this, a1, a2, level)
//		}
//	}
	
}
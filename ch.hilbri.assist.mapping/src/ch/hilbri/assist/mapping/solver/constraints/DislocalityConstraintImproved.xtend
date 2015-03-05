package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver

class DislocalityConstraintImproved extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dislocality (improved)", model, solver, solverVariables)
	}
	
	override generate() {
//		for (r : model.dislocalityRelations) {
//			
//			val listOfIntVarLists = new ArrayList<ArrayList<IntVar>>()
//			
//			for (aog : r.applicationsOrGroups) {
//				val aogList = new ArrayList<IntVar>()
//				
//				if (aog instanceof Application) 
//					for (t : (aog as Application).threads) 
//						aogList.add(solverVariables.getThreadLocationVariable(t, r.hardwareLevel.value))
//				
//				else if (aog instanceof ApplicationGroup)
//					for (t : (aog as ApplicationGroup).allThreads)
//						aogList.add(solverVariables.getThreadLocationVariable(t, r.hardwareLevel.value))
//	 			
//				listOfIntVarLists.add(aogList)
//			}
//		
//		
//			val setVarList = new ArrayList<SetVar>()
//			
//			for (intVarList : listOfIntVarLists) {
//				// set variable for the first group of intvar - initial domain set to contain all hw elements from that level
//				val setVar = VF.set("dislocal-set-var-(" + intVarList.toString +")", 0, model.getAllHardwareElements(r.hardwareLevel).length-1, solver)
//				solver.post(SCF.int_values_union(intVarList, setVar))  // channel all IntVar values into this setVar
//				setVarList.add(setVar) // store the setVar for later disjoints
//			}
//			
//			// post a disjoint constraint for all setVars	
//			solver.post(SCF.all_disjoint(setVarList))
//			
//			// propagation
//			try { solver.propagate }
//			catch (ContradictionException e) {
//				throw new ApplicationsCannotBeMappedDislocal(this, r.applicationsOrGroups, r.hardwareLevel)
//			}
//		}			
//		
		return true
	}
}
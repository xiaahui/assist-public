package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.ApplicationGroup
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.jacop.constraints.Alldifferent
import org.jacop.core.IntVar
import org.jacop.core.Store

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("Dislocality constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		/*
		 * A dislocality relation can be specified for applications and applicationGroups;
		 * 
		 * The tricky thing is:
		 *    - dislocality has to be requested for threads
		 *    - it must not affect threads from the same application
		 *    - it must not affect threads from the same applicationGroup
		 * 
		 * Dislocality can only be requested for threads of different application / applicationGroups
		 * 
		 * Approach: 
		 * 
		 * 1) Create thread sets
		 * 
		 * A1, Group1, A2 --> {{t1},{t2,t3,t4}, {t5}}   <- get all threads from each "entry"
		 *    
		 * 2) Create disjoint sets
		 * 
		 * {{t1,t2,t5}, {t1,t3,t5}, {t1,t4,t5}}
		 * 
		 * 3) Create an Alldifferent constraint for each set
		 */
		
		for (r : model.dislocalityRelations) {
			
			val varList = new ArrayList<ArrayList<IntVar>>()
			
			for (aog : r.applicationsOrGroups) {
				val aogList = new ArrayList<IntVar>()
				
				if (aog instanceof Application) 
					for (t : (aog as Application).threads) 
						aogList.add(solverVariables.getThreadLocationVariable(t, r.hardwareLevel.value))
				
				else if (aog instanceof ApplicationGroup)
					for (t : (aog as ApplicationGroup).allThreads)
						aogList.add(solverVariables.getThreadLocationVariable(t, r.hardwareLevel.value))
	 			
	 			else return false
				
				varList.add(aogList)
			}			
			
			val varSetForAllDifferentConstraint = createDisjointVariableSets(varList)
			
			for (list : varSetForAllDifferentConstraint) 
				constraintStore.impose(new Alldifferent(list))
			
		}
		return true
	}
	
	
	def ArrayList<ArrayList<IntVar>> createDisjointVariableSets(ArrayList<ArrayList<IntVar>> locationVariables) {
		
		if (locationVariables.size == 1) {
			val newList = new ArrayList<ArrayList<IntVar>>()
			for (v : locationVariables.get(0)) { 
				val l = new ArrayList<IntVar>()
				l.add(v)
				newList.add(l)
			}
			return newList
		} 
		
		else {
			val tmpList = new ArrayList<ArrayList<IntVar>>(locationVariables)
			tmpList.remove(0)
			val returnList = createDisjointVariableSets(tmpList);
		
			val newList = new ArrayList<ArrayList<IntVar>>();
			for (v : locationVariables.get(0)) 
				for (list : returnList) {	
					val l = new ArrayList<IntVar>();
					l.add(v);
					l.addAll(list);
					newList.add(l);
				}
			
			return newList;
		}
	}
	
}
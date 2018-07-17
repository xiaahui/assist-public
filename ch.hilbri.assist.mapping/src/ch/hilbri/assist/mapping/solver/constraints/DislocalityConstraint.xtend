package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar

class DislocalityConstraint extends AbstractMappingConstraint {

	/*
	 * Define the mode / implementation of the dislocality constraint
	 */
	enum DislocalityConstraintImplementations {
		ALLDIFFERENT_VALUES_UNION, 			// Use union to set vars
		ALLDIFFERENT_FULL_LIST, 				// Use an alldifferent for all vars (recursive)
		ALLDIFFERENT_INSTANTIATION_ONLY		// Act only on instantiation to remove variables in list of intvar lists		
	}
	DislocalityConstraintImplementations mode = DislocalityConstraintImplementations.ALLDIFFERENT_VALUES_UNION
	
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("dislocality", model, chocoModel, solverVariables)
	}

	override generate() {

		/*
		 * A dislocality relation can be specified for applications and applicationGroups;
		 * 
		 * The tricky thing is:
		 *    - dislocality has to be requested for threads
		 *    - it must not affect threads from the same application
		 *    - it must not affect threads from the same applicationGroup
		 */
		 var worked = false
		 
		 for (relation : model.dislocalityRelations) {
		 
		 	val level = relation.hardwareLevel.value
		 
		 	/* Check the simple case:
		 	 * 
		 	 * There are only applications and 
		 	 * every application does only consist of one task 
		 	 * 
		 	 * In this case, we can post a simple allDifferent constraint 
		 	 * to the location variables.
		 	 * 
		 	 * */
		 	if (relation.allTasks.filter[size > 1].isNullOrEmpty) {
				
				val tasks = relation.allTasks.flatten.toSet
				val taskVars = tasks.map[solverVariables.getLocationVariablesForTask(it).get(level)]
				
				/* We want to make these vars take different values */
				chocoModel.allDifferent(taskVars).post
				worked = true
			}
			
			/*
			 * Now we need to look at the complicated case
			 * 
			 */
			else {
				val taskList = relation.allTasks
				val taskVars = taskList.map[it.map[solverVariables.getLocationVariablesForTask(it).get(level)]]
				
				switch (mode) {
					/* Best performing default implementation */
					case ALLDIFFERENT_VALUES_UNION: {
						chocoModel.post(ACF.allDifferent_values_union(taskVars))	
						worked = true	
					}
					
					/* Post an alldifferent for every variable relation - resource intensive! */
					case ALLDIFFERENT_FULL_LIST: {
						recursiveConstraintBuild(taskVars, 0, new ArrayList<IntVar>)	
						worked = true	
					}
					
					/* Only react on instantiation - should be weak in propagation, but yield the same results */
					case ALLDIFFERENT_INSTANTIATION_ONLY: {
						chocoModel.post(ACF.allDifferent_instantiation_only(taskVars))
						worked = true
					}
				}
			}
		 }
		 propagate()
		 
		 return worked 

	}

	
	private def void recursiveConstraintBuild(List<List<IntVar>> intVarList, int idx, List<IntVar> conflict) {
		val subList = intVarList.get(idx) 
		for (intVar: subList) {
			conflict.add(intVar)
			if (idx == intVarList.size - 1) {
				chocoModel.allDifferent(conflict).post				
			} else {
				recursiveConstraintBuild(intVarList, idx+1, conflict)
			}
			conflict.remove(conflict.size-1)
		}
		
	}
}

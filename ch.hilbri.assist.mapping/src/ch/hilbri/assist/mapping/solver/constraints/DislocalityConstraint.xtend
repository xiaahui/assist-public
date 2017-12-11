package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar

class DislocalityConstraint extends AbstractMappingConstraint {

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
		 	if (relation.applications.filter[!(it instanceof Application)].isNullOrEmpty &&
		 		relation.applications.map[(it as Application).tasks].filter[size > 1].isNullOrEmpty) {
				
				val tasks = relation.applications.map[(it as Application).tasks].flatten.toSet
				val taskVars = tasks.map[solverVariables.getLocationVariablesForTask(it).get(level)]
				
				/* We want to make these vars take different values */
				chocoModel.allDifferent(taskVars).post
			}
			
			/*
			 * Now we need to look at the complicated case
			 * 
			 */
			else {
				val taskList = relation.applications.map[(it as Application).tasks]
				val taskVars = taskList.map[it.map[solverVariables.getLocationVariablesForTask(it).get(level)]]
				
				var useUnionApproach = true
				
				if (useUnionApproach) {
					val domainUnionVars = taskVars.map[chocoModel.intVar("DomainVarForGroup-" + taskVars.indexOf(it), 0, model.getAllHardwareElements(level).size-1, false)]
					chocoModel.post(ACF.allDifferent(taskVars, domainUnionVars))
				}
				else {
					recursiveConstraintBuild(taskVars, 0, new ArrayList<IntVar>)
				}
			}
		 }
		 propagate()
		 
		 true 

	}

	
	def void recursiveConstraintBuild(List<List<IntVar>> intVarList, int idx, List<IntVar> conflict) {
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

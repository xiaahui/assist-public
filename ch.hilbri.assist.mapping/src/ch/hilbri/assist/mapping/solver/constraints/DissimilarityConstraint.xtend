package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.DissimilarityClause
import ch.hilbri.assist.model.DissimilarityConjunction
import ch.hilbri.assist.model.DissimilarityDisjunction
import ch.hilbri.assist.model.DissimilarityEntry
import ch.hilbri.assist.model.Task
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.^extension.Tuples
import org.eclipse.emf.common.util.EList

class DissimilarityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("dissimilarity", model, chocoModel, solverVariables)
	}

	override generate() {
		var worked = false
		
		for (dissimRelation : model.dissimilarityRelations) {
			val dissimClause  = dissimRelation.dissimilarityClause
			val constraint = generateConstraint(dissimRelation.allTasks, dissimClause)
			if (constraint !== null) {
				chocoModel.post(constraint)
				worked = true	
			}				 	
		}
		return worked
	}
	

	private def Constraint generateConstraint(EList<EList<Task>> tasksets, DissimilarityClause clause) {
		if (clause instanceof DissimilarityConjunction) {
			val constraints = clause.dissimilarityClauses.map[generateConstraint(tasksets, it)]
			return chocoModel.and(constraints)
		} 
		else if (clause instanceof DissimilarityDisjunction) {
			val constraints = clause.dissimilarityClauses.map[generateConstraint(tasksets, it)]
			return chocoModel.or(constraints)
		} 
		else if (clause instanceof DissimilarityEntry) {
			return generateBasicConstraint(tasksets, clause)
		}
		else 
			return null
	}
	
	private def Constraint generateBasicConstraint(EList<EList<Task>> tasksets, DissimilarityEntry entry) {
		
		// Which level in the hardware hierarchy is affected?	
		val hardwareLevelIdx = entry.hardwareLevel.value
			
		// List of all dissimilarity values (e.g. compartment.manufacturer) indexed by hardware element 
		val dissimilarityValuesList = entry.dissimValues
		val dissimilarityValues = dissimilarityValuesList.toSet.toList

		// Location Variables for each affected task
		val taskLocationVars = tasksets.map[map[solverVariables.getLocationVariablesForTask(it).get(hardwareLevelIdx)]]
			
		// Variables to store the index to the dissimilarity value of the deployment of each task
		// (these are the variables which should take different values for different applications)
		val taskDissimValueVars = newArrayList()
		for (group : tasksets) 
			taskDissimValueVars.add(chocoModel.intVarArray(group.size, 0, dissimilarityValues.size, false).toList)
			
		// Create the tuples to link the deployment to a hardware element (index)
		// to the index of the value of the dissimilarity feature (e.g. board.type)
		val tuples = new Tuples(true)
		for (hwElementIdx : 0 ..< model.getAllHardwareElements(hardwareLevelIdx).size) {
			val dissimValue = dissimilarityValuesList.get(hwElementIdx)
			val dissimValueIdx = dissimilarityValues.indexOf(dissimValue)
			tuples.add(hwElementIdx, dissimValueIdx)
		}
		
		// Post a constraint for each pair of task location and dissimilarity pair
		// Loc-Variable <----> DissimValue-Variable  
		// (a placement to a hardware element results in the dissimValue-variable to take the value (better: its index)
		for (i : 0 ..< taskLocationVars.size) {
			for (j : 0 ..< taskLocationVars.get(i).size) {
				val var1 = taskLocationVars.get(i).get(j)
				val var2 = taskDissimValueVars.get(i).get(j)
				chocoModel.table(#[var1, var2], tuples, "GAC3rm+").post
			}
		}
		
		/* Simple Case: we assume that in each application, there is only one task! */
		if (tasksets.filter[size > 1].isNullOrEmpty) {
			// We want to enforce, that each of these taskDissimValueVars takes a unique value
			// --> a simple allDifferent is sufficient
			return chocoModel.allDifferent(taskDissimValueVars.flatten)
		} 
		
		/* Advanced case: we have multiple tasks in an application, so we
		 * should be careful, that these tasks could be placed to the same hardware element		 */
		else {
			// See DislocalityConstraint for another instance of this usage
			return ACF.allDifferent_values_union(taskDissimValueVars)
		}	
	}
	
	
	/* Just a helper function to have the code more concise */
	private def getDissimValues(DissimilarityEntry entry) {
		switch entry.dissimilarityAttribute {
			case COMPARTMENT_MANUFACTURER: 	{ model.allCompartments.map[manufacturer]		}
			case COMPARTMENT_POWERSUPPLY: 	{ model.allCompartments.map[powerSupply]		}
			case BOX_MANUFACTURER: 			{ model.allBoxes.map[manufacturer]				}
			case BOARD_MANUFACTURER: 		{ model.allBoards.map[manufacturer]				}
			case BOARD_BOARDTYPE: 			{ model.allBoards.map[boardType]				}
			case BOARD_POWERSUPPLY: 		{ model.allBoards.map[powerSupply]				}
			case BOARD_ASSURANCELEVEL: 		{ model.allBoards.map[assuranceLevel.literal]	}
			case PROCESSOR_MANUFACTURER: 	{ model.allProcessors.map[manufacturer]			}
			case PROCESSOR_PROCESSORTYPE: 	{ model.allProcessors.map[processorType]		}
			case CORE_ARCHITECTURE: 		{ model.allCores.map[architecture]				}
		}
	}
}
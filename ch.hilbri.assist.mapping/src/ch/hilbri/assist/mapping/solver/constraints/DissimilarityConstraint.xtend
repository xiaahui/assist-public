package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.DissimilarityEntry
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Model
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.^extension.Tuples

class DissimilarityConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		super("dissimilarity", model, chocoModel, solverVariables)
	}

	override generate() {
		for (dissimRelation : model.dissimilarityRelations) {
			val dissimClause  = dissimRelation.dissimilarityClause
			if (dissimClause instanceof DissimilarityEntry) {
				val constraint = generateConstraint(dissimRelation.applications, dissimClause)
				if (constraint !== null)
					chocoModel.post(constraint)				 	
			}
		}
		true
	}
	
	private def Constraint generateConstraint(List<Application> applications, DissimilarityEntry entry) {
		
		/* Simple Case: we assume that in each application, there is only one task! */
		if (applications.map[tasks].filter[size > 1].isNullOrEmpty) {
			val hardwareLevelIdx = entry.hardwareLevel.value
			
			// List of all dissimilarity values (e.g. compartment.manufacturer) indexed by hardware element 
			val dissimilarityValuesList = entry.dissimValues
			val dissimilarityValues = dissimilarityValuesList.toSet.toList

			// Tasks which are affected by this constraint
			val tasks = applications.map[tasks].flatten.toSet

			// Location Variables for each affected task
			val taskLocationVars = tasks.map[solverVariables.getLocationVariablesForTask(it).get(hardwareLevelIdx)]	
			
			// Variables to store the index to the dissimilarity value of the deployment of each task
			val taskDissimValueVars = chocoModel.intVarArray(taskLocationVars.size, 0, dissimilarityValues.size-1, false)
			
			// Create the tuples to link the deployment to a hardware element
			// to the index of the dissimilarity feature (e.g. board.type)
			val tuples = new Tuples(true)
			for (hwElementIdx : 0 ..< model.getAllHardwareElements(hardwareLevelIdx).size) {
				val dissimValue = dissimilarityValuesList.get(hwElementIdx)
				val dissimValueIdx = dissimilarityValues.indexOf(dissimValue)
				tuples.add(hwElementIdx, dissimValueIdx)
			}
			
			// Post a constraint for each pair of task location and dissimilarity pair
			for (t : 0 ..< taskLocationVars.size)
				chocoModel.table(#[taskLocationVars.get(t), taskDissimValueVars.get(t)], tuples, "GAC3rm+").post
			
			// We want to enforce, that each of these taskDissimValueVars takes a unique value
			return chocoModel.allDifferent(taskDissimValueVars)
				
		} else {
			logger.info("We have a problem with the dissimilarity constraints. Feature not implemented")
			return null
		}	
	}
	
	private def getDissimValues(DissimilarityEntry entry) {
		switch entry.hardwareLevel {
				case CORE: {
					switch entry.coreAttribute {
						case ARCHITECTURE: 		{ model.allCores.map[architecture]		 		}
						case NONE: 				{ #[] 											}
					} 
				}
				
				case PROCESSOR: {
					switch entry.processorAttribute {
						case MANUFACTURER: 		{ model.allProcessors.map[manufacturer] 		}
						case PROCESSORTYPE: 	{ model.allProcessors.map[processorType]		}
						case NONE: 				{ #[]											}
					}
				}
				
				case BOARD: {
					switch entry.boardAttribute {
						case MANUFACTURER: 		{ model.allBoards.map[manufacturer]				}
						case BOARDTYPE: 		{ model.allBoards.map[boardType]				}
						case POWERSUPPLY: 		{ model.allBoards.map[powerSupply]				}
						case ASSURANCELEVEL: 	{ model.allBoards.map[assuranceLevel.literal]	}
						case NONE: 				{ #[]											}
					}
				}
				
				case BOX: {
					switch entry.boxAttribute {
						case MANUFACTURER: 		{ model.allBoxes.map[manufacturer]				}
						case NONE: 				{ #[]											}
					}
				}
				
				case COMPARTMENT: {
					switch entry.compartmentAttribute {
						case MANUFACTURER: 		{ model.allCompartments.map[manufacturer]		}
						case POWERSUPPLY: 		{ model.allCompartments.map[powerSupply]		}
						case NONE: 				{ #[]											}
					}
				}
		}
	}
}
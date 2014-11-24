package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.ApplicationGroup
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.DissimilarityEntry
import ch.hilbri.assist.datamodel.model.DissimilarityRelation
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.slf4j.LoggerFactory
import solver.Solver
import solver.constraints.ICF
import solver.variables.IntVar
import solver.variables.VF

class DissimilarityConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("Dissimilarity constraints", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class);
	}
	
	override generate() {
		 
		for (r : model.dissimilarityRelations) {
			
			val clause = r.dissimilarityClause
			
			/* Are we working on an entry? */
			if (clause instanceof DissimilarityEntry) {

				// Create a list of lists of location variables which have to be constrained
				val varSetForAllDifferentConstraint = createDisjointVariableSets(createAListOfLocationVariables(r, clause.level))

				// This is a list of hash-values (int) for each hardware element in the specified hardware level
				var int[] dissimilarityValueList = null
				
				// Now we fill the dissimilarityValueList depending on the clause data
				switch(clause.level) {
					
					case COMPARTMENT: 
						switch(clause.compartmentAttribute) {
							case NONE: 				{ 																				}
							case MANUFACTURER: 		{ dissimilarityValueList = model.allCompartments.map[manufacturer.hashCode]		}
							case POWERSUPPLY: 		{ dissimilarityValueList = model.allCompartments.map[powerSupply.hashCode]		}
							case SIDE: 				{ dissimilarityValueList = model.allCompartments.map[side.hashCode]				}
							case ZONE: 				{ dissimilarityValueList = model.allCompartments.map[zone.hashCode]				}
						}
						
					case BOX: 
						switch(clause.boxAttribute) {
							case NONE: 				{				}
							case MANUFACTURER: 		{ dissimilarityValueList = model.allBoxes.map[manufacturer.hashCode]			}
						}
						
					case BOARD: 
						switch(clause.boardAttribute) {
							case NONE: 				{																				}
							case MANUFACTURER: 		{ dissimilarityValueList = model.allBoards.map[manufacturer.hashCode]			}
							case POWERSUPPLY: 		{ dissimilarityValueList = model.allBoards.map[powerSupply.hashCode]			}
							case ASSURANCELEVEL: 	{ dissimilarityValueList = model.allBoards.map[assuranceLevel.ordinal]			}
							case BOARDTYPE: 		{ dissimilarityValueList = model.allBoards.map[boardType.hashCode]				}
						}
					
					case PROCESSOR: 
						switch(clause.processorAttribute) {
							case NONE: 				{																				}
							case MANUFACTURER: 		{ dissimilarityValueList = model.allProcessors.map[manufacturer.hashCode]		}
							case PROCESSORTYPE: 	{ dissimilarityValueList = model.allProcessors.map[processorType.hashCode]		}
						}
					
					default: { return false	} // error case
				}						
				
				// Now we have a list of numbers which represent the features of the hardware elements in the model

				// In the next step, we have to combine this list with the location variables and apply an allDifferent constraint 

				for (threadLocationVarGroup : varSetForAllDifferentConstraint) {
					
					val dissimilarityValueVarsForLocationVarGroup = new ArrayList<IntVar>

					// Go through all threads of the current "group"					
					for (threadLocationVar : threadLocationVarGroup) {
						val threadDissimilarityValuesVar = VF.enumerated("DissimListVar", dissimilarityValueList.sort, solver)
						dissimilarityValueVarsForLocationVarGroup.add(threadDissimilarityValuesVar)
						
						solver.post(ICF.element(threadDissimilarityValuesVar, dissimilarityValueList, threadLocationVar))
					}
					
					solver.post(ICF.alldifferent(dissimilarityValueVarsForLocationVarGroup))
				} 
			}
		}
		
		
		return true
	}
	
	
	/*
	 * Helper method
	 * 
	 * Given a list of lists of location variables, this method computes another list of lists of location variables which can be directly used 
	 * for an allDifferent constraint
	 * 
	 */
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
	
	
	/*
	 * Helper method
	 * 
	 * A relation may be specified for applications or applicationgroups;
	 * 
	 * This method creates a list of location variables for the specified architecture level
	 * 
	 */
	def ArrayList<ArrayList<IntVar>> createAListOfLocationVariables(DissimilarityRelation relation, HardwareArchitectureLevelType level) {
		val varList = new ArrayList<ArrayList<IntVar>>()
			
		for (aog : relation.applicationsOrGroups) {
			val aogList = new ArrayList<IntVar>()
				
			if (aog instanceof Application) 
				for (t : (aog as Application).threads) 
					aogList.add(solverVariables.getThreadLocationVariable(t, level.value))
				
			else if (aog instanceof ApplicationGroup)
				for (t : (aog as ApplicationGroup).allThreads)
					aogList.add(solverVariables.getThreadLocationVariable(t, level.value))
	 			
	 		else return null
				
			varList.add(aogList)
		}	
				
		return varList		
	}
	
	
}
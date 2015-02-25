package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.ApplicationGroup
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.DissimilarityClause
import ch.hilbri.assist.datamodel.model.DissimilarityConjunction
import ch.hilbri.assist.datamodel.model.DissimilarityDisjunction
import ch.hilbri.assist.datamodel.model.DissimilarityEntry
import ch.hilbri.assist.datamodel.model.DissimilarityRelation
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.dissimilarity.ApplicationsCannotBeMappedDissimilar
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.LCF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.slf4j.LoggerFactory

class DissimilarityConstraint extends AbstractMappingConstraint {

	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dissimilarity", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class);
	}
	
	/*
	 * Main method for all relations
	 * 
	 */
	override generate() {
		 
		for (r : model.dissimilarityRelations) {
			val constraint = generateConstraint(r, r.dissimilarityClause)
			if (constraint != null) {
				solver.post(constraint)
				
				try { solver.propagate }
				catch (ContradictionException e) {
					throw new ApplicationsCannotBeMappedDissimilar(this, r.applicationsOrGroups)
				}
			}
			
		} 

		return true
	}
	

	/*
	 * Recursive constraint generation
	 */
	def Constraint generateConstraint(DissimilarityRelation relation, DissimilarityClause clause) {
		// BASIC Case
		if (clause instanceof DissimilarityEntry) 
			return generateDissimilarityEntry(relation, clause)
		
		// AND
		if (clause instanceof DissimilarityConjunction) {
			val list = new ArrayList<Constraint>
			
			for (c : (clause as DissimilarityConjunction).dissimilarityClauses)
				list.add(generateConstraint(relation, c))
			
			return LCF.and(list)
		}

		// OR
		if (clause instanceof DissimilarityDisjunction) {
			val list = new ArrayList<Constraint>
			
			for (c : (clause as DissimilarityDisjunction).dissimilarityClauses)
				list.add(generateConstraint(relation, c))
			
			return LCF.or(list)
		}

		// ERROR		
		return null
	}
	
	
	/* 
	 * Helper method
	 * 
	 * This method creates a constraint which is required by this dissimilarity entry
	 */
	
	def Constraint generateDissimilarityEntry(DissimilarityRelation relation, DissimilarityEntry entry) {
		
		// Create a list of lists of location variables which have to be constrained
		val varSetForAllDifferentConstraint = createDisjointVariableSets(createAListOfLocationVariables(relation, entry.level))

		// This is a list of hash-values (int) for each hardware element in the specified hardware level
		var int[] dissimilarityValueList = null
				
		// Now we fill the dissimilarityValueList depending on the clause data
		switch(entry.level) {
					
			case COMPARTMENT: 
				switch(entry.compartmentAttribute) {
					case NONE: 				{ 																				}
					case MANUFACTURER: 		{ dissimilarityValueList = model.allCompartments.map[manufacturer.hashCode]		}
					case POWERSUPPLY: 		{ dissimilarityValueList = model.allCompartments.map[powerSupply.hashCode]		}
					case SIDE: 				{ dissimilarityValueList = model.allCompartments.map[side.hashCode]				}
					case ZONE: 				{ dissimilarityValueList = model.allCompartments.map[zone.hashCode]				}
				}
						
			case BOX: 
				switch(entry.boxAttribute) {
					case NONE: 				{				}
					case MANUFACTURER: 		{ dissimilarityValueList = model.allBoxes.map[manufacturer.hashCode]			}
				}
						
			case BOARD: 
				switch(entry.boardAttribute) {
					case NONE: 				{																				}
					case MANUFACTURER: 		{ dissimilarityValueList = model.allBoards.map[manufacturer.hashCode]			}
					case POWERSUPPLY: 		{ dissimilarityValueList = model.allBoards.map[powerSupply.hashCode]			}
					case ASSURANCELEVEL: 	{ dissimilarityValueList = model.allBoards.map[assuranceLevel.ordinal]			}
					case BOARDTYPE: 		{ dissimilarityValueList = model.allBoards.map[boardType.hashCode]				}
					case SIDE:				{ dissimilarityValueList = model.allBoards.map[side.hashCode]					}
					case ESS:				{ dissimilarityValueList = model.allBoards.map[ess.hashCode]					}
				}
			
			case PROCESSOR: 
				switch(entry.processorAttribute) {
					case NONE: 				{																				}
					case MANUFACTURER: 		{ dissimilarityValueList = model.allProcessors.map[manufacturer.hashCode]		}
					case PROCESSORTYPE: 	{ dissimilarityValueList = model.allProcessors.map[processorType.hashCode]		}
				}
					
			default: { return null	} // error case
		}						
				
			// This list holds all the AllDifferent constraints which are required for this dissimilarityEntry
		val constraintsList = new ArrayList<Constraint>()
		
		// Now we have a list of numbers which represent the features of the hardware elements in the model
		// In the next step, we have to combine this list with the location variables and apply an allDifferent constraint
		for (threadLocationVarGroup : varSetForAllDifferentConstraint) {
			
			// First, we have to link the location to the dissimilarityValues list 
			// and get a variable for each thread describing possible dissimilarityValues 	
			val dissimilarityValueVarsForLocationVarGroup = new ArrayList<IntVar>

			// Go through all threads of the current "group"					
			for (threadLocationVar : threadLocationVarGroup) {
				val threadDissimilarityValuesVar = VF.enumerated("DissimListVar", dissimilarityValueList.sort, solver)
				dissimilarityValueVarsForLocationVarGroup.add(threadDissimilarityValuesVar)
				
				solver.post(ICF.element(threadDissimilarityValuesVar, dissimilarityValueList, threadLocationVar))
			}

			// Now we have all dissimilarityValue-variables which are already linked to the locations
			// We can now request them to be different for all threads in the current group					
			constraintsList.add(ICF.alldifferent(dissimilarityValueVarsForLocationVarGroup))
		}
		
		// Now we have in constraintsList a list of all allDifferent constraints which are required for this DissimilarityEntry
		// We do not post them now, but we reify them with an AND constraint and return the constraint only (dissimilarity tree!)
		val entireDissimEntryConstraint = LCF.and(constraintsList) 
		
		return entireDissimEntryConstraint 
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
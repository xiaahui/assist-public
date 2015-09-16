package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.exceptions.NotEnoughResourcesForColocalityRelations
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.BitSet
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.eclipse.emf.common.util.BasicEList
import org.slf4j.LoggerFactory

class ImprovedPairOfColocalitiesConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("improved interface colocality (pairs of on-same relations)", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	override generate() {
		val retCon = generateRelations(HardwareArchitectureLevelType.CONNECTOR)
		val retRDC = generateRelations(HardwareArchitectureLevelType.RDC)
		val retCom = generateRelations(HardwareArchitectureLevelType.COMPARTMENT)
		
		return retCon || retRDC || retCom
	}
	
	def boolean generateRelations(HardwareArchitectureLevelType level) {
		
		logger.info('''     * begin processing «level» level on-same relations''')
		
		var atLeastOneConstraintWasPosted = false
		
		// Iterate over all pairs of colocality relations for each hardware level
		val relations = model.colocalityRelations.filter[hardwareLevel == level] 
		
		// Create an adjacency matrix for all connector on-same relations
		val relationsGraph = relations.map[new BitSet].toList
		
		// Go through all pairs of relations	
		for (var rel1Idx = 0; rel1Idx < relations.length; rel1Idx++) {
 			for (var rel2Idx = rel1Idx+1; rel2Idx < relations.length; rel2Idx++) {
 			  	val rel1 = relations.get(rel1Idx)
			  	val rel2 = relations.get(rel2Idx)
				
			  	val combinedRel1Rel2 = (rel1.allInterfaces + rel2.allInterfaces)
				
				// Rel1 and rel2 should not share an interface
			  	if (combinedRel1Rel2.toSet.toList.length == combinedRel1Rel2.length) {
					
					// Which io types are requested by all interfaces in these relations? 
					val requestedIoTypes =  (rel1.allInterfaces.map[it.ioType] +
											 rel2.allInterfaces.map[it.ioType])
											 .toSet   // make it unique
											 .toList 
				
					// How many interfaces of these types would be required 
					// if both relations were placed on a single connector?
					val reqCapacitiesPerIoType = requestedIoTypes.map[ typeIter | rel1.allInterfaces.filter[ioType.equals(typeIter)].length + 
																			  	  rel2.allInterfaces.filter[ioType.equals(typeIter)].length	]		
				
					// Get a list of hardwareElements having sufficient IO interfaces
					if (level == HardwareArchitectureLevelType.CONNECTOR) {
						if (model.connectors
								.filter[ // go through every Connector; how many interfaces does this Connector offer for these io types?
										val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
					
										// how much capacity remains after removing the capacity for the on-same relations?
										val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
					
										// a connector is only valid if it offers sufficient resources (so that at least 0 unused interfaces would remain) 
										remainingCapacitiesPerIoType.min >= 0]
								.empty) 
						{
							
							// If there is no connector capable of handling both groups, then the interfaces
							// in both relations can never share a connector; we make this explicit by marking
							// them as "conflicting" in the graph
							relationsGraph.get(rel1Idx).set(rel2Idx)
							relationsGraph.get(rel2Idx).set(rel1Idx)
							
						} // if empty
					} // if level == Connector				

					// same as above
					else if (level == HardwareArchitectureLevelType.RDC) {
						if (model.RDCs
								.filter[ val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
										 val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
										 remainingCapacitiesPerIoType.min >= 0]
								.empty) 
						{
							relationsGraph.get(rel1Idx).set(rel2Idx)
							relationsGraph.get(rel2Idx).set(rel1Idx)
						} // if empty
					} // if level == RDC				
					
					// same as above
					else if (level == HardwareArchitectureLevelType.COMPARTMENT) {
						if (model.compartments
								.filter[ val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
										 val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
										 remainingCapacitiesPerIoType.min >= 0]
								.empty) 
						{
							relationsGraph.get(rel1Idx).set(rel2Idx)
							relationsGraph.get(rel2Idx).set(rel1Idx)
						} // if empty
					} // if level == COMPARTMENT
								
				} // if relations do not share an interface
			} // for	
		} // for
		
		logger.info('''        . successfully checked all «IF !relations.nullOrEmpty»«relations.length»«ELSE»0«ENDIF» on-same relations («level» level)''')
		logger.info('''        . conflict graph contained «IF !relationsGraph.nullOrEmpty»«relationsGraph.length»  nodes and «relationsGraph.map[it.cardinality].reduce[p1, p2|p1+p2] / 2» edges)«ELSE»0 nodes and 0 edges«ENDIF»''')
		
		// Now we have a relationsGraph with conflicting on-same relations

		// Retrieve the set of cliques so that all conflict-edges are covered
		val listOfAllCliques = cliqueCoverConstraintBuild(relationsGraph)
		logger.info('''        . successfully created a list of «IF !listOfAllCliques.nullOrEmpty»«listOfAllCliques.length»«ELSE»0«ENDIF» cliques''')
		
		for (clique : listOfAllCliques) {
			
			// Iterate over the "true bits" (= on same relation indexes)
			val listOfOnSameRelationIndizes = new ArrayList<Integer>
			for (var i = clique.nextSetBit(0); i >= 0; i = clique.nextSetBit(i+1)) {
				listOfOnSameRelationIndizes.add(i)
			}
			
			// Retrieve the on same relations (connector level) for these indizes in this clique
			val listOfOnSameRelations = listOfOnSameRelationIndizes.map[relations.get(it)]
			 
			// Get an interface representant from each relation
			val listOfOnSameRelationsIfaces = listOfOnSameRelations.map[it.allInterfaces.get(0)]
			
			// Get the interface variables for each representant
			val listOfOnSameRelationsIfacesVar = listOfOnSameRelationsIfaces.map[solverVariables.getEqInterfaceLocationVariable(it, level)]
			
			// Post the alldifferent for these vars
			solver.post(ICF.alldifferent(listOfOnSameRelationsIfacesVar, "AC"))
			
			// Set the effect flag of this constraint
			atLeastOneConstraintWasPosted = true
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new NotEnoughResourcesForColocalityRelations(this, listOfOnSameRelations) }    			
 		
 		} // for clique
				
		return atLeastOneConstraintWasPosted	
	}

	
	/*
	 * ************* Helper functions  *********
	 */
	
	// Code contribution thanks to Micha
	def List<BitSet> cliqueCoverConstraintBuild(List<BitSet> graph) {

		val List<BitSet> returnCliques = new ArrayList<BitSet>
	
		val List<BitSet> uncovered = new ArrayList<BitSet>(graph.size)
		for (node:graph) {
			uncovered.add(node.clone() as BitSet)
		}

		while (true) {
			// find start node with maximum number of uncovered edges
			var int maxIdx = -1
			var int maxCard = 0
			for (idx : 0..<uncovered.size) {
				val card = uncovered.get(idx).cardinality
				if (card > maxCard) {
					maxIdx = idx
					maxCard = card
				}
			}
			if (maxCard == 0) {
				return returnCliques
			}
			val maxNode = graph.get(maxIdx)
			val uncoveredNode = uncovered.get(maxIdx)
			var BitSet seed
			
			/* less redundant version: the seed is a clique of uncovered vertices */
			val uncovCandidates = uncoveredNode.clone as BitSet
			seed = findClique(uncovCandidates, uncovered)			
			// the candidates are the common neighborhood of the seed
			val candidates = maxNode.clone as BitSet
			for (var int idx = seed.nextSetBit(0); idx != -1; idx = seed.nextSetBit(idx+1)) {
				candidates.and(graph.get(idx))
			}
			val clique = findClique(candidates, graph)
			clique.set(maxIdx)
			clique.or(seed)
			
			for (var int idx = clique.nextSetBit(0); idx != -1; idx = clique.nextSetBit(idx+1)) {
				uncovered.get(idx).andNot(clique)
			}
 			
 			returnCliques.add(clique)
			
		}
	}
	
	def BitSet findClique(BitSet candidates, List<BitSet> graph) {
		val clique = new BitSet
		while (!candidates.empty) {
			var int maxIdx = -1
			var int maxCard = -1
			for (var int idx = candidates.nextSetBit(0); idx != -1; idx = candidates.nextSetBit(idx+1)) {
				val nodeClone = (graph.get(idx).clone as BitSet)
				nodeClone.and(candidates)
				val card = nodeClone.cardinality
				if (card > maxCard) {
					maxIdx = idx
					maxCard = card
				}			
			}
			candidates.and(graph.get(maxIdx))
			clique.set(maxIdx)
		}
		return clique
	}
	
}
package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.BitSet
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.eclipse.emf.common.util.BasicEList
import org.slf4j.LoggerFactory

class ImprovedPairOfColocalitiesConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("improved interface colocality (pairs of on-same relations)", model, solver, solverVariables)
	}
	
	override generate() {
		
		var atLeastOneConstraintWasPosted = false
		
		this.logger = LoggerFactory.getLogger(this.class)
		
		// Iterate over all pairs of colocality relations for each hardware level
		val connectorRelations = model.colocalityRelations.filter[hardwareLevel == HardwareArchitectureLevelType.CONNECTOR] 
		
		// Create an adjacency matrix for all connector on-same relations
		val connectorRelationsGraph = connectorRelations.map[new BitSet].toList
	
		// Go through all pairs of relations	
		for (var rel1Idx = 0; rel1Idx < connectorRelations.length; rel1Idx++) {
			for (var rel2Idx = rel1Idx+1; rel2Idx < connectorRelations.length; rel2Idx++) {
				val rel1 = connectorRelations.get(rel1Idx)
				val rel2 = connectorRelations.get(rel2Idx)
				
				// Which io types are requested by all interfaces in these relations? 
				val requestedIoTypes =  (rel1.allInterfaces.map[it.ioType] +
										 rel2.allInterfaces.map[it.ioType])
										 .toSet   // make it unique
										 .toList 
				
				// How many interfaces of these types would be required 
				// if both relations were placed on a single connector?
				val reqCapacitiesPerIoType = requestedIoTypes.map[
					val typeIter = it
					rel1.allInterfaces.filter[ioType.equals(typeIter)].length + 
					rel2.allInterfaces.filter[ioType.equals(typeIter)].length
				]		
				
				// Get a list of connectors having sufficient IO interfaces
				val validConnectors = model.allConnectors.filter[
					// go through every connector; how many interfaces does this connector offer for these io types?
					val availCapacitiesPerIoType = it.getAvailableEqInterfaces(new BasicEList<String>(requestedIoTypes)).toList
					
					// how much capacity remains after removing the capacity for the on-same relations?
					val remainingCapacitiesPerIoType = availCapacitiesPerIoType.map[it - reqCapacitiesPerIoType.get(availCapacitiesPerIoType.indexOf(it))]	
					
					// a connector is only valid if it offers sufficient resources 
					// (so that at least 0 unused interfaces would remain) 
					if (remainingCapacitiesPerIoType.min >= 0) 	true
					else 										false 					
				]							
				
				// If there is no connector capable of handling both groups, then the interfaces
				// in both relations can never share a connector; we make this explicit by marking
				// them as "conflicting" in the graph
				if (validConnectors.empty) {
					connectorRelationsGraph.get(rel1Idx).set(rel2Idx)
					connectorRelationsGraph.get(rel2Idx).set(rel1Idx)
				}
				
			} // for	
		} // for
		
		logger.info('''     . successfully checked all «connectorRelations.length» on-same relations (connector level)''')
		logger.info('''       (resulting graph contained «connectorRelationsGraph.length» nodes and «connectorRelationsGraph.map[it.cardinality].reduce[p1, p2|p1+p2] / 2» edges)''')
		
		// Now we have a connectorRelationsGraph with conflicting on-same relations

		// Retrieve the set of cliques so that all conflict-edges are covered
		val listOfAllCliques = cliqueCoverConstraintBuild(connectorRelationsGraph)
		logger.info('''     . successfully created a list of «listOfAllCliques.length» cliques''')
		
		for (clique : listOfAllCliques) {
			
			// Iterate over the "true bits" (= on same relation indexes)
			val listOfOnSameRelationIndizes = new ArrayList<Integer>
			for (var i = clique.nextSetBit(0); i >= 0; i = clique.nextSetBit(i+1)) {
				listOfOnSameRelationIndizes.add(i)
			}
			
			// Retrieve the on same relations (connector level) for these indizes in this clique
			val listOfOnSameRelations = listOfOnSameRelationIndizes.map[connectorRelations.get(it)]
			 
			// Get an interface representant from each relation
			val listOfOnSameRelationsIfaces = listOfOnSameRelations.map[it.allInterfaces.get(0)]
			
			// Get the interface variables for each representant
			val listOfOnSameRelationsIfacesVar = listOfOnSameRelationsIfaces.map[solverVariables.getEqInterfaceLocationVariable(it, 0)]
			
			// Post the alldifferent for these vars
			solver.post(ICF.alldifferent(listOfOnSameRelationsIfacesVar, "AC"))
			
			// Set the effect flag of this constraint
			atLeastOneConstraintWasPosted = true    			
 		
 		} // for clique
				
		logger.info('''     . successfully posted constraints for all cliques''')
		
		return atLeastOneConstraintWasPosted	
	}
	
	
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
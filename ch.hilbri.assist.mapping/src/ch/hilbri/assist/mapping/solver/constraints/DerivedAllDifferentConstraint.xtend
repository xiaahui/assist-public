package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.BitSet
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar

class DerivedAllDifferentConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("derived all different", model, solver, solverVariables)
	}
	
	override generate() {
		val List<List<IntVar>> colocs = new ArrayList<List<IntVar>>()
		for (r : model.colocalityRelations) {
			val l = solverVariables.getLevelIndex(r.hardwareLevel)
			if (!solverVariables.getConflictGraph(l).empty) {
				val list = solverVariables.getColocationVariables(r)
				if (list.size > 1) {
					for (other: colocs) {
						/* doing  it via posting a test constraint did not work out
						val constraint = ICF.arithm(list.get(0), "=", other.get(0))
						System.out.println(constraint)
						solver.post(constraint)
				        solver.getEnvironment().worldPush();
						try { solver.propagate }
						catch (ContradictionException e) {
							solver.getEngine().flush()
							addToConflictGraph(list, other, solverVariables.getConflictGraph(l))					
						}
				        solver.getEnvironment().worldPop();
						solver.unpost(constraint)*/
						val iv = list.get(0)
						val oiv = other.get(0)
						for (var int i = iv.getLB(); i <= iv.getUB(); i = iv.nextValue(i)) {
							for (var int j = oiv.getLB(); j <= oiv.getUB(); j = oiv.nextValue(j)) {
//								val combinedSupply = new HashMap<String, Integer>()
								
							}
						}
					}
					colocs.add(list)
				}	
			}
		}
		
		var boolean hadGraph = false
		for (l:#[0,1,2]) {
			if (!solverVariables.getConflictGraph(l).empty) {
				hadGraph = true
				cliqueCoverConstraintBuild(solverVariables.getLocationVariables(l), solverVariables.getConflictGraph(l))
				try { solver.propagate }
				catch (ContradictionException e) { throw new BasicConstraintsException(this)	}
			}
		}
		return hadGraph
	}
	
	
	def void addToConflictGraph(List<IntVar> l1, List<IntVar> l2, List<BitSet> graph) {
		for (iface : l1) {
			val idx = model.eqInterfaces.indexOf(solverVariables.getInterfaceForLocationVariable(iface))
			for (conflict : l2) {
				val conflictIdx = model.eqInterfaces.indexOf(solverVariables.getInterfaceForLocationVariable(conflict))
				graph.get(idx).set(conflictIdx)
				graph.get(conflictIdx).set(idx)
			}
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

	def void cliqueCoverConstraintBuild(List<IntVar> intVarList, List<BitSet> graph) {
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
				return
			}
			val maxNode = graph.get(maxIdx)
			val uncoveredNode = uncovered.get(maxIdx)
			var BitSet seed
			
//			if (true) {
				/* new version the seed is a clique of uncovered vertices */
				val uncovCandidates = uncoveredNode.clone as BitSet
				seed = findClique(uncovCandidates, uncovered)			
//			} else {
//				/* old version: the seed is only one edge */
//				// find maximum neighbor among the ones reachable via uncovered edges
//				var int maxCovIdx = -1
//				var int maxCovCard = 0
//				for (var int idx = uncoveredNode.nextSetBit(0); idx != -1; idx = uncoveredNode.nextSetBit(idx+1)) {
//					val nodeClone = (graph.get(idx).clone as BitSet)
//					nodeClone.and(maxNode)
//					val card = nodeClone.cardinality
//					if (card > maxCovCard) {
//						maxCovIdx = idx
//						maxCovCard = card
//					}
//				}
//				seed = new BitSet
//				seed.set(maxCovIdx)
//			}
			// the candidates are the common neighborhood of the seed
			val candidates = maxNode.clone as BitSet
			for (var int idx = seed.nextSetBit(0); idx != -1; idx = seed.nextSetBit(idx+1)) {
				candidates.and(graph.get(idx))
			}
			val clique = findClique(candidates, graph)
			clique.set(maxIdx)
			clique.or(seed)
			val conflict = new ArrayList<IntVar>
			for (var int idx = clique.nextSetBit(0); idx != -1; idx = clique.nextSetBit(idx+1)) {
				conflict.add(intVarList.get(idx))
				uncovered.get(idx).andNot(clique)
			}
			solver.post(ICF.alldifferent(conflict, "AC"))
		}
	}
}
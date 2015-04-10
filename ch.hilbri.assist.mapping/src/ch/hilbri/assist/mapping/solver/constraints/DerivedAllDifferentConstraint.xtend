package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.BitSet
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar

class DerivedAllDifferentConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("derived all different", model, solver, solverVariables)
	}
	
	override generate() {
		// generating all differents for pairs of colocalities which do not fit on the same connector
		// this is only useful if both colocality groups are not fixed to a connector yet
		// because otherwise the type pin matching should handle this case
		val List<List<IntVar>> colocs = new ArrayList<List<IntVar>>()
		val Map<IntVar, Map<String,Integer>> colocDemand = new HashMap
		for (r : model.colocalityRelations) {
			val l = solverVariables.getLevelIndex(r.hardwareLevel)
			if (!solverVariables.getConflictGraph(l).empty) {
				val list = solverVariables.getColocationVariables(r)
				val demand = new HashMap<String, Integer>
				for (v: list) {
					val iface = solverVariables.getInterfaceForLocationVariable(v)
					demand.put(iface.ioType, demand.getOrDefault(iface.ioType, 0) + 1)
				}
				val iv = list.get(0)
				colocDemand.put(iv, demand)
				if (list.size > 1 && !iv.instantiated) {
					for (other: colocs) {
						// doing  it via posting a test constraint did not work out
//						val constraint = ICF.arithm(list.get(0), "=", other.get(0))
//						System.out.println(constraint)
//				        solver.getEnvironment().worldPush();
//						solver.post(constraint)
//						try { solver.propagate }
//						catch (ContradictionException e) {
//							solver.getEngine().flush()
//							addToConflictGraph(list, other, solverVariables.getConflictGraph(l))					
//						}
//						solver.unpost(constraint)
//				        solver.getEnvironment().worldPop();
						val oiv = other.get(0)
						if (!oiv.instantiated && other.findFirst[list.contains(it)] == null) {
							val odemand = colocDemand.get(oiv)
							var haveCommonConnector = false
							for (var int i = iv.getLB(); i <= iv.getUB(); i = iv.nextValue(i)) {
								var fit = false
								if (oiv.contains(i)) {
									val connector = model.allConnectors.get(i)
									fit = true
									for (supply : connector.availableEqInterfaces) {
										if (demand.getOrDefault(supply.eqInterfaceType, 0) + odemand.getOrDefault(supply.eqInterfaceType, 0) > supply.count) {
											fit = false
										}
									}	
								}
								if (fit) {
									haveCommonConnector = true
									i = iv.getUB() // poor man's break
								}
							}
							if (!haveCommonConnector) {
								addToConflictGraph(list, other, solverVariables.getConflictGraph(l))
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
	
	def void enrichWithDisjointDomainVars(List<IntVar> locVars, List<BitSet> graph) {
		// add "conflicts" for variables which already have disjoint domains to build bigger cliques
		for (idx: 0..<locVars.size) {
			val iv = locVars.get(idx)					
			for (conflictIdx: idx+1..<locVars.size) {
				val cv = locVars.get(conflictIdx)					
				var overlap = false
				for (var int i = iv.getLB(); i <= iv.getUB(); i = iv.nextValue(i)) {
					if (cv.contains(i)) {
						overlap = true
						i = iv.getUB() // poor man's break
					}
				}
				if (!overlap) {
					graph.get(idx).set(conflictIdx)
					graph.get(conflictIdx).set(idx)							
				}
			}
		}		
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
		var numConflicts = 0
		for (node:graph) {
			uncovered.add(node.clone() as BitSet)
			numConflicts += node.cardinality
		}
		numConflicts /= 2
		enrichWithDisjointDomainVars(intVarList, graph)
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
			
			if (numConflicts > 10000) {
				/* less redundant version: the seed is a clique of uncovered vertices */
				val uncovCandidates = uncoveredNode.clone as BitSet
				seed = findClique(uncovCandidates, uncovered)			
			} else {
				/* do very many cliques: the seed is only one edge */
				// find maximum neighbor among the ones reachable via uncovered edges
				var int maxCovIdx = -1
				var int maxCovCard = -1
				for (var int idx = uncoveredNode.nextSetBit(0); idx != -1; idx = uncoveredNode.nextSetBit(idx+1)) {
					val nodeClone = (graph.get(idx).clone as BitSet)
					nodeClone.and(maxNode)
					val card = nodeClone.cardinality
					if (card > maxCovCard) {
						maxCovIdx = idx
						maxCovCard = card
					}
				}
				seed = new BitSet
				seed.set(maxCovIdx)
			}
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
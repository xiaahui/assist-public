package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedDislocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.BitSet
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.slf4j.LoggerFactory
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class DislocalityConstraint extends AbstractMappingConstraint {
	
	private List<ArrayList<BitSet>> conflictGraph 
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables, boolean buildConflictGraph) {
		super("interface dislocality", model, solver, solverVariables)
	
		this.logger = LoggerFactory.getLogger(this.class)
	
		conflictGraph = #[new ArrayList<BitSet>, new ArrayList<BitSet>, new ArrayList<BitSet>]
	
		if (buildConflictGraph) {
			for (iface:model.eqInterfaces) {
				// we build one conflict matrix for each level
				conflictGraph.get(0).add(new BitSet)
				conflictGraph.get(1).add(new BitSet)
				conflictGraph.get(2).add(new BitSet)
			}	
		}
	}
	
	override generate() {
		
		if (model.dislocalityRelations.isNullOrEmpty) return false

		for (r : model.dislocalityRelations) {
			var int level
			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) 		level = 0
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC)			level = 1
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT)	level = 2
			
			val l = level
			
			// Case 0: Nothing is mentioned - prevented by the input language grammar

			// Case 1: Only EqInterfaces mentioned
			if (r.eqInterfaceOrGroups.filter[it instanceof EqInterface].length == r.eqInterfaceOrGroups.length) {
				val intVars = r.eqInterfaceOrGroups.map[solverVariables.getEqInterfaceLocationVariable(it as EqInterface, l)]
				if (intVars.length > 1)
					solver.post(ICF.alldifferent(intVars, "AC"))
			} 
			
			// Case 2: Only a single group is mentioned
			else if (r.eqInterfaceOrGroups.length == 1 && r.eqInterfaceOrGroups.get(0) instanceof EqInterfaceGroup) {

				val group = r.eqInterfaceOrGroups.get(0) as EqInterfaceGroup
				
				// The group should not be empty
				if (group.eqInterfaces.length > 1) { 
					val intVars = group.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
					solver.post(ICF.alldifferent(intVars, "AC"))
				} else {
					logger.info('''       Skipping dislocality constraint with empty or one element group «group.name»''')
				}
				
			}
			
			// Case 3: A mix of groups and interfaces is specified
			else {
				val List<List<EqInterface>> ifaceList  = r.eqInterfaceOrGroups
														  .filter[(it instanceof EqInterface) || 
																	(it instanceof EqInterfaceGroup && (it as EqInterfaceGroup).eqInterfaces.length > 0)]
					  									  .toList
														  .map[ if (it instanceof EqInterface) #[it]
															    else if (it instanceof EqInterfaceGroup) it.eqInterfaces]
				
				if (conflictGraph.get(l).empty) {
					val List<List<IntVar>> intVarList = ifaceList.map[it.map[solverVariables.getEqInterfaceLocationVariable(it, l)]]
				
					val emptyGroupCounter = r.eqInterfaceOrGroups.length - ifaceList.length
					
					if (ifaceList.length <= 1) {
						logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction remained with «ifaceList.length» element(s). It is ineffective and skipped.''')
					} else {
						if (emptyGroupCounter > 0) {
							logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction was generated with «ifaceList.length» non-empty elements. (Restriction contained «r.eqInterfaceOrGroups.length» elements in total.)''')
						}
						val crossProductSize = intVarList.map[length as long].reduce(p,q|p*q)
						if (crossProductSize < 8) {
							recursiveConstraintBuild(intVarList, 0, new ArrayList<IntVar>)
						} else {
						    // this could be optimized by using the variable itself for groups containing only one element 
							val domainUnionVars = intVarList.map[VF.enumerated("DomainVarForGroup" + it, 0, model.getAllHardwareElements(l).size-1, solver)]
							solver.post(ACF.allDifferent(intVarList, domainUnionVars))					
						}
					}
				} else {
					addToConflictGraph(ifaceList, conflictGraph.get(l))					
				}
	
			}

			if (conflictGraph.get(l).empty) {
				try { solver.propagate }
				catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedDislocally(this, r.allEqInterfaceOrGroupNames)	}
			}
		}
		
		for (l:#[0,1,2]) {
			if (!conflictGraph.get(l).empty) {
				cliqueCoverConstraintBuild(solverVariables.getLocationVariables(l), conflictGraph.get(l))
				try { solver.propagate }
				catch (ContradictionException e) { throw new BasicConstraintsException(this)	}
			}
		}
		return true

	}
	
	def void recursiveConstraintBuild(List<List<IntVar>> intVarList, int idx, List<IntVar> conflict) {
		val curList = intVarList.get(idx)
		for (l: curList) {
			conflict.add(l)
			if (idx == intVarList.size - 1) {
				solver.post(ICF.alldifferent(conflict))				
			} else {
				recursiveConstraintBuild(intVarList, idx+1, conflict)
			}
			conflict.remove(conflict.size-1)
		}
		
	}
	
	def void addToConflictGraph(List<List<EqInterface>> ifaceList, List<BitSet> graph) {
		for (sublistIdx : 0..<ifaceList.size) {
			for (iface : ifaceList.get(sublistIdx)) {
				val idx = model.eqInterfaces.indexOf(iface)
				for (conflictListIdx : sublistIdx+1..<ifaceList.size) {
					for (conflict : ifaceList.get(conflictListIdx)) {
						val conflictIdx = model.eqInterfaces.indexOf(conflict)
						graph.get(idx).set(conflictIdx)
						graph.get(conflictIdx).set(idx)
					}	
				}
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

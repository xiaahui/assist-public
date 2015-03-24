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

class DislocalityConstraint extends AbstractMappingConstraint {
	
	private List<ArrayList<BitSet>> conflictGraph 
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables, boolean buildConflictGraph) {
		super("interface dislocality", model, solver, solverVariables)
	
		this.logger = LoggerFactory.getLogger(this.class)
	
		conflictGraph = #[new ArrayList<BitSet>, new ArrayList<BitSet>, new ArrayList<BitSet>]
	
		if (buildConflictGraph) {
			for (iface:model.eqInterfaces) {
				val node = new BitSet
				node.set(conflictGraph.get(0).size)
				conflictGraph.get(0).add(node)
				conflictGraph.get(1).add(node.clone as BitSet)
				conflictGraph.get(2).add(node.clone as BitSet)
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
					solver.post(ICF.alldifferent(intVars))
			} 
			
			// Case 2: Only a single group is mentioned
			else if (r.eqInterfaceOrGroups.length == 1 && r.eqInterfaceOrGroups.get(0) instanceof EqInterfaceGroup) {

				val group = r.eqInterfaceOrGroups.get(0) as EqInterfaceGroup
				
				// The group should not be empty
				if (group.eqInterfaces.length > 1) { 
					val intVars = group.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
					solver.post(ICF.alldifferent(intVars))
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
						val conflictIdx = model.eqInterfaces.indexOf(iface)
						graph.get(idx).set(conflictIdx)
						graph.get(conflictIdx).set(idx)
					}	
				}
			}
		}
	}
	
	def BitSet findClique(BitSet candidates, List<BitSet> graph) {
		var BitSet clique = (candidates.clone as BitSet)
		for (var int outIdx = clique.nextSetBit(0); outIdx != -1; outIdx = clique.nextSetBit(outIdx+1)) {
			var BitSet maxNode = null
			var int maxCard = 0
			for (var int idx = candidates.nextSetBit(outIdx+1); idx != -1; idx = candidates.nextSetBit(idx+1)) {
				var BitSet nodeClone = (graph.get(idx).clone as BitSet)
				nodeClone.and(clique)
				val card = nodeClone.cardinality
				if (card > maxCard) {
					maxNode = graph.get(idx)
					maxCard = card
				}			
			}
			clique.and(maxNode)
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
			var BitSet maxNode = null
			var int maxCard = 0
			for (node:uncovered) {
				val card = node.cardinality
				if (card > maxCard) {
					maxNode = node
					maxCard = card
				}
			}
			if (maxCard == 0) {
				return
			}
			// find maximum neighbor among the ones reachable via uncovered edges
			var BitSet maxCovNode = null
			var int maxCovCard = 0
			for (var int idx = maxNode.nextSetBit(0); idx != -1; idx = maxNode.nextSetBit(idx+1)) {
				val card = graph.get(idx).cardinality
				if (card > maxCovCard) {
					maxCovNode = graph.get(idx)
					maxCovCard = card
				}
			}
			// the candidates are the common neighborhood of the first two
			val BitSet candidates = maxNode.clone as BitSet
			candidates.and(maxCovNode)
			val clique = findClique(candidates, graph)
			val conflict = new ArrayList<IntVar>
			for (var int idx = clique.nextSetBit(0); idx != -1; idx = clique.nextSetBit(idx+1)) {
				conflict.add(intVarList.get(idx))
				uncovered.get(idx).andNot(clique)
			}
			solver.post(ICF.alldifferent(conflict))
		}
	}
}

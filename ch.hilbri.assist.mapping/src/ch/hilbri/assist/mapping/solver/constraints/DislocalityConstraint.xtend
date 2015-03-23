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
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface dislocality", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
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
			}

			try { solver.propagate }
			catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedDislocally(this, r.allEqInterfaceOrGroupNames)	}

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
				while (idx >= graph.size) {
					graph.add(new BitSet)
				} 
				for (conflictListIdx : sublistIdx+1..<ifaceList.size) {
					for (conflict : ifaceList.get(conflictListIdx)) {
						val conflictIdx = model.eqInterfaces.indexOf(iface)
						while (conflictIdx >= graph.size) {
							graph.add(new BitSet)
						} 
						graph.get(idx).set(conflictIdx)
						graph.get(conflictIdx).set(idx)
					}	
				}
			}
		}
	}
	
	def void cliqueCoverConstraintBuild(List<IntVar> intVarList, List<BitSet> graph) {
		val List<BitSet> uncovered = new ArrayList<BitSet>(graph.size)
		for (node:graph) {
			uncovered.add(node.clone() as BitSet)
		}
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
		for (var int idx = maxNode.nextSetBit(0); idx != -1; idx = maxNode.nextSetBit(idx)) {
			
		}
	}
}

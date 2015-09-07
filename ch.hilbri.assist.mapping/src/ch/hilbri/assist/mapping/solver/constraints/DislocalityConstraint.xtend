package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedDislocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface dislocality", model, solver, solverVariables)
	}
	
	override generate() {
		
		if (model.dislocalityRelations.isNullOrEmpty) return false

		for (r : model.dislocalityRelations) {
			val l = solverVariables.getLevelIndex(r.hardwareLevel)
			
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
				
				val List<List<IntVar>> intVarList = ifaceList.map[it.map[solverVariables.getEqInterfaceLocationVariable(it, l)]]
				
				val emptyGroupCounter = r.eqInterfaceOrGroups.length - ifaceList.length
					
				if (ifaceList.length <= 1) {
					logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction remained with «ifaceList.length» element(s). It is ineffective and skipped.''')
				} 
				
				else {
					if (emptyGroupCounter > 0) {
						logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction was generated with «ifaceList.length» non-empty elements. (Restriction contained «r.eqInterfaceOrGroups.length» elements in total.)''')
					}
				
					val crossProductSize = intVarList.map[length as long].reduce(p,q|p*q)
					if (crossProductSize < 8) {
						recursiveConstraintBuild(intVarList, 0, new ArrayList<IntVar>)
					} 
					else {
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
	
	
}

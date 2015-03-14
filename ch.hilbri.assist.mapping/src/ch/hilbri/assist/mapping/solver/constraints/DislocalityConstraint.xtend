package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceGroupCannotBeMappedDislocally
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.slf4j.LoggerFactory
import org.chocosolver.solver.variables.VF

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dislocality (improved, but w/o setvars)", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	override generate() {

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
				solver.post(ICF.alldifferent(intVars))
			} 
			
			// Case 2: Only a single group is mentioned
			else if (r.eqInterfaceOrGroups.length == 1 && r.eqInterfaceOrGroups.get(0) instanceof EqInterfaceGroup) {

				val group = r.eqInterfaceOrGroups.get(0) as EqInterfaceGroup
				
				// The group should not be empty
				if (group.eqInterfaces.length > 0) { 
					val intVars = (r.eqInterfaceOrGroups.get(0) as EqInterfaceGroup).eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
					solver.post(ICF.alldifferent(intVars))
				} else {
					logger.info('''... Skipping dislocality constraint with empty group «group.name»''')
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
			
				val emptyGroupCounter = r.eqInterfaceOrGroups.filter[it instanceof EqInterfaceGroup]
										 .filter[(it as EqInterfaceGroup).eqInterfaces.length < 1]
										 .length  
				
				if (r.eqInterfaceOrGroups.length - emptyGroupCounter <= 1) {
					logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction remained with «r.eqInterfaceOrGroups.length - emptyGroupCounter» element(s). It is ineffective and skipped.''')
				} else {
					if (emptyGroupCounter > 0) {
						logger.info('''      WARNING: A dislocality restriction contained «emptyGroupCounter» empty group(s) which were ignored. Restriction was generated with «r.eqInterfaceOrGroups.length - emptyGroupCounter» non-empty elements. (Restriction contained «r.eqInterfaceOrGroups.length» elements in total.)''')
					}
				    // this could be optimized by using the variable itself for groups containing only one element 
					val domainUnionVars = intVarList.map[VF.enumerated("DomainVarForGroup" + it, 0, model.getAllHardwareElements(l).size-1, solver)]
					solver.post(ACF.allDifferent(intVarList, domainUnionVars))
				}
			}

			try { solver.propagate }
			catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedDislocally(this, r.allEqInterfaceOrGroupNames)	}

			return true

		}

	}
}

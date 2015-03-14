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

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dislocality (improved, but w/o setvars)", model, solver, solverVariables)
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
				val intVars = (r.eqInterfaceOrGroups.get(0) as EqInterfaceGroup).eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
				solver.post(ICF.alldifferent(intVars))
			}
			
			// Case 3: A mix of groups and interfaces is specified
			else {
				val List<List<EqInterface>> ifaceList  = r.eqInterfaceOrGroups.map[ if (it instanceof EqInterface) #[it]
																				    else if (it instanceof EqInterfaceGroup) it.eqInterfaces]
				val List<List<IntVar>> intVarList = ifaceList.map[it.map[solverVariables.getEqInterfaceLocationVariable(it, l)]]
			
				solver.post(ACF.allDifferent(intVarList))
			}

			try { solver.propagate }
			catch (ContradictionException e) { throw new InterfaceGroupCannotBeMappedDislocally(this, r.allEqInterfaceOrGroupNames)	}

			return true

		}

	}
}
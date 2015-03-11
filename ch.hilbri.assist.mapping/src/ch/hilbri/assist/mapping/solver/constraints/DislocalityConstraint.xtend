package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.IntVar

class DislocalityConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("dislocality", model, solver, solverVariables)
	}
	
	override generate() {

		for (r : model.dislocalityRelations) {

						
			var int level
			if (r.hardwareLevel == HardwareArchitectureLevelType.CONNECTOR) 		level = 0
			else if (r.hardwareLevel == HardwareArchitectureLevelType.RDC)			level = 1
			else if (r.hardwareLevel == HardwareArchitectureLevelType.COMPARTMENT)	level = 2
			
			val l = level

			val List<List<EqInterface>> ifaceList  = r.eqInterfaceOrGroups.map[
																			if (it instanceof EqInterface) #[it]
																			else if (it instanceof EqInterfaceGroup) it.eqInterfaces								
																		]
			val List<List<IntVar>> intVarList = ifaceList.map[it.map[solverVariables.getEqInterfaceLocationVariable(it, l)]]
			
			
			solver.post(ICF.allDifferent(intVarList))

//			solver.post(ICF.allDifferent(r.allEqInterfaceOrGroupNames.map[
//				if (it instanceof EqInterface) 				#[solverVariables.getEqInterfaceLocationVariable(it, 0)]
//				else if (it instanceof EqInterfaceGroup)	it.map[solverVariables.eqInterfaceLocationVariables(it, 0)]
//			]))
//			
			
//			
//			/* level needs to be final */
//			val l = level
//			
//			/* Retrieve the list of all location variables for this level */
//			var List<IntVar> varList 
//			if (r.eqInterfaceGroup != null)
//			 	varList = r.eqInterfaceGroup.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
//			 else
//			 	varList = r.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, l)]
//			
//			/* Only post if there are actually elements in it */
//			if (varList.size > 1) {
//				solver.post(ICF.alldifferent(varList))
//				
//				try { solver.propagate }
//				catch (ContradictionException e) {
//					if (r.eqInterfaceGroup != null)
//						throw new InterfaceGroupCannotBeMappedDislocally(this, r.eqInterfaceGroup.name)
//					else
//						throw new InterfaceGroupCannotBeMappedDislocally(this, r.eqInterfaces.toString)
//				}
//			} 
//			else
//				return false
			
		}

		return true
	}
}
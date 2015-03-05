package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterfaceType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class InterfaceTypeConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type", model, solver, solverVariables)
	}
	
	override generate() {
		
		for (t : EqInterfaceType.values) {
			if (model.eqInterfaces.filter[ioType == t].length > 1) {
	
				val listOfallIndicatorBools = new ArrayList<List<BoolVar>>			
				for (i : model.eqInterfaces) {
					val connLoc = solverVariables.getEqInterfaceLocationVariable(i, 0)
					val indicatorBools = VF.boolArray("Indicator-Var-" + i.name, model.allConnectors.size, solver)
					
					solver.post(ICF.boolean_channeling(indicatorBools, connLoc, 0))
					
					listOfallIndicatorBools.add(indicatorBools)
				}				
				
				for (c : model.allConnectors) {
					
					// How many interfaces of this type are available at this connector?
					var availableInterfaceCount = 0
					if (c.availableEqInterfaces.filter[eqInterfaceType == t].length > 0) {
						availableInterfaceCount = c.availableEqInterfaces.filter[eqInterfaceType == t]
																		 .map[count]
																		 .reduce[p1, p2|p1+p2]
					}
					
					var sum = VF.integer("Sum-" + c.name, 0, availableInterfaceCount, solver)
					
					// Who is going to be mapped to this connector?
					val boolVarsForSingleConnector = listOfallIndicatorBools.map[it.get(model.allConnectors.indexOf(c))]
					
					// Enforce the sum
					solver.post(ICF.sum(boolVarsForSingleConnector, sum))
					try {
						solver.propagate
					} catch (ContradictionException e) {
						throw new BasicConstraintsException(this)
					}
				}
				
			}
		}
		
		
		
		return true
	}
}
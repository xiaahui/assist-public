package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.datamodel.model.Connector
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException

class RestrictInvalidDeploymentsConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("restrict invalid deployment", model, solver, solverVariables)
	}
	
	override generate() {
		if (model.invalidDeployments.empty) return false
	
		for (spec : model.invalidDeployments) {
		
			// which are the valid connectors?
			val list = new ArrayList<Connector>
			for (hwElem : spec.hardwareElements) {
				if (hwElem instanceof Compartment) 		list.addAll(hwElem.allConnectors)
				else if (hwElem instanceof RDC)		 	list.addAll(hwElem.connectors)
				else if (hwElem instanceof Connector)	list.add(hwElem)
			}

			// Remove duplicate connectors, then get their indices
			val idxList = list.toSet.toList.map[model.allConnectors.indexOf(it)]

			// which interfaces or groups do we have?
			val ifaceList = new ArrayList<EqInterface>
			for (ifaceOrGroup : spec.eqInterfaceOrGroups) { 
				if (ifaceOrGroup instanceof EqInterface) 			ifaceList.add(ifaceOrGroup)
				else if (ifaceOrGroup instanceof EqInterfaceGroup)	ifaceList.addAll(ifaceOrGroup.eqInterfaces)
			}
			
			// create constraints
			for (iface : ifaceList) 
				solver.post(ICF.not_member(solverVariables.getEqInterfaceLocationVariable(iface, 0), idxList))
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new BasicConstraintsException(this) }
			
		}

		return true
	}
}
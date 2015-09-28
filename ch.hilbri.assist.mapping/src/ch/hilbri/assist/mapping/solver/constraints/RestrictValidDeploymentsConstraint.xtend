package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.datamodel.model.Connector
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.Pin
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.exceptions.RestrictValidDeployment
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

/**
 * This is a constraint which restricts all variables which are referenced
 * in the eqInterfaceOrGroups member to a set of allowed pin indizes
 * 
 * The specification allows for an implicit specification of allowed pins; 
 * but this implicit definitions are not exploded here, but instead in the
 * model preprocessors
 */
class RestrictValidDeploymentsConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("restrict valid deployment", model, solver, solverVariables)
	}
	
	override generate() {
		if (model.validDeployments.empty) return false
	
		for (spec : model.validDeployments) {
		
			// which are the valid connectors?
			val list = new ArrayList<Pin>
			for (hwElem : spec.hardwareElements) {
				if (hwElem instanceof Compartment) 		list.addAll(hwElem.pins)
				else if (hwElem instanceof RDC)		 	list.addAll(hwElem.pins)
				else if (hwElem instanceof Connector)	list.addAll(hwElem.pins)
				else if (hwElem instanceof Pin)			list.add(hwElem)
			}

			// Remove duplicate connectors; then get their indices
			val idxList = list.toSet.map[model.pins.indexOf(it)]

			// which interfaces or groups do we have?
			val ifaceList = new ArrayList<EqInterface>
			for (ifaceOrGroup : spec.eqInterfaceOrGroups) { 
				if (ifaceOrGroup instanceof EqInterface) 			ifaceList.add(ifaceOrGroup)
				else if (ifaceOrGroup instanceof EqInterfaceGroup)	ifaceList.addAll(ifaceOrGroup.eqInterfaces)
			}
			
			// create constraints
			for (iface : ifaceList) 
				solver.post(ICF.member(solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.PIN), idxList))
			
			try { solver.propagate }
			catch (ContradictionException e) { throw new RestrictValidDeployment(this, spec.allEqInterfaceOrGroupNames, spec.hardwareElements.toString) }
			
		}

		return true
	}
	
}
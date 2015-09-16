package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import ch.hilbri.assist.mapping.solver.exceptions.PowerSupplyCannotBeSatisfied

class PowerSupplyConstraint extends AbstractMappingConstraint {
	
	/* Each interface with a power-Supply specification can only be mapped
	 * to RDCs with the specified power supply attribute */
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("power supply types", model, solver, solverVariables)
	}
	
	override generate() {
		// Is there any interface which requires a specifc power supply?
		if (model.eqInterfaces.filter[!it.pwSup1.isNullOrEmpty].isNullOrEmpty) 
			return false
		/*
		 * "DC1"    	on RDC.PW_SUP1="DC1" oder "DC1 EMER"
		 * "DC1 EMER"   on RDC.PW_SUP1="DC1 EMER"
		 * "DC2"		on RDC.PW_SUP1="DC2" oder "DC2 EMER"
		 * "DC2 EMER"   on Board.PW_SUP1=DC2 EMER
		 */
		for (iface : model.eqInterfaces.filter[!it.pwSup1.isNullOrEmpty]) {
				/* Retrieve the list of allowed RDCs */
				var Iterable<RDC> allowedRDCs
				
				/* Case: "DC1" or "DC2" */
				if (!iface.pwSup1.matches('.* EMER'))
					allowedRDCs = model.RDCs.filter[it.powerSupply.equals(iface.pwSup1) ||
													   it.powerSupply.equals(iface.pwSup1  + " EMER")]
				/* Case: "DC1 EMER" or "DC2 EMER" */
				else
					allowedRDCs = model.RDCs.filter[it.powerSupply.equals(iface.pwSup1)]
				
				/* Get the indices for the allowed RDCs */
				val allowedRDCsIndexes = allowedRDCs.map[model.RDCs.indexOf(it)]
				
				/* Get the variable on the RDC level for this interface */
				val locationVariableRDCLevel = solverVariables.getEqInterfaceLocationVariable(iface, 1)

				/* Restrict the RDCs accordingly */
				solver.post(ICF.member(locationVariableRDCLevel, allowedRDCsIndexes))
		
				try { solver.propagate }
				catch (ContradictionException e) {
					if (!iface.pwSup1.matches('.* EMER'))
				 		throw new PowerSupplyCannotBeSatisfied(this, iface.name, "\"" + iface.pwSup1 + "\" or \"" + iface.pwSup1 + " EMER\"")
				 	else
						throw new PowerSupplyCannotBeSatisfied(this, iface.name, "\"" + iface.pwSup1 + "\"")
				}
		}		
		return true
	}
}
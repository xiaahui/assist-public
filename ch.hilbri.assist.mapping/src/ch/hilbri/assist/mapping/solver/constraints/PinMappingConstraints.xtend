package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.variables.VF
import org.slf4j.LoggerFactory

class PinMappingConstraints extends AbstractMappingConstraint {
	new(AssistModel p_model, Solver p_solver, SolverVariablesContainer p_solverVariables) {
		super("inverse channeling ('pin perspective')", p_model, p_solver, p_solverVariables)
		logger 	= LoggerFactory.getLogger(this.class)
	}
	
		
	override generate() {
		// Initialize the list of pinVars
		for (pin : model.pins) {
			val newPinVar = VF.enumerated("PinVar-" + pin.name, 0, model.eqInterfaces.length + solverVariables.pseudoInterfaces.length, solver)
			solverVariables.pinVarMap.put(pin, newPinVar)
		}
		
		// Now we post the new inverse channeling
		val eqIfaceList = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN) + solverVariables.pseudoInterfaces
		val pinVarList = model.pins.map[solverVariables.pinVarMap.get(it)]
		solver.post(ACF.inverse_channeling(eqIfaceList, pinVarList))
		
		true
	}
}
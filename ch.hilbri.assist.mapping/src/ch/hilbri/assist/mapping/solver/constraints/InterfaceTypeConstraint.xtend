package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.ProtectionLevelType
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.slf4j.LoggerFactory

class InterfaceTypeConstraint extends AbstractMappingConstraint {
		
	/* Constructor */
	new(AssistModel p_model, Solver p_solver, SolverVariablesContainer p_solverVariables) {
		super("(configurable) interface type", p_model, p_solver, p_solverVariables)
		logger 			= LoggerFactory.getLogger(this.class)
	}

	/* The allDifferent Constraint is not part of this constraint;
	 * this constraint just restricts the interfaces to compatible types.
	 * The allDifferent constraint is done in the connected pin constraint. */

	override generate() {

		val ifaceTypes = model.eqInterfaces.map[ioType].toSet

		// We go through every equipment interface type and check where it could be placed
		for (ifaceType : ifaceTypes) {
			
			// Which pin types are compatible with this interface io type?
			// .. the exact string matched type
			val compatiblePinTypes = model.getCompatiblePinTypes(ifaceType)
			
			// This is list of all compatible pins for the interfaces, 
			// if we just look at the eqInterfaceType
			val typeCompatiblePinIndizes 	= model.pins.filter[compatiblePinTypes.contains(eqInterfaceType)].map[model.pins.indexOf(it)]
						
			// This is a list of all interfaces that we have to work with in this loop
			val ifaceList			 		= model.eqInterfaces.filter[ioType == ifaceType] 
			
			// Restrict all eqInterfaces to pins with a compatible protection level
			// This cannot be made for the entire type; it depends on the equipment!
			for (iface : ifaceList) {
				//  - Retrieve list of allowed pins (filter according to protection level)
				val protLevelCompatiblePinIndizes = typeCompatiblePinIndizes.filter[filterPinsForProtectionLevel(iface, 
																								model.pins.get(it).connector.rdc, 
																								model.pins.get(it).protectionLevel)]
				//  - Post a member constraint
				solver.post(ICF.member(solverVariables.getEqInterfaceLocationVariable(iface, HardwareArchitectureLevelType.PIN), 
									   protLevelCompatiblePinIndizes))
			}
		}
		
		propagate

		true
	}
	
	private def boolean filterPinsForProtectionLevel(EqInterface iface, RDC rdc, ProtectionLevelType pinProtectionLevel) {

		// no additional pin restrictions?
		if (model.protectionLevelData == null) 
			return true 
		
		val protLevelRequirements = model.globalBlock.protectionLevelDataBlock.protectionLevelEntries.
										filter[emhZone1 == iface.emhZone1 && rdcLocation == rdc.location]
		
		// does this mapping require special treatment?
		if (protLevelRequirements.nullOrEmpty)
			return true 
		
		// we do need to look at the requirements and check the compatibility
		// of the protection level
		else {
			for (req : protLevelRequirements)
				for (level : req.protectionLevel) 
					if (level == pinProtectionLevel) 
						return true
							
		}
		
		return false
	}
}


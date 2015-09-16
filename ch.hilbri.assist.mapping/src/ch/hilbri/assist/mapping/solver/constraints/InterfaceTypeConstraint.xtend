package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeCouldNotBeMapped
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeDemandExceedsSupply
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/*
 * 20150407-RPH: PinMatching is now enabled by default; Indicator-variables (boolean channeling) is no longer necessary 
 */
class InterfaceTypeConstraint extends AbstractMappingConstraint {
	
	private Logger logger
	
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
	}

	override generate() {
		// 1. Generate a list of all ioTypes used in this specification
		//    - we collect all types from the interfaces in the spec, remove duplicates and sort them
		val ioTypesList = model.eqInterfaces.map[it.ioType].toSet.toList.sort
		
		// 2. Generate the constraints
		for (t : ioTypesList) {
			
			
			// How many interfaces of this type does each connector offer?
			val interfaceSupplyPerConnector = model.connectors.map[
													if (!availableEqInterfaces.filter[eqInterfaceType.equals(t)].isNullOrEmpty)
														availableEqInterfaces.filter[eqInterfaceType.equals(t)].map[count].reduce[p1, p2|p1 + p2]
													else 
														0]

			// A list of all interfaces of the current type														
			val interfacesOfType 			= model.eqInterfaces.filter[ioType.equals(t)]
			
			// How many interfaces of the current type are requested?
			val totalDemand 				= interfacesOfType.length
			
			// How many interfaces of the current type are available?
			val totalSupply 				= interfaceSupplyPerConnector.reduce[p1, p2|p1+p2]			
			
			// Check that the supply is sufficient for the demand
			if (totalDemand > totalSupply)
				throw new InterfaceTypeDemandExceedsSupply(this, t, totalDemand, totalSupply)

			/*  We need no constraints if the "smallest" connector (i.e. every connector!) 
			    can handle all (this includes the "demand==0" case) */
			if (totalDemand > interfaceSupplyPerConnector.min) {

				// A list of all interface indices with the current type
				val int[] indexListOfAffectedInterfaces = interfacesOfType.map[model.eqInterfaces.indexOf(it)]
				
				// building allowed tuples 
				val tuples = new Tuples(true) // true = valid tuples
				var int pinIdx = 0
				for (int connIdx : 0 ..< model.connectors.length) {
					for (int pin : 0 ..< interfaceSupplyPerConnector.get(connIdx)) {
						tuples.add(connIdx, pinIdx)
						pinIdx++						
					}
				}
			
				val connectorLocationVars = indexListOfAffectedInterfaces.map[solverVariables.getLocationVariables(0).get(it)]
				val pinLocationVars = new ArrayList<IntVar>
				
				// building table constraints reflecting the location hierarchy		
				for (locVar : connectorLocationVars) {
					val pinVar = VF.enumerated("Pin-"+locVar.name, 0, totalSupply-1, solver) // Pin-variable which is like a connector variables ranging over all pins of this type
					solver.post(ICF.table(locVar, pinVar, tuples, ""))
					pinLocationVars.add(pinVar)
				}
	
				solver.post(ICF.alldifferent(pinLocationVars, "AC")) // Pins must not share a single type offered --> this realizes the sum constraint for each connector
				
				try { solver.propagate } 
				catch (ContradictionException e) { throw new InterfaceTypeCouldNotBeMapped(this, t) }
			}

		}

		return true
	}
}

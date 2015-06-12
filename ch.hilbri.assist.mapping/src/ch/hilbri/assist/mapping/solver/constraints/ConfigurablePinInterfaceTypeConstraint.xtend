package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ConfigurablePinInterfaceTypeConstraint extends AbstractMappingConstraint {
	private Logger logger
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type with configurable pins", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	override generate() {
		

		/*
		 * Connector C1 {
		 * 	  "T0" = 2;
		 *    "T1" = 1;
		 * }
		 * 
		 * Connector C2 {
		 * 	  "T0" = 1;
		 *    "T3" = 2;
		 * }
		 * 
		 * -> typeListOfAllAvailablePins = [T0, T0, T1, T0, T3, T3]
		 * 
		 */		
		
		val typeListOfAllAvailablePins = model.allConnectors.map[ availableEqInterfaces.map[availIfaces |  (1 .. availIfaces.count).map[availIfaces.eqInterfaceType] ]
								 							     .flatten
										  ]
									  .flatten
		
		
		/*
		 * Connector C1 {
		 * 	  "T0" = 2;
		 *    "T1" = 1;
		 * }
		 * 
		 * Connector C2 {
		 * 	  "T0" = 1;
		 *    "T3" = 2;
		 * }
		 * 
		 * -> connectorIndexForAllPins  = [0, 0, 0, 1, 1, 1]
		 * 
		 */		
		val connectorIndexForAllPins = model.allConnectors.map[con | con.availableEqInterfaces.map[availIfaces |  (1 .. availIfaces.count).map[ model.allConnectors.indexOf(con)] ]
								 							     .flatten
										  ]
									  .flatten

		val connectorLocationVars = model.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, HardwareArchitectureLevelType.CONNECTOR)]
		val pinLocationVars = new ArrayList<IntVar>
		
		for (locVar : connectorLocationVars) {

			// "connect" the placement in connector level and pin level
			val pinVar = VF.enumerated("Pin-"+locVar.name, 0, typeListOfAllAvailablePins.length-1, solver)
			solver.post(ACF.element(locVar, connectorIndexForAllPins, pinVar))
		
			// restrict the pin variable
			val ifaceType = solverVariables.getInterfaceForLocationVariable(locVar).ioType
			
			val possiblePins = typeListOfAllAvailablePins.indexed   // turn each entry to (index (=key), value) pair
														 .filter[value.equals(ifaceType)]
														 .map[key]
			
			solver.post(ICF.member(pinVar, possiblePins))
			
			// store the pin variable for later (alldifferent)
			pinLocationVars.add(pinVar)
		}
		
		solver.post(ICF.alldifferent(pinLocationVars, "AC")) // Pins must not share a single type offered --> this realizes the sum constraint for each connector

		propagate
		
		return true
	}
}
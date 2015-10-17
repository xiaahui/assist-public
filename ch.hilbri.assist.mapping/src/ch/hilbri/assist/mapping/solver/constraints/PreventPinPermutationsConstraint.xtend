package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.slf4j.LoggerFactory

class PreventPinPermutationsConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("prevent pin permutations", model, solver, solverVariables)
		logger = LoggerFactory.getLogger(this.class)
	}
	
	override generate() {
		
		var didWeDoSomething = false
		
		// Create a list of pins which are equal
		// -- regarding their connector
		// -- regarding their interface type
		// -- regarding their protection level
		// -- not connected to other pins
		// and retrieve only those groups, where more than 1 pin is affected
		
		val pinGroups = model.pins.filter[pin | if  (pin.connector.rdc.internalConnectedPinBlock == null) true
			                                    else pin.connector.rdc.internalConnectedPinBlock.connectedPins.filter[it.pins.contains(pin)].nullOrEmpty]
  								  .groupBy[ model.connectors.indexOf(it.connector).toString +
										    it.eqInterfaceType.toString    					+ 
										    it.protectionLevel.literal.toString    			]
								  .filter[k, v| v.length > 1]

		for (g : pinGroups.values) {
			val pinVars = g.map[solverVariables.pinVarMap.get(it)]
			
			// Now we post an increasing order - but we have to do it pairwise
			for (var i = 0; i < pinVars.length - 1; i++) 
				solver.post(ICF.arithm(pinVars.get(i), "<=", pinVars.get(i+1)))
			
			didWeDoSomething = true
		}		
		
		propagate		
		
		didWeDoSomething
	}
}
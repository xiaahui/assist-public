package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeCouldNotBeMapped
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.BoolVar
import org.chocosolver.solver.variables.VF
import ch.hilbri.assist.mapping.solver.exceptions.InterfaceTypeDemandExceedsSupply
import org.chocosolver.solver.constraints.^extension.Tuples
import java.util.ArrayList
import org.chocosolver.solver.variables.IntVar

class InterfaceTypeConstraint extends AbstractMappingConstraint {
	
	private boolean doPinMatching
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables, boolean doPinMatching) {
		super("interface type", model, solver, solverVariables)
		this.doPinMatching = doPinMatching
	}

	override generate() {
		// 1. Generate a list of all ioTypes used in this specification
		//    - we collect all types from the interfaces in the spec, remove duplicates and sort them
		val ioTypesList = model.eqInterfaces.map[it.ioType].toSet.toList.sort
		
		// 2. Generate the constraints
		for (t : ioTypesList) {
			
			val interfacesOfType 		= model.eqInterfaces.filter[ioType.equals(t)]
			val totalDemand = interfacesOfType.length
			
			val interfaceSupplyPerConnector = model.allConnectors.map[
													if (!availableEqInterfaces.filter[eqInterfaceType.equals(t)].isNullOrEmpty)
														availableEqInterfaces.filter[eqInterfaceType.equals(t)].map[count].reduce[p1, p2|p1 + p2]
													else 
														0 
											  ]
			val totalSupply = interfaceSupplyPerConnector.reduce[p1, p2|p1+p2]

			if (totalDemand > totalSupply)
				throw new InterfaceTypeDemandExceedsSupply(this, t, totalDemand, totalSupply)

			/*  we need no constraints if the "smallest" connector (i.e. every connector!) 
			    can handle all (this includes the "demand==0" case) */
			if (totalDemand > interfaceSupplyPerConnector.min) {
				// which variables correspond to this type?
				val int[] indexListOfAffectedInterfaces = interfacesOfType.map[model.eqInterfaces.indexOf(it)]
				
				if (doPinMatching) {
					// building allowed tuples
					val tuples = new Tuples(true)
					var int pinIdx = 0
					for (int connIdx : 0 ..< model.allConnectors.length) {
						for (int pin : 0 ..< interfaceSupplyPerConnector.get(connIdx)) {
							tuples.add(connIdx, pinIdx)
							pinIdx++						
						}
					}
			
					val connectorLocationVars = indexListOfAffectedInterfaces.map[solverVariables.getLocationVariables(0).get(it)]
					val pinLocationVars = new ArrayList<IntVar>
					// building table constraints reflecting the location hierarchy		
					for (locVar : connectorLocationVars) {
						val pinVar = VF.integer("Pin-"+locVar.name, 0, totalSupply-1, solver)
						solver.post(ICF.table(locVar, pinVar, tuples, ""))
						pinLocationVars.add(pinVar)
					}
	
					solver.post(ICF.alldifferent(pinLocationVars))
					try { solver.propagate } 
					catch (ContradictionException e) { throw new InterfaceTypeCouldNotBeMapped(this, t) }
				} else {
					for (int cIdx : 0 ..< model.allConnectors.length) {
	
						// constraint for each connector the sum of the attached interfaces
						val sum = VF.bounded("Sum-" + t + "-" + cIdx, 0, interfaceSupplyPerConnector.get(cIdx), solver)
										  
						val BoolVar[] indicatorVariableList = indexListOfAffectedInterfaces.map[solverVariables.interfaceConnectorIndicatorVariables.get(cIdx).get(it)]					
						
						solver.post(ICF.sum(indicatorVariableList, sum))
						
						try { solver.propagate } 
						catch (ContradictionException e) { throw new InterfaceTypeCouldNotBeMapped(this, t) }
					}
				}
			}

		}

		return true
	}
}

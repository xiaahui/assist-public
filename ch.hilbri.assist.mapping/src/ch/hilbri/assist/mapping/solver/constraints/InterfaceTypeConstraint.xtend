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

class InterfaceTypeConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type", model, solver, solverVariables)
	}

	override generate() {
		// 1. Generate a list of all ioTypes used in this specification
		//    - we collect all types from the interfaces in the spec, remove duplicates and sort them
		val ioTypesList = model.eqInterfaces.map[it.ioType].toSet.toList.sort
		
		// 2. Generate the constraints
		for (t : ioTypesList) {
			
			val totalInterfaceDemand 		= model.eqInterfaces.filter[ioType.equals(t)].length
			
			val interfaceSupplyPerConnector = model.allConnectors.map[
													if (!availableEqInterfaces.filter[eqInterfaceType.equals(t)].isNullOrEmpty)
														availableEqInterfaces.filter[eqInterfaceType.equals(t)].map[count].reduce[p1, p2|p1 + p2]
													else 
														0 
											  ]

			if (totalInterfaceDemand > interfaceSupplyPerConnector.reduce[p1, p2|p1+p2])
				throw new InterfaceTypeDemandExceedsSupply(this, t, totalInterfaceDemand, interfaceSupplyPerConnector.reduce[p1, p2|p1+p2])

			/*  we need no constraints if the "smallest" connector (i.e. every connector!) 
			    can handle all (this includes the "demand==0" case) */
			if (totalInterfaceDemand > interfaceSupplyPerConnector.min) {

				// which variables correspond to this type?				
				val int[] indexListOfAffectedInterfaces = model.eqInterfaces.filter[ioType.equals(t)]
																			.map[model.eqInterfaces.indexOf(it)]
				
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

		return true
	}
}

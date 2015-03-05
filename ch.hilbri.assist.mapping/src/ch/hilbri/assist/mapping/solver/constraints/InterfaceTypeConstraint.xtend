package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterfaceType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.VF

class InterfaceTypeConstraint extends AbstractMappingConstraint {
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("interface type", model, solver, solverVariables)
	}

	override generate() {

		for (t : EqInterfaceType.values) {
			val totalInterfaceDemand = model.eqInterfaces.filter[ioType == t].length
			val interfaceSupplyPerConnector = model.allConnectors.map[
				availableEqInterfaces.filter[eqInterfaceType == t].map[count].reduce[p1, p2|p1 + p2]]

			// we need no constraints if the "smallest" connector can handle all (this includes the "demand==0" case)
			if (totalInterfaceDemand > interfaceSupplyPerConnector.min) {
				for (int cIdx : 0 ..< model.allConnectors.length) {

					// constraint for each connector the sum of the attached interfaces
					var sum = VF.integer("Sum-" + t + "-" + cIdx, 0, interfaceSupplyPerConnector.get(cIdx), solver)
					solver.post(ICF.sum(solverVariables.interfaceConnectorIndicatorVariables.get(cIdx), sum))
					try {
						solver.propagate
					} catch (ContradictionException e) {
						throw new BasicConstraintsException(this)
					}
				}

			}
		}

		return true
	}
}

package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.slf4j.LoggerFactory
import solver.Solver

class NetworkConstraints extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("Network constraints", model, solver, solverVariables)
		this.logger = LoggerFactory.getLogger(this.class);
	}
	
	override generate() {
		logger.debug("Network constraints are called.")
		return true
	}
	
}
package ch.hilbri.assist.scheduling.solver.variables

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import org.chocosolver.solver.Model

class SolverVariablesContainer {

	/** Store a reference to the ASSIST Input model */
	private AssistModelScheduling assistModel

	/** Store a reference to the choco solver */
	private Model solverModel

	/* CONSTRUCTOR */
	new(AssistModelScheduling assistModel, Model solverModel) {

		this.assistModel = assistModel
		this.solverModel = solverModel

		solverModel.solver.propagate()
	}

}

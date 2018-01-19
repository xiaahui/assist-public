package ch.hilbri.assist.scheduling.solver.variables

import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import org.apache.commons.math3.util.ArithmeticUtils
import org.chocosolver.solver.Model
import org.chocosolver.solver.variables.IntVar
import org.eclipse.xtend.lib.annotations.Accessors

class SolverVariablesContainer {

	/** Store a reference to the ASSIST Input model */
	private AssistModelScheduling assistModel

	/** Store a reference to the choco solver */
	private Model solverModel

	/** Length of the hyperPeriod */
	@Accessors(PUBLIC_GETTER) int hypLength = -1

	/* CONSTRUCTOR */
	new(AssistModelScheduling assistModel, Model solverModel) {

		this.assistModel = assistModel
		this.solverModel = solverModel

		solverModel.solver.propagate()

		if (!assistModel.allTasks.isNullOrEmpty) 
			hypLength = assistModel.allTasks.map[period].reduce[p1, p2 | ArithmeticUtils.lcm(p1,p2)]
	}
	
	def IntVar[] getAllVariables() {
		/* FIXME: Return a fake variable for now  */
		#[solverModel.intVar(1, 10)]
	}

}

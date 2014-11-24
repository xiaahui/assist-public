package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.slf4j.Logger
import solver.Solver

abstract class AbstractMappingConstraint {
	
	/** A reference to a generic logging facility */
	protected  Logger 					logger
	
	/** A name for this constraint */
	protected String					name
	
	/** A reference to the central data model */
	protected AssistModel 				model
	
	/** A reference to the store of the constraint solver */
	protected Solver 					solver
	
	/** A reference to the container of all solver variables */
	protected SolverVariablesContainer 	solverVariables
	
	/**
	 * Constructor
	 * 
	 * @param name Name of this Constraint
	 * @param model Reference to the data model which contains the input specification
	 * @param solver Reference to the solver instance
	 * @param solverVariables Reference to the container with all solver variables
	 */
	new(String name, AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		this.name = name
		this.model = model
		this.solver = solver
		this.solverVariables = solverVariables
	}
	
	/**
	 * Abstract method which generates the constraints and adds them to the
	 * constraint system
	 * 
	 * @return
	 */
	abstract def boolean generate()
	
	/**
	 * Returns the name of this constraint
	 */
	def String getName() {
		return name
	}
}
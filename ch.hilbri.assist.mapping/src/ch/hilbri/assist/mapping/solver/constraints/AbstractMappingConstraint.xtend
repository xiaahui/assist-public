package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.datamodel.model.AssistModel
import org.jacop.core.Store

abstract class AbstractMappingConstraint {
	
	/** A name for this constraint */
	protected String					name
	
	/** A reference to the central data model */
	protected AssistModel 				model
	
	/** A reference to the store of the constraint solver */
	protected Store 					constraintStore
	
	/** A reference to the container of all solver variables */
	protected SolverVariablesContainer 	solverVariables
	
	/**
	 * Constructor
	 * 
	 * @param name Name of this Constraint
	 * @param model Reference to the data model which contains the input specification
	 * @param constraintStore Reference to the store of the JaCoP solver instance
	 * @param solverVariables Reference to the container with all solver variables
	 */
	new(String name, AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		this.name = name
		this.model = model
		this.constraintStore = constraintStore
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
package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import org.chocosolver.solver.Model
import org.chocosolver.solver.exception.ContradictionException
import org.slf4j.Logger

abstract class AbstractMappingConstraint {
	
	/** A reference to a generic logging facility */
	protected  Logger 					logger
	
	/** A name for this constraint */
	protected String					name
	
	/** A reference to the central data model */
	protected AssistModel			model
	
	/** A reference to the store of the constraint solver */
	protected Model	 					chocoModel
	
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
	new(String name, AssistModel model, Model chocoModel, SolverVariablesContainer solverVariables) {
		this.name = name
		this.model = model
		this.chocoModel = chocoModel
		this.solverVariables = solverVariables
	}
	
	/**
	 * Abstract method which generates the constraints and adds them to the
	 * constraint system
	 * 
	 * @return
	 */
	abstract def boolean generate() throws BasicConstraintsException
	
	/**
	 * Propagation of constraints and throwing a generic exception if
	 * an inconsistency is encountered 
	 * 
	 * This should be overwritten in specific constraints
	 */
	def void propagate() throws BasicConstraintsException {
		try {
			chocoModel.solver.propagate()
		}
		catch (ContradictionException e) {
			throw new BasicConstraintsException(this)
		}
	}
	
	
	/**
	 * Returns the name of this constraint
	 */
	def String getName() {
		return name
	}
	
	
}
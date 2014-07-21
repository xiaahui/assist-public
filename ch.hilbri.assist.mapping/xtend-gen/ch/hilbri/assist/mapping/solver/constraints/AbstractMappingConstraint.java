package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.model.AssistModel;
import org.jacop.core.Store;

@SuppressWarnings("all")
public abstract class AbstractMappingConstraint {
  /**
   * A name for this constraint
   */
  protected String name;
  
  /**
   * A reference to the central data model
   */
  protected AssistModel model;
  
  /**
   * A reference to the store of the constraint solver
   */
  protected Store constraintStore;
  
  /**
   * A reference to the container of all solver variables
   */
  protected SolverVariablesContainer solverVariables;
  
  /**
   * Constructor
   * 
   * @param name Name of this Constraint
   * @param model Reference to the data model which contains the input specification
   * @param constraintStore Reference to the store of the JaCoP solver instance
   * @param solverVariables Reference to the container with all solver variables
   */
  public AbstractMappingConstraint(final String name, final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    this.name = name;
    this.model = model;
    this.constraintStore = constraintStore;
    this.solverVariables = solverVariables;
  }
  
  /**
   * Abstract method which generates the constraints and adds them to the
   * constraint system
   * 
   * @return
   */
  public abstract boolean generate();
  
  /**
   * Returns the name of this constraint
   */
  public String getName() {
    return this.name;
  }
}

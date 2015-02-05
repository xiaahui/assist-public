package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.exception.ContradictionException;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.slf4j.Logger;

@SuppressWarnings("all")
public abstract class AbstractMappingConstraint {
  /**
   * A reference to a generic logging facility
   */
  protected Logger logger;
  
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
  protected Solver solver;
  
  /**
   * A reference to the container of all solver variables
   */
  protected SolverVariablesContainer solverVariables;
  
  /**
   * Constructor
   * 
   * @param name Name of this Constraint
   * @param model Reference to the data model which contains the input specification
   * @param solver Reference to the solver instance
   * @param solverVariables Reference to the container with all solver variables
   */
  public AbstractMappingConstraint(final String name, final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    this.name = name;
    this.model = model;
    this.solver = solver;
    this.solverVariables = solverVariables;
  }
  
  /**
   * Abstract method which generates the constraints and adds them to the
   * constraint system
   * 
   * @return
   */
  public abstract boolean generate() throws BasicConstraintsException;
  
  /**
   * Propagation of constraints and throwing a generic exception if
   * an inconsistency is encountered
   * 
   * This should be overwritten in specific constraints
   */
  public void propagate() throws BasicConstraintsException {
    try {
      this.solver.propagate();
    } catch (final Throwable _t) {
      if (_t instanceof ContradictionException) {
        final ContradictionException e = (ContradictionException)_t;
        throw new BasicConstraintsException(this);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  /**
   * Returns the name of this constraint
   */
  public String getName() {
    return this.name;
  }
}

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.model.AssistModel;
import org.jacop.core.Store;

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
@SuppressWarnings("all")
public class SystemHierarchyConstraint extends AbstractMappingConstraint {
  public SystemHierarchyConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("System Hierarchy Constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    return true;
  }
}

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
@SuppressWarnings("all")
public class SystemHierarchyConstraint extends AbstractMappingConstraint {
  public SystemHierarchyConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("System Hierarchy Constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nElement cannot be resolved."
      + "\nimpose cannot be resolved");
  }
}

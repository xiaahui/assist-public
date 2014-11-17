package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

@SuppressWarnings("all")
public class RestrictedDeploymentConstraint extends AbstractMappingConstraint {
  public RestrictedDeploymentConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("Restricted deployment constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nIntervalDomain cannot be resolved."
      + "\nBoundDomain cannot be resolved."
      + "\nIn cannot be resolved."
      + "\naddDom cannot be resolved"
      + "\nimpose cannot be resolved");
  }
}

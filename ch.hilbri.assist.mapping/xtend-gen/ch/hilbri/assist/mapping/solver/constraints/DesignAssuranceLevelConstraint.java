package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

@SuppressWarnings("all")
public class DesignAssuranceLevelConstraint extends AbstractMappingConstraint {
  public DesignAssuranceLevelConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("Design assurance level constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nIntVar cannot be resolved to a type."
      + "\nIntervalDomain cannot be resolved."
      + "\nBoundDomain cannot be resolved."
      + "\nIntVar cannot be resolved."
      + "\nElement cannot be resolved."
      + "\nXgteqC cannot be resolved."
      + "\naddDom cannot be resolved"
      + "\nimpose cannot be resolved"
      + "\nimpose cannot be resolved");
  }
}

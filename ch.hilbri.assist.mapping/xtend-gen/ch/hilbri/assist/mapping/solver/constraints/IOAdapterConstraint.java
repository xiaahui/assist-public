package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

@SuppressWarnings("all")
public class IOAdapterConstraint extends AbstractMappingConstraint {
  public IOAdapterConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("I/O adapter constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    this.generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    this.generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    return true;
  }
  
  public void generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    throw new Error("Unresolved compilation problems:"
      + "\nBooleanVar cannot be resolved to a type."
      + "\nBooleanVar cannot be resolved."
      + "\nReified cannot be resolved."
      + "\nXeqC cannot be resolved."
      + "\nIntVar cannot be resolved."
      + "\nSumWeight cannot be resolved."
      + "\nimpose cannot be resolved"
      + "\nimpose cannot be resolved");
  }
  
  public void generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    throw new Error("Unresolved compilation problems:"
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

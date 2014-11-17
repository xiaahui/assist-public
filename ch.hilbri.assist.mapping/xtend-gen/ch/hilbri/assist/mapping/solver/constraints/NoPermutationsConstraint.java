package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

@SuppressWarnings("all")
public class NoPermutationsConstraint extends AbstractMappingConstraint {
  public NoPermutationsConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("No permutations of threads", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nXlteqY cannot be resolved."
      + "\nimpose cannot be resolved");
  }
}

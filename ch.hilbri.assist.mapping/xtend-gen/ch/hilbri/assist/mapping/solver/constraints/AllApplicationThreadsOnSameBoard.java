package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;

@SuppressWarnings("all")
public class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
  public AllApplicationThreadsOnSameBoard(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("All threads of an applications should be on the same board", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nXeqY cannot be resolved."
      + "\nimpose cannot be resolved");
  }
}

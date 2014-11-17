package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DislocalityConstraint extends AbstractMappingConstraint {
  public DislocalityConstraint(final AssistModel model, final /* Store */Object constraintStore, final SolverVariablesContainer solverVariables) {
    super("Dislocality constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    throw new Error("Unresolved compilation problems:"
      + "\nIntVar cannot be resolved to a type."
      + "\nIntVar cannot be resolved to a type."
      + "\nAlldifferent cannot be resolved."
      + "\nimpose cannot be resolved");
  }
  
  public /* ArrayList<ArrayList<IntVar>> */Object createDisjointVariableSets(final /* ArrayList<ArrayList<IntVar>> */Object locationVariables) {
    throw new Error("Unresolved compilation problems:"
      + "\nIntVar cannot be resolved to a type."
      + "\nIntVar cannot be resolved to a type."
      + "\nIntVar cannot be resolved to a type."
      + "\nIntVar cannot be resolved to a type."
      + "\nIntVar cannot be resolved to a type.");
  }
}

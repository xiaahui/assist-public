package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solver.Solver;

@SuppressWarnings("all")
public class NetworkConstraints extends AbstractMappingConstraint {
  public NetworkConstraints(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Network constraints", model, solver, solverVariables);
    Class<? extends NetworkConstraints> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  public boolean generate() {
    this.logger.debug("Network constraints are called.");
    return true;
  }
}

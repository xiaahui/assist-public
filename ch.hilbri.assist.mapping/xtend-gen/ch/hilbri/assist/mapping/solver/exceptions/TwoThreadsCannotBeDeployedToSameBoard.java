package ch.hilbri.assist.mapping.solver.exceptions;

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TwoThreadsCannotBeDeployedToSameBoard extends BasicConstraintsException {
  private ch.hilbri.assist.datamodel.model.Thread t1;
  
  private ch.hilbri.assist.datamodel.model.Thread t2;
  
  public TwoThreadsCannotBeDeployedToSameBoard(final AbstractMappingConstraint constraint, final ch.hilbri.assist.datamodel.model.Thread t1, final ch.hilbri.assist.datamodel.model.Thread t2) {
    super(constraint);
    this.t1 = t1;
    this.t2 = t2;
  }
  
  @Override
  public String getExplanation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The threads \"�t1.name�\" and \"�t2.name�\" of application \"�t1.application.name�\" could not be mapped to the same board.");
    return _builder.toString();
  }
}

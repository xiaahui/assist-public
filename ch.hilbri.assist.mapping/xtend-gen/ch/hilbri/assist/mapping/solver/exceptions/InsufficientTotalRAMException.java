package ch.hilbri.assist.mapping.solver.exceptions;

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class InsufficientTotalRAMException extends BasicConstraintsException {
  public InsufficientTotalRAMException(final AbstractMappingConstraint constraint) {
    super(constraint);
  }
  
  @Override
  public String getExplanation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("There is not enough total RAM in the system for all applications.");
    return _builder.toString();
  }
}

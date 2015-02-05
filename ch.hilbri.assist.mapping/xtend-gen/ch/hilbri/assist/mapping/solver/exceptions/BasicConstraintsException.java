package ch.hilbri.assist.mapping.solver.exceptions;

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicConstraintsException extends Exception {
  private AbstractMappingConstraint constraint;
  
  public BasicConstraintsException(final AbstractMappingConstraint constraint) {
    this.constraint = constraint;
  }
  
  public String getConstraintName() {
    return this.constraint.getName();
  }
  
  public String getExplanation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Adding the constraints \"");
    String _constraintName = this.getConstraintName();
    _builder.append(_constraintName, "");
    _builder.append("\" lead to an inconsistency.");
    return _builder.toString();
  }
}

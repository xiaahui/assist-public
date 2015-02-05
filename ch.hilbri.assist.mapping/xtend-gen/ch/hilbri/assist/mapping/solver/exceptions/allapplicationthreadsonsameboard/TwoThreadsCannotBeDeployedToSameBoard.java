package ch.hilbri.assist.mapping.solver.exceptions.allapplicationthreadsonsameboard;

import ch.hilbri.assist.datamodel.model.Application;
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
  
  public String getExplanation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The threads \"");
    String _name = this.t1.getName();
    _builder.append(_name, "");
    _builder.append("\" and \"");
    String _name_1 = this.t2.getName();
    _builder.append(_name_1, "");
    _builder.append("\" of application \"");
    Application _application = this.t1.getApplication();
    String _name_2 = _application.getName();
    _builder.append(_name_2, "");
    _builder.append("\" could not be mapped to the same board.");
    return _builder.toString();
  }
}

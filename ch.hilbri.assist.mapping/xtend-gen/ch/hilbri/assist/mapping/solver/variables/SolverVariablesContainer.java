package ch.hilbri.assist.mapping.solver.variables;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jacop.core.IntVar;

@Data
@SuppressWarnings("all")
public class SolverVariablesContainer {
  private final ArrayList<IntVar> _solutionVariablesList = new ArrayList<IntVar>();
  
  public ArrayList<IntVar> getSolutionVariablesList() {
    return this._solutionVariablesList;
  }
  
  public IntVar[] getSolutionVariablesAsArray() {
    ArrayList<IntVar> _solutionVariablesList = this.getSolutionVariablesList();
    Object[] _array = _solutionVariablesList.toArray();
    final Function1<Object, IntVar> _function = new Function1<Object, IntVar>() {
      public IntVar apply(final Object it) {
        return ((IntVar) it);
      }
    };
    return ((IntVar[])Conversions.unwrapArray(ListExtensions.<Object, IntVar>map(((List<Object>)Conversions.doWrapArray(_array)), _function), IntVar.class));
  }
  
  public SolverVariablesContainer() {
    super();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_solutionVariablesList== null) ? 0 : _solutionVariablesList.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SolverVariablesContainer other = (SolverVariablesContainer) obj;
    if (_solutionVariablesList == null) {
      if (other._solutionVariablesList != null)
        return false;
    } else if (!_solutionVariablesList.equals(other._solutionVariablesList))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

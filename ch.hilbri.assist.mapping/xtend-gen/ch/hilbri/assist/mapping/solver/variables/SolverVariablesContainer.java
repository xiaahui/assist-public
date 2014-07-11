package ch.hilbri.assist.mapping.solver.variables;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.HardwareElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

@Data
@SuppressWarnings("all")
public class SolverVariablesContainer {
  private final ArrayList<IntVar> _solutionVariablesList = new ArrayList<IntVar>();
  
  public ArrayList<IntVar> getSolutionVariablesList() {
    return this._solutionVariablesList;
  }
  
  private final HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = new HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>>();
  
  public HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> getThreadLocationVariablesList() {
    return this._threadLocationVariablesList;
  }
  
  /**
   * CONSTRUCTOR
   */
  public SolverVariablesContainer(final AssistModel model, final Store constraintStore) {
    EList<ch.hilbri.assist.model.Thread> _allThreads = model.getAllThreads();
    for (final ch.hilbri.assist.model.Thread t : _allThreads) {
      {
        final HashMap<Integer, IntVar> m = new HashMap<Integer, IntVar>();
        for (int i = 0; (i < model.getHardwareLevelCount()); i++) {
          String _name = t.getName();
          String _plus = ("LocVar-" + _name);
          EList<HardwareElement> _allHardwareElements = model.getAllHardwareElements(i);
          int _size = _allHardwareElements.size();
          IntVar _intVar = new IntVar(constraintStore, _plus, 0, _size);
          m.put(Integer.valueOf(i), _intVar);
        }
        HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
        _threadLocationVariablesList.put(t, m);
      }
    }
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
  
  public IntVar getThreadLocationVariable(final ch.hilbri.assist.model.Thread t, final int level) {
    HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
    HashMap<Integer, IntVar> _get = _threadLocationVariablesList.get(t);
    return _get.get(Integer.valueOf(level));
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_solutionVariablesList== null) ? 0 : _solutionVariablesList.hashCode());
    result = prime * result + ((_threadLocationVariablesList== null) ? 0 : _threadLocationVariablesList.hashCode());
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
    if (_threadLocationVariablesList == null) {
      if (other._threadLocationVariablesList != null)
        return false;
    } else if (!_threadLocationVariablesList.equals(other._threadLocationVariablesList))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

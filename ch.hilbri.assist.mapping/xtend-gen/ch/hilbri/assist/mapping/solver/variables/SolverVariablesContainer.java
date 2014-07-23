package ch.hilbri.assist.mapping.solver.variables;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.HardwareElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

@Data
@SuppressWarnings("all")
public class SolverVariablesContainer {
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
        for (int i = 1; (i <= model.getHardwareLevelCount()); i++) {
          String _name = t.getName();
          String _plus = ("LocVar-" + _name);
          String _plus_1 = (_plus + "-Level-");
          String _plus_2 = (_plus_1 + Integer.valueOf(i));
          EList<HardwareElement> _allHardwareElements = model.getAllHardwareElements(i);
          int _size = _allHardwareElements.size();
          IntVar _intVar = new IntVar(constraintStore, _plus_2, 1, _size);
          m.put(Integer.valueOf(i), _intVar);
        }
        HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
        _threadLocationVariablesList.put(t, m);
      }
    }
  }
  
  public IntVar[] getSolutionVariables() {
    final ArrayList<IntVar> list = new ArrayList<IntVar>();
    HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
    Set<ch.hilbri.assist.model.Thread> _keySet = _threadLocationVariablesList.keySet();
    for (final ch.hilbri.assist.model.Thread threadKey : _keySet) {
      HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList_1 = this.getThreadLocationVariablesList();
      HashMap<Integer, IntVar> _get = _threadLocationVariablesList_1.get(threadKey);
      Set<Integer> _keySet_1 = _get.keySet();
      for (final Integer levelKey : _keySet_1) {
        HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList_2 = this.getThreadLocationVariablesList();
        HashMap<Integer, IntVar> _get_1 = _threadLocationVariablesList_2.get(threadKey);
        IntVar _get_2 = _get_1.get(levelKey);
        list.add(_get_2);
      }
    }
    return ((IntVar[])Conversions.unwrapArray(list, IntVar.class));
  }
  
  public IntVar getThreadLocationVariable(final ch.hilbri.assist.model.Thread t, final int level) {
    HashMap<ch.hilbri.assist.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
    HashMap<Integer, IntVar> _get = _threadLocationVariablesList.get(t);
    return _get.get(Integer.valueOf(level));
  }
  
  public int getIndexOfThreadLocationInSolutionVariablesList(final ch.hilbri.assist.model.Thread t, final int level) {
    IntVar[] _solutionVariables = this.getSolutionVariables();
    IntVar _threadLocationVariable = this.getThreadLocationVariable(t, level);
    return ((List<IntVar>)Conversions.doWrapArray(_solutionVariables)).indexOf(_threadLocationVariable);
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._threadLocationVariablesList== null) ? 0 : this._threadLocationVariablesList.hashCode());
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
    if (this._threadLocationVariablesList == null) {
      if (other._threadLocationVariablesList != null)
        return false;
    } else if (!this._threadLocationVariablesList.equals(other._threadLocationVariablesList))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

package ch.hilbri.assist.mapping.solver.variables;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareElement;
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
  /**
   * A list of location variables for each thread (and each system layer)
   */
  private final HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = new HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>>();
  
  /**
   * A list of location variables for each thread (and each system layer)
   */
  public HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> getThreadLocationVariablesList() {
    return this._threadLocationVariablesList;
  }
  
  /**
   * A list of variables; a variable for each core which contains the absolute utilization
   */
  private final HashMap<Core, IntVar> _absoluteCoreUtilizationList = new HashMap<Core, IntVar>();
  
  /**
   * A list of variables; a variable for each core which contains the absolute utilization
   */
  public HashMap<Core, IntVar> getAbsoluteCoreUtilizationList() {
    return this._absoluteCoreUtilizationList;
  }
  
  /**
   * A list of variables; a variable for each board which contains the absolute ram utilization
   */
  private final HashMap<Board, IntVar> _absoluteRamUtilizationList = new HashMap<Board, IntVar>();
  
  /**
   * A list of variables; a variable for each board which contains the absolute ram utilization
   */
  public HashMap<Board, IntVar> getAbsoluteRamUtilizationList() {
    return this._absoluteRamUtilizationList;
  }
  
  /**
   * A list of variables; a variable for each board which contains the absolute rom utilization
   */
  private final HashMap<Board, IntVar> _absoluteRomUtilizationList = new HashMap<Board, IntVar>();
  
  /**
   * A list of variables; a variable for each board which contains the absolute rom utilization
   */
  public HashMap<Board, IntVar> getAbsoluteRomUtilizationList() {
    return this._absoluteRomUtilizationList;
  }
  
  /**
   * CONSTRUCTOR
   */
  public SolverVariablesContainer(final AssistModel model, final Store constraintStore) {
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
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
        HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
        _threadLocationVariablesList.put(t, m);
      }
    }
    EList<Core> _allCores = model.getAllCores();
    for (final Core c : _allCores) {
      HashMap<Core, IntVar> _absoluteCoreUtilizationList = this.getAbsoluteCoreUtilizationList();
      String _name = c.getName();
      String _plus = ("AbsCoreUtil-" + _name);
      int _capacity = c.getCapacity();
      IntVar _intVar = new IntVar(constraintStore, _plus, 0, _capacity);
      _absoluteCoreUtilizationList.put(c, _intVar);
    }
    EList<Board> _allBoards = model.getAllBoards();
    for (final Board b : _allBoards) {
      HashMap<Board, IntVar> _absoluteRamUtilizationList = this.getAbsoluteRamUtilizationList();
      String _name_1 = b.getName();
      String _plus_1 = ("AbsRamUtil-" + _name_1);
      int _ramCapacity = b.getRamCapacity();
      IntVar _intVar_1 = new IntVar(constraintStore, _plus_1, 0, _ramCapacity);
      _absoluteRamUtilizationList.put(b, _intVar_1);
    }
    EList<Board> _allBoards_1 = model.getAllBoards();
    for (final Board b_1 : _allBoards_1) {
      HashMap<Board, IntVar> _absoluteRomUtilizationList = this.getAbsoluteRomUtilizationList();
      String _name_2 = b_1.getName();
      String _plus_2 = ("AbsRomUtil-" + _name_2);
      int _romCapacity = b_1.getRomCapacity();
      IntVar _intVar_2 = new IntVar(constraintStore, _plus_2, 0, _romCapacity);
      _absoluteRomUtilizationList.put(b_1, _intVar_2);
    }
  }
  
  /**
   * Returns a list of Variables which the solver has to generate solutions for
   */
  public IntVar[] getSolutionVariables() {
    final ArrayList<IntVar> list = new ArrayList<IntVar>();
    HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
    Set<ch.hilbri.assist.datamodel.model.Thread> _keySet = _threadLocationVariablesList.keySet();
    for (final ch.hilbri.assist.datamodel.model.Thread threadKey : _keySet) {
      HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList_1 = this.getThreadLocationVariablesList();
      HashMap<Integer, IntVar> _get = _threadLocationVariablesList_1.get(threadKey);
      Set<Integer> _keySet_1 = _get.keySet();
      for (final Integer levelKey : _keySet_1) {
        HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList_2 = this.getThreadLocationVariablesList();
        HashMap<Integer, IntVar> _get_1 = _threadLocationVariablesList_2.get(threadKey);
        IntVar _get_2 = _get_1.get(levelKey);
        list.add(_get_2);
      }
    }
    HashMap<Core, IntVar> _absoluteCoreUtilizationList = this.getAbsoluteCoreUtilizationList();
    Set<Core> _keySet_2 = _absoluteCoreUtilizationList.keySet();
    for (final Core coreKey : _keySet_2) {
      HashMap<Core, IntVar> _absoluteCoreUtilizationList_1 = this.getAbsoluteCoreUtilizationList();
      IntVar _get_3 = _absoluteCoreUtilizationList_1.get(coreKey);
      list.add(_get_3);
    }
    HashMap<Board, IntVar> _absoluteRamUtilizationList = this.getAbsoluteRamUtilizationList();
    Set<Board> _keySet_3 = _absoluteRamUtilizationList.keySet();
    for (final Board boardKey : _keySet_3) {
      HashMap<Board, IntVar> _absoluteRamUtilizationList_1 = this.getAbsoluteRamUtilizationList();
      IntVar _get_4 = _absoluteRamUtilizationList_1.get(boardKey);
      list.add(_get_4);
    }
    HashMap<Board, IntVar> _absoluteRomUtilizationList = this.getAbsoluteRomUtilizationList();
    Set<Board> _keySet_4 = _absoluteRomUtilizationList.keySet();
    for (final Board boardKey_1 : _keySet_4) {
      HashMap<Board, IntVar> _absoluteRomUtilizationList_1 = this.getAbsoluteRomUtilizationList();
      IntVar _get_5 = _absoluteRomUtilizationList_1.get(boardKey_1);
      list.add(_get_5);
    }
    return ((IntVar[])Conversions.unwrapArray(list, IntVar.class));
  }
  
  /**
   * Returns the location variable for a given thread and a given hardware level
   */
  public IntVar getThreadLocationVariable(final ch.hilbri.assist.datamodel.model.Thread t, final int level) {
    HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> _threadLocationVariablesList = this.getThreadLocationVariablesList();
    HashMap<Integer, IntVar> _get = _threadLocationVariablesList.get(t);
    return _get.get(Integer.valueOf(level));
  }
  
  /**
   * Returns the index of the location variable for a given thread and hardware level
   */
  public int getIndexOfThreadLocationInSolutionVariablesList(final ch.hilbri.assist.datamodel.model.Thread t, final int level) {
    IntVar[] _solutionVariables = this.getSolutionVariables();
    IntVar _threadLocationVariable = this.getThreadLocationVariable(t, level);
    return ((List<IntVar>)Conversions.doWrapArray(_solutionVariables)).indexOf(_threadLocationVariable);
  }
  
  /**
   * Returns the variable which contains the absolute utilization for the given core
   */
  public IntVar getAbsoluteCoreUtilizationVariable(final Core c) {
    HashMap<Core, IntVar> _absoluteCoreUtilizationList = this.getAbsoluteCoreUtilizationList();
    return _absoluteCoreUtilizationList.get(c);
  }
  
  /**
   * Returns the index of the absolute utilization variable of a given core in the solutions variables list
   */
  public int getIndexOfAbsoluteUtilizationInSolutionVariablesList(final Core c) {
    IntVar[] _solutionVariables = this.getSolutionVariables();
    HashMap<Core, IntVar> _absoluteCoreUtilizationList = this.getAbsoluteCoreUtilizationList();
    IntVar _get = _absoluteCoreUtilizationList.get(c);
    return ((List<IntVar>)Conversions.doWrapArray(_solutionVariables)).indexOf(_get);
  }
  
  /**
   * Returns the variable which contains the absolute ram utilization for the given board
   */
  public IntVar getAbsoluteRamUtilizationVariable(final Board b) {
    HashMap<Board, IntVar> _absoluteRamUtilizationList = this.getAbsoluteRamUtilizationList();
    return _absoluteRamUtilizationList.get(b);
  }
  
  /**
   * Returns the index of the absolute ram utilization variable of a given board in the solutions variables list
   */
  public int getIndexOfAbsoluteRamUtilizationInSolutionVariablesList(final Board b) {
    IntVar[] _solutionVariables = this.getSolutionVariables();
    HashMap<Board, IntVar> _absoluteRamUtilizationList = this.getAbsoluteRamUtilizationList();
    IntVar _get = _absoluteRamUtilizationList.get(b);
    return ((List<IntVar>)Conversions.doWrapArray(_solutionVariables)).indexOf(_get);
  }
  
  /**
   * Returns the variable which contains the absolute ram utilization for the given board
   */
  public IntVar getAbsoluteRomUtilizationVariable(final Board b) {
    HashMap<Board, IntVar> _absoluteRomUtilizationList = this.getAbsoluteRomUtilizationList();
    return _absoluteRomUtilizationList.get(b);
  }
  
  /**
   * Returns the index of the absolute ram utilization variable of a given board in the solutions variables list
   */
  public int getIndexOfAbsoluteRomUtilizationInSolutionVariablesList(final Board b) {
    IntVar[] _solutionVariables = this.getSolutionVariables();
    HashMap<Board, IntVar> _absoluteRomUtilizationList = this.getAbsoluteRomUtilizationList();
    IntVar _get = _absoluteRomUtilizationList.get(b);
    return ((List<IntVar>)Conversions.doWrapArray(_solutionVariables)).indexOf(_get);
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_threadLocationVariablesList== null) ? 0 : _threadLocationVariablesList.hashCode());
    result = prime * result + ((_absoluteCoreUtilizationList== null) ? 0 : _absoluteCoreUtilizationList.hashCode());
    result = prime * result + ((_absoluteRamUtilizationList== null) ? 0 : _absoluteRamUtilizationList.hashCode());
    result = prime * result + ((_absoluteRomUtilizationList== null) ? 0 : _absoluteRomUtilizationList.hashCode());
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
    if (_threadLocationVariablesList == null) {
      if (other._threadLocationVariablesList != null)
        return false;
    } else if (!_threadLocationVariablesList.equals(other._threadLocationVariablesList))
      return false;
    if (_absoluteCoreUtilizationList == null) {
      if (other._absoluteCoreUtilizationList != null)
        return false;
    } else if (!_absoluteCoreUtilizationList.equals(other._absoluteCoreUtilizationList))
      return false;
    if (_absoluteRamUtilizationList == null) {
      if (other._absoluteRamUtilizationList != null)
        return false;
    } else if (!_absoluteRamUtilizationList.equals(other._absoluteRamUtilizationList))
      return false;
    if (_absoluteRomUtilizationList == null) {
      if (other._absoluteRomUtilizationList != null)
        return false;
    } else if (!_absoluteRomUtilizationList.equals(other._absoluteRomUtilizationList))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}

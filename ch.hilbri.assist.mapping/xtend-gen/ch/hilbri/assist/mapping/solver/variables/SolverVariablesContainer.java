package ch.hilbri.assist.mapping.solver.variables;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.CommunicationRelation;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.Network;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class SolverVariablesContainer {
  /**
   * A list of location variables for each thread (and each system layer)
   */
  private final HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> threadLocationVariablesList = new HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>>();
  
  /**
   * A list of location indicator variables for each thread (on the board layer)
   */
  private final BoolVar[][] threadBoardIndicatorVariablesList;
  
  /**
   * A list of variables; a variable for each core which contains the absolute utilization
   */
  private final HashMap<Core, IntVar> absoluteCoreUtilizationList = new HashMap<Core, IntVar>();
  
  /**
   * A list of variables; a variable for each board which contains the absolute ram utilization
   */
  private final HashMap<Board, IntVar> absoluteRamUtilizationList = new HashMap<Board, IntVar>();
  
  /**
   * A list of variables; a variable for each board which contains the absolute rom utilization
   */
  private final HashMap<Board, IntVar> absoluteRomUtilizationList = new HashMap<Board, IntVar>();
  
  /**
   * A list of variables; a variable for each communication group and their placement to a network
   */
  private final HashMap<CommunicationRelation, IntVar> communicationGroupLocationVariablesList = new HashMap<CommunicationRelation, IntVar>();
  
  /**
   * A list of variables; a variable for each networks which contains the absolute bandwidth utilization
   */
  private final HashMap<Network, IntVar> absoluteBandwidthUtilizationList = new HashMap<Network, IntVar>();
  
  private final HashMap<IntVar, ch.hilbri.assist.datamodel.model.Thread> locationVarMap = new HashMap<IntVar, ch.hilbri.assist.datamodel.model.Thread>();
  
  /**
   * CONSTRUCTOR
   */
  public SolverVariablesContainer(final AssistModel model, final Solver solver) {
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
      {
        final HashMap<Integer, IntVar> m = new HashMap<Integer, IntVar>();
        for (int i = HardwareArchitectureLevelType.CORE_VALUE; (i <= model.getHardwareLevelCount()); i++) {
          {
            String _name = t.getName();
            String _plus = ("Loc-" + _name);
            String _plus_1 = (_plus + "-L");
            String _plus_2 = (_plus_1 + Integer.valueOf(i));
            EList<HardwareElement> _allHardwareElements = model.getAllHardwareElements(i);
            int _size = _allHardwareElements.size();
            int _minus = (_size - 1);
            final IntVar newVar = VF.enumerated(_plus_2, 0, _minus, solver);
            m.put(Integer.valueOf(i), newVar);
            this.locationVarMap.put(newVar, t);
          }
        }
      }
    }
    EList<Board> _allBoards = model.getAllBoards();
    int _size = _allBoards.size();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = model.getAllThreads();
    int _size_1 = _allThreads_1.size();
    BoolVar[][] _boolMatrix = VF.boolMatrix("d", _size, _size_1, solver);
    this.threadBoardIndicatorVariablesList = _boolMatrix;
    EList<Core> _allCores = model.getAllCores();
    for (final Core c : _allCores) {
      String _name = c.getName();
      String _plus = ("AbsCoreUtil-" + _name);
      int _capacity = c.getCapacity();
      IntVar _bounded = VF.bounded(_plus, 0, _capacity, solver);
      this.absoluteCoreUtilizationList.put(c, _bounded);
    }
    EList<Board> _allBoards_1 = model.getAllBoards();
    for (final Board b : _allBoards_1) {
      String _name_1 = b.getName();
      String _plus_1 = ("AbsRamUtil-" + _name_1);
      int _ramCapacity = b.getRamCapacity();
      IntVar _bounded_1 = VF.bounded(_plus_1, 0, _ramCapacity, solver);
      this.absoluteRamUtilizationList.put(b, _bounded_1);
    }
    EList<Board> _allBoards_2 = model.getAllBoards();
    for (final Board b_1 : _allBoards_2) {
      String _name_2 = b_1.getName();
      String _plus_2 = ("AbsRomUtil-" + _name_2);
      int _romCapacity = b_1.getRomCapacity();
      IntVar _bounded_2 = VF.bounded(_plus_2, 0, _romCapacity, solver);
      this.absoluteRomUtilizationList.put(b_1, _bounded_2);
    }
    EList<Network> _networks = model.getNetworks();
    int _size_2 = _networks.size();
    boolean _greaterThan = (_size_2 > 0);
    if (_greaterThan) {
      EList<CommunicationRelation> _communicationRelations = model.getCommunicationRelations();
      for (final CommunicationRelation r : _communicationRelations) {
        EList<CommunicationRelation> _communicationRelations_1 = model.getCommunicationRelations();
        int _indexOf = _communicationRelations_1.indexOf(r);
        String _plus_3 = ("NetLoc-" + Integer.valueOf(_indexOf));
        EList<Network> _networks_1 = model.getNetworks();
        int _size_3 = _networks_1.size();
        int _minus = (_size_3 - 1);
        IntVar _enumerated = VF.enumerated(_plus_3, 0, _minus, solver);
        this.communicationGroupLocationVariablesList.put(r, _enumerated);
      }
    }
    EList<Network> _networks_2 = model.getNetworks();
    for (final Network n : _networks_2) {
      String _name_3 = n.getName();
      String _plus_4 = ("AbsBandUtil-" + _name_3);
      int _bandwidthCapacity = n.getBandwidthCapacity();
      IntVar _bounded_3 = VF.bounded(_plus_4, 0, _bandwidthCapacity, solver);
      this.absoluteBandwidthUtilizationList.put(n, _bounded_3);
    }
  }
  
  public IntVar[] getLocationVariables() {
    final ArrayList<IntVar> list = new ArrayList<IntVar>();
    Set<ch.hilbri.assist.datamodel.model.Thread> _keySet = this.threadLocationVariablesList.keySet();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, String> _function = (ch.hilbri.assist.datamodel.model.Thread it) -> {
      return it.getName();
    };
    List<ch.hilbri.assist.datamodel.model.Thread> _sortBy = IterableExtensions.<ch.hilbri.assist.datamodel.model.Thread, String>sortBy(_keySet, _function);
    for (final ch.hilbri.assist.datamodel.model.Thread threadKey : _sortBy) {
      HashMap<Integer, IntVar> _get = this.threadLocationVariablesList.get(threadKey);
      IntVar _get_1 = _get.get(Integer.valueOf(HardwareArchitectureLevelType.CORE_VALUE));
      list.add(_get_1);
    }
    return ((IntVar[])Conversions.unwrapArray(list, IntVar.class));
  }
  
  /**
   * Returns the variable list which contains the indicators for the given board
   */
  public BoolVar[][] getThreadBoardIndicatorVariables() {
    return this.threadBoardIndicatorVariablesList;
  }
  
  /**
   * Returns the location variable for a given relation
   */
  public IntVar getCommunicationRelationLocationVariable(final CommunicationRelation relation) {
    return this.communicationGroupLocationVariablesList.get(relation);
  }
  
  /**
   * Returns the location variable for a given thread and a given hardware level
   */
  public IntVar getThreadLocationVariable(final ch.hilbri.assist.datamodel.model.Thread t, final int level) {
    HashMap<Integer, IntVar> _get = this.threadLocationVariablesList.get(t);
    return _get.get(Integer.valueOf(level));
  }
  
  /**
   * Returns the variable which contains the absolute utilization for the given core
   */
  public IntVar getAbsoluteCoreUtilizationVariable(final Core c) {
    return this.absoluteCoreUtilizationList.get(c);
  }
  
  /**
   * Returns the variable which contains the absolute ram utilization for the given board
   */
  public IntVar getAbsoluteRamUtilizationVariable(final Board b) {
    return this.absoluteRamUtilizationList.get(b);
  }
  
  /**
   * Returns the variable which contains the absolute ram utilization for the given board
   */
  public IntVar getAbsoluteRomUtilizationVariable(final Board b) {
    return this.absoluteRomUtilizationList.get(b);
  }
  
  /**
   * Returns the variable which contains the absolute bandwidth utilization for the given network
   */
  public IntVar getAbsoluteBandwidthUtilizationVariable(final Network n) {
    return this.absoluteBandwidthUtilizationList.get(n);
  }
  
  public Application getApplicationForLocationVariable(final IntVar variable) {
    final ch.hilbri.assist.datamodel.model.Thread t = this.locationVarMap.get(variable);
    boolean _notEquals = (!Objects.equal(t, null));
    if (_notEquals) {
      return t.getApplication();
    } else {
      return null;
    }
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.threadLocationVariablesList== null) ? 0 : this.threadLocationVariablesList.hashCode());
    result = prime * result + ((this.threadBoardIndicatorVariablesList== null) ? 0 : Arrays.deepHashCode(this.threadBoardIndicatorVariablesList));
    result = prime * result + ((this.absoluteCoreUtilizationList== null) ? 0 : this.absoluteCoreUtilizationList.hashCode());
    result = prime * result + ((this.absoluteRamUtilizationList== null) ? 0 : this.absoluteRamUtilizationList.hashCode());
    result = prime * result + ((this.absoluteRomUtilizationList== null) ? 0 : this.absoluteRomUtilizationList.hashCode());
    result = prime * result + ((this.communicationGroupLocationVariablesList== null) ? 0 : this.communicationGroupLocationVariablesList.hashCode());
    result = prime * result + ((this.absoluteBandwidthUtilizationList== null) ? 0 : this.absoluteBandwidthUtilizationList.hashCode());
    result = prime * result + ((this.locationVarMap== null) ? 0 : this.locationVarMap.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SolverVariablesContainer other = (SolverVariablesContainer) obj;
    if (this.threadLocationVariablesList == null) {
      if (other.threadLocationVariablesList != null)
        return false;
    } else if (!this.threadLocationVariablesList.equals(other.threadLocationVariablesList))
      return false;
    if (this.threadBoardIndicatorVariablesList == null) {
      if (other.threadBoardIndicatorVariablesList != null)
        return false;
    } else if (!Arrays.deepEquals(this.threadBoardIndicatorVariablesList, other.threadBoardIndicatorVariablesList))
      return false;
    if (this.absoluteCoreUtilizationList == null) {
      if (other.absoluteCoreUtilizationList != null)
        return false;
    } else if (!this.absoluteCoreUtilizationList.equals(other.absoluteCoreUtilizationList))
      return false;
    if (this.absoluteRamUtilizationList == null) {
      if (other.absoluteRamUtilizationList != null)
        return false;
    } else if (!this.absoluteRamUtilizationList.equals(other.absoluteRamUtilizationList))
      return false;
    if (this.absoluteRomUtilizationList == null) {
      if (other.absoluteRomUtilizationList != null)
        return false;
    } else if (!this.absoluteRomUtilizationList.equals(other.absoluteRomUtilizationList))
      return false;
    if (this.communicationGroupLocationVariablesList == null) {
      if (other.communicationGroupLocationVariablesList != null)
        return false;
    } else if (!this.communicationGroupLocationVariablesList.equals(other.communicationGroupLocationVariablesList))
      return false;
    if (this.absoluteBandwidthUtilizationList == null) {
      if (other.absoluteBandwidthUtilizationList != null)
        return false;
    } else if (!this.absoluteBandwidthUtilizationList.equals(other.absoluteBandwidthUtilizationList))
      return false;
    if (this.locationVarMap == null) {
      if (other.locationVarMap != null)
        return false;
    } else if (!this.locationVarMap.equals(other.locationVarMap))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("threadLocationVariablesList", this.threadLocationVariablesList);
    b.add("threadBoardIndicatorVariablesList", this.threadBoardIndicatorVariablesList);
    b.add("absoluteCoreUtilizationList", this.absoluteCoreUtilizationList);
    b.add("absoluteRamUtilizationList", this.absoluteRamUtilizationList);
    b.add("absoluteRomUtilizationList", this.absoluteRomUtilizationList);
    b.add("communicationGroupLocationVariablesList", this.communicationGroupLocationVariablesList);
    b.add("absoluteBandwidthUtilizationList", this.absoluteBandwidthUtilizationList);
    b.add("locationVarMap", this.locationVarMap);
    return b.toString();
  }
  
  @Pure
  public HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<Integer, IntVar>> getThreadLocationVariablesList() {
    return this.threadLocationVariablesList;
  }
  
  @Pure
  public BoolVar[][] getThreadBoardIndicatorVariablesList() {
    return this.threadBoardIndicatorVariablesList;
  }
  
  @Pure
  public HashMap<Core, IntVar> getAbsoluteCoreUtilizationList() {
    return this.absoluteCoreUtilizationList;
  }
  
  @Pure
  public HashMap<Board, IntVar> getAbsoluteRamUtilizationList() {
    return this.absoluteRamUtilizationList;
  }
  
  @Pure
  public HashMap<Board, IntVar> getAbsoluteRomUtilizationList() {
    return this.absoluteRomUtilizationList;
  }
  
  @Pure
  public HashMap<CommunicationRelation, IntVar> getCommunicationGroupLocationVariablesList() {
    return this.communicationGroupLocationVariablesList;
  }
  
  @Pure
  public HashMap<Network, IntVar> getAbsoluteBandwidthUtilizationList() {
    return this.absoluteBandwidthUtilizationList;
  }
  
  @Pure
  public HashMap<IntVar, ch.hilbri.assist.datamodel.model.Thread> getLocationVarMap() {
    return this.locationVarMap;
  }
}

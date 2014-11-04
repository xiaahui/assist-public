package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapter;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.jacop.constraints.Element;
import org.jacop.constraints.XgteqC;
import org.jacop.core.BoundDomain;
import org.jacop.core.IntVar;
import org.jacop.core.IntervalDomain;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class IOAdapterConstraint extends AbstractMappingConstraint {
  public IOAdapterConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("I/O adapter constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    this.generateSingleThreadExclusiveRequests();
    return true;
  }
  
  /**
   * Implementation of Step 1
   * ------------------------
   * - only exclusive adapter requests and adapter types are considered here
   * - io protection level are NOT considered here (yet)
   */
  public void generateSingleThreadExclusiveRequests() {
    ArrayList<IOAdapterType> allRequestedIOAdapterTypes = new ArrayList<IOAdapterType>();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
      Application _application = t.getApplication();
      EList<IOAdapterRequirement> _ioAdapterRequirements = _application.getIoAdapterRequirements();
      for (final IOAdapterRequirement r : _ioAdapterRequirements) {
        IOAdapterType _adapterType = r.getAdapterType();
        boolean _contains = allRequestedIOAdapterTypes.contains(_adapterType);
        boolean _not = (!_contains);
        if (_not) {
          IOAdapterType _adapterType_1 = r.getAdapterType();
          allRequestedIOAdapterTypes.add(_adapterType_1);
        }
      }
    }
    HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<IOAdapterType, Integer>> allIOAdapterExclusiveRequests = new HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<IOAdapterType, Integer>>();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t_1 : _allThreads_1) {
      Application _application_1 = t_1.getApplication();
      EList<IOAdapterRequirement> _ioAdapterRequirements_1 = _application_1.getIoAdapterRequirements();
      for (final IOAdapterRequirement r_1 : _ioAdapterRequirements_1) {
        {
          Set<ch.hilbri.assist.datamodel.model.Thread> _keySet = allIOAdapterExclusiveRequests.keySet();
          boolean _contains_1 = _keySet.contains(t_1);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            HashMap<IOAdapterType, Integer> _hashMap = new HashMap<IOAdapterType, Integer>();
            allIOAdapterExclusiveRequests.put(t_1, _hashMap);
          }
          HashMap<IOAdapterType, Integer> _get = allIOAdapterExclusiveRequests.get(t_1);
          IOAdapterType _adapterType_2 = r_1.getAdapterType();
          int _requiredAdapterCount = r_1.getRequiredAdapterCount();
          _get.put(_adapterType_2, Integer.valueOf(_requiredAdapterCount));
        }
      }
    }
    HashMap<IOAdapterType, ArrayList<Integer>> allAvailableIOAdapters = new HashMap<IOAdapterType, ArrayList<Integer>>();
    for (final IOAdapterType type : allRequestedIOAdapterTypes) {
      {
        ArrayList<Integer> _arrayList = new ArrayList<Integer>();
        allAvailableIOAdapters.put(type, _arrayList);
        EList<Board> _allBoards = this.model.getAllBoards();
        for (final Board board : _allBoards) {
          {
            boolean foundAdapter = false;
            EList<IOAdapter> _ioAdapters = board.getIoAdapters();
            for (final IOAdapter a : _ioAdapters) {
              IOAdapterType _adapterType_2 = a.getAdapterType();
              boolean _equals = Objects.equal(_adapterType_2, type);
              if (_equals) {
                foundAdapter = true;
                ArrayList<Integer> _get = allAvailableIOAdapters.get(type);
                int _totalCount = a.getTotalCount();
                _get.add(Integer.valueOf(_totalCount));
              }
            }
            if ((!foundAdapter)) {
              ArrayList<Integer> _get_1 = allAvailableIOAdapters.get(type);
              _get_1.add(Integer.valueOf(0));
            }
          }
        }
      }
    }
    HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<IOAdapterType, IntVar>> ioAdapterVariables = new HashMap<ch.hilbri.assist.datamodel.model.Thread, HashMap<IOAdapterType, IntVar>>();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t_2 : _allThreads_2) {
      {
        HashMap<IOAdapterType, IntVar> _hashMap = new HashMap<IOAdapterType, IntVar>();
        ioAdapterVariables.put(t_2, _hashMap);
        for (final IOAdapterType type_1 : allRequestedIOAdapterTypes) {
          {
            IntervalDomain domain = new IntervalDomain();
            ArrayList<Integer> _get = allAvailableIOAdapters.get(type_1);
            for (final Integer adapterCountPerBoard : _get) {
              BoundDomain _boundDomain = new BoundDomain((adapterCountPerBoard).intValue(), (adapterCountPerBoard).intValue());
              domain.addDom(_boundDomain);
            }
            HashMap<IOAdapterType, IntVar> _get_1 = ioAdapterVariables.get(t_2);
            String _name = t_2.getName();
            String _plus = ("IOVar-" + _name);
            String _plus_1 = (_plus + "-");
            String _plus_2 = (_plus_1 + type_1);
            IntVar _intVar = new IntVar(this.constraintStore, _plus_2, domain);
            _get_1.put(type_1, _intVar);
          }
        }
      }
    }
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t_3 : _allThreads_3) {
      {
        final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t_3, HardwareArchitectureLevelType.BOARD_VALUE);
        for (final IOAdapterType type_1 : allRequestedIOAdapterTypes) {
          {
            ArrayList<Integer> _get = allAvailableIOAdapters.get(type_1);
            HashMap<IOAdapterType, IntVar> _get_1 = ioAdapterVariables.get(t_3);
            IntVar _get_2 = _get_1.get(type_1);
            Element _element = new Element(threadLocationsBoardLevel, ((int[])Conversions.unwrapArray(_get, int.class)), _get_2);
            this.constraintStore.impose(_element);
            HashMap<IOAdapterType, IntVar> _get_3 = ioAdapterVariables.get(t_3);
            IntVar _get_4 = _get_3.get(type_1);
            HashMap<IOAdapterType, Integer> _get_5 = allIOAdapterExclusiveRequests.get(t_3);
            Integer _get_6 = _get_5.get(type_1);
            XgteqC _xgteqC = new XgteqC(_get_4, (_get_6).intValue());
            this.constraintStore.impose(_xgteqC);
          }
        }
      }
    }
  }
}

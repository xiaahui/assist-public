package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jacop.constraints.Element;
import org.jacop.constraints.Reified;
import org.jacop.constraints.SumWeight;
import org.jacop.constraints.XeqC;
import org.jacop.constraints.XgteqC;
import org.jacop.core.BooleanVar;
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
    this.generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    this.generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    return true;
  }
  
  public void generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    EList<Board> _allBoards = this.model.getAllBoards();
    for (final Board b : _allBoards) {
      {
        final ArrayList<BooleanVar> factorList = new ArrayList<BooleanVar>();
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
          {
            final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE);
            String _name = t.getName();
            String _plus = ("Delta-for-" + _name);
            final BooleanVar delta = new BooleanVar(this.constraintStore, _plus);
            EList<Board> _allBoards_1 = this.model.getAllBoards();
            int _indexOf = _allBoards_1.indexOf(b);
            int _plus_1 = (_indexOf + 1);
            XeqC _xeqC = new XeqC(threadLocationsBoardLevel, _plus_1);
            Reified _reified = new Reified(_xeqC, delta);
            this.constraintStore.impose(_reified);
            factorList.add(delta);
          }
        }
        IOAdapterType[] _values = IOAdapterType.values();
        for (final IOAdapterType type : _values) {
          IOAdapterProtectionLevelType[] _values_1 = IOAdapterProtectionLevelType.values();
          for (final IOAdapterProtectionLevelType level : _values_1) {
            {
              String _name = b.getName();
              String _plus = ("SuiteableIOAdapterCount-" + _name);
              String _plus_1 = (_plus + "-");
              String _plus_2 = (_plus_1 + type);
              String _plus_3 = (_plus_2 + "-");
              String _plus_4 = (_plus_3 + level);
              int _suitableAdapterCount = b.getSuitableAdapterCount(type, level);
              final IntVar suiteableIOAdapterCountVar = new IntVar(this.constraintStore, _plus_4, 
                0, _suitableAdapterCount);
              EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
              final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function = new Function1<ch.hilbri.assist.datamodel.model.Thread, Integer>() {
                public Integer apply(final ch.hilbri.assist.datamodel.model.Thread it) {
                  return Integer.valueOf(it.getExclusiveAdapterRequestCount(type, level));
                }
              };
              final List<Integer> requestCountForEachThreadWithProtectionLevelAndType = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads_1, _function);
              ArrayList<Integer> _arrayList = new ArrayList<Integer>(requestCountForEachThreadWithProtectionLevelAndType);
              SumWeight _sumWeight = new SumWeight(factorList, _arrayList, suiteableIOAdapterCountVar);
              this.constraintStore.impose(_sumWeight);
            }
          }
        }
      }
    }
  }
  
  public void generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
      Application _application = t.getApplication();
      EList<IOAdapterRequirement> _ioAdapterRequirements = _application.getIoAdapterRequirements();
      final Function1<IOAdapterRequirement, Boolean> _function = new Function1<IOAdapterRequirement, Boolean>() {
        public Boolean apply(final IOAdapterRequirement it) {
          return Boolean.valueOf(it.isIsExclusiveOnly());
        }
      };
      Iterable<IOAdapterRequirement> _filter = IterableExtensions.<IOAdapterRequirement>filter(_ioAdapterRequirements, _function);
      for (final IOAdapterRequirement exReq : _filter) {
        {
          EList<Board> _allBoards = this.model.getAllBoards();
          final Function1<Board, Integer> _function_1 = new Function1<Board, Integer>() {
            public Integer apply(final Board it) {
              IOAdapterType _adapterType = exReq.getAdapterType();
              Application _application = t.getApplication();
              IOAdapterProtectionLevelType _ioAdapterProtectionLevel = _application.getIoAdapterProtectionLevel();
              return Integer.valueOf(it.getSuitableAdapterCount(_adapterType, _ioAdapterProtectionLevel));
            }
          };
          final List<Integer> suiteableAdapterCountPerBoardList = ListExtensions.<Board, Integer>map(_allBoards, _function_1);
          IntervalDomain domain = new IntervalDomain();
          for (final Integer adapterCountPerBoard : suiteableAdapterCountPerBoardList) {
            BoundDomain _boundDomain = new BoundDomain((adapterCountPerBoard).intValue(), (adapterCountPerBoard).intValue());
            domain.addDom(_boundDomain);
          }
          String _name = t.getName();
          String _plus = ("IOVar-" + _name);
          String _plus_1 = (_plus + "-");
          IOAdapterType _adapterType = exReq.getAdapterType();
          String _plus_2 = (_plus_1 + _adapterType);
          String _plus_3 = (_plus_2 + "-");
          Application _application_1 = t.getApplication();
          IOAdapterProtectionLevelType _ioAdapterProtectionLevel = _application_1.getIoAdapterProtectionLevel();
          String _plus_4 = (_plus_3 + _ioAdapterProtectionLevel);
          final IntVar suiteableAdapterCountPerBoardVariable = new IntVar(this.constraintStore, _plus_4, domain);
          final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE);
          Element _element = new Element(threadLocationsBoardLevel, ((int[])Conversions.unwrapArray(suiteableAdapterCountPerBoardList, int.class)), suiteableAdapterCountPerBoardVariable);
          this.constraintStore.impose(_element);
          int _requiredAdapterCount = exReq.getRequiredAdapterCount();
          XgteqC _xgteqC = new XgteqC(suiteableAdapterCountPerBoardVariable, _requiredAdapterCount);
          this.constraintStore.impose(_xgteqC);
        }
      }
    }
  }
}

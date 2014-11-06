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
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
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
    this.generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    return true;
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

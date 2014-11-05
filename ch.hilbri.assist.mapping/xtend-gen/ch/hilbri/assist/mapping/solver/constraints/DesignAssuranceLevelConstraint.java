package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jacop.constraints.Element;
import org.jacop.constraints.XgteqC;
import org.jacop.core.BoundDomain;
import org.jacop.core.IntVar;
import org.jacop.core.IntervalDomain;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class DesignAssuranceLevelConstraint extends AbstractMappingConstraint {
  public DesignAssuranceLevelConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("Design assurance level constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    HashMap<ch.hilbri.assist.datamodel.model.Thread, Integer> allDesignAssuranceLevelRequests = new HashMap<ch.hilbri.assist.datamodel.model.Thread, Integer>();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
      Application _application = t.getApplication();
      DesignAssuranceLevelType _criticalityLevel = _application.getCriticalityLevel();
      int _ordinal = _criticalityLevel.ordinal();
      allDesignAssuranceLevelRequests.put(t, Integer.valueOf(_ordinal));
    }
    EList<Board> _allBoards = this.model.getAllBoards();
    final Function1<Board, Integer> _function = new Function1<Board, Integer>() {
      public Integer apply(final Board it) {
        DesignAssuranceLevelType _assuranceLevel = it.getAssuranceLevel();
        return Integer.valueOf(_assuranceLevel.ordinal());
      }
    };
    final List<Integer> allAvailableDesignAssuranceLevels = ListExtensions.<Board, Integer>map(_allBoards, _function);
    HashMap<ch.hilbri.assist.datamodel.model.Thread, IntVar> designAssuranceLevelVariables = new HashMap<ch.hilbri.assist.datamodel.model.Thread, IntVar>();
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t_1 : _allThreads_1) {
      {
        IntervalDomain domain = new IntervalDomain();
        for (final Integer designAssuranceLevelPerBoard : allAvailableDesignAssuranceLevels) {
          BoundDomain _boundDomain = new BoundDomain((designAssuranceLevelPerBoard).intValue(), (designAssuranceLevelPerBoard).intValue());
          domain.addDom(_boundDomain);
        }
        String _name = t_1.getName();
        String _plus = ("DALVar-" + _name);
        IntVar _intVar = new IntVar(this.constraintStore, _plus, domain);
        designAssuranceLevelVariables.put(t_1, _intVar);
      }
    }
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t_2 : _allThreads_2) {
      {
        final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t_2, HardwareArchitectureLevelType.BOARD_VALUE);
        IntVar _get = designAssuranceLevelVariables.get(t_2);
        Element _element = new Element(threadLocationsBoardLevel, ((int[])Conversions.unwrapArray(allAvailableDesignAssuranceLevels, int.class)), _get);
        this.constraintStore.impose(_element);
        IntVar _get_1 = designAssuranceLevelVariables.get(t_2);
        Integer _get_2 = allDesignAssuranceLevelRequests.get(t_2);
        XgteqC _xgteqC = new XgteqC(_get_1, (_get_2).intValue());
        this.constraintStore.impose(_xgteqC);
      }
    }
    return true;
  }
}

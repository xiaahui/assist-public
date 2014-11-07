package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jacop.constraints.Element;
import org.jacop.constraints.Reified;
import org.jacop.constraints.SumWeight;
import org.jacop.constraints.XeqC;
import org.jacop.constraints.XgteqC;
import org.jacop.constraints.XgteqY;
import org.jacop.core.BooleanVar;
import org.jacop.core.BoundDomain;
import org.jacop.core.IntVar;
import org.jacop.core.IntervalDomain;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class RAMUtilizationConstraint extends AbstractMappingConstraint {
  public RAMUtilizationConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("RAM capacity constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    EList<Board> _allBoards = this.model.getAllBoards();
    final Function1<Board, Integer> _function = new Function1<Board, Integer>() {
      public Integer apply(final Board it) {
        return Integer.valueOf(it.getRamCapacity());
      }
    };
    final int[] allRamCapacities = ((int[])Conversions.unwrapArray(ListExtensions.<Board, Integer>map(_allBoards, _function), int.class));
    final IntervalDomain ramCapacitiesDomain = new IntervalDomain();
    for (final int ramCapacity : allRamCapacities) {
      BoundDomain _boundDomain = new BoundDomain(ramCapacity, ramCapacity);
      ramCapacitiesDomain.addDom(_boundDomain);
    }
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_1 = new Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar>() {
      public IntVar apply(final ch.hilbri.assist.datamodel.model.Thread it) {
        return new IntVar(RAMUtilizationConstraint.this.constraintStore, "RAM Capacities", ramCapacitiesDomain);
      }
    };
    final IntVar[] ramCapacities = ((IntVar[])Conversions.unwrapArray(ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads, _function_1), IntVar.class));
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function_2 = new Function1<ch.hilbri.assist.datamodel.model.Thread, Integer>() {
      public Integer apply(final ch.hilbri.assist.datamodel.model.Thread it) {
        Application _application = it.getApplication();
        return Integer.valueOf(_application.getRamUtilization());
      }
    };
    List<Integer> _map = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads_1, _function_2);
    final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    final Integer totalRamUtilizationFromAllApplications = IterableExtensions.<Integer>reduce(_map, _function_3);
    final IntVar totalRamUtilizationFromAllApplicationsVar = new IntVar(this.constraintStore, "TotalRamUtilOfAllApps", (totalRamUtilizationFromAllApplications).intValue(), (totalRamUtilizationFromAllApplications).intValue());
    EList<Board> _allBoards_1 = this.model.getAllBoards();
    final Function1<Board, Integer> _function_4 = new Function1<Board, Integer>() {
      public Integer apply(final Board it) {
        return Integer.valueOf(it.getRamCapacity());
      }
    };
    List<Integer> _map_1 = ListExtensions.<Board, Integer>map(_allBoards_1, _function_4);
    final Function2<Integer, Integer, Integer> _function_5 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    final Integer totalRamCapacity = IterableExtensions.<Integer>reduce(_map_1, _function_5);
    final IntVar totalRamCapacityVar = new IntVar(this.constraintStore, "TotalRamCapacitiy", (totalRamCapacity).intValue(), (totalRamCapacity).intValue());
    XgteqY _xgteqY = new XgteqY(totalRamCapacityVar, totalRamUtilizationFromAllApplicationsVar);
    this.constraintStore.impose(_xgteqY);
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads_2) {
      {
        final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE);
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
        int _indexOf = _allThreads_3.indexOf(thread);
        final IntVar threadAvailableRamCapacities = ramCapacities[_indexOf];
        Element _element = new Element(threadLocationsBoardLevel, allRamCapacities, threadAvailableRamCapacities);
        this.constraintStore.impose(_element);
        Application _application = thread.getApplication();
        final int ramUtil = _application.getRamUtilization();
        XgteqC _xgteqC = new XgteqC(threadAvailableRamCapacities, ramUtil);
        this.constraintStore.impose(_xgteqC);
      }
    }
    EList<Board> _allBoards_2 = this.model.getAllBoards();
    for (final Board board : _allBoards_2) {
      {
        final ArrayList<BooleanVar> factorList = new ArrayList<BooleanVar>();
        final ArrayList<Integer> utilizationList = new ArrayList<Integer>();
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread thread_1 : _allThreads_3) {
          {
            final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(thread_1, HardwareArchitectureLevelType.BOARD_VALUE);
            String _name = thread_1.getName();
            String _plus = ("Delta-for-" + _name);
            final BooleanVar delta = new BooleanVar(this.constraintStore, _plus);
            EList<Board> _allBoards_3 = this.model.getAllBoards();
            int _indexOf = _allBoards_3.indexOf(board);
            int _plus_1 = (_indexOf + 1);
            final XeqC constraintXeqC = new XeqC(threadLocationsBoardLevel, _plus_1);
            final Reified constraintReified = new Reified(constraintXeqC, delta);
            this.constraintStore.impose(constraintReified);
            factorList.add(delta);
            Application _application = thread_1.getApplication();
            int _ramUtilization = _application.getRamUtilization();
            utilizationList.add(Integer.valueOf(_ramUtilization));
          }
        }
        final IntVar absoluteRamUtilization = this.solverVariables.getAbsoluteRamUtilizationVariable(board);
        final SumWeight constraintSumWeight = new SumWeight(factorList, utilizationList, absoluteRamUtilization);
        this.constraintStore.impose(constraintSumWeight);
      }
    }
    return true;
  }
}

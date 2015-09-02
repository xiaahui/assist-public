package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.exceptions.InsufficientTotalRAMException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class RAMUtilizationConstraint extends AbstractMappingConstraint {
  public RAMUtilizationConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("ram capacity", model, solver, solverVariables);
  }
  
  @Override
  public boolean generate() {
    try {
      EList<Board> _allBoards = this.model.getAllBoards();
      final Function1<Board, Integer> _function = (Board it) -> {
        return Integer.valueOf(it.getRamCapacity());
      };
      final int[] allRamCapacities = ((int[])Conversions.unwrapArray(ListExtensions.<Board, Integer>map(_allBoards, _function), int.class));
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
      final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function_1 = (ch.hilbri.assist.datamodel.model.Thread it) -> {
        Application _application = it.getApplication();
        return Integer.valueOf(_application.getRamUtilization());
      };
      List<Integer> _map = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads, _function_1);
      final Function2<Integer, Integer, Integer> _function_2 = (Integer p1, Integer p2) -> {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      };
      final Integer totalRamUtilization = IterableExtensions.<Integer>reduce(_map, _function_2);
      Integer _min = IterableExtensions.<Integer>min(((Iterable<Integer>)Conversions.doWrapArray(allRamCapacities)));
      boolean _lessEqualsThan = (totalRamUtilization.compareTo(_min) <= 0);
      if (_lessEqualsThan) {
        return false;
      }
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
      final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_3 = (ch.hilbri.assist.datamodel.model.Thread it) -> {
        List<Integer> _sort = IterableExtensions.<Integer>sort(((Iterable<Integer>)Conversions.doWrapArray(allRamCapacities)));
        return VF.enumerated("RamCap", ((int[])Conversions.unwrapArray(_sort, int.class)), this.solver);
      };
      final IntVar[] ramCapacities = ((IntVar[])Conversions.unwrapArray(ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads_1, _function_3), IntVar.class));
      final Function2<Integer, Integer, Integer> _function_4 = (Integer p1, Integer p2) -> {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      };
      Integer _reduce = IterableExtensions.<Integer>reduce(((Iterable<? extends Integer>)Conversions.doWrapArray(allRamCapacities)), _function_4);
      boolean _greaterThan = (totalRamUtilization.compareTo(_reduce) > 0);
      if (_greaterThan) {
        throw new InsufficientTotalRAMException(this);
      }
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
      for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads_2) {
        {
          final IntVar threadLocationsBoardLevelVar = this.solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.BOARD_VALUE);
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
          int _indexOf = _allThreads_3.indexOf(thread);
          final IntVar threadAvailableRamCapacitiesVar = ramCapacities[_indexOf];
          Constraint _element = ICF.element(threadAvailableRamCapacitiesVar, allRamCapacities, threadLocationsBoardLevelVar);
          this.solver.post(_element);
          Application _application = thread.getApplication();
          int _ramUtilization = _application.getRamUtilization();
          Constraint _arithm = ICF.arithm(threadAvailableRamCapacitiesVar, ">=", _ramUtilization);
          this.solver.post(_arithm);
          try {
            this.solver.propagate();
          } catch (final Throwable _t) {
            if (_t instanceof ContradictionException) {
              final ContradictionException e = (ContradictionException)_t;
              throw new BasicConstraintsException(this);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      EList<Board> _allBoards_1 = this.model.getAllBoards();
      for (final Board board : _allBoards_1) {
        {
          final ArrayList<BoolVar> factorList = new ArrayList<BoolVar>();
          final ArrayList<Integer> utilizationList = new ArrayList<Integer>();
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
          for (final ch.hilbri.assist.datamodel.model.Thread thread_1 : _allThreads_3) {
            {
              final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(thread_1, HardwareArchitectureLevelType.BOARD_VALUE);
              String _name = thread_1.getName();
              String _plus = ("d-" + _name);
              String _plus_1 = (_plus + "-");
              String _name_1 = board.getName();
              String _plus_2 = (_plus_1 + _name_1);
              final BoolVar delta = VF.bool(_plus_2, this.solver);
              EList<Board> _allBoards_2 = this.model.getAllBoards();
              int _indexOf = _allBoards_2.indexOf(board);
              final Constraint constraint = ICF.arithm(threadLocationsBoardLevel, "=", _indexOf);
              constraint.reifyWith(delta);
              factorList.add(delta);
              Application _application = thread_1.getApplication();
              int _ramUtilization = _application.getRamUtilization();
              utilizationList.add(Integer.valueOf(_ramUtilization));
            }
          }
          IntVar _absoluteRamUtilizationVariable = this.solverVariables.getAbsoluteRamUtilizationVariable(board);
          Constraint _scalar = ICF.scalar(((IntVar[])Conversions.unwrapArray(factorList, IntVar.class)), ((int[])Conversions.unwrapArray(utilizationList, int.class)), "=", _absoluteRamUtilizationVariable);
          this.solver.post(_scalar);
          try {
            this.solver.propagate();
          } catch (final Throwable _t) {
            if (_t instanceof ContradictionException) {
              final ContradictionException e = (ContradictionException)_t;
              throw new BasicConstraintsException(this);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      this.propagate();
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

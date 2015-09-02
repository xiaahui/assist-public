package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CoreUtilizationConstraint extends AbstractMappingConstraint {
  public CoreUtilizationConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("core capacity", model, solver, solverVariables);
  }
  
  @Override
  public boolean generate() {
    try {
      EList<Core> _allCores = this.model.getAllCores();
      final Function1<Core, Integer> _function = (Core it) -> {
        return Integer.valueOf(it.getCapacity());
      };
      final int[] allCoreCapacities = ((int[])Conversions.unwrapArray(ListExtensions.<Core, Integer>map(_allCores, _function), int.class));
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
      final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function_1 = (ch.hilbri.assist.datamodel.model.Thread it) -> {
        return Integer.valueOf(it.getCoreUtilization());
      };
      final int[] allCoreUtilization = ((int[])Conversions.unwrapArray(ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads, _function_1), int.class));
      final Function2<Integer, Integer, Integer> _function_2 = (Integer p1, Integer p2) -> {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      };
      final Integer totalCoreUtilization = IterableExtensions.<Integer>reduce(((Iterable<? extends Integer>)Conversions.doWrapArray(allCoreUtilization)), _function_2);
      Integer _min = IterableExtensions.<Integer>min(((Iterable<Integer>)Conversions.doWrapArray(allCoreCapacities)));
      boolean _lessEqualsThan = (totalCoreUtilization.compareTo(_min) <= 0);
      if (_lessEqualsThan) {
        return false;
      }
      final Function2<Integer, Integer, Integer> _function_3 = (Integer p1, Integer p2) -> {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      };
      Integer _reduce = IterableExtensions.<Integer>reduce(((Iterable<? extends Integer>)Conversions.doWrapArray(allCoreCapacities)), _function_3);
      boolean _greaterThan = (totalCoreUtilization.compareTo(_reduce) > 0);
      if (_greaterThan) {
        throw new BasicConstraintsException(this);
      }
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
      final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_4 = (ch.hilbri.assist.datamodel.model.Thread t) -> {
        return this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.CORE_VALUE);
      };
      final List<IntVar> locationVars = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads_1, _function_4);
      EList<Core> _allCores_1 = this.model.getAllCores();
      final Function1<Core, IntVar> _function_5 = (Core c) -> {
        return this.solverVariables.getAbsoluteCoreUtilizationVariable(c);
      };
      final List<IntVar> utilizationVars = ListExtensions.<Core, IntVar>map(_allCores_1, _function_5);
      Constraint[] _bin_packing = ICF.bin_packing(((IntVar[])Conversions.unwrapArray(locationVars, IntVar.class)), allCoreUtilization, ((IntVar[])Conversions.unwrapArray(utilizationVars, IntVar.class)), 0);
      this.solver.post(_bin_packing);
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
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

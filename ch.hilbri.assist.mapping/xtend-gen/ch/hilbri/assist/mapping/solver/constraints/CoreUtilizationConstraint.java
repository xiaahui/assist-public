package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Core;
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
import solver.Solver;
import solver.constraints.Constraint;
import solver.constraints.ICF;
import solver.variables.BoolVar;
import solver.variables.IntVar;
import solver.variables.VF;

@SuppressWarnings("all")
public class CoreUtilizationConstraint extends AbstractMappingConstraint {
  public CoreUtilizationConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Core capacity constraints", model, solver, solverVariables);
  }
  
  public boolean generate() {
    EList<Core> _allCores = this.model.getAllCores();
    final Function1<Core, Integer> _function = new Function1<Core, Integer>() {
      public Integer apply(final Core it) {
        return Integer.valueOf(it.getCapacity());
      }
    };
    final int[] allCoreProcessingPowerCapacities = ((int[])Conversions.unwrapArray(ListExtensions.<Core, Integer>map(_allCores, _function), int.class));
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_1 = new Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar>() {
      public IntVar apply(final ch.hilbri.assist.datamodel.model.Thread it) {
        List<Integer> _sort = IterableExtensions.<Integer>sort(((Iterable<Integer>)Conversions.doWrapArray(allCoreProcessingPowerCapacities)));
        return VF.enumerated("CoreCap", ((int[])Conversions.unwrapArray(_sort, int.class)), CoreUtilizationConstraint.this.solver);
      }
    };
    final IntVar[] coreProcessingPowerCapacities = ((IntVar[])Conversions.unwrapArray(ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads, _function_1), IntVar.class));
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function_2 = new Function1<ch.hilbri.assist.datamodel.model.Thread, Integer>() {
      public Integer apply(final ch.hilbri.assist.datamodel.model.Thread it) {
        return Integer.valueOf(it.getCoreUtilization());
      }
    };
    List<Integer> _map = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads_1, _function_2);
    final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_3);
    final IntVar totalCoreUtilizationFromAllApplicationsVar = VF.fixed("TotalCoreUtil", (_reduce).intValue(), this.solver);
    EList<Core> _allCores_1 = this.model.getAllCores();
    final Function1<Core, Integer> _function_4 = new Function1<Core, Integer>() {
      public Integer apply(final Core it) {
        return Integer.valueOf(it.getCapacity());
      }
    };
    List<Integer> _map_1 = ListExtensions.<Core, Integer>map(_allCores_1, _function_4);
    final Function2<Integer, Integer, Integer> _function_5 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    Integer _reduce_1 = IterableExtensions.<Integer>reduce(_map_1, _function_5);
    final IntVar totalCoreCapacityVar = VF.fixed("TotalCoreCapacitiy", (_reduce_1).intValue(), this.solver);
    Constraint _arithm = ICF.arithm(totalCoreCapacityVar, ">=", totalCoreUtilizationFromAllApplicationsVar);
    this.solver.post(_arithm);
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads_2) {
      {
        final IntVar threadLocationsCoreLevelVar = this.solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.CORE_VALUE);
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
        int _indexOf = _allThreads_3.indexOf(thread);
        final IntVar threadAvailableProcessingPowerCapacitiesVar = coreProcessingPowerCapacities[_indexOf];
        Constraint _element = ICF.element(threadAvailableProcessingPowerCapacitiesVar, allCoreProcessingPowerCapacities, threadLocationsCoreLevelVar);
        this.solver.post(_element);
        int _coreUtilization = thread.getCoreUtilization();
        Constraint _arithm_1 = ICF.arithm(threadAvailableProcessingPowerCapacitiesVar, ">=", _coreUtilization);
        this.solver.post(_arithm_1);
      }
    }
    EList<Core> _allCores_2 = this.model.getAllCores();
    for (final Core core : _allCores_2) {
      {
        final ArrayList<BoolVar> factorList = new ArrayList<BoolVar>();
        final ArrayList<Integer> utilizationList = new ArrayList<Integer>();
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_3 = this.model.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread thread_1 : _allThreads_3) {
          {
            final IntVar threadLocationsCoreLevel = this.solverVariables.getThreadLocationVariable(thread_1, HardwareArchitectureLevelType.CORE_VALUE);
            String _name = thread_1.getName();
            String _plus = ("d-" + _name);
            String _plus_1 = (_plus + "-");
            String _name_1 = core.getName();
            String _plus_2 = (_plus_1 + _name_1);
            final BoolVar delta = VF.bool(_plus_2, this.solver);
            EList<Core> _allCores_3 = this.model.getAllCores();
            int _indexOf = _allCores_3.indexOf(core);
            final Constraint constraint = ICF.arithm(threadLocationsCoreLevel, "=", _indexOf);
            constraint.reifyWith(delta);
            factorList.add(delta);
            int _coreUtilization = thread_1.getCoreUtilization();
            utilizationList.add(Integer.valueOf(_coreUtilization));
          }
        }
        IntVar _absoluteCoreUtilizationVariable = this.solverVariables.getAbsoluteCoreUtilizationVariable(core);
        Constraint _scalar = ICF.scalar(((IntVar[])Conversions.unwrapArray(factorList, IntVar.class)), ((int[])Conversions.unwrapArray(utilizationList, int.class)), "=", _absoluteCoreUtilizationVariable);
        this.solver.post(_scalar);
      }
    }
    return true;
  }
}

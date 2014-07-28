package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
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
public class CoreUtilizationConstraint extends AbstractMappingConstraint {
  public CoreUtilizationConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("Core utilization", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    EList<Core> _allCores = this.model.getAllCores();
    final Function1<Core, Integer> _function = new Function1<Core, Integer>() {
      public Integer apply(final Core it) {
        return Integer.valueOf(it.getCapacity());
      }
    };
    final int[] allCoreProcessingPowerCapacities = ((int[])Conversions.unwrapArray(ListExtensions.<Core, Integer>map(_allCores, _function), int.class));
    final IntervalDomain coreProcessingPowerCapacitiesDomain = new IntervalDomain();
    for (final int powerCapacity : allCoreProcessingPowerCapacities) {
      BoundDomain _boundDomain = new BoundDomain(powerCapacity, powerCapacity);
      coreProcessingPowerCapacitiesDomain.addDom(_boundDomain);
    }
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_1 = new Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar>() {
      public IntVar apply(final ch.hilbri.assist.datamodel.model.Thread it) {
        return new IntVar(CoreUtilizationConstraint.this.constraintStore, "Core Processing Power Capacities", coreProcessingPowerCapacitiesDomain);
      }
    };
    final IntVar[] coreProcessingPowerCapacities = ((IntVar[])Conversions.unwrapArray(ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads, _function_1), IntVar.class));
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads_1) {
      {
        HardwareArchitectureLevelType _bottomHardwareLevel = this.model.getBottomHardwareLevel();
        int _value = _bottomHardwareLevel.getValue();
        final IntVar threadLocationsCoreLevel = this.solverVariables.getThreadLocationVariable(thread, _value);
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
        int _indexOf = _allThreads_2.indexOf(thread);
        final IntVar threadAvailableProcessingPowerCapacities = coreProcessingPowerCapacities[_indexOf];
        Element _element = new Element(threadLocationsCoreLevel, allCoreProcessingPowerCapacities, threadAvailableProcessingPowerCapacities);
        this.constraintStore.impose(_element);
        final int coreUtil = thread.getCoreUtilization();
        XgteqC _xgteqC = new XgteqC(threadAvailableProcessingPowerCapacities, coreUtil);
        this.constraintStore.impose(_xgteqC);
      }
    }
    EList<Core> _allCores_1 = this.model.getAllCores();
    for (final Core core : _allCores_1) {
      {
        final ArrayList<BooleanVar> factorList = new ArrayList<BooleanVar>();
        final ArrayList<Integer> utilizationList = new ArrayList<Integer>();
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_2 = this.model.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread thread_1 : _allThreads_2) {
          {
            HardwareArchitectureLevelType _bottomHardwareLevel = this.model.getBottomHardwareLevel();
            int _value = _bottomHardwareLevel.getValue();
            final IntVar threadLocationsCoreLevel = this.solverVariables.getThreadLocationVariable(thread_1, _value);
            String _name = thread_1.getName();
            String _plus = ("Delta-for-" + _name);
            final BooleanVar delta = new BooleanVar(this.constraintStore, _plus);
            EList<Core> _allCores_2 = this.model.getAllCores();
            int _indexOf = _allCores_2.indexOf(core);
            int _plus_1 = (_indexOf + 1);
            final XeqC constraintXeqC = new XeqC(threadLocationsCoreLevel, _plus_1);
            final Reified constraintReified = new Reified(constraintXeqC, delta);
            this.constraintStore.impose(constraintReified);
            factorList.add(delta);
            int _coreUtilization = thread_1.getCoreUtilization();
            utilizationList.add(Integer.valueOf(_coreUtilization));
          }
        }
        final IntVar absoluteCoreUtilization = this.solverVariables.getAbsoluteCoreUtilizationVariable(core);
        final SumWeight constraintSumWeight = new SumWeight(factorList, utilizationList, absoluteCoreUtilization);
        this.constraintStore.impose(constraintSumWeight);
        this.constraintStore.print();
      }
    }
    return true;
  }
}

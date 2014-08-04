package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.jacop.constraints.XeqY;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
  public AllApplicationThreadsOnSameBoard(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("All threads of an applications should be on the same board", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    EList<Application> _applications = this.model.getApplications();
    for (final Application application : _applications) {
      EList<ch.hilbri.assist.datamodel.model.Thread> _threads = application.getThreads();
      int _size = _threads.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        EList<ch.hilbri.assist.datamodel.model.Thread> _threads_1 = application.getThreads();
        int _size_1 = _threads_1.size();
        int _minus = (_size_1 - 1);
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _minus, true);
        for (final Integer i : _doubleDotLessThan) {
          {
            EList<ch.hilbri.assist.datamodel.model.Thread> _threads_2 = application.getThreads();
            ch.hilbri.assist.datamodel.model.Thread _get = _threads_2.get((i).intValue());
            final IntVar var1 = this.solverVariables.getThreadLocationVariable(_get, HardwareArchitectureLevelType.BOARD_VALUE);
            EList<ch.hilbri.assist.datamodel.model.Thread> _threads_3 = application.getThreads();
            ch.hilbri.assist.datamodel.model.Thread _get_1 = _threads_3.get(((i).intValue() + 1));
            final IntVar var2 = this.solverVariables.getThreadLocationVariable(_get_1, HardwareArchitectureLevelType.BOARD_VALUE);
            XeqY _xeqY = new XeqY(var1, var2);
            this.constraintStore.impose(_xeqY);
          }
        }
      }
    }
    return true;
  }
}

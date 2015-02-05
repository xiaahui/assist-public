package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.allapplicationthreadsonsameboard.TwoThreadsCannotBeDeployedToSameBoard;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class AllApplicationThreadsOnSameBoard extends AbstractMappingConstraint {
  public AllApplicationThreadsOnSameBoard(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("all applications\'s threads on the same board", model, solver, solverVariables);
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
            Constraint _arithm = ICF.arithm(var1, "=", var2);
            this.solver.post(_arithm);
            EList<ch.hilbri.assist.datamodel.model.Thread> _threads_4 = application.getThreads();
            ch.hilbri.assist.datamodel.model.Thread _get_2 = _threads_4.get((i).intValue());
            EList<ch.hilbri.assist.datamodel.model.Thread> _threads_5 = application.getThreads();
            ch.hilbri.assist.datamodel.model.Thread _get_3 = _threads_5.get(((i).intValue() + 1));
            this.propagate(_get_2, _get_3);
          }
        }
      }
    }
    return true;
  }
  
  public void propagate(final ch.hilbri.assist.datamodel.model.Thread t1, final ch.hilbri.assist.datamodel.model.Thread t2) {
    try {
      try {
        this.solver.propagate();
      } catch (final Throwable _t) {
        if (_t instanceof ContradictionException) {
          final ContradictionException e = (ContradictionException)_t;
          throw new TwoThreadsCannotBeDeployedToSameBoard(this, t1, t2);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

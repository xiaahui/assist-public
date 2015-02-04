package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
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
public class NoPermutationsConstraint extends AbstractMappingConstraint {
  public NoPermutationsConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("No permutations of threads", model, solver, solverVariables);
  }
  
  public boolean generate() {
    try {
      EList<Application> _applications = this.model.getApplications();
      for (final Application app : _applications) {
        EList<ch.hilbri.assist.datamodel.model.Thread> _threads = app.getThreads();
        int _size = _threads.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          EList<ch.hilbri.assist.datamodel.model.Thread> _threads_1 = app.getThreads();
          int _size_1 = _threads_1.size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
          for (final Integer i : _doubleDotLessThan) {
            EList<ch.hilbri.assist.datamodel.model.Thread> _threads_2 = app.getThreads();
            int _size_2 = _threads_2.size();
            ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_2, true);
            for (final Integer j : _doubleDotLessThan_1) {
              {
                EList<ch.hilbri.assist.datamodel.model.Thread> _threads_3 = app.getThreads();
                ch.hilbri.assist.datamodel.model.Thread _get = _threads_3.get((i).intValue());
                final IntVar var1 = this.solverVariables.getThreadLocationVariable(_get, HardwareArchitectureLevelType.CORE_VALUE);
                EList<ch.hilbri.assist.datamodel.model.Thread> _threads_4 = app.getThreads();
                ch.hilbri.assist.datamodel.model.Thread _get_1 = _threads_4.get((j).intValue());
                final IntVar var2 = this.solverVariables.getThreadLocationVariable(_get_1, HardwareArchitectureLevelType.CORE_VALUE);
                Constraint _arithm = ICF.arithm(var1, "<=", var2);
                this.solver.post(_arithm);
              }
            }
          }
        }
      }
      try {
        this.solver.propagate();
      } catch (final Throwable _t) {
        if (_t instanceof ContradictionException) {
          final ContradictionException e = (ContradictionException)_t;
          throw new BasicConstraintsException(this.name);
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

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.ProximityRelation;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.ApplicationProximityException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class ApplicationProximityConstraint extends AbstractMappingConstraint {
  public ApplicationProximityConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("application proximity (on same)", model, solver, solverVariables);
  }
  
  public boolean generate() {
    try {
      EList<ProximityRelation> _proximityRelations = this.model.getProximityRelations();
      for (final ProximityRelation relation : _proximityRelations) {
        {
          final HardwareArchitectureLevelType level = relation.getHardwareLevel();
          final ArrayList<ch.hilbri.assist.datamodel.model.Thread> threadList = new ArrayList<ch.hilbri.assist.datamodel.model.Thread>();
          EList<ApplicationOrApplicationGroup> _applicationsOrGroups = relation.getApplicationsOrGroups();
          for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
            if ((aog instanceof ApplicationGroup)) {
              EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = ((ApplicationGroup) aog).getAllThreads();
              threadList.addAll(_allThreads);
            } else {
              if ((aog instanceof Application)) {
                EList<ch.hilbri.assist.datamodel.model.Thread> _threads = ((Application) aog).getThreads();
                threadList.addAll(_threads);
              } else {
                return false;
              }
            }
          }
          final ArrayList<IntVar> threadVarList = new ArrayList<IntVar>();
          for (final ch.hilbri.assist.datamodel.model.Thread t : threadList) {
            int _value = level.getValue();
            IntVar _threadLocationVariable = this.solverVariables.getThreadLocationVariable(t, _value);
            threadVarList.add(_threadLocationVariable);
          }
          int _size = threadVarList.size();
          boolean _greaterThan = (_size > 1);
          if (_greaterThan) {
            for (int i = 0; (i < (threadVarList.size() - 1)); i++) {
              IntVar _get = threadVarList.get(i);
              IntVar _get_1 = threadVarList.get((i + 1));
              Constraint _arithm = ICF.arithm(_get, "=", _get_1);
              this.solver.post(_arithm);
            }
          }
          try {
            this.solver.propagate();
          } catch (final Throwable _t) {
            if (_t instanceof ContradictionException) {
              final ContradictionException e = (ContradictionException)_t;
              throw new ApplicationProximityException(this.name, relation);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

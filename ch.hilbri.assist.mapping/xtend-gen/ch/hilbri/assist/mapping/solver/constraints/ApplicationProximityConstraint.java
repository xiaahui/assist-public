package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.ProximityRelation;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.jacop.constraints.XeqY;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class ApplicationProximityConstraint extends AbstractMappingConstraint {
  public ApplicationProximityConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("Application proximity constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
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
            XeqY _xeqY = new XeqY(_get, _get_1);
            this.constraintStore.impose(_xeqY);
          }
        }
      }
    }
    return true;
  }
}

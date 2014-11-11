package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.Processor;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.jacop.constraints.In;
import org.jacop.core.BoundDomain;
import org.jacop.core.IntVar;
import org.jacop.core.IntervalDomain;
import org.jacop.core.Store;

@SuppressWarnings("all")
public class RestrictedDeploymentConstraint extends AbstractMappingConstraint {
  public RestrictedDeploymentConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("Restricted deployment constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
      Application _application = t.getApplication();
      EList<HardwareElement> _restrictMappingToHardwareElements = _application.getRestrictMappingToHardwareElements();
      boolean _isEmpty = _restrictMappingToHardwareElements.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final HashSet<Core> allowedCores = new HashSet<Core>();
        Application _application_1 = t.getApplication();
        EList<HardwareElement> _restrictMappingToHardwareElements_1 = _application_1.getRestrictMappingToHardwareElements();
        for (final HardwareElement hwElem : _restrictMappingToHardwareElements_1) {
          if ((hwElem instanceof Compartment)) {
            EList<Core> _allCores = ((Compartment) hwElem).getAllCores();
            allowedCores.addAll(_allCores);
          } else {
            if ((hwElem instanceof Box)) {
              EList<Core> _allCores_1 = ((Box) hwElem).getAllCores();
              allowedCores.addAll(_allCores_1);
            } else {
              if ((hwElem instanceof Board)) {
                EList<Core> _allCores_2 = ((Board) hwElem).getAllCores();
                allowedCores.addAll(_allCores_2);
              } else {
                if ((hwElem instanceof Processor)) {
                  EList<Core> _cores = ((Processor) hwElem).getCores();
                  allowedCores.addAll(_cores);
                } else {
                  if ((hwElem instanceof Core)) {
                    allowedCores.add(((Core) hwElem));
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        final IntVar threadLocationsCoreLevel = this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.CORE_VALUE);
        IntervalDomain domain = new IntervalDomain();
        for (final Core core : allowedCores) {
          EList<Core> _allCores_3 = this.model.getAllCores();
          int _indexOf = _allCores_3.indexOf(core);
          int _plus = (_indexOf + 1);
          EList<Core> _allCores_4 = this.model.getAllCores();
          int _indexOf_1 = _allCores_4.indexOf(core);
          int _plus_1 = (_indexOf_1 + 1);
          BoundDomain _boundDomain = new BoundDomain(_plus, _plus_1);
          domain.addDom(_boundDomain);
        }
        In _in = new In(threadLocationsCoreLevel, domain);
        this.constraintStore.impose(_in);
      }
    }
    return true;
  }
}

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
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.HashSet;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RestrictedDeploymentConstraint extends AbstractMappingConstraint {
  public RestrictedDeploymentConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Restricted deployment constraints", model, solver, solverVariables);
  }
  
  public boolean generate() {
    try {
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
          final Function1<Core, Integer> _function = new Function1<Core, Integer>() {
            public Integer apply(final Core it) {
              EList<Core> _allCores = RestrictedDeploymentConstraint.this.model.getAllCores();
              return Integer.valueOf(_allCores.indexOf(it));
            }
          };
          Iterable<Integer> _map = IterableExtensions.<Core, Integer>map(allowedCores, _function);
          Constraint _member = ICF.member(threadLocationsCoreLevel, ((int[])Conversions.unwrapArray(_map, int.class)));
          this.solver.post(_member);
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

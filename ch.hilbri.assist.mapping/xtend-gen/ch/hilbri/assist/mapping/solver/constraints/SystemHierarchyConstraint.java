package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
@SuppressWarnings("all")
public class SystemHierarchyConstraint extends AbstractMappingConstraint {
  public SystemHierarchyConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("system hierarchy", model, solver, solverVariables);
  }
  
  public boolean generate() {
    try {
      int _hardwareLevelCount = this.model.getHardwareLevelCount();
      int _minus = (_hardwareLevelCount - 1);
      IntegerRange _upTo = new IntegerRange(HardwareArchitectureLevelType.CORE_VALUE, _minus);
      for (final Integer levelCtr : _upTo) {
        {
          EList<HardwareElement> _allHardwareElements = this.model.getAllHardwareElements((levelCtr).intValue());
          final Function1<HardwareElement, EObject> _function = new Function1<HardwareElement, EObject>() {
            public EObject apply(final HardwareElement it) {
              return it.eContainer();
            }
          };
          List<EObject> _map = ListExtensions.<HardwareElement, EObject>map(_allHardwareElements, _function);
          final Function1<EObject, Integer> _function_1 = new Function1<EObject, Integer>() {
            public Integer apply(final EObject it) {
              EList<HardwareElement> _allHardwareElements = SystemHierarchyConstraint.this.model.getAllHardwareElements(((levelCtr).intValue() + 1));
              return Integer.valueOf(_allHardwareElements.indexOf(it));
            }
          };
          final List<Integer> hardwareLevelLink = ListExtensions.<EObject, Integer>map(_map, _function_1);
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
          for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
            {
              IntVar index = this.solverVariables.getThreadLocationVariable(t, (levelCtr).intValue());
              IntVar values = this.solverVariables.getThreadLocationVariable(t, ((levelCtr).intValue() + 1));
              Constraint _element = ICF.element(values, ((int[])Conversions.unwrapArray(hardwareLevelLink, int.class)), index);
              this.solver.post(_element);
            }
          }
        }
      }
      this.propagate();
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

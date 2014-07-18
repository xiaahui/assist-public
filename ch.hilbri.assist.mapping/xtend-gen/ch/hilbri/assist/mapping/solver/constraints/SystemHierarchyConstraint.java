package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.HardwareElement;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.jacop.constraints.Element;
import org.jacop.core.IntVar;
import org.jacop.core.Store;

/**
 * Ziel: Zwischen allen Abstraktionsebenen im Modell muessen Verbindungen hergestellt werden.
 */
@SuppressWarnings("all")
public class SystemHierarchyConstraint extends AbstractMappingConstraint {
  public SystemHierarchyConstraint(final AssistModel model, final Store constraintStore, final SolverVariablesContainer solverVariables) {
    super("System Hierarchy Constraints", model, constraintStore, solverVariables);
  }
  
  public boolean generate() {
    final ArrayList<ArrayList<Integer>> hardwareLevelLink = new ArrayList<ArrayList<Integer>>();
    int _hardwareLevelCount = this.model.getHardwareLevelCount();
    int _minus = (_hardwareLevelCount - 1);
    IntegerRange _upTo = new IntegerRange(1, _minus);
    for (final Integer levelCtr : _upTo) {
      {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        EList<HardwareElement> _allHardwareElements = this.model.getAllHardwareElements((levelCtr).intValue());
        for (final HardwareElement hw : _allHardwareElements) {
          EObject _eContainer = hw.eContainer();
          EObject _eContainer_1 = _eContainer.eContainer();
          EList<EObject> _eContents = _eContainer_1.eContents();
          EObject _eContainer_2 = hw.eContainer();
          int _indexOf = _eContents.indexOf(_eContainer_2);
          int _plus = (_indexOf + 1);
          list.add(Integer.valueOf(_plus));
        }
        hardwareLevelLink.add(list);
        EList<ch.hilbri.assist.model.Thread> _allThreads = this.model.getAllThreads();
        for (final ch.hilbri.assist.model.Thread t : _allThreads) {
          {
            IntVar index = this.solverVariables.getThreadLocationVariable(t, (levelCtr).intValue());
            IntVar values = this.solverVariables.getThreadLocationVariable(t, ((levelCtr).intValue() + 1));
            ArrayList<Integer> _get = hardwareLevelLink.get(((levelCtr).intValue() - 1));
            Element _element = new Element(index, ((int[])Conversions.unwrapArray(_get, int.class)), values);
            this.constraintStore.impose(_element);
          }
        }
      }
    }
    return true;
  }
}

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
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
    int _hardwareLevelCount = this.model.getHardwareLevelCount();
    int _minus = (_hardwareLevelCount - 1);
    IntegerRange _upTo = new IntegerRange(1, _minus);
    for (final Integer levelCtr : _upTo) {
      {
        final ArrayList<Integer> hardwareLevelLink = new ArrayList<Integer>();
        EList<HardwareElement> _allHardwareElements = this.model.getAllHardwareElements((levelCtr).intValue());
        for (final HardwareElement childHardwareComponent : _allHardwareElements) {
          {
            final EObject parentHardwareComponent = childHardwareComponent.eContainer();
            EList<HardwareElement> _allHardwareElements_1 = this.model.getAllHardwareElements(((levelCtr).intValue() + 1));
            int _indexOf = _allHardwareElements_1.indexOf(parentHardwareComponent);
            int _plus = (_indexOf + 1);
            hardwareLevelLink.add(Integer.valueOf(_plus));
          }
        }
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
          {
            IntVar index = this.solverVariables.getThreadLocationVariable(t, (levelCtr).intValue());
            IntVar values = this.solverVariables.getThreadLocationVariable(t, ((levelCtr).intValue() + 1));
            Element _element = new Element(index, ((int[])Conversions.unwrapArray(hardwareLevelLink, int.class)), values);
            this.constraintStore.impose(_element);
          }
        }
      }
    }
    return true;
  }
}

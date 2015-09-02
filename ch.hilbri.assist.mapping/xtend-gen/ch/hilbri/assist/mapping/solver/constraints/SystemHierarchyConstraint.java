package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.extension.Tuples;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.util.tools.ArrayUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SystemHierarchyConstraint extends AbstractMappingConstraint {
  public SystemHierarchyConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("system hierarchy", model, solver, solverVariables);
  }
  
  @Override
  public boolean generate() {
    try {
      final BoolVar[][] boardIndicators = this.solverVariables.getThreadBoardIndicatorVariables();
      for (int i = 0; (i < this.model.getAllThreads().size()); i++) {
        {
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
          ch.hilbri.assist.datamodel.model.Thread _get = _allThreads.get(i);
          final IntVar intVar = this.solverVariables.getThreadLocationVariable(_get, 
            HardwareArchitectureLevelType.BOARD_VALUE);
          BoolVar[] _column = ArrayUtils.<BoolVar>getColumn(boardIndicators, i);
          Constraint _boolean_channeling = ICF.boolean_channeling(_column, intVar, 0);
          this.solver.post(_boolean_channeling);
        }
      }
      final Tuples tuples = new Tuples(true);
      final EList<HardwareElement> cores = this.model.getAllHardwareElements(HardwareArchitectureLevelType.CORE_VALUE);
      int _length = ((Object[])Conversions.unwrapArray(cores, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final int coreIdx : _doubleDotLessThan) {
        {
          HardwareElement _get = cores.get(coreIdx);
          EObject elem = ((EObject) _get);
          ArrayList<Integer> index = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(coreIdx));
          int _hardwareLevelCount = this.model.getHardwareLevelCount();
          IntegerRange _upTo = new IntegerRange((HardwareArchitectureLevelType.CORE_VALUE + 1), _hardwareLevelCount);
          for (final Integer levelCtr : _upTo) {
            {
              EList<HardwareElement> _allHardwareElements = this.model.getAllHardwareElements((levelCtr).intValue());
              EObject _eContainer = elem.eContainer();
              int _indexOf = _allHardwareElements.indexOf(_eContainer);
              index.add(Integer.valueOf(_indexOf));
              EObject _eContainer_1 = elem.eContainer();
              elem = _eContainer_1;
            }
          }
          final ArrayList<Integer> _converted_index = (ArrayList<Integer>)index;
          tuples.add(((int[])Conversions.unwrapArray(_converted_index, int.class)));
        }
      }
      int _hardwareLevelCount = this.model.getHardwareLevelCount();
      final IntegerRange levels = new IntegerRange(HardwareArchitectureLevelType.CORE_VALUE, _hardwareLevelCount);
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
      for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
        {
          final Function1<Integer, IntVar> _function = (Integer l) -> {
            return this.solverVariables.getThreadLocationVariable(t, (l).intValue());
          };
          final Iterable<IntVar> varList = IterableExtensions.<Integer, IntVar>map(levels, _function);
          Constraint _table = ICF.table(((IntVar[])Conversions.unwrapArray(varList, IntVar.class)), tuples, "");
          this.solver.post(_table);
        }
      }
      this.propagate();
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

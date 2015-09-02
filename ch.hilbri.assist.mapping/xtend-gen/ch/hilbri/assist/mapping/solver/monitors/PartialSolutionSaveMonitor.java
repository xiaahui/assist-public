package ch.hilbri.assist.mapping.solver.monitors;

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.HashMap;
import java.util.Map;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class PartialSolutionSaveMonitor implements IMonitorDownBranch {
  private Solver solver;
  
  private IntVar[] locationVariables;
  
  private Logger logger;
  
  private int bestProgress = 0;
  
  private Map<IntVar, Integer> bestSolution;
  
  public PartialSolutionSaveMonitor(final Solver solver, final SolverVariablesContainer solverVariables) {
    this.solver = solver;
    IntVar[] _locationVariables = solverVariables.getLocationVariables();
    this.locationVariables = _locationVariables;
    Class<? extends PartialSolutionSaveMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
    HashMap<IntVar, Integer> _hashMap = new HashMap<IntVar, Integer>();
    this.bestSolution = _hashMap;
  }
  
  public Map<IntVar, Integer> getPartialSolution() {
    return this.bestSolution;
  }
  
  public int storePartialResult() {
    int _xblockexpression = (int) 0;
    {
      final Function1<IntVar, Boolean> _function = (IntVar it) -> {
        return Boolean.valueOf(it.isInstantiated());
      };
      Iterable<IntVar> _filter = IterableExtensions.<IntVar>filter(((Iterable<IntVar>)Conversions.doWrapArray(this.locationVariables)), _function);
      int _size = IterableExtensions.size(_filter);
      int _multiply = (_size * 100);
      int _length = this.locationVariables.length;
      final int currentProgress = (_multiply / _length);
      int _xifexpression = (int) 0;
      if ((currentProgress > this.bestProgress)) {
        int _xblockexpression_1 = (int) 0;
        {
          this.bestSolution.clear();
          final Function1<IntVar, Boolean> _function_1 = (IntVar it) -> {
            return Boolean.valueOf(it.isInstantiated());
          };
          Iterable<IntVar> _filter_1 = IterableExtensions.<IntVar>filter(((Iterable<IntVar>)Conversions.doWrapArray(this.locationVariables)), _function_1);
          for (final IntVar variable : _filter_1) {
            int _value = variable.getValue();
            this.bestSolution.put(variable, Integer.valueOf(_value));
          }
          _xblockexpression_1 = this.bestProgress = currentProgress;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public void afterDownLeftBranch() {
    this.storePartialResult();
  }
  
  @Override
  public void afterDownRightBranch() {
    this.storePartialResult();
  }
  
  @Override
  public void beforeDownLeftBranch() {
  }
  
  @Override
  public void beforeDownRightBranch() {
  }
}

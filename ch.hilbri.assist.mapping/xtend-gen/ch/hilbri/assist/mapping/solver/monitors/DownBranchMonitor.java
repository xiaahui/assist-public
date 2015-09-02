package ch.hilbri.assist.mapping.solver.monitors;

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import org.chocosolver.solver.search.loop.monitors.IMonitorDownBranch;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DownBranchMonitor implements IMonitorDownBranch {
  private SolverVariablesContainer solverVariables;
  
  private IntVar[] locationVariables;
  
  private Logger logger;
  
  private int bestProgress = 0;
  
  public DownBranchMonitor(final SolverVariablesContainer solverVariables) {
    this.solverVariables = solverVariables;
    IntVar[] _locationVariables = solverVariables.getLocationVariables();
    this.locationVariables = _locationVariables;
    Class<? extends DownBranchMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  public int calculateProgress() {
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
      int _abs = Math.abs((currentProgress - this.bestProgress));
      boolean _greaterEqualsThan = (_abs >= 1);
      if (_greaterEqualsThan) {
        int _xblockexpression_1 = (int) 0;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Search progress: �String::format(\"%3d\", currentProgress)�% of all location variables are instantiated");
          this.logger.info(_builder.toString());
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
    this.calculateProgress();
  }
  
  @Override
  public void afterDownRightBranch() {
    this.calculateProgress();
  }
  
  @Override
  public void beforeDownLeftBranch() {
  }
  
  @Override
  public void beforeDownRightBranch() {
  }
}

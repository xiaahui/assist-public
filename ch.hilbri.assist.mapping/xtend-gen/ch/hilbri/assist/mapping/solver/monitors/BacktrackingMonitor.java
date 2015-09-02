package ch.hilbri.assist.mapping.solver.monitors;

import org.chocosolver.solver.search.loop.monitors.IMonitorUpBranch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class BacktrackingMonitor implements IMonitorUpBranch {
  private Logger logger;
  
  public BacktrackingMonitor() {
    Class<? extends BacktrackingMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  @Override
  public void afterUpBranch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Backtracking");
    this.logger.debug(_builder.toString());
  }
  
  @Override
  public void beforeUpBranch() {
  }
}

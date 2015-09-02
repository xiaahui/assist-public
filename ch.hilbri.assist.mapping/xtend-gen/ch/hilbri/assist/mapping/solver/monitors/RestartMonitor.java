package ch.hilbri.assist.mapping.solver.monitors;

import org.chocosolver.solver.search.loop.monitors.IMonitorRestart;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class RestartMonitor implements IMonitorRestart {
  private Logger logger;
  
  public RestartMonitor() {
    Class<? extends RestartMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  @Override
  public void afterRestart() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Triggering a restart of the search.");
    this.logger.info(_builder.toString());
  }
  
  @Override
  public void beforeRestart() {
  }
}

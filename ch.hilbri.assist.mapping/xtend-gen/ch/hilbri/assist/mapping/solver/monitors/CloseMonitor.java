package ch.hilbri.assist.mapping.solver.monitors;

import org.chocosolver.solver.search.loop.monitors.IMonitorClose;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class CloseMonitor implements IMonitorClose {
  private Logger logger;
  
  public CloseMonitor() {
    Class<? extends CloseMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  @Override
  public void afterClose() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Closing the search. Either a configured solver limit was reached or the entire solution space has been explored.");
    this.logger.info(_builder.toString());
  }
  
  @Override
  public void beforeClose() {
  }
}

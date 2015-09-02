package ch.hilbri.assist.mapping.solver.monitors;

import com.google.common.base.Objects;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.extension.Tuples;
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class SolutionFoundMonitor implements IMonitorSolution {
  private Logger logger;
  
  private IntVar[] vars;
  
  public SolutionFoundMonitor(final IntVar[] vars) {
    Class<? extends SolutionFoundMonitor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
    this.vars = vars;
  }
  
  @Override
  public void onSolution() {
    this.logger.info("Solution found.");
    boolean _notEquals = (!Objects.equal(this.vars, null));
    if (_notEquals) {
      final Tuples tuples = new Tuples(false);
      final Function1<IntVar, Integer> _function = (IntVar it) -> {
        return Integer.valueOf(it.getLB());
      };
      List<Integer> _map = ListExtensions.<IntVar, Integer>map(((List<IntVar>)Conversions.doWrapArray(this.vars)), _function);
      tuples.add(((int[])Conversions.unwrapArray(_map, int.class)));
      IntVar _get = this.vars[0];
      Solver _solver = _get.getSolver();
      Constraint _table = ICF.table(this.vars, tuples, "FC");
      _solver.post(_table);
    }
  }
}

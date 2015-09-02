package ch.hilbri.assist.mapping.tests.misc;

import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor;
import java.util.ArrayList;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.search.loop.ISearchLoop;
import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ChocoSolverTests {
  /**
   * This test fails, because this functionality is still broken in Choco
   * -> posting constraints for valid solutions (in order to get different solutions with restart strategies)
   *    leads to a null pointer error in domWd strategy
   */
  @Test
  public void testDomWD() {
    final Solver solver = new Solver();
    final ArrayList<IntVar> vars = new ArrayList<IntVar>();
    IntVar _integer = VF.integer("Test1", 0, 1, solver);
    vars.add(_integer);
    AbstractStrategy<IntVar> _domOverWDeg = ISF.domOverWDeg(((IntVar[])Conversions.unwrapArray(vars, IntVar.class)), 23432);
    solver.set(_domOverWDeg);
    ISearchLoop _searchLoop = solver.getSearchLoop();
    SolutionFoundMonitor _solutionFoundMonitor = new SolutionFoundMonitor(((IntVar[])Conversions.unwrapArray(vars, IntVar.class)));
    _searchLoop.plugSearchMonitor(_solutionFoundMonitor);
    solver.findAllSolutions();
  }
}

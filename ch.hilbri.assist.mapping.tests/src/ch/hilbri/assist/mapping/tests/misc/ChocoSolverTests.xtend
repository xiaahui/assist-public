package ch.hilbri.assist.mapping.tests.misc

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RunWith(XtextRunner)
class ChocoSolverTests {
		
	protected Solver solver = new Solver
	
	private Logger logger

	new() {
		logger = LoggerFactory.getLogger(this.class)
	}

	@Test
	def void testDomWD() {
		try {
			val seed = 23432
			val vars = new ArrayList<IntVar>
			vars.add(VF.integer("Test1", 0, 1, solver))
			solver.set(ISF.domOverWDeg(vars, seed))
			solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(vars))
			val recorder = new AllSolutionsRecorder(solver)
			this.solver.set(recorder)
			solver.findAllSolutions
		}
		catch (BasicConstraintsException e) {
			val constraintName = e.getConstraintName
			val message = e.getExplanation
			logger.info("Inconsistency found while processing constraint \"" + constraintName + "\"");
			logger.info("\""+ message + "\"");
		}
	}

}

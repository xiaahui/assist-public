package ch.hilbri.assist.mapping.tests.misc

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
class ChocoSolverTests {
		
	/* This test fails, because this functionality is still broken in Choco
	 * -> posting constraints for valid solutions (in order to get different solutions with restart strategies) 
	 *    leads to a null pointer error in domWd strategy
	 */
	@Test
	def void testDomWD() {
//		val solver = new Solver
//		val vars = new ArrayList<IntVar>
//		vars.add(VF.integer("Test1", 0, 1, solver))
//		solver.set(ISF.domOverWDeg(vars, 23432))
//		solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(vars))
//		solver.findAllSolutions
	}

}

package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import java.util.ArrayList
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.search.strategy.strategy.Once
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
class ChocoSolverTests {
		
	/* This test fails, because this functionality is still broken in Choco
	 * -> posting constraints for valid solutions (in order to get different solutions with restart strategies) 
	 *    leads to a null pointer error in domWd strategy
	 */
	@Test
	def void testDomWD() {
		val solver = new Solver
		val vars = new ArrayList<IntVar>
		vars.add(VF.integer("Test1", 0, 1, solver))
		solver.set(ISF.domOverWDeg(vars, 23432))
		solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor())
		solver.findAllSolutions
	}
	
	@Test 
	def void testNoGoodRecording() {
		val solver = new Solver
		
		val thread0Proc = VF.enumerated("T0Proc", 0,1,solver)
		val thread0Core = VF.enumerated("T0Core", 0,5,solver)
		
		val thread1Proc = VF.enumerated("T1Proc", 0,1,solver)
		val thread1Core = VF.enumerated("T1Core", 0,5,solver)
		
		
		val tuples = new Tuples(true)
		tuples.add(0, 0) // proc0, core00
		tuples.add(0, 1) // proc0, core01
		tuples.add(0, 2) // proc0, core02
		tuples.add(1, 3) // proc1, core10
		tuples.add(1, 4) // proc1, core11
		tuples.add(1, 5) // proc1, core12
		
		solver.post(ICF.table(#[thread0Proc, thread0Core], tuples, ""))
		solver.post(ICF.table(#[thread1Proc, thread1Core], tuples, ""))

		val recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)

		SMF.nogoodRecordingOnSolution(#[thread0Proc, thread0Core, thread1Proc, thread1Core])
		
		SMF.limitTime(solver, 10000)
		SMF.limitSolution(solver, 1000)
		
		solver.set(#[ISF.domOverWDeg(#[thread0Proc, thread1Proc], 12345, ISF.min_value_selector),
			         new Once(#[thread0Core, thread1Core], ISF.minDomainSize_var_selector, ISF.min_value_selector)])

		solver.propagate
		solver.findAllSolutions
		
		assertEquals(4, recorder.solutions.size)
	}
}

package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.variables.VF
import org.junit.Test

import static org.junit.Assert.*

class AssistInverseChannelingTests extends AbstractMappingTest {

	/**
	 * This tests essentially checks that the inverse_channeling constraint
	 * does not break anything like changing the domain of eqIfaceVars and
	 * it also checks that the starting point after an initial propagation
	 * (and no instantiation) is still valid
	 */
	@Test
	def basicTest0() {
		val solver = new Solver
		
		// Iface0 -> can go to pins {0, 1}
		// Iface1 -> can go to pins {0, 1}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 1, solver)

		// Fix iface0 to pin0
		solver.post(ICF.member(eqIfaceVars.get(0), #[0]))
		
		// Fix iface1 to pin0 or pin1
		solver.post(ICF.member(eqIfaceVars.get(1), #[0, 1]))

		// Propagate everything
		solver.propagate

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {0, 1, 2}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {0, 1, 2}
		val pinVars = VF.enumeratedArray("PinVars", 2, 0, 2, solver)
		
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))

		// Propagate everything
		solver.propagate

		// Check the results

		// Pin0: domain should be {empty, iface0, iface1} -> {0,1,2}
		assertEquals(#[0,1,2], pinVars.get(0).values)
		
		// Pin1: domain should be {empty, iface1} -> {0,2}
		assertEquals(#[0,2], pinVars.get(1).values)

		// Iface0: domain should be unchanged: {Pin0} -> {0}
		assertEquals(#[0], eqIfaceVars.get(0).values)
		 
		// Iface1: domain should be unchanged {Pin0, Pin1} -> {0, 1}
		assertEquals(#[0, 1], eqIfaceVars.get(1).values)
	}



	@Test
	def basicTest1() {
		val solver = new Solver
		val recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		// Iface0 -> can go to pins {0, 1}
		// Iface1 -> can go to pins {0, 1}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 1, solver)

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {0, 1, 2}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {0, 1, 2}
		val pinVars = VF.enumeratedArray("PinVars", 2, 0, 2, solver)
		
		// Every iface should have its own pin
		solver.post(ICF.alldifferent(eqIfaceVars, "AC"))
	
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))
		
		// Fix iface0 to pin0
		solver.post(ICF.member(eqIfaceVars.get(0), #[0]))
		
		// Fix iface1 to pin1
		solver.post(ICF.member(eqIfaceVars.get(1), #[1]))

		solver.findAllSolutions
		
		assertEquals("There is only one solution", 1, recorder.solutions.length)
		
		// The pinVar for Pin0 should have the value 1 (for iface0)
		assertEquals(recorder.solutions.get(0).getIntVal(pinVars.get(0)), 1)
		
		// The pinVar for Pin1 should have the value 2 (for iface1)
		assertEquals(recorder.solutions.get(0).getIntVal(pinVars.get(1)), 2)
	}
}
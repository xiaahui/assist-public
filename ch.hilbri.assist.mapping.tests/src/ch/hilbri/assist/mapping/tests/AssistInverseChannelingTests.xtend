package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.constraints.choco.ACF
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.variables.VF
import org.junit.Test

import static org.junit.Assert.*

class AssistInverseChannelingTests extends AbstractMappingTest {

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
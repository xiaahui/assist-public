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

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		val pinVars = VF.enumeratedArray("PinVars", 2, -1, 1, solver)
		
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))

		// Propagate everything
		solver.propagate

		// Check the results

		// Pin0: domain should be {iface0} -> {0}
		assertEquals(#[0], pinVars.get(0).values)
		
		// Pin1: domain should be {iface1} -> {1}
		assertEquals(#[1], pinVars.get(1).values)

		// Iface0: domain should be unchanged: {Pin0} -> {0}
		assertEquals(#[0], eqIfaceVars.get(0).values)
		 
		// Iface1: domain should be {Pin1} -> {1}
		assertEquals(#[1], eqIfaceVars.get(1).values)
	}



	@Test
	def basicTest1() {
		val solver = new Solver
		val recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		// Iface0 -> can go to pins {0, 1}
		// Iface1 -> can go to pins {0, 1}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 1, solver)

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		val pinVars = VF.enumeratedArray("PinVars", 2, -1, 1, solver)
		
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
		
		// The pinVar for Pin0 should have the value 0 (for iface0)
		assertEquals(0, recorder.solutions.get(0).getIntVal(pinVars.get(0)))
		
		// The pinVar for Pin1 should have the value 1 (for iface1)
		assertEquals(1, recorder.solutions.get(0).getIntVal(pinVars.get(1)))
	}
	
	/**
	 * This tests checks the propagation from the eqInterface perspective
	 */
	@Test
	def basicTest2() {
		val solver = new Solver
		
		// Iface0 -> can go to pins {0, 1, 2}
		// Iface1 -> can go to pins {0, 1, 2}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 2, solver)

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin2 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		val pinVars = VF.enumeratedArray("PinVars", 3, -1, 1, solver)
		
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))

		// Propagate everything
		solver.propagate

		// Check the results
		assertEquals(#[0,1,2], eqIfaceVars.get(0).values)
		assertEquals(#[0,1,2], eqIfaceVars.get(1).values)
		assertEquals(#[-1,0,1], pinVars.get(0).values)
		assertEquals(#[-1,0,1], pinVars.get(1).values)
		assertEquals(#[-1,0,1], pinVars.get(2).values)
		
		// Check empty pins - fix eqIface to pins 0 or 1; pin2 is empty
		solver.post(ICF.member(eqIfaceVars.get(0), #[0,1]))
		solver.post(ICF.member(eqIfaceVars.get(1), #[0,1]))

		// Propagate everything
		solver.propagate
		
		// Check the results
		assertEquals(#[0,1], 	eqIfaceVars.get(0).values)
		assertEquals(#[0,1], 	eqIfaceVars.get(1).values)
		assertEquals(#[0,1], 	pinVars.get(0).values)
		assertEquals(#[0,1], 	pinVars.get(1).values)
		assertEquals(#[-1], 	pinVars.get(2).values)
		
		// Now we fix an interface to a pin and check whether its 0 state gets removed
		solver.post(ICF.member(eqIfaceVars.get(0), #[0]))
		solver.post(ICF.member(eqIfaceVars.get(1), #[1]))
		
		// Propagate the changes
		solver.propagate

		// Check the results		
		assertEquals(#[0], 	eqIfaceVars.get(0).values)
		assertEquals(#[1], 	eqIfaceVars.get(1).values)
		assertEquals(#[0], 	pinVars.get(0).values)
		assertEquals(#[1], 	pinVars.get(1).values)
		assertEquals(#[-1], 	pinVars.get(2).values)
	}

	/**
	 * This tests checks the propagation from the pin perspective
	 */
	@Test
	def basicTest3() {
		val solver = new Solver
		
		// Iface0 -> can go to pins {0, 1, 2}
		// Iface1 -> can go to pins {0, 1, 2}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 2, solver)

		// Propagate everything
		solver.propagate

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin2 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		val pinVars = VF.enumeratedArray("PinVars", 3, -1, 1, solver)
		
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))

		// Propagate everything
		solver.propagate

		// Check the results
		assertEquals(#[0,1,2], eqIfaceVars.get(0).values)
		assertEquals(#[0,1,2], eqIfaceVars.get(1).values)
		assertEquals(#[-1,0,1], pinVars.get(0).values)
		assertEquals(#[-1,0,1], pinVars.get(1).values)
		assertEquals(#[-1,0,1], pinVars.get(2).values)
		
		// Now we force pin2 (index 2) to be empty
		solver.post(ICF.member(pinVars.get(2), #[-1]))
		solver.propagate
		
		// Check the results
		assertEquals(#[0,1], 	eqIfaceVars.get(0).values)
		assertEquals(#[0,1], 	eqIfaceVars.get(1).values)
		assertEquals(#[0,1], 	pinVars.get(0).values)
		assertEquals(#[0,1],	pinVars.get(1).values)
		assertEquals(#[-1],		pinVars.get(2).values)
		
		// Now we force pin0 to be either empty or host iface1 
		// effect: iface1 can no longer go to pin0 (and pin2 is empty)
		solver.post(ICF.member(pinVars.get(0), #[-1, 1]))
		solver.propagate
		
		// Check the results
		assertEquals(#[1], 		eqIfaceVars.get(0).values) 	// iface0 can only go to pin1 
		assertEquals(#[0],		eqIfaceVars.get(1).values) 	// iface1 can go to both pins
		assertEquals(#[1], 		pinVars.get(0).values)	   	// pin0 can be empty or host iface1
		assertEquals(#[0],		pinVars.get(1).values)     	// pin1 must host iface0
		assertEquals(#[-1], 	pinVars.get(2).values)	   	// pin2 is empty
	}
	
	@Test
	def basicTest4() {
		val solver = new Solver
		
		// Iface0 -> can go to pins {0, 1, 2}
		// Iface1 -> can go to pins {0, 1, 2}
		val eqIfaceVars = VF.enumeratedArray("EqIfaceVars", 2, 0, 2, solver)
		solver.post(ICF.alldifferent(eqIfaceVars, "AC"))

		// Pin0 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin1 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		// Pin2 -> can contain ifaces {0, 1} or nothing --> values {-1, 0, 1}
		val pinVars = VF.enumeratedArray("PinVars", 3, -1, 1, solver)
		
		// Apply the reverse channeling			
		solver.post(ACF.inverse_channeling(eqIfaceVars, pinVars))
		
		// Restrict Iface0 and Iface1 to Pin0 and Pin1
		solver.post(ICF.member(eqIfaceVars.get(0), #[0,1]))
		solver.post(ICF.member(eqIfaceVars.get(1), #[0,1]))
		
		// Propagate everything
		solver.propagate
		
		// Check the pins
		assertEquals(#[0,1], 	pinVars.get(0).values)	   // FIXME: it should know that it can't be empty
		assertEquals(#[0,1],	pinVars.get(1).values)     // FIXME: it should know that it can't be empty
		assertEquals(#[-1],		pinVars.get(2).values)	   
	}	
}
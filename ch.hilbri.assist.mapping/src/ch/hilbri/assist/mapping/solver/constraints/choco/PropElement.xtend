package ch.hilbri.assist.mapping.solver.constraints.choco

import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.constraints.PropagatorPriority
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.util.tools.ArrayUtils
import org.chocosolver.solver.exception.ContradictionException

class PropElement extends Propagator<IntVar> {
	new(IntVar value, int[] table, IntVar index) {
		super(ArrayUtils.toArray(value, index), PropagatorPriority.BINARY, true)
	}
	
	override isEntailed() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override propagate(int evtmask) throws ContradictionException {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
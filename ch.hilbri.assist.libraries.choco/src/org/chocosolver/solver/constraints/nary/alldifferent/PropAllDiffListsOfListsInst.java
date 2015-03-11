package org.chocosolver.solver.constraints.nary.alldifferent;

import java.util.Arrays;
import java.util.List;

import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.util.ESat;

public class PropAllDiffListsOfListsInst extends Propagator<IntVar> {

	public PropAllDiffListsOfListsInst(IntVar[][] variables, IntVar[] flatVariablesList) {
		super(flatVariablesList, PropagatorPriority.UNARY, true);
	}
	
	@Override
	public void propagate(int evtmask) throws ContradictionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ESat isEntailed() {
		// TODO Auto-generated method stub
		return null;
	}

}

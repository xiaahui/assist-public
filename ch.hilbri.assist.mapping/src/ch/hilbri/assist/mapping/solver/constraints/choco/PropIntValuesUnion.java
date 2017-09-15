package ch.hilbri.assist.mapping.solver.constraints.choco;

import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.util.ESat;
import org.chocosolver.util.tools.ArrayUtils;

/**
 * Maintain a link between a integer variable and the union of values taken by
 * an array of integer variables.
 * Inspired by PropSetIntValuesUnion.
 */

public class PropIntValuesUnion extends Propagator<IntVar> {

	public PropIntValuesUnion(IntVar[] X, IntVar union) {
		super(ArrayUtils.append(new IntVar[] { union }, X),
				PropagatorPriority.LINEAR, false);
	}

	@Override
	public void propagate(int evtmask) throws ContradictionException {
		IntVar union = vars[0];
		for (int v = union.getLB(); v <= union.getUB(); v = union.nextValue(v)) {
			int i;
			for (i = 1; i < vars.length; i++) {
				if (vars[i].contains(v)) {
					break;
				}
			}
			if (i == vars.length) {
				union.removeValue(v, this);
			}
		}
		for (int i = 1; i < vars.length; i++) {
			for (int v = vars[i].getLB(); v <= vars[i].getUB(); v = vars[i].nextValue(v)) {
				if (!union.contains(v)) {
					vars[i].removeValue(v, this);
				}
			}
		}
	}

	@Override
	public ESat isEntailed() {
		IntVar union = vars[0];
		int instCount = 0;
		for (int i = 1; i < vars.length; i++) {
			if (vars[i].isInstantiated()) {
				instCount++;
				if (!union.contains(vars[i].getValue())) {
					return ESat.FALSE;
				}
			}
		}
		if (instCount == vars.length - 1) {
			return ESat.TRUE;
		}
		return ESat.UNDEFINED;
	}
}

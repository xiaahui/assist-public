package ch.hilbri.assist.mapping.solver.constraints.choco;

import java.util.Arrays;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.explanations.RuleStore;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.delta.IIntDeltaMonitor;
import org.chocosolver.solver.variables.events.IEventType;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;
import org.chocosolver.util.procedure.UnaryIntProcedure;
import org.chocosolver.util.tools.ArrayUtils;

import gnu.trove.map.hash.THashMap;

@SuppressWarnings("serial")
public class PropInverseChannelAC extends Propagator<IntVar> {

	
	private class RemProc implements UnaryIntProcedure<Integer> {
		private int var;
		
		@Override
		public UnaryIntProcedure<Integer> set(Integer idxVar) {
			this.var = idxVar;
			return this;
		}

		@Override
		public void execute(int val) throws ContradictionException {
			// Removal event for an eqIface variable
			if (var < eqIfaceVarsLength) {
				pinVars[val].removeValue(var+1, aCause);
			} 
			// Removal event for a pin variable
			else {
				// If we just remove the "empty" entry, nothing happens
				if (val != 0) { 
					eqIfaceVars[val-1].removeValue(var - eqIfaceVarsLength, aCause);
				}
			}
		}
	}

	protected int pinVarsLength;
	protected int eqIfaceVarsLength;
	protected IntVar[] eqIfaceVars, pinVars;

	protected RemProc rem_proc;
	protected IIntDeltaMonitor[] idms;

	/**
	 * Constructor
	 * 
	 * @param eqIfaceVars
	 * @param pinVars
	 * 
	 *            FIXME: do not forget the connected pin interfaces
	 */
	public PropInverseChannelAC(IntVar[] eqIfaceVars, IntVar[] pinVars) {

		super(ArrayUtils.append(eqIfaceVars, pinVars), PropagatorPriority.LINEAR, true);

		this.eqIfaceVars = Arrays.copyOfRange(this.vars, 0, eqIfaceVars.length);
		this.pinVars = Arrays.copyOfRange(this.vars, eqIfaceVars.length, vars.length);

		pinVarsLength = pinVars.length;
		eqIfaceVarsLength = eqIfaceVars.length;

		rem_proc = new RemProc();
		this.idms = new IIntDeltaMonitor[this.vars.length];
		for (int i = 0; i < vars.length; i++) {
			idms[i] = this.vars[i].monitorDelta(this);
		}
	}

	/**
	 * Coarse-grained initial propagation
	 */
	@Override
	public void propagate(int evtmask) throws ContradictionException {

		for (int i = 0; i < pinVarsLength; i++) {
			pinVars[i].updateLowerBound(0, aCause);
			// UpperBound: 0 (= empty) plus all interface indices
			pinVars[i].updateUpperBound(eqIfaceVarsLength, aCause);
		}

		for (int i = 0; i < eqIfaceVarsLength; i++) {
			eqIfaceVars[i].updateLowerBound(0, aCause);
			// UpperBound: every interface must go to a pin
			eqIfaceVars[i].updateUpperBound(pinVarsLength - 1, aCause);
		}

		enumeratedFilteringOfPinVars();
		enumeratedFilteringOfEqIfaceVars();

		for (int i = 0; i < vars.length; i++) {
			idms[i].unfreeze();
		}

	}

	/**
	 * Fine-grained propagation - reaction to fine-events
	 */
	@Override
	public void propagate(int varIdx, int mask) throws ContradictionException {
		
		if (IntEventType.isInstantiate(mask)) {
			if (varIdx < eqIfaceVarsLength) {
				// we have an eqIfaceVar that got instantiated
				int eqVarIdx = varIdx;
				int eqVarValue = eqIfaceVars[eqVarIdx].getValue();

				// modify the pinVar accordingly
				IntVar pinVar = pinVars[eqVarValue];
				pinVar.instantiateTo(varIdx + 1, aCause);

				// We do not need to inform all other Pin-Vars
				// that this value is missing, because the allDifferent
				// for all pins in ACF does that job for us already
			} else {
				// we have a pinVar
				int pinVarIdx = varIdx - eqIfaceVarsLength;
				int pinVarValue = pinVars[pinVarIdx].getValue();

				// if that pin is not "unused" then instantiate the interface
				if (pinVarValue > 0) {
					IntVar eqIfaceVar = eqIfaceVars[pinVarValue - 1];
					eqIfaceVar.instantiateTo(pinVarIdx, aCause);
				}

				// We do not need to inform all other EqIface-Vars
				// that this value is missing, because the allDifferent
				// for all eqIfaces does that job for us already
			}
		}

		if (IntEventType.isRemove(mask)) {
			 idms[varIdx].freeze();
		     idms[varIdx].forEachRemVal(rem_proc.set(varIdx));
		     idms[varIdx].unfreeze();
		}
	}

	private void enumeratedFilteringOfEqIfaceVars() throws ContradictionException {
		for (int var = 0; var < eqIfaceVarsLength; var++) {

			int min = eqIfaceVars[var].getLB();
			int max = eqIfaceVars[var].getUB();

			for (int v = min; v <= max; v = eqIfaceVars[var].nextValue(v)) {

				// pinVar values have an offset of 1
				if (!pinVars[v].contains(var + 1)) {
					eqIfaceVars[var].removeValue(v, aCause);
				}
			}
		}
	}

	private void enumeratedFilteringOfPinVars() throws ContradictionException {
		for (int var = 0; var < pinVarsLength; var++) {

			int min = pinVars[var].getLB();
			int max = pinVars[var].getUB();

			for (int v = min; v <= max; v = pinVars[var].nextValue(v)) {

				// skip 0
				if (v == 0)
					continue;

				if (!eqIfaceVars[v - 1].contains(var)) {
					pinVars[var].removeValue(v, aCause);
				}
			}
		}
	}

	@Override
	public ESat isEntailed() {

		boolean allVarsAreInstantiated = true;

		for (int i = 0; i < eqIfaceVarsLength; i++) {

			// If an EqInterface is instantiated,
			// the corresponding pin must be instantiated to that interface
			if (eqIfaceVars[i].isInstantiated() && !pinVars[eqIfaceVars[i].getValue()].isInstantiatedTo(i + 1))
				return ESat.FALSE;

			if (!eqIfaceVars[i].isInstantiated())
				allVarsAreInstantiated = false;
		}

		for (int i = 0; i < pinVarsLength; i++) {

			// If a pinVar is instantiated,
			// the corresponding interface must be instantiated to that pin
			if (pinVars[i].isInstantiated() && !eqIfaceVars[pinVars[i].getValue() - 1].isInstantiatedTo(i))
				return ESat.FALSE;

			if (!pinVars[i].isInstantiated())
				allVarsAreInstantiated = false;
		}

		if (allVarsAreInstantiated)
			return ESat.TRUE;

		return ESat.UNDEFINED;
	}

	@Override
	public String toString() {
		return "Inverse_AC({" + eqIfaceVars[0] + "...}{" + pinVars[0] + "...})";
	}

	@Override
	public void duplicate(Solver solver, THashMap<Object, Object> identitymap) {
		if (!identitymap.containsKey(this)) {
			int size = this.pinVarsLength;
			IntVar[] X = new IntVar[size];
			for (int i = 0; i < size; i++) {
				this.vars[i].duplicate(solver, identitymap);
				X[i] = (IntVar) identitymap.get(this.vars[i]);
			}
			IntVar[] Y = new IntVar[size];
			for (int i = 0; i < size; i++) {
				this.vars[i + pinVarsLength].duplicate(solver, identitymap);
				Y[i] = (IntVar) identitymap.get(this.vars[i + pinVarsLength]);
			}
			identitymap.put(this, new PropInverseChannelAC(X, Y));
		}
	}

	@Override
	public boolean why(RuleStore ruleStore, IntVar var, IEventType evt, int value) {
		boolean nrules = ruleStore.addPropagatorActivationRule(this);
		int idx = 0;
		while (idx < 2 * pinVarsLength && vars[idx] != var) {
			idx++;
		}
		if (!IntEventType.isBound(evt.getMask())) {
			assert evt == IntEventType.REMOVE;
			if (idx < pinVarsLength) {
				nrules |= ruleStore.addRemovalRule(pinVars[value - 0], idx + 0);
			} else {
				idx -= pinVarsLength;
				nrules |= ruleStore.addRemovalRule(eqIfaceVars[value - 0], idx + 0);
			}
		} /*
			 * else { // initial propagation: nothing can be explained }
			 */
		return nrules;
	}

}

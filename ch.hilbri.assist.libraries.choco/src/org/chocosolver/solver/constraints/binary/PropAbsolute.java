/**
 * Copyright (c) 2014,
 *       Charles Prud'homme (TASC, INRIA Rennes, LINA CNRS UMR 6241),
 *       Jean-Guillaume Fages (COSLING S.A.S.).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.chocosolver.solver.constraints.binary;

import gnu.trove.map.hash.THashMap;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.explanations.*;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.delta.IIntDeltaMonitor;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;
import org.chocosolver.util.procedure.UnaryIntProcedure;
import org.chocosolver.util.tools.ArrayUtils;

/**
 * Enforces X = |Y|
 * <br/>
 *
 * @author Charles Prud'homme
 * @author Jean-Guillaume Fages
 * @since 18/05/11
 */
public class PropAbsolute extends Propagator<IntVar> {

    protected RemProc rem_proc;
    protected IIntDeltaMonitor[] idms;
    protected IntVar X, Y;
    protected boolean bothEnumerated;

    public PropAbsolute(IntVar X, IntVar Y) {
        super(ArrayUtils.toArray(X, Y), PropagatorPriority.BINARY, true);
        this.X = vars[0];
        this.Y = vars[1];
        bothEnumerated = X.hasEnumeratedDomain() && Y.hasEnumeratedDomain();
        if (bothEnumerated) {
            rem_proc = new RemProc();
            this.idms = new IIntDeltaMonitor[this.vars.length];
            for (int i = 0; i < this.vars.length; i++) {
                idms[i] = vars[i].hasEnumeratedDomain() ? this.vars[i].monitorDelta(this) : IIntDeltaMonitor.Default.NONE;
            }
        }
    }

    @Override
    public int getPropagationConditions(int vIdx) {
        if (bothEnumerated) {
            return IntEventType.all();
        } else {
            return IntEventType.boundAndInst();
        }
    }

    @Override
    public ESat isEntailed() {
        if (vars[0].getUB() < 0) {
            return ESat.FALSE;
        } else if (vars[0].isInstantiated()) {
            if (vars[1].isInstantiated()) {
                return ESat.eval(vars[0].getValue() == Math.abs(vars[1].getValue()));
            } else if (vars[1].getDomainSize() == 2 &&
                    vars[1].contains(vars[0].getValue()) &&
                    vars[1].contains(-vars[0].getValue())) {
                return ESat.TRUE;
            } else if (!vars[1].contains(vars[0].getValue()) &&
                    !vars[1].contains(-vars[0].getValue())) {
                return ESat.FALSE;
            } else {
                return ESat.UNDEFINED;
            }
        } else {
            return ESat.UNDEFINED;
        }
    }

    @Override
    public String toString() {
        return String.format("%s = |%s|", vars[0].toString(), vars[1].toString());
    }

    //***********************************************************************************
    // FILTERING
    //***********************************************************************************

    @Override
    public void propagate(int evtmask) throws ContradictionException {
        X.updateLowerBound(0, aCause);
        setBounds();
        if (bothEnumerated) {
            enumeratedFiltering();
            idms[0].unfreeze();
            idms[1].unfreeze();
        }
    }

    @Override
    public void propagate(int varIdx, int mask) throws ContradictionException {
        if (bothEnumerated) {
            idms[varIdx].freeze();
            idms[varIdx].forEachRemVal(rem_proc.set(varIdx));
            idms[varIdx].unfreeze();
        } else {
            setBounds();
        }
    }

    private void setBounds() throws ContradictionException {
        // X = |Y|
        int max = X.getUB();
        int min = X.getLB();
        Y.updateUpperBound(max, aCause);
        Y.updateLowerBound(-max, aCause);
        Y.removeInterval(1 - min, min - 1, aCause);
        /////////////////////////////////////////////////
        int prevLB = X.getLB();
        int prevUB = X.getUB();
        min = Y.getLB();
        max = Y.getUB();
        if (max <= 0) {
            X.updateLowerBound(-max, aCause);
            X.updateUpperBound(-min, aCause);
        } else if (min >= 0) {
            X.updateLowerBound(min, aCause);
            X.updateUpperBound(max, aCause);
        } else {
            if (Y.hasEnumeratedDomain()) {
                int mP = Y.nextValue(-1);
                int mN = -Y.previousValue(1);
                X.updateLowerBound(Math.min(mP, mN), aCause);
            }
            X.updateUpperBound(Math.max(-min, max), aCause);
        }
        if (prevLB != X.getLB() || prevUB != X.getUB()) setBounds();
    }

    private void enumeratedFiltering() throws ContradictionException {
        int min = X.getLB();
        int max = X.getUB();
        for (int v = min; v <= max; v = X.nextValue(v)) {
            if (!(Y.contains(v) || Y.contains(-v))) {
                X.removeValue(v, aCause);
            }
        }
        min = Y.getLB();
        max = Y.getUB();
        for (int v = min; v <= max; v = Y.nextValue(v)) {
            if (!(X.contains(Math.abs(v)))) {
                Y.removeValue(v, aCause);
            }
        }
    }

    private class RemProc implements UnaryIntProcedure<Integer> {
        private int var;

        @Override
        public UnaryIntProcedure set(Integer idxVar) {
            this.var = idxVar;
            return this;
        }

        @Override
        public void execute(int val) throws ContradictionException {
            if (var == 0) {
                vars[1].removeValue(val, aCause);
                vars[1].removeValue(-val, aCause);
            } else {
                if (!vars[1].contains(-val))
                    vars[0].removeValue(Math.abs(val), aCause);
            }
        }
    }

    //***********************************************************************************
    // EXPLANATIONS
    //***********************************************************************************

    @Override
    public void explain(ExplanationEngine xengine, Deduction d, Explanation e) {
        if (d.getVar() == vars[0]) {
            e.add(xengine.getPropagatorActivation(this));
            if (d.getmType() == Deduction.Type.ValRem) {
                vars[1].explain(xengine, VariableState.REM, ((ValueRemoval) d).getVal(), e);
                vars[1].explain(xengine, VariableState.REM, -((ValueRemoval) d).getVal(), e);
            } else {
                throw new UnsupportedOperationException("PropAbsolute only knows how to explain ValueRemovals");
            }
        } else if (d.getVar() == vars[1]) {
            e.add(xengine.getPropagatorActivation(this));
            if (d.getmType() == Deduction.Type.ValRem) {
                vars[0].explain(xengine, VariableState.REM, Math.abs(((ValueRemoval) d).getVal()), e);
            } else {
                throw new UnsupportedOperationException("PropAbsolute only knows how to explain ValueRemovals");
            }
        } else {
            super.explain(xengine, d, e);
        }
    }

    @Override
    public void duplicate(Solver solver, THashMap<Object, Object> identitymap) {
        if (!identitymap.containsKey(this)) {
            this.vars[0].duplicate(solver, identitymap);
            IntVar X = (IntVar) identitymap.get(this.vars[0]);
            this.vars[1].duplicate(solver, identitymap);
            IntVar Y = (IntVar) identitymap.get(this.vars[1]);

            identitymap.put(this, new PropAbsolute(X, Y));
        }
    }
}

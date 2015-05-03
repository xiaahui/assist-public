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
package org.chocosolver.solver.constraints.ternary;

import gnu.trove.map.hash.THashMap;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;

/**
 * X = MAX(Y,Z)
 * <br/>
 * ensures bound consistency
 *
 * @author Charles Prud'homme
 * @since 19/04/11
 */
public class PropMaxBC extends Propagator<IntVar> {

    IntVar MAX, v1, v2;

    public PropMaxBC(IntVar X, IntVar Y, IntVar Z) {
        super(new IntVar[]{X, Y, Z}, PropagatorPriority.TERNARY, true);
        this.MAX = vars[0];
        this.v1 = vars[1];
        this.v2 = vars[2];
    }

    @Override
    public int getPropagationConditions(int vIdx) {
        return IntEventType.boundAndInst();
    }

    @Override
    public void propagate(int evtmask) throws ContradictionException {
        filter();
    }


    @Override
    public void propagate(int varIdx, int mask) throws ContradictionException {
        propagate(0);
    }

    private void filter() throws ContradictionException {
        int c = 0;
        c += (vars[0].isInstantiated() ? 1 : 0);
        c += (vars[1].isInstantiated() ? 2 : 0);
        c += (vars[2].isInstantiated() ? 4 : 0);
        switch (c) {
            case 7: // everything is instantiated
            case 6:// Z and Y are instantiated
                vars[0].instantiateTo(Math.max(vars[1].getValue(), vars[2].getValue()), aCause);
                setPassive();
                break;
            case 5: //  X and Z are instantiated
            {
                int max = vars[0].getValue();
                int val2 = vars[2].getValue();
                if (max > val2) {
                    vars[1].instantiateTo(max, aCause);
                    setPassive();
                } else if (max < val2) {
                    contradiction(vars[2], "wrong max selected");
                } else { // X = Z
                    vars[1].updateUpperBound(max, aCause);
                }
            }
            break;
            case 4: // Z is instantiated
            {
                int val = vars[2].getValue();
                if (val > vars[1].getUB()) { // => X = Z
                    vars[0].instantiateTo(val, aCause);
                    setPassive();
                } else {
                    _filter();
                }
            }
            break;
            case 3://  X and Y are instantiated
            {
                int max = vars[0].getValue();
                int val1 = vars[1].getValue();
                if (max > val1) {
                    vars[2].instantiateTo(max, aCause);
                    setPassive();
                } else if (max < val1) {
                    contradiction(vars[1], "");
                } else { // X = Y
                    vars[2].updateUpperBound(max, aCause);
                }
            }
            break;
            case 2: // Y is instantiated
            {
                int val = vars[1].getValue();
                if (val > vars[2].getUB()) { // => X = Y
                    vars[0].instantiateTo(val, aCause);
                    setPassive();
                } else { // val in Z
                    _filter();
                }
            }
            break;
            case 1: // X is instantiated
            {
                int max = vars[0].getValue();
                if (!vars[1].contains(max) && !vars[2].contains(max)) {
                    contradiction(vars[0], null);
                }
                if (vars[1].getUB() < max) {
                    vars[2].instantiateTo(max, aCause);
                    setPassive();
                } else if (vars[2].getUB() < max) {
                    vars[1].instantiateTo(max, aCause);
                    setPassive();
                } else {
                    if (vars[1].updateUpperBound(max, aCause) | vars[2].updateUpperBound(max, aCause)) {
                        filter(); // to ensure idempotency for "free"
                    }
                }
            }

            break;
            case 0: // otherwise
                _filter();
                break;
        }
    }

    private void _filter() throws ContradictionException {
        boolean change;
        do {
            change = vars[0].updateLowerBound(Math.max(vars[1].getLB(), vars[2].getLB()), aCause);
            change |= vars[0].updateUpperBound(Math.max(vars[1].getUB(), vars[2].getUB()), aCause);
            change |= vars[1].updateUpperBound(vars[0].getUB(), aCause);
            change |= vars[2].updateUpperBound(vars[0].getUB(), aCause);
            if (vars[2].getUB() < vars[0].getLB()) {
                change |= vars[1].updateLowerBound(vars[0].getLB(), aCause);
            }
            if (vars[1].getUB() < vars[0].getLB()) {
                change |= vars[2].updateLowerBound(vars[0].getLB(), aCause);
            }
        } while (change);
    }

    @Override
    public ESat isEntailed() {
        if (isCompletelyInstantiated()) {
            if (MAX.getValue() != Math.max(v1.getValue(), v2.getValue())) {
                return ESat.FALSE;
            } else {
                return ESat.TRUE;
            }
        }
        return ESat.UNDEFINED;
    }

    @Override
    public String toString() {
        return MAX.toString() + ".MAX(" + v1.toString() + "," + v2.toString() + ")";
    }

    @Override
    public void duplicate(Solver solver, THashMap<Object, Object> identitymap) {
        if (!identitymap.containsKey(this)) {
            this.vars[0].duplicate(solver, identitymap);
            IntVar X = (IntVar) identitymap.get(this.vars[0]);
            this.vars[1].duplicate(solver, identitymap);
            IntVar Y = (IntVar) identitymap.get(this.vars[1]);
            this.vars[2].duplicate(solver, identitymap);
            IntVar Z = (IntVar) identitymap.get(this.vars[2]);

            identitymap.put(this, new PropMaxBC(X, Y, Z));
        }
    }
}

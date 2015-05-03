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
package org.chocosolver.solver.constraints.nary.nogood;

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.explanations.*;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.events.IntEventType;
import org.chocosolver.util.ESat;
import org.chocosolver.util.objects.queues.CircularQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * A propagator for the specific Nogood store designed to store ONLY positive decisions.
 * <p/>
 * Related to "Nogood Recording from Restarts", C. Lecoutre et al.
 * <br/>
 *
 * @author Charles Prud'homme
 * @since 20/06/13
 */
public class PropNogoodStore extends Propagator<IntVar> {

    List<INogood> units;
    List<INogood> allnogoods;
    TIntObjectHashMap<TIntList> vars2nogood;
    TIntObjectHashMap<TIntList> vars2idxinng;
    CircularQueue<IntVar> hasChanged;

    public PropNogoodStore(IntVar[] vars) {
        super(vars, PropagatorPriority.VERY_SLOW, true);
        vars2nogood = new TIntObjectHashMap<>();
        vars2idxinng = new TIntObjectHashMap<>();
        allnogoods = new ArrayList<>();
        units = new ArrayList<>();
        hasChanged = new CircularQueue<>(8);
    }

    @Override
    public boolean advise(int idxVarInProp, int mask) {
        return super.advise(idxVarInProp, mask) && vars2nogood.get(vars[idxVarInProp].getId()) != null;
    }

    @Override
    public int getPropagationConditions(int vIdx) {
        return IntEventType.instantiation();
    }

    @Override
    public void propagate(int evtmask) throws ContradictionException {
        for (INogood ng : allnogoods) {
            ng.propagate(this);
        }
    }

    @Override
    public void propagate(int idxVarInProp, int mask) throws ContradictionException {
        hasChanged.clear();
        hasChanged.addLast(vars[idxVarInProp]);
        while (!hasChanged.isEmpty()) {
            IntVar var = hasChanged.pollFirst();
            TIntList nogoods = vars2nogood.get(var.getId());
            TIntList indices = vars2idxinng.get(var.getId());
            for (int i = 0; i < nogoods.size(); i++) {
                INogood ng = allnogoods.get(nogoods.get(i));
                int idx = ng.awakeOnInst(indices.get(i), this);
                if (idx > -1) {
                    hasChanged.addLast(ng.getVar(idx));
                } else if (idx == -99) { // a call to unwatch has been done!
                    i--;
                } else {
                    assert ng.isEntailed() != ESat.FALSE;
                }
            }
        }
    }


    public void unitPropagation() throws ContradictionException {
        for (INogood ng : units) {
            ng.propagate(this);
        }
    }


    @Override
    public ESat isEntailed() {
        for (INogood ng : allnogoods) {
            ESat sat = ng.isEntailed();
            if (!sat.equals(ESat.TRUE)) {
                return sat;
            }
        }
        return ESat.TRUE;
    }

    @Override
    public void explain(ExplanationEngine xengine, Deduction d, Explanation e) {
        e.add(xengine.getPropagatorActivation(this));
        if (d != null && d.getmType() == Deduction.Type.ValRem) {
            ValueRemoval vr = (ValueRemoval) d;
            IntVar var = (IntVar) vr.getVar();
            int val = vr.getVal();
            TIntList nogoods = vars2nogood.get(var.getId());
            TIntList indices = vars2idxinng.get(var.getId());
            for (int i = 0; i < nogoods.size(); i++) {
                INogood ng = allnogoods.get(nogoods.get(i));
                int idx = indices.get(i);
                if (val == ng.getVal(idx)) {
                    for (int j = 0; j < ng.size(); j++) {
                        if (ng.getVar(j) != var) {
//                            ng.getVar(j).explain(VariableState.REM, ng.getVal(j), e);
                            ng.getVar(j).explain(xengine, VariableState.DOM, e);
                        }
                    }
                }
            }
        } else {
            super.explain(xengine, d, e);
        }
    }

    ///*****************************************************************************************************************
    ///  DEDICATED TO NOGOOD RECORDING *********************************************************************************
    ///*****************************************************************************************************************

    public void addNogood(INogood ng) throws ContradictionException {
        if (ng.isUnit()) {
            units.add(ng);
        }
        int ngidx = allnogoods.size();
        allnogoods.add(ng);
        ng.setIdx(ngidx);
        hasChanged.clear();
        int idx = ng.propagate(this);
        if (idx > -1) {
            hasChanged.addLast(ng.getVar(idx));
        }
        while (!hasChanged.isEmpty()) {
            IntVar var = hasChanged.pollFirst();
            TIntList nogoods = vars2nogood.get(var.getId());
            TIntList indices = vars2idxinng.get(var.getId());
            for (int i = 0; i < nogoods.size(); i++) {
                ng = allnogoods.get(nogoods.get(i));
                idx = ng.awakeOnInst(indices.get(i), this);
                if (idx > -1) {
                    hasChanged.addLast(ng.getVar(idx));
                } else {
                    assert ng.isEntailed() != ESat.FALSE;
                }
            }
        }
    }

    public void watch(IntVar var, Nogood ng, int idxInNG) {
        TIntList nogoods = vars2nogood.get(var.getId());
        if (nogoods == null) {
            nogoods = new TIntArrayList();
            vars2nogood.put(var.getId(), nogoods);
        }
        nogoods.add(ng.getIdx());
        TIntList indices = vars2idxinng.get(var.getId());
        if (indices == null) {
            indices = new TIntArrayList();
            vars2idxinng.put(var.getId(), indices);
        }
        indices.add(idxInNG);
    }

    public void unwatch(IntVar var, Nogood ng) {
        TIntList nogoods = vars2nogood.get(var.getId());
        if (nogoods != null) {
            int ni = nogoods.indexOf(ng.getIdx());
            if (ni > -1) {
                nogoods.removeAt(ni);
                TIntList indices = vars2idxinng.get(var.getId());
                indices.removeAt(ni);
            }
        }
    }
}

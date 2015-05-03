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
package org.chocosolver.solver.explanations;

import gnu.trove.set.hash.TIntHashSet;

import java.util.ArrayList;
import java.util.List;

/**
 * An explanation is the combination of two sets: a set of deduction and a set of propagators.
 * The deductions are stored in a list, and the uniqueness of elements is ensured during the add operation.
 * This allows fast iteration over elements.
 * The propagators are stored in the same way.
 * <p>
 * Created by IntelliJ IDEA.
 * User: njussien
 * Date: 26 oct. 2010
 * Time: 12:54:50
 * An explanation
 */

public class Explanation extends Deduction {
    public static ThreadLocal<Explanation> SYSTEM = new ThreadLocal<Explanation>() {
        @Override
        protected Explanation initialValue() {
            return new Explanation();
        }
    };

    private List<Deduction> deductions;
    private TIntHashSet did;

    public Explanation() {
        super(Type.Exp);
    }


    /**
     * Add a new explanation to this.
     * Extract the deductions and the propagators from expl, and add them to this.
     *
     * @param expl explanation to add
     */
    public void add(Explanation expl) {
        int nbd = expl.nbDeductions();
        if (nbd > 0) {
            // 1. add all deductions of expl
            for (int i = 0; i < nbd; i++) {
                add(expl.getDeduction(i));
            }
        }
    }

    /**
     * Add a new deduction to the set of deductions of this
     *
     * @param d deduction to add
     */
    public void add(Deduction d) {
        if (d.mType == Type.Exp) {
            add((Explanation) d);
        } else {
            if (d.getmType() == Type.PropAct) {
                PropagatorActivation pa = (PropagatorActivation) d;
                if (pa.getPropagator().isReifiedAndSilent()) {
                    throw new UnsupportedOperationException();
                }
            }

            if (this.deductions == null) {
                this.deductions = new ArrayList<>(4);
                this.did = new TIntHashSet();
            }
            if (this.did.add(d.id)) {
                this.deductions.add(d);
            }
        }
    }

    /**
     * Remove a deduction from the set of deductions of this.
     *
     * @param d deduction to remove
     */
    public void remove(Deduction d) {
        this.deductions.remove(d);
        this.did.remove(d.id);
    }


    public boolean contain(Deduction d) {
        return deductions != null && did.contains(d.id);
    }

    /**
     * Reset internal strucutre, forget all deductions and propagators.
     */
    public void reset() {
        if (this.deductions != null) {
            this.deductions.clear();
            this.did.clear();
        }
    }

    /**
     * Return the size of deduction set
     *
     * @return number of deductions
     */
    public int nbDeductions() {
        return deductions == null ? 0 : deductions.size();
    }

    /**
     * Return the i^th deduction contains in this.
     * Deductions are stored in a list, their uniqueness is ensured during the add operation.
     * This allows simple iteration over deductions of an explanation.
     *
     * @param i index of the deduction
     * @return the deduction at rank i
     */
    public Deduction getDeduction(int i) {
        return deductions.get(i);
    }


    @Override
    public String toString() {
        StringBuilder bf = new StringBuilder("E_" + id);


        bf.append(" D: ");
        if (this.deductions != null && !this.deductions.isEmpty()) {
            bf.append("(").append(this.deductions.size()).append(") ");
            for (Deduction d : this.deductions) {
                bf.append(d).append(", ");
            }
            if (deductions.size() > 1) {
                bf.delete(bf.lastIndexOf(","), bf.length() - 1);
            }
        }

        bf.append(" ;");
        return bf.toString();
    }
}

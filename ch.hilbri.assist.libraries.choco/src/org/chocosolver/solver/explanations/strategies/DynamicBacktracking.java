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
package org.chocosolver.solver.explanations.strategies;

import org.chocosolver.solver.ICause;
import org.chocosolver.solver.explanations.BranchingDecision;
import org.chocosolver.solver.explanations.Deduction;
import org.chocosolver.solver.explanations.Explanation;
import org.chocosolver.solver.explanations.ExplanationEngine;
import org.chocosolver.solver.search.strategy.decision.Decision;
import org.chocosolver.solver.search.strategy.decision.RootDecision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A dynamic backtracking algorithm.
 * <br/>
 *
 * @author Charles Prud'homme
 * @since 01/10/12
 */
public class DynamicBacktracking extends ConflictBasedBackjumping {

    static Logger LOGGER = LoggerFactory.getLogger(DynamicBacktracking.class);

    DecisionsSet cobdec;

    public DynamicBacktracking(ExplanationEngine mExplanationEngine) {
        super(mExplanationEngine);
        cobdec = new DecisionsSet(this);
    }

    protected void updateVRExplainUponbacktracking(int nworld, Explanation expl, ICause cause) {
        if (cause == mSolver.getObjectiveManager()) {
            super.updateVRExplainUponbacktracking(nworld, expl, cause);
        }
        cobdec.clearDecisionPath();

        // preliminary : compute where to jump back
        Decision dec = mSolver.getSearchLoop().getLastDecision(); // the current decision to undo
        int myworld = nworld;
        while (dec != RootDecision.ROOT && myworld > 1) {
            dec = dec.getPrevious();
            myworld--;
        }
        Decision jmpBck = dec;
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("::EXPL:: WILL BACKTRACK on " + dec /*+ " (up to " + nworld + " level(s))"*/);
        }

        // now we can explicitly enforce the jump
        dec = mSolver.getSearchLoop().getLastDecision(); // the current decision to undo
        while (dec != RootDecision.ROOT && nworld > 1) {

            if (!dec.hasNext()) {
                // on a right branch, necessarily have an explanation (it is a refutation)

                if (!mExplanationEngine.flatten(dec.getNegativeDeduction(mExplanationEngine)).contain(jmpBck.getPositiveDeduction(mExplanationEngine))) {
                    // everything is fine ... this refutation does not depend on what we are reconsidering
                    // set it as non activated and
                    dec.rewind();
                    dec.buildNext();
                    // add it to the decisions to force
                    cobdec.push(dec);

                }
                // else  we need to forget everything and start from scratch on this decision
                // so nothing to be done
            } else {
                // on a left branch, we need to keep things as is (a left branch can not depend from anything, it is always a willful decision
                dec.rewind();
                cobdec.push(dec);
            }

            // get the previous
            dec = dec.getPrevious();
            nworld--;
        }
        if (dec != RootDecision.ROOT) {
            if (!dec.hasNext()) {
                throw new UnsupportedOperationException("DynamicBacktracking.updatVRExplain should get to a POSITIVE decision");
            }
            cobdec.setDecisionToRefute(dec);
            Deduction left = dec.getPositiveDeduction(mExplanationEngine);
            expl.remove(left);
            assert left.getmType() == Deduction.Type.DecLeft;
            BranchingDecision va = (BranchingDecision) left;
            mExplanationEngine.removeLeftDecisionFrom(va.getDecision(), va.getVar());

            Deduction right = dec.getNegativeDeduction(mExplanationEngine);
            mExplanationEngine.store(right, mExplanationEngine.flatten(expl));

            mSolver.getSearchLoop().setLastDecision(cobdec);
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("::EXPL:: BACKTRACK on " + dec /*+ " (up to " + nworld + " level(s))"*/);
        }
    }


}

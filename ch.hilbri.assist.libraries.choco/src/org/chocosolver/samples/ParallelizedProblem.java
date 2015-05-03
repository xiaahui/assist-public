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
/**
 * Created by IntelliJ IDEA.
 * User: Jean-Guillaume Fages
 * Date: 18/09/13
 * Time: 23:52
 */

package org.chocosolver.samples;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.propagation.hardcoded.TwoBucketPropagationEngine;
import org.chocosolver.solver.trace.Chatterbox;

public abstract class ParallelizedProblem extends AbstractProblem {

    protected int searchIdx;

    public ParallelizedProblem(int searchIdx) {
        super();
        this.searchIdx = searchIdx;
        // abstract execution methods
        this.printDescription();
        this.createSolver();
        this.buildModel();
        this.configureSearch();
        overrideExplanation();
        solver.set(new TwoBucketPropagationEngine(solver));
        if (level.getLevel() > Level.SILENT.getLevel()) {
            Chatterbox.showStatistics(solver);
            if (level.getLevel() > Level.VERBOSE.getLevel()) Chatterbox.showSolutions(solver);
            if (level.getLevel() > Level.SOLUTION.getLevel()) Chatterbox.showDecisions(solver);
        }
    }

    @Override
    public void createSolver() {
        solver = new Solver();
    }
}

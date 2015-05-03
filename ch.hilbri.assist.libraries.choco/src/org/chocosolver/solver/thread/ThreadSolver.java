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
package org.chocosolver.solver.thread;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.objective.ObjectiveManager;
import org.chocosolver.solver.propagation.NoPropagationEngine;
import org.chocosolver.solver.propagation.hardcoded.TwoBucketPropagationEngine;
import org.chocosolver.solver.variables.IntVar;

/**
 * <br/>
 *
 * @author Charles Prud'homme
 * @since 6 oct. 2010
 */
public class ThreadSolver extends Thread {

    public Solver solver;

    private long creationTime;

    private boolean saf = true;


    public ThreadSolver(Solver solver) {
        this.creationTime -= System.nanoTime();
        this.solver = solver;
    }

    public Solver getSolver() {
        return solver;
    }

    @Override
    public void run() {
        if (solver.getEngine() == NoPropagationEngine.SINGLETON) {
            solver.set(new TwoBucketPropagationEngine(solver));
        }
        solver.getMeasures().setReadingTimeCount(creationTime + System.nanoTime());
        solver.getSearchLoop().launch(saf);
    }

    public void findSolution() {
		solver.set(ObjectiveManager.SAT());
        this.saf = true;
        start();
    }

    public void findAllSolutions() {
        solver.set(ObjectiveManager.SAT());
        this.saf = false;
        start();
    }

    public void findOptimalSolution(ResolutionPolicy policy, IntVar objective) {
        if (policy == ResolutionPolicy.SATISFACTION) {
            throw new UnsupportedOperationException("cannot optimize a satisfaction problem!");
        }
        this.saf = false;
        solver.set(new ObjectiveManager<IntVar,Integer>(objective, policy, true));
        start();
    }

}

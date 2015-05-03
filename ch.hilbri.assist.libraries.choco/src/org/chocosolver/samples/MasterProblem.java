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
 * Time: 22:59
 */

package org.chocosolver.samples;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.thread.AbstractParallelMaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import static org.chocosolver.solver.ResolutionPolicy.SATISFACTION;

public class MasterProblem extends AbstractParallelMaster<SlaveProblem> {

    //***********************************************************************************
    // VARIABLES
    //***********************************************************************************

    //***********************************************************************************

    protected static final Logger LOGGER = LoggerFactory.getLogger(MasterProblem.class);
    int bestVal;
    int nbSol;
    boolean closeWithSuccess;
    ResolutionPolicy policy;

    //***********************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************

    /**
     * @param probClassName class name of the ParallelizedProblem to solve
     * @param nbThreads     number of threads to use
     */
    public MasterProblem(final String probClassName, int nbThreads) {
        slaves = new SlaveProblem[nbThreads];
        for (int i = 0; i < nbThreads; i++) {
            slaves[i] = new SlaveProblem(probClassName, this, i);
            slaves[i].workInParallel();
        }
        wait = true;
        try {
            while (wait)
                sleep(20);
        } catch (Exception e) {
            e.printStackTrace();
            exit(0);
        }
    }

    //***********************************************************************************
    // METHODS
    //***********************************************************************************

    /**
     * A slave has CLOSED ITS SEARCH TREE, every one should stop!
     */
    public synchronized void wishGranted() {
        if (LOGGER.isInfoEnabled()) {
            if (nbSol == 0) {
                if (!closeWithSuccess) {
                    LOGGER.info("=====UNKNOWN=====");
                } else {
                    LOGGER.info("=====UNSATISFIABLE=====");
                }
            } else {
                if (!closeWithSuccess && (policy != null && policy != SATISFACTION)) {
                    LOGGER.info("=====UNBOUNDED=====");
                } else {
                    LOGGER.info("==========");
                }
            }
        }
        Number[] nbs = slaves[0].solver.getMeasures().toArray();
        nbs[0] = nbSol;
        nbs[5] = policy != SATISFACTION ? bestVal : 0;
        exit(0);
    }

    /**
     * A solution of cost val has been found
     * informs slaves that they must find better
     */
    public synchronized boolean newSol(int val, ResolutionPolicy policy) {
        this.policy = policy;
        if (nbSol == 0) {
            bestVal = val;
        }
        nbSol++;
        boolean isBetter = false;
        switch (policy) {
            case MINIMIZE:
                if (bestVal > val || nbSol == 1) {
                    bestVal = val;
                    isBetter = true;
                }
                break;
            case MAXIMIZE:
                if (bestVal < val || nbSol == 1) {
                    bestVal = val;
                    isBetter = true;
                }
                break;
            case SATISFACTION:
                bestVal = 1;
                isBetter = nbSol == 1;
                break;
        }
        if (isBetter) {
            for (int i = 0; i < slaves.length; i++) {
                if (slaves[i] != null) {
                    slaves[i].findBetterThan(val, policy);
                }
            }
        }
        return isBetter;
    }

    public synchronized void closeWithSuccess() {
        this.closeWithSuccess = true;
    }
}

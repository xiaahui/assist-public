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
 * Time: 23:06
 */

package org.chocosolver.samples;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.objective.ObjectiveManager;
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution;
import org.chocosolver.solver.thread.AbstractParallelSlave;

import java.lang.reflect.InvocationTargetException;

public class SlaveProblem extends AbstractParallelSlave<MasterProblem> {

    //***********************************************************************************
    // VARIABLES
    //***********************************************************************************

    Solver solver;
    ParallelizedProblem model;

    //***********************************************************************************
    // CONSTRUCTORS
    //***********************************************************************************

    public SlaveProblem(final String probClassName, final MasterProblem master, final int id) {
        super(master, id);
        try {
            model = (ParallelizedProblem) Class.forName(probClassName).getDeclaredConstructors()[0].newInstance(id);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    //***********************************************************************************
    // METHODS
    //***********************************************************************************

    @Override
    public void work() {
        try {
            // plug monitor to communicate bounds (should not be added in the sequential phasis)
            solver = model.getSolver();

            // communication
            solver.plugMonitor((IMonitorSolution) () -> {
                ObjectiveManager om = solver.getSearchLoop().getObjectiveManager();
                int val = om.getPolicy() == ResolutionPolicy.SATISFACTION ? 1 : om.getBestSolutionValue().intValue();
                master.newSol(val, om.getPolicy());
            });

            model.solve();
            if (!solver.hasReachedLimit()) {
                master.closeWithSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void findBetterThan(int val, ResolutionPolicy policy) {
        if (solver == null) return;// can happen if a solution is found before this thread is fully ready
        ObjectiveManager iom = solver.getSearchLoop().getObjectiveManager();
        if (iom == null) return;// can happen if a solution is found before this thread is fully ready
        switch (policy) {
            case MAXIMIZE:
                iom.updateBestLB(val);
                break;
            case MINIMIZE:
                iom.updateBestUB(val);
                break;
            case SATISFACTION:
                // nothing to do
                break;
        }
    }
}

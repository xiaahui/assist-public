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
package org.chocosolver.solver.search.bind;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.SetStrategyFactory;
import org.chocosolver.solver.search.strategy.selectors.values.RealDomainMiddle;
import org.chocosolver.solver.search.strategy.selectors.variables.Cyclic;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.search.strategy.strategy.RealStrategy;
import org.chocosolver.solver.variables.*;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * A search binder, which configures but not overrides, a search strategy if none is defined.
 * The method is called after the initial propagation step, for single solver.
 * <br/>
 *
 * @author Charles Prud'homme
 * @version choco
 * @since 23/10/14
 */
public class DefaultSearchBinder implements ISearchBinder {

    @Override
    public void configureSearch(Solver solver) {
        LoggerFactory.getLogger(ISearchBinder.class).warn("No search strategies defined");
        LoggerFactory.getLogger(ISearchBinder.class).warn("Set to default ones");

        AbstractStrategy[] strats = new AbstractStrategy[5];
        int nb = 0;

        // INTEGER VARIABLES DEFAULT SEARCH STRATEGY
        IntVar[] ivars = excludeConstants(solver.retrieveIntVars());
        if (ivars.length > 0) {
            strats[nb++] = ISF.minDom_LB(ivars);
        }

        // BOOLEAN VARIABLES DEFAULT SEARCH STRATEGY
        BoolVar[] bvars = excludeConstants(solver.retrieveBoolVars());
        if (bvars.length > 0) {
            strats[nb++] = ISF.lexico_UB(bvars);
        }

        // SET VARIABLES DEFAULT SEARCH STRATEGY
        SetVar[] svars = excludeConstants(solver.retrieveSetVars());
        if (svars.length > 0) {
            strats[nb++] = SetStrategyFactory.force_minDelta_first(svars);
        }

        // REAL VARIABLES DEFAULT SEARCH STRATEGY
        RealVar[] rvars = excludeConstants(solver.retrieveRealVars());
        if (rvars.length > 0) {
            strats[nb] = new RealStrategy(rvars, new Cyclic(), new RealDomainMiddle());
        }

        if (nb == 0) {
            // simply to avoid null pointers in case all variables are instantiated
            solver.set(ISF.minDom_LB(solver.ONE));
        } else {
            solver.set(Arrays.copyOf(strats, nb));
        }
    }

    @SuppressWarnings("unchecked")
    private static <V extends Variable> V[] excludeConstants(V[] vars) {
        int nb = 0;
        for (V v : vars) {
            if ((v.getTypeAndKind() & Variable.CSTE) == 0) {
                nb++;
            }
        }
        if (nb == vars.length) return vars;
        V[] noCsts;
        switch (vars[0].getTypeAndKind() & Variable.KIND) {
            case Variable.BOOL:
                noCsts = (V[]) new BoolVar[nb];
                break;
            case Variable.INT:
                noCsts = (V[]) new IntVar[nb];
                break;
            case Variable.SET:
                noCsts = (V[]) new SetVar[nb];
                break;
            case Variable.REAL:
                noCsts = (V[]) new RealVar[nb];
                break;
            default:
                throw new UnsupportedOperationException();
        }
        nb = 0;
        for (V v : vars) {
            if ((v.getTypeAndKind() & Variable.CSTE) == 0) {
                noCsts[nb++] = v;
            }
        }
        return noCsts;
    }
}

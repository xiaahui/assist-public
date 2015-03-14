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
package ch.hilbri.assist.mapping.solver.constraints.choco;

import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.util.ESat;
import org.chocosolver.util.tools.ArrayUtils;

/**
 * Maintain a link between a integer variable and the union of values taken by
 * an array of integer variables.
 * Inspired by PropSetIntValuesUnion.
 *
 * @author Jean-Guillaume Fages
 * @author Michael Behrisch
 */
public class PropIntValuesUnion extends Propagator<IntVar> {

	private static final long serialVersionUID = 1318758300478761372L;

	public PropIntValuesUnion(IntVar[] X, IntVar union) {
		super(ArrayUtils.append(new IntVar[] { union }, X),
				PropagatorPriority.LINEAR, false);
	}

	@Override
	public void propagate(int evtmask) throws ContradictionException {
		IntVar union = vars[0];
		for (int v = union.getLB(); v <= union.getUB(); v = union.nextValue(v)) {
			int i;
			for (i = 1; i < vars.length; i++) {
				if (vars[i].contains(v)) {
					break;
				}
			}
			if (i == vars.length) {
				union.removeValue(v, aCause);
			}
		}
		for (int i = 1; i < vars.length; i++) {
			for (int v = vars[i].getLB(); v <= vars[i].getUB(); v = vars[i].nextValue(v)) {
				if (!union.contains(v)) {
					vars[i].removeValue(v, aCause);
				}
			}
		}
	}

	@Override
	public ESat isEntailed() {
		IntVar union = vars[0];
		int instCount = 0;
		for (int i = 1; i < vars.length; i++) {
			if (vars[i].isInstantiated()) {
				instCount++;
				if (!union.contains(vars[i].getValue())) {
					return ESat.FALSE;
				}
			}
		}
		if (instCount == vars.length - 1) {
			return ESat.TRUE;
		}
		return ESat.UNDEFINED;
	}
}

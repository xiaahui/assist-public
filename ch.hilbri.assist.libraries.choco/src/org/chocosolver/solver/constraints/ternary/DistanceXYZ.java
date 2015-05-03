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
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.Operator;
import org.chocosolver.solver.exception.SolverException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.util.tools.ArrayUtils;

/**
 * <br/>
 * |X-Y| OP Z
 *
 * @author Charles Prud'homme
 * @since 06/04/12
 */
public class DistanceXYZ extends Constraint {


    final IntVar X, Y, Z;
    final Operator OP;


    public DistanceXYZ(IntVar x, IntVar y, Operator op, IntVar z) {
        super("DistanceXYZ " + op.name(), new PropDistanceXYZ(ArrayUtils.toArray(x, y, z), op));
        if (op != Operator.EQ && op != Operator.GT && op != Operator.LT) {
            throw new SolverException("Unexpected operator for distance");
        }
        this.X = x;
        this.Y = y;
        this.Z = z;
        this.OP = op;
    }

//  will be ok once every operator is be supported
//	public Constraint makeOpposite(){
//		return new DistanceXYZ(X,Y,Operator.getOpposite(OP),Z);
//	}

    @Override
    public void duplicate(Solver solver, THashMap<Object, Object> identitymap) {
        if (!identitymap.containsKey(this)) {
            this.X.duplicate(solver, identitymap);
            IntVar X = (IntVar) identitymap.get(this.X);
            this.Y.duplicate(solver, identitymap);
            IntVar Y = (IntVar) identitymap.get(this.Y);
            this.Z.duplicate(solver, identitymap);
            IntVar Z = (IntVar) identitymap.get(this.Z);

            Constraint clone = new DistanceXYZ(X, Y, this.OP, Z);
            identitymap.put(this.propagators[0], clone.getPropagator(0));
            identitymap.put(this, clone);
        }
    }
}

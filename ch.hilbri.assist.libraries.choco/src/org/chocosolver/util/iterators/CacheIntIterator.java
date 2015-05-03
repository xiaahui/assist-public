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
package org.chocosolver.util.iterators;

import gnu.trove.list.array.TIntArrayList;

/**
 * <br/>
 *
 * @author Charles Prud'homme
 * @since 30/08/11
 */
public class CacheIntIterator extends DisposableIntIterator {

    boolean read = false;
    TIntArrayList values;
    int idx;

    DisposableIntIterator iterator;

    public CacheIntIterator(DisposableIntIterator iterator) {
        this.iterator = iterator;
        values = new TIntArrayList();
    }

    public void init(DisposableIntIterator iterator) {
        this.iterator = iterator;
        values.clear();
        read = false;
        this.init();
    }

    @Override
    public void init() {
        super.init();
        idx = 0;
    }

    @Override
    public void dispose() {
        iterator.dispose();
        read = true;
    }

    @Override
    public boolean hasNext() {
        return read ? idx < values.size() : iterator.hasNext();
    }

    @Override
    public int next() {
        if (read) {
            return values.get(idx++);
        } else {
            int v = iterator.next();
            values.add(v);
            return v;
        }
    }
}

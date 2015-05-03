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
package org.chocosolver.util.objects.setDataStructures.swapList;

import org.chocosolver.util.objects.setDataStructures.SetType;

/**
 * List of m elements based on Array int_swaping with an additionnal array
 * add : O(1)
 * testPresence: O(1)
 * remove: O(1)
 * iteration : O(m)
 * Created by IntelliJ IDEA.
 * User: Jean-Guillaume Fages
 * Date: 18/11/2011
 */
public class Set_Swap_Array extends Set_Swap {

    protected int[] map;

    public Set_Swap_Array(int n) {
        super(n);
        map = new int[n];
        for (int i = 0; i < n; i++) {
            map[i] = -1;
        }
    }

    @Override
    public boolean contain(int element) {
        return map[element] >= 0 && map[element] < getSize() && array[map[element]] == element;
    }

    @Override
    public boolean add(int element) {
        if (contain(element)) {
            return false;
        }
        int size = getSize();
        if (getSize() == arrayLength) {
            int[] tmp = array;
            int ns = Math.min(sizeMax, tmp.length + 1 + (tmp.length * 2) / 3);
            array = new int[ns];
            arrayLength = ns;
            System.arraycopy(tmp, 0, array, 0, size);
        }
        array[size] = element;
        map[element] = size;
        addSize(1);
        return true;
    }

    @Override
    public boolean remove(int element) {
        int size = getSize();
        if (map[element] >= 0) {
            if (size == 1) {
                setSize(0);
                return true;
            }
            int idx = map[element];
            if (idx < size) {
                int replacer = array[size - 1];
                map[replacer] = idx;
                array[idx] = replacer;
                map[element] = size - 1;
                array[size - 1] = element;
                addSize(-1);
                if (idx == currentIdx) {
                    currentIdx--;
                }
                return true;
            }
        }
        return false;
    }

	@Override
	public SetType getSetType(){
		return SetType.BIPARTITESET;
	}
}

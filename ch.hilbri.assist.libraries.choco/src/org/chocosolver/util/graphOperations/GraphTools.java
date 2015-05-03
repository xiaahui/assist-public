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
package org.chocosolver.util.graphOperations;

import org.chocosolver.util.objects.graphs.DirectedGraph;
import org.chocosolver.util.objects.setDataStructures.ISet;

import java.util.BitSet;

/**
 * Class containing some static methods to manipulate graphs
 *
 * @author Jean-Guillaume Fages
 */
public class GraphTools {


    //***********************************************************************************
    // IGraph explorations
    //***********************************************************************************

    /**
     * perform a dfs in graph.
     *
     * @param root  starting point of the dfs
     * @param graph to perform a dfs on
     * @return num an array to represent node numbers in the dfs tree
     */
    public static int[] performDFS(int root, DirectedGraph graph) {
        int nb = graph.getNbMaxNodes();
        ISet[] neighbors = new ISet[nb];
        int[] father = new int[nb];
        int[] num = new int[nb];
        BitSet notFirstTime = new BitSet(nb);
        for (int i = 0; i < nb; i++) {
            father[i] = -1;
            neighbors[i] = graph.getSuccOf(i);
        }
        int i = root;
        int k = 0;
        num[root] = k;
        father[root] = root;
        int j;
        while (true) {
            if (notFirstTime.get(i)) {
                j = neighbors[i].getNextElement();
            } else {
                j = neighbors[i].getFirstElement();
                notFirstTime.set(i);
            }
            while (j == i) {
                j = neighbors[i].getNextElement();
            }
            if (j < 0) {
                if (i == root) {
                    return num;
                }
                i = father[i];
            } else {
                if (father[j] == -1) {
                    father[j] = i;
                    i = j;
                    k++;
                    num[i] = k;
                }
            }
        }
    }
}

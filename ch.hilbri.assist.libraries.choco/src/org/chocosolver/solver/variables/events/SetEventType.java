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
package org.chocosolver.solver.variables.events;

/**
 * An enum defining the set variable event types:
 * <ul>
 * <li><code>ADD_TO_KER</code>: value enforcing event,</li>
 * <li><code>REMOVE_FROM_ENVELOPE</code>: value removal event,</li>
 * </ul>
 * <p/>
 *
 * @author Charles Prud'homme, Jean-Guillaume Fages
 */
public enum SetEventType implements IEventType {

	VOID(0),
	ADD_TO_KER(1),
	REMOVE_FROM_ENVELOPE(2);

	private final int mask;
	private final int strengthened_mask;

	private SetEventType(int mask) {
		this.mask = mask;
		this.strengthened_mask = mask;
	}

	@Override
	public int getMask() {
		return mask;
	}

	@Override
	public int getStrengthenedMask() {
		return strengthened_mask;
	}

	//******************************************************************************************************************
	//******************************************************************************************************************

	public static int all() {
		return ADD_TO_KER.mask+REMOVE_FROM_ENVELOPE.mask;
	}

	public static boolean isKerAddition(int mask) {
		return (mask & ADD_TO_KER.mask) != 0;
	}

	public static boolean isEnvRemoval(int mask) {
		return (mask & REMOVE_FROM_ENVELOPE.mask) != 0;
	}
}

package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.constraints.nary.alldifferent.PropAllDiffAC
import org.chocosolver.solver.constraints.nary.count.PropCount_AC
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF

final class ACF extends AssistConstraintFactory {
	// just syntactic sugar
}

class AssistConstraintFactory {

	/**
	 * This constraint tries to constraint the mapping from the perspective of
	 * the pins
	 * 
	 * The pinVars can either be 0 (no interface is mapped to this pin) or
	 * they can contain the interface indizes shifted by 1 which can be mapped 
	 * to this pin
	 * 
	 * Keep in mind that this constraint works in both directions; restricting a pinVar
	 * also affects the domains of eqIfaceVars 
	 */
	def static Constraint inverse_channeling(IntVar[] eqIfaceVars, IntVar[] pinVars) {

		val propagators = newArrayList

		// We do not need to enforce the AllDifferent on the eqIfaceVars - 
		// this is already done in the ConnectedPinsConstraint
		// But we can still enforce an AllDifferent on the pins - but they can be -1 multiple times!
		propagators.addAll(ICF.alldifferent_conditionnal(pinVars, [v | !v.contains(-1)], true).propagators)
		
		// We enforce that a number of pins has to be -1
		propagators.add(new PropCount_AC(pinVars, -1, VF.enumerated("", pinVars.length-eqIfaceVars.length, pinVars.length-eqIfaceVars.length, pinVars.get(0).solver)))
		
		// And we add the PropInverseChannelAC Propagator
		propagators.add(new PropInverseChannelAC(eqIfaceVars, pinVars))

		new Constraint("ASSISTInverseChanneling", propagators)
	}

	def static Constraint allDifferent(List<List<IntVar>> VARS, IntVar[] domainUnionVars) {
		val cumulLengths = new ArrayList<Integer>
		for (var i = 0; i < VARS.size(); i++) {
			val subList = VARS.get(i)
			val subListSize = subList.length
			if(i == 0) cumulLengths.add(subListSize) else cumulLengths.add(subListSize + cumulLengths.last);
		}
		val props = newArrayList;
		for (int i : 0 ..< VARS.size) {
			props.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)));
		}
		props.add(new PropAllDiffListsOfListsInst(cumulLengths, VARS.flatten));
		props.add(new PropAllDiffAC(domainUnionVars));
//		props.add(new PropAllDiffBC(domainUnionVars));
//		props.add(new PropAllDiffAdaptative(domainUnionVars));
		// we need to propagate twice anyway, maybe it is helpful to do it once before and once after
		for (int i : 0 ..< VARS.size) {
			props.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)));
		}
		return new Constraint("ASSISTAllDifferent", props)
	}

	def static Constraint element(IntVar VALUE, int[] TABLE, IntVar INDEX) {
		return new Constraint("Element", new PropElement(VALUE, TABLE, INDEX))
	}
}
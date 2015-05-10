package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.nary.alldifferent.PropAllDiffAC
import org.chocosolver.solver.variables.IntVar

class AssistConstraintFactory {
	
	def static Constraint allDifferent(List<List<IntVar>> VARS, IntVar[] domainUnionVars) {
		val cumulLengths = new ArrayList<Integer>
    	for (var i = 0; i < VARS.size(); i++) {
    		val subList = VARS.get(i)
    		val subListSize = subList.length
    		if (i == 0)	cumulLengths.add(subListSize)
    		else		cumulLengths.add(subListSize + cumulLengths.last);
    	}
		val props = newArrayList;
		for (int i: 0..< VARS.size) {
			props.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)));
		}
		props.add(new PropAllDiffListsOfListsInst(cumulLengths, VARS.flatten));
		props.add(new PropAllDiffAC(domainUnionVars));
//		props.add(new PropAllDiffBC(domainUnionVars));
//		props.add(new PropAllDiffAdaptative(domainUnionVars));

		// we need to propagate twice anyway, maybe it is helpful to do it once before and once after
		for (int i: 0..< VARS.size) {
			props.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)));
		}
		return new Constraint("AllDifferent", props)
    }
    
    def static Constraint element(IntVar VALUE, int[] TABLE, IntVar INDEX){
    	return new Constraint("Element", new PropElement(VALUE, TABLE, INDEX))
    }
}
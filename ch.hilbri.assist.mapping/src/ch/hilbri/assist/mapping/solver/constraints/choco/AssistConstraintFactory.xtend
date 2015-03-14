package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.variables.IntVar

class AssistConstraintFactory {
	def static Constraint allDifferent(List<List<IntVar>> VARS) {
		val cumulLengths = new ArrayList<Integer>
    	for (var i = 0; i < VARS.size(); i++) {
    		val subList = VARS.get(i)
    		val subListSize = subList.length
    		if (i == 0)	cumulLengths.add(subListSize)
    		else		cumulLengths.add(subListSize + cumulLengths.last);
    	}
    	return new AllDifferentForLists(cumulLengths, VARS.flatten);
    }
	
}
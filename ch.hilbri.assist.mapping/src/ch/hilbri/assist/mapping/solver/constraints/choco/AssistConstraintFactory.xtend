package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.List
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.nary.alldifferent.PropAllDiffAC
import org.chocosolver.solver.variables.IntVar

class AssistConstraintFactory {
	def static Constraint allDifferent(List<List<IntVar>> VARS, IntVar[] domainUnionVars) {
		val cumulLengths = newArrayList
    	
    	for (i : 0..< VARS.size) {
    		val subList = VARS.get(i)
    		val subListSize = subList.length
    		if (i == 0)	cumulLengths.add(subListSize)
    		else		cumulLengths.add(subListSize + cumulLengths.last)
    	}
    	
		val propagators = newArrayList
		
		for (int i: 0..< VARS.size) 
			propagators.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)))
		
		propagators.add(new PropAllDiffListsOfListsInst(cumulLengths, VARS.flatten))
		propagators.add(new PropAllDiffAC(domainUnionVars))

		return new Constraint("AllDifferent", propagators)
    }
}
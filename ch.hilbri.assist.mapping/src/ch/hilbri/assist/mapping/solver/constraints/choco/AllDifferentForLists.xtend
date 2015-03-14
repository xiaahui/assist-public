package ch.hilbri.assist.mapping.solver.constraints.choco

import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.variables.IntVar

class AllDifferentForLists extends Constraint {
	
	new(int[] cumulLengths, IntVar[] flatVars) {
		super("AllDifferent", #[new PropAllDiffListsOfListsInst(cumulLengths, flatVars)])
	}
}
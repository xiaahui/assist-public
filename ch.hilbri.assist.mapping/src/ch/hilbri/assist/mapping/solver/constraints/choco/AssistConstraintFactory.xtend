package ch.hilbri.assist.mapping.solver.constraints.choco

import java.util.List
import org.chocosolver.solver.constraints.Constraint
import org.chocosolver.solver.constraints.nary.alldifferent.PropAllDiffAC
import org.chocosolver.solver.variables.IntVar

final class ACF extends AssistConstraintFactory {}

class AssistConstraintFactory {
	
	def static Constraint allDifferent_instantiation_only(List<List<IntVar>> VARS) {
		val cumulLengths = newArrayList

		for (i : 0 ..< VARS.size) {
			val subList = VARS.get(i)
			val subListSize = subList.length
			if(i == 0) {
				cumulLengths.add(subListSize) 
			}
			else {
				cumulLengths.add(subListSize + cumulLengths.last)
			}
		}

		return new Constraint("AllDifferent", #[new PropAllDiffListsOfListsInst(cumulLengths, VARS.flatten)])	
	}
	
	def static Constraint allDifferent_values_union(List<List<IntVar>> VARS) { 
		
		val chocoModel = VARS.head.head.model
		
		val domainUnionVars = newArrayList
		for (varList : VARS) {
			val minValue = varList.map[LB].min
			val maxValue = varList.map[UB].max
			val intVar = chocoModel.intVar(minValue, maxValue, false)
			domainUnionVars.add(intVar) 
		}
				
		val cumulLengths = newArrayList

		for (i : 0 ..< VARS.size) {
			val subList = VARS.get(i)
			val subListSize = subList.length
			if(i == 0) {
				cumulLengths.add(subListSize) 
			}
			else {
				cumulLengths.add(subListSize + cumulLengths.last)
			}
		}

		val propagators = newArrayList

		for (int i : 0 ..< VARS.size)
			propagators.add(new PropIntValuesUnion(VARS.get(i), domainUnionVars.get(i)))

		propagators.add(new PropAllDiffListsOfListsInst(cumulLengths, VARS.flatten))
		propagators.add(new PropAllDiffAC(domainUnionVars))

		return new Constraint("AllDifferent", propagators)
	}
}

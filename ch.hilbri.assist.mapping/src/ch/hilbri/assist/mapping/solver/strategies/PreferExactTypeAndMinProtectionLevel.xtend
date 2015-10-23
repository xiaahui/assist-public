package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class PreferExactTypeAndMinProtectionLevel implements IntValueSelector {
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
	}
	
	/*
	 * We have to follow a two-level sorting hierarchy
	 * 
	 * 1. Level: Exact Type Matching
	 * 2. Level: Minimum Protection Level possible (NONE < L1 < L2 < L3 < ... < L8)
	 */
	override int selectValue(IntVar variable) {
		
		val equipment = solverVariables.getEqInterfaceForLocationVariable(variable)
		
		val pinIndexList = variable.values
 		
     	pinIndexList // 2. Level - Minimum Protection Level possible
     				.sortBy[ model.pins.get(it).protectionLevel.value ]
     		
		     		// 1. Level - Exact Type matching is preferred over everything else
     				.sortBy[ if (equipment.ioType == model.pins.get(it).eqInterfaceType) 0 else	1 ]
     		
					// Get the first pin
					.get(0)
	}
	
	/**
	 * This is a little extension for IntVars 
	 * it collects all values which are still allowed 
	 * from its domain and returns a list
	 */
	protected def List<Integer> values(IntVar variable) {
		val values = newArrayList
        for (var v = variable.LB; v <= variable.UB; v = variable.nextValue(v)) 
        	values.add(v)
        
        return values
	}
}
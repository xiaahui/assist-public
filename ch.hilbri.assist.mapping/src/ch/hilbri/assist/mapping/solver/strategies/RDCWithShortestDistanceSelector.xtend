package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class RDCWithShortestDistanceSelector implements IntValueSelector  {
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
	}
	
	/*
	 * We have to follow a one-level sorting hierarchy
	 * 
	 * 1. Level: Closest RDC
	 */
	override int selectValue(IntVar conVar) {
		
		val equipment = solverVariables.getEqInterfaceForLocationVariable(conVar)
		
		val conVarIndexList = conVar.values
     	
     	conVarIndexList // 1. Level - Closest RDC
     				.sortBy[ val rdc = model.connectors.get(it).rdc
     						  Math.abs(equipment.resourceX - rdc.resourceX) +
							  Math.abs(equipment.resourceY - rdc.resourceY) +
							  Math.abs(equipment.resourceZ - rdc.resourceZ)  ]

					// Get the first connector
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
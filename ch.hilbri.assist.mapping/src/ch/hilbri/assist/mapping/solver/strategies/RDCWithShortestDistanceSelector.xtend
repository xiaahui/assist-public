package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
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
	override int selectValue(IntVar variable) {
		
		val equipment = solverVariables.getEqInterfaceForLocationVariable(variable)
		
		val pinIndexList = new ArrayList<Integer>
		val iterator = variable.getValueIterator(true)
 		while(iterator.hasNext()) {
     		pinIndexList.add(iterator.next)
     	}
     	
     	pinIndexList // 1. Level - Closest RDC
     				.sortBy[ val rdc = model.pins.get(it).connector.rdc
     						  Math.abs(equipment.resourceX - rdc.resourceX) +
							  Math.abs(equipment.resourceY - rdc.resourceY) +
							  Math.abs(equipment.resourceZ - rdc.resourceZ)  ]

					// Get the first pin
					.get(0)
	}
}
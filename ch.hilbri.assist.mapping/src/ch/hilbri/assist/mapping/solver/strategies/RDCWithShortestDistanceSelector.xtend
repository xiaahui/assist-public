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
	
	// Assumes that the variable is only on connector level
	override int selectValue(IntVar variable) {
		val connIndexList = new ArrayList<Integer>
		val iterator = variable.getValueIterator(true)
 		while(iterator.hasNext()) {
     		connIndexList.add(iterator.next)
     	}
     	
     	val equipment = solverVariables.getInterfaceForLocationVariable(variable)
     	
     	connIndexList.sortBy[ val rdc = model.allConnectors.get(it).rdc
     						  Math.abs(equipment.resourceX - rdc.resourceX) +
							  Math.abs(equipment.resourceY - rdc.resourceY) +
							  Math.abs(equipment.resourceZ - rdc.resourceZ)  ]
					 .get(0)
     			
	}
}
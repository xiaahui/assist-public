package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FirstFailWithProgressionOutput extends FirstFail {
	
	private int bestProgress = 0
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	private Map<IntVar, Integer> map
	
	private boolean printVariablesInSortedOrder = true

	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		
		this.map = new HashMap
		for (v : solverVariables.locationVariables) {
			val app 			= solverVariables.getApplicationForLocationVariable(v)
			val disLocRels 		= model.getAllDislocalityRelations(app)
			if (disLocRels.length < 1) 
				this.map.put(v, 0)
			else
				// 
				this.map.put(v, disLocRels.map[applicationCount].reduce[p1, p2|Math.max(p1, p2)]) 
//				this.map.put(v, disLocRels.size)
		}
	}
	
	override IntVar getVariable(IntVar[] variables) {
		
		val instantiatedVarCount = variables.filter[domainSize == 1].size
		val currentProgress = instantiatedVarCount * 100 / variables.size
		
		if (bestProgress < currentProgress) {
			logger.info("Search progress " + currentProgress + "%")
			bestProgress = currentProgress
		} else if (instantiatedVarCount == variables.size) {
			logger.info("A solution was found - backtracking for more solutions")
			bestProgress = 0
		} 

		val newList = variables.sortBy[map.get(it)]
	
		if (printVariablesInSortedOrder) {
			logger.debug('''Sorted variables: [«FOR v : newList»«v.name» («map.get(v)»), «ENDFOR»]''')
			printVariablesInSortedOrder = false
		}
		
					
		return super.getVariable(newList)
	}
}
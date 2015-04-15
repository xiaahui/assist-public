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
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	private Map<IntVar, Integer> map
	
	private boolean printVariablesInSortedOrder = true

	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model

		/* Store for each application the number of applications 
		 * that are in a dislocal-Relationship with the application 
		 */		
		this.map = new HashMap

		for (v : solverVariables.locationVariables) {
			val app 			= solverVariables.getApplicationForLocationVariable(v)
			val disLocRels 		= model.getAllDislocalityRelations(app)
			if (disLocRels.length <= 0) 
				this.map.put(v, 0)
			else
				this.map.put(v, disLocRels.map[applicationCount].reduce[p1, p2|p1 + p2]) 
		}
	}
	
	override IntVar getVariable(IntVar[] variables) {
		
		val currentProgress = variables.filter[isInstantiated].size * 100 / variables.size
		
		val newList = variables.sortBy[map.get(it)]
	
		if (printVariablesInSortedOrder) {
			logger.debug('''Unsorted variables list: [«FOR v : variables»«v.name» («map.get(v)»), «ENDFOR»]''')
			logger.debug('''Sorting variables according to their partner application count in dislocality relations (increasing order), then MinDomain first.''')
			logger.debug('''Sorted variables list:   [«FOR v : newList»«v.name» («map.get(v)»), «ENDFOR»]''')
			printVariablesInSortedOrder = false
		}
		
		logger.info('''Selecting a variable («currentProgress»% instantiated)''')
					
		return super.getVariable(newList)
	}
}
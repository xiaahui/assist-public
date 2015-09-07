package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class VariablesInMostDislocalityRelationsFirst implements VariableSelector<IntVar>  {
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	private Map<IntVar, Integer> map = new HashMap
	
	private boolean printVariablesInSortedOrder = true
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		
		for (iface : model.eqInterfaces) {
			// score = anzahl der dislokalitaeten * summe der beteiligten Interfaces
			var score = 0
			
			if (!model.dislocalityRelations.filter[allInterfaces.contains(iface)].nullOrEmpty)
				score = model.dislocalityRelations.filter[allInterfaces.contains(iface)].length 
//						*
//						model.dislocalityRelations.filter[allInterfaces.contains(iface)].map[allInterfaces.size].reduce[p1, p2|p1+p2]
			
			val v = solverVariables.getEqInterfaceLocationVariable(iface, 0)
			
			map.put(v, score)
		}
		
		logger.info('''# total variables: «model.eqInterfaces.length»''')
		logger.info('''# variables with score = 0: «map.keySet.filter[map.get(it) == 0].length»''')
	}
	
	override IntVar getVariable(IntVar[] variables) {
		val newList = variables.sortBy[-map.get(it)]
		
		val instantiatedVarCount = variables.filter[isInstantiated].size
		val currentProgress = instantiatedVarCount * 100 / variables.size
		
		if (printVariablesInSortedOrder) {
			logger.debug('''Sorted variables list:   [«FOR v : newList»«v.name» («map.get(v)»)«IF v != newList.last», «ENDIF»«ENDFOR»]''')
			printVariablesInSortedOrder = false
		}
		
		
		
		// select the first variable which is instantiated
		if (newList.filter[!isInstantiated].isNullOrEmpty) return null
		else {
			val v = newList.filter[!isInstantiated].get(0)
			logger.info('''Selecting variable with tag «map.get(v)» («currentProgress»% instantiated)''')
			return v
		}
	}
}
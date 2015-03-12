package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class HardestDislocalitiesFirst implements VariableSelector<IntVar> {
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	private Map<IntVar, Integer> map = new HashMap
	
	private boolean printVariablesInSortedOrder = true
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		
		var counter = 0
		
		for (relation : model.dislocalityRelations.sortBy[-it.totalInterfaceCount]) {
			logger.info('''Relation with «relation.totalInterfaceCount» interfaces («relation.allEqInterfaceOrGroupNames») - tag: «counter»''')
			for (variable : relation.allInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, 0)]) {
				if (!map.keySet.contains(variable)) 
					map.put(variable, counter)
			}
			counter++	
		}

		// do not forget the variables which are not in a dislocality relation
		logger.info('''Total # variables: «model.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, 0)].length»''')
		logger.info('''#variables w/o dislocality relation: «model.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, 0)].filter[!map.keySet.contains(it)].length»''')

		for (intVar : model.eqInterfaces.map[solverVariables.getEqInterfaceLocationVariable(it, 0)].filter[!map.keySet.contains(it)].sortBy[it.domainSize]) {
			map.put(intVar, counter++)
			logger.info('''Putting variable «intVar.name» with counter «counter»''')
		}
		
	}
	
	override IntVar getVariable(IntVar[] variables) {
		val newList = variables.sortBy[map.get(it)]
		
		val instantiatedVarCount = variables.filter[isInstantiated].size
		val currentProgress = instantiatedVarCount * 100 / variables.size
		
		if (printVariablesInSortedOrder) {
			logger.debug('''Unsorted variables list: [«FOR v : variables»«v.name» («map.get(v)»), «ENDFOR»]''')
			logger.debug('''Sorting variables according to their partner application count in dislocality relations (increasing order), then MinDomain first.''')
			logger.debug('''Sorted variables list:   [«FOR v : newList»«v.name» («map.get(v)»), «ENDFOR»]''')
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
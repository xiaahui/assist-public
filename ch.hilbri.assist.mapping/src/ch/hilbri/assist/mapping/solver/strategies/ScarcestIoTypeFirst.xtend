package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ScarcestIoTypeFirst implements VariableSelector<IntVar>  {
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	
	private Map<IntVar, Integer> map = new HashMap
	
	private boolean printVariablesInSortedOrder = true
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		
		val availIoTypes = new HashMap<String, Integer>
		
		for (conn : model.allConnectors)
			for (iface : conn.availableEqInterfaces)
				if (availIoTypes.keySet.contains(iface.eqInterfaceType))
					availIoTypes.put(iface.eqInterfaceType, availIoTypes.get(iface.eqInterfaceType) + iface.count)
				else
					availIoTypes.put(iface.eqInterfaceType, iface.count)
		
		val requestedIoTypes = new HashMap<String, Integer>
		
		for (iface : model.eqInterfaces)
			if (requestedIoTypes.keySet.contains(iface.ioType))
				requestedIoTypes.put(iface.ioType, requestedIoTypes.get(iface.ioType) + 1)					
			else
				requestedIoTypes.put(iface.ioType, 1)
		
		for (iface : model.eqInterfaces) {
			map.put(solverVariables.getEqInterfaceLocationVariable(iface, 0),
					availIoTypes.get(iface.ioType) - requestedIoTypes.get(iface.ioType))
			logger.info('''Putting «iface.name» with «availIoTypes.get(iface.ioType) - requestedIoTypes.get(iface.ioType)»''')
		}
	}
	
	override IntVar getVariable(IntVar[] variables) {
		val newList = variables.sortBy[map.get(it)]
		
//		val instantiatedVarCount = variables.filter[isInstantiated].size
//		val currentProgress = instantiatedVarCount * 100 / variables.size
		
		if (printVariablesInSortedOrder) {
//			logger.debug('''Unsorted variables list: [«FOR v : variables»«v.name» («map.get(v)»), «ENDFOR»]''')
//			logger.debug('''Sorting variables according to their partner application count in dislocality relations (increasing order), then MinDomain first.''')
			logger.debug('''Sorted variables list:   [«FOR v : newList»«v.name» («map.get(v)»), «ENDFOR»]''')
			printVariablesInSortedOrder = false
		}
		
		
		
		// select the first variable which is instantiated
		if (newList.filter[!isInstantiated].isNullOrEmpty) return null
		else {
			val v = newList.filter[!isInstantiated].get(0)
//			logger.info('''Selecting variable with tag «map.get(v)» («currentProgress»% instantiated)''')
			return v
		}
	}
}
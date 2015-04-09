package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class HardestColocalitiesFirst implements VariableSelector<IntVar>, IntValueSelector {
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	private Map<IntVar, Map<String,Integer>> colocDemand = new HashMap<IntVar, Map<String, Integer>>
	private FirstFail ff 
	
	private int nextValue
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		this.ff = new FirstFail
		for (r : model.colocalityRelations) {
			val vars = solverVariables.getColocationVariables(r)
			val demand = new HashMap<String, Integer>
			for (v: vars) {
				val iface = solverVariables.getInterfaceForLocationVariable(v)
				demand.put(iface.ioType, demand.getOrDefault(iface.ioType, 0) + 1)
			}
			colocDemand.put(vars.get(0), demand)
		}
	}
	
	override IntVar getVariable(IntVar[] variables) {
		var maxRatio = 0f
		var maxDemand = 0
		var IntVar maxVar = null
		nextValue = -1
		for (repVar: colocDemand.keySet) {
			val demand = colocDemand.get(repVar)
			if (!repVar.instantiated) {
				for (var int i = repVar.getLB(); i <= repVar.getUB(); i = repVar.nextValue(i)) {
					val connector = model.allConnectors.get(i)
					var totalNeed = 0
					var totalSupply = 0
					for (ioType: demand.keySet) {
						totalNeed += demand.get(ioType)
						for (supply : connector.availableEqInterfaces) {
							if (supply.eqInterfaceType.equals(ioType)) {
								totalSupply += supply.count
							}
						}						
					}
					val ratio = totalNeed / (totalSupply as float)
					if (ratio > maxRatio || (ratio == maxRatio && totalNeed > maxDemand)) {
						maxRatio = ratio
						maxDemand = totalNeed
						maxVar = repVar
						nextValue = i
					}
				}
			}		
		}
		if (maxVar != null) {		
			return maxVar
		}
		return ff.getVariable(variables)
	}
	
    override int selectValue(IntVar variable) {
    	if (nextValue >= 0) {
        	return nextValue
        }
        return variable.getLB();
    }
	
}
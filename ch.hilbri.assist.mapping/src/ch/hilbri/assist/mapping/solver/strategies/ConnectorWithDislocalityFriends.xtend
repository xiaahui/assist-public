package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ConnectorWithDislocalityFriends implements IntValueSelector  {
	
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	private Map<IntVar, int[]> map = new HashMap
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
	}
	
	override int selectValue(IntVar variable) {
		if (map.empty) {
			// we can't do this on creation because the type constraints are not yet propagated then
			for (group: model.eqInterfaceGroups) {
				for (iface: group.eqInterfaces) {
					val locVar = solverVariables.getEqInterfaceLocationVariable(iface, 0)
					if (map.get(locVar) == null) {
						map.put(locVar, newIntArrayOfSize(locVar.UB+1))
					}
					val scores = map.get(locVar)
					for (friend: group.eqInterfaces) {
						if (friend != iface) {
							val friendVar = solverVariables.getEqInterfaceLocationVariable(friend, 0)
							for (var int i = friendVar.getLB(); i <= friendVar.getUB(); i = friendVar.nextValue(i)) {
								if (locVar.contains(i)) {
									scores.set(i, scores.get(i) + 1)
								}
							}
						}
					}
				}
			}			
		}
		val scores = map.get(variable)
		if (scores != null) {
			var maxScore = 0
			var maxConn = variable.getLB() 
			for (var int i = variable.getLB(); i <= variable.getUB(); i = variable.nextValue(i)) {
				if (scores.get(i) > maxScore) {
					maxScore = scores.get(i)
					maxConn = i
				}
			}
			return maxConn
		}
		return variable.getLB()
	}
}

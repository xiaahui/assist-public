package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.List
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class HardestDislocalitiesFirst implements VariableSelector<IntVar>, IntValueSelector {
	
	private Logger logger
	private FirstFail ff 
	private List<IntVar> varList = null
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.ff = new FirstFail
	    val map = new HashMap<IntVar, Integer>
		
		for (iface : model.eqInterfaces) {
			var score = 0
			
			// go through the colocalities
			for (r : model.colocalityRelations.filter[it.allInterfaces.contains(iface)]) {
				for (ifaceOrGroup : r.eqInterfaceOrGroups) {
					
					// Is it an interface?
					if (ifaceOrGroup instanceof EqInterface) {
						// Am I that interface? If not, add to the score!
						if (ifaceOrGroup != iface) score += solverVariables.getEqInterfaceLocationVariable(ifaceOrGroup, 0).domainSize -1
					} 
					
					// Is it a group
					else if (ifaceOrGroup instanceof EqInterfaceGroup) {
						// go through all interface
						for (i : ifaceOrGroup.eqInterfaces)
							// add to the score if it is not me
							if (i != iface) 
								score += solverVariables.getEqInterfaceLocationVariable(i, 0).domainSize -1
					}
				}
			}
			
			// go through the dislocalities
			for (r : model.dislocalityRelations.filter[it.allInterfaces.contains(iface)]) {
				for (ifaceOrGroup : r.eqInterfaceOrGroups) {
					
					// Is it an interface?
					if (ifaceOrGroup instanceof EqInterface) {
						// Am I that interface? If not, add to the score!
						if (ifaceOrGroup != iface) score += 1
					} 
					
					// Is it a group
					else if (ifaceOrGroup instanceof EqInterfaceGroup) {
						
						// Am I part of this group?
						if (!ifaceOrGroup.eqInterfaces.contains(iface))
							score += ifaceOrGroup.eqInterfaces.size // add 1 for each group member
							
					}
				}
			}
			
			// save the score for this variable
			val variable = solverVariables.getEqInterfaceLocationVariable(iface, 0)
			map.put(variable, score)
			logger.info('''Putting variable «variable.name» with score «score»''')
		}
		varList = solverVariables.getLocationVariables().sortBy[-map.getOrDefault(it, 0)]
		logger.debug('''Sorted variables list:   [«FOR v : varList»«v.name» («map.get(v)»)«IF v != varList.last», «ENDIF»«ENDFOR»]''')
	}
	
	override IntVar getVariable(IntVar[] variables) {
		return ff.getVariable(varList)
	}
	
	 
    override int selectValue(IntVar variable) {
        return variable.getLB();
    }
	
}
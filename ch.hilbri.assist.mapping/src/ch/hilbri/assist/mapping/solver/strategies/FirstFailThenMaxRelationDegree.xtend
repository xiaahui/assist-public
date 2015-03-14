package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FirstFailThenMaxRelationDegree implements VariableSelector<IntVar>, IntValueSelector {
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	private FirstFail firstFail 
	private Map<IntVar, Integer> map = new HashMap
	private List<IntVar> varList = null
	
	private boolean printVariablesInSortedOrder = true
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		this.firstFail = new FirstFail
		
		logger.info('''Computing the scores for all variables''')
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
			logger.info('''Assigning variable «variable.name» score «score»''')
		}
	}
	
	override IntVar getVariable(IntVar[] variables) {
		if (varList == null)
		 	varList = variables.sortBy[-map.get(it)]

		if (printVariablesInSortedOrder) {
			logger.debug('''Unsorted variables list: [«FOR v : variables»«v.name» («map.get(v)»), «ENDFOR»]''')
			logger.debug('''Sorting variables according to their partner application count in dislocality relations (increasing order), then MinDomain first.''')
			logger.debug('''Sorted variables list:   [«FOR v : varList»«v.name» («map.get(v)»), «ENDFOR»]''')
			printVariablesInSortedOrder = false
		}

		val instantiatedVarCount = variables.filter[isInstantiated].size
		var currentProgress = 0
		if (variables.size > 0) currentProgress = instantiatedVarCount * 100 / variables.size
		
		val variable = firstFail.getVariable(varList)
		if (variable != null)
			logger.info('''Selecting variable «variable.name» with score «map.get(variable)» («currentProgress»% instantiated)''')
		return variable
	}
	
	 
    override int selectValue(IntVar variable) {
        return variable.getLB();
    }
	
}
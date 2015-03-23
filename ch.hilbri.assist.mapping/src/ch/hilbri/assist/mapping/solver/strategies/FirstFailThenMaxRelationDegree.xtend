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
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FirstFailThenMaxRelationDegree implements VariableSelector<IntVar>, IntValueSelector {
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	private List<List<IntVar>> varList
	private int[] levels
	
	private boolean printVariablesInSortedOrder = true
	
	new(SolverVariablesContainer solverVariables, AssistModel model, int... levels) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		this.levels = levels
		val Map<IntVar, Integer> map = new HashMap
		
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
			if (score != 0) {
				map.put(variable, score)
				map.put(solverVariables.getEqInterfaceLocationVariable(iface, 1), score)
				map.put(solverVariables.getEqInterfaceLocationVariable(iface, 2), score)
				logger.info(''' - Assigning variable «variable.name» score «score»''')
			}
		}
		varList = levels.map[l|solverVariables.getLocationVariables(l).sortBy[-map.getOrDefault(it, 0)]]
	}
	
    def IntVar getFirstFail(IntVar[] variables) {
        var IntVar small = null
        var small_dsize = Integer.MAX_VALUE
        for (v : variables) {
            val dsize = v.domainSize
            if (dsize > 1 && dsize < small_dsize) {
            	if (dsize == 2) {
            		return v
            	}
                small = v
                small_dsize = dsize
            }
        }
        return small;
    }

	override IntVar getVariable(IntVar[] variables) {
		if (printVariablesInSortedOrder) {
			logger.debug('''Unsorted variables list: [«FOR v : variables»«v.name»«IF v != variables.last», «ENDIF»«ENDFOR»]''')
			logger.debug('''Sorting variables according to their partner application count in dislocality relations (increasing order), then MinDomain first.''')
			logger.debug('''Sorted variables list:   [«FOR v : varList.get(0)»«v.name»«IF v != variables.last», «ENDIF»«ENDFOR»]''')
			printVariablesInSortedOrder = false
		}

		val instantiatedVarCount = variables.filter[isInstantiated].size
		var currentProgress = 0
		if (variables.size > 0) currentProgress = instantiatedVarCount * 100 / variables.size
		for (list : varList) {
			val variable = getFirstFail(list)
			if (variable != null) {
//				logger.info('''Selecting variable «variable» («currentProgress»% of all variables instantiated)''')
//				logger.debug('''Instantiated variables list: [«FOR v : variables»«IF v.instantiated»«v.name»«IF v != variables.last», «ENDIF»«ENDIF»«ENDFOR»]''')
				return variable
			}
		}
		return null
	}
	
	 
    override int selectValue(IntVar variable) {
    	if (variable.name.endsWith("-Connector")) {
//	    	val conn = model.allConnectors.get(variable.LB)
//			logger.debug('''Setting variable «variable.name» to «conn.fullName».''')		
    	} else {
//			logger.debug('''Setting variable «variable.name» to «variable.LB».''')		    		
    	}
        return variable.getLB();
    }
	
}
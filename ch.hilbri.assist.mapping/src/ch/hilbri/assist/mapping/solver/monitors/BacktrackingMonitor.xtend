package ch.hilbri.assist.mapping.solver.monitors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.search.loop.monitors.IMonitorUpBranch
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class BacktrackingMonitor implements IMonitorUpBranch {
	
	private Logger logger
	private AssistModel model
	private SolverVariablesContainer solverVariables
	
	new(SolverVariablesContainer solverVariables, AssistModel model) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.model = model
		this.solverVariables = solverVariables 
	}
	
	override afterUpBranch() {
		logger.debug('''Backtracking - afterUp''')
		printState
	}
	
	override beforeUpBranch() {
		logger.debug('''Backtracking - beforeUp''')
		printState
	}
	
	private def printState() {
		logger.info(''' ''')
		logger.info('''Current status:''')
		logger.info('''  - Instantiated vars: «solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN).filter[isInstantiated]»''')
		logger.info('''  - Placement:''')
		
		for (p : model.pins) {
			if (!solverVariables.pinVarMap.get(p).isInstantiatedTo(0))
				logger.info('''«String.format("%30s", p.connector.name + "." + p.name + " (" + model.pins.indexOf(p) +")")» --> «solverVariables.pinVarMap.get(p).values.map[it - 1]»''')
		}
		logger.info(''' ''')
	}
	
	/**
	 * This is a little extension for IntVars 
	 * it collects all values which are still allowed 
	 * from its domain and returns a list
	 */
	protected def List<Integer> values(IntVar variable) {
		val values = newArrayList
        for (var v = variable.LB; v <= variable.UB; v = variable.nextValue(v)) 
        	values.add(v)
        
        return values
	}
	
}
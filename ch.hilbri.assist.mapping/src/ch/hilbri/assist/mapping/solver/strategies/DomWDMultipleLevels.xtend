package ch.hilbri.assist.mapping.solver.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import org.chocosolver.solver.search.strategy.selectors.VariableSelector
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DomWDMultipleLevels implements VariableSelector<IntVar> {
	private Logger logger
	private SolverVariablesContainer solverVariables
	private AssistModel model
	private IntVar[] pinVars
	private IntVar[] conVars
	
	
	new(SolverVariablesContainer solverVariables, AssistModel model, IntVar[] pinVars, IntVar[] conVars) {
		this.logger = LoggerFactory.getLogger(this.class)
		this.solverVariables = solverVariables
		this.model = model
		this.pinVars = pinVars
		this.conVars = conVars
	}
	
	override IntVar getVariable(IntVar[] variables) {
		
		
	}
}
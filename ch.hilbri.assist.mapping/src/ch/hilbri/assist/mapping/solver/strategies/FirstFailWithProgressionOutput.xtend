package ch.hilbri.assist.mapping.solver.strategies

import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FirstFailWithProgressionOutput extends FirstFail {
	
	private int bestProgress = 0
	private Logger logger;
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	override IntVar getVariable(IntVar[] variables) {
		
		val instantiatedVarCount = variables.filter[domainSize == 1].size
		val currentProgress = instantiatedVarCount * 100 / variables.size

		if (bestProgress < currentProgress) {
			logger.info("Search progress " + currentProgress + "%")
			bestProgress = currentProgress
		} else if (instantiatedVarCount == variables.size) {
			logger.info("A solution was found - backtracking for more solutions")
			bestProgress = 0
		} 
		
		return super.getVariable(variables)
	}
}
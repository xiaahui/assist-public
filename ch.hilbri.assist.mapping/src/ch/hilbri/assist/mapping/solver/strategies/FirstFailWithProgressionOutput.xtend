package ch.hilbri.assist.mapping.solver.strategies

import org.chocosolver.solver.search.strategy.selectors.variables.FirstFail
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FirstFailWithProgressionOutput extends FirstFail {
	
	private Logger logger
	
	
	new() {
		this.logger = LoggerFactory.getLogger(this.class)
	}
	
	override IntVar getVariable(IntVar[] variables) {
		
		val currentProgress = variables.filter[instantiated].size * 100 / variables.size
		val v = super.getVariable(variables)
		
		logger.info('''Selecting variable «v» («currentProgress»% instantiated)''')
					
		return v
	}
}

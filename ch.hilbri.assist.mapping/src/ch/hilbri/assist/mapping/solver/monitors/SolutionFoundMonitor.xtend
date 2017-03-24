package ch.hilbri.assist.mapping.solver.monitors

import org.chocosolver.solver.constraints.^extension.Tuples
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SolutionFoundMonitor implements IMonitorSolution {
	
	private Logger logger
	private IntVar[] vars
	
	new(IntVar[] vars) {
		this.logger = LoggerFactory.getLogger(this.class)
		
		this.vars = vars
	}
	
	override onSolution() {
		logger.info("Solution found.")
		if (vars != null) {
			// This solution is now forbidden in order to allow strategies and heuristics with a restart policy
	
			// what are the (last found) solutions for these variables?		
			val tuples = new Tuples(false)
			tuples.add(vars.map[it.LB])
			
			// post a constraint to forbid this solutions during a restart
//			vars.get(0).solver.post(ICF.table(vars, tuples, "FC")) // FC was the only algo working properly
		}
	}
	
}
package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.chocosolver.solver.Solution
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.model.MappingResult

class ResultFactoryFromSolverSolutions {
	
	static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)

	static def ArrayList<MappingResult> create(AssistModel assistModel, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {

		/* The list of results which will be returned for display */
		val results = newArrayList
		
		for (solution : solverSolutions) {
			
			val solNumber 		= solverSolutions.indexOf(solution) + 1
			val solTotalCount  	= solverSolutions.length
			
			val result = ModelFactory.eINSTANCE.createMappingResult => [
				name 			= "Solution "+ solNumber + " of " + solTotalCount
				index			= solNumber - 1
				model 			= assistModel
				task2CoreMap 	= new HashMap
				for (task : getModel.allTasks) {
					val locVars = solverVariables.getLocationVariablesForTask(task)
					val coreIndex = solution.getIntVal(locVars.get(0))
					val core = getModel.allCores.get(coreIndex)	
					getTask2CoreMap.put(task, core)
				}
			]
			results.add(result)
			logger.info('''Created an ASSIST solution from solver solution «solNumber» / «solTotalCount»''')
		
		}
		return results
	}
}
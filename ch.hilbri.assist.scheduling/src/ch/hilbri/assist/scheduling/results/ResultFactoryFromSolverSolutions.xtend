package ch.hilbri.assist.scheduling.results

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.AssistModelSchedulingResult
import ch.hilbri.assist.model.ModelFactory
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import java.util.HashMap
import java.util.List
import org.chocosolver.solver.Solution
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ResultFactoryFromSolverSolutions {
	
	private static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)

	static def List<AssistModelSchedulingResult> create(AssistModel assistModel, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {

		val results = newArrayList

		for (solution : solverSolutions) {
			val solNumber 		= solverSolutions.indexOf(solution) + 1
			val solTotalCount  	= solverSolutions.length
			
			val f = ModelFactory.eINSTANCE
			val result = f.createAssistModelSchedulingResult => [
				name = "Solution "+ solNumber + " of " + solTotalCount
				model = assistModel
				hyperPeriodLength = solverVariables.hypLength

				/* Create the schedule */
				schedule = new HashMap
			
				for (task : assistModel.allTasks) {
					/* Create the list of execution instances for the result */
					val task_schedule = newArrayList
			
					/* Go through the model and retrieve the values */
					for (instance : solverVariables.getSolverTasks(task)) {
						val beginValue 	= solution.getIntVal(instance.start)
						val endValue 	= solution.getIntVal(instance.end) 
						task_schedule.add(f.createTaskExecutionInstance => [begin = beginValue; end = endValue])
					}
					
					schedule.put(task, task_schedule)
				}			
			]
			
			results.add(result)	
			logger.info('''Created an ASSIST solution from solver solution «solNumber» / «solTotalCount»''')	
		}
		return results
	}
}

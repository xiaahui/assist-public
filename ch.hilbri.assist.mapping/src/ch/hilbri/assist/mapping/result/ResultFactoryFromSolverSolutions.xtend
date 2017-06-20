package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.result.Result
import ch.hilbri.assist.mapping.model.result.ResultFactory
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.chocosolver.solver.Solution
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ResultFactoryFromSolverSolutions {
	
	private static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)

	static def ArrayList<Result> create(URI modelURI, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {

		/* Load model from URI */
		val rs = new ResourceSetImpl
		val resource = rs.getResource(modelURI, true)
		val assistModel = resource.getContents().get(0) as AssistModel

		/* The list of results which will be returned for display */
		val results = newArrayList
		
		for (solution : solverSolutions) {
			
			val solNumber 		= solverSolutions.indexOf(solution) + 1
			val solTotalCount  	= solverSolutions.length
			
			val result = ResultFactory.eINSTANCE.createResult => [
				name = "Solution "+ solNumber + " of " + solTotalCount
				model = assistModel
				
				task2CoreMap = new HashMap
				for (task : model.allTasks) {
					val locVars = solverVariables.getLocationVariablesForTask(task)
					val coreIndex = solution.getIntVal(locVars.get(0))
					val core = model.allCores.get(coreIndex)	
					task2CoreMap.put(model.allTasks.indexOf(task), model.allCores.indexOf(core))
				}
			]
			results.add(result)
			logger.info('''Created an ASSIST solution from solver solution «solNumber» / «solTotalCount»''')
		
		}
		return results
	}
}
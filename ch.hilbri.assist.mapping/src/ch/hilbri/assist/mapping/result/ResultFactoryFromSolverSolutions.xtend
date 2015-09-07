package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.MappingFactory
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.search.solution.Solution
import org.chocosolver.solver.variables.IntVar
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ResultFactoryFromSolverSolutions {
	private static Logger logger = LoggerFactory.getLogger(ResultFactoryFromSolverSolutions)
	static MappingFactory f
	
	/* for partial solutions */
	static def ArrayList<Result> createPartialResult(AssistModel model, SolverVariablesContainer solverVariables, Map<IntVar, Integer> partialSolution) {
		f = MappingFactory.eINSTANCE
		val results = new ArrayList<Result>
		
		val result = createBasicResult(model, "Best partial solution")
		result.partialSolution = true
		
		for (iface : result.model.eqInterfaces)
		{
			val locVar = solverVariables.getEqInterfaceLocationVariable(iface, 0)
			
			if (partialSolution.keySet.contains(locVar)) {
				val connectorIndex 	= partialSolution.get(locVar)
				val connector 		= result.model.allConnectors.get(connectorIndex)
				result.mapping.put(iface, connector)	
			}
		}
		results.add(result)
		return results
	}
	
	static def ArrayList<Result> create(AssistModel model, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {
		f = MappingFactory.eINSTANCE
		
		/* The list of results which will be returned for display */
		val results = new ArrayList<Result>
		
		
		for (solution : solverSolutions) {
			/* Create the basic result (hardware architecture, software architecture, ...) */
			val solNumber = solverSolutions.indexOf(solution) + 1
			val solTotalCount  = solverSolutions.length
			
			val result = createBasicResult(model, "Solution "+ solNumber + " of " + solTotalCount)
			
			logger.info('''Created an ASSIST solution from solver solution «solNumber» / «solTotalCount»''')
			
			/* Add the deployment information */
			addMappingFromSolution(result, solverVariables, solution)
		
			/* Add this result to the list of results which will be returned for display */	
			results.add(result)
		}
		
		return results
	}
	
	
	static private def createBasicResult(AssistModel model, String resultName) {

		val result = f.createResult
		
		// Basic stuff
		result.name = resultName
		result.model = model
		
		// Mapping
		result.mapping = new HashMap
		
		// Evaluation			
		val e = f.createEvaluation
		e.setAbsoluteScores(new HashMap)
		e.setScaledScores(new HashMap)
		result.setEvaluation(e)
		
		return result
	}
	
	static private def void addMappingFromSolution(Result result, SolverVariablesContainer solverVariables, Solution solution) {
		for (iface : result.model.eqInterfaces)
		{
			val locVar = solverVariables.getEqInterfaceLocationVariable(iface, 0)
			val connectorIndex = solution.getIntVal(locVar)
			val connector = result.model.allConnectors.get(connectorIndex)
			
			result.mapping.put(iface, connector)
		}
	}
	
	
	
}
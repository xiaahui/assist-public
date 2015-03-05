package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.result.mapping.MappingFactory
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.chocosolver.solver.search.solution.Solution

class ResultFactoryFromSolverSolutions {
	
	static MappingFactory f
	
	static def ArrayList<Result> create(AssistModel model, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {
		f = MappingFactory.eINSTANCE
		
		/* The list of results which will be returned for display */
		val results = new ArrayList<Result>
		
		
		for (solution : solverSolutions) {
			/* Create the basic result (hardware architecture, software architecture, ...) */
			val result = createBasicResult(model, "Result-"+ solverSolutions.indexOf(solution))
			
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
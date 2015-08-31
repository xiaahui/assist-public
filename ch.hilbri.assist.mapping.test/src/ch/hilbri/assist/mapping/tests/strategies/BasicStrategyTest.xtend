package ch.hilbri.assist.mapping.tests.strategies

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.tests.constraints.AbstractMappingTest
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import java.util.ArrayList
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class BasicStrategyTest {
	
	String 				input
	AssistModel 		model
	ArrayList<Result> 	allResults
	Logger 				logger

	new() {
		logger = LoggerFactory.getLogger(AbstractMappingTest)
		input = '''
Global { 
	System name = "Example System";
}

Hardware {
	Board B1 {
		Processor P1 {
			Core C1 {
				Capacity = 100;
			}
		}
	}
}

Software {
	Application A1 {
		Core-utilization = 1;
	}
}
	
'''
	}

	@Inject
	protected ParseHelper<AssistModel> parser
	
	@Test
	def checkAllStrategiesRunProperly() {

		ModelPackage.eINSTANCE.eClass()
	
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		
		/* Fix the model */
		assertNotNull(model) 

		/* Go through all possible search strategies */
		for (searchType : SearchType.values) {
			
			/* Create the job to search for new solutions */
			val solver = new AssistSolver(model)
			solver.solverSearchStrategy = searchType
			solver.solverMaxSolutions = 10000
			
			assertNotNull(solver)
		
			/* Execute this job */
			solver.runModelPreprocessors
			solver.propagation
			solver.solutionSearch

			/* Store the results */
			allResults = solver.results
			assertNotNull(allResults)
			assertEquals(allResults.length, 2)
		}
	}
}
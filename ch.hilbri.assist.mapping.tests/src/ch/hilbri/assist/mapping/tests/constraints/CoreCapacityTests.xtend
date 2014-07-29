package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.datamodel.PostProcessor
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.SolverJob
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class CoreCapacityTests {
	
	String input = '''
Global {
	System name = "System name";
}

Hardware {
	Board Board1 {
		Processor Processor1 {
			Core Core1 { Capacity = 100; }
			Core Core2 { Capacity = 100; }
		}
	}
}

Software {
	Application A1   {	Core-utilization = 60; }
	Application A2   {	Core-utilization = 70; }
}
'''

	AssistModel model
	ArrayList<Result> allResults

	@Inject
	ParseHelper<AssistModel> parser

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	@Before
	def void loadModelAndCreateResults() {
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		/* Fix the model */
		PostProcessor.createMissingThreads(model);
		assertNotNull(model) 

		/* Create the job to search for new solutions */
		val findSolutionsJob = new SolverJob("", model, null)
		findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE)
		findSolutionsJob.setMaxSolutions(1000)
		assertNotNull(findSolutionsJob)

		/* Execute this job */
		findSolutionsJob.execute(new MyTestingMonitor, false)
		
		/* Store the results */
		allResults = findSolutionsJob.newMappingResults
		assertNotNull(allResults)
	}

	
	@Test
	def void testResultCount() {
		assertEquals(2, allResults.size)
	}
	
	@Test
	def void testResult_A1_on_Core1_and_A2_on_Core2() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core2"))
				result = r
		
		assertNotNull(result)
		
		assertEquals(result.allCores.get(0).name, "Core1")
		assertEquals(result.allCores.get(0).utilization, 60)
		
		assertEquals(result.allCores.get(1).name, "Core2")
		assertEquals(result.allCores.get(1).utilization, 70)
	}
	
	@Test
	def void testResult_A1_on_Core2_and_A2_on_Core1() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core2") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core1"))
				result = r
		
		assertNotNull(result)
		
		assertEquals(result.allCores.get(0).name, "Core1")
		assertEquals(result.allCores.get(0).utilization, 70)
		
		assertEquals(result.allCores.get(1).name, "Core2")
		assertEquals(result.allCores.get(1).utilization, 60)
	}
}
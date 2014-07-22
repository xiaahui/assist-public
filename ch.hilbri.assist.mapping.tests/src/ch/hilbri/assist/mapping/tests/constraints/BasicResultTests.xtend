package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.datamodel.PostProcessor
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.SolverJob
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.result.mapping.Compartment
import ch.hilbri.assist.result.mapping.Result
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
class BasicResultTests {
	
	@Inject
	ParseHelper<AssistModel> parser
	
	AssistModel model
	
	ArrayList<Result> allResults
	
	String input = '''
Global {
	System name = "Simple System";
}

Hardware {
	Compartment C1 {
		Box Box1 {
			Board Board1 {
				Manufacturer = "Board Vendor 1";
				Processor Processor1 {
					Manufacturer = "Freescale";
					Type = "MPC5554";
					Core Core1 {
						Capacity = 100;   
						Architecture = "e200z6";
					}
				}	
			}
		}
	}
}

Software {
	Application A1   {	
		Core-utilization = 1;
	}
	Application A2   {	
		Core-utilization = 2;
	}
}
'''

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
		assertEquals("There should be only 1 result", 1, allResults.size)
	}
	
	@Test
	def void testResultStructure() {
		val r = allResults.get(0)
		
		// Compartment
		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, r.topHardwareLevel)
		assertEquals(1, r.rootHardwareElements.size)
		assertTrue(r.rootHardwareElements.get(0) instanceof Compartment)
		val c = r.rootHardwareElements.get(0) as Compartment
		assertEquals("C1", c.name)
		
	}
}
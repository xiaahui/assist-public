package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.datamodel.PostProcessor
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.SolverJob
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.DesignAssuranceLevelType
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import ch.hilbri.assist.model.IOAdapterProtectionLevelType
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
		Manufacturer = "CompartmentManufacturer";
		Power supply = "CompartmentPowerSupply";
		Side		 = "CompartmentSide";
		Zone		 = "CompartmentZone";
		
		Box Box1 {
			Manufacturer = "BoxManufacturer";
			
			Board Board1 {
				Manufacturer = "Board Vendor 1";
				Type		 = "BoardType";
				Power supply = "BoardPowerSupply";
				Design assurance level = C;
								
				Processor Processor1 {
					Manufacturer = "Freescale";
					Type = "MPC5554";
					Core Core1 {
						Capacity = 100;   
						Architecture = "e200z6";
					}
				}
				
				RAM capacity = 12345;
				ROM capacity = 67890;
			}
		}
	}
}

Software {
	Application A1   {	
		Core-utilization 			= 10;
		Required RAM capacity 		= 12345; 
		Required ROM capacity 		= 34567; 
	    Criticality level 			= D;
	    Required IO protection 		= L2;
		Identical parallel threads 	= 3;
		Developed by 				= "Company A";
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
		assertEquals("CompartmentManufacturer", c.manufacturer)
		assertEquals("CompartmentPowerSupply", c.powerSupply)
		assertEquals("CompartmentSide", c.side)
		assertEquals("CompartmentZone", c.zone)
		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, c.hardwareLevel)
			
		// Box
		assertEquals(1, c.boxes.size)
		val b = c.boxes.get(0)
		assertEquals("Box1", b.name)
		assertEquals("BoxManufacturer", b.manufacturer)
		assertEquals(HardwareArchitectureLevelType.BOX, b.hardwareLevel)
		assertEquals(c, b.eContainer)		
		
		// Board
		assertEquals(1, b.boards.size)
		val board = b.boards.get(0)
		assertEquals("Board1", board.name)
		assertEquals("Board Vendor 1", board.manufacturer)
		assertEquals("BoardType", board.boardType)
		assertEquals("BoardPowerSupply", board.powerSupply)
		assertEquals(DesignAssuranceLevelType.C, board.assuranceLevel)
		assertEquals(12345, board.ramCapacity)
		assertEquals(67890, board.romCapacity)
		assertEquals(HardwareArchitectureLevelType.BOARD, board.hardwareLevel)
		assertEquals(b, board.eContainer)
		
		// Processor
		assertEquals(1, board.processors.size)
		val p = board.processors.get(0)
		assertEquals("Processor1", p.name)
		assertEquals("Freescale", p.manufacturer)
		assertEquals("MPC5554", p.processorType)
		assertEquals(HardwareArchitectureLevelType.PROCESSOR, p.hardwareLevel)
		assertEquals(board, p.eContainer)
		
		// Core
		assertEquals(1, p.cores.size)
		val core = p.cores.get(0)
		assertEquals("Core1", core.name)
		assertEquals(100, core.capacity)
		assertEquals("e200z6", core.architecture)
		assertEquals(HardwareArchitectureLevelType.CORE, core.hardwareLevel)
		assertEquals(p, core.eContainer)
		
		// Application
		assertEquals(1, model.applications.size)
		val a = model.applications.get(0)
		assertEquals("A1", a.name)
		assertEquals(10, a.coreUtilization)
		assertEquals(12345, a.ramUtilization)
		assertEquals(34567, a.romUtilization)
		assertEquals(DesignAssuranceLevelType.D, a.criticalityLevel)
		assertEquals(IOAdapterProtectionLevelType.LEVEL_2, a.ioAdapterProtectionLevel)
		assertEquals("Company A", a.developedBy)
		
		// Threads
		assertEquals(3, a.threads.size)
		for (i : {0..2}) {
			assertEquals(a.name + "_" + (i+1), a.threads.get(i).name)
			assertEquals(a.coreUtilization, a.threads.get(i).coreUtilization)
			assertEquals(a, a.threads.get(i).eContainer)
		}
	}
}
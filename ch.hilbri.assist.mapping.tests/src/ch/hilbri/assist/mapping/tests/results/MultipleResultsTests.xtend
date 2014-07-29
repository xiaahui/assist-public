package ch.hilbri.assist.mapping.tests.results

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Compartment
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
class MultipleResultsTests {
	
	String input = '''
Global {
	System name = "Simple System";
}

Hardware {
	Compartment C1 {
		Manufacturer = "CompartmentManufacturer1";
		Power supply = "CompartmentPowerSupply1";
		Side		 = "CompartmentSide1";
		Zone		 = "CompartmentZone1";
		
		Box Box1 {
			Manufacturer = "BoxManufacturer1";
			
			Board Board1 {
				Manufacturer = "Board Vendor 1";
				Type		 = "BoardType1";
				Power supply = "BoardPowerSupply1";
				Design assurance level = C;
								
				Processor Processor1 {
					Manufacturer = "Freescale1";
					Type = "MPC55541";
					Core Core1 {
						Capacity = 101;   
						Architecture = "e200z61";
					}
				}
				
				RAM capacity = 123451;
				ROM capacity = 678901;
			}
		}
	}
	
	Compartment C2 {
		Manufacturer = "CompartmentManufacturer2";
		Power supply = "CompartmentPowerSupply2";
		Side		 = "CompartmentSide2";
		Zone		 = "CompartmentZone2";
		
		Box Box2 {
			Manufacturer = "BoxManufacturer2";
			
			Board Board2 {
				Manufacturer = "Board Vendor 2";
				Type		 = "BoardType2";
				Power supply = "BoardPowerSupply2";
				Design assurance level = D;
								
				Processor Processor2 {
					Manufacturer = "Freescale2";
					Type = "MPC55542";
					Core Core2 {
						Capacity = 102;   
						Architecture = "e200z62";
					}
				}
				
				RAM capacity = 123452;
				ROM capacity = 678902;
			}
		}
	}
}

Software {
	Application A1   {	
		Core-utilization 			= 11;
		Required RAM capacity 		= 12341; 
		Required ROM capacity 		= 34561; 
	    Criticality level 			= D;
	    Required IO protection 		= L2;
		Identical parallel threads 	= 1;
		Developed by 				= "Company A1";
	}
 
	Application A2   {	
		Core-utilization 			= 12;
		Required RAM capacity 		= 12342; 
		Required ROM capacity 		= 34562; 
	    Criticality level 			= D;
	    Required IO protection 		= L3;
		Identical parallel threads 	= 1;
		Developed by 				= "Company A2";
	}
	
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
		assertEquals(4, allResults.size)
	}
	
	@Test
	def void testResultAllApplicationsOnCore1() {
		var Result result = null
		
		/* 
		 * find the result where all applications are mapped to core "core1"
		 */
		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core1"))
				result = r
		
		assertNotNull(result)

		/*
		 * Check the correct structure of the result
		 */ 
		testResultStructure(result)
		
		/* 
		 * Check the correct mapping of the result
		 */
		// - Core 1 contains two threads
		assertEquals(result.allCores.get(0).threads.size, 2)
		// - Core 2 contains 0 threads
		assertEquals(result.allCores.get(1).threads.size, 0)
		
		// - A1 is mapped to core 1
		assertEquals(result.applications.get(0).threads.get(0).core, result.allCores.get(0))
		// - Core 1 contains A1
		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(0)))

		// - A2 is mapped to core 1
		assertEquals(result.applications.get(1).threads.get(0).core, result.allCores.get(0))
		// - Core 1 contains A2
		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(1).threads.get(0)))
	}
	
	
	@Test
	def void testResultAllApplicationsOnCore2() {
		var Result result = null
		
		/* 
		 * find the result where all applications are mapped to core "core2"
		 */
		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core2") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core2"))
				result = r
		assertNotNull(result)

		/*
		 * Check the correct structure of the result
		 */ 
		testResultStructure(result)
		
		/* 
		 * Check the correct mapping of the result
		 */
		// - Core 1 contains 0 threads
		assertEquals(result.allCores.get(0).threads.size, 0)
		// - Core 2 contains 2 threads
		assertEquals(result.allCores.get(1).threads.size, 2)
		
		// - A1 is mapped to Core 2
		assertEquals(result.applications.get(0).threads.get(0).core, result.allCores.get(1))
		// - Core 2 contains A1
		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(0)))

		// - A2 is mapped to Core 2
		assertEquals(result.applications.get(1).threads.get(0).core, result.allCores.get(1))
		// - Core 2 contains A2
		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(1).threads.get(0)))
	}
	
	@Test
	def void testResultAppA1OnCore1AppA2OnCore2() {
		var Result result = null
		
		/* 
		 * find the result where application A1 is mapped to Core 1 and
		 * application A2 is mapped to Core 2
		 */
		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core2"))
				result = r
		assertNotNull(result)
		
		/*
		 * Check the correct structure of the result
		 */ 
		testResultStructure(result)
	
		/* 
		 * Check the correct mapping of the result
		 */
		// - Core 1 contains 1 threads
		assertEquals(result.allCores.get(0).threads.size, 1)
		// - Core 2 contains 1 threads
		assertEquals(result.allCores.get(1).threads.size, 1)
		
		// - A1 is mapped to Core 1
		assertEquals(result.applications.get(0).threads.get(0).core, result.allCores.get(0))
		// - Core 1 contains A1
		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(0)))

		// - A2 is mapped to Core 2
		assertEquals(result.applications.get(1).threads.get(0).core, result.allCores.get(1))
		// - Core 2 contains A2
		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(1).threads.get(0)))
	}

	@Test
	def void testResultAppA1OnCore2AppA2OnCore1() {
		var Result result = null
		
		/* 
		 * find the result where application A1 is mapped to Core 2 and
		 * application A2 is mapped to Core 1
		 */
		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("Core2") &&
				r.applications.get(1).threads.get(0).core.name.equals("Core1"))
				result = r
		assertNotNull(result)

		/*
		 * Check the correct structure of the result
		 */ 
		testResultStructure(result)
		
		/* 
		 * Check the correct mapping of the result
		 */
		// - Core 1 contains 1 threads
		assertEquals(result.allCores.get(0).threads.size, 1)
		// - Core 2 contains 1 threads
		assertEquals(result.allCores.get(1).threads.size, 1)
		
		// - A1 is mapped to Core 2
		assertEquals(result.applications.get(0).threads.get(0).core, result.allCores.get(1))
		// - Core 2 contains A1
		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(0)))

		// - A2 is mapped to Core 1
		assertEquals(result.applications.get(1).threads.get(0).core, result.allCores.get(0))
		// - Core 1 contains A2
		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(1).threads.get(0)))
	}	
	
	
	
	
	/* Helper Routine for the real tests */
	def void testResultStructure(Result result) {
		val r = result
		
		/* 
		 * Compartments
		 */
		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, r.topHardwareLevel)
		assertEquals(2, r.rootHardwareElements.size)
		
		// Compartment C1 {
		assertTrue(r.rootHardwareElements.get(0) instanceof Compartment)
		val c1 = r.rootHardwareElements.get(0) as Compartment
		assertEquals("C1", c1.name)
		assertEquals("CompartmentManufacturer1", c1.manufacturer)
		assertEquals("CompartmentPowerSupply1", c1.powerSupply)
		assertEquals("CompartmentSide1", c1.side)
		assertEquals("CompartmentZone1", c1.zone)
		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, c1.hardwareLevel)
		
		// Compartment C2 {
		assertTrue(r.rootHardwareElements.get(1) instanceof Compartment)
		val c2 = r.rootHardwareElements.get(1) as Compartment
		assertEquals("C2", c2.name)
		assertEquals("CompartmentManufacturer2", c2.manufacturer)
		assertEquals("CompartmentPowerSupply2", c2.powerSupply)
		assertEquals("CompartmentSide2", c2.side)
		assertEquals("CompartmentZone2", c2.zone)
		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, c2.hardwareLevel)
		
		/*
		 * Boxes
		 */
			
		// Box 1
		assertEquals(1, c1.boxes.size)
		val b1 = c1.boxes.get(0)
		assertEquals("Box1", b1.name)
		assertEquals("BoxManufacturer1", b1.manufacturer)
		assertEquals(HardwareArchitectureLevelType.BOX, b1.hardwareLevel)
		assertEquals(c1, b1.eContainer)		
		
		// Box 2
		assertEquals(1, c2.boxes.size)
		val b2 = c2.boxes.get(0)
		assertEquals("Box2", b2.name)
		assertEquals("BoxManufacturer2", b2.manufacturer)
		assertEquals(HardwareArchitectureLevelType.BOX, b2.hardwareLevel)
		assertEquals(c2, b2.eContainer)
		
		/*
		 * Boards
		 */
		 
		// Board 1 
		assertEquals(1, b1.boards.size)
		val board1 = b1.boards.get(0)
		assertEquals("Board1", board1.name)
		assertEquals("Board Vendor 1", board1.manufacturer)
		assertEquals("BoardType1", board1.boardType)
		assertEquals("BoardPowerSupply1", board1.powerSupply)
		assertEquals(DesignAssuranceLevelType.C, board1.assuranceLevel)
		assertEquals(123451, board1.ramCapacity)
		assertEquals(678901, board1.romCapacity)
		assertEquals(HardwareArchitectureLevelType.BOARD, board1.hardwareLevel)
		assertEquals(b1, board1.eContainer)
		
		// Board 2 
		assertEquals(1, b2.boards.size)
		val board2 = b2.boards.get(0)
		assertEquals("Board2", board2.name)
		assertEquals("Board Vendor 2", board2.manufacturer)
		assertEquals("BoardType2", board2.boardType)
		assertEquals("BoardPowerSupply2", board2.powerSupply)
		assertEquals(DesignAssuranceLevelType.D, board2.assuranceLevel)
		assertEquals(123452, board2.ramCapacity)
		assertEquals(678902, board2.romCapacity)
		assertEquals(HardwareArchitectureLevelType.BOARD, board2.hardwareLevel)
		assertEquals(b2, board2.eContainer)
		
		/*
		 * Processors
		 */

		// Processor 1
		assertEquals(1, board1.processors.size)
		val p1 = board1.processors.get(0)
		assertEquals("Processor1", p1.name)
		assertEquals("Freescale1", p1.manufacturer)
		assertEquals("MPC55541", p1.processorType)
		assertEquals(HardwareArchitectureLevelType.PROCESSOR, p1.hardwareLevel)
		assertEquals(board1, p1.eContainer)

		// Processor 2
		assertEquals(1, board2.processors.size)
		val p2 = board2.processors.get(0)
		assertEquals("Processor2", p2.name)
		assertEquals("Freescale2", p2.manufacturer)
		assertEquals("MPC55542", p2.processorType)
		assertEquals(HardwareArchitectureLevelType.PROCESSOR, p2.hardwareLevel)
		assertEquals(board2, p2.eContainer)

		/*
		 * Cores
		 */
		 
		// Core 1
		assertEquals(1, p1.cores.size)
		val core1 = p1.cores.get(0)
		assertEquals("Core1", core1.name)
		assertEquals(101, core1.capacity)
		assertEquals("e200z61", core1.architecture)
		assertEquals(HardwareArchitectureLevelType.CORE, core1.hardwareLevel)
		assertEquals(p1, core1.eContainer)

		// Core 2
		assertEquals(1, p2.cores.size)
		val core2 = p2.cores.get(0)
		assertEquals("Core2", core2.name)
		assertEquals(102, core2.capacity)
		assertEquals("e200z62", core2.architecture)
		assertEquals(HardwareArchitectureLevelType.CORE, core2.hardwareLevel)
		assertEquals(p2, core2.eContainer)

		/*
		 * Applications
		 */
		
		assertEquals(2, model.applications.size)
				
		// Application A1
		val a1 = model.applications.get(0)
		assertEquals("A1", a1.name)
		assertEquals(11, a1.coreUtilization)
		assertEquals(12341, a1.ramUtilization)
		assertEquals(34561, a1.romUtilization)
		assertEquals(DesignAssuranceLevelType.D, a1.criticalityLevel)
		assertEquals(IOAdapterProtectionLevelType.LEVEL_2, a1.ioAdapterProtectionLevel)
		assertEquals("Company A1", a1.developedBy)

		// Application A1
		val a2 = model.applications.get(1)
		assertEquals("A2", a2.name)
		assertEquals(12, a2.coreUtilization)
		assertEquals(12342, a2.ramUtilization)
		assertEquals(34562, a2.romUtilization)
		assertEquals(DesignAssuranceLevelType.D, a2.criticalityLevel)
		assertEquals(IOAdapterProtectionLevelType.LEVEL_3, a2.ioAdapterProtectionLevel)
		assertEquals("Company A2", a2.developedBy)

		/*
		 * Threads
		 */
		
		// A1 Threads
		assertEquals(1, a1.threads.size)
		assertEquals(a1.name + "_" + 1, a1.threads.get(0).name)
		assertEquals(a1.coreUtilization, a1.threads.get(0).coreUtilization)
		assertEquals(a1, a1.threads.get(0).eContainer)
		
		// A2 Threads
		assertEquals(1, a2.threads.size)
		assertEquals(a2.name + "_" + 1, a2.threads.get(0).name)
		assertEquals(a2.coreUtilization, a2.threads.get(0).coreUtilization)
		assertEquals(a2, a2.threads.get(0).eContainer)
	}

//	@Test
//	def void testMappingAssignment() {
//		
//		// Core view
//		val core = allResults.get(0).allCores.get(0)
//		assertEquals(3, core.threads.size)
//		for (thread : core.threads)
//			assertTrue(allResults.get(0).allThreads.contains(thread))
//	
//		// Thread view
//		for (thread : allResults.get(0).allThreads) 
//			assertEquals(thread.core, core)
//	
//	}

}
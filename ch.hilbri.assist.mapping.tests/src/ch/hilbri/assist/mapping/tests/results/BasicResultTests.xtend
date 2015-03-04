package ch.hilbri.assist.mapping.tests.results

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class BasicResultTests extends AbstractMappingTest{
	
	new() {
		input = '''

Global {
	System name = "Simple System";
}

Hardware {
	Compartment C1 {
		Manufacturer = "CompartmentManufacturer";
		PowerSupply = "CompartmentPowerSupply";
		Side		 = "CompartmentSide";
		Zone		 = "CompartmentZone";
		
		Box Box1 {
			Manufacturer = "BoxManufacturer";
			
			Board Board1 {
				Manufacturer = "Board Vendor 1";
				Type		 = "BoardType";
				PowerSupply = "BoardPowerSupply";
				DesignAssuranceLevel = C;
				RAM capacity = 98765;
				ROM capacity = 67890;
								
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
		Core-utilization 			= 10;
		Required RAM capacity 		= 123; 
		Required ROM capacity 		= 456; 
	    Criticality level 			= D;
	    Required IO protection 		= L2;
		Identical parallel threads 	= 3;
		Developed by 				= "Company A";
	}
	
}
'''
	}

//	@Test
//	def void testResultCount() {
//		assertEquals("There should be only 1 result", 1, allResults.size)
//	}
//	
//	@Test
//	def void testResultStructure() {
//		val r = allResults.get(0)
//		
//		// Compartment
//		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, r.topHardwareLevel)
//		assertEquals(1, r.rootHardwareElements.size)
//		assertTrue(r.rootHardwareElements.get(0) instanceof Compartment)
//		val c = r.rootHardwareElements.get(0) as Compartment
//		assertEquals("C1", c.name)
//		assertEquals("CompartmentManufacturer", c.manufacturer)
//		assertEquals("CompartmentPowerSupply", c.powerSupply)
//		assertEquals("CompartmentSide", c.side)
//		assertEquals("CompartmentZone", c.zone)
//		assertEquals(HardwareArchitectureLevelType.COMPARTMENT, c.hardwareLevel)
//			
//		// Box
//		assertEquals(1, c.boxes.size)
//		val b = c.boxes.get(0)
//		assertEquals("Box1", b.name)
//		assertEquals("BoxManufacturer", b.manufacturer)
//		assertEquals(HardwareArchitectureLevelType.BOX, b.hardwareLevel)
//		assertEquals(c, b.eContainer)		
//		
//		// Board
//		assertEquals(1, b.boards.size)
//		val board = b.boards.get(0)
//		assertEquals("Board1", board.name)
//		assertEquals("Board Vendor 1", board.manufacturer)
//		assertEquals("BoardType", board.boardType)
//		assertEquals("BoardPowerSupply", board.powerSupply)
//		assertEquals(DesignAssuranceLevelType.C, board.assuranceLevel)
//		assertEquals(98765, board.ramCapacity)
//		assertEquals(67890, board.romCapacity)
//		assertEquals(HardwareArchitectureLevelType.BOARD, board.hardwareLevel)
//		assertEquals(b, board.eContainer)
//		
//		// Processor
//		assertEquals(1, board.processors.size)
//		val p = board.processors.get(0)
//		assertEquals("Processor1", p.name)
//		assertEquals("Freescale", p.manufacturer)
//		assertEquals("MPC5554", p.processorType)
//		assertEquals(HardwareArchitectureLevelType.PROCESSOR, p.hardwareLevel)
//		assertEquals(board, p.eContainer)
//		
//		// Core
//		assertEquals(1, p.cores.size)
//		val core = p.cores.get(0)
//		assertEquals("Core1", core.name)
//		assertEquals(100, core.capacity)
//		assertEquals("e200z6", core.architecture)
//		assertEquals(HardwareArchitectureLevelType.CORE, core.hardwareLevel)
//		assertEquals(p, core.eContainer)
//		
//		// Application
//		assertEquals(1, model.applications.size)
//		val a = model.applications.get(0)
//		assertEquals("A1", a.name)
//		assertEquals(10, a.coreUtilization)
//		assertEquals(123, a.ramUtilization)
//		assertEquals(456, a.romUtilization)
//		assertEquals(DesignAssuranceLevelType.D, a.criticalityLevel)
//		assertEquals(IOAdapterProtectionLevelType.LEVEL_2, a.ioAdapterProtectionLevel)
//		assertEquals("Company A", a.developedBy)
//		
//		// Threads
//		assertEquals(3, a.threads.size)
//		for (i : {0..2}) {
//			assertEquals(a.name + "_" + (i+1), a.threads.get(i).name)
//			assertEquals(a.coreUtilization, a.threads.get(i).coreUtilization)
//			assertEquals(a, a.threads.get(i).eContainer)
//		}
//	}
//
//	@Test
//	def void testGetAllAccessFunctions() {
//		val result = allResults.get(0)
//		
//		// AllCompartments
//		val allCompartmentsList = result.allCompartments
//		assertEquals(1, allCompartmentsList.size)
//		val compartment = allCompartmentsList.get(0)
//		assertTrue(compartment instanceof Compartment)
//		assertEquals(result.rootHardwareElements.get(0), compartment)
//		
//		// AllBoxes
//		val allBoxesList = result.allBoxes
//		assertEquals(1, allBoxesList.size)
//		val box = allBoxesList.get(0)
//		assertTrue(box instanceof Box)
//		assertEquals((result.rootHardwareElements.get(0) as Compartment).boxes.get(0), box)
//		
//		// AllBoards
//		val allBoardsList = result.allBoards
//		assertEquals(1, allBoardsList.size)
//		val board = allBoardsList.get(0)
//		assertTrue(board instanceof Board)
//		assertEquals((result.rootHardwareElements.get(0) as Compartment).boxes.get(0).boards.get(0), board)
//		
//		// AllProcessors
//		val allProcessorsList = result.allProcessors
//		assertEquals(1, allProcessorsList.size)
//		val processor = allProcessorsList.get(0)
//		assertTrue(processor instanceof Processor)
//		assertEquals((result.rootHardwareElements.get(0) as Compartment).boxes.get(0).boards.get(0).processors.get(0), processor)
//	
//		// AllCores
//		val allCoresList = result.allCores
//		assertEquals(1, allCoresList.size)
//		val core = allCoresList.get(0)
//		assertTrue(core instanceof Core)
//		assertEquals((result.rootHardwareElements.get(0) as Compartment).boxes.get(0).boards.get(0).processors.get(0).cores.get(0), core)
//	
//		// AllThreads
//		val allThreadsList = result.allThreads
//		assertEquals(3, allThreadsList.size)
//		for (i : {0..2}) {
//			val thread = allThreadsList.get(i)
//			assertTrue(thread instanceof Thread)
//			assertEquals(result.applications.get(0).threads.get(i), thread)	
//		}
//	}
//
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
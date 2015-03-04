package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class ROMCapacityTests extends AbstractMappingTest {

	new() {
		input = '''

Global {
	System name = "System name";
}

Hardware {
	Board Board1 {
		ROM capacity = 100;
		
		Processor Processor1 {
			Core Core1 { Capacity = 100; }
		}
		
	}
	
	Board Board2 {
		ROM capacity = 100;
		
		Processor Processor2 {
			Core Core2 { Capacity = 100; }
		}

	}
}

Software {
	Application A1   {	
		Core-utilization = 1;
		Required ROM capacity = 70;
	}
	
	Application A2   {	
		Core-utilization = 1;
		Required ROM capacity = 60;
	}
}

'''
	}

//	@Test
//	def void testResultCount() {
//		assertEquals(2, allResults.size)
//	}
//
//	@Test
//	def void testResult_A1_on_Core1_and_A2_on_Core2() {
//		var Result result = null
//
//		for (r : allResults)
//			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
//				r.applications.get(1).threads.get(0).core.name.equals("Core2"))
//				result = r
//
//		assertNotNull(result)
//
//		assertEquals(result.allBoards.get(0).name, "Board1")
//		assertEquals(result.allBoards.get(0).romUtilization, 70)
//		assertEquals(result.allBoards.get(0).romCapacity, 100)
//
//		assertEquals(result.allBoards.get(1).name, "Board2")
//		assertEquals(result.allBoards.get(1).romUtilization, 60)
//		assertEquals(result.allBoards.get(1).romCapacity, 100)
//	}
//
//	@Test
//	def void testResult_A1_on_Core2_and_A2_on_Core1() {
//		var Result result = null
//
//		for (r : allResults)
//			if (r.applications.get(0).threads.get(0).core.name.equals("Core2") &&
//				r.applications.get(1).threads.get(0).core.name.equals("Core1"))
//				result = r
//
//		assertNotNull(result)
//
//		assertEquals(result.allBoards.get(0).name, "Board1")
//		assertEquals(result.allBoards.get(0).romUtilization, 60)
//		assertEquals(result.allBoards.get(0).romCapacity, 100)
//
//		assertEquals(result.allBoards.get(1).name, "Board2")
//		assertEquals(result.allBoards.get(1).romUtilization, 70)
//		assertEquals(result.allBoards.get(1).romCapacity, 100)
//	}

}

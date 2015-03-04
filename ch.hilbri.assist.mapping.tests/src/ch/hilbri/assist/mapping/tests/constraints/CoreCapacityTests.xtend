package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class CoreCapacityTests extends AbstractMappingTest {
	
	new() {
		input = '''

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
//		assertEquals(result.allCores.get(0).name, "Core1")
//		assertEquals(result.allCores.get(0).utilization, 60)
//		
//		assertEquals(result.allCores.get(1).name, "Core2")
//		assertEquals(result.allCores.get(1).utilization, 70)
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
//		assertEquals(result.allCores.get(0).name, "Core1")
//		assertEquals(result.allCores.get(0).utilization, 70)
//		
//		assertEquals(result.allCores.get(1).name, "Core2")
//		assertEquals(result.allCores.get(1).utilization, 60)
//	}
}
package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class NoPermutationsAdvancedTests extends AbstractMappingTest {

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
	Application A1   {	
		Core-utilization = 70;
		Identical parallel threads = 2; 
	}
	
	Application A2   {	
		Core-utilization = 25;
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
//	def void testResultThread1OnCore1_and_Thread2OnCore2_and_A2OnCore1() {
//		
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
//				r.applications.get(0).threads.get(1).core.name.equals("Core2") &&
//				r.applications.get(1).threads.get(0).core.name.equals("Core1"))
//				result = r
//		
//		assertNotNull(result)
//		
//		/* Check for correct cores */
//		assertEquals (result.allCores.get(0).name, "Core1")
//		assertEquals (result.allCores.get(1).name, "Core2")
//		
//		/* Check for correct assignments */
//		assertEquals(2, result.allCores.get(0).threads.size)
//		assertEquals(1, result.allCores.get(1).threads.size)
//		
//		/* - A1:Thread 1 is mapped to core 1 */		
//		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(0)))
//		
//		/* - A1:Thread 2 is mapped to core 2 */
//		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(1)))
//		
//		/* - A2:Thread1 is mapped to core 1 */
//		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(1).threads.get(0)))
//		
//	}
//	
//	@Test
//	def void testResultThread1OnCore1_and_Thread2OnCore2_and_A2OnCore2() {
//		
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.applications.get(0).threads.get(0).core.name.equals("Core1") &&
//				r.applications.get(0).threads.get(1).core.name.equals("Core2") &&
//				r.applications.get(1).threads.get(0).core.name.equals("Core2"))
//				result = r
//		
//		assertNotNull(result)
//		
//		/* Check for correct cores */
//		assertEquals (result.allCores.get(0).name, "Core1")
//		assertEquals (result.allCores.get(1).name, "Core2")
//		
//		/* Check for correct assignments */
//		assertEquals(1, result.allCores.get(0).threads.size)
//		assertEquals(2, result.allCores.get(1).threads.size)
//		
//		/* - A1:Thread 1 is mapped to core 1 */		
//		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(0)))
//		
//		/* - A1:Thread 2 is mapped to core 2 */
//		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(1)))
//		
//		/* - A2:Thread1 is mapped to core 2 */
//		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(1).threads.get(0)))
//		
//	}
}

package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class AllApplicationThreadsOnSameBoardTests extends AbstractMappingTest {
 	new() {
		input = '''

Global {
	System name = "System name";
}

Hardware {
	Board Board1 {
		Processor Processor1 {
			Core Core1 { Capacity = 100; }
		}
	}
	
	Board Board2 {
		Processor Processor2 {
			Core Core2 { Capacity = 100; }
		}
	}
}

Software {
	Application A1   {	
		Core-utilization = 40; 		
		Identical parallel threads = 2;
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
//	def void testResultCore2IsEmpty() {
//			
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.allCores.get(1).notUsed) result = r
//		
//		assertNotNull(result)
//		
//		/* Check for correct cores */
//		assertEquals (result.allCores.get(0).name, "Core1")
//		
//		/* Check for correct assignments */
//		assertEquals(2, result.allCores.get(0).threads.size)
//		assertEquals(0, result.allCores.get(1).threads.size)
//		
//		/* - A1:Thread 1 is mapped to core 1 */		
//		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(0)))
//		
//		/* - A1:Thread 2 is mapped to core 1 */
//		assertTrue(result.allCores.get(0).threads.contains(result.applications.get(0).threads.get(1)))
//	}
//	
//	@Test
//	def void testResultCore1IsEmpty() {
//			
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.allCores.get(0).notUsed) result = r
//		
//		assertNotNull(result)
//		
//		/* Check for correct cores */
//		assertEquals (result.allCores.get(1).name, "Core2")
//		
//		/* Check for correct assignments */
//		assertEquals(0, result.allCores.get(0).threads.size)
//		assertEquals(2, result.allCores.get(1).threads.size)
//		
//		/* - A1:Thread 1 is mapped to core 2 */		
//		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(0)))
//		
//		/* - A1:Thread 2 is mapped to core 2 */
//		assertTrue(result.allCores.get(1).threads.contains(result.applications.get(0).threads.get(1)))
//	}
	

}
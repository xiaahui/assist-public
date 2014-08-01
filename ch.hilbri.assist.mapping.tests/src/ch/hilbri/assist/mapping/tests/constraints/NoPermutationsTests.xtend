package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test

import static org.junit.Assert.*

class NoPermutationsTests extends AbstractMappingTest {

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
	
}

'''
	}

	@Test
	def void testResultCount() {
		assertEquals(1, allResults.size)
	}
	
	@Test
	def void testResultThread1OnCore1_and_Thread2OnCore2() {
		val result = allResults.get(0)
		
		assertNotNull(result)
		
		/* Thread 1 is mapped to core 1 */
		assertEquals(result.applications.get(0).threads.get(0), result.allCores.get(0).threads.get(0))
		
		/* Thread 2 is mapped to core 2 */
		assertEquals(result.applications.get(0).threads.get(1), result.allCores.get(1).threads.get(0))
		
	}
}

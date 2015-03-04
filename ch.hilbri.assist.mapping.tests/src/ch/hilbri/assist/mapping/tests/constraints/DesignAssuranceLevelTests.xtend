package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest

class DesignAssuranceLevelTests extends AbstractMappingTest {
	new() {
		input = '''

Global { 
	System name = "SystemA";
}

Hardware {
	Board B_A {
		DesignAssuranceLevel = A;
		Processor P_A {
			Core C_A { Capacity = 80; }
		}
 	}
 	
 	Board B_B {
		DesignAssuranceLevel = B;
		Processor P_B {
			Core C_B { Capacity = 80; }
		}
 	}
 	
 	Board B_C {
		DesignAssuranceLevel = C;
		Processor P_C {
			Core C_C { Capacity = 80; }
		}
 	}
 	
}

Software {
	Application A1 {
		Core-utilization = 0;
		Criticality level = B;
	}
'''
	}
	
//	@Test
//	def void testResultCount() {
//		assertEquals(2, allResults.size)
//	}
//	
//	@Test
//	def void testA1onBoardB_A() {
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.applications.get(0).threads.get(0).core.name.equals("C_A")) result = r
//			
//		assertNotNull(result)
//	}
//	
//	@Test
//	def void testA1onBoardB_B() {
//		var Result result = null
//
//		for (r : allResults) 
//			if (r.applications.get(0).threads.get(0).core.name.equals("C_B")) result = r
//			
//		assertNotNull(result)
//	}
}
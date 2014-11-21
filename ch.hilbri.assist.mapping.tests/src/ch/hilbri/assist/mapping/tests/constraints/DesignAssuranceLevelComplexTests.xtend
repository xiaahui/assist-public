package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test

import static org.junit.Assert.*

class DesignAssuranceLevelComplexTests extends AbstractMappingTest {
	new() {
		input = '''

Global { 
	System name = "SystemA";
}

Hardware {
	Board B1 {
		Design assurance level = A;
		Processor P_A {
			Core C_A { Capacity = 80; }
		}
 	}
 	
 	Board B2 {
		Design assurance level = B;
		Processor P_B {
			Core C_B { Capacity = 80; }
		}
 	}
 	
 	Board B3 {
		Design assurance level = C;
		Processor P_C {
			Core C_C { Capacity = 80; }
		}
 	}
 	
 	Board B4 {
		Design assurance level = D;
		Processor P_D {
			Core C_D { Capacity = 80; }
		}
 	}
 	
}

Software {
	Application A1 {
		Core-utilization = 0;
		Criticality level = B;
	}
	
	Application A2 {
		Core-utilization = 0;
		Criticality level = C;
	}
'''
	}
	
	@Test
	def void testResultCount() {
		assertEquals(6, allResults.size)
	}
	
	@Test
	def void test_A1onB1_And_A2onB1() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_A") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_A")) 
				result = r
			
		assertNotNull(result)
	}
	
	@Test
	def void test_A1onB1_And_A2onB2() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_A") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_B")) 
				result = r
			
		assertNotNull(result)
	}
	
	@Test
	def void test_A1onB1_And_A2onB3() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_A") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_C")) 
				result = r
			
		assertNotNull(result)
	}
	
	@Test
	def void test_A1onB2_And_A2onB1() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_B") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_A")) 
				result = r
			
		assertNotNull(result)
	}
	
	@Test
	def void test_A1onB2_And_A2onB2() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_B") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_B")) 
				result = r
			
		assertNotNull(result)
	}
	
	@Test
	def void test_A1onB2_And_A2onB3() {
		var Result result = null

		for (r : allResults) 
			if (r.applications.get(0).threads.get(0).core.name.equals("C_B") &&
				r.applications.get(1).threads.get(0).core.name.equals("C_C")) 
				result = r
			
		assertNotNull(result)
	}
}
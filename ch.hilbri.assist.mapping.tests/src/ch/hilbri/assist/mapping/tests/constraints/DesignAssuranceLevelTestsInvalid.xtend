package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test

import static org.junit.Assert.*

class DesignAssuranceLevelTestsInvalid extends AbstractMappingTest {
	new() {
		input = '''

Global { 
	System name = "SystemA";
}

Hardware {
	Board B_A {
		DesignAssuranceLevel = B;
		Processor P_A {
			Core C_A { Capacity = 80; }
		}
 	}
}

Software {
	Application A1 {
		Core-utilization = 0;
		Criticality level = A;
	}
'''
	}
	
	@Test
	def void testResultCount() {
		assertEquals(0, allResults.size)
	}
}
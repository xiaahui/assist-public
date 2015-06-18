package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test

import static org.junit.Assert.*

class ProtectionLevelTest2 extends AbstractMappingTest {
	new() {
		input = '''
Global { 
	Name = "Example System";
	
	Protection Level Definitions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L5, L8;
	}

}

Compartment C1 {
	RDC RDC1 {
		Location = "A";
		Connector Connector1 {
			"CustomType1" = 1 with protection level L1;
		}
		
		Connector Connector2 {
			"CustomType1" = 1 with protection level L5;
		}
		
		Connector Connector3 {
			"CustomType1" = 1 with protection level L8;
		}
	}
}


Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}
'''
	}
	
	
	@Test
	def void testResultCount() {
		assertEquals(2, allResults.size)
	}
	
	@Test
	def void testResult() {
		for (r : allResults) {
			assertNotEquals("Connector1", r.mapping.get(model.eqInterfaces.get(0)).name)	
		}
		
	}
}
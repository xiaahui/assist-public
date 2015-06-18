package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test

import static org.junit.Assert.*

class ProtectionLevelTest4 extends AbstractMappingTest {
	new() {
		input = '''
Global { 
	Name = "Example System";
	
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L8;
		RDC.Location = "B" And Equipment.EmhZone1 = "A" -> L5;
	}

}

Compartment C1 {
	RDC RDC1 {
		Location = "A";
		Connector Connector1 {
			"CustomType1" = 1 with protection level L5;
		}
	}
	
	RDC RDC2 {
		Location = "B";
		Connector Connector2 {
			"CustomType1" = 1 with protection level L5;
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
		assertEquals(1, allResults.size)
	}
	
	@Test
	def void testResult() {
		for (r : allResults) {
			assertNotEquals("Connector1", r.mapping.get(model.eqInterfaces.get(0)).name)	
		}
		
	}
}
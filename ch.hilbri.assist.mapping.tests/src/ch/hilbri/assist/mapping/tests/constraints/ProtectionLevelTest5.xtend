package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test

import static org.junit.Assert.*

class ProtectionLevelTest5 extends AbstractMappingTest {
	new() {
		input = '''
Global { 
	Name = "Example System";
	
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L3, L5, L8;
		RDC.Location = "B" And Equipment.EmhZone1 = "A" -> L5, L8;
		RDC.Location = "C" And Equipment.EmhZone1 = "A" -> L8;
	}

}

Compartment C1 {
	RDC RDC1 {
		Location = "A";
		Connector Connector1 {
			"CustomType1" = 1 with protection level L1;
			"CustomType1" = 1 with protection level L2;
			"CustomType1" = 1 with protection level L3;
			
		}
	}
	
	RDC RDC2 {
		Location = "B";
		Connector Connector2 {
			"CustomType1" = 1 with protection level L5;
		}
	}
	
	RDC RDC3 {
		Location = "C";
		Connector Connector3 {
			"CustomType1" = 1 with protection level L7;
		}
	}
}


Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
	
	Interface Iface2 {
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
			assertNotEquals("Connector3", r.mapping.get(model.eqInterfaces.get(0)).name)	
			assertNotEquals("Connector3", r.mapping.get(model.eqInterfaces.get(1)).name)
			assertNotEquals(r.mapping.get(model.eqInterfaces.get(0)), r.mapping.get(model.eqInterfaces.get(1)))
		}
		
	}
}
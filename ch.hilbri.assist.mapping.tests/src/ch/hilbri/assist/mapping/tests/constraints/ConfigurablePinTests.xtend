package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test
import static org.junit.Assert.*

class ConfigurablePinTests extends AbstractMappingTest {
	
	new() {
		input = 
'''
Global { 
	Name = "Example System"; 
	
	Compatible Interface Types {
		"T2" -> "T1";
	}
}

Compartment C1 {
	RDC RDC1 {
		Connector Connector1 {
			"T1" = 1;
		}

		Connector Connector2 {
			"T1" = 1;
		}
	}
}


Interfaces {
	Interface Iface1 {	Type = "T1"; 	}
	Interface Iface2 {	Type = "T2";	}
}
'''
	}
	
	@Test
	def testResultCount() {
		assertEquals(2, allResults.size)
	}
	
	@Test
	def testResults() {
		for (r : allResults) {
			if (r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).name.equals("Connector1"))
				assertEquals("Connector2", r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).name)
			
			if (r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).name.equals("Connector2"))
				assertEquals("Connector1", r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).name)
		}
	}
}
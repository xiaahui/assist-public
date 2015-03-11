package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.assertEquals

class DislocalityTests extends AbstractMappingTest {
	new() {
		input = 
'''
Global { 
	System name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			"CustomType0" = 2;
			"CustomType13" = 3;
		}

		Connector Connector2 {
			"CustomType4" = 2;
		}
	}
}


Interfaces {
	Interface Iface1 {
		Type = "CustomType0";
	}
	
	Interface Iface2 {
		Type = "CustomType0";
	}
	
	Interface Iface3 {
		Type = "CustomType4";
	}
}

InterfaceGroups {
	Group G1 { Iface1, Iface2 };
}

Restrictions {
 G1, Iface3 dislocal up to Connector;
}
'''
	}
	
	
	@Test
	def void testResultCount() {
		assertEquals(1, allResults.size)
	}
}
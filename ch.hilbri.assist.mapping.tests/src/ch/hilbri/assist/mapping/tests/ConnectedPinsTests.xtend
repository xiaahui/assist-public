package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class ConnectedPinsTests extends AbstractMappingTest {
	
	@Test
	def void configurableAndConnectedInterfaceTypes() {
		val input = '''
Global { 
	Name = "System";
	Compatible Interface Types { 
		"T0" -> "T1";
		"T3" -> "T1";
	}
}

Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Conn1{
				P1: "T0";
				P2: "T1";
				P3: "T1";
			}
			Connected Pins {
				C1.RDC1.Conn1.P2, C1.RDC1.Conn1.P3 are connected;
			}
		}
	}
}


Interfaces {
	Interface Iface1 {
		Type = "T0";
	}
	
	Interface Iface2 {
		Type = "T3";
	}
}
'''	
		loadModelAndCreateResults(input)
		assertEquals(2, allResults.size)
	}
}
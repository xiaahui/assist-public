package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test

import static org.junit.Assert.*

class ConnectedPinsTest2 extends AbstractMappingTest {
	new() {
		input = '''
Global {
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
		Connector Connector1 {
			Name = Pin1 	"T1" = 1;
			Name = Pin2 	"T2" = 1 with protection level L1;
			"T3" = 5;
		}
		Connector Connector2 {
			Name = Pin3 	"T1" = 1;
			Name = Pin4 	"T2" = 1 with protection level L5;
			
		}
		Connector Connector3 {
			Name = Pin5 "T1" = 1;
		}
		Connector Connector4 {
			Name = Pin6 "T2" = 1;
		}
		Pins {
			C1.RDC1.Connector1.Pin2, C1.RDC1.Connector2.Pin4 are connected;
		}
	}
}

Interfaces {
	Interface Iface1 {
		Type = "T2";
	}

	Interface Iface2 {
		Type = "T2";
	}
}

'''
	}
	
	
	@Test
	def void testResultCount() {
		assertEquals(4, allResults.size)
	}
	
	@Test
	def void testResults() {
		for (r : allResults) {
			val list = model.eqInterfaces.map[r.mapping.get(it)].map[name]
			assertEquals(1, list.filter[it.equals("Connector1") || it.equals("Connector2")].length)  
		}

	}
}
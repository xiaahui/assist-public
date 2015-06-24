package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test

import static org.junit.Assert.*

class ConnectedPinsTest1 extends AbstractMappingTest {
	new() {
		input = '''
Global { 
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
		Connector Connector1 {
			Name = Pin1 "T1" = 1;
		}
		
		Connector Connector2 {
			Name = Pin2 "T1" = 1;
		}
		
		Connector Connector3 {
			Name = Pin3 "T1" = 1;
		}
		
		Connector Connector4 {
			Name = Pin4 "T1" = 1;
		}

		Pins {
			C1.RDC1.Connector1.Pin1, C1.RDC1.Connector2.Pin2 are connected;
			C1.RDC1.Connector3.Pin3, C1.RDC1.Connector4.Pin4 are connected;
		}	
	}
}


Interfaces {
	Interface Iface1 {
		Type = "T1";
	}
	
	Interface Iface2 {
		Type = "T1";
	}
}
'''
	}
	
	
	@Test
	def void testResultCount() {
		assertEquals(8, allResults.size)
	}
	
	@Test
	def void testResults() {
		for (r : allResults) {
			
			val list = model.eqInterfaces.map[r.mapping.get(it)].map[name]
			
			assertEquals(1, list.filter[it.equals("Connector1") || it.equals("Connector2")].length)  
			assertEquals(1, list.filter[it.equals("Connector3") || it.equals("Connector4")].length) 
		}

	}
}
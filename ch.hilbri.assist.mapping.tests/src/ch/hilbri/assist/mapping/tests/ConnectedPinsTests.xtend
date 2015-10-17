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
			}
			Connector Conn2{
				P3: "T1";
			}
			Connected Pins {
				C1.RDC1.Conn1.P2, C1.RDC1.Conn2.P3 are connected;
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
	
	@Test
	def void basicTest1() {
		val input = '''
Global {
	Name = "Example System";
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin1 : "T1";
			}
			Connector Connector2 {
				Pin2 : "T1";
			}
			Connector Connector3 {
				Pin3 : "T1";
			}
			Connector Connector4 {
				Pin4 : "T1";
			}
			Connected Pins {
				C1.RDC1.Connector1.Pin1, C1.RDC1.Connector2.Pin2 are connected;
				C1.RDC1.Connector3.Pin3, C1.RDC1.Connector4.Pin4 are connected;
			}
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
		
		loadModelAndCreateResults(input)
		assertEquals(8, allResults.size)
		for (r : allResults) {
			val list = model.eqInterfaces.map[r.mapping.get(it)].map[name]
			assertEquals(1, list.filter[it.equals("Pin1") || it.equals("Pin2")].length)  
			assertEquals(1, list.filter[it.equals("Pin3") || it.equals("Pin4")].length) 
		}
	}
	
	@Test
	def basicTest2() {
		val input = '''
Global {
	Name = "Example System";
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin1 : "T1";
				Pin2 : "T2" protection level L1;
				Pin3 : "T3";
				Pin4 : "T3";
				Pin5 : "T3";
			}
			Connector Connector2 {
				Pin6 : "T1";
				Pin7 : "T2" protection level L5;
			}
			Connector Connector3 {
				Pin8 : "T1";
			}
			Connector Connector4 {
				Pin9 : "T2";
			}
			Connected Pins {
				C1.RDC1.Connector1.Pin2, C1.RDC1.Connector2.Pin7 are connected;
			}
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
		
		loadModelAndCreateResults(input)
		assertEquals(4, allResults.size)
		for (r : allResults) {
			val list = model.eqInterfaces.map[r.mapping.get(it).connector].map[name]
			assertEquals(1, list.filter[it.equals("Connector1") || it.equals("Connector2")].length)  
		}
	}
}
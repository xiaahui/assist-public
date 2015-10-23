package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class InterfaceTypeTests extends AbstractMappingTest {
	
	@Test
	def void basicInterfaceTypesTest() {
		val input = '''
Global { 
	Name = "System";
}

Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Conn1{
				P1: "T0";
				P2: "T1";
				P3: "T2";
			}
		}
	}
}


Interfaces {
	Interface Iface1 {
		Type = "T0";
	}
	
	Interface Iface2 {
		Type = "T1";
	}
}
'''		
		loadModelAndCreateResults(input)
		assertEquals(1, allResults.size)
		val r = allResults.get(0)
		assertEquals(r.mapping.get(model.eqInterfaces.filter[name=="Iface1"].get(0)).name, "P1")
		assertEquals(r.mapping.get(model.eqInterfaces.filter[name=="Iface2"].get(0)).name, "P2")
		assertNull(r.getEqInterfaceForPin(model.pins.filter[name=="P3"].get(0)))
	}

	@Test
	def void configurableInterfaceTypes() {
		val input = '''
Global { 
	Name = "System";
	Compatible Interface Types { "T3" -> "T1", "T2"; }
}

Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Conn1{
				P1: "T0";
				P2: "T1";
				P3: "T2";
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
		assertEquals(1, allResults.size)
	}
	
		@Test
	def void configurableInterfaceTypes2() {
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
				P3: "T2";
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
		assertEquals(1, allResults.size)
	}

	@Test
	def void configurableInterfaceTypes3() {
		val input = '''
Global { 
	Name = "System";
	Compatible Interface Types { 
		"T0" -> "T1";
		"T3" -> "T1", "T2";
	}
}

Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Conn1{
				P1: "T0";
				P2: "T1";
				P3: "T2";
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
		assertEquals(1, allResults.size)
	}
}
package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class ConfigurablePinTypeTests extends AbstractMappingTest {
	
	@Test
	def test1() {
		val input = '''
		Global {
	Name = "Example System";
	Compatible Interface Types {
		"T2" -> "T1";
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin0 : "T1";
			}
			Connector Connector2 {
				Pin0 : "T1";
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		Type = "T1";
	}
	Interface Iface2 {
		Type = "T2";
	}
}
		 '''
		 
		 loadModelAndCreateResults(input)
		 
		 assertEquals(2, allResults.size)
		 for (r : allResults) {
			if (r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector.name.equals("Connector1"))
				assertEquals("Connector2", r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).connector.name)
			
			if (r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector.name.equals("Connector2"))
				assertEquals("Connector1", r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).connector.name)
		}
				
	}
	
	@Test
	def test2() {
		val input = '''
		Global {
	Name = "Example System";
	Compatible Interface Types {
		"T2" -> "T1";
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin0 : "T1";
				Pin1 : "T2";
			}
			Connector Connector2 {
				Pin0 : "T1";
				Pin1 : "T2";
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		Type = "T1";
	}
	Interface Iface2 {
		Type = "T2";
	}
}
		'''
		loadModelAndCreateResults(input)
		
		assertEquals(4, allResults.size)
	}
}
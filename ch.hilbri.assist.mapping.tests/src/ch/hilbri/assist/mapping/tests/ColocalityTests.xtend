package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class ColocalityTests extends AbstractMappingTest {
	@Test
	def void exampleSpecFileTest() {
		val input = '''
Global {
	Name = "Example System";
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin1 : "A";
			}
			Connector Connector2 {
				Pin2 : "A";
			}
		}
		RDC RDC2 {
			Connector Connector1 {
				Pin1 : "A";
			}
			Connector Connector2 {
				Pin2 : "A";
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		Type = "A";
	}
	Interface Iface2 {
		Type = "A";
	}
	Interface Iface3 {
		Type = "A";
	}
	Interface Iface4 {
		Type = "A";
	}
}
InterfaceGroups {
	Group G1 { interfaces with Name = "Iface1", interfaces with Name = "Iface3" };
	Group G2 { interfaces with Name = "Iface2", interfaces with Name = "Iface4" };
}
Restrictions {
	G1 on same RDC;
	G2 on same RDC;
}
			'''
		  loadModelAndCreateResults(input)
		  assertEquals(8, allResults.size)
		  
		  for (r : allResults) {
			val iface1RDC = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface1"].head).connector.rdc
			val iface2RDC = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface2"].head).connector.rdc
			val iface3RDC = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface3"].head).connector.rdc
			val iface4RDC = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface4"].head).connector.rdc
			
			assertEquals(iface1RDC, iface3RDC)
			assertEquals(iface2RDC, iface4RDC)
		}
	}
		
}
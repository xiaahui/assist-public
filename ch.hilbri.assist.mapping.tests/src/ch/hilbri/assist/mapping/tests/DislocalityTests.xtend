package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class DislocalityTests extends AbstractMappingTest {
	@Test
	def void basicTest() {
		val input = '''
		Global { 
	Name = "Example System";
}

Compartments {
Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			Pin0: "CustomType0";
			Pin1: "CustomType0";
		}

		Connector Connector2 {
			Pin1: "CustomType0";
		}
		
		Connector Connector3 {
			Pin1: "CustomType0";
		}
		
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
		Type = "CustomType0";
	}
}

InterfaceGroups {
	Group G1 { Iface1, Iface2 };
}

Restrictions {
 G1, Iface3 dislocal up to Connector;
}
		'''
		loadModelAndCreateResults(input)
		assertTrue(allResults.size > 0)
		
		for (r : allResults) {
			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface1"].head).connector
			val iface2Con = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface2"].head).connector
			val iface3Con = r.mapping.get(r.model.eqInterfaces.filter[name == "Iface3"].head).connector
			
			assertFalse(#[iface1Con, iface2Con].contains(iface3Con))
		}
	}
	
	@Test
	def advancedTest() {
		val input = '''
		Global {
	Name = "Example System";
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin0 : "A";
				Pin1 : "A";
			}
			Connector Connector2 {
				Pin0 : "A";
				Pin1 : "A";
			}
		}
		RDC RDC2 {
			Connector Connector3 {
				Pin0 : "A";
				Pin1 : "A";
			}
			Connector Connector4 {
				Pin0 : "A";
				Pin1 : "A";
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
	Group G3 { Iface1, Iface2 };
	Group G4 { Iface3, Iface4 };
}
Restrictions {
	G1 dislocal up to RDC;
	G2 dislocal up to RDC;
	G3 dislocal up to Connector;
	G4 dislocal up to Connector;
}
		'''
		
		loadModelAndCreateResults(input)
		assertEquals(416, allResults.size)
		for (r : allResults) {
			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector
			val iface2Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).connector
			val iface3Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface3")].get(0)).connector
			val iface4Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface4")].get(0)).connector
			
			val iface1RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector.rdc
			val iface2RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).connector.rdc
			val iface3RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface3")].get(0)).connector.rdc
			val iface4RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface4")].get(0)).connector.rdc
			
			// G1 dislocal up to RDC (Iface1, Iface3)
			assertNotEquals(iface1RDC, iface3RDC)
			
			// G2 dislocal up to RDC (Iface2, Iface4)
			assertNotEquals(iface2RDC, iface4RDC)
			
			// G3 dislocal up to Connector (Iface1, Iface2)
			assertNotEquals(iface1Con, iface2Con)
			
			// G4 dislocal up to Connector (Iface3, Iface4)
			assertNotEquals(iface3Con, iface4Con)
		}
	}

}
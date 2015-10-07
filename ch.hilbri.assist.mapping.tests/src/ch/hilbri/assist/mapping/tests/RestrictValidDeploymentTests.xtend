package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class RestrictValidDeploymentTests extends AbstractMappingTest {
	@Test
	def test1() {
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
}
InterfaceGroups {
	Group G1 { Iface1, Iface2 };
}
Restrictions {
	Valid for Iface1 is { C1.RDC1, C1.RDC2.Connector3 };
	Valid for G1 is { C1.RDC1.Connector1 };
}		
		'''
		loadModelAndCreateResults(input)
		assertEquals(2, allResults.size)
		for (r : allResults) {
			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector
			val iface2Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).connector
			
			assertEquals(iface1Con.name, "Connector1")
			assertEquals(iface2Con.name, "Connector1")
		}
	}
	
	@Test
	def test2() {
		val input = '''
Global {
	Name = "Example System";
}
Compartments {
	Compartment C1 {
		Manufacturer = "Manu1";
		PowerSupply = "PW1";
		RDC RDC1 {
			Manufacturer = "Manu2";
			Type = "RDCType1";
			Connector Connector1 {
				Pin0 : "A";
			}
			Connector Connector2 {
				Pin0 : "A";
			}
		}
	}
	Compartment C2 {
		Manufacturer = "Manu2";
		PowerSupply = "PW2";
		RDC RDC2 {
			Manufacturer = "Manu2";
			Type = "RDCType2";
			Connector Connector1 {
				Pin0 : "A";
			}
			Connector Connector2 {
				Pin0 : "A";
			}
		}
		RDC RDC3 {
			Manufacturer = "Manu21";
			Type = "RDCType2";
			Connector Connector1 {
				Pin0 : "A";
			}
			Connector Connector2 {
				Pin0 : "A";
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		Type = "A";
	}
}
Restrictions {
	Valid for Iface1 is { pins with RDC.Manufacturer = "Manu2" and RDC.Type = "RDCType2" and Connector.Name = "Connector1", 
		                  pins with Compartment.Manufacturer = "Manu1" and Connector.Name = "Connector2"
	};
}		
		'''
		loadModelAndCreateResults(input)
		assertEquals(2, allResults.size)
		// Allowed is only: C2.RDC2.Connector1 and C1.RDC1.Connector2
		for (r : allResults) {
			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).connector
			
			if (iface1Con.name.equals("Connector1")) {
				assertEquals(iface1Con.rdc.name, "RDC2")
				assertEquals(iface1Con.rdc.compartment.name, "C2")
			} else {
				assertEquals(iface1Con.name, "Connector2")
				assertEquals(iface1Con.rdc.name, "RDC1")
				assertEquals(iface1Con.rdc.compartment.name, "C1")
			}
		}
		
	}	
}
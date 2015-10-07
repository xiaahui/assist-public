package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import static org.junit.Assert.*

class ProtectionLevelTests extends AbstractMappingTest {
	
	@Test
	def test1() {
		val input = '''
Global {
	Name = "Example System";
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L8;
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Location = "A";
			Connector Connector1 {
				Pin1 : "CustomType1" protection level L1;
			}
			Connector Connector2 {
				Pin2 : "CustomType1" protection level L8;
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}		
		'''
		loadModelAndCreateResults(input)
		assertEquals(1, allResults.size)
		val result = allResults.get(0)
		assertEquals("Pin2", result.mapping.get(result.model.eqInterfaces.get(0)).name)
	}
	
	@Test
	def test2() {
		val input = '''
Global {
	Name = "Example System";
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L5, L8;
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Location = "A";
			Connector Connector1 {
				Pin1 : "CustomType1" protection level L1;
			}
			Connector Connector2 {
				Pin2 : "CustomType1" protection level L5;
			}
			Connector Connector3 {
				Pin3 : "CustomType1" protection level L8;
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}
		'''
		loadModelAndCreateResults(input)
		assertEquals(2, allResults.size)
		for (r : allResults) {
			assertNotEquals("Pin1", r.mapping.get(model.eqInterfaces.get(0)).name)	
		}
	}
	
	@Test
	def testDefaultBehavior() {
		val input = '''
Global {
	Name = "Example System";
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L8;
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Location = "A";
			Connector Connector1 {
				Pin0 : "CustomType1" protection level L5;
			}
		}
		RDC RDC2 {
			Connector Connector2 {
				Pin1 : "CustomType1";
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}
		'''
		loadModelAndCreateResults(input)
		assertEquals(1, allResults.size)
		for (r : allResults) {
			assertNotEquals("Pin0", r.mapping.get(model.eqInterfaces.get(0)).name)	
		}
	}
	
	@Test
	def testDifferentLocations() {
		val input = '''
		Global {
	Name = "Example System";
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L8;
		RDC.Location = "B" And Equipment.EmhZone1 = "A" -> L5;
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Location = "A";
			Connector Connector1 {
				Pin1 : "CustomType1" protection level L5;
			}
		}
		RDC RDC2 {
			Location = "B";
			Connector Connector2 {
				Pin2 : "CustomType1" protection level L5;
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}
		'''
		loadModelAndCreateResults(input)
		assertEquals(1, allResults.size)
		for (r : allResults) {
			assertNotEquals("Pin1", r.mapping.get(model.eqInterfaces.get(0)).name)	
		}		
	}
	
	def testMultipleLevels() {
		val input = '''
Global {
	Name = "Example System";
	Protection Level Restrictions {
		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L3, L5, L8;
		RDC.Location = "B" And Equipment.EmhZone1 = "A" -> L5, L8;
		RDC.Location = "C" And Equipment.EmhZone1 = "A" -> L8;
	}
}
Compartments {
	Compartment C1 {
		RDC RDC1 {
			Location = "A";
			Connector Connector1 {
				Pin0 : "CustomType1" protection level L1;
				Pin1 : "CustomType1" protection level L2;
				Pin2 : "CustomType1" protection level L3;
			}
		}
		RDC RDC2 {
			Location = "B";
			Connector Connector2 {
				Pin4 : "CustomType1" protection level L5;
			}
		}
		RDC RDC3 {
			Location = "C";
			Connector Connector3 {
				Pin5 : "CustomType1" protection level L7;
			}
		}
	}
}
Interfaces {
	Interface Iface1 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
	Interface Iface2 {
		EmhZone1 = "A";
		Type = "CustomType1";
	}
}
		'''
		loadModelAndCreateResults(input)
		assertEquals(2, allResults.size)
		for (r : allResults) {
			assertNotEquals("Pin5", r.mapping.get(model.eqInterfaces.get(0)).name)	
			assertNotEquals("Pin5", r.mapping.get(model.eqInterfaces.get(1)).name)
			assertNotEquals(r.mapping.get(model.eqInterfaces.get(0)), r.mapping.get(model.eqInterfaces.get(1)))
		}
	}
}
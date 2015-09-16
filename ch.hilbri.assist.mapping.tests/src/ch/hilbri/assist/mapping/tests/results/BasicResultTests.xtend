package ch.hilbri.assist.mapping.tests.results

import ch.hilbri.assist.datamodel.model.Compartment
import ch.hilbri.assist.mapping.tests.constraints.AbstractMappingTest
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue

class BasicResultTests extends AbstractMappingTest{
	
	new() {
		input = '''
Global { 
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			"CustomType0" = 2;
			"CustomType13" = 3;
		}

		Connector Connector2 {
			"CustomType4" = 2;
		}
	}
}


Interfaces {
	Interface Iface1 {
		System = "System";
		SubAta = "SubATA";
		Resource = "Resource";
		LineName = "LineName";
		WiringLane = "WiringLane";
		GrpInfo = "GrpInfo";
		Route = "Route";
		PwSup1 = "PWSup1";
		EmhZone1 = "MyZone";
		Type = "CustomType0";
	}
	
	Interface Iface2 {
		System = "System";
		SubAta = "SubATA";
		Resource = "Resource";
		LineName = "LineName";
		WiringLane = "WiringLane";
		GrpInfo = "GrpInfo";
		Route = "Route";
		PwSup1 = "PWSup1";
		EmhZone1 = "MyZone";
		Type = "CustomType0";
	}
}

InterfaceGroups {
	Group G1 { Iface1, Iface2 };
}
'''
	}

	@Test
	def void testResultCount() {
		assertEquals("There should be only 1 result", 1, allResults.size)
	}
	
	@Test
	def void testResultStructure() {
		val r = allResults.get(0)
		
		// Compartment
		assertEquals(1, r.model.compartments.size)
		assertTrue(r.model.compartments.get(0) instanceof Compartment)
		val c = r.model.compartments.get(0) as Compartment
		assertEquals("C1", c.name)
			
		// RDC
		assertEquals(1, c.rdcs.size)
		val b = c.rdcs.get(0)
		assertEquals("RDC1", b.name)
		assertEquals("Manu", b.manufacturer)
		assertEquals(c, b.eContainer)		
		
		// Board
		assertEquals(2, b.connectors.size)
		val connector = b.connectors.get(0)
		assertEquals("Connector1", connector.name)
		assertEquals(b, connector.eContainer)
		
		// Application
		assertEquals(2, model.eqInterfaces.size)
		val a = model.eqInterfaces.get(0)
		assertEquals("Iface1", a.name)
	}

	@Test
	def void testMappingAssignment() {
		val r = allResults.get(0)
		
		// connector view
		val connector = r.model.connectors.get(0)
		val mapped = r.getAllMappedEqInterfacesForConnector(connector)
		assertEquals(2, mapped.size)
		for (iface : mapped)
			assertTrue(r.model.eqInterfaces.contains(iface))
	}
}
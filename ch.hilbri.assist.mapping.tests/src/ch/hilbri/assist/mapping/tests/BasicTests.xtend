package ch.hilbri.assist.mapping.tests

import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths
import org.junit.Test

import static org.junit.Assert.*

class BasicTests extends AbstractMappingTest {
	
	@Test
	def void exampleSpecFileTest() {
		
		/* It is a little tricky to find the correct path 
		 * to a file where I just know the relative path of;
		 * especially when all the OSGi helper functions cannot
		 * be used, because junit test case do not have these 
		 * libraries loaded ... 
		 */
		val className = this.getClass().getSimpleName()
		val testPath = this.getClass().getResource(className+".class")
		val newPath = new URL(testPath, "../../../../../../../../ch.hilbri.assist.mappingdsl/src/ch/hilbri/assist/mappingdsl/ExampleSpecification.mdsl")

		 val input = new String(Files.readAllBytes(Paths.get(newPath.toURI)))
		 assertFalse(input.length == 0)
	
	     loadModelAndCreateResults(input)
	     
	     assertFalse(allResults.size == 0)
	}
	
	@Test
	def void attributeTest1() {
		
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
				P0 : "CustomType0";
				P1 : "CustomType1";
			}
			Connector Connector2 {
				P2 : "CustomType0";
			}
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
		loadModelAndCreateResults(input)
		
		assertEquals("There should be 2 results", 2, allResults.size)
		
		for (r : allResults) {
			// Compartment
			assertEquals(1, r.model.compartments.size)
			val comp = r.model.compartments.get(0)
			assertEquals("C1", comp.name)
			
			// RDC
			assertEquals(1, r.model.compartments.get(0).rdcs.size)
			val rdc = r.model.compartments.get(0).rdcs.get(0)
			assertEquals("RDC1", rdc.name)
			assertEquals("Manu", rdc.manufacturer)
			assertEquals(comp, rdc.eContainer)		
		
			// Connector 1
			val con1 = rdc.connectors.filter[name == "Connector1"].head
			assertEquals(2, con1.pins.size)
			
			// Connector 2
			val con2 = rdc.connectors.filter[name == "Connector2"].head
			assertEquals(1, con2.pins.size)
			
			// Test Mappings
			assertNotNull(r.name)
			assertFalse(r.partialSolution)
			assertEquals(0, r.allUnmappedEqInterfaces.length)
			assertEquals(2, r.mapping.entrySet.length)
			
			val p0 = r.getPinForEqInterface(model.eqInterfaces.get(0))
			val i0 = r.getEqInterfaceForPin(p0)
			assertEquals(model.eqInterfaces.get(0), i0)
			assertEquals(p0, r.mapping.get(i0))
			
			val p1 = r.getPinForEqInterface(model.eqInterfaces.get(1))
			val i1 = r.getEqInterfaceForPin(p1)
			assertEquals(model.eqInterfaces.get(1), i1)
			assertEquals(p1, r.mapping.get(i1))
		}
		
		assertEquals(0, allResults.get(0).compareTo(allResults.get(1)))
		
	}
}
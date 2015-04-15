package ch.hilbri.assist.mapping.tests.constraints

import org.junit.Test
import static org.junit.Assert.*

class RestrictValidDeploymentTest2 extends AbstractMappingTest {
	new() {
		input = 
'''
Global { 
	Name = "Example System";
}

Compartment C1 {
	Manufacturer = "Manu1";
	PowerSupply  = "PW1";
	
	RDC RDC1 {
		Manufacturer = "Manu2";
		Type         = "RDCType1";
		Connector Connector1 {	"A" = 2; }

		Connector Connector2 {	"A" = 2; }
	}
}	

Compartment C2 {
	Manufacturer = "Manu2";
	PowerSupply  = "PW2";
	
	RDC RDC2 {
		Manufacturer = "Manu2";
		Type         = "RDCType2";
		Connector Connector1 {	"A" = 2; }
		Connector Connector2 {	"A" = 2; }
	}
	
	RDC RDC3 {
		Manufacturer = "Manu21";
		Type         = "RDCType2";
		Connector Connector1 {	"A" = 2; }
		Connector Connector2 {	"A" = 2; }
	}
}	


Interfaces {
	Interface Iface1 {
		Type = "A";
	}
}

Restrictions {
	Valid for Iface1 are 	{ connectors with RDC.Manufacturer = "Manu2" and RDC.Type = "RDCType2" and Connector.Name = "Connector1",
	                          connectors with Compartment.Manufacturer = "Manu1" and Connector.Name = "Connector2"};
}
'''
	}
	
	@Test
	def testResultCount() {
		assertEquals(2, allResults.size)
	}
	
	@Test
	def testResultSanity() {
		// Allowed is only: C2.RDC2.Connector1 and C1.RDC1.Connector2
		for (r : allResults) {
			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0))
			
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
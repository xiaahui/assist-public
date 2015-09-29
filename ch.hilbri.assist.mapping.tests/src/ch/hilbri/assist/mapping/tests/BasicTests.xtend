package ch.hilbri.assist.mapping.tests

import org.junit.Test

import static org.junit.Assert.*

class BasicTests extends AbstractMappingTest {
	
	@Test
	def void exampleSpecFileTest() {
		
		val input = 
		'''
		/*
 * GLOBAL PROPERTIES
 */

Global { 
	Name = "System";
	
	Compatible Interface Types { 
		"EquipmentType0" -> "PinType0", "PinType1";
		"EquipmentType1" -> "PinType1", "PinType2";
	}
	
	Cable Weights {
		"EquipmentType0" = 0.3232;
		"EquipmentType1" = 1.3232;
		default			 = 2.43;
	}
	
	Protection Level Restrictions {
		RDC.Location = "LocationA" And Equipment.EmhZone1 = "LocationB" -> L1, L3;
		RDC.Location = "LocationB" And Equipment.EmhZone1 = "LocationC" -> L5;
	}
}

/*
 * COMPARTMENTS, RDCs, CONNECTORS and PINS
 */
Compartments {
	Compartment Comp1 {
		Manufacturer 	= "ManufacturerName";
		PowerSupply 	= "PowerSupplyName";
		Side			= "SideName";
		Zone			= "ZoneName";
		
		RDC RDC1 {
			Manufacturer	= "ManufacturerName";
			PowerSupply1	= "PowerSupply1Name";
			PowerSupply2	= "PowerSupply2Name";
			Type			= "RDCTypeName";
			ESS				= "ESSName";
			Location		= "RDCLocatioName";
			ResourceX		= -120;
			ResourceY		= 150;
			ResourceZ		= -1200;
			
			Connector Connector1{
				// Available protection levels:
				// None, L1, L2, L3, L4, L5, L6, L7, L8

				Pin1: "PinType0"; // = protection level None
				Pin2: "PinType0" protection level L5;
				Pin3: "PinType1" protection level L8;
				
			}
			
			Connector Connector2{
				Pin1: "PinType3";
				Pin2: "PinType1" protection level L8;
				Pin3: "PinType1" protection level L8;
			}
			
			// ... more Connectors possible ...
			
			Connected Pins {
				Comp1.RDC1.Connector1.Pin1, Comp1.RDC1.Connector1.Pin2 are connected;
				Comp1.RDC1.Connector1.Pin3, Comp1.RDC1.Connector2.Pin2, Comp1.RDC1.Connector2.Pin3 are connected;
			}
			
			Metric Parameters {
				"RDC1Parameter1" = 54;
			
				// ...
			}
		}
		
		// ... more RDCs possible ...
		
		Metric Parameters {
			"Comp1Parameter1" = 12;
			"Comp1Parameter2" = 6;
			// ...
		}
	}
	
	// Another empty compartment for demo purposes
	Compartment Comp2 {
		RDC RDC1 {
			Connector Connector1{
			}
		}
	}
}

/*
 * EQUIPMENT INTERFACES
 */
Interfaces {
	Interface EquipmentInterface1 {
		System		= "SystemName";
		SubAta		= "SubAtaName";
		Resource	= "ResourceName";
		LineName	= "LineName";
		WiringLane	= "WiringLaneName";
		GrpInfo		= "GrpInfoName";
		Route		= "RouteName";
		PwSup1		= "PwSup1Name";
		EmhZone1	= "EmhZone1Name";
		Type		= "EquipmentType0";
		ResourceX	= -212;
		ResourceY	= -12;
		ResourceZ	= 55;
	}
	
	Interface EquipmentInterface2 {
		System		= "SystemName";
		SubAta		= "SubAtaName";
		Resource	= "ResourceName";
		LineName	= "LineName";
		WiringLane	= "WiringLaneName";
		GrpInfo		= "GrpInfoName";
		Route		= "RouteName";
		PwSup1		= "PwSup1Name";
		EmhZone1	= "EmhZone1Name";
		Type		= "EquipmentType1";
		ResourceX	= -212;
		ResourceY	= -12;
		ResourceZ	= 55;
	}
}

InterfaceGroups {
	// Explicit member enumeration
	Group G1 { EquipmentInterface1, EquipmentInterface2 };
	
	// Implicit member enumeration based on attributes
	Group G2 { interfaces with LineName = "LineName" };

	// Implicit member enumerations can be combined with an And-filter
	Group G3 { interfaces with LineName = "LineName" and GrpInfo = "GrpInfoName" };
		
	// Combinations of explicit and implicit member definitions are also possible
	Group G4 { interfaces with LineName = "LineName", EquipmentInterface2 };

	// Interfaces can also excluded explicitly
	Group G5 { interfaces with LineName = "LineName" } without { EquipmentInterface1 };
	
	// Interfaces can also excluded implicitly	
	Group G6 { interfaces with LineName = "LineName" } without { interfaces with PwSup1 = "PwSup1" };
	
	// Groups can be combined
	Group G7 combines G1 and G2 and G3;
}
	

/*
 * ADDITIONAL RESTRICTIONS  
 */
 
Restrictions {

	/*
	 * COLOCALITY
	 */  
	 
	// EquipmentInterface1 and EquipmentInterface2 must
	// be mapped to the same Connector (or RDC or Compartment)

	EquipmentInterface1, EquipmentInterface2 on same Connector;
	EquipmentInterface1, EquipmentInterface2 on same RDC;
	 
	// This also works for groups 

	G1 on same Connector;

	// .. and combinations of groups and interfaces

	G4, EquipmentInterface2, G5 on same RDC;

	/* 
	 * DISLOCALITY
	 */
	
	// EquipmentInterface1 and EquipmentInterface2 must 
	// be on separate Compartments (and RDCs and Connectors)
	// (the level can be set to "Compartment" or "RDC" or "Connector")	

//	EquipmentInterface1, EquipmentInterface2 dislocal up to Connector;
	
	// All members of G1 must be on separate Connector

//	G1 dislocal up to Connector; 		
	
	// The members of G1 and G2 must not share an Connector
    // (while the members of G1 may be on the same Connector)

//	G1, G2 dislocal up to Connector;

	 
	/*
	 * VALID DEPLOYMENTS
	 */
	  
	// Valid allocations for EquipmentInterface1 are all
	// pins on Connector1 of RDC1 in Comp1
	// (explicit pin specification)
	Valid for EquipmentInterface1 is { Comp1.RDC1.Connector1 };
	  
	// This also works for groups
	// (explicit pin specification) 
	Valid for G1, EquipmentInterface1, G3 is { Comp1 };
	  
	// There are also implicit pin specifications possible
	Valid for EquipmentInterface1 is { pins with Compartment.Name = "Comp1" };
	  
	// Or even implicit combinations ...
	// EquipmentInterface1 can be allocated to all connectors
	// where the hosting RDC has a powerSupply1 attribute of Sup1 or
	// the hosting RDC has a powerSupply2 attribute of Sup2
	Valid for EquipmentInterface1 is { pins with RDC.PowerSupply1 = "PowerSupply1Name",
									   pins with RDC.PowerSupply2 = "PowerSupply2Name"  };

	/* 
	 * INVALID DEPLOYMENTS
	 */

	Invalid for EquipmentInterface1 is { Comp2.RDC1.Connector1 };
	  
	Invalid for G1, EquipmentInterface1, G3 is { Comp2 };
	  
	Invalid for EquipmentInterface1 is { pins with Compartment.Name = "UnsafeCompartment" };
	  
	Invalid for EquipmentInterface1 is { pins with RDC.PowerSupply1 = "UnsafeSupplier",
									     pins with RDC.PowerSupply2 = "UnsafeSupplier"  };
		
}
		
		'''
	
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
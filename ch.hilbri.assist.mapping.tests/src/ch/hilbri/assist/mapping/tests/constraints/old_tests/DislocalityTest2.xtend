//package ch.hilbri.assist.mapping.tests.constraints
//
//import org.junit.Test
//import static org.junit.Assert.*
//
//class DislocalityTest2 extends AbstractMappingTest {
//	new() {
//		input = 
//'''
//Global { 
//	Name = "Example System";
//}
//
//Compartment C1 {
//	RDC RDC1 {
//		Connector Connector1 {
//			"A" = 2;
//		}
//
//		Connector Connector2 {
//			"A" = 2;
//		}
//	}
//	
//	RDC RDC2 {
//		Connector Connector3 {
//			"A" = 2;
//		}
//
//		Connector Connector4 {
//			"A" = 2;
//		}
//	}
//	
//}
//
//
//Interfaces {
//	Interface Iface1 {
//		Type = "A";
//	}
//	
//	Interface Iface2 {
//		Type = "A";
//	}
//	
//	Interface Iface3 {
//		Type = "A";
//	}
//	
//	Interface Iface4 {
//		Type = "A";
//	}
//}
//
//InterfaceGroups {
//	Group G1 { interfaces with Name="Iface1", interfaces with Name="Iface3" };
//	Group G2 { interfaces with Name="Iface2", interfaces with Name="Iface4" };
//	Group G3 { Iface1, Iface2 };
//	Group G4 { Iface3, Iface4 };
//}
//
//Restrictions {
//	G1 dislocal up to RDC;
//	G2 dislocal up to RDC;
//	
//	G3 dislocal up to Connector;
//	G4 dislocal up to Connector;
//}
//'''
//	}
//	
//	@Test
//	def testResultCount() {
//		assertEquals(40, allResults.size)
//	}
//	
//	@Test
//	def testResultsColocalityCorrectness() {
//		for (r : allResults) {
//			
//			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0))
//			val iface2Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0))
//			val iface3Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface3")].get(0))
//			val iface4Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface4")].get(0))
//			
//			val iface1RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).rdc
//			val iface2RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).rdc
//			val iface3RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface3")].get(0)).rdc
//			val iface4RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface4")].get(0)).rdc
//			
//			// G1 dislocal up to RDC (Iface1, Iface3)
//			assertNotEquals(iface1RDC, iface3RDC)
//			
//			// G2 dislocal up to RDC (Iface2, Iface4)
//			assertNotEquals(iface2RDC, iface4RDC)
//			
//			// G3 dislocal up to Connector (Iface1, Iface2)
//			assertNotEquals(iface1Con, iface2Con)
//			
//			// G4 dislocal up to Connector (Iface3, Iface4)
//			assertNotEquals(iface3Con, iface4Con)
//		}
//	} 
//}
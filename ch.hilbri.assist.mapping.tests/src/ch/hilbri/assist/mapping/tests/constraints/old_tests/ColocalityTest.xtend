//package ch.hilbri.assist.mapping.tests.constraints
//
//import org.junit.Test
//import static org.junit.Assert.*
//
//class ColocalityTest extends AbstractMappingTest {
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
//			"A" = 1;
//		}
//
//		Connector Connector2 {
//			"A" = 1;
//		}
//	}
//	
//	RDC RDC2 {
//		Connector Connector1 {
//			"A" = 1;
//		}
//
//		Connector Connector2 {
//			"A" = 1;
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
//}
//
//Restrictions {
//	G1 on same RDC;
//	G2 on same RDC;
//}
//'''
//	}
//	
//	@Test
//	def testResultCount() {
//		assertEquals(8, allResults.size)
//	}
//	
//	@Test
//	def testResultsColocalityCorrectness() {
//		for (r : allResults) {
//			val iface1RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0)).rdc
//			val iface2RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0)).rdc
//			val iface3RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface3")].get(0)).rdc
//			val iface4RDC = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface4")].get(0)).rdc
//			
//			assertEquals(iface1RDC, iface3RDC)
//			assertEquals(iface2RDC, iface4RDC)
//		}
//	} 
//}
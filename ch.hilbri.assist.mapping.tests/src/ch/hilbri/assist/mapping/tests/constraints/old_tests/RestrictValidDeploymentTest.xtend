//package ch.hilbri.assist.mapping.tests.constraints
//
//import org.junit.Test
//import static org.junit.Assert.*
//
//class RestrictValidDeploymentTest extends AbstractMappingTest {
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
//}
//
//InterfaceGroups {
//	Group G1 { Iface1, Iface2 };
//}
//
//Restrictions {
//	Valid for Iface1 is 	{ C1.RDC1, C1.RDC2.Connector3 };
//	Valid for G1     are 	{ C1.RDC1.Connector1 };
//}
//'''
//	}
//	
//	@Test
//	def testResultCount() {
//		assertEquals(1, allResults.size)
//	}
//	
//	@Test
//	def testResultChecker() {
//		for (r : allResults) {
//			val iface1Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface1")].get(0))
//			val iface2Con = r.mapping.get(r.model.eqInterfaces.filter[it.name.equals("Iface2")].get(0))
//			
//			assertEquals(iface1Con.name, "Connector1")
//			assertEquals(iface2Con.name, "Connector1")
//		}
//	}
//	
//}
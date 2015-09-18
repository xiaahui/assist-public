//package ch.hilbri.assist.mapping.tests.constraints
//
//import org.junit.Test
//import static org.junit.Assert.*
//
//class ConfigurablePinTests2 extends AbstractMappingTest {
//	
//	new() {
//		input = 
//'''
//Global { 
//	Name = "Example System"; 
//	
//	Compatible Interface Types {
//		"T2" -> "T1";
//	}
//}
//
//Compartment C1 {
//	RDC RDC1 {
//		Connector Connector1 {
//			"T1" = 1;
//			"T2" = 1;
//		}
//		
//		Connector Connector2 {
//			"T1" = 1;
//			"T2" = 1;
//		}
//		
//	}
//}
//
//
//Interfaces {
//	Interface Iface1 {	Type = "T1"; 	}
//	Interface Iface2 {	Type = "T2";	}
//}
//'''
//	}
//	
//	@Test
//	def testResultCount() {
//		assertEquals(4, allResults.size)
//	}
//}
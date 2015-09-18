//package ch.hilbri.assist.mapping.tests.constraints
//
//import org.junit.Test
//
//import static org.junit.Assert.assertEquals
//
//class ProtectionLevelTest1 extends AbstractMappingTest {
//	new() {
//		input = '''
//Global { 
//	Name = "Example System";
//	
//	Protection Level Restrictions {
//		RDC.Location = "A" And Equipment.EmhZone1 = "A" -> L8;
//	}
//
//}
//
//Compartment C1 {
//	RDC RDC1 {
//		Location = "A";
//		Connector Connector1 {
//			"CustomType1" = 1 with protection level L1;
//		}
//		
//		Connector Connector2 {
//			"CustomType1" = 1 with protection level L8;
//		}
//	}
//}
//
//
//Interfaces {
//	Interface Iface1 {
//		EmhZone1 = "A";
//		Type = "CustomType1";
//	}
//}
//'''
//	}
//	
//	
//	@Test
//	def void testResultCount() {
//		assertEquals(1, allResults.size)
//	}
//	
//	@Test
//	def void testResult() {
//		val result = allResults.get(0)
//		assertEquals("Connector2", result.mapping.get(result.model.eqInterfaces.get(0)).name)
//	}
//}
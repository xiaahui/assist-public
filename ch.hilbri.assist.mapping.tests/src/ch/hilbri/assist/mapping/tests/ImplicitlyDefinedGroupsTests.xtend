package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.AssistSolver
import org.junit.Test

import static org.junit.Assert.*

class ImplicitlyDefinedGroupsTests extends AbstractMappingTest {
	
	@Test
	def simpleImplicitlyDefinedGroups() {
		/* Define the input */
		val input = '''
Global { 
	Name = "Example System";
}

Compartments{
Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}

		Connector Connector2 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}
	}
}
}


Interfaces {
	Interface Iface1 {
		System = "A";
		Type = "CustomType0";
	}
	
	Interface Iface2 {
		System = "B";
		Type = "CustomType0";
	}
	
	Interface Iface3 {
		System = "C";
		Type = "CustomType0";
	}
}

InterfaceGroups {
	Group G1 { Iface1, interfaces with System="C", Iface3 };
}'''
		
		/* Parse the input */
		model = parser.parse(input) 
		new AssistSolver(model)
		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 2)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface1")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface3")
	
	}

	@Test
	def complexImplicitlyDefinedGroups() {
		/* Define the input */
		val input = '''
Global { 
	Name = "Example System";
}
Compartments{
Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}

		Connector Connector2 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}
	}
}
}

Interfaces {
	Interface Iface1 {
		System = "A";
		Type = "CustomType0";
	}
	
	Interface Iface2 {
		System = "B";
		Type = "CustomType0";
	}
	
	Interface Iface3 {
		SubAta = "Ata1"
		System = "C";
		Type = "CustomType0";
	}
	
	Interface Iface4 {
		SubAta = "Ata2";
		System = "C";
		Type = "CustomType0";
	}
}

InterfaceGroups {
	Group G1 { Iface3, interfaces with System="C" and SubAta="Ata2"  };
}'''
		
		/* Parse the input */
		model = parser.parse(input)
		new AssistSolver(model)
		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 2)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface3")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface4")
	
	}


	@Test
	def complexImplicitlyDefinedGroups2() {
		val input = 
'''Global { 
	Name = "Example System";
}

Compartments{
Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}

		Connector Connector2 {
			Pin0 : "CustomType0";
			Pin1 : "CustomType0";
			Pin2 : "CustomType0";
			Pin3 : "CustomType0";
			Pin4 : "CustomType0";
		}
	}
}
}


Interfaces {
	Interface Iface1 {
		SubAta = "Ata2";
		System = "A";
		Resource = "R1";
		Route = "M1";
		Type = "CustomType0";
	}
	
	Interface Iface2 {
		System = "B";
		Resource = "R2";
		Route = "M1";
		Type = "CustomType0";
	}
	
	Interface Iface3 {
		SubAta = "Ata1"
		System = "C";
		Resource = "R3";
		Route = "M2";
		Type = "CustomType0";
	}
	
	Interface Iface4 {
		SubAta = "Ata2";
		System = "C";
		Resource = "R4";
		Route = "M2";
		Type = "CustomType0";
	}
}

InterfaceGroups {
	Group G1 { interfaces with System="C" and Resource ="R3", interfaces with Name = "Iface4", interfaces with SubAta = "Ata2", Iface4 };
}'''
		
		/* Parse the input */
		model = parser.parse(input) 
		new AssistSolver(model)

		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 3)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface1")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface3")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(2).name, "Iface4")
	}
	
}
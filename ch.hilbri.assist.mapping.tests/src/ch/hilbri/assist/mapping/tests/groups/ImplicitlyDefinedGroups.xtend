package ch.hilbri.assist.mapping.tests.groups

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class ImplicitlyDefinedGroups {
	
	protected String input
	protected AssistModel model
	
	private Logger logger

	new() { logger = LoggerFactory.getLogger(this.class)}	
	
	@Inject
	protected ParseHelper<AssistModel> parser

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	@Test
	def simpleImplicitlyDefinedGroups() {
		/* Define the input */
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
			"CustomType0" = 20;
		}

		Connector Connector2 {
			"CustomType0" = 20;
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
		model = parser.parse(input) as AssistModel
		val solver = new AssistSolver(model, 0)
		solver.runModelPreprocessors

		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 2)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface1")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface3")
	
	}

	@Test
	def complexImplicitlyDefinedGroups() {
		/* Define the input */
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
			"CustomType0" = 20;
		}

		Connector Connector2 {
			"CustomType0" = 20;
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
		model = parser.parse(input) as AssistModel
		val solver = new AssistSolver(model, 0)
		solver.runModelPreprocessors

		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 2)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface3")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface4")
	
	}


	@Test
	def complexImplicitlyDefinedGroups2() {
		input = 
'''Global { 
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
		Manufacturer = "Manu";
		Type = "Type";
		ESS = "Ess";
	
		Connector Connector1 {
			"CustomType0" = 20;
		}

		Connector Connector2 {
			"CustomType0" = 20;
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
		model = parser.parse(input) as AssistModel
		val solver = new AssistSolver(model, 0)
		solver.runModelPreprocessors

		assertEquals(model.eqInterfaceGroups.length, 1)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.length, 3)
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(0).name, "Iface1")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(1).name, "Iface3")
		assertEquals(model.eqInterfaceGroups.get(0).eqInterfaces.sortBy[it.name].get(2).name, "Iface4")
	}
	
}
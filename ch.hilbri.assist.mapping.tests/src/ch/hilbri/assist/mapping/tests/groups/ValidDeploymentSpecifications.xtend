package ch.hilbri.assist.mapping.tests.groups

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Connector
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
class ValidDeploymentSpecifications {
	
	protected String input
	protected AssistModel model
	
	private Logger logger

	new() { logger = LoggerFactory.getLogger(this.class)}	
	
	@Inject
	protected ParseHelper<AssistModel> parser

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	@Test
	def simpleValidDeployment() {
		input = 
'''
Global { 
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {	
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
		Type = "CustomType0";
	}
	
}

Restrictions {
	Valid for Iface1 are { connectors with Connector.Name = "Connector2" };
}
'''
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		val solver = new AssistSolver(model, 0)
		solver.runModelPreprocessors
		
		/* Assertions */
		assertEquals(model.validDeployments.length, 1)
		
		assertEquals(model.validDeployments.get(0).eqInterfaceOrGroups.length, 1)
		assertEquals(model.validDeployments.get(0).eqInterfaceOrGroups.get(0).name, "Iface1")
		
		
		assertEquals(model.validDeployments.get(0).hardwareElements.length, 1)
		assertTrue(model.validDeployments.get(0).hardwareElements.get(0) instanceof Connector)
		
		
		
		val c = model.validDeployments.get(0).hardwareElements.get(0) as Connector
		assertEquals(c.name, "Connector2")
	}
}
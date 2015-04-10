package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class ColocalityPropagationTests {
		
	protected String input
	protected AssistModel model
	protected AssistSolver solver
	
	private Logger logger

	@Inject
	protected ParseHelper<AssistModel> parser

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	new() {
		input = 
'''
Global { 
	Name = "Example System";
}

Compartment C1 {
	RDC RDC1 {
	
		Connector Connector1 {
			"T1" = 2;
			"T2" = 1;
		}

		Connector Connector2 {
			"T3" = 1;
			"T2" = 1;
		}
    }
	RDC RDC2 {
		Connector Connector3 {
			"T1" = 1;
			"T3" = 1;
		}

		Connector Connector4 {
			"T4" = 1;
		}

	}
}


Interfaces {
	Interface Iface1 {
		Type = "T1";
	}
	
	Interface Iface2 {
		Type = "T2";
	}
	
	Interface Iface3 {
		Type = "T2";
	}
	
	Interface Iface4 {
		Type = "T3";
	}
	
	Interface Iface5 {
		Type = "T1";
	}
	
	Interface Iface6 {
		Type = "T3";
	}
	
	Interface Iface7 {
		Type = "T4";
	}
}

Restrictions {
 	Iface1, Iface5, Iface7 on same RDC;
}
'''
		logger = LoggerFactory.getLogger(this.class)
	}

	@Before
	def void loadModelAndCreateResults() {
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		
		/* Fix the model */
		assertNotNull(model) 

	}

	
	@Test
	def void testMatchPropagation() {
		try {
			/* Create the job to search for new solutions */
			solver = new AssistSolver(model)
			solver.solverSearchStrategy = SearchType.getDefaultSearchType
			solver.solverMaxSolutions = 1000
			assertNotNull(solver)
			solver.propagation
		}
		catch (BasicConstraintsException e) {
			val constraintName = e.getConstraintName
			val message = e.getExplanation
			logger.info("Inconsistency found while processing constraint \"" + constraintName + "\"");
			logger.info("\""+ message + "\"");
		}
	}
}

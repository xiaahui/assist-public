package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.SearchType
import org.junit.Test

import static org.junit.Assert.*

class StrategyTests extends AbstractMappingTest {
	
	@Test
	def void testAllStrategiesForSimpleExample() {
		val input = '''
Global { 
	Name = "Example System";
}

Compartments {
	Compartment C1 {
		RDC RDC1 {
			Connector Connector1 {
				Pin01 : "CustomType0";
				Pin11 : "CustomType1";
			}

			Connector Connector2 {
				Pin01 : "CustomType0";
				Pin02 : "CustomType0";
			}
		}
	
		RDC RDC2 {
			Connector Connector1 {
				Pin01 : "CustomType0";
				Pin11 : "CustomType1";
			}

			Connector Connector2 {
				Pin21 : "CustomType2";
				Pin22 : "CustomType2";
			}
		}
	}
}


Interfaces {
	Interface Iface1 {	Type = "CustomType0";	}
	Interface Iface2 {	Type = "CustomType0";	}
	Interface Iface3 {	Type = "CustomType1";	}
	Interface Iface4 {	Type = "CustomType2";	}
}

InterfaceGroups {
	Group G1 { Iface1, Iface2 };
}

Restrictions {
	G1 dislocal up to Connector;
	Iface3, Iface4 dislocal up to RDC;
	Iface1, Iface3 on same RDC;
	Iface2, Iface4 on same RDC; 
}
'''
		/* Parse the input */
		model = parser.parse(input)
		
		assertNotNull(model) 

		/* Go through all possible search strategies */
		for (searchType : SearchType.values) {
			
			/* Create the job to search for new solutions */
			val solver = new AssistSolver(model)
			solver.solverSearchStrategy = searchType
			solver.solverMaxSolutions = 10000
			
			assertNotNull(solver)
		
			/* Execute this job */
			solver.propagation
			solver.solutionSearch
			solver.createSolutions

			/* Store the results */
			allResults = solver.results
			assertNotNull(allResults)
			assertEquals(allResults.length, 6)
		}
	}
}
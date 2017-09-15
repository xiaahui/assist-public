package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes

class SystemHierarchyConstraintTests extends AbstractMappingTest {
	
	@Test
	def void Test1() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Box C1_B1 {
			Board C1_B1_B1 {
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
					Core C1_B1_B1_P1_C1 { }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
					Core C1_B2_B1_P1_C1 { }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Board C2_B1_B1 {
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 { }
					Core C2_B1_B1_P1_C1 { }
				}
			}
		}
	
		Box C2_B2 {
			Board C2_B2_B1 {
				Processor C2_B2_B1_P1 {
					Core C2_B2_B1_P1_C0 { }
					Core C2_B2_B1_P1_C1 { }
				}
			}
		}
	}				
}			

Software {
	Application A1 {
		Task A1_T1 {	}
	}
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)
		
		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch

		Assert.assertEquals(8, assistSolver.chocoSolutions.size)

		assistSolver.createSolutions

		Assert.assertEquals(8, assistSolver.results.size)
	}
	
	
	@Test
	def void Test2() {
				val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Box C1_B1 {
			Board C1_B1_B1 {
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { Capacity = 100; }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { Capacity = 100; }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Board C2_B1_B1 {
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 { Capacity = 100; }
				}
			}
		}
	
		Box C2_B2 {
			Board C2_B2_B1 {
				Processor C2_B2_B1_P1 {
					Core C2_B2_B1_P1_C0 { Capacity = 100; }
				}
			}
		}
	}				
}			

Software {
	Application A1 {
		Task A1_T1 { CoreUtilization = 1; }
		Task A1_T2 { CoreUtilization = 1; }
	}
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)
		
		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		
		Assert.assertEquals(16, assistSolver.chocoSolutions.length)
		
		
	}
}
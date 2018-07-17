package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import java.util.HashSet
import org.junit.Assert
import org.junit.Test
import ch.hilbri.assist.mapping.solver.AssistMappingSolver

class DislocalityConstraintTests extends AbstractMappingTest {
	@Test
	def void Test1SimplePair() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Box C1_B1 {
			Board C1_B1_B1 {
				RAM = 0;
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				RAM = 4;
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Board C2_B1_B1 {
				RAM = 2;
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 { }
				}
			}
		}
	}				
}			

Software {
	Application A1 { Task A1_T1 {} }
	Application A2 { Task A2_T1 {} }
}

Restrictions {
	A1, A2 dislocal up to Core;
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertEquals("There should only be 6 results, because there are only 3 cores", 6,
			assistSolver.results.size)

		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on the same core */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 0)]
			Assert.assertEquals(2, taskResults.size)
			Assert.assertNotEquals("The tasks should have been placed to different cores", taskResults.get(0),
				taskResults.get(1))
		}
	}

	@Test
	def void Test1bSimplePair() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Box C1_B1 {
			Board C1_B1_B1 {
				RAM = 0;
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				RAM = 4;
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Board C2_B1_B1 {
				RAM = 2;
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 { }
				}
			}
		}
	}				
}			

Software {
	Application A1 { Task A1_T1 {} }
	Application A2 { Task A2_T1 {} }
}

Restrictions {
	A1, A2.A2_T1 dislocal up to Core;
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertEquals("There should only be 6 results, because there are only 3 cores", 6,
			assistSolver.results.size)

		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on the same core */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 0)]
			Assert.assertEquals(2, taskResults.size)
			Assert.assertNotEquals("The tasks should have been placed to different cores", taskResults.get(0),
				taskResults.get(1))
		}
	}

	@Test
	def void Test2ComplexApplications() {
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
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}
}			

Software {
	Application A1 { 
		Task A1_T1 {}
		Task A1_T2 {}
	}
	
	Application B1 { 
		Task B1_T1 {}
		Task B1_T2 {}
	}
}

Restrictions {
	A1, B1 dislocal up to Processor;
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertEquals("There should only be 2 results, because there are only 2 processors", 2,
			assistSolver.results.size)

		for (result : assistSolver.results) {

			// Get processors for Application A tasks
			val applicationAResults = assistModel.allTasks.filter[application.getName.startsWith("A")].map [
				result.getHardwareElementForTask(it, 1)
			].toSet

			// Get processors for Application B tasks
			val applicationBResults = assistModel.allTasks.filter[application.getName.startsWith("B")].map [
				result.getHardwareElementForTask(it, 1)
			].toSet

			/* Application A and B must not share a processor */
			val intersect = new HashSet(applicationAResults)
			intersect.retainAll(applicationBResults)
			Assert.assertTrue(intersect.isNullOrEmpty)

		}
	}
}

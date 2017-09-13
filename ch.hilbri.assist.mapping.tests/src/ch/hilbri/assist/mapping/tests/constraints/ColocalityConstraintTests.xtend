package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class ColocalityConstraintTests extends AbstractMappingTest {
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
	A1, A2 on same Core;
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
		assistSolver.createSolutions

		Assert.assertEquals("There should only be 3 results, because there are only 3 cores", 3, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on the same core */
			val taskResults = model.allTasks.map[result.getHardwareElementForTask(it, 0)]
			Assert.assertEquals(2, taskResults.size)
			Assert.assertEquals("The tasks should have been placed on the same core", taskResults.get(0), taskResults.get(1))
		}

	}
}
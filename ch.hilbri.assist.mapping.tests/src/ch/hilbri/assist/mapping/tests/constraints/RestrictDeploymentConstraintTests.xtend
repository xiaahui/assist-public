package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class RestrictDeploymentConstraintTests extends AbstractMappingTest {
	
	@Test
	def void testTaskLevelSpecificationAndOnlyCoreReference() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				Processor P1 {
					Core C0 { }
					Core C1 { }
				}
				Processor P2 {
					Core C3 { }
					Core C4 { }
				}
			}
		}
	}
}

Software {
	Application A1 {
		Task A1_T1 {
			RestrictDeploymentTo { Comp1.Box1.Board1.P1.C0, Comp1.Box1.Board1.P2.C3 };
		}
	}
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

		Assert.assertEquals("There should only be 2 results, because there are only 2 cores possible", 2, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on the same core */
			val resultingCoreForTask = assistModel.allTasks.map[result.getHardwareElementForTask(it, 0)].head
			
			/* We *know* we referenced only cores in the restrict mapping to hardware elements
			 * thus we can check for their indices		 */
			val validCores = assistModel.allTasks.head.restrictMappingToHardwareElements
			
			Assert.assertTrue("[Result Idx " + assistSolver.results.indexOf(result) + "]: The task must be placed on a core that was allowed", validCores.contains(resultingCoreForTask))
		}
	}
	
}
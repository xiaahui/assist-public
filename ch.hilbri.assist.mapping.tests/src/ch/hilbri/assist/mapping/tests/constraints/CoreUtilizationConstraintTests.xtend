package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class CoreUtilizationConstraintTests extends AbstractMappingTest {
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
					Core C1_B1_B1_P1_C0 { Capacity = 1; }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { Capacity = 3; }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Board C2_B1_B1 {
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 { Capacity = 0; }
				}
			}
		}
	
		Box C2_B2 {
			Board C2_B2_B1 {
				Processor C2_B2_B1_P1 {
					Core C2_B2_B1_P1_C0 { Capacity = 4; }
				}
			}
		}
	}				
}			

Software {
	Application A1 {
		Task A1_T1 { CoreUtilization = 1; }
		Task A1_T2 { CoreUtilization = 2; }
		Task A1_T1 { CoreUtilization = 3; }
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
		assistSolver.createSolutions

		for (result : assistSolver.results) {
			for (core : assistModel.allCores) {
				val utilizationSum = result.getMappedTasksForCore(core).map[coreUtilization].reduce[p1, p2|p1 + p2]
				Assert.
					assertTrue('''The utilization of the core «core.name» should not exceed its capacity (capacity: «core.capacity», utilization: «utilizationSum»)''',
						utilizationSum <= core.capacity)
			}
		}
	}

}

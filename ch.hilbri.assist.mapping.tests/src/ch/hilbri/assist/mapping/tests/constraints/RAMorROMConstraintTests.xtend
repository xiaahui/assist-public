package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.model.Task
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class RAMorROMConstraintTests extends AbstractMappingTest {
	
	@Test
	def void Test1RAM() {
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
	
		Box C2_B2 {
			Board C2_B2_B1 {
				RAM = 12;
				Processor C2_B2_B1_P1 {
					Core C2_B2_B1_P1_C0 { }
				}
			}
		}
	}				
}			

Software {
	Application A1 {
		Task A1_T1 { RequiredRAM = 2; }
		Task A1_T2 { RequiredRAM = 3; }
		Task A1_T3 { RequiredRAM = 4; } 
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

		Assert.assertTrue(assistSolver.results.size > 0)
//		Assert.assertEquals(5, assistSolver.results.size)

		for (result : assistSolver.results) {
			for (board : assistModel.allBoards) {
				
				val Task[] mappedTasks = board.allCores.map[result.getMappedTasksForCore(it)].flatten
				
				if (!mappedTasks.isNullOrEmpty) {
					val utilizationSum = mappedTasks.map[ramUtilization].reduce[p1, p2|p1 + p2]
					val msg = '''Utilization of «board.name» exceeds capacity (cap.: «board.ramCapacity», util.: «utilizationSum»)'''
					Assert.assertTrue(msg, utilizationSum <= board.ramCapacity)
				} 
				else
					Assert.assertTrue(mappedTasks === null || mappedTasks.length == 0) 
			}
		}
	}
	
}
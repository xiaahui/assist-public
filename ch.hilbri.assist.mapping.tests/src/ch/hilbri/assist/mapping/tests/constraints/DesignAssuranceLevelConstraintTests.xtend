package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.DesignAssuranceLevelType
import org.junit.Assert
import org.junit.Test

class DesignAssuranceLevelConstraintTests extends AbstractMappingTest {
	@Test
	def void Test1Simple() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				DesignAssuranceLevel = B;
				Processor P1 {
					Core C0 { }
				}
			}
			
			Board Board2 {
				DesignAssuranceLevel = A;
				Processor P1 {
					Core C0 { }
				}
			}
		}
	}
}

Software {
	Application A1 {
		CriticalityLevel = A;
		Task A1_T1 {}
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
		
		Assert.assertEquals("There should only be 1 result, because there is only one DAL A board", 1, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result the tasks are placed on the board with DAL A */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].map[it as Board]
			for (board : taskResults)
				Assert.assertEquals(DesignAssuranceLevelType.A, board.assuranceLevel)
		}
	}
	
	@Test
	def void Test2MultipleTasks() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				DesignAssuranceLevel = B;
				Processor P1 {
					Core C0 { }
				}
			}
			
			Board Board2 {
				DesignAssuranceLevel = A;
				Processor P1 {
					Core C0 { }
				}
			}
		}
	}
}

Software {
	Application A1 {
		CriticalityLevel = A;
		Task A1_T1 {}
		Task A1_T2 {}
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
		
		Assert.assertEquals("There should only be 1 result, because there is only one DAL A board", 1, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result the tasks are placed on the board with DAL A */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].map[it as Board]
			for (board : taskResults)
				Assert.assertEquals(DesignAssuranceLevelType.A, board.assuranceLevel)
		}
	}
	
	@Test
	def void Test3MultipleApplications() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board Board1 {
				DesignAssuranceLevel = B;
				Processor P1 {
					Core C0 { }
				}
			}
			
			Board Board2 {
				DesignAssuranceLevel = A;
				Processor P1 {
					Core C0 { }
				}
			}
		}
	}
}

Software {
	Application A1 {
		CriticalityLevel = A;
		Task A1_T1 {}
		Task A1_T2 {}
	}
	
	Application A2 {
			CriticalityLevel = A;
			Task A2_T1 {}
			Task A2_T2 {}
			Task A2_T3 {}
			Task A2_T4 {}
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
		
		Assert.assertEquals("There should only be 1 result, because there is only one DAL A board", 1, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result the tasks are placed on the board with DAL A */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].map[it as Board]
			for (board : taskResults)
				Assert.assertEquals(DesignAssuranceLevelType.A, board.assuranceLevel)
		}
	}
	
	@Test
	def void TestUpwardCompatibility() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}

Hardware {
	Compartment Comp1 {
		Box Box1 {
			Board BoardA {
				DesignAssuranceLevel = A;
				Processor P1 { Core C0 {} }
			}
			Board BoardB {
				DesignAssuranceLevel = B;
				Processor P1 { Core C0 {} }
			}
			Board BoardC {
				DesignAssuranceLevel = C;
				Processor P1 { Core C0 {} }
			}
		}
	}
}

Software {
	Application A1 {
		CriticalityLevel = B;
		Task A1_T1 {}
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
		
		Assert.assertEquals("There should only be 2 results, because there are only two boards with a design assurance level >= B", 2, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result the tasks are placed on the board with DAL A or DAL 5*/
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].map[it as Board]
			for (board : taskResults)
				Assert.assertTrue("Only DAL A and B are allowed for application A1", board.assuranceLevel == DesignAssuranceLevelType.A || board.assuranceLevel == DesignAssuranceLevelType.B)
		}
	}
}
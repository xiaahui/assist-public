package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class DissimilarityConstraintTests extends AbstractMappingTest {

	@Test
	def void testCompartmentManufacturer() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Manufacturer = "M1";
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

	Compartment C2 {
		Manufacturer = "M2";
		Box C2_B1 {
			Board C2_B1_B1 {
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
	A1, A2 dissimilar based on Compartment.Manufacturer;
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

		Assert.assertEquals(4, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on compartments from different manufacturers */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 4)].toSet
			Assert.assertEquals(2, taskResults.size)
			Assert.assertNotEquals(taskResults.get(0).manufacturer, taskResults.get(1).manufacturer)
		}
	}


	@Test
	def void testBoxManufacturer() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Box C1_B1 {
			Manufacturer = "M1";
			Board C1_B1_B1 {
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
				}
			}
		}
	
		Box C1_B2 {
			Manufacturer = "M1";
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}

	Compartment C2 {
		Box C2_B1 {
			Manufacturer = "M2";
			Board C2_B1_B1 {
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
	A1, A2 dissimilar based on Box.Manufacturer;
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

		Assert.assertEquals(4, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on boxes from different manufacturers */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 3)].toSet
			Assert.assertEquals(2, taskResults.size)
			Assert.assertNotEquals(taskResults.get(0).manufacturer, taskResults.get(1).manufacturer)
		}
	}

	@Test
	def void testBoardManufacturer() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Manufacturer = "M1";
		Box C1_B1 {
			Board C1_B1_B1 {
				Manufacturer = "MA";
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Manufacturer = "MB";
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}

	Compartment C2 {
		Manufacturer = "M2";
		Box C2_B1 {
			Board C2_B1_B1 {
				Manufacturer = "MC";
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
	A1, A2 dissimilar based on Board.Manufacturer;
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

		Assert.assertEquals(6, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on boards from different manufacturers */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].toSet
			Assert.assertEquals(2, taskResults.size)
			Assert.assertNotEquals(taskResults.get(0).manufacturer, taskResults.get(1).manufacturer)
		}
	}

	@Test
	def void testMultipleDissimilarityConstraints() {
		val assistModel = parser.parse('''
Global {
	System = "Example System";
}
		
Hardware {

	Compartment C1 {
		Manufacturer = "M1";
		Box C1_B1 {
			Board C1_B1_B1 {
				Manufacturer = "MA";
				Processor C1_B1_B1_P1 {
					Core C1_B1_B1_P1_C0 { }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Manufacturer = "MB";
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { }
				}
			}
		}
	}

	Compartment C2 {
		Manufacturer = "M2";
		Box C2_B1 {
			Board C2_B1_B1 {
				Manufacturer = "MC";
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
	A1, A2 dissimilar based on Board.Manufacturer;
	A1, A2 dissimilar based on Compartment.Manufacturer;
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

		Assert.assertEquals(4, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on boards from different manufacturers */
			val taskResultsBoardLevel = assistModel.allTasks.map[result.getHardwareElementForTask(it, 2)].toSet
			Assert.assertEquals(2, taskResultsBoardLevel.size)
			Assert.assertNotEquals(taskResultsBoardLevel.get(0).manufacturer, taskResultsBoardLevel.get(1).manufacturer)

			/* Check that in each result, all tasks are being placed on compartments from different manufacturers */
			val taskResultsCompLevel = assistModel.allTasks.map[result.getHardwareElementForTask(it, 4)].toSet
			Assert.assertEquals(2, taskResultsCompLevel.size)
			Assert.assertNotEquals(taskResultsCompLevel.get(0).manufacturer, taskResultsCompLevel.get(1).manufacturer)
		}
	}


}
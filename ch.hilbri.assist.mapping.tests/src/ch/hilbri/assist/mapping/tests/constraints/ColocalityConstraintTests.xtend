package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test
import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.util.Diagnostician

class ColocalityConstraintTests extends AbstractMappingTest {
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
	A1, A2 on same Core;
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

		Assert.assertEquals("There should only be 3 results, because there are only 3 cores", 3, assistSolver.results.size)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks are being placed on the same core */
			val taskResults = assistModel.allTasks.map[result.getHardwareElementForTask(it, 0)]
			Assert.assertEquals(2, taskResults.size)
			Assert.assertEquals("The tasks should have been placed on the same core", taskResults.get(0), taskResults.get(1))
		}
	}

	@Test
	def void Test2ComplexProcAndBoard() {
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
	Application B1 { Task B1_T1 {} }
	Application B2 { Task B2_T1 {} }
	Application B3 { Task B3_T1 {} }
}

Restrictions {
	A1, A2 on same Processor;
	B1, B2, B3 on same Board;
}		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertTrue("There should be some results", assistSolver.results.size == 9)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks of A1, A2 are being placed on the same processor */
			val applicationAResults = assistModel.allTasks.filter[application.name.startsWith("A")].map[result.getHardwareElementForTask(it, 1)]
			Assert.assertEquals(2, applicationAResults.size)
			Assert.assertEquals("The tasks of A1 and A2 should have been placed on the same processor", applicationAResults.get(0), applicationAResults.get(1))
			
			/* Check that in each result, all tasks of B1, B2 and B3 are being mapped to the same board */
			val applicationBResults = assistModel.allTasks.filter[application.name.startsWith("B")].map[result.getHardwareElementForTask(it, 2)]
			Assert.assertEquals(3, applicationBResults.size)
			val applicationBresultSet = applicationBResults.toSet
			Assert.assertEquals("The tasks of B1, B2 and B3 should have been placed on the same board", 1, applicationBresultSet.size)
		}
	}

	@Test
	def void Test3ComplexBoxAndComp() {
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
	Application B1 { Task B1_T1 {} }
	Application B2 { Task B2_T1 {} }
	Application B3 { Task B3_T1 {} }
}

Restrictions {
	A1, A2 on same Compartment;
	B1, B2, B3 on same Box;
}		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertTrue("There should be some results", assistSolver.results.size == 15)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks of A1, A2 are being placed on the same compartment */
			val applicationAResults = assistModel.allTasks.filter[application.name.startsWith("A")].map[result.getHardwareElementForTask(it, 4)]
			Assert.assertEquals(2, applicationAResults.size)
			Assert.assertEquals("The tasks of A1 and A2 should have been placed on the same compartment", applicationAResults.get(0), applicationAResults.get(1))
			
			/* Check that in each result, all tasks of B1, B2 and B3 are being mapped to the same box */
			val applicationBResults = assistModel.allTasks.filter[application.name.startsWith("B")].map[result.getHardwareElementForTask(it, 3)]
			Assert.assertEquals(3, applicationBResults.size)
			val applicationBresultSet = applicationBResults.toSet
			Assert.assertEquals("The tasks of B1, B2 and B3 should have been placed on the same box", 1, applicationBresultSet.size)
		}
	}
	
	
	
	
		@Test
	def void Test4ComplexBoxAndCompWithTaskReferences() {
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
	Application B1 { Task B1_T1 {} }
	Application B2 { Task B2_T1 {} }
	Application B3 { Task B3_T1 {} }
}

Restrictions {
	A1, A2_T1 on same Compartment;
	B1, B2_T1, B3 on same Box;
}		
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val diagnostic = Diagnostician.INSTANCE.validate(assistModel);
        if (diagnostic.getSeverity() == Diagnostic.ERROR) Assert.fail

		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertTrue("There should be some results", assistSolver.results.size == 15)
		
		for (result : assistSolver.results) {
			/* Check that in each result, all tasks of A1, A2 are being placed on the same compartment */
			val applicationAResults = assistModel.allTasks.filter[application.name.startsWith("A")].map[result.getHardwareElementForTask(it, 4)]
			Assert.assertEquals(2, applicationAResults.size)
			Assert.assertEquals("The tasks of A1 and A2 should have been placed on the same compartment", applicationAResults.get(0), applicationAResults.get(1))
			
			/* Check that in each result, all tasks of B1, B2 and B3 are being mapped to the same box */
			val applicationBResults = assistModel.allTasks.filter[application.name.startsWith("B")].map[result.getHardwareElementForTask(it, 3)]
			Assert.assertEquals(3, applicationBResults.size)
			val applicationBresultSet = applicationBResults.toSet
			Assert.assertEquals("The tasks of B1, B2 and B3 should have been placed on the same box", 1, applicationBresultSet.size)
		}
	}
}
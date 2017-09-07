package ch.hilbri.assist.mapping.tests.basics

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Test
import org.junit.Assert


class IndicatorVariablesTests extends AbstractMappingTest {
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
					Core C1_B1_B1_P1_C0 { Capacity = 100; }
					Core C1_B1_B1_P1_C1 { Capacity = 100; }
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 { Capacity = 100; }
					Core C1_B2_B1_P1_C1 { Capacity = 100; }
				}
			}
		}
	}
}			

Software {
	Application A1 {
		Task A1_T1 {
			CoreUtilization = 10;
		}
		Task A1_T2 {
			CoreUtilization = 10;
		}
	}
}		
		 ''')
		val assistSolver = new AssistSolver(assistModel)
		val solverVariablesContainer = assistSolver.solverVariablesContainer
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		
		val solutions = assistSolver.chocoSolutions
		Assert.assertNotNull(solutions)

		for (solution : solutions) {
			
			/* Now we have to check the indicator variables for each task */
			for (task : assistModel.allTasks) {
				
				/* Find out, where this task was placed to */
				val coreIdxForTask = solution.getIntVal(solverVariablesContainer.getLocationVariablesForTask(task).get(0))
				
				/* Go through all indicator variables for this task and check that they are 0 for all other cores than coreIdx */
				val indicatorVariables = solverVariablesContainer.getIndVarsCoreLevel(task)
				for (i : 0 ..< assistModel.allCores.size) {
					val indicatorVariableValue = solution.getIntVal(indicatorVariables.get(i))
					if (i != coreIdxForTask)
						Assert.assertEquals("IndicatorVariable for task " + task.name + " on core " + i + " should be false, because this task is mapped to core " + coreIdxForTask, 0, indicatorVariableValue)
					else
						Assert.assertEquals("IndicatorVariable for task " + task.name + " on core " + i + " should be true, because this task is mapped to core " + coreIdxForTask, 1, indicatorVariableValue)
				}
			}
			
			/* Now we check the reverse - take the indicator variables for each core and relate that to the placement of the tasks */
			for (coreIter : 0..< assistModel.allCores.size) {
				val indVars = solverVariablesContainer.getIndVarsCoreLevel(assistModel.allCores.get(coreIter))
				for (indVarIter : 0..< indVars.size) {
					// Now we look at the task with the id indVarIter
					// Where is it going to be mapped to?
					val task = assistModel.allTasks.get(indVarIter)
					val taskResult = solution.getIntVal(solverVariablesContainer.getLocationVariablesForTask(task).get(0))
					val indVarValue = solution.getIntVal(indVars.get(indVarIter))
					
					// If the indicatorVariable is false, then the current task is apparently mapped somewhere else - check that!
					if (indVarValue == 0)
						Assert.assertNotEquals(taskResult, coreIter)

					// the indicatorVariable is true, so the task was placed onto the current core - check that!
					else
						Assert.assertEquals(taskResult, coreIter)
				}
			} 
			
		}
	}
}
package ch.hilbri.assist.mapping.tests.other

import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType

class PropNoGoodTests extends AbstractMappingTest {
	@Test
	def void testNoGoodRecording() {
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
					Core C1_B1_B1_P1_C0 {}
					Core C1_B1_B1_P1_C1 {}
				}
			}
		}
	
		Box C1_B2 {
			Board C1_B2_B1 {
				Processor C1_B2_B1_P1 {
					Core C1_B2_B1_P1_C0 {}
					Core C1_B2_B1_P1_C1 {}
					Core C1_B2_B1_P1_C2 {}
				}
			}
		}
	}

	Compartment C2 {
		Manufacturer = "M2";
		Box C2_B1 {
			Board C2_B1_B1 {
				Processor C2_B1_B1_P1 {
					Core C2_B1_B1_P1_C0 {}
				}
			}
		}
	}				
}			

Software {
	Application A1 { Task A1_T1 {} }
}
		''')
		Assert.assertNotNull(assistModel)
		Assert.assertTrue(assistModel.eResource.errors.isEmpty)

		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.noGoodRecording = HardwareArchitectureLevelType.PROCESSOR
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertEquals(3, assistSolver.results.size)
		
		val assistSolverBasic = new AssistSolver(assistModel)
		assistSolverBasic.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolverBasic.solverMaxSolutions = 1000
		assistSolverBasic.runInitialization
		assistSolverBasic.runConstraintGeneration
		assistSolverBasic.noGoodRecording = HardwareArchitectureLevelType.CORE
		assistSolverBasic.runSolutionSearch
		assistSolverBasic.createSolutions

		Assert.assertEquals(6, assistSolverBasic.results.size)
		
		val assistSolverDefault = new AssistSolver(assistModel)
		assistSolverDefault.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolverDefault.solverMaxSolutions = 1000
		assistSolverDefault.runInitialization
		assistSolverDefault.runConstraintGeneration
		assistSolverDefault.runSolutionSearch
		assistSolverDefault.createSolutions

		Assert.assertEquals(6, assistSolverDefault.results.size)
		
				
	}
	
}
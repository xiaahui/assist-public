package ch.hilbri.assist.mapping.tests.benchmarking

import ch.hilbri.assist.mapping.benchmarking.generator.MappingExampleGenerator
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType

class BenchmarkingTests extends AbstractMappingTest {
	@Test
	def void testExampleGenerator() {
		
		val compRange 	= #[1,  2]
		val boxRange 	= #[2,  4]
		val boardRange 	= #[2,  4]
		val procRange 	= #[1,  2]
		val coreRange 	= #[2,  4]
		val appRange 	= #[20, 24]
		val taskRange 	= #[6, 10]
		val dislocRelRange = #[10, 16]
		val dislocAppRange = #[6, 20]
		val dislocLevels = #[HardwareArchitectureLevelType.BOARD, HardwareArchitectureLevelType.BOX, HardwareArchitectureLevelType.COMPARTMENT]
		
		val AssistModel assistModel = MappingExampleGenerator.generateSingleRandomized(compRange, boxRange, boardRange, procRange, coreRange, appRange, taskRange, dislocRelRange, dislocAppRange, dislocLevels)
		
		Assert.assertNotNull("Model should not be null", assistModel)
		Assert.assertTrue("Model should not contain errors", assistModel.eResource.errors.isEmpty)
		Assert.assertTrue("Model should have at least one application", assistModel.applications.size > 0)
		Assert.assertTrue("Model should have at least one core for deployment", assistModel.allCores.size > 0)
		
		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch

		Assert.assertTrue(assistSolver.chocoSolutions.size > 0)
	}	
}
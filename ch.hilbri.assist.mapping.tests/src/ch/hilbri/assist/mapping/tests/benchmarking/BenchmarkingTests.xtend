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
		
		val compRange 		= #[2, 2]
		val boxRange 		= #[4, 6]
		val boardRange 		= #[4, 6]
		val procRange 		= #[1, 2]
		val coreRange 		= #[2, 4]
		val appRange 		= #[16, 24]
		val taskRange 		= #[2, 8]
		val dislocRelRange 	= #[24, 32]
		val dislocAppRange 	= #[4, 6]
		val dislocLevels 	= #[HardwareArchitectureLevelType.BOARD, HardwareArchitectureLevelType.BOX]
		
		val AssistModel assistModel = MappingExampleGenerator.generateSingleRandomized(compRange, boxRange, boardRange, procRange, coreRange, appRange, taskRange, dislocRelRange, dislocAppRange, dislocLevels)
		
		Assert.assertNotNull("Model should not be null", assistModel)
		Assert.assertTrue("Model should not contain errors", assistModel.eResource.errors.isEmpty)
		Assert.assertTrue("Model should have at least one application", assistModel.applications.size > 0)
		Assert.assertTrue("Model should have at least one core for deployment", assistModel.allCores.size > 0)
		
		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1
		assistSolver.solverTimeLimit = 60*100 // 60 seconds
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch

		Assert.assertTrue("The problem should be solvable", assistSolver.chocoSolutions.size > 0)
		
		val filePath = "C:/Users/hilb_ro/tmp/file.mdsl"
		MappingExampleGenerator.saveToFile(assistModel, filePath)
		
	}	
}
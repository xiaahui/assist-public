package ch.hilbri.assist.mapping.tests.benchmarking

import ch.hilbri.assist.mapping.benchmarking.generator.MappingExampleGenerator
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import org.junit.Assert
import org.junit.Test

class BenchmarkingTests extends AbstractMappingTest {
	@Test
	def void testExampleGenerator() {
		val AssistModel assistModel = MappingExampleGenerator.generate
		
		Assert.assertNotNull("Model should not be null", assistModel)
		Assert.assertTrue("Model should not contain errors", assistModel.eResource.errors.isEmpty)
		Assert.assertTrue("Model should have at least one application", assistModel.applications.size > 0)
		Assert.assertTrue("Model should have at least one core for deployment", assistModel.allCores.size > 0)
		
		val assistSolver = new AssistSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
		assistSolver.solverMaxSolutions = 1000
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertTrue(assistSolver.results.size > 0)
	}	
}
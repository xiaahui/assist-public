package ch.hilbri.assist.mapping.tests.basics

import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import ch.hilbri.assist.model.AssistModel
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.*

class ExampleTests extends AbstractMappingTest {

	@Test
	def void exampleSpecFileTest() {
		val pathURL = ExampleTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)
		val finalPath = Paths.get(path.root.toString, subPath.toString,
			"ch.hilbri.assist.mapping/resources/example.mdsl")

		logger.debug("Example file loaded from: " + finalPath)

		val input = new String(Files.readAllBytes(finalPath))

		val r = resourceHelper.resource(input)
		assertEquals("There should be 0 errors in the mdsl file", 0, r.errors.size)
	}

	@Test
	def void exampleInfineonFileTest() {
		val pathURL = ExampleTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)
		val finalPath = Paths.get(path.root.toString, subPath.toString,
			"ch.hilbri.assist.mapping/resources/example-infineon-aurix.mdsl")

		logger.debug("Example file loaded from: " + finalPath)

		val input = new String(Files.readAllBytes(finalPath))

		val r = resourceHelper.resource(input)
		assertEquals("There should be 0 errors in the mdsl file", 0, r.errors.size)

		val assistModel = r.contents.head as AssistModel
		val assistSolver = new AssistMappingSolver(assistModel)
		assistSolver.setSolverSearchStrategy(VariableSelectorTypes.DOM_OVER_WDEG, ValueSelectorTypes.MIN_VALUE_FIRST)
		assistSolver.solverMaxSolutions = 10
		assistSolver.runInitialization
		assistSolver.runConstraintGeneration
		assistSolver.runSolutionSearch
		assistSolver.createSolutions

		Assert.assertEquals(1, assistSolver.results.size)
	}

	@Test
	def void testSyntheticExamples() {
		val pathURL = ExampleTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)

		for (i : 0 ..< 2) {
			val finalPath = Paths.get(path.root.toString,
				subPath.toString, '''ch.hilbri.assist.mapping.tests/resources/example-«i».mdsl''')
			logger.debug('''Loading file «finalPath.toString»''')
			val input = new String(Files.readAllBytes(finalPath))
			val r = resourceHelper.resource(input)
			Assert.assertEquals("There should be 0 errors in the mdsl file", 0, r.errors.size)

			val assistModel = r.contents.head as AssistModel
			val assistSolver = new AssistMappingSolver(assistModel)
			assistSolver.setSolverSearchStrategy(VariableSelectorTypes.DOM_OVER_WDEG,
				ValueSelectorTypes.MIN_VALUE_FIRST)
			assistSolver.solverMaxSolutions = 1
			assistSolver.runInitialization
			assistSolver.runConstraintGeneration
			assistSolver.runSolutionSearch

			Assert.assertTrue(assistSolver.chocoSolutions.size > 0)
			logger.debug('''------------------------------------''')
		}
	}
}

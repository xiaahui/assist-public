package ch.hilbri.assist.mapping.tests.benchmarking

import ch.hilbri.assist.mapping.benchmarking.generator.MappingExampleGenerator
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import org.junit.Assert
import org.junit.Test

class BenchmarkingEntry {
	@Accessors String name
	@Accessors int constraintCount
	@Accessors int variableCount	
	@Accessors long failCount	
	@Accessors long backtrackCount	
	@Accessors long resolutionTimeInNS

	public override String toString() {
		'''«name»: «constraintCount» constraints, «variableCount» variables, «failCount» fails, «backtrackCount» backtracks, «resolutionTimeInNS / 1000000.0» resolution time (ms)'''
	}	
}

class BenchmarkingTests extends AbstractMappingTest {
	
	@Test
	def void benchmarkSyntheticExamples() {

		val benchmarkingList = new ArrayList<BenchmarkingEntry>

		val pathURL = class.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)

		for (i : 0 ..< 21)  {
			val finalPath = Paths.get(path.root.toString, subPath.toString, '''ch.hilbri.assist.mapping.tests/resources/example-«i».mdsl''')
			logger.debug('''Loading file «finalPath.toString»''')
			val input = new String(Files.readAllBytes(finalPath))
			val r = resourceHelper.resource(input)	
			Assert.assertEquals("There should be 0 errors in the mdsl file", 0, r.errors.size)

			val assistModel = r.contents.head as AssistModel
			val assistSolver = new AssistSolver(assistModel)
			assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
			assistSolver.solverMaxSolutions = 1
			assistSolver.solverTimeLimit = 60*100 // 60 seconds
			assistSolver.runInitialization
			assistSolver.runConstraintGeneration
			assistSolver.runSolutionSearch

			Assert.assertTrue(assistSolver.chocoSolutions.size > 0) 
			logger.debug('''------------------------------------''')
			
			val entry = new BenchmarkingEntry
			entry.name = finalPath.toString
			entry.constraintCount = assistSolver.chocoModel.nbCstrs
			entry.variableCount = assistSolver.chocoModel.nbVars
			entry.resolutionTimeInNS = assistSolver.chocoModel.solver.measures.timeCountInNanoSeconds
			entry.failCount = assistSolver.chocoModel.solver.measures.failCount
			entry.backtrackCount = assistSolver.chocoModel.solver.measures.backTrackCount
			
			benchmarkingList.add(entry)
		}
		
		for (e : benchmarkingList)
			logger.debug(e.toString())
	}
	
	@Test
	def void generateSyntheticExamples() {
		
		val pathURL = BenchmarkingTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)
	
		
		var exampleCounter = 0
		val maxExamples = 20
		
		while(exampleCounter <= maxExamples) {
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

			if (assistSolver.chocoSolutions.size > 0) {
				val finalPath = Paths.get(path.root.toString, subPath.toString, '''ch.hilbri.assist.mapping.tests/resources/example-«exampleCounter++».mdsl''')
				logger.debug(finalPath.toString)	
				MappingExampleGenerator.saveToFile(assistModel, finalPath.toString)
			}
		}
	}	
}
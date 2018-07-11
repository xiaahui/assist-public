package ch.hilbri.assist.dse.tests.basics

import ch.hilbri.assist.dse.evaluation.Evaluation
import ch.hilbri.assist.dse.tests.AbstractDSETest
import ch.hilbri.assist.dse.ui.handlers.EvalDesignSpace.Mode
import ch.hilbri.assist.model.AssistModel
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import org.junit.Test

import static org.junit.Assert.*

class VariancePointRemovalTests extends AbstractDSETest {
	@Test
	def void checkBasicExample() {
		val pathURL = VariancePointRemovalTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)
		val finalPath = Paths.get(path.root.toString, subPath.toString,
			"ch.hilbri.assist.dse.tests/resources/example.ddsl")

		logger.debug('''Example file loaded from: "«finalPath»"''')

		val input = new String(Files.readAllBytes(finalPath))

		val r = resourceHelper.resource(input)
		assertEquals("There should be 0 errors in the ddsl file", 0, r.errors.size)
	}

	@Test
	def void checkProductGeneration() {
		val pathURL = VariancePointRemovalTests.protectionDomain.codeSource.location
		val pathURI = (new File(pathURL.file).toURI)
		val path = Paths.get(pathURI)
		val subPath = path.subpath(0, path.nameCount - 3)
		val finalPath = Paths.get(path.root.toString, subPath.toString,
			"ch.hilbri.assist.dse.tests/resources/example.ddsl")

		logger.debug('''Example file loaded from: "«finalPath»"''')

		val input = new String(Files.readAllBytes(finalPath))
		val r = resourceHelper.resource(input) 
		val assistModel = r.contents.get(0) as AssistModel
		
		val evalJob = new Evaluation(assistModel, Mode.FEASIBILITY_ONLY)
		evalJob.run
		
		val explorationCandidates = evalJob.explorationResults
		assertEquals(2, explorationCandidates.size)
		
		for (candidate : explorationCandidates) {
			/* Check that there are no variance points left */
			assertTrue(candidate.model.allBoxes.map[boardAlternatives].flatten.isNullOrEmpty)
			assertTrue(candidate.model.applicationAlternatives.isNullOrEmpty)
			assertTrue(candidate.model.restrictionAlternatives.isNullOrEmpty)

			if (candidate.candidate.name == "Cheap") {
				assertEquals(2, candidate.model.allBoards.size)
				assertEquals("Board2", candidate.model.allBoards.get(1).name)	
				assertEquals(3, candidate.model.applications.size)
				assertEquals(1, candidate.model.dislocalityRelations.size)
			} else if (candidate.candidate.name == "Expensive") {
				assertEquals(2, candidate.model.allBoards.size)
				assertEquals("Board3", candidate.model.allBoards.get(1).name)	
				assertEquals(2, candidate.model.applications.size)
				assertEquals(0, candidate.model.dislocalityRelations.size)
			} else {
				fail
			}
		}
	}

}

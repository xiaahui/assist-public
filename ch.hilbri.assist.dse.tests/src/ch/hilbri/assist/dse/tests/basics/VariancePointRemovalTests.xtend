package ch.hilbri.assist.dse.tests.basics

import ch.hilbri.assist.dse.tests.AbstractDSETest
import org.junit.Test
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

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
}

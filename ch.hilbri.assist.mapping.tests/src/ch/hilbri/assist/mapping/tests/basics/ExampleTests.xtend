package ch.hilbri.assist.mapping.tests.basics

import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
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
}

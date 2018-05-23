package ch.hilbri.assist.scheduling.tests.importer

import ch.hilbri.assist.scheduling.importer.ImportAPP4MCModel
import ch.hilbri.assist.scheduling.tests.AbstractSchedulingTest
import java.io.File
import java.nio.file.Paths
import org.junit.Test
import org.junit.Assert

class AmaltheaImporterTests extends AbstractSchedulingTest {
    
    /* We test the importer for the amalthea 0.9.0 format with an example */
    @Test
    def testExampleImport() {
        val pathURL = class.protectionDomain.codeSource.location
        val pathURI = (new File(pathURL.file).toURI)
        val path = Paths.get(pathURI)
        val subPath = path.subpath(0, path.nameCount - 3)
        val finalPath = Paths.get(path.root.toString, subPath.toString, '''ch.hilbri.assist.scheduling.tests/resources/democar.amxmi''').toString
        
        logger.debug('''Loading file «finalPath.toString»''')
        
        val assistModel = ImportAPP4MCModel.createAssistModel(finalPath)
        
        Assert.assertNotNull(assistModel)
    }
    
    
}
	
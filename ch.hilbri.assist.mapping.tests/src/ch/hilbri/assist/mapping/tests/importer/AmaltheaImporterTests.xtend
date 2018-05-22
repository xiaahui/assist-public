package ch.hilbri.assist.mapping.tests.importer

import ch.hilbri.assist.mapping.importer.ImportAPP4MCModel
import ch.hilbri.assist.mapping.tests.AbstractMappingTest
import java.io.File
import java.nio.file.Paths
import org.junit.Test
import org.junit.Assert

class AmaltheaImporterTests extends AbstractMappingTest {
    
    /* We test the importer for the amalthea 0.9.0 format with an example */
    @Test
    def testExampleImport() {
        val pathURL = class.protectionDomain.codeSource.location
        val pathURI = (new File(pathURL.file).toURI)
        val path = Paths.get(pathURI)
        val subPath = path.subpath(0, path.nameCount - 3)
        val finalPath = Paths.get(path.root.toString, subPath.toString, '''ch.hilbri.assist.mapping.tests/resources/democar.amxmi''').toString
        
        logger.debug('''Loading file «finalPath.toString»''')
        
        val assistModel = ImportAPP4MCModel.createAssistModel(finalPath)
        
        Assert.assertNotNull(assistModel)
    }
    
    
}
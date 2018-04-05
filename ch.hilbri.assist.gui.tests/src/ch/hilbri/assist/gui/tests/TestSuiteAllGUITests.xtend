package ch.hilbri.assist.gui.tests

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import ch.hilbri.assist.gui.tests.basics.SimpleTests

@RunWith(Suite) 
@SuiteClasses(
    #[
      SimpleTests
     ]
)

class TestSuiteAllGUITests {
    
}
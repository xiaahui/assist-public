package ch.hilbri.assist.scheduling.dsl.tests

//import ch.hilbri.assist.scheduling.model.AssistModelScheduling
//import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
//import org.eclipse.xtext.testing.util.ParseHelper
//import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(SchedulingDslInjectorProvider)
class SchedulingDslParsingTest {
//	@Inject
//	ParseHelper<AssistModelScheduling> parseHelper
	
	@Test
	def void loadModel() {
//		val result = parseHelper.parse('''
//			Hello Xtext!
//		''')
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}

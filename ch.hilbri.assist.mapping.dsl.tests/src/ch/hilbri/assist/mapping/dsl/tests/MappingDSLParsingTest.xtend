package ch.hilbri.assist.mapping.dsl.tests

//import ch.hilbri.assist.mapping.model.AssistModel
//import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
//import org.eclipse.xtext.junit4.util.ParseHelper
//import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MappingDSLInjectorProvider)
class MappingDSLParsingTest{

//	@Inject
//	ParseHelper<AssistModel> parseHelper

	@Test 
	def void loadModel() {
//		val result = parseHelper.parse('''
//			Hello Xtext!
//		''')
//		Assert.assertNotNull(result)
	}

}

package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.dsl.tests.MappingDSLInjectorProvider
import ch.hilbri.assist.model.ModelPackage
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.util.ResourceHelper
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.model.AssistModel

@RunWith(XtextRunner)
@InjectWith(MappingDSLInjectorProvider)
class AbstractMappingTest {

	protected String input
	protected Logger logger

	new() {
		logger = LoggerFactory.getLogger(this.class)
	}

	@Inject
	protected ParseHelper<AssistModel> parser

	@Inject
	protected ResourceHelper resourceHelper

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }

}

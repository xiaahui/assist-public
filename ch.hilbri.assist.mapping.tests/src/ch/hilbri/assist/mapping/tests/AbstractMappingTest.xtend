package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.mapping.dsl.tests.MappingDSLInjectorProvider
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.ModelPackage
import ch.hilbri.assist.mapping.model.result.Result
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.util.ResourceHelper
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class AbstractMappingTest {

	protected String input
	protected AssistModel model
	protected ArrayList<Result> allResults

	private Logger logger

	new() {
		logger = LoggerFactory.getLogger(AbstractMappingTest)
	}

	@Inject
	protected ParseHelper<AssistModel> parser

	@Inject
	protected ResourceHelper resourceHelper

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }

}

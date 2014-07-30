package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.datamodel.PostProcessor
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.SolverJob
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.BeforeClass
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class AbstractMappingTest {
	
	protected String input
	protected AssistModel model
	protected ArrayList<Result> allResults

	@Inject
	protected ParseHelper<AssistModel> parser

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	@Before
	def void loadModelAndCreateResults() {
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		/* Fix the model */
		PostProcessor.createMissingThreads(model);
		assertNotNull(model) 

		/* Create the job to search for new solutions */
		val findSolutionsJob = new SolverJob("", model, null)
		findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE)
		findSolutionsJob.setMaxSolutions(1000)
		assertNotNull(findSolutionsJob)

		/* Execute this job */
		findSolutionsJob.execute(new MyTestingMonitor, false)
		
		/* Store the results */
		allResults = findSolutionsJob.newMappingResults
		assertNotNull(allResults)
	}
	
}
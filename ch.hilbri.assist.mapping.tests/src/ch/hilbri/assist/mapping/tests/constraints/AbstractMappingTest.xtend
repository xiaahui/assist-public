package ch.hilbri.assist.mapping.tests.constraints

import ch.hilbri.assist.mapping.model.result.Result
import ch.hilbri.assist.mapping.dsl.tests.MappingDSLInjectorProvider
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.ModelPackage
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Before
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static org.junit.Assert.*

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

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	@Before
	def void loadModelAndCreateResults() {
		/* Parse the input */
		model = parser.parse(input)
		
		/* Fix the model */
		assertNotNull(model) 

		/* Create the job to search for new solutions */
		val solver = new AssistSolver(model)
//		val solver = new AssistSolver(model, #[0], true, false)
		solver.solverSearchStrategy = SearchType.getDefaultSearchType
		solver.solverMaxSolutions = 10000
		assertNotNull(solver)
		
		/* Execute this job */
		try {
			solver.runModelPreprocessors
			solver.propagation
			solver.solutionSearch
		}
		catch (BasicConstraintsException e) {
			val constraintName = e.getConstraintName
			val message = e.getExplanation
			logger.info("Inconsistency found while processing constraint \"" + constraintName + "\"");
			logger.info("\""+ message + "\"");
		}

		/* Store the results */
		allResults = solver.results
		assertNotNull(allResults)
	}
}

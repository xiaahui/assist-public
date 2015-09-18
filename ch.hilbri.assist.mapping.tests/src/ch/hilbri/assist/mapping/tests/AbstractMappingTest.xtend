package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.SearchType
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static org.junit.Assert.*

@InjectWith(MappingDSLInjectorProvider)
@RunWith(XtextRunner)
class AbstractMappingTest {

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
	
	def void loadModelAndCreateResults(String input) {
		/* Parse the input */
		model = parser.parse(input) as AssistModel
		
		/* Fix the model */
		assertNotNull(model) 

		/* Create the job to search for new solutions */
		val solver = new AssistSolver(model)
		solver.solverSearchStrategy = SearchType.getDefaultSearchType
		solver.solverMaxSolutions = 10000
		assertNotNull(solver)
		
		/* Execute this job */
		try {
			solver.propagation
			solver.solutionSearch
			solver.createSolutions
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

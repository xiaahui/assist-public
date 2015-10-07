package ch.hilbri.assist.mapping.tests

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.util.ResourceHelper
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
	
	@Inject
	protected ResourceHelper resourceHelper
	

	@BeforeClass
	def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }	
	
	
	
	def void loadModelAndCreateResults(String input) {
		loadModelAndCreateResults(input, false, false)
	}
	
	def void loadModelAndCreateResults(String input, boolean ignoreErrors, boolean ignoreWarnings) {
		
		/* Check for syntactical errors - if requested */
		if (!ignoreErrors) {
			val r = resourceHelper.resource(input)
			assertEquals("There should be 0 errors", 0, r.errors.size)
		}

		/* Parse the input */
		model = parser.parse(input) 
		assertNotNull(model) 
		
		/* Check for semantic warning - if requested */
		if (!ignoreWarnings) {		
			val d = Diagnostician.INSTANCE.validate(model)
			assertEquals("There should be 0 warnings", Diagnostic.OK, d.getSeverity)		
		}
		
		/* Create the job to search for new solutions */
		val solver = new AssistSolver(model)
		solver.setSolverSearchStrategy(VariableSelectorTypes.getDefault, ValueSelectorTypes.getDefault)
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

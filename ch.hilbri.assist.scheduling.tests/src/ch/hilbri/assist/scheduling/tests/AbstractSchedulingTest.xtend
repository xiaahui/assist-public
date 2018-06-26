package ch.hilbri.assist.scheduling.tests

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.scheduling.dsl.tests.SchedulingDslInjectorProvider
import ch.hilbri.assist.scheduling.solver.AssistSchedulingSolver
import ch.hilbri.assist.scheduling.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.scheduling.solver.strategies.VariableSelectorTypes
import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.joran.JoranConfigurator
import ch.qos.logback.core.joran.spi.JoranException
import com.google.inject.Inject
import java.io.IOException
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.util.ResourceHelper
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@RunWith(XtextRunner)
@InjectWith(SchedulingDslInjectorProvider)
class AbstractSchedulingTest {

    protected String input
    protected Logger logger

    new() {
        /* Configure Logback programmatically to use logback-test.xml */
        val iLoggerFactory = LoggerFactory.getILoggerFactory
        val loggerContext = iLoggerFactory as LoggerContext
        loggerContext.reset
        val configurator = new JoranConfigurator
        configurator.setContext(loggerContext)
        try {
            configurator.doConfigure(class.getResourceAsStream("/logback-test.xml"))
        } catch (JoranException e) {
            throw new IOException(e.getMessage(), e)
        }

        logger = LoggerFactory.getLogger(this.class)
    }

    @Inject
    protected ParseHelper<AssistModel> parser

    @Inject
    protected ResourceHelper resourceHelper

    @BeforeClass
    def static void registerEPackage() { ModelPackage.eINSTANCE.eClass() }

    protected def static AssistSchedulingSolver createAndRunSolver(AssistModel assistModel) {
        val assistSolver = new AssistSchedulingSolver(assistModel)
        assistSolver.setSolverSearchStrategy(VariableSelectorTypes.^default, ValueSelectorTypes.^default)
        assistSolver.solverMaxSolutions = 1
        assistSolver.runInitialization
        assistSolver.runConstraintGeneration
        assistSolver.runSolutionSearch
        assistSolver.createSolutions
        return assistSolver
    }
}

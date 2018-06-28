package ch.hilbri.assist.scheduling.solver

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.SchedulingResult
import ch.hilbri.assist.scheduling.results.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.scheduling.solver.constraints.AbstractSchedulingConstraint
import ch.hilbri.assist.scheduling.solver.constraints.EnforcePeriodicityConstraint
import ch.hilbri.assist.scheduling.solver.constraints.ExecutionInstanceOrderConstraint
import ch.hilbri.assist.scheduling.solver.constraints.OnlyOneTaskPerTimePerCoreConstraint
import ch.hilbri.assist.scheduling.solver.constraints.SchedulingRestrictionsConstraint
import ch.hilbri.assist.scheduling.solver.constraints.SharedResourcesConstraint
import ch.hilbri.assist.scheduling.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.scheduling.solver.exceptions.HyperPeriodLengthException
import ch.hilbri.assist.scheduling.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.scheduling.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.scheduling.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.scheduling.solver.variables.SolverVariablesContainer
import java.util.List
import org.chocosolver.solver.Model
import org.chocosolver.solver.Solution
import org.chocosolver.solver.Solver
import org.chocosolver.solver.search.limits.FailCounter
import org.chocosolver.solver.search.limits.SolutionCounter
import org.chocosolver.solver.search.strategy.Search
import org.chocosolver.util.criteria.Criterion
import org.eclipse.core.runtime.Platform
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AssistSchedulingSolver {

    Logger logger = LoggerFactory.getLogger(this.class)
    AssistModel assistModel
    Model chocoModel
	Solver chocoSolver
	List<Solution> chocoSolutions
    SolverVariablesContainer solverVariables
	List<AbstractModelPreprocessor> modelPreprocessors
	List<AbstractSchedulingConstraint> schedulingConstraintsList
	List<SchedulingResult> schedulingResults

    new(AssistModel input) {

        logger.info('''******************************''')
        logger.info('''        ASSIST Solver         ''')
        logger.info('''******************************''')

        /* Do not print something out, if we are on the CLI */
        if (Platform.getBundle("ch.hilbri.assist.gui") !== null) {
            logger.info('''    Version : «Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version")» ''')
            logger.info('''    Platform: «System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit"»''')
            logger.info('''******************************''')
        }

        chocoModel = new Model("ASSIST")
        chocoSolver = chocoModel.solver
        chocoSolutions = newArrayList
        assistModel = input
        modelPreprocessors = newArrayList
        solverVariables = new SolverVariablesContainer(assistModel, chocoModel)
        schedulingConstraintsList = newArrayList
        schedulingConstraintsList.add(new OnlyOneTaskPerTimePerCoreConstraint(assistModel, chocoModel, solverVariables))
        schedulingConstraintsList.add(new ExecutionInstanceOrderConstraint(assistModel, chocoModel, solverVariables))
        schedulingConstraintsList.add(new EnforcePeriodicityConstraint(assistModel, chocoModel, solverVariables))
        schedulingConstraintsList.add(new SchedulingRestrictionsConstraint(assistModel, chocoModel, solverVariables))
        schedulingConstraintsList.add(new SharedResourcesConstraint(assistModel, chocoModel, solverVariables))
        schedulingResults = newArrayList
    }

    def setSolverTimeLimit(long timeInMs) {
        logger.info("Setting choco-solver search time limit to " + timeInMs + "ms")
        chocoSolver.limitTime(timeInMs)
    }

    def setSolverMaxSolutions(int maxSolutions) {
        logger.info("Setting choco-solver max solutions limit to " + maxSolutions)
        chocoSolver.limitSolution(maxSolutions)
    }

    def setSolverSearchStrategy(VariableSelectorTypes varSelector, ValueSelectorTypes valSelector) {
        val seed = 12345 // Calendar.instance.timeInMillis 
        logger.info('''Setting interface selection strategy to: "«varSelector.humanReadableName»"''')
        if (varSelector.isValueSelectorRequired)
            logger.info('''Setting connector selection strategy to: "«valSelector.humanReadableName»"''')

        val strategy = varSelector.getStrategy(solverVariables, assistModel, seed, valSelector)

        // Set the search strategy
        chocoSolver.setSearch(
            strategy,
            Search.lastConflict(strategy)
        )
    }

    def setEnableRestarts(int maxFailCount) {
        logger.info('''Enabling a restart after each solution and after «maxFailCount» fails''')

        // Trigger a restart after each solution
        chocoSolver.setGeometricalRestart(1, 1, new SolutionCounter(chocoModel, 1), Integer.MAX_VALUE)
        // Trigger a restart after X Fails (X = 100)
        chocoSolver.setGeometricalRestart(maxFailCount, 1, new FailCounter(chocoModel, 1), Integer.MAX_VALUE)
    }

    def runInitialization() {
        logger.info("Running pre-processors ... ")
        for (p : this.modelPreprocessors)
            logger.info(" - Processing " + p.name)
        logger.info(".. done")
    }

    def runConstraintGeneration() throws BasicConstraintsException {

        logger.info("Checking the length of the hyperperiod ...")
        if (solverVariables.hypLength < 0)
            throw new HyperPeriodLengthException(solverVariables.hypLength)

        logger.info("Starting to generate constraints for the choco-solver ...")

        for (constraint : schedulingConstraintsList) {
            logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
            if (!constraint.generate()) {
                logger.info('''      No effective constraints found''')
            }
            logger.info('''   done.''')
        }
    }

    def runSolutionSearch() throws BasicConstraintsException {
        logger.info("Starting to search for solutions")

        // Clear old results
        schedulingResults.clear

        logger.info("Initiating choco-solver - searching for a solution")
        chocoSolutions = chocoSolver.findAllSolutions()
        logger.info('''Search results ''')
        logger.info('''  - Solutions found: «chocoSolutions.size»''')
        logger.debug('''Internal solver statistics: «chocoSolver.measures.toOneLineString»''')
    }

    def createSolutions() {
        if (chocoSolver.stopCriterionMet)
            logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

        // Did we find a solution? 
        if (chocoSolutions.size > 0) {
            schedulingResults = ResultFactoryFromSolverSolutions.create(assistModel, solverVariables, chocoSolutions)
            logger.debug('''Results created:  «schedulingResults.size»''')
        } // We found no solution
        else {

            // Is there no solution at all? The solver must not have reached a pre-defined limit then
            if (!chocoSolver.stopCriterionMet) {
                logger.info("Solver searched through the entire search space without reaching a limit.")
                logger.info("There is no solution for this specification")
            }
        }
    }

    def List<SchedulingResult> getResults() {
        schedulingResults
    }

    def stopCriterionMet() {
        chocoSolver.stopCriterionMet
    }

    def setStopCriterion(Criterion c) {
        chocoSolver.addStopCriterion(c)
    }

    /** For the tests */
    def SolverVariablesContainer getSolverVariablesContainer() {
        solverVariables
    }

    /** For the tests */
    def List<Solution> getChocoSolutions() {
        chocoSolutions
    }

    /** For benchmarking tests */
    def Model getChocoModel() {
        chocoModel
    }
}

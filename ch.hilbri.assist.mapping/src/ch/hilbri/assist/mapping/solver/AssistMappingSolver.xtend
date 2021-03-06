package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.CoreUtilizationConstraint
import ch.hilbri.assist.mapping.solver.constraints.DesignAssuranceLevelConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.DissimilarityConstraint
import ch.hilbri.assist.mapping.solver.constraints.FeatureConstraint
import ch.hilbri.assist.mapping.solver.constraints.RAMorROMCapacityConstraint
import ch.hilbri.assist.mapping.solver.constraints.RAMorROMCapacityConstraint.RessourceType
import ch.hilbri.assist.mapping.solver.constraints.RestrictDeploymentConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.PartialSolutionSaveMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.HardwareArchitectureLevelType
import ch.hilbri.assist.model.MappingResult
import java.util.ArrayList
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

class AssistMappingSolver {

	Logger logger = LoggerFactory.getLogger(AssistMappingSolver)
	AssistModel assistModel
	Model chocoModel
	Solver chocoSolver
	List<Solution> chocoSolutions
	SolverVariablesContainer solverVariables
	ArrayList<AbstractModelPreprocessor> modelPreprocessors
	ArrayList<AbstractMappingConstraint> mappingConstraintsList
	ArrayList<MappingResult> mappingResults

	boolean savePartialSolution = false

	new(AssistModel input) {

		logger.info('''******************************''')
		logger.info('''        ASSIST Solver         ''')
		logger.info('''******************************''')

		/* Do not print something our, if we are on the CLI */
		if (Platform.getBundle("ch.hilbri.assist.gui") !== null) {
			logger.
				info('''    Version : «Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version")» ''')
			logger.
				info('''    Platform: «System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit"»''')
			logger.info('''******************************''')
		}

		chocoModel = new Model("ASSIST")
		chocoSolver = chocoModel.solver
		chocoSolutions = newArrayList
		assistModel = input
		modelPreprocessors = newArrayList
		solverVariables = new SolverVariablesContainer(assistModel, chocoModel)

		mappingConstraintsList = newArrayList
		mappingConstraintsList.add(new SystemHierarchyConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new RestrictDeploymentConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new DesignAssuranceLevelConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new CoreUtilizationConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(
			new RAMorROMCapacityConstraint(assistModel, chocoModel, solverVariables, RessourceType.RAM))
		mappingConstraintsList.add(
			new RAMorROMCapacityConstraint(assistModel, chocoModel, solverVariables, RessourceType.ROM))
		mappingConstraintsList.add(new FeatureConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new ColocalityConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new DislocalityConstraint(assistModel, chocoModel, solverVariables))
		mappingConstraintsList.add(new DissimilarityConstraint(assistModel, chocoModel, solverVariables))

		mappingResults = newArrayList

	/* Attach the search monitors */
//        chocoSolver.plugMonitor(monSolutionFound = new SolutionFoundMonitor)
	}

	def setSavePartialSolution(boolean value) {
		savePartialSolution = value
		if (value) {
			logger.info("Enabled saving of partial solutions if no solutions are found")
			chocoSolver.plugMonitor(new PartialSolutionSaveMonitor(chocoModel, solverVariables))
		} else {
			logger.info("Disabled saving of partial solutions if no solutions are found")
		}
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

	/**
	 * This may be posted in addition to the SMF.nogoodrecording from above to
	 * prevent symmetric solutions on the RDC-level (or other levels)
	 */
	def setNoGoodRecording(HardwareArchitectureLevelType level) {
		logger.info('''Enforcing different solutions on «level»-level''')

		// Reset the previous nogood setting and initialize nogood
		chocoSolver.noGoodRecordingFromSolutions = solverVariables.getLocationVariablesForLevel(level.value)
	}

	def setEnableMinimization() {
//		logger.info('''Enabling minimization of cable weight during search''')
//		mappingConstraintsList.add(new ObjectiveFunctionConstraint(dataModel, chocoModel, solverVariables))
//		enableMinimization = true
	}

	def runInitialization() {
		logger.info("Running pre-processors ... ")
		for (p : this.modelPreprocessors)
			logger.info(" - Processing " + p.name)
		logger.info(".. done")
	}

	def runConstraintGeneration() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver ...")

		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
				logger.info('''      No effective constraints found''')
			}
			logger.info('''   done.''')
		}
		val vars = solverVariables.locationVariablesForCoreLevel
		logger.info('''After initial propagation:''')
		logger.info('''      «vars.filter[instantiated].size» / «vars.size» location variables instantiated''')
		logger.info("... done")
	}

	def runSolutionSearch() throws BasicConstraintsException {
		logger.info("Starting to search for solutions")

		// Clear old results
		mappingResults.clear

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
			mappingResults = ResultFactoryFromSolverSolutions.create(assistModel, solverVariables, chocoSolutions)
			logger.debug('''Results created:  «mappingResults.size»''')
		} // We found no solution
		else {

			// Is there no solution at all? The solver must not have reached a pre-defined limit then
			if (!chocoSolver.stopCriterionMet) {
				logger.info("Solver searched through the entire search space without reaching a limit.")
				logger.info("There is no solution for this specification")
			}

			// Should we at least save a partial solution?
			if (savePartialSolution) {
//				mappingResults = ResultFactoryFromSolverSolutions.createPartialResult(dataModel, solverVariables,
//					partialSolutionSaveMonitor.partialSolution)
//				logger.
//					info('''Created «mappingResults.size» partial solution with «mappingResults.get(0).mapping.keySet.size» mapped interfaces''')
			}

		}
	}

	def ArrayList<MappingResult> getResults() {
		mappingResults
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

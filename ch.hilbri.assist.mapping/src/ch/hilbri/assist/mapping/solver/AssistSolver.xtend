package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.ConnectedPinsConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.InterfaceTypeConstraint
import ch.hilbri.assist.mapping.solver.constraints.PinMappingConstraints
import ch.hilbri.assist.mapping.solver.constraints.RestrictInvalidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictValidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.BacktrackingMonitor
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.DownBranchMonitor
import ch.hilbri.assist.mapping.solver.monitors.PartialSolutionSaveMonitor
import ch.hilbri.assist.mapping.solver.monitors.RestartMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupCombinations
import ch.hilbri.assist.mapping.solver.preprocessors.EqInterfaceGroupDefinitions
import ch.hilbri.assist.mapping.solver.preprocessors.InvalidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.preprocessors.ModelShortcutBuilder
import ch.hilbri.assist.mapping.solver.preprocessors.ValidDeploymentHardwareElements
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.apache.commons.math4.stat.descriptive.DescriptiveStatistics
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.Propagator
import org.chocosolver.solver.search.loop.monitors.FailPerPropagator
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy
import org.chocosolver.solver.variables.IntVar
import org.eclipse.core.runtime.Platform
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AssistSolver {
	
	private AssistModel model
	private Solver solver
	private AllSolutionsRecorder recorder
	private SolverVariablesContainer solverVariables
	private ArrayList<AbstractMappingConstraint> mappingConstraintsList
	private ArrayList<Result> mappingResults
	private Logger logger
	private boolean savePartialSolution = false
	private PartialSolutionSaveMonitor partialSolutionSaveMonitor
	private FailPerPropagator counter
	private int randomSeed = 12345

	new (AssistModel p_model) {
		
		logger = LoggerFactory.getLogger(this.class)
		
		logger.info('''******************************''')
		logger.info(''' Executing a new AssistSolver''')
		logger.info('''******************************''')
		
		if (Platform.getBundle("ch.hilbri.assist.application.gui") != null) {
			logger.info('''    Version : «Platform.getBundle("ch.hilbri.assist.application.gui").getHeaders().get("Bundle-Version")» ''')
			logger.info('''    Platform: «System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit"»''')
			logger.info('''******************************''')
		}
			
		/* Store the model */
		model = p_model

		/* Create all preprocessors */
		val modelPreprocessors = new ArrayList<AbstractModelPreprocessor> 
		modelPreprocessors.add(new ModelShortcutBuilder(model))  // <- needs to be the first preProcessor to setup all shortcuts
		modelPreprocessors.add(new EqInterfaceGroupDefinitions(model))
		modelPreprocessors.add(new EqInterfaceGroupCombinations(model))
		modelPreprocessors.add(new ValidDeploymentHardwareElements(model))
		modelPreprocessors.add(new InvalidDeploymentHardwareElements(model))
		
		/* Run all preprocessors */
		logger.info("Running pre-processors")
		for (p : modelPreprocessors) { 
			logger.info(" - Processing " + p.name)
			if (!p.execute) logger.info('''      There is nothing to be done.''')
		}
			
		/* Create a new Solver object */
		solver = new Solver()
		
		/* Create a new recorder for our solutions */
		recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		solverVariables = new SolverVariablesContainer(model, solver)
		
		/* Attach a fail-counter */
		counter = new FailPerPropagator(solver.cstrs, solver)
		
		/* The same solution should not be found twice */
		SMF.nogoodRecordingOnSolution(solverVariables.getLocationVariables(HardwareArchitectureLevelType.CONNECTOR))
		
		/* Attach the search monitors */
		solver.searchLoop.plugSearchMonitor(new DownBranchMonitor(solverVariables, model))
		solver.searchLoop.plugSearchMonitor(new CloseMonitor)
		solver.searchLoop.plugSearchMonitor(new RestartMonitor)
		solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor(solverVariables, model))
		solver.searchLoop.plugSearchMonitor(new BacktrackingMonitor(solverVariables, model, false))
	
		/* Create an empty set of constraints that will be used */
		mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new InterfaceTypeConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new ConnectedPinsConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new PinMappingConstraints(model, solver, solverVariables))
		mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))
		mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))

		/* Create a list for the results */ 
		mappingResults = new ArrayList<Result>()  
	}


	def setSavePartialSolution(boolean value) {
		savePartialSolution = value
		
		if (value) {
			logger.info("Enabled saving of partial solutions if no solutions are found")
			partialSolutionSaveMonitor = new PartialSolutionSaveMonitor(solver, solverVariables)
			solver.searchLoop.plugSearchMonitor(partialSolutionSaveMonitor)		
		}
		else {
			logger.info("Disabled saving of partial solutions if no solutions are found")
		}		
	}

	def setSolverTimeLimit(long timeInMs) {
		SMF.limitTime(solver, timeInMs)
		logger.info("Setting choco-solver search time limit to " + timeInMs + "ms")
	}
	
	def setSolverMaxSolutions(int maxSolutions) {
		logger.info("Setting choco-solver max solutions limit to " + maxSolutions)
		SMF.limitSolution(solver, maxSolutions)
	}
	
	def setSolverSearchStrategy(VariableSelectorTypes varSelector, ValueSelectorTypes valSelector) {
		val List<AbstractStrategy<IntVar>> heuristics = new ArrayList<AbstractStrategy<IntVar>>
	
// 		FIXME:		
//		logger.info('''Setting interface selection strategy to: "«varSelector.humanReadableName»"''')
//		if (varSelector.isValueSelectorRequired) 
//			logger.info('''Setting pin selection strategy to: "«valSelector.humanReadableName»"''')
//		
//		heuristics.add(varSelector.getStrategy(solverVariables, model, seed, valSelector))

		val conVars = solverVariables.getLocationVariables(HardwareArchitectureLevelType.CONNECTOR)
		val pinVars = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN)
		heuristics.add(ISF.domOverWDeg(conVars, randomSeed, valSelector.getValueSector(solverVariables, model, randomSeed)))
		heuristics.add(ISF.domOverWDeg(pinVars, randomSeed, ISF.min_value_selector))
		
		solver.set(heuristics)
	}

	def propagation() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver")
		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
	            logger.info('''      No effective constraints found''')
            }
			logger.info('''   done.''')
		}

		val vars = solverVariables.getLocationVariables(HardwareArchitectureLevelType.PIN)
		logger.info('''After initial propagation:''') 
		logger.info('''      «vars.filter[instantiated].size» / «vars.size» location vars instantiated''') 
		
		printVariableStatistics
	}
	
	def solutionSearch() throws BasicConstraintsException {
		mappingResults.clear
		
		logger.info("Initiating choco-solver - searching for a solution")
		solver.findAllSolutions
	
		logger.info('''Solutions found: «recorder.solutions.size»''') 
		logger.info('''Internal solver statistics: «solver.measures.toOneLineString»''')
	}
	
	def createSolutions() {
		if (solver.hasReachedLimit)
			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

		// Did we find a solution? 
		if (recorder.solutions.size > 0) {
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
			logger.info('''Results created:  «mappingResults.size»''')
		} 
		
		// should we save a partial solution?
		else {
			if (savePartialSolution) {
				mappingResults = ResultFactoryFromSolverSolutions.createPartialResult(model, solverVariables, partialSolutionSaveMonitor.partialSolution)			
				logger.info('''Created «mappingResults.size» partial solution with «mappingResults.get(0).mapping.keySet.size» mapped interfaces''')
			}
		} 
		
		printFailCounter	
	}
	
	private def printFailCounter() {
		val topFailedProps = solver.cstrs.map[propagators.toList]
										 .flatten
										 .toSet
										 .map[it as Propagator<IntVar>]
										 .sortBy[-counter.getFails(it)]
		
		var List<Propagator<IntVar>> topFailedPropsList
		
		if (topFailedProps.length > 10)
			topFailedPropsList = topFailedProps.subList(0, 10)
		else 
			topFailedPropsList = topFailedProps

		logger.info('''Top failed propagators:''')
		for (p : topFailedPropsList) 
			logger.info('''  - [«counter.getFails(p)» fails] «p.class.simpleName» - Constraint: «p.constraint.name» - Variables: «FOR v : p.vars»«IF v != p.vars.head», «ENDIF»«v.name»«ENDFOR»''')
	}	

	private def printVariableStatistics() {
		val s = new DescriptiveStatistics
		
		logger.info('''''')
		logger.info('''Some more statistical information about the interface location variables:''')

		logger.info(''' - Domain size''')
		logger.info('''                  «String.format("%7s", "min")»  «String.format("%7s", "max")»  «String.format("%7s", "mean")»  «String.format("%7s", "stddev")»  ''')
		for (level : HardwareArchitectureLevelType.values.sortBy[value]) {
			val f = "%7.1f"
			val varsForLevel = solverVariables.getLocationVariables(level) 
			for (v : varsForLevel)	s.addValue(v.domainSize)
			logger.info('''     «String.format("%11s", level)»: «String.format(f, s.min)»  «String.format(f, s.max)»  «String.format(f, s.mean)»  «String.format(f, s.standardDeviation)»  («String.format("%4d", varsForLevel.filter[domainSize == s.min].length)» vars with min domainsize = «varsForLevel.filter[domainSize == s.min]»)''')
			s.clear
		}
		
		logger.info('''''')
		s.clear
	
		logger.info(''' - Propagator count''')
		logger.info('''                  «String.format("%7s", "min")»  «String.format("%7s", "max")»  «String.format("%7s", "mean")»  «String.format("%7s", "stddev")»  ''')
		for (level : HardwareArchitectureLevelType.values.sortBy[value]) {
			val f = "%7.1f"
			val varsForLevel = solverVariables.getLocationVariables(level) 
			for (v : varsForLevel)	s.addValue(v.propagators.size)
			logger.info('''     «String.format("%11s", level)»: «String.format(f, s.min)»  «String.format(f, s.max)»  «String.format(f, s.mean)»  «String.format(f, s.standardDeviation)»  («String.format("%4d", varsForLevel.filter[propagators.size == s.max].length)» vars with max propagator count = «varsForLevel.filter[propagators.size == s.max]»)''')
			s.clear
		}
		
		logger.info('''''')
		s.clear
	
		logger.info(''' - Regular DomWD scores (domainsize / propagator count)''')
		logger.info('''                  «String.format("%7s", "min")»  «String.format("%7s", "max")»  «String.format("%7s", "mean")»  «String.format("%7s", "stddev")»  ''')				
		for (level : HardwareArchitectureLevelType.values.sortBy[value]) {
			val f = "%7.1f"
			val varsForLevel = solverVariables.getLocationVariables(level)
			for (v : varsForLevel)	s.addValue(new Double(v.domainSize) / new Double(v.propagators.size))
			logger.info('''     «String.format("%11s", level)»: «String.format(f, s.min)»  «String.format(f, s.max)»  «String.format(f, s.mean)»  «String.format(f, s.standardDeviation)»  («String.format("%4d", varsForLevel.filter[new Double(domainSize) / new Double(propagators.size) == s.min].length)» vars with min score = «varsForLevel.filter[new Double(domainSize) / new Double(propagators.size) == s.min]»)''')
			s.clear
		}
		
		logger.info('''''')
		s.clear
		
		logger.info(''' - Propagator variables count''')
		logger.info('''                  «String.format("%7s", "min")»  «String.format("%7s", "max")»  «String.format("%7s", "mean")»  «String.format("%7s", "stddev")»  ''')				
		for (level : HardwareArchitectureLevelType.values.sortBy[value]) {
			val f = "%7.1f"
			val varsForLevel = solverVariables.getLocationVariables(level)
			for (v : varsForLevel)	{
				val Propagator<IntVar>[] props = v.propagators
				val variablesCount = props.map[it.nbVars].reduce[p1, p2|p1+p2]
				s.addValue(variablesCount)
			}
			logger.info('''     «String.format("%11s", level)»: «String.format(f, s.min)»  «String.format(f, s.max)»  «String.format(f, s.mean)»  «String.format(f, s.standardDeviation)»  ''')
			s.clear
		}
		
		
		logger.info('''''')
	}


	def ArrayList<Result> getResults() 	{ mappingResults 			}
	def hasReachedLimit() 				{ solver.hasReachedLimit 	}

	// the following methods are for the tests only
	def IntVar[] getLocationVariables() { solverVariables.getLocationVariables(0) }
	def Solver getChocoSolver() 		{ solver }
}

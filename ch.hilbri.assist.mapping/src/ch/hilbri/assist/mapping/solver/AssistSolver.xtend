package ch.hilbri.assist.mapping.solver

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithImplicitDefinition
import ch.hilbri.assist.datamodel.model.InvalidDeploymentImplicit
import ch.hilbri.assist.datamodel.model.RDC
import ch.hilbri.assist.datamodel.model.ValidDeploymentImplicit
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.constraints.ColocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint
import ch.hilbri.assist.mapping.solver.constraints.InterfaceTypeConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictInvalidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.RestrictValidDeploymentsConstraint
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.monitors.BacktrackingMonitor
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor
import ch.hilbri.assist.mapping.solver.strategies.FirstFailThenMaxRelationDegree
import ch.hilbri.assist.mapping.solver.strategies.HardestDislocalitiesFirst
import ch.hilbri.assist.mapping.solver.strategies.ScarcestIoTypeFirst
import ch.hilbri.assist.mapping.solver.strategies.VariablesInMostDislocalityRelationsFirst
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.List
import org.chocosolver.solver.Settings
import org.chocosolver.solver.Solver
import org.chocosolver.solver.explanations.RecorderExplanationEngine
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping
import org.chocosolver.solver.search.loop.monitors.SMF
import org.chocosolver.solver.search.solution.AllSolutionsRecorder
import org.chocosolver.solver.search.strategy.ISF
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy
import org.chocosolver.solver.variables.IntVar
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
	private int[] locationVariableLevels // do we work with just the LocVars on connector level or other levels as well?
	
	new (AssistModel model, int... locationVariableLevels) {
		this(model, locationVariableLevels as List<Integer>)
	}

	new (AssistModel model, List<Integer> locationVariableLevels) {
		this.logger = LoggerFactory.getLogger(this.class)

		logger.info(">>>> Creating a new AssistSolver instance <<<<")
		
		/* Get the model */
		this.model = model
		this.locationVariableLevels = locationVariableLevels
		
		/* Pre-process the model and create the implicitly defined groups */
		/* This could be moved to some dedicated "mode preprocessing section" */
		logger.info("Preprocessing the data model")
		
		if (!model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithImplicitDefinition].isNullOrEmpty) {
			logger.info(" - Creating implicitly defined interface groups")
			for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithImplicitDefinition]) {
				logger.info("    . Creating implicitly defined group " + g.name)
				var Iterable<EqInterface> interfaceList = model.eqInterfaces	
				for (definition : (g as EqInterfaceGroupWithImplicitDefinition).definitions) {
						switch (definition.attribute) {
						case NAME:			{ interfaceList = interfaceList.filter[it.name.equals(definition.value)			]}
						case SYSTEM: 		{ interfaceList = interfaceList.filter[it.system.equals(definition.value)		]}
						case SUBATA: 		{ interfaceList = interfaceList.filter[it.subAta.equals(definition.value)		]}
						case RESOURCE: 		{ interfaceList = interfaceList.filter[it.resource.equals(definition.value)		]}
						case LINENAME: 		{ interfaceList = interfaceList.filter[it.lineName.equals(definition.value)		]}
						case WIRINGLANE:	{ interfaceList = interfaceList.filter[it.wiringLane.equals(definition.value)	]}
						case GRPINFO: 		{ interfaceList = interfaceList.filter[it.grpInfo.equals(definition.value)		]}
						case ROUTE: 		{ interfaceList = interfaceList.filter[it.route.equals(definition.value)		]}
						case PWSUP1: 		{ interfaceList = interfaceList.filter[it.pwSup1.equals(definition.value)		]}
						case EMHZONE1: 		{ interfaceList = interfaceList.filter[it.emhZone1.equals(definition.value)		]}
						case IOTYPE: 		{ interfaceList = interfaceList.filter[it.ioType.equals(definition.value)		]}
					}
				}
				g.eqInterfaces.addAll(interfaceList)
				if (g.eqInterfaces.length > 0)
					logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
				else {
					logger.info('''      WARNING: Implicitly defined group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				}
			}
		}
		
		/* Combined Interface groups have to be processed after implicitly defined groups, because combined 
		 * groups can also contain implicitly defined groups */
		if (!model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition].isNullOrEmpty) {
			logger.info(" - Creating interface groups which combine other interface groups")
			for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
				logger.info("    . Creating group " + g.name)
				val List<EqInterface> interfaceList = new ArrayList
				for (combinedGroup : (g as EqInterfaceGroupWithCombinedDefinition).combinedGroups) {
					interfaceList.addAll(combinedGroup.eqInterfaces)
				}
				g.eqInterfaces.addAll(interfaceList.toSet.toList)

				if (g.eqInterfaces.length > 0)
					logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
				else {
					logger.info('''      WARNING: Group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				}
			}
		}
		
		
		if (!model.validDeployments.filter[it instanceof ValidDeploymentImplicit].isNullOrEmpty) {
			logger.info(" - Creating implicitly defined groups of RDCs for valid deployments")
			for (s : model.validDeployments.filter[it instanceof ValidDeploymentImplicit]) {
				logger.info("    . Creating implicitly defined RDC group for interfaces/groups " + s.eqInterfaceOrGroups)
				var Iterable<RDC> rdcList = model.allRDCs
				for (definition : (s as ValidDeploymentImplicit).definitions) {
					switch (definition.attribute) {
						case RDC_NAME:			{ rdcList = rdcList.filter[name.equals(definition.value)			]}
						case RDC_MANUFACTURER: 	{ rdcList = rdcList.filter[manufacturer.equals(definition.value)	]}
						case RDC_POWERSUPPLY: 	{ rdcList = rdcList.filter[powerSupply.equals(definition.value)		]}
						case RDC_SIDE: 			{ rdcList = rdcList.filter[side.equals(definition.value)			]}
						case RDC_TYPE: 			{ rdcList = rdcList.filter[rdcType.equals(definition.value)			]}
						case RDC_ESS: 			{ rdcList = rdcList.filter[ess.equals(definition.value)				]}
					}
				}
				s.hardwareElements.addAll(rdcList)
				if (s.hardwareElements.length > 0)
					logger.info('''      Successfully created with «s.hardwareElements.length» RDCs: «s.hardwareElements».''')
				else {
					logger.info('''      WARNING: Implicitly defined deployment contains «s.hardwareElements.length» RDCs. This may be unintended.''')
				}
			}
		}

		if (!model.invalidDeployments.filter[it instanceof InvalidDeploymentImplicit].isNullOrEmpty) {
			logger.info(" - Creating implicitly defined groups of RDCs for invalid deployments")
			for (s : model.invalidDeployments.filter[it instanceof InvalidDeploymentImplicit]) {
				logger.info("    . Creating implicitly defined RDC group for interfaces/groups " + s.eqInterfaceOrGroups)
				var Iterable<RDC> rdcList = model.allRDCs
				for (definition : (s as InvalidDeploymentImplicit).definitions) {
					switch (definition.attribute) {
						case RDC_NAME:			{ rdcList = rdcList.filter[name.equals(definition.value)			]}
						case RDC_MANUFACTURER: 	{ rdcList = rdcList.filter[manufacturer.equals(definition.value)	]}
						case RDC_POWERSUPPLY: 	{ rdcList = rdcList.filter[powerSupply.equals(definition.value)		]}
						case RDC_SIDE: 			{ rdcList = rdcList.filter[side.equals(definition.value)			]}
						case RDC_TYPE: 			{ rdcList = rdcList.filter[rdcType.equals(definition.value)			]}
						case RDC_ESS: 			{ rdcList = rdcList.filter[ess.equals(definition.value)				]}
					}
				}
				s.hardwareElements.addAll(rdcList)
				if (s.hardwareElements.length > 0)
					logger.info('''      Successfully created with «s.hardwareElements.length» RDCs: «s.hardwareElements».''')
				else {
					logger.info('''      WARNING: Implicitly defined deployment contains «s.hardwareElements.length» RDCs. This may be unintended.''')
				}
			}
		}

		/* Create a list for the results */ 
		this.mappingResults = new ArrayList<Result>()  
	
		/* Create an empty set of constraints that will be used */
		this.mappingConstraintsList = new ArrayList<AbstractMappingConstraint>()
		
		/* Create a new Solver object */
		this.solver = new Solver()
		
		/* Attach the search monitor */
		this.solver.searchLoop.plugSearchMonitor(new SolutionFoundMonitor)
		this.solver.searchLoop.plugSearchMonitor(new BacktrackingMonitor)
		this.solver.searchLoop.plugSearchMonitor(new CloseMonitor)
		
		/* Create a new recorder for our solutions */
		this.recorder = new AllSolutionsRecorder(solver)
		solver.set(recorder)
		
		/* Create the container for variables which are needed in the solver */
 		this.solverVariables = new SolverVariablesContainer(this.model, solver)
		
		this.mappingConstraintsList.add(new SystemHierarchyConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new InterfaceTypeConstraint(model, solver, solverVariables))				
		this.mappingConstraintsList.add(new ColocalityConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictValidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new RestrictInvalidDeploymentsConstraint(model, solver, solverVariables))
		this.mappingConstraintsList.add(new DislocalityConstraint(model, solver, solverVariables))
//		this.mappingConstraintsList.add(new PowerSupplyConstraint(model, solver, solverVariables))
	}
	
	def setSolverTimeLimit(long timeInMs) {
		SMF.limitTime(solver, timeInMs);
		logger.info("Setting choco-solver search time limit to " + timeInMs + "ms");
	}
	
	def setSolverMaxSolutions(int maxSolutions) {
		logger.info("Setting choco-solver max solutions limit to " + maxSolutions);
		SMF.limitSolution(solver, maxSolutions);
	}
	
	def setSolverSearchStrategy(SearchType strategy) {
		var AbstractStrategy<IntVar> heuristic
		val seed = 23432
		val vars = solverVariables.getLocationVariables(locationVariableLevels)
		switch (strategy) {
			case SearchType.FIRST_FAIL: {
				heuristic = ISF.minDom_LB()
			}
			case strategy == SearchType.FIRST_FAIL_MAX_DEGREE || strategy == SearchType.DEFAULT: {
				val selector = new FirstFailThenMaxRelationDegree(solverVariables, model, locationVariableLevels)
				heuristic = ISF.custom(selector, selector, vars)				
			}
			case SearchType.HARDEST_DISLOC: {
				val selector = new HardestDislocalitiesFirst(solverVariables, model)
				heuristic = ISF.custom(selector, selector, vars)				
			}
			case SearchType.SCARCEST_TYPE: {
				val selector = new ScarcestIoTypeFirst(solverVariables, model)
				heuristic = ISF.custom(selector, ISF.min_value_selector, vars)	
			}
			case SearchType.VARS_IN_MOST_DISLOC: {
				val selector = new VariablesInMostDislocalityRelationsFirst(solverVariables, model)
				heuristic = ISF.custom(selector, ISF.min_value_selector, vars)				
			}
			case SearchType.DOM_OVER_WDEG: {
				heuristic = ISF.domOverWDeg(vars, seed)
			}
			case SearchType.ACTIVITY: {
				heuristic = ISF.activity(vars, seed)
			}
			case SearchType.IMPACT: {
				heuristic = ISF.impact(vars, seed)
			}
			default: {
				logger.info("Unknown search strategy supplied")
			}
		}	
		logger.info("Setting choco-solver search strategy to: " + heuristic)
		solver.set(heuristic)
	}

	def propagation() throws BasicConstraintsException {
		logger.info("Starting to generate constraints for the choco-solver");
		for (constraint : mappingConstraintsList) {
			logger.info(''' - Starting to generate constraints for "«constraint.name»"...''')
			if (!constraint.generate()) {
	            logger.info('''      No effective constraints found''')
            }
			logger.info('''   done.''')
		}
	}
	
	def solutionSearch() throws BasicConstraintsException {		
		logger.info("Initiating choco-solver - searching for a solution")
		solver.findAllSolutions
		logger.info('''Solutions found: «recorder.solutions.size»''') 
		
		logger.info('''Internal solver statistics: «solver.measures.toOneLineString»''')
		
			
		if (solver.hasReachedLimit)
			logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)")

		// Did we find a solution? 
		if (recorder.solutions.size > 0) {
			mappingResults = ResultFactoryFromSolverSolutions.create(model, solverVariables, recorder.getSolutions)
			logger.info('''Results created:  «mappingResults.size»''')
		} else {
			mappingResults.clear
		}
	}
	
	def getExplanation() {
		logger.info("Trying to get an explanation")
		solver.set(new Settings(){ public override boolean enablePropagatorInExplanation() { return true; }})
		solver.searchLoop.reset
		solver.engine.flush
				
		// Conflicts explained
		solver.set(new RecorderExplanationEngine(solver))
		val cbj = new ConflictBasedBackjumping(solver.getExplainer())
		cbj.activeUserExplanation(true)
		solver.findSolution
	
		logger.debug("Solver contents: ")
		logger.debug(solver.toString)

		if (cbj.getUserExplanation == null) {
			logger.info("No explanation available, because at least one solution was found.")
		} else {
			logger.info('''Explanation: >>«cbj.userExplanation.toString»<<''')
		}
	}

	def ArrayList<Result> getResults() 	{ mappingResults 			}
	def hasReachedLimit() 				{ solver.hasReachedLimit 	}
	def IntVar[] getLocationVariables() 	{ solverVariables.getLocationVariables(0) }
	
}
package ch.hilbri.assist.mapping.solver.variables

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ColocalityRelation
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import java.util.ArrayList
import java.util.BitSet
import java.util.HashMap
import java.util.List
import java.util.Map
import org.chocosolver.solver.Solver
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF
import org.eclipse.xtend.lib.annotations.Data
import org.chocosolver.solver.variables.BoolVar

@Data class SolverVariablesContainer {
	/** A list of location variables for each thread (and each system layer) */
	HashMap<Thread, HashMap<Integer, IntVar>> threadLocationVariablesList = new HashMap

	/** A list of location indicator variables for each thread (on the board layer) */
	BoolVar[][] threadBoardIndicatorVariablesList

	/** A list of variables; a variable for each core which contains the absolute utilization */
	HashMap<Core, IntVar> absoluteCoreUtilizationList = new HashMap

	/** A list of variables; a variable for each board which contains the absolute ram utilization */
	HashMap<Board, IntVar> absoluteRamUtilizationList = new HashMap

	/** A list of variables; a variable for each board which contains the absolute rom utilization */
	HashMap<Board, IntVar> absoluteRomUtilizationList = new HashMap

	/** A list of variables; a variable for each communication group and their placement to a network */
	HashMap<CommunicationRelation, IntVar> communicationGroupLocationVariablesList = new HashMap

	/** A list of variables; a variable for each networks which contains the absolute bandwidth utilization */
	HashMap<Network, IntVar> absoluteBandwidthUtilizationList = new HashMap

	HashMap<IntVar, Thread> locationVarMap = new HashMap

	/* CONSTRUCTOR */
	new(AssistModel model, Solver solver) {
		/* Initialize the hash map for all thread-related location variables */
		for (t : model.allThreads) {
			val m = new HashMap<Integer, IntVar>

			for (var i = HardwareArchitectureLevelType.CORE_VALUE; i <= model.hardwareLevelCount; i++) {

				/* Create a new location variable for each thread;
				 * initialize its domain to 0 .. size of hardware elements in this level - 1 */
				val newVar = VF.enumerated("Loc-" + t.name + "-L" + i, 0, model.getAllHardwareElements(i).size - 1,
					solver)
				m.put(i, newVar)

				/* Add this solver variable to the map, so we can find corresponding thread quickly	 */
				locationVarMap.put(newVar, t)
			}
		}

		/* Initialize the board indicator variables */
		threadBoardIndicatorVariablesList = VF.boolMatrix("d", model.allBoards.size, model.allThreads.size, solver)

		/* Initialize the hash map for all utilization variables */
		for (c : model.allCores)
			absoluteCoreUtilizationList.put(c, VF.bounded("AbsCoreUtil-" + c.name, 0, c.capacity, solver))
		for (b : model.allBoards)
			absoluteRamUtilizationList.put(b, VF.bounded("AbsRamUtil-" + b.name, 0, b.ramCapacity, solver))
		for (b : model.allBoards)
			absoluteRomUtilizationList.put(b, VF.bounded("AbsRomUtil-" + b.name, 0, b.romCapacity, solver))

		/* Initialize the hash map for all communication-group-related location variables */
		if (model.networks.size > 0) {
			for (r : model.communicationRelations)
				communicationGroupLocationVariablesList.put(r,
					VF.enumerated("NetLoc-" + model.communicationRelations.indexOf(r), 0, model.networks.size - 1,
						solver))
		}

		for (n : model.networks)
			absoluteBandwidthUtilizationList.put(n, VF.bounded("AbsBandUtil-" + n.name, 0, n.bandwidthCapacity, solver))
	}

	def IntVar[] getLocationVariables() {
		val list = new ArrayList<IntVar>

		for (threadKey : threadLocationVariablesList.keySet.sortBy[name])
			list.add(threadLocationVariablesList.get(threadKey).get(HardwareArchitectureLevelType.CORE_VALUE))

		return list
	}

	/** Returns the variable list which contains the indicators for the given board */
	def BoolVar[][] getThreadBoardIndicatorVariables() {
		return threadBoardIndicatorVariablesList
	}

	/** Returns the location variable for a given relation */
	def IntVar getCommunicationRelationLocationVariable(CommunicationRelation relation) {
		return communicationGroupLocationVariablesList.get(relation)
	}

	/** Returns the location variable for a given thread and a given hardware level */
	def IntVar getThreadLocationVariable(Thread t, int level) {
		return threadLocationVariablesList.get(t).get(level)
	}

	/** Returns the variable which contains the absolute utilization for the given core */
	def IntVar getAbsoluteCoreUtilizationVariable(Core c) {
		return absoluteCoreUtilizationList.get(c)
	}

	/** Returns the variable which contains the absolute ram utilization for the given board */
	def IntVar getAbsoluteRamUtilizationVariable(Board b) {
		return absoluteRamUtilizationList.get(b)
	}

	/** Returns the variable which contains the absolute ram utilization for the given board */
	def IntVar getAbsoluteRomUtilizationVariable(Board b) {
		return absoluteRomUtilizationList.get(b)
	}

	/** Returns the variable which contains the absolute bandwidth utilization for the given network */
	def IntVar getAbsoluteBandwidthUtilizationVariable(Network n) {
		return absoluteBandwidthUtilizationList.get(n)
	}

	def Application getApplicationForLocationVariable(IntVar variable) {
		val t = locationVarMap.get(variable)

		if (t != null)
			return t.application
		else
			return null
	}
}

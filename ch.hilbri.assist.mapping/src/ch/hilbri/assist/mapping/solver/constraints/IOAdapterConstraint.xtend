package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterType
import ch.hilbri.assist.datamodel.model.Thread
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.HashMap
import org.jacop.constraints.Element
import org.jacop.constraints.XgteqC
import org.jacop.core.BoundDomain
import org.jacop.core.IntVar
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class IOAdapterConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("I/O adapter constraints", model, constraintStore, solverVariables)
	}

	override generate() {
		/* Step 1: Generate the constraints for single threads and their exclusive adapter requirement */
		generate_SingleThreadExclusiveRequests_Constraints()
		generate_SingleThreadProtectionLevel_Constraints()
		return true
	}
	
	
	/*
	 * Implementation of Step 1
	 * ------------------------
	 * - only exclusive adapter requests and adapter types are considered here
	 * - io protection levels are NOT considered here (yet) 
	 */
	def generate_SingleThreadExclusiveRequests_Constraints() {
		
		/* 1. Which i/o adapter types are requested in this deployment problem? */
		// allRequestedIOAdapterTypes = [Typ0, Typ2, Typ5, Typ8] 
		var allRequestedIOAdapterTypes = new ArrayList<IOAdapterType>()
		for (t : model.allThreads)
			for (r : t.application.ioAdapterRequirements.filter[it | it.isIsExclusiveOnly])
				if (!allRequestedIOAdapterTypes.contains(r.adapterType)) 
					allRequestedIOAdapterTypes.add(r.adapterType) 
		
		/* 2. Create a value list for each thread which contains its demand for a given type */
		// allIOAdapterExclusiveRequests[thread][type] = demand
		var allIOAdapterExclusiveRequests = new HashMap<Thread, HashMap<IOAdapterType, Integer>>()
		for (t : model.allThreads)
			for (r : t.application.ioAdapterRequirements.filter[it | it.isIsExclusiveOnly]) {
				if (!allIOAdapterExclusiveRequests.keySet.contains(t)) 
					allIOAdapterExclusiveRequests.put(t, new HashMap<IOAdapterType, Integer>())
				
				allIOAdapterExclusiveRequests.get(t).put(r.adapterType,	r.requiredAdapterCount)
			}
		
		/* 3. Create a list of available adapter for each type and each board */
		// allAvailableIOAdapters[type][board] = count
		var allAvailableIOAdapters = new HashMap<IOAdapterType, ArrayList<Integer>>()
		for (type : allRequestedIOAdapterTypes) {
			allAvailableIOAdapters.put(type, new ArrayList<Integer>())
			for (board : model.allBoards) {
				var foundAdapter = false
				for (a : board.ioAdapters) {
					if (a.adapterType == type) {
						foundAdapter = true
						allAvailableIOAdapters.get(type).add(a.totalCount)
					}
				}
				// If we have not found an adapter with this type on this board, we add "0"
				if (!foundAdapter) allAvailableIOAdapters.get(type).add(0)
			}
		}

		
		/* 4. Create a list of variables for each board and each type */
		// ioAdapterVariables[thread][type] = Var <- Domain = allAvailableIOAdapters[type]
		var ioAdapterVariables = new HashMap<Thread, HashMap<IOAdapterType, IntVar>>()
		for (t : model.allThreads) {
			ioAdapterVariables.put(t, new HashMap<IOAdapterType, IntVar>())
			for (type : allRequestedIOAdapterTypes) {
				
				var domain = new IntervalDomain()
				for (adapterCountPerBoard : allAvailableIOAdapters.get(type))
					domain.addDom(new BoundDomain(adapterCountPerBoard, adapterCountPerBoard))
				
				ioAdapterVariables.get(t).put(type, new IntVar(constraintStore, "IOVar-" + t.name + "-" + type, domain))
			}
		}

		/* 5. Create the connection between the location variables and the ioAdapterVariables for each thread and type 
		 *    and limit the values
		 */
		// Element(ioAdapterVariables[thread][type], allAvailableIOAdapters[type], Loc2[thread])
		// ioAdapterVariables[thread][type] >= allIOAdapterExclusiveRequests[thread][type]
		
		for (t : model.allThreads) {

			/* To which board can we map this thread? */
			val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE)
			
			for (type : allRequestedIOAdapterTypes) {
				constraintStore.impose(new Element(threadLocationsBoardLevel, allAvailableIOAdapters.get(type), ioAdapterVariables.get(t).get(type)))
				
				// if we have some exclusive adapter constraints for this type, then impose the restriction
				if (allIOAdapterExclusiveRequests.get(t) != null)
					constraintStore.impose(new XgteqC(ioAdapterVariables.get(t).get(type), allIOAdapterExclusiveRequests.get(t).get(type))) 
			}	
		}
		
	}
	
	
	/*
	 * Implementation of step 2
	 * ------------------------
	 * 
	 */
	def generate_SingleThreadProtectionLevel_Constraints() {}
	
	
}
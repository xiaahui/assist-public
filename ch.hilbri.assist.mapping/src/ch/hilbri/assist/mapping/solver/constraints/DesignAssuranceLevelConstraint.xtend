package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.Thread
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import org.jacop.constraints.Element
import org.jacop.constraints.XgteqC
import org.jacop.core.BoundDomain
import org.jacop.core.IntVar
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class DesignAssuranceLevelConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("Design assurance level constraints", model, constraintStore, solverVariables)
	}
	
	override generate() {
		
		/* 1. Create a value list for each thread which contains its demand for a given type */
		// allDesignAssuranceLevelRequests[thread] = demand as integer (NONE = 0, QS = 1, ..., A=5)
		var allDesignAssuranceLevelRequests = new HashMap<Thread, Integer>()
		for (t : model.allThreads) allDesignAssuranceLevelRequests.put(t, t.application.criticalityLevel.ordinal)

		/* 2. Create a list of available dals for each board */		
		// allAvailableDesignAssuranceLevels[boardIndex] = dal as integer (NONE = 0, QS = 1, ..., A=5)
		val allAvailableDesignAssuranceLevels = model.allBoards.map[it.assuranceLevel.ordinal]
		
		/* 3. Create a list of variables for each board */
		// designAssuranceLevelVariables[thread] = Var <- Domain = allAvailableDesignAssuranceLevels
		var designAssuranceLevelVariables = new HashMap<Thread, IntVar>()
		for (t : model.allThreads) {

			var domain = new IntervalDomain()
			for (designAssuranceLevelPerBoard : allAvailableDesignAssuranceLevels)
				domain.addDom(new BoundDomain(designAssuranceLevelPerBoard, designAssuranceLevelPerBoard))
			
			designAssuranceLevelVariables.put(t, new IntVar(constraintStore, "DALVar-" + t.name, domain))			
		}

		/* 5. Create the connection between the location variables and the designAssuranceLevelVariables for each thread 
		 *    and limit the values  */
		// Element(designAssuranceLevelVariables[thread], allAvailableDesignAssuranceLevels, Loc2[thread])
		// designAssuranceLevelVariables[thread] >= allDesignAssuranceLevelRequests[thread]
				
		for (t : model.allThreads) {
			/* To which board can we map this thread? */
			val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE)
			
			constraintStore.impose(new Element(threadLocationsBoardLevel, allAvailableDesignAssuranceLevels, designAssuranceLevelVariables.get(t) ))
			constraintStore.impose(new XgteqC(designAssuranceLevelVariables.get(t), allDesignAssuranceLevelRequests.get(t)))
		}
			
		return true
	}
}
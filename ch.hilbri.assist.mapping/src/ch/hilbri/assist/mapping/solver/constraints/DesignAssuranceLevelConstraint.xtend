package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.Thread
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.HashMap
import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.ICF
import org.chocosolver.solver.exception.ContradictionException
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VF

class DesignAssuranceLevelConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Solver solver, SolverVariablesContainer solverVariables) {
		super("design assurance level", model, solver, solverVariables)
	}
	
	override generate() {
		
		if (model.allThreads.filter[application.criticalityLevel > DesignAssuranceLevelType.NONE].empty) {
			return false
		}
		/* 1. Create a value list for each thread which contains its demand for a given type */
		// allDesignAssuranceLevelRequests[thread] = demand as integer (NONE = 0, QS = 1, ..., A=5)
		var allDesignAssuranceLevelRequests = new HashMap<Thread, Integer>()
		for (t : model.allThreads) allDesignAssuranceLevelRequests.put(t, t.application.criticalityLevel.ordinal)

		/* 2. Create a list of available dals for each board */		
		// allAvailableDesignAssuranceLevels[boardIndex] = dal as integer (NONE = 0, QS = 1, ..., A=5)
		val allAvailableDesignAssuranceLevels = model.allBoards.map[assuranceLevel.ordinal]
		
		/* 3. Create a list of variables for each board */
		// designAssuranceLevelVariables[thread] = Var <- Domain = allAvailableDesignAssuranceLevels
		var designAssuranceLevelVariables = new HashMap<Thread, IntVar>()
		for (t : model.allThreads) {
			designAssuranceLevelVariables.put(t, VF.enumerated("DALVar-" + t.name, allAvailableDesignAssuranceLevels, solver))			
		}

		/* 5. Create the connection between the location variables and the designAssuranceLevelVariables for each thread 
		 *    and limit the values  */
		// Element(designAssuranceLevelVariables[thread], allAvailableDesignAssuranceLevels, Loc2[thread])
		// designAssuranceLevelVariables[thread] >= allDesignAssuranceLevelRequests[thread]
				
		for (t : model.allThreads) {
			/* To which board can we map this thread? */
			val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE)
			
			solver.post(ICF.element(designAssuranceLevelVariables.get(t), allAvailableDesignAssuranceLevels, threadLocationsBoardLevel))
			solver.post(ICF.arithm(designAssuranceLevelVariables.get(t), ">=",allDesignAssuranceLevelRequests.get(t)))

			try { solver.propagate }
			catch (ContradictionException e) {
				throw new BasicConstraintsException(this)
			}
		}
		
		return true
	}
}
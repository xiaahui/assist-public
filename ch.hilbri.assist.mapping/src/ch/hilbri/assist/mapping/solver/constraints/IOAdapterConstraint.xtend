package ch.hilbri.assist.mapping.solver.constraints

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterType
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import org.jacop.constraints.Element
import org.jacop.constraints.Reified
import org.jacop.constraints.SumWeight
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgteqC
import org.jacop.core.BooleanVar
import org.jacop.core.BoundDomain
import org.jacop.core.IntVar
import org.jacop.core.IntervalDomain
import org.jacop.core.Store

class IOAdapterConstraint extends AbstractMappingConstraint {
	
	new(AssistModel model, Store constraintStore, SolverVariablesContainer solverVariables) {
		super("I/O adapter constraints", model, constraintStore, solverVariables)
	}

	override generate() {
		generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints()
		generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints()
		return true
	}
	
	def generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
		
		for (b : model.allBoards) {
			/* Contains a boolean factor for the weighted sum - is this thread mapped to this board? 
			 * The index of this list corresponds to the thread index 
			 * factorList[thread] = true/false <-- is this thread mapped to board b? */
			val factorList = new ArrayList<BooleanVar>() 
		
			for (t : model.allThreads) {
				val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE)
				val delta = new BooleanVar(constraintStore, "Delta-for-" + t.name)
				constraintStore.impose(new Reified(new XeqC(threadLocationsBoardLevel, model.allBoards.indexOf(b)+1), delta))
				factorList.add(delta)
			}
			
			for (type : IOAdapterType.values) {
				for (level : IOAdapterProtectionLevelType.values) {

					// how many adapters does this board have for the type and level
					val suiteableIOAdapterCountVar	= new IntVar(constraintStore, "SuiteableIOAdapterCount-"+b.name+"-"+type+"-"+level, 
																 0, b.getSuitableAdapterCount(type, level))

					// how many io requests with the given type and minimum protection level does each thread require?
					val requestCountForEachThreadWithProtectionLevelAndType = model.allThreads.map[getExclusiveAdapterRequestCount(type, level)]

					// Define the sum to constrain the deployment
					constraintStore.impose(new SumWeight(factorList, new ArrayList<Integer>(requestCountForEachThreadWithProtectionLevelAndType), suiteableIOAdapterCountVar))
					
				}	
			}
		}
		
	}
	
	def generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints() {

		for (t : model.allThreads) {
			for (exReq : t.application.ioAdapterRequirements.filter[isIsExclusiveOnly]) {
		
				// Create a list for each board with the number of suitable adapters which satisfy type and protection level
				// suiteableAdapterCountPerBoardList[board] = # suiteable adapters w.r.t. type and protection level
				val suiteableAdapterCountPerBoardList = model.allBoards.map[getSuitableAdapterCount(exReq.adapterType, t.application.ioAdapterProtectionLevel)]

				// Create a new domain which contains these values				
				var domain = new IntervalDomain()
				for (adapterCountPerBoard : suiteableAdapterCountPerBoardList)
					domain.addDom(new BoundDomain(adapterCountPerBoard, adapterCountPerBoard))
				
				// Create a new variable with these values as a default domain
				val suiteableAdapterCountPerBoardVariable = new IntVar(constraintStore, "IOVar-"+t.name+"-"+exReq.adapterType+"-"+t.application.ioAdapterProtectionLevel, domain)

				/* To which board can we map this thread? */
				val threadLocationsBoardLevel = solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE)
		
				// Link the location variables to the adapterCountVariable
				constraintStore.impose(new Element(threadLocationsBoardLevel, suiteableAdapterCountPerBoardList, suiteableAdapterCountPerBoardVariable))
				
				// Impose constraints on the adapterCountVariable
				constraintStore.impose(new XgteqC(suiteableAdapterCountPerBoardVariable, exReq.requiredAdapterCount))
			}			
		}	
	}
		
}
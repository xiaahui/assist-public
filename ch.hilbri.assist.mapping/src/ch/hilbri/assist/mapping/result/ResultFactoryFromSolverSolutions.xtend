package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.application.helpers.ConsoleCommands
import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.datamodel.result.mapping.Application
import ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup
import ch.hilbri.assist.datamodel.result.mapping.Box
import ch.hilbri.assist.datamodel.result.mapping.Compartment
import ch.hilbri.assist.datamodel.result.mapping.Core
import ch.hilbri.assist.datamodel.result.mapping.HardwareElement
import ch.hilbri.assist.datamodel.result.mapping.IOAdapter
import ch.hilbri.assist.datamodel.result.mapping.MappingFactory
import ch.hilbri.assist.datamodel.result.mapping.Processor
import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject
import solver.search.solution.Solution

//import org.jacop.core.Domain

class ResultFactoryFromSolverSolutions {
	
	static MappingFactory f

	static private def fillApplicationGroupMembers(ch.hilbri.assist.datamodel.model.ApplicationGroup modelAppGroup, Result result) {
		
		val appGroup = result.findResultApplicationGroup(modelAppGroup)
		if (appGroup == null) return;
		
		for (aog : modelAppGroup.applicationsOrGroups)
			switch aog {
				ch.hilbri.assist.datamodel.model.Application 		: appGroup.applications.add(result.findResultApplication(aog))
				ch.hilbri.assist.datamodel.model.ApplicationGroup	: appGroup.applicationGroups.add(result.findResultApplicationGroup(aog))
			}	
	}	
	
	static private def ApplicationGroup createApplicationGroup(ch.hilbri.assist.datamodel.model.ApplicationGroup modelAppGroup, Result result) {
		val appGroup 				= f.createApplicationGroup
		appGroup.name				= modelAppGroup.name
		appGroup.referenceObject	= modelAppGroup
		return appGroup
	}
	
	static private def Application createApplication(ch.hilbri.assist.datamodel.model.Application modelApp) {
		val app = f.createApplication
		app.name 						= modelApp.name
		app.coreUtilization				= modelApp.coreUtilization
		app.ramUtilization				= modelApp.ramUtilization
		app.romUtilization				= modelApp.romUtilization
		app.criticalityLevel			= modelApp.criticalityLevel
		app.ioAdapterProtectionLevel	= modelApp.ioAdapterProtectionLevel
		app.parallelThreads				= modelApp.parallelThreads
		app.developedBy					= modelApp.developedBy
		app.referenceObject				= modelApp
		
		for (modelThread : modelApp.threads) {
			val t 				= f.createThread
			t.referenceObject 	= modelThread
			t.application 		= app
			app.threads.add(t)
			
		}
			
		return app
	}
	
	static private def EObject createHardwareElements(EObject modelElement) {
		switch modelElement {
			
			ch.hilbri.assist.datamodel.model.Compartment: {
				val Compartment c 	= f.createCompartment
				c.name 				= modelElement.name
				c.manufacturer 		= modelElement.manufacturer
				c.powerSupply 		= modelElement.powerSupply
				c.side 				= modelElement.side
				c.zone 				= modelElement.zone
				
				for (box : modelElement.boxes)
					c.boxes.add(createHardwareElements(box) as Box)
				
				c.referenceObject 	= modelElement
				
				return c
			}
			
			ch.hilbri.assist.datamodel.model.Box: {
				val Box b 			= f.createBox
				b.name 				= modelElement.name
				b.manufacturer 		= modelElement.manufacturer
				for (board : modelElement.boards)
					b.boards.add(createHardwareElements(board) as ch.hilbri.assist.datamodel.result.mapping.Board)
					
				b.referenceObject	= modelElement
					
				return b	
			}
			
			Board: {
				val ch.hilbri.assist.datamodel.result.mapping.Board b 		= f.createBoard
				b.name				= modelElement.name
				b.manufacturer 		= modelElement.manufacturer
				b.boardType			= modelElement.boardType
				b.powerSupply		= modelElement.powerSupply
				b.assuranceLevel	= modelElement.assuranceLevel
				b.ramCapacity		= modelElement.ramCapacity
				b.romCapacity		= modelElement.romCapacity
				
				for (proc : modelElement.processors)
					b.processors.add(createHardwareElements(proc) as Processor)
				
				for (io : modelElement.ioAdapters)
					b.ioAdapters.add(createHardwareElements(io) as IOAdapter)
				
				b.referenceObject	= modelElement
					
				return b 
			}
			
			ch.hilbri.assist.datamodel.model.Processor: {
				val Processor p 	= f.createProcessor
				p.name 				= modelElement.name
				p.manufacturer		= modelElement.manufacturer
				p.processorType		= modelElement.processorType
				
				for (core : modelElement.cores) 
					p.cores.add(createHardwareElements(core) as Core)
				
				p.referenceObject	= modelElement
					
				return p
			}
			
			ch.hilbri.assist.datamodel.model.Core: {
				val Core c 			= f.createCore
				c.name 				= modelElement.name
				c.architecture 		= modelElement.architecture
				c.capacity			= modelElement.capacity
				c.referenceObject 	= modelElement
				
				return c
			}
			
			ch.hilbri.assist.datamodel.model.IOAdapter: {
				val IOAdapter i 	= f.createIOAdapter
				i.name 				= modelElement.name
				i.totalUnitCount	= modelElement.totalCount
				i.adapterType		= modelElement.adapterType
				i.protectionLevel	= modelElement.protectionLevel
				i.referenceObject	= modelElement
				return i
			}
		}
		
		return null
	}
	
	
	static private def createBasicResult(AssistModel model, String resultName) {
		
		
		val result = f.createResult
		
		// Basic stuff
		result.name 		= resultName
		result.systemName 	= model.systemName
		
		// Hardware-Elemente
		for (elem : model.hardwareContainer)
			result.rootHardwareElements.add(createHardwareElements(elem) as HardwareElement)
		
		// Applikationen
		for (modelApp : model.applications)
			result.applications.add(createApplication(modelApp))
		
		// Applikationsgruppen
		// - erst werden alle Gruppen erstellt
		for (modelAppGroup : model.applicationGroups)
			result.applicationGroups.add(createApplicationGroup(modelAppGroup, result))
		// - dann werden alle Referenzen gesetzt
		for (modelAppGroup : model.applicationGroups)
			fillApplicationGroupMembers(modelAppGroup, result)	
		
		// Evaluation			
		val e = f.createEvaluation
		e.setAbsoluteScores(new HashMap)
		e.setScaledScores(new HashMap)
		result.setEvaluation(e)
		
		return result
	}
	
	static def void addMappingFromSolution(Result result, AssistModel model, SolverVariablesContainer solverVariables, Solution solution) {
		for (thread : model.allThreads) {
			
			/* Which thread in the result corresponds to this model thread? */
			val resultThread = result.findResultThread(thread)
			
			
			val locVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.CORE_VALUE)
			
			/* Which is the location variable which represents the placement of this model thread on the core level? */
//			val locVarIndex = solverVariables.getIndexOfThreadLocationInSolutionVariablesList(thread, 1)
			
			/* To which core number should the current thread be mapped to? */
//			val coreNr = solverSolution.get(locVarIndex).valueEnumeration.nextElement

			val coreIndex = solution.getIntVal(locVar)
			  
			/* To which core does this correspond in the result model? */
			val resultCore = result.findResultHardwareElement(model.allCores.get(coreIndex)) as Core
			
			if (resultCore == null) {
				ConsoleCommands.writeErrorLineToConsole("Could not find the core " + model.allCores.get(coreIndex) + " from the model in the result.");
				return;
			} else {
				/* Place this thread to the core */
				resultCore.threads.add(resultThread)
				resultThread.core = resultCore
			}
		}
	}
	
	static def void addUtilizationInformation(Result result, AssistModel model, SolverVariablesContainer solverVariables, Solution solution) {

		/* 1. Update the load information on all cores */
		for (resultCore : result.allCores) {
			val modelCore = resultCore.referenceObject as ch.hilbri.assist.datamodel.model.Core 
			val absoluteUtilization = solution.getIntVal(solverVariables.getAbsoluteCoreUtilizationVariable(modelCore))
			resultCore.setUtilization(absoluteUtilization)
		}
		
		/* 2. Update the ram utilization data for all boards */
		for (resultBoard : result.allBoards) {
			val modelBoard = resultBoard.referenceObject as Board
			val absoluteRamUtilization = solution.getIntVal(solverVariables.getAbsoluteRamUtilizationVariable(modelBoard))
			resultBoard.setRamUtilization(absoluteRamUtilization)
		}
		
		/* 3. Update the rom utilization data for all boards */
		for (resultBoard : result.allBoards) {
			val modelBoard = resultBoard.referenceObject as Board
			val absoluteRomUtilization = solution.getIntVal(solverVariables.getAbsoluteRomUtilizationVariable(modelBoard))
			resultBoard.setRomUtilization(absoluteRomUtilization)
		}
	}
	
	static def ArrayList<Result> create(AssistModel model, SolverVariablesContainer solverVariables, List<Solution> solverSolutions) {
		f = MappingFactory.eINSTANCE
		
		/* The list of results which will be returned for display */
		val results = new ArrayList<Result>
		
		
		for (solution : solverSolutions) {
			/* Create the basic result (hardware architecture, software architecture, ...) */
			val result = createBasicResult(model, "Result-"+ solverSolutions.indexOf(solution))
			
			/* Add the deployment information */
			addMappingFromSolution(result, model, solverVariables, solution)
		
			/* Add utilization information to result model */
			addUtilizationInformation(result, model, solverVariables, solution)
		
			/* Add this result to the list of results which will be returned for display */	
			results.add(result)
		}
		
		return results
	}
	
}
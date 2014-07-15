package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.result.mapping.Application
import ch.hilbri.assist.result.mapping.ApplicationGroup
import ch.hilbri.assist.result.mapping.Board
import ch.hilbri.assist.result.mapping.Box
import ch.hilbri.assist.result.mapping.Compartment
import ch.hilbri.assist.result.mapping.Core
import ch.hilbri.assist.result.mapping.HardwareElement
import ch.hilbri.assist.result.mapping.IOAdapter
import ch.hilbri.assist.result.mapping.MappingFactory
import ch.hilbri.assist.result.mapping.Processor
import ch.hilbri.assist.result.mapping.Result
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.jacop.core.Domain

class ResultFactoryFromSolverSolutions {
	
	static MappingFactory f

	static private def fillApplicationGroupMembers(ch.hilbri.assist.model.ApplicationGroup modelAppGroup, Result result) {
		
		val appGroup = result.findResultApplicationGroup(modelAppGroup)
		if (appGroup == null) return;
		
		for (aog : modelAppGroup.applicationsOrGroups)
			switch aog {
				ch.hilbri.assist.model.Application 		: appGroup.applications.add(result.findResultApplication(aog))
				ch.hilbri.assist.model.ApplicationGroup	: appGroup.applicationGroups.add(result.findResultApplicationGroup(aog))
			}	
	}	
	
	static private def ApplicationGroup createApplicationGroup(ch.hilbri.assist.model.ApplicationGroup modelAppGroup, Result result) {
		val appGroup 				= f.createApplicationGroup
		appGroup.name				= modelAppGroup.name
		appGroup.referenceObject	= modelAppGroup
		return appGroup
	}
	
	static private def Application createApplication(ch.hilbri.assist.model.Application modelApp) {
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
			t.application		= app
			app.threads.add(t)
		}
			
		return app
	}
	
	static private def EObject createHardwareElements(EObject modelElement) {
		switch modelElement {
			
			ch.hilbri.assist.model.Compartment: {
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
			
			ch.hilbri.assist.model.Box: {
				val Box b 			= f.createBox
				b.name 				= modelElement.name
				b.manufacturer 		= modelElement.manufacturer
				for (board : modelElement.boards)
					b.boards.add(createHardwareElements(board) as Board)
					
				b.referenceObject	= modelElement
					
				return b	
			}
			
			ch.hilbri.assist.model.Board: {
				val Board b 		= f.createBoard
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
			
			ch.hilbri.assist.model.Processor: {
				val Processor p 	= f.createProcessor
				p.name 				= modelElement.name
				p.manufacturer		= modelElement.manufacturer
				p.processorType		= modelElement.processorType
				
				for (core : modelElement.cores) 
					p.cores.add(createHardwareElements(core) as Core)
				
				p.referenceObject	= modelElement
					
				return p
			}
			
			ch.hilbri.assist.model.Core: {
				val Core c 			= f.createCore
				c.name 				= modelElement.name
				c.architecture 		= modelElement.architecture
				c.capacity			= modelElement.capacity
				c.referenceObject 	= modelElement
				
				return c
			}
			
			ch.hilbri.assist.model.IOAdapter: {
				val IOAdapter i 	= f.createIOAdapter
				i.name 				= modelElement.name
				i.totalUnitCount	= modelElement.totalUnitCount
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
	
	
	static def ArrayList<Result> create(AssistModel model, SolverVariablesContainer solverVariables, Domain[][] solverSolutions) {
		f = MappingFactory.eINSTANCE
		val results = new ArrayList<Result>
		for (var i = 0; i < solverSolutions.length; i++) {
			val result = createBasicResult(model, "Result-"+i)
			
			results.add(result)
		}
		return results
	}
	
}
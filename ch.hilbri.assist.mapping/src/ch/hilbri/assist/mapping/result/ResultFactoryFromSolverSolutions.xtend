package ch.hilbri.assist.mapping.result

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer
import ch.hilbri.assist.model.AssistModel
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
import org.eclipse.emf.ecore.EObject
import org.jacop.core.Domain
import java.util.HashMap

class ResultFactoryFromSolverSolutions {
	
	static MappingFactory f
	
	
	static private def EObject createHardwareElements(EObject modelElement) {
		switch modelElement {
			
			ch.hilbri.assist.model.Compartment: {
				val Compartment c = f.createCompartment
				c.name 			= modelElement.name
				c.manufacturer 	= modelElement.manufacturer
				c.powerSupply 	= modelElement.powerSupply
				c.side 			= modelElement.side
				c.zone 			= modelElement.zone
				for (box : modelElement.boxes)
					c.boxes.add(createHardwareElements(box) as Box)
				
				return c
			}
			
			ch.hilbri.assist.model.Box: {
				val Box b = f.createBox
				b.name 			= modelElement.name
				b.manufacturer 	= modelElement.manufacturer
				for (board : modelElement.boards)
					b.boards.add(createHardwareElements(board) as Board)
					
				return b	
			}
			
			ch.hilbri.assist.model.Board: {
				val Board b = f.createBoard
				b.name			= modelElement.name
				b.manufacturer 	= modelElement.manufacturer
				b.boardType		= modelElement.boardType
				b.powerSupply	= modelElement.powerSupply
				b.assuranceLevel= modelElement.assuranceLevel
				b.ramCapacity	= modelElement.ramCapacity
				b.romCapacity	= modelElement.romCapacity
				
				for (proc : modelElement.processors)
					b.processors.add(createHardwareElements(proc) as Processor)
				
				for (io : modelElement.ioAdapters)
					b.ioAdapters.add(createHardwareElements(io) as IOAdapter)
					
				return b 
			}
			
			ch.hilbri.assist.model.Processor: {
				val Processor p = f.createProcessor
				p.name 			= modelElement.name
				p.manufacturer	= modelElement.manufacturer
				p.processorType	= modelElement.processorType
				for (core : modelElement.cores) 
					p.cores.add(createHardwareElements(core) as Core)
					
				return p
			}
			
			ch.hilbri.assist.model.Core: {
				val Core c = f.createCore
				c.name 			= modelElement.name
				c.architecture 	= modelElement.architecture
				c.capacity		= modelElement.capacity
			
				return c
			}
			
			ch.hilbri.assist.model.IOAdapter: {
				val IOAdapter i = f.createIOAdapter
				i.name 			= modelElement.name
				i.totalUnitCount= modelElement.totalUnitCount
				i.adapterType	= modelElement.adapterType
				i.protectionLevel=modelElement.protectionLevel
				
				return i
			}
		}
		
		return null
	}
	
	
	static private def createBasicResult(AssistModel model, String resultName) {
		
		
		val result = f.createResult
		result.name 		= resultName
		result.systemName 	= model.systemName
		
		// rootHardwareElements
		for (elem : model.hardwareContainer)
			result.rootHardwareElements.add(createHardwareElements(elem) as HardwareElement)
		
		// applicationGroups
		
		// applications
		
		// threads
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
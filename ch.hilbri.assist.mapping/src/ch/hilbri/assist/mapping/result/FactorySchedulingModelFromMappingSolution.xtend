package ch.hilbri.assist.mapping.result

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class FactorySchedulingModelFromMappingSolution {
	private static Logger logger = LoggerFactory.getLogger(FactorySchedulingModelFromMappingSolution)
	
//	static def AssistModelScheduling createAssistModel(Result mappingResult) {
		
//		val f = ModelFactory.eINSTANCE
//		val assistModelScheduling = f.createAssistModelScheduling => [
//			systemName = mappingResult.model.systemName + " - " + mappingResult.name		
//			
//			for (c : mappingResult.model.compartments)
//				compartments.add(f.createSchedulingCompartment(c))	
//		]
		
//		logger.info("Created a new scheduling model")		
		
//		return assistModelScheduling

//		null
//	}

//	private static def Compartment createSchedulingCompartment(ModelFactory f, ch.hilbri.assist.mapping.model.Compartment mappingCompartment) {
//		val schedulingCompartment = f.createCompartment => [
//			name = mappingCompartment.name
//			manufacturer = mappingCompartment.manufacturer
//			powerSupply = mappingCompartment.powerSupply
//			
//			for (b : mappingCompartment.boxes)
//				boxes.add(f.createSchedulingBox(b))
//		]	
//		
//		return schedulingCompartment
//	}
//
//	
//	private static def Box createSchedulingBox(ModelFactory f, ch.hilbri.assist.mapping.model.Box mappingBox) {
//		val schedulingBox = f.createBox => [
//			name = mappingBox.name
//			manufacturer = mappingBox.manufacturer
//			
//			for (b : mappingBox.boards)
//				boards.add(f.createSchedulingBoard(b))
//		]	
//		
//		return schedulingBox
//	}
//	
//	private static def Board createSchedulingBoard(ModelFactory f, ch.hilbri.assist.mapping.model.Board mappingBoard) {
//		val schedulingBoard = f.createBoard => [
//			name = mappingBoard.name
//			manufacturer = mappingBoard.manufacturer
//			boardType = mappingBoard.boardType
//			powerSupply = mappingBoard.powerSupply
//			assuranceLevel = mappingBoard.assuranceLevel
//			ramCapacity = mappingBoard.ramCapacity
//			romCapacity = mappingBoard.romCapacity
//			
//			for (p : mappingBoard.processors)
//				processors.add(f.createSchedulingProcessor(p))
//		]
//		
//		return schedulingBoard
//	}
//	
//	private static def Processor createSchedulingProcessor(ModelFactory f, ch.hilbri.assist.mapping.model.Processor mappingProcessor) {
//		val schedulingProcessor = f.createProcessor => [
//			name = mappingProcessor.name
//			manufacturer = mappingProcessor.manufacturer
//			processorType = mappingProcessor.processorType
//			
//			for (c : mappingProcessor.cores) 
//				cores.add(f.createSchedulingCore(c))
//		]
//		
//		return schedulingProcessor
//	}
//
//	private static def Core createSchedulingCore(ModelFactory f, ch.hilbri.assist.mapping.model.Core mappingCore) {
//		val schedulingCore = f.createCore => [
//			architecture = mappingCore.architecture
//			capacity = mappingCore.capacity
//			manufacturer = mappingCore.manufacturer
//			name = mappingCore.name
//		]
//		return schedulingCore
//	}
}
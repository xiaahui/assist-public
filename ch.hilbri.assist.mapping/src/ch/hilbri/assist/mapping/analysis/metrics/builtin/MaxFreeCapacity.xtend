package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.impl.AbstractMappingMetricImpl

class MaxFreeCapacity extends AbstractMappingMetricImpl {
	new() {
		setName("Max free Core Capacity")
		setBuiltIn(true)
		setHigherScoreIsBetter(true)
	}

	override double computeAbsoluteScore(MappingResult result) {
		
		var maxRemainingCoreCapacity = 0.0
		var unusedCores = 0.0
		var unusedProcs = 0.0
		var unusedBoards = 0.0
				
		for (core : result.getModel.allCores) {
			// no task is mapped to this core
			if (!result.getTask2CoreMap.values.contains(core)) unusedCores++
			
			// some task would like to use this core - see how much free space we got
			if ((core.coreCapacity - result.getAbsoluteCoreUtilization(core)) > maxRemainingCoreCapacity)
				maxRemainingCoreCapacity = core.coreCapacity - result.getAbsoluteCoreUtilization(core)
		}
		

		for (proc : result.getModel.allProcessors) {
			val usedCores = proc.cores.filter[result.getTask2CoreMap.values.contains(it)]
			if (usedCores.isNullOrEmpty)
				unusedProcs++
		}
			

		for (board : result.getModel.allBoards) {
			val usedCores = board.allCores.filter[result.getTask2CoreMap.values.contains(it)]
			if (usedCores.isNullOrEmpty)
				unusedBoards++
		}
		
		// Every value should be scaled to a value between 0..1
		maxRemainingCoreCapacity /= 100.0
		unusedCores /= result.getModel.allCores.size
		unusedProcs /= result.getModel.allProcessors.size
		unusedBoards /= result.getModel.allBoards.size
		
		return maxRemainingCoreCapacity + unusedCores * 100 + unusedProcs * 1000 + unusedBoards * 10000
	}
	
	
}

package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.mapping.model.result.Result
import ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl

class MaxFreeCapacity extends AbstractMetricImpl {
	new() {
		setName("Max free Core Capacity")
		setBuiltIn(true)
		setHigherScoreIsBetter(true)
	}

	override double computeAbsoluteScore(Result result) {
		
		var maxRemainingCoreCapacity = 0.0
		var unusedCores = 0.0
		var unusedProcs = 0.0
		var unusedBoards = 0.0
				
		for (core : result.model.allCores) {
			// no task is mapped to this core
			if (!result.task2CoreMap.values.contains(core)) unusedCores++
			
			// some task would like to use this core - see how much free space we got
			if ((core.capacity - result.getAbsoluteCoreUtilization(core)) > maxRemainingCoreCapacity)
				maxRemainingCoreCapacity = core.capacity - result.getAbsoluteCoreUtilization(core)
		}
		

		for (proc : result.model.allProcessors) {
			val usedCores = proc.cores.filter[result.task2CoreMap.values.contains(it)]
			if (usedCores.isNullOrEmpty)
				unusedProcs++
		}
			

		for (board : result.model.allBoards) {
			val usedCores = board.allCores.filter[result.task2CoreMap.values.contains(it)]
			if (usedCores.isNullOrEmpty)
				unusedBoards++
		}
		
		// Every value should be scaled to a value between 0..1
		maxRemainingCoreCapacity /= 100.0
		unusedCores /= result.model.allCores.size
		unusedProcs /= result.model.allProcessors.size
		unusedBoards /= result.model.allBoards.size
		
		return maxRemainingCoreCapacity + unusedCores * 100 + unusedProcs * 1000 + unusedBoards * 10000
	}
	
	
}

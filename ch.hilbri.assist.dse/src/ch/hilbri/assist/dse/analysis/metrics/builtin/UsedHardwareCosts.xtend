package ch.hilbri.assist.dse.analysis.metrics.builtin

import ch.hilbri.assist.model.ExplorationResult
import ch.hilbri.assist.model.impl.AbstractDSEMetricImpl

class UsedHardwareCosts extends AbstractDSEMetricImpl {
	new() {
		setName("Cost of min. Required Hardware");
		setBuiltIn(true);
		setHigherScoreIsBetter(false);
	}

	override double computeAbsoluteScore(ExplorationResult result) {
		val model = result.model
		val mappingResult = result.mappingResult
		return 
			model.allCompartments.filter[mappingResult.isUsed(it)].size * 10000 	+ 
			model.allBoxes.filter[mappingResult.isUsed(it)].size        * 1000      +
			model.allBoards.filter[mappingResult.isUsed(it)].size       * 100       +
			model.allProcessors.filter[mappingResult.isUsed(it)].size   * 10        + 
			model.allCores.filter[mappingResult.isUsed(it)].size        * 1
	}
	
	
}

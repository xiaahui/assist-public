package ch.hilbri.assist.dse.analysis.metrics.builtin

import ch.hilbri.assist.model.ExplorationResult
import ch.hilbri.assist.model.impl.AbstractDSEMetricImpl

class HardwareCosts extends AbstractDSEMetricImpl {
	new() {
		setName("Cost of Available Hardware");
		setBuiltIn(true);
		setHigherScoreIsBetter(false);
	}

	override double computeAbsoluteScore(ExplorationResult result) {
		val model = result.model
		return model.allCompartments.size * 10000 + 
			   model.allBoxes.size        * 1000  +
			   model.allBoards.size       * 100   +
			   model.allProcessors.size   * 10    + 
			   model.allCores.size        * 1	
	}
}

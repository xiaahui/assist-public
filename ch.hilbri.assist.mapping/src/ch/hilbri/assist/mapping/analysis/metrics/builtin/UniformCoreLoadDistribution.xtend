package ch.hilbri.assist.mapping.analysis.metrics.builtin

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.impl.AbstractMappingMetricImpl

class UniformCoreLoadDistribution extends AbstractMappingMetricImpl {
	new() {
		setName("UniformLoadDistribution")
		setBuiltIn(true)
		setHigherScoreIsBetter(false)
	}

	override double computeAbsoluteScore(MappingResult result) {
	
		/* Score is equal to the variance of the relative utilization of all cores */
		var DescriptiveStatistics statistics = new DescriptiveStatistics()
		
		for (core : result.getModel.allCores)
			statistics.addValue(result.getRelativeCoreUtilization(core))
		
		return statistics.variance
	}
}

package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.model.Result
import ch.hilbri.assist.model.impl.AbstractMetricImpl
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics

class UniformCoreLoadDistribution extends AbstractMetricImpl {
	new() {
		setName("UniformLoadDistribution")
		setBuiltIn(true)
		setHigherScoreIsBetter(false)
	}

	override double computeAbsoluteScore(Result result) {
	
		/* Score is equal to the variance of the relative utilization of all cores */
		var DescriptiveStatistics statistics = new DescriptiveStatistics()
		
		for (core : result.model.allCores)
			statistics.addValue(result.getRelativeCoreUtilization(core))
		
		return statistics.variance
	}
}

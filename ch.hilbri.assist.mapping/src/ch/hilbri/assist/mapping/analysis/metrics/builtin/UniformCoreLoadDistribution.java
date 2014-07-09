package ch.hilbri.assist.mapping.analysis.metrics.builtin;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import ch.hilbri.assist.result.mapping.Core;
import ch.hilbri.assist.result.mapping.Result;
import ch.hilbri.assist.result.mapping.impl.AbstractMetricImpl;

public class UniformCoreLoadDistribution extends AbstractMetricImpl {

	public UniformCoreLoadDistribution(int weight) {
		setName("Uniform Core Load distribution");
		setWeight(weight);
		setBuiltIn(true);
		setHigherScoreIsBetter(false);
		
	}
	

	@Override
	public double computeScore(Result result) {
		/* Der Score ist die Varianz der Auslastung aller Kerne */
		DescriptiveStatistics statistics = new DescriptiveStatistics();
		
		for (Core core : result.getAllCores())
			statistics.addValue(core.getRelativeUtilization());
		
		return statistics.getVariance();
	}


	
}
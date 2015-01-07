package ch.hilbri.assist.mapping.analysis.metrics.builtin;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl;

public class UniformCoreLoadDistribution extends AbstractMetricImpl {

	public UniformCoreLoadDistribution() {
		setName("Uniform Core Load distribution");
		setBuiltIn(true);
		setHigherScoreIsBetter(false);
	}
	

	@Override
	public double computeAbsoluteScore(Result result) {
		/* Der Score ist die Varianz der Auslastung aller Kerne */
		DescriptiveStatistics statistics = new DescriptiveStatistics();
		
		for (Core core : result.getAllCores())
			statistics.addValue(core.getRelativeUtilization());
		
		return statistics.getVariance();
	}


	
}

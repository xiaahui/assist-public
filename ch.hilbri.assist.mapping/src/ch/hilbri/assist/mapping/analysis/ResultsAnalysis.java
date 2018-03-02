package ch.hilbri.assist.mapping.analysis;

import java.util.List;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.MappingResult;

public class ResultsAnalysis {

	public static void evaluate(List<MappingResult> results, List<AbstractMetric> metrics) {

		// Delete results from previous evaluations
		for (MappingResult result : results) {
			result.getMetricAbsoluteScoresMap().clear();
			result.getMetricScaledScoresMap().clear();
		}

		// Execute each metric for the results and store the results
		for (AbstractMetric metric : metrics) {
			DescriptiveStatistics statistics = new DescriptiveStatistics();

			/* 1) Calculate the absolute score for each result */
			for (MappingResult result : results) {
				double absoluteScore = metric.computeAbsoluteScore(result);
				result.getMetricAbsoluteScoresMap().put(metric, absoluteScore);
				statistics.addValue(absoluteScore);
			}

			/* 2) Calculate the scaled score for each metric */
			for (MappingResult result : results) {
				if (statistics.getMax() - statistics.getMin() != 0) {
					double absoluteScore = result.getMetricAbsoluteScoresMap().get(metric);
					double scaledScore = (absoluteScore - statistics.getMin())
							/ (statistics.getMax() - statistics.getMin());

					/* Invert if necessary */
					if (!metric.isHigherScoreIsBetter())
						scaledScore = 1 - scaledScore;

					/* add weights */
					double weightedScaledScore = scaledScore * metric.getWeight();

					result.getMetricScaledScoresMap().put(metric, weightedScaledScore);
				} else
					/*
					 * There is only one value - so the scaled value does not
					 * help for sorting; we set it to 0 in this case
					 */
					result.getMetricScaledScoresMap().put(metric, 0.0);
			}
		}
	}
}

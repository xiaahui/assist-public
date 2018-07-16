package ch.hilbri.assist.dse.analysis

import ch.hilbri.assist.dse.results.ExplorationResult
import ch.hilbri.assist.model.AbstractDSEMetric
import java.util.List
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics

class CandidateScoring {
	static def evaluateCandidate(List<ExplorationResult> results, AbstractDSEMetric metric) {
		
		/* Clear previous evaluations */
		for (result : results) {
			result => [
				absoluteScore = null
				scaledScore = null
			]
		}
		
		/* Execute the metric for each result */
		val statistics = new DescriptiveStatistics()
		for (result : results) {
			val score = metric.computeAbsoluteScore(result.model)
			result.absoluteScore = score
			statistics.addValue(score)
		}
		
		/* Calculate the scaled scores for each result */
		for (result : results) {
			
			/* Make sure we do not divide by 0 */
			if (statistics.max - statistics.min != 0) {
				val absScore = result.absoluteScore
				var scaledScore = (absScore - statistics.min) / (statistics.max - statistics.min)
				
				/* Invert if necessary */
				if (!metric.isHigherScoreIsBetter)
					scaledScore = 1 - scaledScore

				/* Save the scaled value */				
				result.scaledScore = scaledScore
			}
			
			/* If all values are equal, then everybody gets a score of 0.0 */
			else
				result.scaledScore = 0.0
		}
	}
}
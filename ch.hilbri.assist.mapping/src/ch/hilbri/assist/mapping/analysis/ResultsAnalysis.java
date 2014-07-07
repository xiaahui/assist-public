package ch.hilbri.assist.mapping.analysis;

import java.util.ArrayList;

import ch.hilbri.assist.result.AbstractMetric;
import ch.hilbri.assist.result.Result;

public class ResultsAnalysis extends ArrayList<AbstractMetric> {

	private static final long serialVersionUID = 297850382896284886L;

	public ArrayList<Result> evaluate(ArrayList<Result> results) {
		
		double[] totalScoreAccumulator = new double[results.size()];

		/* initialize to 0 */
		for (int i = 0; i < totalScoreAccumulator.length; i++)
			totalScoreAccumulator[i] = 0.0;

		/*
		 * initialize resultsEvaluation-Score-List to capture a score for each
		 * metric in each result
		 */
		for (Result r : results) {
//			r.getEvaluation().setIndividualScores(new double[this.size()]);
		}
		
		/* compute the new scores */
		for (AbstractMetric metric : this) {
			/* These are the scores for all results for a given metric */
//			double[] metricResults = metric.computeScores(results);

			/* save the individual score */
//			for (Result r : results) 
				/*
				 * In each result, we save in the individual score array at the
				 * index of the current metric, the score of the current result
				 */
//				r.getEvaluation().getIndividualScores().[this.indexOf(metric)] = metricResults[results.indexOf(r)];
			
			/* We accumulate the total scores */
//			for (int i = 0; i < metricResults.length; i++) 
//				totalScoreAccumulator[i] += metricResults[i];
		}
		
		/* set the total score and the list of all metrics in the results */
//		for (int i = 0; i < totalScoreAccumulator.length; i++) { 
//			results.get(i).getEvaluation().setTotalScore(totalScoreAccumulator[i]);
//			results.get(i).getEvaluation().setMetricsUsed(this);
//		}
		return results;
	
	}
	
	
	
//	/**
//	 * Computes the scores (incl. feature scaling and weight) for all the
//	 * results in the resultList 
//	 * 
//	 * @param resultList
//	 *            list of results to compute the scores for
//	 * @return 
//	 * 			  a list of scores in double format for each result
//	 */
//	 
//	public double[] computeScores(ArrayList<Result> resultList) {
//		
//		double[] scoreList = new double[resultList.size()];
//		
//		DescriptiveStatistics statistics = new DescriptiveStatistics();
//		
//		/* Computing the statistics (mean, stddev) */
//		for (Result r : resultList) {
//			double unscaledScore =  computeScore(r);
//			scoreList[resultList.indexOf(r)] = unscaledScore;
//			statistics.addValue(unscaledScore);
//		}
//			
//
//		/* Computing the feature-scaled result - the best result is always 1, the worst result is always 0 */ 
//		for (Result r : resultList) {
//			/* Compute the score between 0..1 */
//			double unscaledScore = scoreList[resultList.indexOf(r)];
//			double scaledScore;
//			
//			if (statistics.getMax() - statistics.getMin() != 0) { 
//				scaledScore = (unscaledScore - statistics.getMin()) / (statistics.getMax() - statistics.getMin());
//				
//				/* invert the score if necessary */
//				if (!this.higherScoreIsBetter) scaledScore = 1 - scaledScore;
//
//			} else {
//				/*
//				 * wir haben entweder nur einen Wert oder alle Werte sind
//				 * identisch, dann nuetzt uns diese Metrik nichts fuer eine
//				 * Sortierung und wir setzen den Beitrag dieser Metrik auf Null
//				 */
//				scaledScore = 0; 
//			}
//			
//			/* add the weight and save the score */
//			scoreList[resultList.indexOf(r)] = this.weight * scaledScore;
//		}
//		return scoreList;
//	}
}

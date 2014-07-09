package ch.hilbri.assist.mapping.analysis;

import java.util.ArrayList;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import ch.hilbri.assist.result.mapping.AbstractMetric;
import ch.hilbri.assist.result.mapping.Result;

public class ResultsAnalysis  {

	public static void evaluate(ArrayList<Result> results, ArrayList<AbstractMetric> metrics) {
		
		for (AbstractMetric metric : metrics) {
			
			DescriptiveStatistics statistics = new DescriptiveStatistics();
			
			/* 1. Schritt: für jedes Result den absoluten Score berechnen - und speichern */
			for (Result result : results) { 
				double absoluteScore = metric.computeAbsoluteScore(result);
				result.getEvaluation().getAbsoluteScores().put(metric, absoluteScore);
				statistics.addValue(absoluteScore);
			}
			
			/* 2. Schritt: für jedes Result den skalierten Score berechnen */
			for (Result result : results)
				if (statistics.getMax() - statistics.getMin() != 0) {
					double absoluteScore = result.getEvaluation().getAbsoluteScores().get(metric);
					double scaledScore = (absoluteScore - statistics.getMin()) / (statistics.getMax() - statistics.getMin());
					
					/* Invertieren wenn nötig */
					if (!metric.isHigherScoreIsBetter()) scaledScore = 1 - scaledScore;
					
					/* Gewichtung vornehmen */
					double weightedScaledScore = scaledScore * metric.getWeight();
					
					/* In das Resultat zurückschreiben */
					result.getEvaluation().getScaledScores().put(metric, weightedScaledScore);
				}
				else 
				/* wir haben entweder nur einen Wert oder alle Werte sind
				 * identisch, dann nuetzt uns diese Metrik nichts fuer eine
				 * Sortierung und wir setzen den Beitrag dieser Metrik auf Null
				 */
					result.getEvaluation().getScaledScores().put(metric, 0.0);
				
			
		}
	}
}

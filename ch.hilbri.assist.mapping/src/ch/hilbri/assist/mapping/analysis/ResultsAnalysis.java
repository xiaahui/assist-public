package ch.hilbri.assist.mapping.analysis;

import java.util.List;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Result;

public class ResultsAnalysis  {

	public static void evaluate(List<Result> results, List<AbstractMetric> metrics) {
		
		// Resultate der vorigen Metriken löschen
		
		for (Result result : results) {
			result.getEvaluation().getAbsoluteScores().clear();
			result.getEvaluation().getMetricsUsed().clear();
			result.getEvaluation().getScaledScores().clear();
		}
		
		for (AbstractMetric metric : metrics) {
			
			DescriptiveStatistics statistics = new DescriptiveStatistics();
			
			/* 1. Schritt: fuer jedes Result den absoluten Score berechnen - und speichern */
			for (Result result : results) { 
				double absoluteScore = metric.computeAbsoluteScore(result);
				result.getEvaluation().getAbsoluteScores().put(metric, absoluteScore);
				statistics.addValue(absoluteScore);
			}
			
			/* 2. Schritt: fuer jedes Result den skalierten Score berechnen */
			for (Result result : results)
				if (statistics.getMax() - statistics.getMin() != 0) {
					double absoluteScore = result.getEvaluation().getAbsoluteScores().get(metric);
					double scaledScore = (absoluteScore - statistics.getMin()) / (statistics.getMax() - statistics.getMin());
					
					/* Invertieren wenn noetig */
					if (!metric.isHigherScoreIsBetter()) scaledScore = 1 - scaledScore;
					
					/* Gewichtung vornehmen */
					double weightedScaledScore = scaledScore * metric.getWeight();
					
					/* In das Resultat zuruckschreiben */
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

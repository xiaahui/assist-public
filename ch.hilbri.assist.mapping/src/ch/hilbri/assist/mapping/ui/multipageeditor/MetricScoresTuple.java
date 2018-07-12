package ch.hilbri.assist.mapping.ui.multipageeditor;

import ch.hilbri.assist.model.AbstractMappingMetric;

/**
 * This class represents a single entry in the list of metrics that
 * have been used to evaluate a single result
 * 
 * @author hilb_ro
 *
 */
public class MetricScoresTuple {
	private AbstractMappingMetric metric;
	private Double absoluteScore;
	private Double scaledScore;
	
	public MetricScoresTuple(AbstractMappingMetric m, Double a, Double s) {
		metric = m;
		absoluteScore = a;
		scaledScore = s;
	}

	public AbstractMappingMetric getMetric() {
		return metric;
	}

	public Double getAbsoluteScore() {
		return absoluteScore;
	}

	public Double getScaledScore() {
		return scaledScore;
	}
}

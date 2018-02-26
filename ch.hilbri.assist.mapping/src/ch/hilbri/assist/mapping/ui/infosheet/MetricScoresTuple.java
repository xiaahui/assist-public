package ch.hilbri.assist.mapping.ui.infosheet;

import ch.hilbri.assist.model.AbstractMetric;

public class MetricScoresTuple {
	private AbstractMetric metric;
	private Double absoluteScore;
	private Double scaledScore;
	
	public MetricScoresTuple(AbstractMetric m, Double a, Double s) {
		metric = m;
		absoluteScore = a;
		scaledScore = s;
	}

	public AbstractMetric getMetric() {
		return metric;
	}

	public Double getAbsoluteScore() {
		return absoluteScore;
	}

	public Double getScaledScore() {
		return scaledScore;
	}
}

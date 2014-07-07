package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview;

import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.result.AbstractMetric;

public class MetricTableElement {

	AbstractMetric metric;
	int weight = 1;
	int position = 0;
	private ResultsAnalysis metricsList;
	boolean builtin;

	public MetricTableElement(AbstractMetric metric, int position, ResultsAnalysis metricsList) {
		this.metric = metric;
		this.position = position;
		this.weight = metric.getWeight();
		this.metric.setWeight(1);
		this.metricsList = metricsList;
		this.builtin = metric.isBuiltIn();
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return metric.getName();
	}

	public int getMetricPostitionInList() {
		return position;
	}
	
	public boolean isBuiltIn() {
		return builtin;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
		metric.setWeight(weight);
	}

	public void setMetric(int pos) {
		AbstractMetric newMetric = metricsList.get(pos);
		this.position = pos;
		newMetric.setWeight(weight);
		this.metric = newMetric;
		builtin = metric.isBuiltIn();
	}

	public AbstractMetric getMetric() {
		return metric;
	}
}
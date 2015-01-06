package ch.hilbri.assist.mapping.ui.metrics;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;

/**
 * This class describes the elements in the table view
 * 
 * @author hilb_ro
 *
 */

public class MetricTableEntry {

	private AbstractMetric metric;
	private int weight;
	
	public MetricTableEntry(AbstractMetric metric, int weight) {
		this.metric = metric;
		this.weight = weight;
	}

	public AbstractMetric getMetric() {
		return metric;
	}

	public int getWeight() {
		return weight;
	}
}

package ch.hilbri.assist.mapping.ui.metrics.old;

import java.util.ArrayList;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;

/**
 * This class describes the elements in the table view
 * 
 * @author hilb_ro
 *
 */
public class MetricTableElement {

	private ArrayList<AbstractMetric> 	metricsList = null;
	private int 					  	indexOfSelectedMetric = 0;
	
	public MetricTableElement(ArrayList<AbstractMetric> metricsList, int indexOfSelectedMetric) {
		this.metricsList = metricsList;
		this.indexOfSelectedMetric = indexOfSelectedMetric;
	}

	public AbstractMetric getSelectedMetric() {
		return metricsList.get(indexOfSelectedMetric);
	}
	
	public void setMetric(int selectedMetricsListIndex) {
		this.indexOfSelectedMetric = selectedMetricsListIndex;
	}
	
	public int getWeight() {
		return getSelectedMetric().getWeight();
	}

	public String getName() {
		return getSelectedMetric().getName();
	}

	public int getMetricPostitionInList() {
		return indexOfSelectedMetric;
	}
	
	public boolean isBuiltIn() {
		return getSelectedMetric().isBuiltIn();
	}
	
	public void setWeight(int weight) {
		getSelectedMetric().setWeight(weight);
	}

	public void setMetricsList(ArrayList<AbstractMetric> metricsList) {
		this.metricsList = metricsList;
	}



}
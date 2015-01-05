package ch.hilbri.assist.mapping.ui.metrics;

import org.eclipse.swt.SWT;

class MetricComboBoxCellEditor extends ComboBoxCellEditor {

	public MetricComboBoxCellEditor(MetricTableView metricTableView) {
		super(metricTableView.getTable(), 
			  metricTableView.getMetricNames(), 
			  SWT.READ_ONLY, 
			  metricTableView.elementlist, 
			  metricTableView.tbMessageLabel);
	}
}
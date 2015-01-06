package ch.hilbri.assist.mapping.ui.metrics.old;

import org.eclipse.swt.SWT;

import ch.hilbri.assist.mapping.ui.metrics.MetricTableView;

class MetricComboBoxCellEditor extends ComboBoxCellEditor {

	public MetricComboBoxCellEditor(MetricTableView metricTableView) {
		super(metricTableView.getTable(), 
			  metricTableView.getMetricNames(), 
			  SWT.READ_ONLY, 
			  metricTableView.elementlist, 
			  metricTableView.tbMessageLabel);
	}
}
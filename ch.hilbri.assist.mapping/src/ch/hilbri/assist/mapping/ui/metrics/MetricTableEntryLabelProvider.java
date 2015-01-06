package ch.hilbri.assist.mapping.ui.metrics;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class MetricTableEntryLabelProvider extends CellLabelProvider {

	private Table tblSelectedMetrics;
	
	public MetricTableEntryLabelProvider(Table tblSelectedMetrics) {
		super();
		this.tblSelectedMetrics = tblSelectedMetrics;
	}
	
	@Override
	public void update(ViewerCell cell) {

		final MetricTableEntry metricTableEntry = (MetricTableEntry) cell.getElement();
		
		switch (cell.getColumnIndex()) {
		case 0:
			cell.setText(String.valueOf(tblSelectedMetrics.indexOf((TableItem) cell.getItem()) + 1));
			break;
		case 1:
			cell.setText(metricTableEntry.getMetric().getName());
			break;
		case 2:
			if (metricTableEntry.getMetric().isBuiltIn()) cell.setText("Built-in");
			else cell.setText("Custom");
			break;
		case 3:
			cell.setText(String.valueOf(metricTableEntry.getWeight()));
			break;
		}
	}

}

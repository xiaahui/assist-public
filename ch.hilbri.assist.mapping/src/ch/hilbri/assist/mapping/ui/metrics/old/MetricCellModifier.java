package ch.hilbri.assist.mapping.ui.metrics.old;

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;

import ch.hilbri.assist.mapping.ui.metrics.MetricTableView;

class MetricCellModifier implements ICellModifier {

	private MetricTableView metricTableView;
	private TableViewer	viewer;

	public MetricCellModifier(MetricTableView metricTableView, TableViewer viewer) {
		this.metricTableView = metricTableView;
		this.viewer = viewer;
	}

	@Override
	public boolean canModify(Object element, String property) {
		return true;
	}

	@Override
	public Object getValue(Object element, String property) {
		MetricTableElement metric = (MetricTableElement) element;
		if (MetricTableView.WEIGHT.equals(property)) {
			return String.valueOf(metric.getWeight());
		} else if (MetricTableView.METRIC.equals(property)) {
			return metric.getMetricPostitionInList();
		} else if (MetricTableView.TYPE.equals(property)) {
			if (metric.isBuiltIn()) {
				return "Built-in";
			} else {
				return "Custom";
			}
		} else if (MetricTableView.INDEX.equals(property)) {
			return this.metricTableView.getTable().indexOf((TableItem) element);
		}else {
			return null;
		}
	}

	@Override
	public void modify(Object element, String property, Object value) {
		TableItem item = (TableItem) element;
		MetricTableElement metric = (MetricTableElement) item.getData();
		if (MetricTableView.WEIGHT.equals(property)) {
			try {
				metric.setWeight(Integer.parseInt(String.valueOf(value)));
			} catch (NumberFormatException e) {

			}
		} else if (MetricTableView.METRIC.equals(property)) {
			if (value instanceof Integer) {
				int pos = (int) value;
				metric.setMetric(pos);
			}
		} 
		viewer.update(item.getData(), null);
	}

}
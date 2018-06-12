package ch.hilbri.assist.mapping.ui.multipageeditor;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class MetricScoresTableLabelProvider extends LabelProvider implements ITableLabelProvider {
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof MetricScoresTuple) {
			MetricScoresTuple t = (MetricScoresTuple) element;
			if (columnIndex == 0) return t.getMetric().getName();
			else if (columnIndex == 1) return String.format("%.3f", t.getScaledScore());
			else if (columnIndex == 2) return String.format("%.3f", t.getAbsoluteScore());
		}
		return "";
	}
}
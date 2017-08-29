package ch.hilbri.assist.mapping.ui.infosheet;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

class ComponentLabelProvider extends LabelProvider implements ITableLabelProvider {
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}
	// We expect a list of strings
	public String getColumnText(Object element, int columnIndex) {
		
		if (element instanceof String[])
			return ((String[]) element)[columnIndex];
		
		return element.toString();
	}
}
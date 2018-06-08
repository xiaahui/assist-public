package ch.hilbri.assist.mapping.ui.multipageeditor;

import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MetricTableContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// Do nothing
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Ignore
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return ((ArrayList<?>) inputElement).toArray();
	}

}

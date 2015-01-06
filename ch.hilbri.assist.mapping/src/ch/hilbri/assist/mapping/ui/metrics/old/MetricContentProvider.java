package ch.hilbri.assist.mapping.ui.metrics.old;

import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * This class provides the content for the metric table
 */
class MetricContentProvider implements IStructuredContentProvider {
	/**
	 * Returns the Metric objects
	 */
	public Object[] getElements(Object inputElement) {
		return ((ArrayList<?>) inputElement).toArray();
	}

	/**
	 * Disposes any created resources
	 */
	public void dispose() {
		// Do nothing
	}

	/**
	 * Called when the input changes
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Ignore
	}
}
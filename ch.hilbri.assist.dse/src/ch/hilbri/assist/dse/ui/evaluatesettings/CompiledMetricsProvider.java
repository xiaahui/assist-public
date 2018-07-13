package ch.hilbri.assist.dse.ui.evaluatesettings;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class CompiledMetricsProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// do nothing
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// ignore
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		ArrayList<String> classNames = new ArrayList<String>();
		
		IPath path = (IPath) inputElement;
		
		File dir = new File(path.toPortableString());
		File[] filesList = dir.listFiles();

		for (File file : filesList) {
	        if (file.isFile()) {
	        	// Remove extension from class name
	        	classNames.add(file.getName().replaceFirst("[.][^.]+$", ""));
	        }
		}
		
		return classNames.toArray();
	}
}
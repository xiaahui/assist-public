package ch.hilbri.assist.mapping.ui.metrics.loading;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.ui.StandardJavaElementContentProvider;

/**
 * This class filters the Java Projects 
 * 
 */
class MetricProjectContentProvider extends StandardJavaElementContentProvider {

	@Override
	public Object[] getElements(Object element) {

		List<Object> filteredProjects = new ArrayList<Object>();
		
		for (Object project : super.getElements(element)) {
			if (project instanceof IJavaProject) 
				filteredProjects.add(project);
		}

		return filteredProjects.toArray();

	}
}
package ch.hilbri.assist.gui.classpath;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class ASSISTClasspathContainerInitializer extends ClasspathContainerInitializer {

	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {

		ASSISTClasspathContainer c = new ASSISTClasspathContainer();
		JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, new IClasspathContainer[] { c },
				null);

	}

}

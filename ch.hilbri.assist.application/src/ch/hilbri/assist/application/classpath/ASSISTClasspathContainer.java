package ch.hilbri.assist.application.classpath;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

public class ASSISTClasspathContainer implements IClasspathContainer {

	public ASSISTClasspathContainer() {
	}

	@Override
	public IClasspathEntry[] getClasspathEntries() {

		IClasspathEntry[] cpEntries = new IClasspathEntry[4];

		// Reference to AbstractMetric Class
		Bundle assistMappingBundle = Platform.getBundle("ch.hilbri.assist.datamodel.result.mapping");
		cpEntries[0] = JavaCore.newLibraryEntry(getLibraryPath(assistMappingBundle), null, null);
				
		// Reference to Math Commons
		Bundle assistMathBundle = Platform.getBundle("ch.hilbri.assist.libraries.math");
		cpEntries[1] = JavaCore.newLibraryEntry(getLibraryPath(assistMathBundle), null, null);

		// Reference to EMF Jars
		Bundle emfCommon = Platform.getBundle("org.eclipse.emf.common");
		cpEntries[2] = JavaCore.newLibraryEntry(getLibraryPath(emfCommon), null, null);
		
		// Reference to org.eclipse.core.runtime
		Bundle emfEcore = Platform.getBundle("org.eclipse.emf.ecore");
		cpEntries[3] = JavaCore.newLibraryEntry(getLibraryPath(emfEcore), null, null);
		
		return cpEntries;
	}

	private Path getLibraryPath(Bundle bundle) {
		String path = "";
		
		URL fileURL = FileLocator.find(bundle, new Path("bin"), null);
		
		if (fileURL == null)
			fileURL = FileLocator.find(bundle, new Path(""), null);
		
				
		URL resolvedURL = null;

		try {
			resolvedURL = FileLocator.resolve(fileURL);
			
			if (resolvedURL.getProtocol().equals("file")) {
				resolvedURL = FileLocator.resolve(fileURL);
				path = resolvedURL.getPath();
				
			} else if (resolvedURL.getProtocol().equals("jar")) {
				path = resolvedURL.getPath().substring(5, resolvedURL.getPath().length()-2);
			}
		} catch (IOException e) { e.printStackTrace(); }
		
		return new Path(path);
	}
	
	@Override
	public String getDescription() {
		return "ASSIST Library";
	}

	@Override
	public int getKind() {
		return K_APPLICATION;
	}

	@Override
	public IPath getPath() {
		return new Path("ch.hilbri.assist.application.classpathContainer");
	}

}

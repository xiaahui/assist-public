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

		IClasspathEntry[] cpEntries = new IClasspathEntry[3];

		// Refernce to AbstractMetric Class
		// Development: proto = file; sonst: proto = jar
		
		// so geht es für proto = file:
		Bundle assistResultBundle = Platform.getBundle("ch.hilbri.assist.datamodel.result.mapping");
		
		URL fileURL = FileLocator.find(assistResultBundle, new Path("bin"), null);
		URL resolvedURL = null;

		try {
			resolvedURL = FileLocator.resolve(fileURL);
		} catch (IOException e) { e.printStackTrace(); }
		
		if (resolvedURL != null) {
				cpEntries[0] = JavaCore.newLibraryEntry(new Path(resolvedURL.getPath()), null, null);
		}
		
		
		
		// TODO: Reference to EMF Jars
		Bundle emfCommon = Platform.getBundle("org.eclipse.emf.common");
		fileURL = FileLocator.find(emfCommon, new Path(""), null);
		try {
			resolvedURL = FileLocator.resolve(fileURL);
			
		} catch (IOException e) { e.printStackTrace(); }
		
		cpEntries[1] = JavaCore.newLibraryEntry(new Path("/C:/Program Files/eclipse-4.4/eclipse/plugins/org.eclipse.emf.common_2.10.0.v20140514-1158.jar"), null, null);
		
		// TODO: org.eclipse.core.runtime
		cpEntries[2] = JavaCore.newLibraryEntry(new Path("/C:/Program Files/eclipse-4.4/eclipse/plugins/org.eclipse.emf.ecore_2.10.0.v20140514-1158.jar"), null, null);
		
		
		
		
		return cpEntries;
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

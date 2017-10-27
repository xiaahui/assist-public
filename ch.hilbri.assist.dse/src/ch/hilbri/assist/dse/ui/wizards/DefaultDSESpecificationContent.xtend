package ch.hilbri.assist.dse.ui.wizards

import java.io.InputStream
import java.net.URI
import org.eclipse.core.runtime.FileLocator
import org.osgi.framework.FrameworkUtil

class DefaultDSESpecificationContent {

	def static InputStream getDefaultContent() {

		// This is all done to load a file from a bundle with a path that may contain spaces ...
		// it should also work with jars
		val bundle = FrameworkUtil.getBundle(DefaultDSESpecificationContent)
		val pathURL = bundle.getEntry("resources/example.ddsl");
		val resolvedURL = FileLocator.resolve(pathURL)
		val escapedURL = new URI("dummy", resolvedURL.toString, null).getRawSchemeSpecificPart();
		val pathURI = new URI(escapedURL)
		
		return pathURI.toURL.openStream
	}
}

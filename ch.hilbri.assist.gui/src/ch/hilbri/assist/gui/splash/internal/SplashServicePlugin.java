package ch.hilbri.assist.gui.splash.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SplashServicePlugin implements BundleActivator {

	public static final String PLUGIN_ID = "ch.hilbri.assist.gui";
	
	private static BundleContext context;
	
	protected static BundleContext getContext() {
		return context;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		SplashServicePlugin.context = bundleContext;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		SplashServicePlugin.context = null;
	}
	
}

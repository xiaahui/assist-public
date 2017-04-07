package ch.hilbri.assist.gui.splash.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SplashServicePlugin implements BundleActivator {

	public static final String PLUGIN_ID = "ch.hilbri.assist.gui";
	
	private static BundleContext context;
	
	protected static BundleContext getContext() {
		return context;
	}
	
	//ServiceRegistration<StartupMonitor> monitorRegistration = null;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		SplashServicePlugin.context = bundleContext;
		/*
		monitorRegistration = context.registerService(StartupMonitor.class, new StartupMonitor() {
			@Override
			public void update() {
				logger.info("StartUp Monitor: update()");
			}
			@Override
			public void applicationRunning() {
				logger.info("StartUp Monitor: applicationRunning()");
			}
		}, null);
		*/
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		/*
		if (monitorRegistration != null) {
			monitorRegistration.unregister();
			monitorRegistration = null;
		}
		*/
		SplashServicePlugin.context = null;
	}
	
}

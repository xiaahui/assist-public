package ch.hilbri.assist.application.splashHandlers;

import org.eclipse.core.runtime.IProduct;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.internal.util.PrefUtil;
import org.eclipse.ui.splash.BasicSplashHandler;

/**
 * Custom Splash Screen
 * 
 *
 */
@SuppressWarnings("restriction")
public class SplashHandler extends BasicSplashHandler {

	private final static int MESSAGE_X = 25;

	private final static int MESSAGE_Y = 25;

	private final static int MESSAGE_WIDTH = 200;

	private final static int MESSAGE_HEIGHT = 25;

	private final static int VERSION_X = 5;

	private final static int VERSION_Y = 205;

	private final static int VERSION_R = 255;
	private final static int VERSION_G = 255;
	private final static int VERSION_B = 255;

	public SplashHandler() {
		super();
	}

	@Override
	public void init(Shell splash) {
		super.init(splash);
		PrefUtil.getAPIPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_PROGRESS_ON_STARTUP, false);
		
		Rectangle progressRect = new Rectangle(MESSAGE_X, MESSAGE_Y, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		setMessageRect(progressRect);

		IProduct product = Platform.getProduct();
		
		final String version = product.getProperty("version");

		if (version != null) {

			getContent().addPaintListener(new PaintListener() {

				public void paintControl(PaintEvent e) {
					
					String versionText = "Version: " + Platform.getBundle("ch.hilbri.assist.application").getHeaders().get("Bundle-Version") +  
										 "\nPlatform: " + System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit";
					e.gc.setForeground(new Color(null, VERSION_R, VERSION_G, VERSION_B));
					e.gc.setFont(new Font(e.display,"Tahoma", 8, SWT.BOLD));
					e.gc.drawText(versionText, VERSION_X, VERSION_Y, true);
				}
			});

		}
	}
}

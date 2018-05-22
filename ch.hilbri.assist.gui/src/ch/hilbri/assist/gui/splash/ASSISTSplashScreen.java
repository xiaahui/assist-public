package ch.hilbri.assist.gui.splash;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.ResourceManager;

public class ASSISTSplashScreen extends Shell {

    /**
     * Create the shell.
     * @param display
     */
    public ASSISTSplashScreen(Display display) {
        super(display, SWT.TOOL | SWT.NO_TRIM);
        setLayout(new FillLayout(SWT.HORIZONTAL));
        
        Label lblHalloWelt = new Label(this, SWT.NONE);
        lblHalloWelt.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/splash.bmp"));
        createContents();
    }

    // splashService.setMessage("Version: "
    // +
    // Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version")
    // + "\n" + "Platform: "
    // + System.getProperty("os.name") + " " +
    // System.getProperty("sun.arch.data.model") + "bit");

    
    
    /**
     * Create contents of the shell.
     */
    protected void createContents() {
        setText("ASSIST");
        setSize(450, 300);

    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

}

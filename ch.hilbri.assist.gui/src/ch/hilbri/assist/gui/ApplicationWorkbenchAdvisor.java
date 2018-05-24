package ch.hilbri.assist.gui;

import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

    private static final String PERSPECTIVE_ID = "ch.hilbri.assist.gui.perspective";

    @Override
    public void initialize(IWorkbenchConfigurer configurer) {
        super.initialize(configurer);

        configurer.setSaveAndRestore(true);
        PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);

        // inserted: register workbench adapters
        IDE.registerAdapters();

        // inserted: register images for rendering explorer view
        final String ICONS_PATH = "icons/full/";
        final String PATH_OBJECT = ICONS_PATH + "obj16/";

        Bundle ideBundle = Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH);
        declareWorkbenchImage(configurer, ideBundle, IDE.SharedImages.IMG_OBJ_PROJECT, PATH_OBJECT + "prj_obj.png",
                true);
        declareWorkbenchImage(configurer, ideBundle, IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED,
                PATH_OBJECT + "cprj_obj.png", true);
    }
    
    private void declareWorkbenchImage(IWorkbenchConfigurer configurer_p, Bundle ideBundle, String symbolicName,
            String path, boolean shared) {
        URL url = ideBundle.getEntry(path);
        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        configurer_p.declareImage(symbolicName, desc, shared);
    }

    @Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

    @Override
    public String getInitialWindowPerspectiveId() {
        return PERSPECTIVE_ID;
    }

    @Override
    public void postStartup() {
        /* Removing unnecessary preference pages */
        PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
        pm.remove("ch.hilbri.assist.dse.dsl.DSEDsl");
        pm.remove("ch.hilbri.assist.mapping.dsl.MappingDSL");
        pm.remove("ch.hilbri.assist.scheduling.dsl.SchedulingDsl");
        pm.remove("org.eclipse.team.ui.TeamPreferences");
        pm.remove("org.eclipse.xtend.core.Xtend");
        pm.remove("org.eclipse.swtbot.eclipse.ui.preferences.SWTBotPreferencePage");
        pm.remove("org.eclipse.xtext.Xtext");
        pm.remove("org.eclipse.ui.preferencePages.Perspectives");
        pm.remove("org.eclipse.ui.preferencePages.Views");
        pm.remove("org.eclipse.ui.preferencePages.Workspace");
        pm.remove("org.eclipse.ui.preferencePages.Keys");
        pm.remove("org.eclipse.ui.preferencePages.ContentTypes");
        pm.remove("org.eclipse.ui.trace.tracingPage");
        pm.remove("org.eclipse.equinox.security.ui.category");
        pm.remove("org.eclipse.equinox.security.ui.storage");
        pm.remove("org.eclipse.ui.browser.preferencePage");
        pm.remove("org.eclipse.ui.monitoring.page");
        pm.remove("org.eclipse.ui.net.NetPreferences");
        pm.remove("org.eclipse.compare.internal.ComparePreferencePage");
        pm.remove("org.eclipse.ui.preferencePages.Startup");
        pm.remove("org.eclipse.equinox.internal.p2.ui.sdk.ProvisioningPreferencePage");
        pm.remove("org.eclipse.help.ui.browsersPreferencePage");
    }
    
    
    /*
     * Fixes the missing input in the project explorer
     * 
     * (see:
     * https://dirksmetric.wordpress.com/2012/08/01/tutorial-eclipse-rcp-e4-with-3-x
     * -views-like-project-explorer-properties-etc/)
     * 
     * 
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.application.WorkbenchAdvisor#getDefaultPageInput()
     */
    @Override
    public IAdaptable getDefaultPageInput() {
        return ResourcesPlugin.getWorkspace().getRoot();
    }

    @Override
    public boolean preShutdown() {
        try {
            ResourcesPlugin.getWorkspace().save(true, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return super.preShutdown();
    }
}

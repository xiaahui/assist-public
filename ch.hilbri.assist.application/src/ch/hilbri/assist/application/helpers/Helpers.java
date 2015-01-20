package ch.hilbri.assist.application.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.dialogs.WorkbenchWizardElement;
import org.eclipse.ui.internal.wizards.AbstractExtensionWizardRegistry;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;

@SuppressWarnings("restriction")
public class Helpers {

	public static boolean isInDebugMode = java.lang.management.ManagementFactory.getRuntimeMXBean().getInputArguments().toString().indexOf("-agentlib:jdwp") > 0;

	/**
	 * Searches for the active editor and returns it
	 * 
	 * @param application
	 * @param modelService
	 * @return active editor or null if there is none
	 */
	public static MPart getActiveEditor(MApplication application, EModelService modelService) {
		MPartStack editorfield = getEditorField(application, modelService);
		if (editorfield != null && editorfield.getSelectedElement() instanceof MPart) {
			MPart editorPart = (MPart) editorfield.getSelectedElement();
			return editorPart;
		} else {
			return null;
		}
	}

	/**
	 * Returns the MPartStack which contains all the Parts like editor or views.
	 * 
	 * @param application
	 * @param modelService
	 * @return Returns the editor field or null if it doesn't exist
	 */
	public static MPartStack getEditorField(MApplication application, EModelService modelService) {
		List<MPartStack> stacks = modelService.findElements(application, PathProvider.APP_EDITORSS, MPartStack.class, null);
		if (stacks.size() > 0) {
			return stacks.get(0);
		}
		return null;
	}

	/**
	 * Returns the MPartStack which contains all the Parts of the bottom view like Console or Properties.
	 * 
	 * @param application
	 * @param modelService
	 * @return Returns the editor field or null if it doesn't exist
	 */
	public static MPartStack getBottomField(MApplication application, EModelService modelService) {
		List<MPartStack> stacks = modelService.findElements(application, PathProvider.APP_MSTACK_PROPERTY_SHEET, MPartStack.class, null);
		if (stacks.size() > 0) {
			MPartStack stack = stacks.get(0);
			if (!stack.isToBeRendered()) {
				stack.setToBeRendered(true);
			}
			return stack;
		}
		return null;
	}

	/**
	 * Returns the MPartStack which contains all the Parts of the right view like Cheat Sheet.
	 * 
	 * @param application
	 * @param modelService
	 * @return Returns the editor field or null if it doesn't exist
	 */
	public static MPartStack getInfoField(MApplication application, EModelService modelService) {
		List<MPartStack> stacks = modelService.findElements(application, PathProvider.APP_MSTACK_INFO_SHEET, MPartStack.class, null);
		if (stacks.size() > 0) {
			MPartStack stack = stacks.get(0);
			if (!stack.isToBeRendered()) {
				stack.setToBeRendered(true);
			}
			return stack;
		}
		return null;
	}

	/**
	 * Adds a new Part to the editor field.
	 * 
	 * @param id
	 *            Id that may be used to find the element later
	 * @param label
	 *            Label that is shown on top of the editor (usually for filename)
	 * @param uri
	 *            The uri for the class that is linked with this part(for example:
	 *            "bundleclass://de.fraunhofer.fokus.precisionpro.application/de.fraunhofer.fokus.precisionpro.application.parts.SchedulingFXMainView"
	 *            )
	 * @param application
	 *            Obtained through injection
	 * @param modelService
	 *            Obtained through injection
	 */
	public static void addViewToEditorfield(String id, String label, String uri, MApplication application, EModelService modelService) {
		MPart part = MBasicFactory.INSTANCE.createPart();
		part.setElementId(id);
		part.setLabel(label);
		part.setContributionURI(uri);
		MPartStack mpart = getEditorField(application, modelService);
		if (mpart != null) {
			mpart.getChildren().add(part);
		} else {
			ConsoleCommands.writeErrorLineToConsole("Couldn't find Editor Viewpart!");
		}

	}

	/**
	 * Adds a new Part to the bottom field if it doesn't already exist.
	 * 
	 * @param id
	 *            Id that may be used to find the element later
	 * @param label
	 *            Label that is shown on top of the editor (usually for filename)
	 * @param uri
	 *            The uri for the class that is linked with this part
	 * @param application
	 *            Obtained through injection
	 * @param modelService
	 *            Obtained through injection
	 * @param single
	 *            if true, a part is only created if none already exists
	 */
	public static MPart addViewToBottomfield(String id, String label, String uri, MApplication application, EModelService modelService, boolean single, String iconUri) {
		List<MPart> parts = modelService.findElements(application, id, MPart.class, null);
		if (parts.size() > 0 && single) {
			for (MPart tmpPart : parts) {
				if (tmpPart != null) {
					if (tmpPart.isToBeRendered() && tmpPart.isVisible()) {
						return tmpPart;
					}
				}
			}
		}
		MPart part = MBasicFactory.INSTANCE.createPart();
		part.setElementId(id);
		part.setLabel(label);
		part.setIconURI(iconUri);
		part.setContributionURI(uri);
		part.setCloseable(true);
		MPartStack mpart = getBottomField(application, modelService);
		if (mpart != null) {
			mpart.getChildren().add(part);
			mpart.setSelectedElement(part);
			return part;
		} else {
			ConsoleCommands.writeErrorLineToConsole("Couldn't find Bottom Viewpart!");
			return null;
		}
	}

	/**
	 * 
	 * Adds a new Part to the right field if it doesn't already exist.
	 * 
	 * @param id
	 *            Id that may be used to find the element later
	 * @param label
	 *            Label that is shown on top of the editor (usually for filename)
	 * @param uri
	 *            The uri for the class that is linked with this part(for example:
	 *            "bundleclass://de.fraunhofer.fokus.precisionpro.application/de.fraunhofer.fokus.precisionpro.application.parts.SchedulingFXMainView"
	 *            )
	 * @param application
	 *            Obtained through injection
	 * @param modelService
	 *            Obtained through injection
	 * @param single
	 *            if true, a part is only created if none already exists
	 */
	public static MPart addViewToInfofield(String id, String label, String uri, MApplication application, EModelService modelService, boolean single) {
		List<MPart> parts = modelService.findElements(application, id, MPart.class, null);
		if (parts.size() > 0 && single) {
			for (MPart tmpPart : parts) {
				if (tmpPart != null) {
					if (tmpPart.isToBeRendered() && tmpPart.isVisible()) {
						return tmpPart;
					}
				}
			}
		}
		MPart part = MBasicFactory.INSTANCE.createPart();
		part.setElementId(id);
		part.setLabel(label);
		part.setContributionURI(uri);
		part.setCloseable(true);
		MPartStack mpart = getInfoField(application, modelService);
		if (mpart != null) {
			mpart.getChildren().add(part);
			mpart.setSelectedElement(part);
			return part;
		} else {
			ConsoleCommands.writeErrorLineToConsole("Couldn't find Bottom Viewpart!");
			return null;
		}
	}

	/**
	 * Disables all wizards with are listet in the if statement
	 * 
	 */
	public static void disableWizards() {
		// Manually disabling unwanted wizards
		
		// Disable Basic / General Wizards
		AbstractExtensionWizardRegistry wizardRegistry = (AbstractExtensionWizardRegistry)PlatformUI.getWorkbench().getNewWizardRegistry();
		IWizardCategory[] categories = PlatformUI.getWorkbench().getNewWizardRegistry().getRootCategory().getCategories();
		for(IWizardDescriptor wizard : getAllWizards(categories)){
		    if(wizard.getCategory().getId().matches("org.eclipse.ui.Basic")){
		        WorkbenchWizardElement wizardElement = (WorkbenchWizardElement) wizard;
		        wizardRegistry.removeExtension(wizardElement.getConfigurationElement().getDeclaringExtension(), new Object[]{wizardElement});
		    }
		}
		
		// Disable Java-related Wizards
		wizardRegistry = (AbstractExtensionWizardRegistry) PlatformUI.getWorkbench().getNewWizardRegistry();
		categories = new IWizardCategory[] { PlatformUI.getWorkbench().getNewWizardRegistry().findCategory(PathProvider.ECL_JDT_UI_JAVA) };
		for (IWizardDescriptor wizard : getAllWizards(categories)) {

			// Disabling if statement
			if (wizard.getId().matches(PathProvider.ECL_WIZARD_NEW_ANNOTATION) || wizard.getId().matches(PathProvider.ECL_WIZARD_NEW_CLASS) || wizard.getId().matches(PathProvider.ECL_WIZARD_NEW_ENUM)
					|| wizard.getId().matches(PathProvider.ECL_WIZARD_NEW_INTERFACE) || wizard.getId().matches(PathProvider.ECL_WIZARD_NEW_JAVA_WORKING_SET) || wizard.getId().matches(PathProvider.ECL_WIZARD_JAVA_PROJECT)) {

				WorkbenchWizardElement wizardElement = (WorkbenchWizardElement) wizard;
				wizardRegistry.removeExtension(wizardElement.getConfigurationElement().getDeclaringExtension(), new Object[] { wizardElement });
			}
		}
	}

	/**
	 * Returns all wizards of the workbench for the given categories
	 * 
	 * @param categories
	 * @return
	 */
	private static IWizardDescriptor[] getAllWizards(IWizardCategory[] categories) {
		List<IWizardDescriptor> results = new ArrayList<IWizardDescriptor>();
		for (IWizardCategory wizardCategory : categories) {
			results.addAll(Arrays.asList(wizardCategory.getWizards()));
			results.addAll(Arrays.asList(getAllWizards(wizardCategory.getCategories())));
		}
		return results.toArray(new IWizardDescriptor[0]);
	}

	/**
	 * For the given ScrolledComposite a Mousewheellistener will be installed, so that scrolling will work with the mouse wheel
	 * 
	 * @param scrollable
	 */
	public static void installMouseWheelScrollRecursively(final ScrolledComposite scrollable) {
		MouseWheelListener scroller = createMouseWheelScroller(scrollable);
		if (scrollable.getParent() != null)
			scrollable.getParent().addMouseWheelListener(scroller);
		installMouseWheelScrollRecursively(scroller, scrollable);
	}

	private static MouseWheelListener createMouseWheelScroller(final ScrolledComposite scrollable) {
		return new MouseWheelListener() {

			@Override
			public void mouseScrolled(MouseEvent e) {
				Point currentScroll = scrollable.getOrigin();
				scrollable.setOrigin(currentScroll.x, currentScroll.y - (e.count * 5));
			}
		};
	}

	private static void installMouseWheelScrollRecursively(MouseWheelListener scroller, Control c) {
		c.addMouseWheelListener(scroller);
		if (c instanceof Composite) {
			Composite comp = (Composite) c;
			for (Control child : comp.getChildren()) {
				installMouseWheelScrollRecursively(scroller, child);
			}
		}
	}
}

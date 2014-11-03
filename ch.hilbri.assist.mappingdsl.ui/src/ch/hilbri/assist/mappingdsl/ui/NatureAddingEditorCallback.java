package ch.hilbri.assist.mappingdsl.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

/**
 * @author Robert Hilbrich
 * 
 * RPH: Helps to prevent the unnerving question: "Do you want to add the XText Nature to the project" 
 */
@SuppressWarnings({ "restriction", "deprecation" })
public class NatureAddingEditorCallback extends AbstractDirtyStateAwareEditorCallback {
	
	@Inject
	private ToggleXtextNatureAction toggleNature;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		IResource resource = editor.getResource();
		if (resource!=null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible() && !resource.getProject().isHidden()) {
				toggleNature.toggleNature(resource.getProject());
		}
	}

}
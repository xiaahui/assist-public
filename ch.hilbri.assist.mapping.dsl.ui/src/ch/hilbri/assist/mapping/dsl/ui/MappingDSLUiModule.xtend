package ch.hilbri.assist.mapping.dsl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.IXtextEditorCallback

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class MappingDSLUiModule extends AbstractMappingDSLUiModule {
	
	/* RPH: Helps to prevent the unnerving question: "Do you want to add the XText Nature to the project" */
	override Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return IXtextEditorCallback.NullImpl;
	}
}

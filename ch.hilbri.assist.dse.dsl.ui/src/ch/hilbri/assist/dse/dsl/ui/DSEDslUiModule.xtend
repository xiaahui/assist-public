package ch.hilbri.assist.dse.dsl.ui

import org.eclipse.ui.views.contentoutline.IContentOutlinePage
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.IXtextEditorCallback
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage

class MyOutlinePage extends OutlinePage {
	override int getDefaultExpansionLevel() { 3 }
}

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class DSEDslUiModule extends AbstractDSEDslUiModule {
	
	/* Helps to prevent the unnerving question: "Do you want to add the XText Nature to the project" */
	override Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return IXtextEditorCallback.NullImpl
	}
	
	/* We want to expand the outline view according to the level set in MyOutlinePage */
	override Class<? extends IContentOutlinePage> bindIContentOutlinePage() {
		return MyOutlinePage
	}
}

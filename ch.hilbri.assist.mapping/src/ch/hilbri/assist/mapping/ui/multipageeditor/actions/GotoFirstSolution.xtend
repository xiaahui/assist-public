package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class GotoFirstSolution extends Action {
    new() {
        super("First Solution",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/first_result.png"))
    }

    override run() {
    }
}

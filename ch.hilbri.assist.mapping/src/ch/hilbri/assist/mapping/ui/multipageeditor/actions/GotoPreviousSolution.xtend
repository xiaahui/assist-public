package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class GotoPreviousSolution extends Action {
    new() {
        super("Previous Solution",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_prev.gif"))
    }

    override run() {
        
    }

}

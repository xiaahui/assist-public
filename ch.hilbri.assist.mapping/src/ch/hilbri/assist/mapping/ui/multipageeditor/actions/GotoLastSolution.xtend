package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class GotoLastSolution extends Action {
     new() {
        super("Last Solution",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/last_result.png"))
    }

    override run() {
        
    }
}
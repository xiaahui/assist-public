package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class GotoNextSolution extends Action {
     new() {
        super("Next Solution",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/result_next.gif"))
    }

    override run() {
        
    }
}
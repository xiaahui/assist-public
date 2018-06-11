package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class GotoSpecificSolution extends Action {

     new() {
        super("Goto Solution",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/goto_input.png"))
    }

    override run() {
        
    }
}

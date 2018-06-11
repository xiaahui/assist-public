package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class SortSolutionsByName extends Action {
     new() {
        super("Sort Solutions by Name",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/results_sort_id.png"))
    }

    override run() {
        
    }
}
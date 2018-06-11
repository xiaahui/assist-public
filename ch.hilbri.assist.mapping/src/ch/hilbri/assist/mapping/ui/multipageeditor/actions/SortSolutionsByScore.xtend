package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class SortSolutionsByScore extends Action {
    new() {
        super("Sort Solutions by Score",
            ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", "icons/results_sort_score.png"))
    }

    override run() {
        
    }
}
package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage
import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager

class AbstractResultsPageAction extends Action {
    protected DetailedResultsPage resultsView

    new(DetailedResultsPage view, String name, String iconPath) {
        super(name, ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", iconPath))
        this.resultsView = view
    }
}

package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import org.eclipse.jface.action.Action
import org.eclipse.wb.swt.ResourceManager
import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

class AbstractResultsPageAction extends Action {
    protected DetailedResults resultsView

    new(DetailedResults view, String name, String iconPath) {
        super(name, ResourceManager.getPluginImageDescriptor("ch.hilbri.assist.mapping", iconPath))
        this.resultsView = view
    }
}

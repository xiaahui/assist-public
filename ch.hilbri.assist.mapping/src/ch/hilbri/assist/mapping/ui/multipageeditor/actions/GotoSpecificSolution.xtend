package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage
import ch.hilbri.assist.mapping.ui.multipageeditor.GotoSolutionDialog
import org.eclipse.jface.window.Window

/**
 * Goes to a specific result - a dialog is opened to ask the user about the number of
 * the desired solution
 */
class GotoSpecificSolution extends AbstractResultsPageAction {

    new(DetailedResultsPage resultsView) {
        super(resultsView, "Goto Solution", "icons/goto_input.png")
    }

    override run() {
        val dlg = new GotoSolutionDialog(resultsView.display.activeShell, resultsView.curResultIndex + 1)
        if (dlg.open() == Window.OK)
            resultsView.showResult(dlg.getGotoSolutionIdx)

    }
}

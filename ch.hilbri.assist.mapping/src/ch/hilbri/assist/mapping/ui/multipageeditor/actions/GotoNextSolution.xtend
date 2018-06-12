package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage

/**
 * Goes to the next solution
 */
class GotoNextSolution extends AbstractResultsPageAction {
    new(DetailedResultsPage resultsView) {
        super(resultsView, "Next Solution", "icons/result_next.gif")
    }

    override run() {
        if ((resultsView.curResultIndex + 1) < resultsView.mappingResults.size)
            resultsView.showResult(resultsView.curResultIndex + 1)
    }
}

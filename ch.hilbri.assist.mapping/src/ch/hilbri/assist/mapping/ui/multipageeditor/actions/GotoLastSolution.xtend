package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage

/**
 * Goes to the last solution of the available data set
 */
class GotoLastSolution extends AbstractResultsPageAction {

    new(DetailedResultsPage resultsView) {
        super(resultsView, "Last Solution", "icons/last_result.png")
    }

    override run() {
        resultsView.showResult(resultsView.mappingResults.size - 1)
    }
}

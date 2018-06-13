package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

/**
 * Goes to the last solution of the available data set
 */
class GotoLastSolution extends AbstractResultsPageAction {

    new(DetailedResults resultsView) {
        super(resultsView, "Last Solution", "icons/last_result.png")
    }

    override run() {
        resultsView.showResult(resultsView.getMappingResults.size - 1)
    }
}

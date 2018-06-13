package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

class SortSolutionsByScore extends AbstractResultsPageAction {

    new(DetailedResults resultsView) {
        super(resultsView, "Sort Solutions by Score", "icons/results_sort_score.png")
    }

    override run() {
        // We want decending sort order
        val sortedResults = resultsView.getMappingResults.sortBy[-scaledTotalScore]
        resultsView.resultsList = sortedResults
    }
}

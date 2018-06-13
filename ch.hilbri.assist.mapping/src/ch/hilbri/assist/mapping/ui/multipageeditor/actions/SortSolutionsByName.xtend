package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

class SortSolutionsByName extends AbstractResultsPageAction {
    
    new(DetailedResults resultsView) {
        super(resultsView, "Sort Solutions by Name", "icons/results_sort_id.png")
    }

    override run() {
        val sortedResults = resultsView.getMappingResults.sortBy[index]
        resultsView.resultsList = sortedResults
    }
}

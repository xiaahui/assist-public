package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage

class SortSolutionsByName extends AbstractResultsPageAction {
    
    new(DetailedResultsPage resultsView) {
        super(resultsView, "Sort Solutions by Name", "icons/results_sort_id.png")
    }

    override run() {
        val sortedResults = resultsView.mappingResults.sortBy[index]
        resultsView.resultsList = sortedResults
    }
}

package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

/**
 * Goes to the next solution
 */
class GotoNextSolution extends AbstractResultsPageAction {
    new(DetailedResults resultsView) {
        super(resultsView, "Next Solution", "icons/result_next.gif")
    }

    override run() {
        if ((resultsView.getCurResultIndex + 1) < resultsView.getMappingResults.size)
            resultsView.showResult(resultsView.getCurResultIndex + 1)
    }
}

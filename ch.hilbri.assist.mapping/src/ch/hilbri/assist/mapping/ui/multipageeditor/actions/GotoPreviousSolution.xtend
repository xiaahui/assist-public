package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResultsPage

/**
 * Goes to the previous result in the view - if there are any results
 */
class GotoPreviousSolution extends AbstractResultsPageAction {

    new(DetailedResultsPage resultsView) {
        super(resultsView, "Previous Solution", "icons/result_prev.gif")
    }

    override run() {
        if (resultsView.curResultIndex > 0)
            resultsView.showResult(resultsView.curResultIndex - 1)
    }

}

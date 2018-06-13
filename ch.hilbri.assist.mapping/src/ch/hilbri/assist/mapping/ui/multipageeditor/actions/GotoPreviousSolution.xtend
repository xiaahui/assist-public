package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

/**
 * Goes to the previous result in the view - if there are any results
 */
class GotoPreviousSolution extends AbstractResultsPageAction {

    new(DetailedResults resultsView) {
        super(resultsView, "Previous Solution", "icons/result_prev.gif")
    }

    override run() {
        if (resultsView.getCurResultIndex > 0)
            resultsView.showResult(resultsView.getCurResultIndex - 1)
    }

}

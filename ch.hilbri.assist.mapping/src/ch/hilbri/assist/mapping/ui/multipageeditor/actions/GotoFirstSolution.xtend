package ch.hilbri.assist.mapping.ui.multipageeditor.actions

import ch.hilbri.assist.mapping.ui.multipageeditor.DetailedResults

/**
 * Moves the view to the first solution
 * 
 */
class GotoFirstSolution extends AbstractResultsPageAction {
   
    new(DetailedResults resultsView) {
        super(resultsView, "First Solution", "icons/first_result.png")
    }

    override run() {
        resultsView.showResult(0);
    }
}

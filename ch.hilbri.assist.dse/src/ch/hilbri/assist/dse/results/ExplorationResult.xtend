package ch.hilbri.assist.dse.results

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ExplorationCandidate
import org.eclipse.xtend.lib.annotations.Accessors

class ExplorationResult {
    @Accessors ExplorationCandidate candidate
    @Accessors AssistModel model
    @Accessors boolean isFeasible
    @Accessors Double absoluteScore
    @Accessors Double scaledScore
}

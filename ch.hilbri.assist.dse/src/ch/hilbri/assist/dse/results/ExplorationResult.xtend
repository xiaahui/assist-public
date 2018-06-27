package ch.hilbri.assist.dse.results

import ch.hilbri.assist.model.AssistModel
import org.eclipse.xtend.lib.annotations.Data
import ch.hilbri.assist.model.ExplorationCandidate

@Data class ExplorationResult {
    ExplorationCandidate candidate
    AssistModel model
    boolean isFeasible
}

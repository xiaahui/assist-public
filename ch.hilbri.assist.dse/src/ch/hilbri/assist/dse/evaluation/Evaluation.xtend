package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.model.AssistModel
import org.eclipse.emf.ecore.util.EcoreUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.mapping.solver.AssistMappingSolver

class Evaluation {

    private Logger logger = LoggerFactory.getLogger(this.class)
    private AssistModel assistModel

    new(AssistModel input) {

        logger.info('''************************************************''')
        logger.info('''        ASSIST Design Space Exploration''')
        logger.info('''************************************************''')

        assistModel = input
    }

    def run() {
        logger.info('''Running''')

        /* Go through all exploration candidates */
        for (i : 0 ..< assistModel.explorationCandidates.size) {
            val explorationCandidateModel = EcoreUtil.copy(assistModel)
            val candidate = explorationCandidateModel.explorationCandidates.get(i)
            logger.info('''Exploring Candidate «candidate.name»''')

            /* Remove the variance points in the hardware architecture, which are not needed */
            for (box : explorationCandidateModel.allBoxes) {
                for (boardAlternative : box.boardAlternatives) {
                    for (alternative : boardAlternative.alternatives) {
                        if (candidate.boardAlternatives.contains(alternative)) {
                            // The candidate wants these boards 
                            box.boards.addAll(alternative.boards)
                        }
                    }
                }
                box.boardAlternatives.clear
            }

            /* Software Architecture */
            /* Restrictions */
            /* Some sanity checks before continuing */
            if (!explorationCandidateModel.allBoxes.map[boardAlternatives].flatten.isEmpty)
                logger.info('''There seem to be some hardware variance points still in the model''')

            logger.info('''Checking mapping feasibility''')

            
            val mappingSolver = new AssistMappingSolver(explorationCandidateModel, false)
            try {
                mappingSolver.runInitialization
                mappingSolver.solverMaxSolutions = 1
                mappingSolver.runConstraintGeneration
                mappingSolver.runSolutionSearch
                mappingSolver.createSolutions
            } catch (Exception e) {
            }
            
            
            if (mappingSolver.results !== null && mappingSolver.results.size > 0)
                logger.info('''Candidate «candidate.name» seems feasible''')
            else
                logger.info('''Candidate «candidate.name» seems NOT feasible''')

        }
    }
}

package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.dse.results.ExplorationResult
import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.model.AssistModel
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.LoggerContext
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Evaluation {

    AssistModel assistModel
    Logger logger = LoggerFactory.getLogger(this.class)
    @Accessors(PUBLIC_GETTER) List<ExplorationResult> explorationResults = newArrayList()

    new(AssistModel input) {

        logger.info('''************************************************''')
        logger.info('''        ASSIST Design Space Exploration''')
        logger.info('''************************************************''')

        assistModel = input
    }

    def run() {

        /* Go through all exploration candidates */
        for (i : 0 ..< assistModel.explorationCandidates.size) {
            val explorationCandidateModel = EcoreUtil.copy(assistModel)
            val candidate = explorationCandidateModel.explorationCandidates.get(i)
            logger.info('''Exploring Candidate "«candidate.name»"''')

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

            logger.info('''  - Checking mapping feasibility''')

            /* We do not want see all the output from the mapping, so we mute it */
            val loggerContext = LoggerFactory.getILoggerFactory() as LoggerContext
            val mappingLogger = loggerContext.getLogger("ch.hilbri.assist.mapping")
            mappingLogger.setLevel(Level.OFF)
            
            val mappingSolver = new AssistMappingSolver(explorationCandidateModel)
            try {
                mappingSolver.runInitialization
                mappingSolver.solverMaxSolutions = 1
                mappingSolver.runConstraintGeneration
                mappingSolver.runSolutionSearch
                mappingSolver.createSolutions
            } catch (Exception e) {
                e.printStackTrace
            }

            /* Of course, we have to re-enable the logging output from the mapping part */
            mappingLogger.setLevel(Level.DEBUG)
            
            if (mappingSolver.results !== null && mappingSolver.results.size > 0) {
                logger.info('''Candidate "«candidate.name»" seems feasible''')
                explorationResults.add(new ExplorationResult(candidate, explorationCandidateModel, true))    
            }
            else {
                logger.info('''Candidate "«candidate.name»" seems NOT feasible''')
                explorationResults.add(new ExplorationResult(candidate, explorationCandidateModel, false))
            }
        }
    }
}

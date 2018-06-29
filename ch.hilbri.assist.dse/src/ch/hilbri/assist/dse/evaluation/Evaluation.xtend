package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.dse.results.ExplorationResult
import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
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
            logger.info(''' - Preparing hardware model (removing alternatives)''')
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

            /* Remove the variance points in the software architecture, which are not needed in the current candidate */
            logger.info(''' - Preparing software model (removing alternatives)''')
            for (applicationAlternative : explorationCandidateModel.applicationAlternatives) {
            	for (alternative : applicationAlternative.alternatives) {
            		if (candidate.applicationAlternatives.contains(alternative)) {
            			// The candidate wants these applications
            			explorationCandidateModel.applications.addAll(alternative.applications)
            		}
            	}
            }
            explorationCandidateModel.applicationAlternatives.clear
            
			/* Remove the variance points in the restrictions */
			logger.info(''' - Preparing the restrictions model (removing alternatives)''')
			for (restrictionAlternative : explorationCandidateModel.restrictionAlternatives) {
				for (alternative : restrictionAlternative.alternatives) {
					if (candidate.restrictionAlternatives.contains(alternative)) {
						// The candidate wants these restrictions 
						explorationCandidateModel.colocalityRelations.addAll(alternative.colocalityRelations)
						explorationCandidateModel.dislocalityRelations.addAll(alternative.dislocalityRelations)
						explorationCandidateModel.dissimilarityRelations.addAll(alternative.dissimilarityRelations)	
					}
				}
			}
			explorationCandidateModel.restrictionAlternatives.clear

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
            } catch (BasicConstraintsException e) {
                logger.info('''  - Mapping failed (conflicting constraint "«e.constraintName»")''')
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

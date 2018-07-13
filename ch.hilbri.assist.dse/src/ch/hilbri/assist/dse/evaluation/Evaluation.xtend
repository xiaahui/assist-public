package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.dse.results.ExplorationResult
import ch.hilbri.assist.dse.ui.handlers.EvalDesignSpace
import ch.hilbri.assist.dse.ui.handlers.EvalDesignSpace.Mode
import ch.hilbri.assist.mapping.solver.AssistMappingSolver
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.model.AbstractDSEMetric
import ch.hilbri.assist.model.AssistModel
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.LoggerContext
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.dse.analysis.CandidateScoring

class Evaluation {

	/** The model without variance points that is used for the evaluation */
	AssistModel assistModel

	/** Do we just need a feasibility check or scoring also? */
	Mode mode

	/** In case we want scoring, which metric should we apply? */
	AbstractDSEMetric scoringMetric

	/** Results from the exploration */
	@Accessors(PUBLIC_GETTER) List<ExplorationResult> explorationResults = newArrayList()

	/** Generic logger */
	Logger logger = LoggerFactory.getLogger(this.class)

	/** Simple constructor without any metric */
	new(AssistModel input, Mode mode) {
		this(input, mode, null)
	}

	/** Advanced constructor with a scoring metric */
	new(AssistModel input, Mode mode, AbstractDSEMetric metric) {
		logger.info('''************************************************''')
		logger.info('''        ASSIST Design Space Exploration''')
		logger.info('''************************************************''')
		this.assistModel = input
		this.mode = mode
		this.scoringMetric = metric
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

			/* Remove the exploration candidates from the model */
			logger.info(''' - Preparing the list of exploration candidates (removing all candidates)''')
			explorationCandidateModel.explorationCandidates.clear

			/* Now we have a pristine model */
			logger.info(''' - Checking mapping feasibility''')

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
				logger.info(''' - Mapping failed (conflicting constraint "«e.constraintName»")''')
			}

			/* Of course, we have to re-enable the logging output from the mapping part */
			mappingLogger.setLevel(Level.DEBUG)

			/* Create a new result which contains the info if feasible or not */
			val explorationResult = new ExplorationResult => [
				it.candidate = candidate
				it.model = explorationCandidateModel
				it.isFeasible = (mappingSolver.results !== null && mappingSolver.results.size > 0)
			]

			explorationResults.add(explorationResult)
			logger.info('''Candidate "«candidate.name»" seems «IF !explorationResult.feasible»NOT «ENDIF»feasible''')
		
		} /* End of loop for all exploration candidates */

		/* We may also want a scoring of the results */
		if (mode == EvalDesignSpace.Mode.FEASIBILITY_AND_SCORING && scoringMetric !== null) {
			logger.info('''Scoring all results with metric "«scoringMetric.name»"''')
			CandidateScoring.evaluateCandidate(explorationResults, scoringMetric)
		}
	}
}

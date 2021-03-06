package ch.hilbri.assist.dse.analysis.metrics.builtin;
import java.util.Random;

import ch.hilbri.assist.model.ExplorationResult;
import ch.hilbri.assist.model.impl.AbstractDSEMetricImpl;

public class RandomScore extends AbstractDSEMetricImpl {

	public RandomScore() {
		setName("Random Score");
		setBuiltIn(true);
		setHigherScoreIsBetter(true);
	}

	/* Computes a random score between 1 and 10 */
	@Override
	public double computeAbsoluteScore(ExplorationResult result) {
		Random random = new Random();
		
		int score = random.nextInt(10)+1;
		return score;
	}

}

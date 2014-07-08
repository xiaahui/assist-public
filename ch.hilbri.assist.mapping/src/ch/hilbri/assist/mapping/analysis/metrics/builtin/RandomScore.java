package ch.hilbri.assist.mapping.analysis.metrics.builtin;
import java.util.Random;

import ch.hilbri.assist.result.mapping.Result;
import ch.hilbri.assist.result.mapping.impl.AbstractMetricImpl;

public class RandomScore extends AbstractMetricImpl {

	public RandomScore(int weight) {
		setName("Random Score");
		setWeight(weight);
		setBuiltIn(true);
		setHigherScoreIsBetter(true);
	}

	/* Computes a random score between 1 and 10 */
	@Override
	public double computeScore(Result result) {
		Random random = new Random();
		
		int score = random.nextInt(10)+1;
		return score;
	}

}

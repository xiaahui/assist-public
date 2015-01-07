package ch.hilbri.assist.mapping.analysis.metrics.builtin;

import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Processor;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl;

public class MaxFreeCoreCapacity extends AbstractMetricImpl {

	public MaxFreeCoreCapacity() {
		setName("Max free Core Capacity");
		setBuiltIn(true);
		setHigherScoreIsBetter(true);
	}

	@Override
	public double computeAbsoluteScore(Result result) {

		double unusedCores = 0;
		double maxRemainingCoreCapacity = 0;
		for (Core core : result.getAllCores()) {
			if (core.isNotUsed()) unusedCores++;
			else if (core.getRemainingRelativeCapacity() > maxRemainingCoreCapacity)
					maxRemainingCoreCapacity = core.getRemainingRelativeCapacity();
		}
		
		double unusedProcs = 0;
		for (Processor proc : result.getAllProcessors())
			if (proc.isNotUsed()) unusedProcs++;
		
		double unusedBoards = 0;
		for (Board board : result.getAllBoards())
			if (board.isNotUsed()) unusedBoards++;
		
		
		unusedCores /= result.getAllCores().size();
		unusedProcs /= result.getAllProcessors().size();
		unusedBoards /= result.getAllBoards().size();
		return  maxRemainingCoreCapacity
				+ unusedCores
				+ unusedProcs * result.getAllCores().size()
				+ unusedBoards * result.getAllProcessors().size() * result.getAllCores().size();

		
	}
}

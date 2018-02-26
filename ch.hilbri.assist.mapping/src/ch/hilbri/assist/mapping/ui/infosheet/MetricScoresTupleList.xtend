package ch.hilbri.assist.mapping.ui.infosheet

import ch.hilbri.assist.model.AbstractMetric
import java.util.ArrayList
import org.eclipse.emf.common.util.EMap

class MetricScoresTupleList extends ArrayList<MetricScoresTuple> {

	new(EMap<AbstractMetric, Double> absoluteScoresMap, EMap<AbstractMetric, Double> scaledScoresMap) {
		for (m : absoluteScoresMap.keySet) 
			add(new MetricScoresTuple(m, absoluteScoresMap.get(m), scaledScoresMap.get(m)))
	}
}

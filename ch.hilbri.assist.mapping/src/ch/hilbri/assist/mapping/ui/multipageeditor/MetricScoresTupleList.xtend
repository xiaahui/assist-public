package ch.hilbri.assist.mapping.ui.multipageeditor

import java.util.ArrayList
import org.eclipse.emf.common.util.EMap
import ch.hilbri.assist.model.AbstractMappingMetric

class MetricScoresTupleList extends ArrayList<MetricScoresTuple> {

	new(EMap<AbstractMappingMetric, Double> absoluteScoresMap, EMap<AbstractMappingMetric, Double> scaledScoresMap) {
		for (m : absoluteScoresMap.keySet) 
			add(new MetricScoresTuple(m, absoluteScoresMap.get(m), scaledScoresMap.get(m)))
	}
}

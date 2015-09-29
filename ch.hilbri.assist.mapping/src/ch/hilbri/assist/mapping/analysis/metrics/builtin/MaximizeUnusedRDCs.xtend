package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl

class MaximizeUnusedRDCs extends AbstractMetricImpl {
	new() {
		builtIn = true
		higherScoreIsBetter = true
		name = "Maximize unused RDCs"
	}
	
	override computeAbsoluteScore(Result result) {
 
		val score = result.model.RDCs.map[
											it.connectors
												.map[result.getAllMappedEqInterfaces(it).length]
								 				.reduce[p1, p2|p1+p2] // gets the sum of all interfaces per RDC
				]
				.filter[it == 0] // how many rdcs have 0 interfaces
				.size
		
		return score
		
	}
}
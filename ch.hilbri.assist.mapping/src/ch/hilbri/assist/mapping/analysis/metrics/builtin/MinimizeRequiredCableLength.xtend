package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl

class MinimizeRequiredCableLength extends AbstractMetricImpl {
	new() {
		builtIn = true
		higherScoreIsBetter = false
		name = "Minimize required cable length"
	}
	
	override computeAbsoluteScore(Result result) {
		
		var sum = 0
		
//		FIXME: for (rdc : result.model.RDCs) {
//		
//			val allMappedInterfacesForRDC = rdc.connectors
//													.map[result.getAllMappedEqInterfacesForConnector(it)]
//													.flatten
//			
//			if (!allMappedInterfacesForRDC.isNullOrEmpty) {
//				val cableLengthForRDC = allMappedInterfacesForRDC
//											.map[Math.abs(it.resourceX - rdc.resourceX) +
//											     Math.abs(it.resourceY - rdc.resourceY) +
//												 Math.abs(it.resourceZ - rdc.resourceZ)]
//											.reduce[p1, p2|p1+p2]
//			
//				sum += cableLengthForRDC
//			
//			}
//		}
		
		return sum
	} 
}
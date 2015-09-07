package ch.hilbri.assist.mapping.analysis.metrics.builtin

import ch.hilbri.assist.datamodel.result.mapping.Result
import ch.hilbri.assist.datamodel.result.mapping.impl.AbstractMetricImpl

class MinimizeRequiredCableWeight extends AbstractMetricImpl {
		new() {
		builtIn = true
		higherScoreIsBetter = false
		name = "Minimize required cable weight"
	}
	
	override computeAbsoluteScore(Result result) {
		
		var double sum = 0
		
		for (rdc : result.model.allRDCs) {
		
			// Welche Interfaces landen auf diesem RDC?
			val allMappedInterfacesForRDC = rdc.connectors
													.map[result.getAllMappedEqInterfacesForConnector(it)]
													.flatten
			
			if (!allMappedInterfacesForRDC.isNullOrEmpty) {
				
				// Bestimme die Summe der Kabelgewichte für alle Interfaces auf diesem RDC
				val weightedCableLengthForRDC = allMappedInterfacesForRDC
											.map[
												(Math.abs(it.resourceX - rdc.resourceX) +  // Bestimme die Länge
											     Math.abs(it.resourceY - rdc.resourceY) +
												 Math.abs(it.resourceZ - rdc.resourceZ))
												 
												 *
																		 
												 result.model.cableWeightData.getCableWeight(it.ioType)		// Skaliere die Länge mit dem Gewicht
												 															// dieses Interfaces
											]
											.reduce[p1, p2|p1+p2]
			
				sum += weightedCableLengthForRDC
			}
		}
			
		return sum
	}
}
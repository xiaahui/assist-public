package ch.hilbri.assist.datamodel

import ch.hilbri.assist.result.ResultFactory

class ResultTestClass {
	
	 def static void main(String[] args) {
	
		val f = ResultFactory.eINSTANCE
	
		val resultModel = f.createResult
	
		val c = f.createBoard
		
		resultModel.rootHardwareElements.add(c)
		
		System.out.println(resultModel.topHardwareLevel)
	
	}
}
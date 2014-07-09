package ch.hilbri.assist.datamodel


class ResultTestClass {
	
	 def static void main(String[] args) {
	
	/* 	val f = ResultFactory.eINSTANCE
	
		val resultModel = f.createResult
	
		val c = f.createBoard
		
		resultModel.rootHardwareElements.add(c)
		
		System.out.println(resultModel.topHardwareLevel) */
		
		System.out.println({1..5}.reduce[i1, i2 | i1 + i2]) 
	}
}
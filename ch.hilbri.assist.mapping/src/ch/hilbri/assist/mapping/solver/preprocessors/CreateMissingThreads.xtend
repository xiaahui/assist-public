package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.impl.ModelFactoryImpl

class CreateMissingThreads extends AbstractModelPreprocessor {
	
	new(AssistModel model) {
		super(model, "missing threads")
	}
	
	override execute() {
		val f = ModelFactoryImpl.eINSTANCE;
		
		for (a : model.getApplications()) {
			for (i : 1..a.parallelThreads) {
				val t = f.createThread()
				a.threads.add(t)
				t.application = a
			}
		}
		
		return true
	}
}
	
	
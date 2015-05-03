package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import org.slf4j.Logger
import org.slf4j.LoggerFactory

abstract class AbstractModelPreprocessor {
	
	protected AssistModel model
	protected Logger logger
	public String name
	
	new(AssistModel model, String name) {
		this.model = model
		this.logger = LoggerFactory.getLogger(this.class)
		this.name = name
	}
	
	abstract def boolean execute() 
}
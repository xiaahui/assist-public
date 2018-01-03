package ch.hilbri.assist.mapping.solver.preprocessors

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import ch.hilbri.assist.mapping.model.AssistModelMapping

abstract class AbstractModelPreprocessor {
	
	protected AssistModelMapping model
	protected Logger logger
	public String name
	
	new(AssistModelMapping model, String name) {
		this.model = model
		this.logger = LoggerFactory.getLogger(this.class)
		this.name = name
	}
	
	abstract def boolean execute() 
}
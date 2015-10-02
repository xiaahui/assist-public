package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel

class ModelShortcutBuilder extends AbstractModelPreprocessor {
	new (AssistModel model) { super(model, "model shortcut builder") }
	
	override execute() {
		
		// The order of shortcut creation matters - do not mix them freely around!
		
		logger.info("    . Creating shortcuts for global.compartments")
		model.compartments.addAll(model.compartmentsBlock.compartments)
		
		logger.info("    . Creating shortcuts for global.rdcs")
		model.rdcs.addAll(model.compartments.map[rdcs].flatten)
		
		logger.info("    . Creating shortcuts for global.connectors")
		model.connectors.addAll(model.rdcs.map[connectors].flatten)
		
		logger.info("    . Creating shortcuts for global.pins")
		model.pins.addAll(model.connectors.map[pins].flatten)
		
		logger.info("    . Creating shortcuts for rdc.pins")
		for (r : model.rdcs) 
			r.pins.addAll(r.connectors.map[pins].flatten)
		
		logger.info("    . Creating shortcuts for compartment.pins")
		for (c : model.compartments)
			c.pins.addAll(c.rdcs.map[pins].flatten)
		
		return true
	}
}
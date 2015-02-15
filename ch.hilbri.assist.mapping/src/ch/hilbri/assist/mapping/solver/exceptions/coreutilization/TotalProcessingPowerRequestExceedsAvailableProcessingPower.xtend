package ch.hilbri.assist.mapping.solver.exceptions.coreutilization

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class TotalProcessingPowerRequestExceedsAvailableProcessingPower extends BasicConstraintsException {
	
	new(AbstractMappingConstraint constraint) {
		super(constraint)
	}

	override def String getExplanation() { 
		'''The total processing power offered by all cores in the system is not sufficient for the demand of all applications.'''
	} 	
}
package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class RestrictValidDeployment extends BasicConstraintsException {
	private String interfaces
	private String hardwareElements
	
	new(AbstractMappingConstraint constraint, String interfaces, String hardwareElements) {
		super(constraint)
		this.interfaces = interfaces
		this.hardwareElements = hardwareElements
	}
	
	override def String getExplanation() {
		'''The deployment of the groups/interfaces [«interfaces»] could not be restricted to the following (valid) hardware elements: «hardwareElements».'''
	}
}
package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class RestrictInvalidDeployment extends BasicConstraintsException {
	private String interfaces
	private String hardwareElements
	
	new(AbstractMappingConstraint constraint, String interfaces, String hardwareElements) {
		super(constraint)
		this.interfaces = interfaces
		this.hardwareElements = hardwareElements
	}
	
	override def String getExplanation() {
		'''The hardware elements  «hardwareElements» could not be marked as invalid for the deployment of the groups/interfaces [«interfaces»].'''
	}
}
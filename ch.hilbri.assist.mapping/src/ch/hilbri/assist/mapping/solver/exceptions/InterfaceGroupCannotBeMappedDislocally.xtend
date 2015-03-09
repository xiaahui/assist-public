package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InterfaceGroupCannotBeMappedDislocally extends BasicConstraintsException {
	
	private String groupName
	
	new(AbstractMappingConstraint constraint, String groupName) {
		super(constraint)
		this.groupName = groupName
	}
	
	override def String getExplanation() {
		'''The group «groupName» could not be mapped dislocally.'''
	}
	
}
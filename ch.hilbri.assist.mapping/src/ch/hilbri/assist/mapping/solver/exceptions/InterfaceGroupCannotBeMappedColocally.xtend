package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InterfaceGroupCannotBeMappedColocally extends BasicConstraintsException {
	private String groupName
	private String hardwareLevel
	
	new(AbstractMappingConstraint constraint, String groupName, String hardwareLevel) {
		super(constraint)
		this.groupName = groupName
		this.hardwareLevel = hardwareLevel
	}
	
	override def String getExplanation() {
		'''The following groups and/or interfaces could not be mapped on the same «hardwareLevel»: "«groupName»"'''
	}
}
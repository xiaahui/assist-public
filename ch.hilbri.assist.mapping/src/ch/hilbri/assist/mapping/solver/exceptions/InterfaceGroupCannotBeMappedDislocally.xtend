package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup

class InterfaceGroupCannotBeMappedDislocally extends BasicConstraintsException {
	
	private EqInterfaceGroup group
	
	new(AbstractMappingConstraint constraint, EqInterfaceGroup group) {
		super(constraint)
		this.group = group
	}
	
	override def String getExplanation() {
		'''The group «group.name» could not be mapped dislocally.'''
	}
	
}
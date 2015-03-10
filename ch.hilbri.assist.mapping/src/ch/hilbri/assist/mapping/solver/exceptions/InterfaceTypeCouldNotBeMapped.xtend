package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InterfaceTypeCouldNotBeMapped extends BasicConstraintsException {
	
	private String ifaceType
	
	new(AbstractMappingConstraint constraint, String ifaceType) {
		super(constraint)
		this.ifaceType = ifaceType
	}
	
	override def String getExplanation()	{
		'''The interfaces of type "«ifaceType»" could not be mapped.'''
		
	}
}
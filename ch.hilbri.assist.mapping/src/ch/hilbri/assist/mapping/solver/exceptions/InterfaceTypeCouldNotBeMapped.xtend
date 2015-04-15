package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InterfaceTypeCouldNotBeMapped extends BasicConstraintsException {
	
	private String ifaceType
	private String connName
	
	new(AbstractMappingConstraint constraint, String ifaceType) {
		super(constraint)
		this.ifaceType = ifaceType
		this.connName = connName	
	
	}
	
	override def String getExplanation()	{
		'''The interfaces of type "«ifaceType»" could not be mapped to any connector.'''
		
	}
}
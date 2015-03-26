package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InterfaceTypeDemandExceedsSupply extends BasicConstraintsException {
	private String ifaceType
	private int totalDemand
	private int totalSupply
	
	new(AbstractMappingConstraint constraint, String ifaceType, int totalDemand, int totalSupply) {
		super(constraint)
		this.ifaceType = ifaceType
		this.totalDemand = totalDemand
		this.totalSupply = totalSupply	
	
	}
	
	override def String getExplanation()	{
		'''There are not enough interfaces of type "«ifaceType»". The total demand is «totalDemand», but there are only «totalSupply» interfaces of this type available.'''
		
	}
}
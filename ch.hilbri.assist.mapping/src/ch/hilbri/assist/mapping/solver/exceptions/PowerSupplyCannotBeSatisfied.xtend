package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class PowerSupplyCannotBeSatisfied extends BasicConstraintsException {
	
	private String iface
	private String powerSupply
	
	new(AbstractMappingConstraint constraint, String iface, String powerSupply) {
		super(constraint)
		this.iface = iface
		this.powerSupply = powerSupply	
	}
	
	override def String getExplanation()	{
		'''The interface "«iface»" with power supply requirement «powerSupply» could not be mapped.'''
	}
}
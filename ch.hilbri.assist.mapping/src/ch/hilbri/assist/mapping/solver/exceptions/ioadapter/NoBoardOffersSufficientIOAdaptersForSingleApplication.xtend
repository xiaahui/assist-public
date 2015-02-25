package ch.hilbri.assist.mapping.solver.exceptions.ioadapter

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterType
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class NoBoardOffersSufficientIOAdaptersForSingleApplication extends BasicConstraintsException {
	private Application application
	private IOAdapterType adapterType
	private IOAdapterProtectionLevelType protectionLevel
	private int reqAdapterCount
	
	new(AbstractMappingConstraint constraint, Application application, IOAdapterType adapterType, IOAdapterProtectionLevelType protectionLevel, int reqAdapterCount) {
		super(constraint)
		this.application = application
		this.adapterType = adapterType
		this.protectionLevel = protectionLevel
		this.reqAdapterCount = reqAdapterCount	
	}
	
	override def String getExplanation() { 
		'''The application «application» could not be mapped to any board. There is no board which offers at least «reqAdapterCount» adapters of type «adapterType» and i/o protection «protectionLevel» (or higher).'''
	}
}
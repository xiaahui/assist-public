package ch.hilbri.assist.mapping.solver.exceptions.ioadapter

import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType
import ch.hilbri.assist.datamodel.model.IOAdapterType
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class SingleBoardDoesNotOfferSufficientIOAdaptersForMultipleApplications extends BasicConstraintsException {
	
	private Board board
	private IOAdapterType adapterType
	private IOAdapterProtectionLevelType protectionLevel
	
	new(AbstractMappingConstraint constraint, Board board, IOAdapterType adapterType, IOAdapterProtectionLevelType protectionLevel) {
		super(constraint)
		this.board = board
		this.adapterType = adapterType
		this.protectionLevel = protectionLevel
	}
	
	override def String getExplanation() { 
		'''Board «board.name» does not have enough adapters of type «adapterType» and minimum i/o protection «protectionLevel» for all its applications.'''
	}
	
}
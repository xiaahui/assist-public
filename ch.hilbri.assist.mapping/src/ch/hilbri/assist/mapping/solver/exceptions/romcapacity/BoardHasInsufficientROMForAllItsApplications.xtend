package ch.hilbri.assist.mapping.solver.exceptions.romcapacity

import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class BoardHasInsufficientROMForAllItsApplications extends BasicConstraintsException {
	private Board board
	
	new(AbstractMappingConstraint constraint, Board board) {
		super(constraint)
		this.board = board
	}
	
	override def String getExplanation() { 
		'''Board «board.name» does not have enough ROM for all its applications.'''
	}
}
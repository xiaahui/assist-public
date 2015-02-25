package ch.hilbri.assist.mapping.solver.exceptions.ramcapacity

import ch.hilbri.assist.datamodel.model.Board
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class BoardHasInsufficientRAMForAllItsApplications extends BasicConstraintsException {
	
	private Board board
	
	new(AbstractMappingConstraint constraint, Board board) {
		super(constraint)
		this.board = board
	}
	
	override def String getExplanation() { 
		'''Board «board.name» does not have enough RAM for all its applications.'''
	}
}
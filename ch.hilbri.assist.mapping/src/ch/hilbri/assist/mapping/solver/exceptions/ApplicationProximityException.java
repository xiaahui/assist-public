package ch.hilbri.assist.mapping.solver.exceptions;

import ch.hilbri.assist.datamodel.model.ProximityRelation;

public class ApplicationProximityException extends BasicConstraintsException {

	private static final long serialVersionUID = -1516589208663369771L;
	
	private ProximityRelation relation;
	
	public ApplicationProximityException(String constraintName, ProximityRelation relation) {
		super(constraintName);
		this.relation = relation;
	}
	
	public ProximityRelation getRelation() {
		return relation;
	}

}

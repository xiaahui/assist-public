package ch.hilbri.assist.mapping.solver;

public enum SearchType {
	/**
	 * sucht "hintereiander" liegende Loesungen
	 * (Vorteil: Es kann eindeutig bestimmt werden, ob alle moeglichen Loesungen gefunden wurden)
	 */
	CONSECUTIVE,
	/** 
	 * sucht zufaellig im gesamten Loesungsraum
	 * (Vorteil: Loesungen stammen aus allen Teilen des Loesungsraums)
	 */
	RANDOM;
}

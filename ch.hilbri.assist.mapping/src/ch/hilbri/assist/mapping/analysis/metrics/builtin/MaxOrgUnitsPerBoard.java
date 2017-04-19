package ch.hilbri.assist.mapping.analysis.metrics.builtin;

import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl;

/**
 * 
 * Dies ist eine Metric, die verschiedene raeumliche Verteilungen bewertet.
 * Grundlage fuer die Bewertung ist die Anzahl der verschiedenen
 * Organisationseinheiten, deren Softwarekomponenten auf das Board verteilt
 * werden. Rueckgabewert ist das Maximum der Anzahl von verschiedenen Org-Units
 * von allen Boards im System. Je weniger, Org-Units auf einem Board sind, umso
 * besser ist es, da dann weniger Integrationsprobleme auftreten werden.
 * 
 * @author rhi
 * 
 */
public class MaxOrgUnitsPerBoard extends AbstractMetricImpl {

	public MaxOrgUnitsPerBoard() {
		setName("MaxOrgUnitsPerBoard");
		setBuiltIn(true);
		setHigherScoreIsBetter(false);
 	}

	@Override
	public double computeAbsoluteScore(Result result) {
		
		double maxOrgCount = 0;
		
		/* Gehe durch jedes Board */
//		for (Board board : result.getAllBoards()) {
//				
//			/* Diese Liste enthaelt die Bezeichnungen 
//			 * aller OrgUnits fuer das aktuelle Board */
//			ArrayList<String> orgUnits = new ArrayList<String>();
//			
//			/* Gehe durch all Applications auf diesm Board */
//			for (Application app : board.getAllApplications()) {
//				String orgUnit = app.getDevelopedBy();
//				
//				/* Falls die Liste noch nicht die Org.-Einheit der App
//				 * enthaelt, dann hinzufuegen */
//				if (!orgUnits.contains(orgUnit)) orgUnits.add(orgUnit);
//			}
//			
//			/* Wir sind durch alle Prozessoren und Kerne auf dem Board durch;
//			 * orgUnits enthaelt nun die Menge von allen OrgUnits.
//			 * Nun muss nur noch das Maximum entsprechend gesetzt bzw. erhoeht werden.
//			 */
//			if ( maxOrgCount < orgUnits.size() ) maxOrgCount = orgUnits.size();
//		}
	
		return maxOrgCount;
	}

}

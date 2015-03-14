package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

import java.util.Comparator;

import ch.hilbri.assist.datamodel.model.EqInterface;

public class EqInterfaceComparator implements Comparator<EqInterface> {

	@Override
	public int compare(EqInterface arg0, EqInterface arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}

}

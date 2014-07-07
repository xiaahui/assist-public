package ch.hilbri.assist.mapping.ui.multipageeditor.treeview;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.draw2d.SWTEventDispatcher;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;

/**
 * Diese Klasse dient nur dazu, einen Graph-Typen zu erstellen
 * bei dem die Knoten nicht bewegt werden können.
 * 
 * @see http://www.vogella.de/articles/EclipseZest/article.html#zestfirst
 * @author hilrob
 *
 */

public class NonMovableGraph extends Graph {
	public NonMovableGraph(Composite parent, int style) {
		super(parent, style);
		this.getLightweightSystem().setEventDispatcher(
				new SWTEventDispatcher() {
					public void dispatchMouseMoved(org.eclipse.swt.events.MouseEvent me) {
								// 	Doing nothing
					}
				});
	}
	
	public void clear() {

		// remove all the connections
		Object[] objects = getConnections().toArray();

		for ( int x = 0 ; x < objects.length ; x++ ) {
			((GraphConnection) objects[x]).dispose() ;
		}

		// remove all the nodes
		objects = getNodes().toArray() ;

		for ( int x = 0 ; x < objects.length ; x++ ) {
			((GraphNode) objects[x]).dispose();
		}

	}

}

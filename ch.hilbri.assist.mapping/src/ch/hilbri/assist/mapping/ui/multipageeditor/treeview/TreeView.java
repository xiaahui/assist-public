/**
 * ResultsView
 * 
 * Diese View stellt das Ergebnis eines Mapping Vorgangs graphisch dar 
 * und implementiert zu diesem Zweck eine View.
 * 
 * @author hilrob
 * 
 */
package ch.hilbri.assist.mapping.ui.multipageeditor.treeview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Box;
import ch.hilbri.assist.datamodel.result.mapping.Compartment;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.HardwareElement;
import ch.hilbri.assist.datamodel.result.mapping.Processor;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.datamodel.result.mapping.Thread;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;



/**
 * @author hilrob 
 */
public class TreeView extends ViewPart {

	private NonMovableGraph graph;
	private Slider slider;
	private Text currentSolutionText;
	private Text currentSolutionScore;
	private GridData gridData_1;
	
	private DetailedResultsViewUiModel detailedResultsViewUiModel;

	public TreeView(DetailedResultsViewUiModel detailedResultsViewUiModel) {
		this.detailedResultsViewUiModel = detailedResultsViewUiModel;
	}

	
	/** 
	 * Creates the view and adds the necessary UI components
	 *  
	 */
	@Override
	public void createPartControl(Composite parent) {
		
		parent.setLayout(new GridLayout(2, false));
		
		Label currentSolutionLabel = new Label(parent, SWT.NONE);
		currentSolutionLabel.setText("Solution:");
		currentSolutionText = new Text(parent, SWT.BORDER);
		GridData gd_currentSolutionText = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_currentSolutionText.widthHint = 481;
		currentSolutionText.setLayoutData(gd_currentSolutionText);
		
		Label currentSolutionScoreLabel = new Label(parent, SWT.NONE);
		currentSolutionScoreLabel.setText("Score:");
		currentSolutionScore = new Text(parent, SWT.BORDER);
		GridData gd_currentSolutionScore = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_currentSolutionScore.widthHint = 505;
		currentSolutionScore.setLayoutData(gd_currentSolutionScore);
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		
		//currentSolutionText.setLayoutData(gridData);
		currentSolutionText.setText("n/a");
		currentSolutionText.setEditable(false);
		
		//currentSolutionScore.setLayoutData(gridData);
		currentSolutionScore.setText("n/a");
		currentSolutionScore.setEditable(false);
		
		Label changeMappingLabel = new Label(parent, SWT.NONE);
		changeMappingLabel.setText("Switch Allocations:");
		gridData = new GridData();
		gridData.verticalAlignment = SWT.TOP;
		changeMappingLabel.setLayoutData(gridData);
		
		slider = new Slider(parent, SWT.HORIZONTAL);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		slider.setLayoutData(gridData);
		slider.setMinimum(0);
		slider.setIncrement(1);
	    slider.setPageIncrement(2);
	    slider.setThumb(1);
	    slider.setEnabled(false);
			    
		slider.addListener (SWT.Selection, new Listener () {
			public void handleEvent (Event event) { 
				detailedResultsViewUiModel.indexToDrawProperty().set(slider.getSelection());
			} 
		});
		
		//slider.setSelection(0);
		
		detailedResultsViewUiModel.indexToDrawProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0,	Number arg1, final Number arg2) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					
					// update the old UI
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							/* Zeige das Resultat in einer View */
							drawGraph(arg2.intValue());
							currentSolutionText.setText(arg2.intValue()+1 + " / " + slider.getMaximum());
							currentSolutionScore.setText("" + detailedResultsViewUiModel.getObservableResultsList().get(arg2.intValue()).getEvaluation().getTotalScaledScore());
							slider.setSelection(arg2.intValue());
						}
					});
				} 
			}
		});
		
		
		
		detailedResultsViewUiModel.getObservableResultsList().addListener(new ListChangeListener<Result>() {

			@Override
			public void onChanged(
					final javafx.collections.ListChangeListener.Change<? extends Result> change) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							int index = detailedResultsViewUiModel.indexToDrawProperty().get();
							slider.setEnabled(true);
							slider.setMaximum(detailedResultsViewUiModel.getObservableResultsList().size());
							slider.setSelection(index);
							drawGraph(index);
							currentSolutionText.setText(index+1 + " / " + slider.getMaximum());
							currentSolutionScore.setText("" + detailedResultsViewUiModel.getObservableResultsList().get(index).getEvaluation().getTotalScaledScore());
						}
					});
				}				
			}
			
		});
		
		Label mappingResultLabel = new Label(parent, SWT.NONE);
		mappingResultLabel.setText("Allocation");
		gridData_1 = new GridData();
		gridData_1.horizontalAlignment = SWT.FILL;
		gridData_1.horizontalSpan = 2;
		mappingResultLabel.setLayoutData(gridData_1);
		
		graph = new NonMovableGraph(parent, SWT.BORDER);
		gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		graph.setLayoutData(gridData);
	}


	@Override
	public void setFocus() {}

	/** 
	 * Draw the graph with the help of the ZEST framework
	 * 
	 * @param index refers to the index in the list of mapping results
	 */
	private void drawGraph(int index) {
		graph.clear();
		graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		
		Result r = detailedResultsViewUiModel.getObservableResultsList().get(index);
		
		GraphNode systemNode = new GraphNode(graph,  SWT.NONE, "System\n" + r.getSystemName());
		systemNode.setBorderWidth(2);
		
		for (HardwareElement child : r.getRootHardwareElements())
			drawHardwareNodes(child, systemNode, r);
	}


	private void drawSoftwareNodes(Thread thread, GraphNode parentNode, Result result) {
		GraphNode newNode = createNode(thread, result);
		GraphConnection nodeEdge = new GraphConnection(graph,  ZestStyles.CONNECTIONS_DOT,  parentNode, newNode);
		nodeEdge.setLineWidth(3);
	}


	private void drawHardwareNodes(EObject obj, GraphNode parentNode, Result result) {
		GraphNode newNode = createNode(obj, result);
		GraphConnection nodeEdge = new GraphConnection(graph,  ZestStyles.CONNECTIONS_DOT,  parentNode, newNode);
		nodeEdge.setLineWidth(3);
		
		if (obj instanceof Core) /* draw applications */ {
			for (Thread thread : ((Core)obj).getThreads() ) 
				drawSoftwareNodes(thread, newNode, result);
		}
		else if (obj instanceof Compartment) 
			for (Box box : ((Compartment) obj).getBoxes())
				drawHardwareNodes(box, newNode, result);

		else if (obj instanceof Box) 
			for (Board board : ((Box) obj).getBoards())
				drawHardwareNodes(board, newNode, result);

		else if (obj instanceof Board) 
			for (Processor processor : ((Board) obj).getProcessors())
				drawHardwareNodes(processor, newNode, result);
		
		else if (obj instanceof Processor) 
			for (Core  core : ((Processor) obj).getCores())
				drawHardwareNodes(core, newNode, result);
	}


	private GraphNode createNode(EObject ghc, Result result) {
		String text = "";
	
		if (ghc instanceof Core) {
			Core c = (Core) ghc;
			text = 	"Core " + c.getName() + " (" + c.getArchitecture() + ")" +
					"\nCapacity: " + c.getCapacity() +
					"\nLoad: " + Math.round(new Double(c.getUtilization()) * 100 / new Double(c.getCapacity())) + "%"; 
		} 
		else if (ghc instanceof Processor) {
			Processor p = (Processor) ghc;
			text = "Processor " + p.getName() + 
					"\n" + p.getManufacturer() + " " + p.getProcessorType(); 

		} 
		else if (ghc instanceof Board)	{
			Board b = (Board) ghc;
			text =  "Board " + b.getName() + 
					"\nManufacturer: " + b.getManufacturer() +
					"\nAssurance Level: " + b.getAssuranceLevel().toString() + 
					"\nRAM: " + b.getRamUtilization() + " of " + b.getRamCapacity() + " used" +
					"\nROM: " + b.getRomUtilization() + " of " + b.getRomCapacity() + " used";
		} 
		else if (ghc instanceof Box) {
			Box b = (Box) ghc;
			text = "Box " + b.getName() + 
				   "\nManufacturer: " + b.getManufacturer();
		} 
		else if (ghc instanceof Compartment) {
			Compartment c = (Compartment) ghc;
			text = "Compartment " + c.getName() + 
				   "\nManufacturer: " + c.getManufacturer();
		}
			
		GraphNode newNode = new GraphNode(graph, SWT.NONE, text);
		return newNode;
	}


	private GraphNode createNode(Thread thread, Result result) {
		String text =  "Thread: " + thread.getName() + 
					   "\n(App.: " + thread.getApplication().getName() + ")" + 
				       "\nCriticality level: " + thread.getApplication().getCriticalityLevel().toString() +									   
				       "\nCore utilization: " + thread.getApplication().getCoreUtilization() +
				       "\nReq. RAM: " + thread.getApplication().getRamUtilization() +
				       "\nReq. ROM: " + thread.getApplication().getRomUtilization();
		
		if (thread.getApplication().getDevelopedBy() != null)
				       text += "\nDeveloped by: " + thread.getApplication().getDevelopedBy();

		GraphNode newNode = new GraphNode(graph, SWT.NONE, text);
		newNode.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		return newNode;
	}


	public void resetView() {
		graph.clear();
		currentSolutionText.setText("n/a");
		currentSolutionText.setEditable(false);
		
		currentSolutionScore.setText("n/a");
		currentSolutionScore.setEditable(false);
		
		slider.setMaximum(0);
	}

}

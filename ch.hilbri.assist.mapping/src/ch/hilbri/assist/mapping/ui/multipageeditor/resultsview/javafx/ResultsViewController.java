package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

import java.io.IOException;
import java.net.URL;

import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.GotoSolutionDialog;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

/**
 * Handles the DetailedResultView View
 */
public class ResultsViewController extends AnchorPane{

	DetailedResultsViewUiModel detailedResultsViewUiModel;
	
	@FXML
	private TreeView<TreeObject> resultTreeView;
	
	@FXML
	private AnchorPane mainPane;
	
	@FXML
	private Button nextSolutionButton;
	@FXML
	private Button previousSolutionButton;
	@FXML
	private Button firstSolutionButton;
	@FXML
	private Button lastSolutionButton;
	@FXML
	private Button gotoSolutionButton;
	
	@FXML
	private LineChart<Integer,Number> scoreChart;
	
	@FXML
	private NumberAxis xAxis;
	
	@FXML
	private NumberAxis yAxis;
	
	
	@FXML
	private TitledPane scoreDistributionPane;
	
	
	@FXML
	private ScrollPane mainScrollPane;
	
	private Node curScoreNode;
	
	/** 
	 * Constructor
	 * 
	 * @param detailedResultsViewUiModel
	 */
	public ResultsViewController(final DetailedResultsViewUiModel detailedResultsViewUiModel) {
		
		
		//creates fxmlLoader
		FXMLLoader fxmlLoader = new FXMLLoader();
		
		//creates URL of the used fxml file
		URL	url = getClass().getResource("/resources/detailedResultsView.fxml");
		
		//sets fxmlLoader properties
		fxmlLoader.setLocation(url);
		fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());


		//sets root and controller
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
        	//loads the content of the fxml file
            fxmlLoader.load();
        } catch (IOException exception) { throw new RuntimeException(exception); }		
        

		this.detailedResultsViewUiModel = detailedResultsViewUiModel;
		
		//Registers the listener for the result to be drawn
		detailedResultsViewUiModel.indexToDrawProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0,	Number arg1, final Number arg2) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					if (!Platform.isFxApplicationThread()) {
						Platform.runLater(new Runnable() {
	
							@Override
							public void run() {	
								drawTreeView(arg2.intValue());
							}							
						});
						
					} else { 
						drawTreeView(arg2.intValue());	
					}
				}
			}
		});
		
		//Registers the listener for the score Chart to be drawn
		detailedResultsViewUiModel.getObservableResultsList().addListener(new ListChangeListener<Result>() {

			@Override
			public void onChanged(
					final javafx.collections.ListChangeListener.Change<? extends Result> change) {
				while (change.next()) {
					if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
						final int index = detailedResultsViewUiModel.indexToDrawProperty().get();
						if (!Platform.isFxApplicationThread()) {
							Platform.runLater(new Runnable() {
		
								@Override
								public void run() {
									addChartData();
									drawTreeView(index);
									
								}					
							});
							
						} else {
							addChartData();
							drawTreeView(index);
						}
					}
				}
				
			}
			
		});
		
		
		//Listener for the treeview->gives you the selected item
		resultTreeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<TreeObject>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<TreeObject>> arg0, TreeItem<TreeObject> prevObject, TreeItem<TreeObject> newObject) {
				if (newObject != null) { detailedResultsViewUiModel.clickedObjectProperty().set(newObject);	}
			}
		});
		
		
		//Sets the next solution to be shown
		nextSolutionButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					IntegerProperty currentIndex = detailedResultsViewUiModel.indexToDrawProperty();
					if (currentIndex.get() < detailedResultsViewUiModel.getObservableResultsList().size()-1) {
						currentIndex.set(currentIndex.get() + 1);
					}
				}
			}
		});
		
		//Sets the previous solution to be shown
		previousSolutionButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					IntegerProperty currentIndex = detailedResultsViewUiModel.indexToDrawProperty();
					if (currentIndex.get() > 0) {
						currentIndex.set(currentIndex.get() - 1);
					}
				}
			}
			
		});
		
		//Sets the first solution to be shown
		firstSolutionButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					IntegerProperty currentIndex = detailedResultsViewUiModel.indexToDrawProperty();
					currentIndex.set(0);
				}
			}
			
		});
		
		//Sets the last solution to be shown
		lastSolutionButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					IntegerProperty currentIndex = detailedResultsViewUiModel.indexToDrawProperty();
					currentIndex.set(detailedResultsViewUiModel.getObservableResultsList().size()-1);
				}
			}
			
		});
		
		//Sets the goto solution action to be shown
		gotoSolutionButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (detailedResultsViewUiModel.getObservableResultsList()
						.size() > 0) {
					IntegerProperty currentIndex = detailedResultsViewUiModel.indexToDrawProperty();
					GotoSolutionDialog gotoSolutionsDialog = new GotoSolutionDialog(null, currentIndex.get()+1);
					if (gotoSolutionsDialog.open() == Status.OK) {
						int newSolution = gotoSolutionsDialog.getGotoSolution();
						if (newSolution >= 0 && newSolution < detailedResultsViewUiModel.getObservableResultsList()
								.size()) {
							currentIndex.set(newSolution+1);
						}
					}
				}
			}

		});
		
		//While clicking the buttons it would be cool if the treeview is still focused
		FocusListener listener = new FocusListener();
		previousSolutionButton.focusedProperty().addListener(listener);
		nextSolutionButton.focusedProperty().addListener(listener);
		firstSolutionButton.focusedProperty().addListener(listener);
		lastSolutionButton.focusedProperty().addListener(listener);
		gotoSolutionButton.focusedProperty().addListener(listener);
	}
	
	/**
	 * Adds the list to the charts
	 */
	@SuppressWarnings("unchecked")
	private void addChartData() {
		
		//Score Chart
		
		XYChart.Series<Integer, Number> series = new XYChart.Series<Integer, Number>();
		
		for (int i = 0; i < detailedResultsViewUiModel.getObservableResultsList().size(); i++) {
			Result r = detailedResultsViewUiModel.getObservableResultsList().get(i);
			double score = r.getEvaluation().getTotalScaledScore();
			
			XYChart.Data<Integer,Number> tmp = new XYChart.Data<Integer,Number>(i+1, score);
			Circle circle1 = new Circle(0,0,5, Color.RED);
			circle1.setVisible(false);
			tmp.setNode(circle1);
	        
			series.getData().add(tmp);
		}
		
		xAxis.setLowerBound(1);
		xAxis.setUpperBound(detailedResultsViewUiModel.getObservableResultsList().size());
		xAxis.setTickUnit(Math.floor(detailedResultsViewUiModel.getObservableResultsList().size() * 0.1));
		
		yAxis.setLowerBound(0);
		yAxis.setUpperBound(detailedResultsViewUiModel.getObservableResultsList().get(0).getEvaluation().getTotalScaledScore()+1);
		yAxis.setTickUnit(Math.floor(0.2*(detailedResultsViewUiModel.getObservableResultsList().get(0).getEvaluation().getTotalScaledScore()+1)));
		
		scoreChart.getData().setAll(series);
	}	
		

	/**
	 * Draws the Treeview of the Result in Resultlist with postition @param index
	 * @param index
	 */
	private void drawTreeView(int index) {
		Result r = detailedResultsViewUiModel.getObservableResultsList().get(index);		 
		
		//drawing mark on scoreChart
		if (curScoreNode != null) {
			curScoreNode.setVisible(false);
		}
		curScoreNode = scoreChart.getData().get(0).getData().get(index).getNode();
		curScoreNode.setVisible(true);

		
		//System Node
		Image i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_system_16x16.png"));
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> systemNode = new TreeItem<TreeObject>(new TreeObject(r), iv);
		systemNode.setExpanded(true);
		
		resultTreeView.setRoot(systemNode);
		resultTreeView.edit(systemNode);
		resultTreeView.setEditable(false);
		
		for (Compartment compartment : r.getModel().getCompartments())
			drawHardwareNodes(compartment, systemNode, r);
		
		if (detailedResultsViewUiModel.clickedObjectProperty().get() == null) {
			resultTreeView.getSelectionModel().select(0);
			Platform.runLater(new Runnable() {
			     @Override
			     public void run() {
			         resultTreeView.requestFocus();
			     }
			});
		} else {
			resultTreeView.getSelectionModel().select(detailedResultsViewUiModel.clickedObjectProperty().get());
		}
	}
	
	private void drawHardwareNodes(EObject obj, TreeItem<TreeObject> rootNode, Result result) {
		Image i;
		if (obj instanceof Compartment) 	i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_compartment_16x16.png"));
		else if (obj instanceof RDC)		i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_processor_16x16.png"));
		else if (obj instanceof Connector)	i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_core_16x16.png"));
		else return;
		
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> newNode = new TreeItem<TreeObject>(new TreeObject(obj), iv);
		rootNode.getChildren().add(newNode);
		newNode.setExpanded(true);
		
		if (obj instanceof Connector) { 
			/* draw interfaces */
			
			for (EqInterface iface : result.getAllMappedEqInterfacesForConnector((Connector) obj)) 
				drawInterfaceNodes(iface, newNode);
		}
		else { 	
			/* draw lower level hardware architecture */
			for (EObject child : obj.eContents()) 
				drawHardwareNodes(child, newNode, result);
		}
	}

	private void drawInterfaceNodes(EqInterface iface, TreeItem<TreeObject> rootNode) {
		Image i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_application_16x16.png"));
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> newNode = new TreeItem<TreeObject>(new TreeObject(iface), iv);
		rootNode.getChildren().add(newNode);
	}
	
	public void resetView() {
		resultTreeView.setRoot(null);
		scoreChart.getData().clear();;
		
	}
	
	
	/**
	 * Request focus for the treeview
	 *
	 */
	private class FocusListener implements ChangeListener<Boolean> {

		@Override
		public void changed(ObservableValue<? extends Boolean> arg0, Boolean olVal, Boolean newVal) {
			if (newVal) {
				Platform.runLater(new Runnable() {
				     @Override
				     public void run() {
				         resultTreeView.requestFocus();
				     }
				});
			}
		}
	}
}

package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.GotoSolutionDialog;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.result.mapping.AbstractMetric;
import ch.hilbri.assist.result.mapping.Board;
import ch.hilbri.assist.result.mapping.Box;
import ch.hilbri.assist.result.mapping.Compartment;
import ch.hilbri.assist.result.mapping.Core;
import ch.hilbri.assist.result.mapping.HardwareElement;
import ch.hilbri.assist.result.mapping.Processor;
import ch.hilbri.assist.result.mapping.Result;
import ch.hilbri.assist.result.mapping.Thread;

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
	private LineChart<Number,Integer> scoreProbabiltyChart;
	
	@FXML
	private NumberAxis xAxis;
	
	@FXML
	private TitledPane selectedTitledPane;
	@FXML
	private TitledPane selectedLeftPane1;
	@FXML
	private TitledPane scoreDistributionPane;
	@FXML
	private TitledPane scoreProbabiltyPane;
	
	@FXML
	private Accordion selectedLeftPane2;
	
	@FXML
	private ScrollPane mainScrollPane;
	
	private Node curScoreNode, curProbNode;
	
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
        
        //Bindings to scale the ui properly
		selectedTitledPane.prefWidthProperty().bind(mainPane.prefWidthProperty());
		selectedLeftPane1.prefWidthProperty().bind(selectedTitledPane.prefWidthProperty());
		selectedLeftPane2.prefWidthProperty().bind(selectedTitledPane.prefWidthProperty());

		
		//rather ugly workaround to make sure the chart is scaled properly and shows the right node
		selectedLeftPane2.prefWidthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0,
					Number arg1, Number arg2) {
				if (detailedResultsViewUiModel.getObservableResultsList().size() > 0) {
					if (!Platform.isFxApplicationThread()) {
						Platform.runLater(new Runnable() {
	
							@Override
							public void run() {
								addChartData();
								setCurNode();
							}

											
						});
						
					} else {
						addChartData();
						setCurNode();
					}
				}
			}
			
			private void setCurNode() {
				//drawing mark on scoreChart
				curScoreNode = scoreChart.getData().get(0).getData().get(detailedResultsViewUiModel.indexToDrawProperty().get()).getNode();
				curScoreNode.setVisible(true);
				
				findCurrentProbabilityNode();
				curProbNode.setVisible(true);
			}		
		});
		        
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
		
		
		//init scoreChart
		scoreChart.setCreateSymbols(false);
		xAxis.setTickLabelsVisible(false);
		
		//init scoreProbabiltyChart
		scoreProbabiltyChart.setCreateSymbols(false);
		scoreProbabiltyChart.setLegendVisible(false);

		
		//Make sure one graph is always expanded
		selectedLeftPane2.expandedPaneProperty().addListener(new ChangeListener<TitledPane>() {

			@Override
			public void changed(ObservableValue<? extends TitledPane> arg0,
					TitledPane oldPane, final TitledPane newPane) {
				if (oldPane != null) oldPane.setCollapsible(true);
		        if (newPane != null) Platform.runLater(new Runnable() { @Override public void run() { 
		          newPane.setCollapsible(false); 
		        }});
				
			}
			
		});
		
//		setupTable();
	}
	
	/**
	 * Adds the list to the charts
	 */
	private void addChartData() {
		
		Map<Number,Integer> probabiltyData = new TreeMap<Number,Integer>();
		//Score Chart
		ObservableList<LineChart.Series<Integer,Number>> data = FXCollections.observableArrayList();

		XYChart.Series<Integer,Number> series = new XYChart.Series<Integer,Number>();
		
		for (int i = 0; i < detailedResultsViewUiModel.getObservableResultsList().size(); i++) {
			Result r = detailedResultsViewUiModel.getObservableResultsList().get(i);
			double score = r.getEvaluation().getTotalScaledScore();
			XYChart.Data<Integer,Number> tmp = new XYChart.Data<Integer,Number>(i, score);
			Circle circle1 = new Circle(0,0,3, Color.RED);
	        tmp.setNode(circle1);
	        circle1.setVisible(false);
			series.getData().add(tmp);
			if (probabiltyData.containsKey(score)) {
				probabiltyData.put(score, probabiltyData.get(score) + 1);
			} else {
				probabiltyData.put(score, 1);
			}
			
		}
		data.add(series);
		scoreChart.setData(data);
		
		//Score Probabilty Chart
		ObservableList<LineChart.Series<Number,Integer>> data2 = FXCollections.observableArrayList();

		XYChart.Series<Number,Integer> series2 = new XYChart.Series<Number,Integer>();
		for (Entry<Number,Integer> tmp : probabiltyData.entrySet()) {
			XYChart.Data<Number,Integer> tmpData = new XYChart.Data<Number,Integer>(tmp.getKey(), tmp.getValue());
			Circle circle1 = new Circle(0,0,3, Color.RED);
			tmpData.setNode(circle1);
	        circle1.setVisible(false);
			series2.getData().add(tmpData);
		}
		data2.add(series2);
		scoreProbabiltyChart.setData(data2);
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

		if (curProbNode != null) {
			curProbNode.setVisible(false);
		}
		findCurrentProbabilityNode();
		curProbNode.setVisible(true);
		
		//System Node
		Image i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_system_16x16.png"));
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> systemNode = new TreeItem<TreeObject>(new TreeObject(r), iv);
		systemNode.setExpanded(true);
		
		resultTreeView.setRoot(systemNode);
		resultTreeView.edit(systemNode);
		resultTreeView.setEditable(false);
		
		for (HardwareElement child : r.getRootHardwareElements())
			drawHardwareNodes(child, systemNode, r);
		
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
		else if (obj instanceof Box) 		i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_box_16x16.png"));
		else if (obj instanceof Board) 		i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_board_16x16.png"));
		else if (obj instanceof Processor)	i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_processor_16x16.png"));
		else if (obj instanceof Core)		i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_core_16x16.png"));
		else return;
		
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> newNode = new TreeItem<TreeObject>(new TreeObject(obj), iv);
		rootNode.getChildren().add(newNode);
		newNode.setExpanded(true);
		
		if (obj instanceof Core) { 
			/* draw applications */
			for (Thread thread : ((Core)obj).getThreads()) 
				drawSoftwareNodes(thread, newNode);
		}
		else { 	
			/* draw lower level hardware architecture */
			for (EObject child : obj.eContents()) 
				drawHardwareNodes(child, newNode, result);
		}
	}

	private void drawSoftwareNodes(Thread thread, TreeItem<TreeObject> rootNode) {
		Image i = new Image(getClass().getResourceAsStream("/icons/treeview/treeview_application_16x16.png"));
		ImageView iv = new ImageView(i);
		TreeItem<TreeObject> newNode = new TreeItem<TreeObject>(new TreeObject(thread), iv);
		rootNode.getChildren().add(newNode);
	}
	
	/**
	 * Adjust size of the main anchorpane to scale the ui correctly
	 * @param width
	 */
	public void adjustSize(int width) {
		mainPane.setPrefWidth(width*0.99);
	}
	
	/**
	 * Locates the Node in the Probabilty chart which will be highlighted.
	 * The Node is associated with the chosen data in the TreeView
	 */
	private void findCurrentProbabilityNode() {
		double score = detailedResultsViewUiModel.getObservableResultsList().get(detailedResultsViewUiModel.indexToDrawProperty().get()).getEvaluation().getTotalScaledScore();
		XYChart.Series<Number,Integer> series = scoreProbabiltyChart.getData().get(0);
		for (XYChart.Data<Number,Integer> tmp: series.getData()) {
			if (tmp.getXValue().doubleValue() == score) {
				curProbNode = tmp.getNode();
				
				break;
			}
		}
	}	
	
	public void resetView() {
		resultTreeView.setRoot(null);
//		metricTable.getItems().clear();
		scoreChart.getData().clear();;
		scoreProbabiltyChart.getData().clear();
		
	}
	
	//---------------------------------------classes--------------------------------
	
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
	
	/**
	 * EditingCell for the Weight column of the Tableview.
	 * It allows to Enter positive Numbers and "-" (for disabling the row->especially used for the first row, 
	 * which can't be deleted)
	 *
	 */
    public static class EditingCell extends TableCell<MetricWeight, String> {

        private TextField textField;

        public EditingCell() {
        	this.setAlignment(Pos.CENTER);
        	if (textField == null) {
                createTextField();
            }
            setText(null);
            this.setGraphic(textField);
            textField.selectAll();
        }

        

        @Override public void cancelEdit() {
            super.cancelEdit();
            setText((String) getItem());
            setGraphic(null);
        }

        @Override public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        } 
        

        private void createTextField() {
            textField = new TextField(getString());
            String strCss;
            // Padding in Text field cell is not wanted - we want the Textfield itself to "be"
            // The cell.  Though, this is aesthetic only.  to each his own.  comment out
            // to revert back.  
            strCss = "-fx-padding: 0;";

            this.setStyle(strCss);
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap() * 2);
            textField.setOnKeyReleased(new EventHandler<KeyEvent>() {                
                @Override public void handle(KeyEvent t) {
                    if (t.getCode() == KeyCode.ENTER || t.getCode() == KeyCode.UNDEFINED) {
                    	commit();
                    	
                    	
                    } else if (t.getCode() == KeyCode.ESCAPE) {
                        cancelEdit();
                    }
                }

				
            });
            
         // 
            // Default style pulled from caspian.css. Used to play around with the inset background colors
            // ---trying to produce a text box without borders
            strCss = "" +
                      //"-fx-background-color: -fx-shadow-highlight-color, -fx-text-box-border, -fx-control-inner-background;" +
                      "-fx-background-color: -fx-control-inner-background;" +
                      //"-fx-background-insets: 0, 1, 2;" +
                      "-fx-background-insets: 0;" +
                      //"-fx-background-radius: 3, 2, 2;" +
                      "-fx-background-radius: 0;" +
                      "-fx-padding: 3 5 3 5;" +   /*Play with this value to center the text depending on cell height??*/
                      //"-fx-padding: 0 0 0 0;" +
                      "-fx-prompt-text-fill: derive(-fx-control-inner-background,-30%);" +
                      "-fx-cursor: text;" +
                      "";
            
            
            
            textField.setStyle(strCss);
        }

        private void commit() {
        	String text = textField.getText();
        	if (text.equals("-")) {
        		commitEdit(textField.getText());					
        	} else {
        		try {
        			int input = Integer.parseInt(text);
        			if (input < 0) {
        				text = "0";
        				ConsoleCommands.writeLineToConsole("Please type in a positive number.");
        			}
        			commitEdit(text);
        		} catch (NumberFormatException e) {
        			ConsoleCommands.writeLineToConsole("Please type in a positive number or \"-\".");
        		}
        	}
		}
        
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    } 
    
    /**
     * TextCell for the metric table with some restrictions to the possible inputs
     *
     */
    public static class TextFieldCell extends TableCell<MetricWeight,String> {
        private TextField textField;
        private StringProperty boundToCurrently = null;

        public TextFieldCell() {
          String strCss;
          // Padding in Text field cell is not wanted - we want the Textfield itself to "be"
          // The cell.  Though, this is aesthetic only.  to each his own.  comment out
          // to revert back.  
          strCss = "-fx-padding: 0;";

          this.setStyle(strCss);

          textField = new TextField();
          textField.setAlignment(Pos.CENTER);
          

          // Default style pulled from caspian.css. Used to play around with the inset background colors
          // ---trying to produce a text box without borders
          strCss = "" +
                    "-fx-background-color: -fx-control-inner-background;" +
                    "-fx-background-insets: 0;" +
                    "-fx-background-radius: 0;" +
                    "-fx-padding: 3 5 3 5;" +   /*Play with this value to center the text depending on cell height??*/
                    "-fx-prompt-text-fill: derive(-fx-control-inner-background,-30%);" +
                    "-fx-cursor: text;" +
                    "";
          
          textField.setStyle(strCss);
          textField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0,
					String oldVal, String newVal) {
				if (newVal.equals("-") || newVal.length()==0) {				
	        	} else {
	        		try {
	        			int input = Integer.parseInt(newVal);
	        			if (input < 0) {
	        				 textField.textProperty().set(String.valueOf(0));
	        				ConsoleCommands.writeLineToConsole("Please type in a positive number.");
	        			}
	        		} catch (NumberFormatException e) {
	        			ConsoleCommands.writeLineToConsole("Please type in a positive number or \"-\".");
	        			 textField.textProperty().set(oldVal);
	        		}
	        	}
				
			}
        	  
          });
          this.setGraphic(textField);
        }
        
        @Override
        protected void updateItem(String item, boolean empty) {
          super.updateItem(item, empty);        
          if(!empty) {
            // Show the Text Field
            this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

            // Retrieve the actual String Property that should be bound to the TextField
            // If the TextField is currently bound to a different StringProperty
            // Unbind the old property and rebind to the new one
            ObservableValue<String> ov = getTableColumn().getCellObservableValue(getIndex());
            SimpleStringProperty sp = (SimpleStringProperty)ov;

            if(this.boundToCurrently==null) {
                this.boundToCurrently = sp;
                this.textField.textProperty().bindBidirectional(sp);
            }
            else {
                if(this.boundToCurrently != sp) {
                  this.textField.textProperty().unbindBidirectional(this.boundToCurrently);
                  this.boundToCurrently = sp;
                  this.textField.textProperty().bindBidirectional(this.boundToCurrently);
                }
            }
          }
          else {
            this.setContentDisplay(ContentDisplay.TEXT_ONLY);
          }
        }
    }
  
    
    /**
     * Dataobject for each row of the tableview
     *
     */
    public static class MetricWeight {
    	private SimpleStringProperty weight;
    	private AbstractMetricProperty metric;
    
		private MetricWeight() {
			metric = new AbstractMetricProperty();
			weight = new SimpleStringProperty("-");
			weight.addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> arg0,
						String arg1, String arg2) {
					try {
						int newWeight = Integer.parseInt(arg2);
						metric.getValue().setWeight(newWeight);
					} catch(NumberFormatException e) {}
				}
			});
		}
		
		public SimpleStringProperty weightProperty() {
			return weight;
		}
		
		public AbstractMetricProperty metricProperty() {
			return metric;
		}
    }
    
	/**
	 * Property class to manage the AbstractMetrics inside the dataobject
	 * {@link MetricWeight} for the Tableview.
	 */
	public static class AbstractMetricProperty implements Property<AbstractMetric> {

		AbstractMetric metric;

		@Override
		public Object getBean() {
			return null;
		}

		@Override
		public String getName() {
			return metric.getName();
		}

		@Override
		public void addListener(ChangeListener<? super AbstractMetric> arg0) {
		}

		@Override
		public AbstractMetric getValue() {
			return metric;
		}

		public AbstractMetric get() {
			return metric;
		}

		@Override
		public void removeListener(ChangeListener<? super AbstractMetric> arg0) {
		}

		@Override
		public void addListener(InvalidationListener arg0) {
		}

		@Override
		public void removeListener(InvalidationListener arg0) {
		}

		@Override
		public void setValue(AbstractMetric metric) {
			this.metric = metric;
		}

		public void set(AbstractMetric metric) {
			this.metric = metric;
		}

		@Override
		public void bind(ObservableValue<? extends AbstractMetric> arg0) {
		}

		@Override
		public void bindBidirectional(Property<AbstractMetric> arg0) {
		}

		@Override
		public boolean isBound() {
			return false;
		}

		@Override
		public void unbind() {
		}

		@Override
		public void unbindBidirectional(Property<AbstractMetric> arg0) {

		}

	}
}

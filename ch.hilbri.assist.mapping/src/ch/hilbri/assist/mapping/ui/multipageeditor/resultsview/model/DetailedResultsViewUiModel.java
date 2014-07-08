package ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

import org.eclipse.ui.part.EditorPart;

import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.javafx.TreeObject;
import ch.hilbri.assist.result.mapping.Result;

public class DetailedResultsViewUiModel {

	private ArrayList<Result> results;
	private ObservableList<Result> observableResultList;
	private IntegerProperty indexToDrawProperty = new SimpleIntegerProperty(0);
	private ObjectProperty<TreeItem<TreeObject>> clickedObjectProperty = new SimpleObjectProperty<TreeItem<TreeObject>>();
	
	/**
	 * All metrics available for this instance
	 */
	private ResultsAnalysis metricsList; 

	/**
	 * All metrics that are to be used for evaluation (the one added in the metrics table)
	 */
	private ResultsAnalysis usedMetricsList;
	
	private EditorPart editor;
	
	public DetailedResultsViewUiModel() {
		
		observableResultList = FXCollections.observableArrayList();
		editor = null;
		initialiseMetrics();
	}
	
	/**
	 * Initialises a list with the standard metrics
	 */
	private void initialiseMetrics() {
		metricsList = new ResultsAnalysis();
//		metricsList.add(new RandomScore(1));
//		metricsList.add(new UniformCoreLoadDistribution(1));
//		metricsList.add(new MaxFreeCoreCapacity(1));
//		metricsList.add(new MaxOrgUnitsPerBoard(1));
		
//		usedMetricsList = new ResultsAnalysis();

		
	}
	
	public void setResultsList(ArrayList<Result> results) {
		/* Store a reference to the original results list */
		this.results = results;
		observableResultList.clear();
		observableResultList.addAll(results);
	}
	
	public ObservableList<Result> getObservableResultsList() {
		return observableResultList;
	}
	
	public ResultsAnalysis getMetricList() {
		return metricsList;
	}
	
	public ResultsAnalysis getUsedMetricList() {
		return usedMetricsList;
	}
	
	public void setUsedMetricList(ResultsAnalysis usedMetrics) {
		this.usedMetricsList = usedMetrics;
	}
	
	public void setIndexToDraw(int index) {
		indexToDrawProperty.set(index);
	}
	
	public IntegerProperty indexToDrawProperty() {
		return indexToDrawProperty;
	}
	
	public void setClickedObject(TreeItem<TreeObject> object) {
		clickedObjectProperty.set(object);
	}
	
	public ObjectProperty<TreeItem<TreeObject>> clickedObjectProperty(){
		return clickedObjectProperty;
	}

	public ArrayList<Result> getResults() {
		return results;
	}
	
	public void setEditor(EditorPart editor) {
		this.editor = editor;
	}
	
	public EditorPart getEditor() {
		return editor;
	}
	
	public Result getCurrentResult() {
		return observableResultList.get(indexToDrawProperty.get());
	}
}

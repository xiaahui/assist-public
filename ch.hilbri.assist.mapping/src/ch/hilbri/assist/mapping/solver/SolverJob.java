package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

import ch.hilbri.assist.mapping.solver.SolutionGenerator.KindOfSolutions;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.result.mapping.Result;

public class SolverJob extends Job {

	private AssistModel model;
//
//	private CS constraintSystem;
//	
//	private ThreadVariablesList threadVariablesList;
//	
//	private CoreVariablesList coreVariablesList;
//	
//	private ExclusiveAdapterRequirementVariablesList exclusiveAdapterVariablesList;
//	
//	private SharedAdapterRequirementVariablesList sharedAdapterVariablesList;
//	
//	private CommunicationVariablesList communicationVariablesList;
//	
//	private IOAdapterVariablesList ioAdapterVariablesList;
//	
//	private SolutionVariablesList solutionVariablesList;
//	
//	private MappingConstraintsList mappingConstraintsList;
	


	private DetailedResultsViewUiModel detailedResultsViewUiModel;
		
	private MultiPageEditor multiPageEditor;
	
	
	 /*
	 * Dieser Wert definiert eine maximale Anzahl an Deployments, die
	 * gesucht werden. Falls die Grenze �berschritten wird, wird die
	 * Suche abgebrochen. Dann kann es sein, dass noch weitere L�sungen
	 * vorhanden sind, aber nicht gefunden worden sind.
	 */
	private int maxSolutions;
	

	/*
	 * Gibt an, welche Art der Suche verwendet werden soll:
	 * RANDOM: 		sucht zuf�llig im gesamten L�sungsraum
	 * 		   		(Vorteil: L�sungen stammen aus allen Teilen des L�sungsraums)
	 * CONSECUTIVE: sucht "hintereiander" liegende L�sungen
	 * 				(Vorteil: Es kann eindeutig bestimmt werden, ob alle m�glichen L�sungen gefunden wurden)
	 */
	private KindOfSolutions kindOfSolutions;

	/*
	 * Im Advances Mode gibt dies die maximale Suchzeit an, da nicht
	 * festgestellt werden kann, ob alle existierenden L�sungen gefunden wurden.
	 */
	private long maxTimeOfCalculationInmsec;  // in msec
	
	
	/** neues Result, soll zuk�nftig mappingResults ersetzen */
	private ArrayList<Result> newMappingResults;

	/**
	 * @return the newMappingResults
	 */
	public ArrayList<Result> getNewMappingResults() {
		return newMappingResults;
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param model
	 * @param editor 
	 */
	public SolverJob(String name, AssistModel model, MultiPageEditor editor) {
		super(name);
		this.model = model;

		if (editor != null) {
			this.multiPageEditor = editor;
			this.detailedResultsViewUiModel = editor.getDetailedResultViewUiModel();
			detailedResultsViewUiModel.setEditor(editor);
		}
		init();
	}
//
//	public SolverJob(String name, MappingDataModel ppModel, DetailedResultsViewUiModel detailedResultsViewUiModel, PrecisionproMainEditor ppEditor) {
//		super(name);
//		this.model = ppModel;
//		this.multiPageEditor = null;
//		this.detailedResultsViewUiModel = detailedResultsViewUiModel;
//		
//		detailedResultsViewUiModel.setEditor(ppEditor);
//		init();
//	}
//	
	private void init() {
//		
//		/* Create a list for the results */ 
//		this.newMappingResults = new ArrayList<Result>();  
//		
//		/* Create a new Constraint System (firstCS) */
//		this.constraintSystem = new CS();
//
//		/* Create the set of Variables needed for a Thread */
//		this.threadVariablesList = new ThreadVariablesList(model, constraintSystem);
//		
//		this.coreVariablesList = new CoreVariablesList(model);
//		
//		this.exclusiveAdapterVariablesList = new ExclusiveAdapterRequirementVariablesList(model, this.threadVariablesList);
//		
//		this.sharedAdapterVariablesList = new SharedAdapterRequirementVariablesList(model, this.threadVariablesList);
//		
//		this.communicationVariablesList = new CommunicationVariablesList(model, constraintSystem);
//		
//		this.ioAdapterVariablesList = new IOAdapterVariablesList(model, constraintSystem);
//		
//		/* Create an empty set of constraints that will be used */
//		this.mappingConstraintsList = new MappingConstraintsList();
//
//		
//		
//		/* Create a new Constraint to process the system hierarchy */
//		this.mappingConstraintsList.add(new SystemHierarchyConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new Constraint to process the I/O-adapter to board hierarchy */
//		this.mappingConstraintsList.add(new IOAdapterHierarchyConstraint(this.constraintSystem, this.model, this.threadVariablesList,
//				this.exclusiveAdapterVariablesList, this.sharedAdapterVariablesList, ioAdapterVariablesList));
//		
//		/* Create a new Constraint to keep threads of the same application on the same board. */
//		this.mappingConstraintsList.add(new IdenticalThreadsOnSameBoardConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//
//		/* Create a new constraint to keep the criticality level of the threads regarding to the assurance level of the boards */
//		this.mappingConstraintsList.add(new CriticalityRequirementsConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new constraint to keep the capacity of the cores */
//		this.mappingConstraintsList.add(new CoreUtilizationConstraint(this.constraintSystem, this.model, this.threadVariablesList, coreVariablesList));
//
//		/* Create a new constraint to obey the restrictions on the proximity of the applications */
//		this.mappingConstraintsList.add(new ProximityRelationsConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new constraint to obey the dislocality and dissimilarity requirements */
//		this.mappingConstraintsList.add(new DislocalityConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		/* new */
//		this.mappingConstraintsList.add(new DissimilarityTreeConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new constraint to keep the RAM capacity of the boards */
//		this.mappingConstraintsList.add(new RAMCapacityConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new constraint to keep the ROM capacity of the boards */
//		this.mappingConstraintsList.add(new ROMCapacityConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create new constraints to keep the required adapters of the board (shared/exclusive) */
//		for (IOAdapterType adapterType : IOAdapterType.values()){
//			if ( !exclusiveAdapterVariablesList.get(adapterType.ordinal()).isEmpty() || !sharedAdapterVariablesList.get(adapterType.ordinal()).isEmpty() )
//				this.mappingConstraintsList.add(new IOAdapterConstraint(this.constraintSystem, this.model, this.threadVariablesList,
//																		this.ioAdapterVariablesList,  this.exclusiveAdapterVariablesList,
//																		this.sharedAdapterVariablesList, adapterType.toString(), adapterType));
//		}
//		
//		/* Create new constraints to keep the applications on the networks */
//		this.mappingConstraintsList.add(new CommunicationOnNetworkConstraint(constraintSystem, model, threadVariablesList, communicationVariablesList));
//		
//		/* Create a new constraint to avoid permuting solutions */
//		this.mappingConstraintsList.add(new NoPermuationsConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//		
//		/* Create a new constraint that restricts the applications to their specified ones */
//		this.mappingConstraintsList.add(new RestrictedHardwareComponentsConstraint(this.constraintSystem, this.model, this.threadVariablesList));
//
	}
//
	@Override
	protected IStatus run(IProgressMonitor monitor) {
//		return execute(monitor, true);
		return null;
	}
//	
//	/* Die Funktionalit�t der RUN-Methode wurde ausgelagert, um den Zugang f�r einen Test zu erm�glichen */
//	public IStatus execute(IProgressMonitor monitor, boolean presentResults) {
//
//		monitor.beginTask("Find all mappings (firstCS)", mappingConstraintsList.size() + 2);
//
//		for (AbstractMappingConstraint constraint : mappingConstraintsList) {
//
//			if (monitor.isCanceled())	return Status.CANCEL_STATUS;
//
//			monitor.subTask("Processing constraint: \""	+ constraint.getDescription() + "\"");
//
//			if (constraint.generate() != Status.OK_STATUS)	return Status.CANCEL_STATUS;
//			if (constraint.propagate() != Status.OK_STATUS) return Status.CANCEL_STATUS;
//
//			monitor.worked(1);
//		}
//
//		 monitor.subTask("Searching for solutions");
//		 if (runSearchForSolutions(monitor) != Status.OK_STATUS) return Status.CANCEL_STATUS;
//		 monitor.worked(1);
//
//	
//		 monitor.subTask("Showing results");
//		 if (presentResults == true) { showResults(newMappingResults); }
//		 monitor.worked(1);
//
//		 return Status.OK_STATUS;
//	}
//
//	private IStatus runSearchForSolutions(IProgressMonitor monitor) {
//		
//		
//		/*
//		 * Sort the threadVariableList with respect to e.g. 'criticality', 'core utilization'
//		 * with highest value first. For multiple criteria begin sorting with most important
//		 * and end with less important criterion.
//		 */
//		Collections.sort(this.threadVariablesList, ThreadVariables.ThreadVariablesComparator.
//				decending(ThreadVariables.ThreadVariablesComparator.getComparator(
//				ThreadVariables.ThreadVariablesComparator.MAX_DOMAINS_REDUCTION_FIRST,
//				ThreadVariables.ThreadVariablesComparator.MAX_EXCLUSIVE_ADAPTER_REQUIREMENT_FIRST,
//				ThreadVariables.ThreadVariablesComparator.MAX_SHARED_ADAPTER_REQUIREMENT_FIRST,
//				ThreadVariables.ThreadVariablesComparator.MAX_ROM_UTILIZATION_FIRST,
//				ThreadVariables.ThreadVariablesComparator.MAX_RAM_UTILIZATION_FIRST,
//				ThreadVariables.ThreadVariablesComparator.HIGHEST_CRITICALITY_FIRST,
//				ThreadVariables.ThreadVariablesComparator.MAX_CORE_UTILIZATION_FIRST
//				)));
//		
//		/*
//		 * Create the set of solution variables - what are we interested in
//		 * solving? It is a subset of the threadVariables
//		 */
//		this.solutionVariablesList = new SolutionVariablesList(
//				this.threadVariablesList,
//				this.communicationVariablesList,
//				this.ioAdapterVariablesList,
//				this.exclusiveAdapterVariablesList,
//				this.sharedAdapterVariablesList);
//
//
//		
//		try {
//			if (maxSolutions > 0 && kindOfSolutions != null && maxTimeOfCalculationInmsec > 0)
//				return SolutionGenerator.generateSolutions(model, constraintSystem,
//						threadVariablesList, communicationVariablesList, ioAdapterVariablesList,
//						exclusiveAdapterVariablesList, sharedAdapterVariablesList, solutionVariablesList,
//						newMappingResults, maxSolutions, kindOfSolutions, maxTimeOfCalculationInmsec, monitor);
////			else
////				return SolutionGenerator.generateSolutions(model, constraintSystem, threadVariablesList, solutionVariablesList, mappingResults, monitor);
//			return null;
//		} catch (UninstantiatedException e) {
//			// wird geworfen, wenn solutionVariablen nicht eindeutig belegt wurden
//			e.printStackTrace();
//			System.err.println("FATAL ERROR: SolutionGenerator didn't set the variables to unique values!");
//			return Status.CANCEL_STATUS;
//		}
//	}
//	
//	
//	/**
//	 * Zeigt die fertigen Resultate in der UI an.
//	 * 
//	 * @param allResults
//	 *            die Resultate / L�sungen f�r das Mapping Problem
//	 */
//	private void showResults(final ArrayList<Result> allResults) {		
//		// update the new UI
//		
//		detailedResultsViewUiModel.indexToDrawProperty().set(0);
//		detailedResultsViewUiModel.setResultsList(allResults);
//		
//		if (multiPageEditor != null) {
//			Display.getDefault().asyncExec(new Runnable() {
//				@Override
//				public void run() {	multiPageEditor.setActiveResultPage();	}
//			});
//		}
//	}
//	
//
//	
	/**
	 * Sets the maximum number of solution.
	 * @param maxSolutions
	 */
	public void setMaxSolutions(int maxSolutions) {
		this.maxSolutions = maxSolutions;
	}

	/**
	 * Sets the searching mode. See {@link SolutionGenerator.KindOfSolutions}
	 * @param kindOfSolutions
	 */
	public void setKindOfSolutions(KindOfSolutions kindOfSolutions) {
		this.kindOfSolutions = kindOfSolutions;
	}

	/**
	 * Sets the maximum time for the search in advanced mode.
	 * @param maxTimeOfCalculationInmsec
	 */
	public void setMaxTimeOfCalculationInmsec(long maxTimeOfCalculationInmsec) {
		this.maxTimeOfCalculationInmsec = maxTimeOfCalculationInmsec;
	}
	
}
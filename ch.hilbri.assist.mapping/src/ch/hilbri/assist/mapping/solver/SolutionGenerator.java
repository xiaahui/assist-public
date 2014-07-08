package ch.hilbri.assist.mapping.solver;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import ch.hilbri.assist.result.mapping.Result;

public class SolutionGenerator {
	


	public enum KindOfSolutions {
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
//	
//	private static int maxSolutions;// = 1000;
//	private static IProgressMonitor monitor;
//	private static AbstractLabel label;
//	private static MappingDataModel model;
//	private static CS constraintSystem;
//	private static ThreadVariablesList threadVariablesList;
//	private static CommunicationVariablesList communicationVariablesList;
//	private static IOAdapterVariablesList ioAdapterVariablesList;
//	private static ExclusiveAdapterRequirementVariablesList exclusiveAdapterRequirementVariablesList;
//	private static SharedAdapterRequirementVariablesList sharedAdapterRequirementVariablesList;
//	private static SolutionVariablesList solutionVariablesList;
//	private static ArrayList<Result> newMappingResults;
//	private static KindOfSolutions kindOfSolutions = KindOfSolutions.CONSECUTIVE;
//	private static long maxSearchTime = 3000;
//	
//	
//	
//	
//	/**
//	 * 
//	 * @param model
//	 * @param constraintSystem
//	 * @param threadVariablesList
//	 * @param solutionVariablesList
//	 * @param mappingResults
//	 * @param maxSolutions
//	 * @param kindOfSolutions
//	 * @param maxSearchTime
//	 * @param monitor
//	 * @return
//	 * @throws UninstantiatedException
//	 */
//	
//	@SuppressWarnings("deprecation")
//	public static IStatus generateSolutions(MappingDataModel model,
//			CS constraintSystem, ThreadVariablesList threadVariablesList,
//			CommunicationVariablesList communicationVariablesList,
//			IOAdapterVariablesList ioAdapterVariablesList,
//			ExclusiveAdapterRequirementVariablesList exclusiveAdapterRequirementVariablesList,
//			SharedAdapterRequirementVariablesList sharedAdapterRequirementVariablesList,
//			SolutionVariablesList solutionVariablesList, 
//			ArrayList<Result> newMappingResults, final int maxSolutions,
//			KindOfSolutions kindOfSolutions, long maxSearchTime, IProgressMonitor monitor)
//					throws UninstantiatedException {
//		
//		SolutionGenerator.maxSolutions = maxSolutions;
//		SolutionGenerator.monitor = monitor;
//		SolutionGenerator.model = model;
//		SolutionGenerator.constraintSystem = constraintSystem;
//		SolutionGenerator.threadVariablesList = threadVariablesList;
//		SolutionGenerator.communicationVariablesList = communicationVariablesList;
//		SolutionGenerator.ioAdapterVariablesList = ioAdapterVariablesList;
//		SolutionGenerator.exclusiveAdapterRequirementVariablesList = exclusiveAdapterRequirementVariablesList;
//		SolutionGenerator.sharedAdapterRequirementVariablesList = sharedAdapterRequirementVariablesList;
//		SolutionGenerator.solutionVariablesList = solutionVariablesList;
//		SolutionGenerator.newMappingResults = newMappingResults;
//		SolutionGenerator.kindOfSolutions = kindOfSolutions;
//		SolutionGenerator.maxSearchTime = maxSearchTime;
//		
//		
//		switch (SolutionGenerator.kindOfSolutions) {
//		case CONSECUTIVE:
//			SolutionGenerator.label = new BtLabel(SolutionGenerator.constraintSystem, SolutionGenerator.solutionVariablesList.toArray());
//			break;
//		case RANDOM:
//			SolutionGenerator.label = new RandomElementLabel(SolutionGenerator.constraintSystem, SolutionGenerator.solutionVariablesList.toArray());
//			break;
//		default:
//			return Status.CANCEL_STATUS;
//		}
		
		
				
//		class FindSolutionRunnable extends java.lang.Thread{
//			public void run() {
//				try {
//					setLabelAndFindSolutions();
//				} catch (UninstantiatedException e) {
//					/* wird woanders abgefangen */
//				}
//			}
//		};
//		
//		
//		class WaitRunnable extends java.lang.Thread{
//			public void run() {
//				long waitingTimePeriode = 1000;
//				try {
//					long stillWaitedTime = 0;
//					while (stillWaitedTime < SolutionGenerator.maxSearchTime && ! isInterrupted() ) {
//						java.lang.Thread.sleep(waitingTimePeriode); // maximale Suchzeit (in msec)
//						stillWaitedTime += waitingTimePeriode;
//					}
//				} catch (InterruptedException e) { 
//					// Abbruch ist sogar gewollt
//				} 
//			}
//		}
//
//		java.lang.Thread waitThread = new java.lang.Thread(new WaitRunnable());
//		if (kindOfSolutions == KindOfSolutions.RANDOM) {
//			waitThread.start();
//		}
//		
//		java.lang.Thread findSolutionThread = new java.lang.Thread(new FindSolutionRunnable());
//		findSolutionThread.start();
//		
//		while(true) {
//			/* Wenn Abbrechen gedr�ckt wurde, dann unterbreche die Suche (den parallel laufenden Thread) */
//			if (SolutionGenerator.monitor.isCanceled()) {
//				label.interrupt();
//				try {
//					java.lang.Thread.sleep(500); // gibt dem Thread Zeit (in ms) zum Beenden
//				} catch (InterruptedException e) { e.printStackTrace(); } 
//				/* wurde immernoch nicht beendet, dann killen */
//				if (findSolutionThread.getState() == java.lang.Thread.State.RUNNABLE)
//					findSolutionThread.interrupt();
//				waitThread.interrupt();
//				return Status.CANCEL_STATUS;
//			}
//			/* Wenn die Suche regul�r beendet wurde (z.B. keine/alle/maxSol L�sungen gefunden wurden), dann mache weiter */
//			if (findSolutionThread.getState() == java.lang.Thread.State.TERMINATED) {
//				waitThread.interrupt();
//				break;
//			}
//			/* Wenn die maximale Suchzeit abgelaufen ist, dann unterbreche die Suche */
//			if (waitThread.getState() == java.lang.Thread.State.TERMINATED) {
//				label.interrupt();
//				try {
//					java.lang.Thread.sleep(500); // gibt dem Thread Zeit (in ms) zum Beenden
//				} catch (InterruptedException e) { e.printStackTrace(); } 
//				/* wurde immernoch nicht beendet, dann killen */
//				if (findSolutionThread.getState() == java.lang.Thread.State.RUNNABLE)
//					findSolutionThread.stop(); // TODO: warum klappt hier interrupt() nicht?
//				// TODO: Nachricht, dass Zeit abgelaufen ist
//				break;
//			}
//		}
//		
//		
//		searchTerminated();
//		
//		
//		return Status.OK_STATUS;
//	}
//	
//	
//	
//	private static IStatus searchTerminated() {
//		
//		int numberOfFoundSolutions = newMappingResults.size();
//		
//		if (numberOfFoundSolutions == 0) {
//			Display.getDefault().asyncExec(new Runnable() {
//				public void run() {
//					Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//					MessageDialog.openInformation(activeShell,
//							"No solutions!",
//							"There are no solutions for this specification.");
//				}
//			});
//		} else {
//			if (kindOfSolutions == KindOfSolutions.CONSECUTIVE && maxSolutions == numberOfFoundSolutions )
//				Display.getDefault().asyncExec(new Runnable() {
//					public void run() {
//						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//						MessageDialog.openInformation(activeShell,
//								"Maximum amount of solutions reached",
//								"We have reached the maximum amount of solutions.\n"
//										+ "The limit is set to " + maxSolutions
//										+ " solutions and we have found " + newMappingResults.size() + " different solutions.\n"
//										+ "There may still be more solutions.\n" + "Try a random search for more different solutions."
//										);
//					}
//				});
//			else if (kindOfSolutions == KindOfSolutions.CONSECUTIVE && maxSolutions > numberOfFoundSolutions )
//				Display.getDefault().asyncExec(new Runnable() {
//					public void run() {
//						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//						MessageDialog.openInformation(activeShell,
//								"Maximum amount of solutions reached",
//								"We have reached the maximum amount of solutions.\n"
//										+ "The limit is set to " + maxSolutions
//										+ " solutions and we have found " + newMappingResults.size() + " different solutions.\n"
//										+ "All solutions were found."
//										);
//					}
//				});
//			else if (kindOfSolutions == KindOfSolutions.RANDOM && maxSolutions == numberOfFoundSolutions )
//				Display.getDefault().asyncExec(new Runnable() {
//					public void run() {
//						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//						MessageDialog.openInformation(activeShell,
//								"Time has expired.",
//								"We have reached the maximum search time.\n"
//										+ "The limit is set to " + maxSolutions
//										+ " solutions and we have found " + newMappingResults.size() + " different solutions.\n"
//										+ "There may still be more solutions."
//										);
//					}
//				});
//			else if (kindOfSolutions == KindOfSolutions.RANDOM && maxSolutions > numberOfFoundSolutions )
//				Display.getDefault().asyncExec(new Runnable() {
//					public void run() {
//						Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//						MessageDialog.openInformation(activeShell,
//								"Search completed.",
//								"We have reached the limit amount of solutions.\n"
//										+ "The limit is set to " + maxSolutions
//										+ " solutions and we have found " + newMappingResults.size() + " different solutions.\n"
//										+ "There may still be more solutions.\n" + "Multiple solutions were deleted."
//										);
//					}
//				});
//		}
//		
//		return Status.OK_STATUS;
//	}
//	
//	
//	
//	private static IStatus setLabelAndFindSolutions() throws UninstantiatedException {
//		label.set();
//		int solutionCounter = 0;
//		try {
//			while (label.nextSolution() &&	(solutionCounter < maxSolutions)) {
//				solutionCounter++;
//				
//				if (monitor.isCanceled())  return Status.CANCEL_STATUS;
//				
//				Result newResultModel = new Result(
//						model, threadVariablesList, communicationVariablesList,
//						ioAdapterVariablesList,
//						exclusiveAdapterRequirementVariablesList,
//						sharedAdapterRequirementVariablesList); // mehr muss nicht getan werden!
//				
//				// store only new Results (RandomElementLabel can also generate the same result several times)
//				if (label instanceof RandomElementLabel) {
//					boolean contains = false;
//					for (Result r : newMappingResults) {
//						if (r.equals(newResultModel)) contains = true;
//					}
//					if (!contains) newMappingResults.add(newResultModel);
//				} else {
//					newMappingResults.add(newResultModel);
//				}
//				
//				
//			}
//			
//
//	
//		} catch (InterruptedException e) {
//			// wird geworfen, wenn Suche von au�en durch interrupt()
//			// unterbrochen wird, also wenn Abbrechen gedr�ckt wurde, oder wenn
//			// die maximale Suchzeit abgelaufen ist
//			return Status.OK_STATUS;
//		}
//		
//		return Status.OK_STATUS;
//	}

}

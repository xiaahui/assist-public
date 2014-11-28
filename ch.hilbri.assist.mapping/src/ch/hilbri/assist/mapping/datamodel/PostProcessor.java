package ch.hilbri.assist.mapping.datamodel;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.Network;
import ch.hilbri.assist.datamodel.model.Thread;
import ch.hilbri.assist.datamodel.model.impl.ModelFactoryImpl;

public class PostProcessor {
	
	public static void createMissingThreads(AssistModel model) {
		
		ModelFactory f = ModelFactoryImpl.eINSTANCE;
		
		for (Application a : model.getApplications()) {
			for (int i = 1; i <= a.getParallelThreads(); i++) {
				Thread t = f.createThread();
				a.getThreads().add(t);
				t.setApplication(a);
			}
		}
	}
	
	public static void createMissingBoardLocalNetworks(AssistModel model) {
		
		ModelFactory f = ModelFactoryImpl.eINSTANCE;
		
		for (Board board : model.getAllBoards()) {
			Network network = f.createNetwork();
			network.setName(board.getName() + "-Local-Net");
			network.setBandwidthCapacity(-1);   // Local boards have infinite bandwidth capacity
			network.getBoards().add(board);
			
			model.getNetworks().add(network);
		}
	}
}

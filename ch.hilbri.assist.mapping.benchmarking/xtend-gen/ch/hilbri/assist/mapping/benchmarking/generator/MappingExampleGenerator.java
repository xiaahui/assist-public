package ch.hilbri.assist.mapping.benchmarking.generator;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.ModelFactory;
import ch.hilbri.assist.mapping.model.Processor;
import ch.hilbri.assist.mapping.model.Task;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MappingExampleGenerator {
  public static AssistModel generate() {
    final ModelFactory factory = ModelFactory.eINSTANCE;
    final AssistModel assistModel = factory.createAssistModel();
    final Application application = factory.createApplication();
    application.setName("A1");
    final Task task = factory.createTask();
    task.setName("A1_T1");
    application.getTasks().add(task);
    assistModel.getApplications().add(application);
    final Compartment compartment = factory.createCompartment();
    compartment.setName("Compartment A");
    final Box box = factory.createBox();
    box.setName("Box A");
    final Board board = factory.createBoard();
    board.setName("Board A");
    final Processor processor = factory.createProcessor();
    processor.setName("Processor A");
    final Core core = factory.createCore();
    core.setName("Core A");
    processor.getCores().add(core);
    board.getProcessors().add(processor);
    box.getBoards().add(board);
    compartment.getBoxes().add(box);
    assistModel.getCompartments().add(compartment);
    final ResourceSetImpl resSet = new ResourceSetImpl();
    final Resource resource = resSet.createResource(URI.createURI("test.mdsl"));
    resource.getContents().add(assistModel);
    return assistModel;
  }
}

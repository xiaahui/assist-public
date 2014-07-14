package ch.hilbri.assist.mapping.result;

import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.DesignAssuranceLevelType;
import ch.hilbri.assist.model.HardwareElementContainer;
import ch.hilbri.assist.model.IOAdapter;
import ch.hilbri.assist.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.model.IOAdapterType;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.result.mapping.HardwareElement;
import ch.hilbri.assist.result.mapping.MappingFactory;
import ch.hilbri.assist.result.mapping.Result;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jacop.core.Domain;

@SuppressWarnings("all")
public class ResultFactoryFromSolverSolutions {
  private static MappingFactory f;
  
  private static EObject createHardwareElements(final EObject modelElement) {
    boolean _matched = false;
    if (!_matched) {
      if (modelElement instanceof Compartment) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.Compartment c = ResultFactoryFromSolverSolutions.f.createCompartment();
        String _name = ((Compartment)modelElement).getName();
        c.setName(_name);
        String _manufacturer = ((Compartment)modelElement).getManufacturer();
        c.setManufacturer(_manufacturer);
        String _powerSupply = ((Compartment)modelElement).getPowerSupply();
        c.setPowerSupply(_powerSupply);
        String _side = ((Compartment)modelElement).getSide();
        c.setSide(_side);
        String _zone = ((Compartment)modelElement).getZone();
        c.setZone(_zone);
        EList<Box> _boxes = ((Compartment)modelElement).getBoxes();
        for (final Box box : _boxes) {
          EList<ch.hilbri.assist.result.mapping.Box> _boxes_1 = c.getBoxes();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(box);
          _boxes_1.add(((ch.hilbri.assist.result.mapping.Box) _createHardwareElements));
        }
        return c;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Box) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.Box b = ResultFactoryFromSolverSolutions.f.createBox();
        String _name = ((Box)modelElement).getName();
        b.setName(_name);
        String _manufacturer = ((Box)modelElement).getManufacturer();
        b.setManufacturer(_manufacturer);
        EList<Board> _boards = ((Box)modelElement).getBoards();
        for (final Board board : _boards) {
          EList<ch.hilbri.assist.result.mapping.Board> _boards_1 = b.getBoards();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(board);
          _boards_1.add(((ch.hilbri.assist.result.mapping.Board) _createHardwareElements));
        }
        return b;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Board) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.Board b = ResultFactoryFromSolverSolutions.f.createBoard();
        String _name = ((Board)modelElement).getName();
        b.setName(_name);
        String _manufacturer = ((Board)modelElement).getManufacturer();
        b.setManufacturer(_manufacturer);
        String _boardType = ((Board)modelElement).getBoardType();
        b.setBoardType(_boardType);
        String _powerSupply = ((Board)modelElement).getPowerSupply();
        b.setPowerSupply(_powerSupply);
        DesignAssuranceLevelType _assuranceLevel = ((Board)modelElement).getAssuranceLevel();
        b.setAssuranceLevel(_assuranceLevel);
        int _ramCapacity = ((Board)modelElement).getRamCapacity();
        b.setRamCapacity(_ramCapacity);
        int _romCapacity = ((Board)modelElement).getRomCapacity();
        b.setRomCapacity(_romCapacity);
        EList<Processor> _processors = ((Board)modelElement).getProcessors();
        for (final Processor proc : _processors) {
          EList<ch.hilbri.assist.result.mapping.Processor> _processors_1 = b.getProcessors();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(proc);
          _processors_1.add(((ch.hilbri.assist.result.mapping.Processor) _createHardwareElements));
        }
        EList<IOAdapter> _ioAdapters = ((Board)modelElement).getIoAdapters();
        for (final IOAdapter io : _ioAdapters) {
          EList<ch.hilbri.assist.result.mapping.IOAdapter> _ioAdapters_1 = b.getIoAdapters();
          EObject _createHardwareElements_1 = ResultFactoryFromSolverSolutions.createHardwareElements(io);
          _ioAdapters_1.add(((ch.hilbri.assist.result.mapping.IOAdapter) _createHardwareElements_1));
        }
        return b;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Processor) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.Processor p = ResultFactoryFromSolverSolutions.f.createProcessor();
        String _name = ((Processor)modelElement).getName();
        p.setName(_name);
        String _manufacturer = ((Processor)modelElement).getManufacturer();
        p.setManufacturer(_manufacturer);
        String _processorType = ((Processor)modelElement).getProcessorType();
        p.setProcessorType(_processorType);
        EList<Core> _cores = ((Processor)modelElement).getCores();
        for (final Core core : _cores) {
          EList<ch.hilbri.assist.result.mapping.Core> _cores_1 = p.getCores();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(core);
          _cores_1.add(((ch.hilbri.assist.result.mapping.Core) _createHardwareElements));
        }
        return p;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Core) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.Core c = ResultFactoryFromSolverSolutions.f.createCore();
        String _name = ((Core)modelElement).getName();
        c.setName(_name);
        String _architecture = ((Core)modelElement).getArchitecture();
        c.setArchitecture(_architecture);
        int _capacity = ((Core)modelElement).getCapacity();
        c.setCapacity(_capacity);
        return c;
      }
    }
    if (!_matched) {
      if (modelElement instanceof IOAdapter) {
        _matched=true;
        final ch.hilbri.assist.result.mapping.IOAdapter i = ResultFactoryFromSolverSolutions.f.createIOAdapter();
        String _name = ((IOAdapter)modelElement).getName();
        i.setName(_name);
        int _totalUnitCount = ((IOAdapter)modelElement).getTotalUnitCount();
        i.setTotalUnitCount(_totalUnitCount);
        IOAdapterType _adapterType = ((IOAdapter)modelElement).getAdapterType();
        i.setAdapterType(_adapterType);
        IOAdapterProtectionLevelType _protectionLevel = ((IOAdapter)modelElement).getProtectionLevel();
        i.setProtectionLevel(_protectionLevel);
        return i;
      }
    }
    return null;
  }
  
  private static Result createBasicResult(final AssistModel model, final String resultName) {
    ResultFactoryFromSolverSolutions.f = MappingFactory.eINSTANCE;
    final Result result = ResultFactoryFromSolverSolutions.f.createResult();
    result.setName(resultName);
    String _systemName = model.getSystemName();
    result.setSystemName(_systemName);
    EList<HardwareElementContainer> _hardwareContainer = model.getHardwareContainer();
    for (final HardwareElementContainer elem : _hardwareContainer) {
      EList<HardwareElement> _rootHardwareElements = result.getRootHardwareElements();
      EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(elem);
      _rootHardwareElements.add(((HardwareElement) _createHardwareElements));
    }
    return result;
  }
  
  public static ArrayList<Result> create(final AssistModel model, final SolverVariablesContainer solverVariables, final Domain[][] solverSolutions) {
    final ArrayList<Result> results = new ArrayList<Result>();
    for (int i = 0; (i < solverSolutions.length); i++) {
      {
        final Result result = ResultFactoryFromSolverSolutions.createBasicResult(model, ("Result-" + Integer.valueOf(i)));
        results.add(result);
      }
    }
    return results;
  }
}

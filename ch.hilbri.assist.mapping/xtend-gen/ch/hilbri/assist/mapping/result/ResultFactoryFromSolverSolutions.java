package ch.hilbri.assist.mapping.result;

import ch.hilbri.assist.application.helpers.ConsoleCommands;
import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.HardwareElementContainer;
import ch.hilbri.assist.datamodel.model.IOAdapter;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.datamodel.model.Processor;
import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Evaluation;
import ch.hilbri.assist.datamodel.result.mapping.MappingFactory;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import solver.search.solution.Solution;
import solver.variables.IntVar;

@SuppressWarnings("all")
public class ResultFactoryFromSolverSolutions {
  private static MappingFactory f;
  
  private static void fillApplicationGroupMembers(final ApplicationGroup modelAppGroup, final Result result) {
    final ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup appGroup = result.findResultApplicationGroup(modelAppGroup);
    boolean _equals = Objects.equal(appGroup, null);
    if (_equals) {
      return;
    }
    EList<ApplicationOrApplicationGroup> _applicationsOrGroups = modelAppGroup.getApplicationsOrGroups();
    for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
      boolean _matched = false;
      if (!_matched) {
        if (aog instanceof Application) {
          _matched=true;
          EList<ch.hilbri.assist.datamodel.result.mapping.Application> _applications = appGroup.getApplications();
          ch.hilbri.assist.datamodel.result.mapping.Application _findResultApplication = result.findResultApplication(((Application)aog));
          _applications.add(_findResultApplication);
        }
      }
      if (!_matched) {
        if (aog instanceof ApplicationGroup) {
          _matched=true;
          EList<ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup> _applicationGroups = appGroup.getApplicationGroups();
          ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup _findResultApplicationGroup = result.findResultApplicationGroup(((ApplicationGroup)aog));
          _applicationGroups.add(_findResultApplicationGroup);
        }
      }
    }
  }
  
  private static ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup createApplicationGroup(final ApplicationGroup modelAppGroup, final Result result) {
    final ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup appGroup = ResultFactoryFromSolverSolutions.f.createApplicationGroup();
    String _name = modelAppGroup.getName();
    appGroup.setName(_name);
    appGroup.setReferenceObject(modelAppGroup);
    return appGroup;
  }
  
  private static ch.hilbri.assist.datamodel.result.mapping.Application createApplication(final Application modelApp) {
    final ch.hilbri.assist.datamodel.result.mapping.Application app = ResultFactoryFromSolverSolutions.f.createApplication();
    String _name = modelApp.getName();
    app.setName(_name);
    int _coreUtilization = modelApp.getCoreUtilization();
    app.setCoreUtilization(_coreUtilization);
    int _ramUtilization = modelApp.getRamUtilization();
    app.setRamUtilization(_ramUtilization);
    int _romUtilization = modelApp.getRomUtilization();
    app.setRomUtilization(_romUtilization);
    DesignAssuranceLevelType _criticalityLevel = modelApp.getCriticalityLevel();
    app.setCriticalityLevel(_criticalityLevel);
    IOAdapterProtectionLevelType _ioAdapterProtectionLevel = modelApp.getIoAdapterProtectionLevel();
    app.setIoAdapterProtectionLevel(_ioAdapterProtectionLevel);
    int _parallelThreads = modelApp.getParallelThreads();
    app.setParallelThreads(_parallelThreads);
    String _developedBy = modelApp.getDevelopedBy();
    app.setDevelopedBy(_developedBy);
    app.setReferenceObject(modelApp);
    EList<ch.hilbri.assist.datamodel.model.Thread> _threads = modelApp.getThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread modelThread : _threads) {
      {
        final ch.hilbri.assist.datamodel.result.mapping.Thread t = ResultFactoryFromSolverSolutions.f.createThread();
        t.setReferenceObject(modelThread);
        t.setApplication(app);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = app.getThreads();
        _threads_1.add(t);
      }
    }
    return app;
  }
  
  private static EObject createHardwareElements(final EObject modelElement) {
    boolean _matched = false;
    if (!_matched) {
      if (modelElement instanceof Compartment) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.Compartment c = ResultFactoryFromSolverSolutions.f.createCompartment();
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
          EList<ch.hilbri.assist.datamodel.result.mapping.Box> _boxes_1 = c.getBoxes();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(box);
          _boxes_1.add(((ch.hilbri.assist.datamodel.result.mapping.Box) _createHardwareElements));
        }
        c.setReferenceObject(((HardwareElement)modelElement));
        return c;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Box) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.Box b = ResultFactoryFromSolverSolutions.f.createBox();
        String _name = ((Box)modelElement).getName();
        b.setName(_name);
        String _manufacturer = ((Box)modelElement).getManufacturer();
        b.setManufacturer(_manufacturer);
        EList<Board> _boards = ((Box)modelElement).getBoards();
        for (final Board board : _boards) {
          EList<ch.hilbri.assist.datamodel.result.mapping.Board> _boards_1 = b.getBoards();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(board);
          _boards_1.add(((ch.hilbri.assist.datamodel.result.mapping.Board) _createHardwareElements));
        }
        b.setReferenceObject(((HardwareElement)modelElement));
        return b;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Board) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.Board b = ResultFactoryFromSolverSolutions.f.createBoard();
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
        String _side = ((Board)modelElement).getSide();
        b.setSide(_side);
        String _ess = ((Board)modelElement).getEss();
        b.setEss(_ess);
        EList<Processor> _processors = ((Board)modelElement).getProcessors();
        for (final Processor proc : _processors) {
          EList<ch.hilbri.assist.datamodel.result.mapping.Processor> _processors_1 = b.getProcessors();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(proc);
          _processors_1.add(((ch.hilbri.assist.datamodel.result.mapping.Processor) _createHardwareElements));
        }
        EList<IOAdapter> _ioAdapters = ((Board)modelElement).getIoAdapters();
        for (final IOAdapter io : _ioAdapters) {
          EList<ch.hilbri.assist.datamodel.result.mapping.IOAdapter> _ioAdapters_1 = b.getIoAdapters();
          EObject _createHardwareElements_1 = ResultFactoryFromSolverSolutions.createHardwareElements(io);
          _ioAdapters_1.add(((ch.hilbri.assist.datamodel.result.mapping.IOAdapter) _createHardwareElements_1));
        }
        b.setReferenceObject(((HardwareElement)modelElement));
        return b;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Processor) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.Processor p = ResultFactoryFromSolverSolutions.f.createProcessor();
        String _name = ((Processor)modelElement).getName();
        p.setName(_name);
        String _manufacturer = ((Processor)modelElement).getManufacturer();
        p.setManufacturer(_manufacturer);
        String _processorType = ((Processor)modelElement).getProcessorType();
        p.setProcessorType(_processorType);
        EList<Core> _cores = ((Processor)modelElement).getCores();
        for (final Core core : _cores) {
          EList<ch.hilbri.assist.datamodel.result.mapping.Core> _cores_1 = p.getCores();
          EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(core);
          _cores_1.add(((ch.hilbri.assist.datamodel.result.mapping.Core) _createHardwareElements));
        }
        p.setReferenceObject(((HardwareElement)modelElement));
        return p;
      }
    }
    if (!_matched) {
      if (modelElement instanceof Core) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.Core c = ResultFactoryFromSolverSolutions.f.createCore();
        String _name = ((Core)modelElement).getName();
        c.setName(_name);
        String _architecture = ((Core)modelElement).getArchitecture();
        c.setArchitecture(_architecture);
        int _capacity = ((Core)modelElement).getCapacity();
        c.setCapacity(_capacity);
        c.setReferenceObject(((HardwareElement)modelElement));
        return c;
      }
    }
    if (!_matched) {
      if (modelElement instanceof IOAdapter) {
        _matched=true;
        final ch.hilbri.assist.datamodel.result.mapping.IOAdapter i = ResultFactoryFromSolverSolutions.f.createIOAdapter();
        String _name = ((IOAdapter)modelElement).getName();
        i.setName(_name);
        int _totalCount = ((IOAdapter)modelElement).getTotalCount();
        i.setTotalUnitCount(_totalCount);
        IOAdapterType _adapterType = ((IOAdapter)modelElement).getAdapterType();
        i.setAdapterType(_adapterType);
        IOAdapterProtectionLevelType _protectionLevel = ((IOAdapter)modelElement).getProtectionLevel();
        i.setProtectionLevel(_protectionLevel);
        i.setReferenceObject(((IOAdapter)modelElement));
        return i;
      }
    }
    return null;
  }
  
  private static Result createBasicResult(final AssistModel model, final String resultName) {
    final Result result = ResultFactoryFromSolverSolutions.f.createResult();
    result.setName(resultName);
    String _systemName = model.getSystemName();
    result.setSystemName(_systemName);
    EList<HardwareElementContainer> _hardwareContainer = model.getHardwareContainer();
    for (final HardwareElementContainer elem : _hardwareContainer) {
      EList<ch.hilbri.assist.datamodel.result.mapping.HardwareElement> _rootHardwareElements = result.getRootHardwareElements();
      EObject _createHardwareElements = ResultFactoryFromSolverSolutions.createHardwareElements(elem);
      _rootHardwareElements.add(((ch.hilbri.assist.datamodel.result.mapping.HardwareElement) _createHardwareElements));
    }
    EList<Application> _applications = model.getApplications();
    for (final Application modelApp : _applications) {
      EList<ch.hilbri.assist.datamodel.result.mapping.Application> _applications_1 = result.getApplications();
      ch.hilbri.assist.datamodel.result.mapping.Application _createApplication = ResultFactoryFromSolverSolutions.createApplication(modelApp);
      _applications_1.add(_createApplication);
    }
    EList<ApplicationGroup> _applicationGroups = model.getApplicationGroups();
    for (final ApplicationGroup modelAppGroup : _applicationGroups) {
      EList<ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup> _applicationGroups_1 = result.getApplicationGroups();
      ch.hilbri.assist.datamodel.result.mapping.ApplicationGroup _createApplicationGroup = ResultFactoryFromSolverSolutions.createApplicationGroup(modelAppGroup, result);
      _applicationGroups_1.add(_createApplicationGroup);
    }
    EList<ApplicationGroup> _applicationGroups_2 = model.getApplicationGroups();
    for (final ApplicationGroup modelAppGroup_1 : _applicationGroups_2) {
      ResultFactoryFromSolverSolutions.fillApplicationGroupMembers(modelAppGroup_1, result);
    }
    final Evaluation e = ResultFactoryFromSolverSolutions.f.createEvaluation();
    HashMap<AbstractMetric, Double> _hashMap = new HashMap<AbstractMetric, Double>();
    e.setAbsoluteScores(_hashMap);
    HashMap<AbstractMetric, Double> _hashMap_1 = new HashMap<AbstractMetric, Double>();
    e.setScaledScores(_hashMap_1);
    result.setEvaluation(e);
    return result;
  }
  
  public static void addMappingFromSolution(final Result result, final AssistModel model, final SolverVariablesContainer solverVariables, final Solution solution) {
    EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = model.getAllThreads();
    for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads) {
      {
        final ch.hilbri.assist.datamodel.result.mapping.Thread resultThread = result.findResultThread(thread);
        final IntVar locVar = solverVariables.getThreadLocationVariable(thread, HardwareArchitectureLevelType.CORE_VALUE);
        final int coreIndex = solution.getIntVal(locVar);
        EList<Core> _allCores = model.getAllCores();
        Core _get = _allCores.get(coreIndex);
        ch.hilbri.assist.datamodel.result.mapping.HardwareElement _findResultHardwareElement = result.findResultHardwareElement(_get);
        final ch.hilbri.assist.datamodel.result.mapping.Core resultCore = ((ch.hilbri.assist.datamodel.result.mapping.Core) _findResultHardwareElement);
        boolean _equals = Objects.equal(resultCore, null);
        if (_equals) {
          EList<Core> _allCores_1 = model.getAllCores();
          Core _get_1 = _allCores_1.get(coreIndex);
          String _plus = ("Could not find the core " + _get_1);
          String _plus_1 = (_plus + " from the model in the result.");
          ConsoleCommands.writeErrorLineToConsole(_plus_1);
          return;
        } else {
          EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = resultCore.getThreads();
          _threads.add(resultThread);
          resultThread.setCore(resultCore);
        }
      }
    }
  }
  
  public static void addUtilizationInformation(final Result result, final AssistModel model, final SolverVariablesContainer solverVariables, final Solution solution) {
    EList<ch.hilbri.assist.datamodel.result.mapping.Core> _allCores = result.getAllCores();
    for (final ch.hilbri.assist.datamodel.result.mapping.Core resultCore : _allCores) {
      {
        HardwareElement _referenceObject = resultCore.getReferenceObject();
        final Core modelCore = ((Core) _referenceObject);
        IntVar _absoluteCoreUtilizationVariable = solverVariables.getAbsoluteCoreUtilizationVariable(modelCore);
        final int absoluteUtilization = solution.getIntVal(_absoluteCoreUtilizationVariable);
        resultCore.setUtilization(absoluteUtilization);
      }
    }
    EList<ch.hilbri.assist.datamodel.result.mapping.Board> _allBoards = result.getAllBoards();
    for (final ch.hilbri.assist.datamodel.result.mapping.Board resultBoard : _allBoards) {
      {
        HardwareElement _referenceObject = resultBoard.getReferenceObject();
        final Board modelBoard = ((Board) _referenceObject);
        IntVar _absoluteRamUtilizationVariable = solverVariables.getAbsoluteRamUtilizationVariable(modelBoard);
        final int absoluteRamUtilization = solution.getIntVal(_absoluteRamUtilizationVariable);
        resultBoard.setRamUtilization(absoluteRamUtilization);
      }
    }
    EList<ch.hilbri.assist.datamodel.result.mapping.Board> _allBoards_1 = result.getAllBoards();
    for (final ch.hilbri.assist.datamodel.result.mapping.Board resultBoard_1 : _allBoards_1) {
      {
        HardwareElement _referenceObject = resultBoard_1.getReferenceObject();
        final Board modelBoard = ((Board) _referenceObject);
        IntVar _absoluteRomUtilizationVariable = solverVariables.getAbsoluteRomUtilizationVariable(modelBoard);
        final int absoluteRomUtilization = solution.getIntVal(_absoluteRomUtilizationVariable);
        resultBoard_1.setRomUtilization(absoluteRomUtilization);
      }
    }
  }
  
  public static ArrayList<Result> create(final AssistModel model, final SolverVariablesContainer solverVariables, final List<Solution> solverSolutions) {
    ResultFactoryFromSolverSolutions.f = MappingFactory.eINSTANCE;
    final ArrayList<Result> results = new ArrayList<Result>();
    for (final Solution solution : solverSolutions) {
      {
        int _indexOf = solverSolutions.indexOf(solution);
        String _plus = ("Result-" + Integer.valueOf(_indexOf));
        final Result result = ResultFactoryFromSolverSolutions.createBasicResult(model, _plus);
        ResultFactoryFromSolverSolutions.addMappingFromSolution(result, model, solverVariables, solution);
        ResultFactoryFromSolverSolutions.addUtilizationInformation(result, model, solverVariables, solution);
        results.add(result);
      }
    }
    return results;
  }
}

package ch.hilbri.assist.mapping.tests.results;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Box;
import ch.hilbri.assist.datamodel.result.mapping.Compartment;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.HardwareElement;
import ch.hilbri.assist.datamodel.result.mapping.Processor;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.SolverJob;
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(MappingDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class BasicResultTests {
  private String input = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Global {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("System name = \"Simple System\";");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Hardware {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Compartment C1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Manufacturer = \"CompartmentManufacturer\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Power supply = \"CompartmentPowerSupply\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Side\t\t = \"CompartmentSide\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Zone\t\t = \"CompartmentZone\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Box Box1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Manufacturer = \"BoxManufacturer\";");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Board Board1 {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Manufacturer = \"Board Vendor 1\";");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Type\t\t = \"BoardType\";");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Power supply = \"BoardPowerSupply\";");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Design assurance level = C;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Processor Processor1 {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Manufacturer = \"Freescale\";");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Type = \"MPC5554\";");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Core Core1 {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Capacity = 100;   ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Architecture = \"e200z6\";");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("RAM capacity = 12345;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("ROM capacity = 67890;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Software {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Application A1   {\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Core-utilization \t\t\t= 10;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Required RAM capacity \t\t= 12345; ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Required ROM capacity \t\t= 34567; ");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("Criticality level \t\t\t= D;");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("Required IO protection \t\t= L2;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Identical parallel threads \t= 3;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Developed by \t\t\t\t= \"Company A\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  private AssistModel model;
  
  private ArrayList<Result> allResults;
  
  @Inject
  private ParseHelper<AssistModel> parser;
  
  @BeforeClass
  public static void registerEPackage() {
    ModelPackage.eINSTANCE.eClass();
  }
  
  @Before
  public void loadModelAndCreateResults() {
    try {
      AssistModel _parse = this.parser.parse(this.input);
      this.model = ((AssistModel) _parse);
      PostProcessor.createMissingThreads(this.model);
      Assert.assertNotNull(this.model);
      final SolverJob findSolutionsJob = new SolverJob("", this.model, null);
      findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE);
      findSolutionsJob.setMaxSolutions(1000);
      Assert.assertNotNull(findSolutionsJob);
      MyTestingMonitor _myTestingMonitor = new MyTestingMonitor();
      findSolutionsJob.execute(_myTestingMonitor, false);
      ArrayList<Result> _newMappingResults = findSolutionsJob.getNewMappingResults();
      this.allResults = _newMappingResults;
      Assert.assertNotNull(this.allResults);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals("There should be only 1 result", 1, _size);
  }
  
  @Test
  public void testResultStructure() {
    final Result r = this.allResults.get(0);
    HardwareArchitectureLevelType _topHardwareLevel = r.getTopHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.COMPARTMENT, _topHardwareLevel);
    EList<HardwareElement> _rootHardwareElements = r.getRootHardwareElements();
    int _size = _rootHardwareElements.size();
    Assert.assertEquals(1, _size);
    EList<HardwareElement> _rootHardwareElements_1 = r.getRootHardwareElements();
    HardwareElement _get = _rootHardwareElements_1.get(0);
    Assert.assertTrue((_get instanceof Compartment));
    EList<HardwareElement> _rootHardwareElements_2 = r.getRootHardwareElements();
    HardwareElement _get_1 = _rootHardwareElements_2.get(0);
    final Compartment c = ((Compartment) _get_1);
    String _name = c.getName();
    Assert.assertEquals("C1", _name);
    String _manufacturer = c.getManufacturer();
    Assert.assertEquals("CompartmentManufacturer", _manufacturer);
    String _powerSupply = c.getPowerSupply();
    Assert.assertEquals("CompartmentPowerSupply", _powerSupply);
    String _side = c.getSide();
    Assert.assertEquals("CompartmentSide", _side);
    String _zone = c.getZone();
    Assert.assertEquals("CompartmentZone", _zone);
    HardwareArchitectureLevelType _hardwareLevel = c.getHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.COMPARTMENT, _hardwareLevel);
    EList<Box> _boxes = c.getBoxes();
    int _size_1 = _boxes.size();
    Assert.assertEquals(1, _size_1);
    EList<Box> _boxes_1 = c.getBoxes();
    final Box b = _boxes_1.get(0);
    String _name_1 = b.getName();
    Assert.assertEquals("Box1", _name_1);
    String _manufacturer_1 = b.getManufacturer();
    Assert.assertEquals("BoxManufacturer", _manufacturer_1);
    HardwareArchitectureLevelType _hardwareLevel_1 = b.getHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.BOX, _hardwareLevel_1);
    EObject _eContainer = b.eContainer();
    Assert.assertEquals(c, _eContainer);
    EList<Board> _boards = b.getBoards();
    int _size_2 = _boards.size();
    Assert.assertEquals(1, _size_2);
    EList<Board> _boards_1 = b.getBoards();
    final Board board = _boards_1.get(0);
    String _name_2 = board.getName();
    Assert.assertEquals("Board1", _name_2);
    String _manufacturer_2 = board.getManufacturer();
    Assert.assertEquals("Board Vendor 1", _manufacturer_2);
    String _boardType = board.getBoardType();
    Assert.assertEquals("BoardType", _boardType);
    String _powerSupply_1 = board.getPowerSupply();
    Assert.assertEquals("BoardPowerSupply", _powerSupply_1);
    DesignAssuranceLevelType _assuranceLevel = board.getAssuranceLevel();
    Assert.assertEquals(DesignAssuranceLevelType.C, _assuranceLevel);
    int _ramCapacity = board.getRamCapacity();
    Assert.assertEquals(12345, _ramCapacity);
    int _romCapacity = board.getRomCapacity();
    Assert.assertEquals(67890, _romCapacity);
    HardwareArchitectureLevelType _hardwareLevel_2 = board.getHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.BOARD, _hardwareLevel_2);
    EObject _eContainer_1 = board.eContainer();
    Assert.assertEquals(b, _eContainer_1);
    EList<Processor> _processors = board.getProcessors();
    int _size_3 = _processors.size();
    Assert.assertEquals(1, _size_3);
    EList<Processor> _processors_1 = board.getProcessors();
    final Processor p = _processors_1.get(0);
    String _name_3 = p.getName();
    Assert.assertEquals("Processor1", _name_3);
    String _manufacturer_3 = p.getManufacturer();
    Assert.assertEquals("Freescale", _manufacturer_3);
    String _processorType = p.getProcessorType();
    Assert.assertEquals("MPC5554", _processorType);
    HardwareArchitectureLevelType _hardwareLevel_3 = p.getHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.PROCESSOR, _hardwareLevel_3);
    EObject _eContainer_2 = p.eContainer();
    Assert.assertEquals(board, _eContainer_2);
    EList<Core> _cores = p.getCores();
    int _size_4 = _cores.size();
    Assert.assertEquals(1, _size_4);
    EList<Core> _cores_1 = p.getCores();
    final Core core = _cores_1.get(0);
    String _name_4 = core.getName();
    Assert.assertEquals("Core1", _name_4);
    int _capacity = core.getCapacity();
    Assert.assertEquals(100, _capacity);
    String _architecture = core.getArchitecture();
    Assert.assertEquals("e200z6", _architecture);
    HardwareArchitectureLevelType _hardwareLevel_4 = core.getHardwareLevel();
    Assert.assertEquals(HardwareArchitectureLevelType.CORE, _hardwareLevel_4);
    EObject _eContainer_3 = core.eContainer();
    Assert.assertEquals(p, _eContainer_3);
    EList<Application> _applications = this.model.getApplications();
    int _size_5 = _applications.size();
    Assert.assertEquals(1, _size_5);
    EList<Application> _applications_1 = this.model.getApplications();
    final Application a = _applications_1.get(0);
    String _name_5 = a.getName();
    Assert.assertEquals("A1", _name_5);
    int _coreUtilization = a.getCoreUtilization();
    Assert.assertEquals(10, _coreUtilization);
    int _ramUtilization = a.getRamUtilization();
    Assert.assertEquals(12345, _ramUtilization);
    int _romUtilization = a.getRomUtilization();
    Assert.assertEquals(34567, _romUtilization);
    DesignAssuranceLevelType _criticalityLevel = a.getCriticalityLevel();
    Assert.assertEquals(DesignAssuranceLevelType.D, _criticalityLevel);
    IOAdapterProtectionLevelType _ioAdapterProtectionLevel = a.getIoAdapterProtectionLevel();
    Assert.assertEquals(IOAdapterProtectionLevelType.LEVEL_2, _ioAdapterProtectionLevel);
    String _developedBy = a.getDevelopedBy();
    Assert.assertEquals("Company A", _developedBy);
    EList<ch.hilbri.assist.datamodel.model.Thread> _threads = a.getThreads();
    int _size_6 = _threads.size();
    Assert.assertEquals(3, _size_6);
    for (final Integer i : new IntegerRange(0, 2)) {
      {
        String _name_6 = a.getName();
        String _plus = (_name_6 + "_");
        String _plus_1 = (_plus + Integer.valueOf(((i).intValue() + 1)));
        EList<ch.hilbri.assist.datamodel.model.Thread> _threads_1 = a.getThreads();
        ch.hilbri.assist.datamodel.model.Thread _get_2 = _threads_1.get((i).intValue());
        String _name_7 = _get_2.getName();
        Assert.assertEquals(_plus_1, _name_7);
        int _coreUtilization_1 = a.getCoreUtilization();
        EList<ch.hilbri.assist.datamodel.model.Thread> _threads_2 = a.getThreads();
        ch.hilbri.assist.datamodel.model.Thread _get_3 = _threads_2.get((i).intValue());
        int _coreUtilization_2 = _get_3.getCoreUtilization();
        Assert.assertEquals(_coreUtilization_1, _coreUtilization_2);
        EList<ch.hilbri.assist.datamodel.model.Thread> _threads_3 = a.getThreads();
        ch.hilbri.assist.datamodel.model.Thread _get_4 = _threads_3.get((i).intValue());
        EObject _eContainer_4 = _get_4.eContainer();
        Assert.assertEquals(a, _eContainer_4);
      }
    }
  }
  
  @Test
  public void testGetAllAccessFunctions() {
    final Result result = this.allResults.get(0);
    final EList<Compartment> allCompartmentsList = result.getAllCompartments();
    int _size = allCompartmentsList.size();
    Assert.assertEquals(1, _size);
    final Compartment compartment = allCompartmentsList.get(0);
    Assert.assertTrue((compartment instanceof Compartment));
    EList<HardwareElement> _rootHardwareElements = result.getRootHardwareElements();
    HardwareElement _get = _rootHardwareElements.get(0);
    Assert.assertEquals(_get, compartment);
    final EList<Box> allBoxesList = result.getAllBoxes();
    int _size_1 = allBoxesList.size();
    Assert.assertEquals(1, _size_1);
    final Box box = allBoxesList.get(0);
    Assert.assertTrue((box instanceof Box));
    EList<HardwareElement> _rootHardwareElements_1 = result.getRootHardwareElements();
    HardwareElement _get_1 = _rootHardwareElements_1.get(0);
    EList<Box> _boxes = ((Compartment) _get_1).getBoxes();
    Box _get_2 = _boxes.get(0);
    Assert.assertEquals(_get_2, box);
    final EList<Board> allBoardsList = result.getAllBoards();
    int _size_2 = allBoardsList.size();
    Assert.assertEquals(1, _size_2);
    final Board board = allBoardsList.get(0);
    Assert.assertTrue((board instanceof Board));
    EList<HardwareElement> _rootHardwareElements_2 = result.getRootHardwareElements();
    HardwareElement _get_3 = _rootHardwareElements_2.get(0);
    EList<Box> _boxes_1 = ((Compartment) _get_3).getBoxes();
    Box _get_4 = _boxes_1.get(0);
    EList<Board> _boards = _get_4.getBoards();
    Board _get_5 = _boards.get(0);
    Assert.assertEquals(_get_5, board);
    final EList<Processor> allProcessorsList = result.getAllProcessors();
    int _size_3 = allProcessorsList.size();
    Assert.assertEquals(1, _size_3);
    final Processor processor = allProcessorsList.get(0);
    Assert.assertTrue((processor instanceof Processor));
    EList<HardwareElement> _rootHardwareElements_3 = result.getRootHardwareElements();
    HardwareElement _get_6 = _rootHardwareElements_3.get(0);
    EList<Box> _boxes_2 = ((Compartment) _get_6).getBoxes();
    Box _get_7 = _boxes_2.get(0);
    EList<Board> _boards_1 = _get_7.getBoards();
    Board _get_8 = _boards_1.get(0);
    EList<Processor> _processors = _get_8.getProcessors();
    Processor _get_9 = _processors.get(0);
    Assert.assertEquals(_get_9, processor);
    final EList<Core> allCoresList = result.getAllCores();
    int _size_4 = allCoresList.size();
    Assert.assertEquals(1, _size_4);
    final Core core = allCoresList.get(0);
    Assert.assertTrue((core instanceof Core));
    EList<HardwareElement> _rootHardwareElements_4 = result.getRootHardwareElements();
    HardwareElement _get_10 = _rootHardwareElements_4.get(0);
    EList<Box> _boxes_3 = ((Compartment) _get_10).getBoxes();
    Box _get_11 = _boxes_3.get(0);
    EList<Board> _boards_2 = _get_11.getBoards();
    Board _get_12 = _boards_2.get(0);
    EList<Processor> _processors_1 = _get_12.getProcessors();
    Processor _get_13 = _processors_1.get(0);
    EList<Core> _cores = _get_13.getCores();
    Core _get_14 = _cores.get(0);
    Assert.assertEquals(_get_14, core);
    final EList<ch.hilbri.assist.datamodel.result.mapping.Thread> allThreadsList = result.getAllThreads();
    int _size_5 = allThreadsList.size();
    Assert.assertEquals(3, _size_5);
    for (final Integer i : new IntegerRange(0, 2)) {
      {
        final ch.hilbri.assist.datamodel.result.mapping.Thread thread = allThreadsList.get((i).intValue());
        Assert.assertTrue((thread instanceof ch.hilbri.assist.datamodel.result.mapping.Thread));
        EList<ch.hilbri.assist.datamodel.result.mapping.Application> _applications = result.getApplications();
        ch.hilbri.assist.datamodel.result.mapping.Application _get_15 = _applications.get(0);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get_15.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_16 = _threads.get((i).intValue());
        Assert.assertEquals(_get_16, thread);
      }
    }
  }
  
  @Test
  public void testMappingAssignment() {
    Result _get = this.allResults.get(0);
    EList<Core> _allCores = _get.getAllCores();
    final Core core = _allCores.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = core.getThreads();
    int _size = _threads.size();
    Assert.assertEquals(3, _size);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = core.getThreads();
    for (final ch.hilbri.assist.datamodel.result.mapping.Thread thread : _threads_1) {
      Result _get_1 = this.allResults.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _allThreads = _get_1.getAllThreads();
      boolean _contains = _allThreads.contains(thread);
      Assert.assertTrue(_contains);
    }
    Result _get_2 = this.allResults.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _allThreads_1 = _get_2.getAllThreads();
    for (final ch.hilbri.assist.datamodel.result.mapping.Thread thread_1 : _allThreads_1) {
      Core _core = thread_1.getCore();
      Assert.assertEquals(_core, core);
    }
  }
  
  @Test
  public void testUtilizationAfterMapping() {
    Assert.fail();
  }
}

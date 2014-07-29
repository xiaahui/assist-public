package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Application;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.SolverJob;
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(MappingDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class CoreCapacityTests {
  private String input = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Global {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("System name = \"System name\";");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Hardware {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Board Board1 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Processor Processor1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Core Core1 { Capacity = 100; }");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Core Core2 { Capacity = 100; }");
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
      _builder.append("Application A1   {\tCore-utilization = 60; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Application A2   {\tCore-utilization = 70; }");
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
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testResult_A1_on_Core1_and_A2_on_Core2() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("Core1");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("Core2");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores = result.getAllCores();
    Core _get_4 = _allCores.get(0);
    String _name_2 = _get_4.getName();
    Assert.assertEquals(_name_2, "Core1");
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_5 = _allCores_1.get(0);
    int _utilization = _get_5.getUtilization();
    Assert.assertEquals(_utilization, 60);
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_6 = _allCores_2.get(1);
    String _name_3 = _get_6.getName();
    Assert.assertEquals(_name_3, "Core2");
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_7 = _allCores_3.get(1);
    int _utilization_1 = _get_7.getUtilization();
    Assert.assertEquals(_utilization_1, 70);
  }
  
  @Test
  public void testResult_A1_on_Core2_and_A2_on_Core1() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("Core2");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("Core1");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores = result.getAllCores();
    Core _get_4 = _allCores.get(0);
    String _name_2 = _get_4.getName();
    Assert.assertEquals(_name_2, "Core1");
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_5 = _allCores_1.get(0);
    int _utilization = _get_5.getUtilization();
    Assert.assertEquals(_utilization, 70);
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_6 = _allCores_2.get(1);
    String _name_3 = _get_6.getName();
    Assert.assertEquals(_name_3, "Core2");
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_7 = _allCores_3.get(1);
    int _utilization_1 = _get_7.getUtilization();
    Assert.assertEquals(_utilization_1, 60);
  }
}

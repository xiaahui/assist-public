package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.datamodel.result.mapping.Application;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.tests.AbstractMappingTest;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class NoPermutationsAdvancedTests extends AbstractMappingTest {
  public NoPermutationsAdvancedTests() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
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
    _builder.append("Application A1   {\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Core-utilization = 70;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Identical parallel threads = 2; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Application A2   {\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Core-utilization = 25;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testResultThread1OnCore1_and_Thread2OnCore2_and_A2OnCore1() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      boolean _and_1 = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("Core1");
      if (!_equals) {
        _and_1 = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(0);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(1);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("Core2");
        _and_1 = _equals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        EList<Application> _applications_2 = r.getApplications();
        Application _get_4 = _applications_2.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_2 = _get_4.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_5 = _threads_2.get(0);
        Core _core_2 = _get_5.getCore();
        String _name_2 = _core_2.getName();
        boolean _equals_2 = _name_2.equals("Core1");
        _and = _equals_2;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores = result.getAllCores();
    Core _get_6 = _allCores.get(0);
    String _name_3 = _get_6.getName();
    Assert.assertEquals(_name_3, "Core1");
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_7 = _allCores_1.get(1);
    String _name_4 = _get_7.getName();
    Assert.assertEquals(_name_4, "Core2");
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_8 = _allCores_2.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_3 = _get_8.getThreads();
    int _size = _threads_3.size();
    Assert.assertEquals(2, _size);
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_9 = _allCores_3.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_4 = _get_9.getThreads();
    int _size_1 = _threads_4.size();
    Assert.assertEquals(1, _size_1);
    EList<Core> _allCores_4 = result.getAllCores();
    Core _get_10 = _allCores_4.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_5 = _get_10.getThreads();
    EList<Application> _applications_3 = result.getApplications();
    Application _get_11 = _applications_3.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_6 = _get_11.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_12 = _threads_6.get(0);
    boolean _contains = _threads_5.contains(_get_12);
    Assert.assertTrue(_contains);
    EList<Core> _allCores_5 = result.getAllCores();
    Core _get_13 = _allCores_5.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_7 = _get_13.getThreads();
    EList<Application> _applications_4 = result.getApplications();
    Application _get_14 = _applications_4.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_8 = _get_14.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_15 = _threads_8.get(1);
    boolean _contains_1 = _threads_7.contains(_get_15);
    Assert.assertTrue(_contains_1);
    EList<Core> _allCores_6 = result.getAllCores();
    Core _get_16 = _allCores_6.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_9 = _get_16.getThreads();
    EList<Application> _applications_5 = result.getApplications();
    Application _get_17 = _applications_5.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_10 = _get_17.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_18 = _threads_10.get(0);
    boolean _contains_2 = _threads_9.contains(_get_18);
    Assert.assertTrue(_contains_2);
  }
  
  @Test
  public void testResultThread1OnCore1_and_Thread2OnCore2_and_A2OnCore2() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      boolean _and_1 = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("Core1");
      if (!_equals) {
        _and_1 = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(0);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(1);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("Core2");
        _and_1 = _equals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        EList<Application> _applications_2 = r.getApplications();
        Application _get_4 = _applications_2.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_2 = _get_4.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_5 = _threads_2.get(0);
        Core _core_2 = _get_5.getCore();
        String _name_2 = _core_2.getName();
        boolean _equals_2 = _name_2.equals("Core2");
        _and = _equals_2;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores = result.getAllCores();
    Core _get_6 = _allCores.get(0);
    String _name_3 = _get_6.getName();
    Assert.assertEquals(_name_3, "Core1");
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_7 = _allCores_1.get(1);
    String _name_4 = _get_7.getName();
    Assert.assertEquals(_name_4, "Core2");
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_8 = _allCores_2.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_3 = _get_8.getThreads();
    int _size = _threads_3.size();
    Assert.assertEquals(1, _size);
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_9 = _allCores_3.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_4 = _get_9.getThreads();
    int _size_1 = _threads_4.size();
    Assert.assertEquals(2, _size_1);
    EList<Core> _allCores_4 = result.getAllCores();
    Core _get_10 = _allCores_4.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_5 = _get_10.getThreads();
    EList<Application> _applications_3 = result.getApplications();
    Application _get_11 = _applications_3.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_6 = _get_11.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_12 = _threads_6.get(0);
    boolean _contains = _threads_5.contains(_get_12);
    Assert.assertTrue(_contains);
    EList<Core> _allCores_5 = result.getAllCores();
    Core _get_13 = _allCores_5.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_7 = _get_13.getThreads();
    EList<Application> _applications_4 = result.getApplications();
    Application _get_14 = _applications_4.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_8 = _get_14.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_15 = _threads_8.get(1);
    boolean _contains_1 = _threads_7.contains(_get_15);
    Assert.assertTrue(_contains_1);
    EList<Core> _allCores_6 = result.getAllCores();
    Core _get_16 = _allCores_6.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_9 = _get_16.getThreads();
    EList<Application> _applications_5 = result.getApplications();
    Application _get_17 = _applications_5.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_10 = _get_17.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_18 = _threads_10.get(0);
    boolean _contains_2 = _threads_9.contains(_get_18);
    Assert.assertTrue(_contains_2);
  }
}

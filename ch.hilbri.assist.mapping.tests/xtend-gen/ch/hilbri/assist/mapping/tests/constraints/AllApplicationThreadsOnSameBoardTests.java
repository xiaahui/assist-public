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
public class AllApplicationThreadsOnSameBoardTests extends AbstractMappingTest {
  public AllApplicationThreadsOnSameBoardTests() {
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
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Board Board2 {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Processor Processor2 {");
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
    _builder.append("Core-utilization = 40; \t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Identical parallel threads = 2;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals(2, _size);
  }
  
  @Test
  public void testResultCore2IsEmpty() {
    Result result = null;
    for (final Result r : this.allResults) {
      EList<Core> _allCores = r.getAllCores();
      Core _get = _allCores.get(1);
      boolean _isNotUsed = _get.isNotUsed();
      if (_isNotUsed) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_1 = _allCores_1.get(0);
    String _name = _get_1.getName();
    Assert.assertEquals(_name, "Core1");
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_2 = _allCores_2.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get_2.getThreads();
    int _size = _threads.size();
    Assert.assertEquals(2, _size);
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_3 = _allCores_3.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_3.getThreads();
    int _size_1 = _threads_1.size();
    Assert.assertEquals(0, _size_1);
    EList<Core> _allCores_4 = result.getAllCores();
    Core _get_4 = _allCores_4.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_2 = _get_4.getThreads();
    EList<Application> _applications = result.getApplications();
    Application _get_5 = _applications.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_3 = _get_5.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_6 = _threads_3.get(0);
    boolean _contains = _threads_2.contains(_get_6);
    Assert.assertTrue(_contains);
    EList<Core> _allCores_5 = result.getAllCores();
    Core _get_7 = _allCores_5.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_4 = _get_7.getThreads();
    EList<Application> _applications_1 = result.getApplications();
    Application _get_8 = _applications_1.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_5 = _get_8.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_9 = _threads_5.get(1);
    boolean _contains_1 = _threads_4.contains(_get_9);
    Assert.assertTrue(_contains_1);
  }
  
  @Test
  public void testResultCore1IsEmpty() {
    Result result = null;
    for (final Result r : this.allResults) {
      EList<Core> _allCores = r.getAllCores();
      Core _get = _allCores.get(0);
      boolean _isNotUsed = _get.isNotUsed();
      if (_isNotUsed) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_1 = _allCores_1.get(1);
    String _name = _get_1.getName();
    Assert.assertEquals(_name, "Core2");
    EList<Core> _allCores_2 = result.getAllCores();
    Core _get_2 = _allCores_2.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get_2.getThreads();
    int _size = _threads.size();
    Assert.assertEquals(0, _size);
    EList<Core> _allCores_3 = result.getAllCores();
    Core _get_3 = _allCores_3.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_3.getThreads();
    int _size_1 = _threads_1.size();
    Assert.assertEquals(2, _size_1);
    EList<Core> _allCores_4 = result.getAllCores();
    Core _get_4 = _allCores_4.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_2 = _get_4.getThreads();
    EList<Application> _applications = result.getApplications();
    Application _get_5 = _applications.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_3 = _get_5.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_6 = _threads_3.get(0);
    boolean _contains = _threads_2.contains(_get_6);
    Assert.assertTrue(_contains);
    EList<Core> _allCores_5 = result.getAllCores();
    Core _get_7 = _allCores_5.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_4 = _get_7.getThreads();
    EList<Application> _applications_1 = result.getApplications();
    Application _get_8 = _applications_1.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_5 = _get_8.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_9 = _threads_5.get(1);
    boolean _contains_1 = _threads_4.contains(_get_9);
    Assert.assertTrue(_contains_1);
  }
}

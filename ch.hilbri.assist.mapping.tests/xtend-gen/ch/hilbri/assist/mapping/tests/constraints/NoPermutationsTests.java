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
public class NoPermutationsTests extends AbstractMappingTest {
  public NoPermutationsTests() {
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
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals(1, _size);
  }
  
  @Test
  public void testResultThread1OnCore1_and_Thread2OnCore2() {
    final Result result = this.allResults.get(0);
    Assert.assertNotNull(result);
    EList<Application> _applications = result.getApplications();
    Application _get = _applications.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
    EList<Core> _allCores = result.getAllCores();
    Core _get_2 = _allCores.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
    Assert.assertEquals(_get_1, _get_3);
    EList<Application> _applications_1 = result.getApplications();
    Application _get_4 = _applications_1.get(0);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_2 = _get_4.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_5 = _threads_2.get(1);
    EList<Core> _allCores_1 = result.getAllCores();
    Core _get_6 = _allCores_1.get(1);
    EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_3 = _get_6.getThreads();
    ch.hilbri.assist.datamodel.result.mapping.Thread _get_7 = _threads_3.get(0);
    Assert.assertEquals(_get_5, _get_7);
  }
}

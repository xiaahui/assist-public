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
public class DesignAssuranceLevelTests extends AbstractMappingTest {
  public DesignAssuranceLevelTests() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("Global { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System name = \"SystemA\";");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Hardware {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Board B_A {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DesignAssuranceLevel = A;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Processor P_A {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Core C_A { Capacity = 80; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("Board B_B {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DesignAssuranceLevel = B;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Processor P_B {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Core C_B { Capacity = 80; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("Board B_C {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DesignAssuranceLevel = C;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Processor P_C {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Core C_C { Capacity = 80; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Software {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Application A1 {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Core-utilization = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Criticality level = B;");
    _builder.newLine();
    _builder.append("\t");
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
  public void testA1onBoardB_A() {
    Result result = null;
    for (final Result r : this.allResults) {
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_A");
      if (_equals) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void testA1onBoardB_B() {
    Result result = null;
    for (final Result r : this.allResults) {
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_B");
      if (_equals) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
}

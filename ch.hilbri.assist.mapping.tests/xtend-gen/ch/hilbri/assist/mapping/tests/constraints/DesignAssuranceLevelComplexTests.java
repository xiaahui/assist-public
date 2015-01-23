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
public class DesignAssuranceLevelComplexTests extends AbstractMappingTest {
  public DesignAssuranceLevelComplexTests() {
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
    _builder.append("Board B1 {");
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
    _builder.append("Board B2 {");
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
    _builder.append("Board B3 {");
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
    _builder.append(" \t");
    _builder.append("Board B4 {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DesignAssuranceLevel = D;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Processor P_D {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Core C_D { Capacity = 80; }");
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Application A2 {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Core-utilization = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Criticality level = C;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals(6, _size);
  }
  
  @Test
  public void test_A1onB1_And_A2onB1() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_A");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_A");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void test_A1onB1_And_A2onB2() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_A");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_B");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void test_A1onB1_And_A2onB3() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_A");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_C");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void test_A1onB2_And_A2onB1() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_B");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_A");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void test_A1onB2_And_A2onB2() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_B");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_B");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
  
  @Test
  public void test_A1onB2_And_A2onB3() {
    Result result = null;
    for (final Result r : this.allResults) {
      boolean _and = false;
      EList<Application> _applications = r.getApplications();
      Application _get = _applications.get(0);
      EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = _get.getThreads();
      ch.hilbri.assist.datamodel.result.mapping.Thread _get_1 = _threads.get(0);
      Core _core = _get_1.getCore();
      String _name = _core.getName();
      boolean _equals = _name.equals("C_B");
      if (!_equals) {
        _and = false;
      } else {
        EList<Application> _applications_1 = r.getApplications();
        Application _get_2 = _applications_1.get(1);
        EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads_1 = _get_2.getThreads();
        ch.hilbri.assist.datamodel.result.mapping.Thread _get_3 = _threads_1.get(0);
        Core _core_1 = _get_3.getCore();
        String _name_1 = _core_1.getName();
        boolean _equals_1 = _name_1.equals("C_C");
        _and = _equals_1;
      }
      if (_and) {
        result = r;
      }
    }
    Assert.assertNotNull(result);
  }
}

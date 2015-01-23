package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.mapping.tests.AbstractMappingTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class DesignAssuranceLevelTestsInvalid extends AbstractMappingTest {
  public DesignAssuranceLevelTestsInvalid() {
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
    _builder.append("DesignAssuranceLevel = B;");
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
    _builder.append("Criticality level = A;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Test
  public void testResultCount() {
    int _size = this.allResults.size();
    Assert.assertEquals(0, _size);
  }
}

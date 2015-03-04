package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.mapping.tests.AbstractMappingTest;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CoreCapacityTests extends AbstractMappingTest {
  public CoreCapacityTests() {
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
    _builder.append("Application A1   {\tCore-utilization = 60; }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Application A2   {\tCore-utilization = 70; }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    this.input = _builder.toString();
  }
}

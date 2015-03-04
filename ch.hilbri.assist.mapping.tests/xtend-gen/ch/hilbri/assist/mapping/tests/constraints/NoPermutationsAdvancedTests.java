package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.mapping.tests.AbstractMappingTest;
import org.eclipse.xtend2.lib.StringConcatenation;

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
}

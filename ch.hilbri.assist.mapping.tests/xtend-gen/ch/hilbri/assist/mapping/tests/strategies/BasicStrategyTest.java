package ch.hilbri.assist.mapping.tests.strategies;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.mapping.solver.AssistSolver;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.tests.constraints.AbstractMappingTest;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InjectWith(MappingDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class BasicStrategyTest {
  private String input;
  
  private AssistModel model;
  
  private Logger logger;
  
  public BasicStrategyTest() {
    Logger _logger = LoggerFactory.getLogger(AbstractMappingTest.class);
    this.logger = _logger;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Global { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System name = \"Example System\";");
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
    _builder.append("Processor P1 {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Core C1 {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Capacity = 100;");
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
    _builder.append("Application A1 {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Core-utilization = 1;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    this.input = _builder.toString();
  }
  
  @Inject
  protected ParseHelper<AssistModel> parser;
  
  @Test
  public void checkAllStrategiesRunProperly() {
    try {
      ModelPackage.eINSTANCE.eClass();
      AssistModel _parse = this.parser.parse(this.input);
      this.model = ((AssistModel) _parse);
      Assert.assertNotNull(this.model);
      SearchType[] _values = SearchType.values();
      for (final SearchType searchType : _values) {
        {
          final AssistSolver solver = new AssistSolver(this.model);
          Assert.assertNotNull(solver);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

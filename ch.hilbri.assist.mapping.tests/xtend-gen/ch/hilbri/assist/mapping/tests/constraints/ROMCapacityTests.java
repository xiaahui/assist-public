package ch.hilbri.assist.mapping.tests.constraints;

import ch.hilbri.assist.datamodel.result.mapping.Application;
import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.tests.AbstractMappingTest;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ROMCapacityTests extends AbstractMappingTest {
  public ROMCapacityTests() {
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
    _builder.append("\t\t");
    _builder.append("ROM capacity = 100;");
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
    _builder.append("\t\t");
    _builder.append("ROM capacity = 100;");
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
    _builder.append("Core-utilization = 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Required ROM capacity = 70;");
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
    _builder.append("Core-utilization = 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Required ROM capacity = 60;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
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
    EList<Board> _allBoards = result.getAllBoards();
    Board _get_4 = _allBoards.get(0);
    String _name_2 = _get_4.getName();
    Assert.assertEquals(_name_2, "Board1");
    EList<Board> _allBoards_1 = result.getAllBoards();
    Board _get_5 = _allBoards_1.get(0);
    int _romUtilization = _get_5.getRomUtilization();
    Assert.assertEquals(_romUtilization, 70);
    EList<Board> _allBoards_2 = result.getAllBoards();
    Board _get_6 = _allBoards_2.get(0);
    int _romCapacity = _get_6.getRomCapacity();
    Assert.assertEquals(_romCapacity, 100);
    EList<Board> _allBoards_3 = result.getAllBoards();
    Board _get_7 = _allBoards_3.get(1);
    String _name_3 = _get_7.getName();
    Assert.assertEquals(_name_3, "Board2");
    EList<Board> _allBoards_4 = result.getAllBoards();
    Board _get_8 = _allBoards_4.get(1);
    int _romUtilization_1 = _get_8.getRomUtilization();
    Assert.assertEquals(_romUtilization_1, 60);
    EList<Board> _allBoards_5 = result.getAllBoards();
    Board _get_9 = _allBoards_5.get(1);
    int _romCapacity_1 = _get_9.getRomCapacity();
    Assert.assertEquals(_romCapacity_1, 100);
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
    EList<Board> _allBoards = result.getAllBoards();
    Board _get_4 = _allBoards.get(0);
    String _name_2 = _get_4.getName();
    Assert.assertEquals(_name_2, "Board1");
    EList<Board> _allBoards_1 = result.getAllBoards();
    Board _get_5 = _allBoards_1.get(0);
    int _romUtilization = _get_5.getRomUtilization();
    Assert.assertEquals(_romUtilization, 60);
    EList<Board> _allBoards_2 = result.getAllBoards();
    Board _get_6 = _allBoards_2.get(0);
    int _romCapacity = _get_6.getRomCapacity();
    Assert.assertEquals(_romCapacity, 100);
    EList<Board> _allBoards_3 = result.getAllBoards();
    Board _get_7 = _allBoards_3.get(1);
    String _name_3 = _get_7.getName();
    Assert.assertEquals(_name_3, "Board2");
    EList<Board> _allBoards_4 = result.getAllBoards();
    Board _get_8 = _allBoards_4.get(1);
    int _romUtilization_1 = _get_8.getRomUtilization();
    Assert.assertEquals(_romUtilization_1, 70);
    EList<Board> _allBoards_5 = result.getAllBoards();
    Board _get_9 = _allBoards_5.get(1);
    int _romCapacity_1 = _get_9.getRomCapacity();
    Assert.assertEquals(_romCapacity_1, 100);
  }
}

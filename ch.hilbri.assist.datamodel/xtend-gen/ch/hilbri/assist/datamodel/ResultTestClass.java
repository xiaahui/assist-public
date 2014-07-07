package ch.hilbri.assist.datamodel;

import ch.hilbri.assist.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.result.Board;
import ch.hilbri.assist.result.HardwareElement;
import ch.hilbri.assist.result.Result;
import ch.hilbri.assist.result.ResultFactory;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ResultTestClass {
  public static void main(final String[] args) {
    final ResultFactory f = ResultFactory.eINSTANCE;
    final Result resultModel = f.createResult();
    final Board c = f.createBoard();
    EList<HardwareElement> _rootHardwareElements = resultModel.getRootHardwareElements();
    _rootHardwareElements.add(c);
    HardwareArchitectureLevelType _topHardwareLevel = resultModel.getTopHardwareLevel();
    System.out.println(_topHardwareLevel);
  }
}

package ch.hilbri.assist.mapping.tests;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.SolverJob;
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@InjectWith(MappingDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class AbstractMappingTest {
  protected String input;
  
  protected AssistModel model;
  
  protected ArrayList<Result> allResults;
  
  @Inject
  protected ParseHelper<AssistModel> parser;
  
  @BeforeClass
  public static void registerEPackage() {
    ModelPackage.eINSTANCE.eClass();
  }
  
  @Before
  public void loadModelAndCreateResults() {
    try {
      AssistModel _parse = this.parser.parse(this.input);
      this.model = ((AssistModel) _parse);
      PostProcessor.createMissingThreads(this.model);
      Assert.assertNotNull(this.model);
      final SolverJob findSolutionsJob = new SolverJob("", this.model, null);
      findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE);
      findSolutionsJob.setMaxSolutions(1000);
      Assert.assertNotNull(findSolutionsJob);
      MyTestingMonitor _myTestingMonitor = new MyTestingMonitor();
      findSolutionsJob.execute(_myTestingMonitor, false);
      ArrayList<Result> _newMappingResults = findSolutionsJob.getNewMappingResults();
      this.allResults = _newMappingResults;
      Assert.assertNotNull(this.allResults);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

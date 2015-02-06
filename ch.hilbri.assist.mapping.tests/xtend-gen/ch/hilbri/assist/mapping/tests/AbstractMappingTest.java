package ch.hilbri.assist.mapping.tests;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
import ch.hilbri.assist.mapping.solver.AssistSolver;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@InjectWith(MappingDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class AbstractMappingTest {
  protected String input;
  
  protected AssistModel model;
  
  protected ArrayList<Result> allResults;
  
  private Logger logger;
  
  public AbstractMappingTest() {
    Logger _logger = LoggerFactory.getLogger(AbstractMappingTest.class);
    this.logger = _logger;
  }
  
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
      final AssistSolver solver = new AssistSolver(this.model);
      solver.setSolverSearchStrategy(SearchType.CONSECUTIVE);
      solver.setSolverMaxSolutions(1000);
      Assert.assertNotNull(solver);
      try {
        solver.propagation();
        solver.solutionSearch();
      } catch (final Throwable _t) {
        if (_t instanceof BasicConstraintsException) {
          final BasicConstraintsException e = (BasicConstraintsException)_t;
          final String constraintName = e.getConstraintName();
          final String message = e.getExplanation();
          this.logger.info((("Inconsistency found while processing constraint \"" + constraintName) + "\""));
          this.logger.info((("\"" + message) + "\""));
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      ArrayList<Result> _results = solver.getResults();
      this.allResults = _results;
      Assert.assertNotNull(this.allResults);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

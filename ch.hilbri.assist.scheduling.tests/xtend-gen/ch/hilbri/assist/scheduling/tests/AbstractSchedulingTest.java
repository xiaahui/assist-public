package ch.hilbri.assist.scheduling.tests;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.scheduling.dsl.tests.SchedulingDslInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.util.ResourceHelper;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(XtextRunner.class)
@InjectWith(SchedulingDslInjectorProvider.class)
@SuppressWarnings("all")
public class AbstractSchedulingTest {
  protected String input;
  
  protected Logger logger;
  
  public AbstractSchedulingTest() {
    this.logger = LoggerFactory.getLogger(this.getClass());
  }
  
  @Inject
  protected ParseHelper<AssistModel> parser;
  
  @Inject
  protected ResourceHelper resourceHelper;
  
  @BeforeClass
  public static void registerEPackage() {
    ModelPackage.eINSTANCE.eClass();
  }
}

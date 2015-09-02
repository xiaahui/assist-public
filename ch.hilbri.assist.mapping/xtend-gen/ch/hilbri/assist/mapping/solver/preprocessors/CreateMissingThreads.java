package ch.hilbri.assist.mapping.solver.preprocessors;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelFactory;
import ch.hilbri.assist.datamodel.model.impl.ModelFactoryImpl;
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class CreateMissingThreads extends AbstractModelPreprocessor {
  public CreateMissingThreads(final AssistModel model) {
    super(model, "missing threads");
  }
  
  @Override
  public boolean execute() {
    final ModelFactory f = ModelFactoryImpl.eINSTANCE;
    EList<Application> _applications = this.model.getApplications();
    for (final Application a : _applications) {
      int _parallelThreads = a.getParallelThreads();
      IntegerRange _upTo = new IntegerRange(1, _parallelThreads);
      for (final Integer i : _upTo) {
        {
          final ch.hilbri.assist.datamodel.model.Thread t = f.createThread();
          EList<ch.hilbri.assist.datamodel.model.Thread> _threads = a.getThreads();
          _threads.add(t);
          t.setApplication(a);
        }
      }
    }
    return true;
  }
}

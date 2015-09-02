package ch.hilbri.assist.mapping.solver.preprocessors;

import ch.hilbri.assist.datamodel.model.AssistModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public abstract class AbstractModelPreprocessor {
  protected AssistModel model;
  
  protected Logger logger;
  
  public String name;
  
  public AbstractModelPreprocessor(final AssistModel model, final String name) {
    this.model = model;
    Class<? extends AbstractModelPreprocessor> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
    this.name = name;
  }
  
  public abstract boolean execute();
}

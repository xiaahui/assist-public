package ch.hilbri.assist.dse.evaluation

import ch.hilbri.assist.model.AssistModel
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Evaluation {
    
    private Logger logger = LoggerFactory.getLogger(this.class)
    private AssistModel assistModel
    
    new (AssistModel input) {

        logger.info('''************************************************''')
        logger.info('''        ASSIST Design Space Exploration''')
        logger.info('''************************************************''')
        
        assistModel             = input
    }
    
    def run() {
        logger.info('''Running''')
    }
}

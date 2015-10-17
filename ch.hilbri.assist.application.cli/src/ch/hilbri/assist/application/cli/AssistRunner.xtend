package ch.hilbri.assist.application.cli

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import org.apache.commons.cli.BasicParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Options
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.junit4.util.ParseHelper
import org.slf4j.LoggerFactory

class AssistRunner {

	@Inject
	protected ParseHelper<AssistModel> parser

	def static void main(String[] args) throws Exception {

		val logger = LoggerFactory.getLogger(AssistRunner)
		
	    ModelPackage.eINSTANCE.eClass()

		val cliOptions = new Options()
		cliOptions.addOption("h", "help", false, "get help")
		cliOptions.addOption("s", "solutions", true, '''number of solution to find
        default : 1''')
		cliOptions.addOption("t", "timeout", true, '''timeout in seconds
        default : 60s''')
		cliOptions.addOption("v", "variable-selector", true, '''variable selector, possible arguments are:
		«FOR v : VariableSelectorTypes.values»'«v.cliArgumentName»' - «v.humanReadableName»
		«ENDFOR»
		 default: '«VariableSelectorTypes.^default.cliArgumentName»' ''')
		cliOptions.addOption("u", "value-selector", true,'''value selector, possible arguments are:
		«FOR v : ValueSelectorTypes.values»'«v.cliArgumentName»' - «v.humanReadableName»
		«ENDFOR»
		default: '«ValueSelectorTypes.^default.cliArgumentName»' ''')

		val cmdParser = new BasicParser
		val cmdline = cmdParser.parse(cliOptions, args)
		
		if (cmdline.hasOption('h')) {
			val f = new HelpFormatter
			f.printHelp("java -jar assist-jar-with-dependencies.jar <options> <files>", cliOptions)
			return
		}
		
		val runner = new AssistRunner()
		new MappingDSLInjectorProvider().injector.injectMembers(runner)

		for (arg: cmdline.args) {
			val rs = new ResourceSetImpl
			val resource = rs.getResource(URI.createFileURI(arg), true)
			
			// This may fix some lazy binding issues which are not yet recognized as errors
			EcoreUtil.resolveAll(resource)
			
			if (resource.contents.size == 0) { 
				logger.error("Input file " + arg + " contains no data.")
				return
			}
			
			/* Searching for errors inside the document? */
			if (!resource.errors.isEmpty) {
				logger.error("Input file " + arg + " contained errors.")
				for (error : resource.errors) 
					logger.error(error.message)
				return
			}
			
			val model = resource.getContents().get(0) as AssistModel 
			if (Diagnostician.INSTANCE.validate(model).severity != Diagnostic.OK) {
				logger.error("Input file " + arg + " contained warnings!")
			}

			val solver = new AssistSolver(model)

			var varSelector = VariableSelectorTypes.getVariableSelectorOrDefault(cmdline.getOptionValue("variable-selector", "")) 
			var valSelector = ValueSelectorTypes.getValueSelectorOrDefault(cmdline.getOptionValue("value-selector", ""))			
			solver.setSolverSearchStrategy(varSelector, valSelector)

			val numSolutions = Integer.parseInt(cmdline.getOptionValue("solutions", "1"))
			solver.setSolverMaxSolutions(numSolutions)

			val timeout = Integer.parseInt(cmdline.getOptionValue("timeout", "60"))
			solver.setSolverTimeLimit(timeout * 1000)

			try {
				solver.propagation
				solver.solutionSearch
				solver.createSolutions
				
				val results = solver.getResults()
				
				for (r: results) {
					logger.info('''Result «results.indexOf(r)»:''')
					for (c: r.model.connectors) {
						logger.info(c.fullName() + " { ")
						
						for (p : c.getPins()) {
							val iface = r.getEqInterfaceForPin(p)
							logger.info("\t\t    Pin\t" + p.name +  "\t\t\t")
							if (iface != null) logger.info(r.getEqInterfaceForPin(p).name)
							else logger.info(" unused ")
						}
					}
					logger.info(" } ")
					logger.info("")
				}
				
			}
			catch (BasicConstraintsException e) {
				logger.info("Inconsistency found while processing constraint \"" + e.getConstraintName() + "\"")
				logger.info("\""+ e.getExplanation() + "\"")
			}
		}
	}

}
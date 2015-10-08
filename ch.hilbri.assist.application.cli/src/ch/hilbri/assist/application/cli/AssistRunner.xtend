package ch.hilbri.assist.application.cli

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.ModelPackage
import ch.hilbri.assist.mapping.solver.AssistSolver
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider
import com.google.inject.Inject
import java.util.ArrayList
import org.apache.commons.cli.BasicParser
import org.apache.commons.cli.Options
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.junit4.util.ParseHelper

class AssistRunner {

	@Inject
	protected ParseHelper<AssistModel> parser

	def static void main(String[] args) throws Exception {
		val options = new Options()
		options.addOption("s", "solutions", true, "number of solution to find")
		options.addOption("l", "level", true, "hardware level(s) to use for location variables")
		options.addOption("a", "strategy", true, "strategy to use")
		options.addOption("t", "timeout", true, "timeout in seconds")
		options.addOption("O", "optimize", true, "switch on internal optimizations")
		options.addOption("m", "minimize", true, "solve the minimization problem on the variable")
		val parser = new BasicParser()
		val cmd = parser.parse(options, args)
		val level = Integer.parseInt(cmd.getOptionValue("level", "0"))
		val levels = new ArrayList<Integer>()
		switch (level) {
//		case 2: b
//		case 21:
//			levels.add(2)
//		case 1:
//			if (level == 21) {
//				levels.add(1)
//			}
		case 0:
			levels.add(0)
		}
		
	    ModelPackage.eINSTANCE.eClass()
		
		val runner = new AssistRunner()
		new MappingDSLInjectorProvider().getInjector().injectMembers(runner)

		for (String arg: cmd.getArgs()) {
			val uri = URI.createFileURI(arg)
			val rs = new ResourceSetImpl()
			val resource = rs.getResource(uri, true)
			
			// This may fix some lazy binding issues which are not yet recognized as errors
			EcoreUtil.resolveAll(resource)
			
			/* Searching for errors inside the document? */
			/* 1) Error with the syntax of the dsl */
			if (!resource.getErrors().isEmpty()) {
				System::err.println("Could not parse " + arg + ".")
				for (Resource.Diagnostic error:  resource.getErrors()) {
					System::err.println(error.getMessage())
				}
			}
			if (resource.getContents().size() == 0) { 
				System::err.println(arg + " has no usable data.")
			}

			val model = resource.getContents().get(0) as AssistModel
			/* 2) Custom validation rule errors // enabling those leads to an invalid jar, for a possible workaround see http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html?showComment=1279241626077#c7153662425903347274
			if (Diagnostician.INSTANCE.validate(model).getSeverity() == Diagnostic.ERROR) { 
				System::err.println("Errors on validating " + arg + ".")
				continue
			}*/
//			val minimize = Integer.parseInt(cmd.getOptionValue("minimize", "0"))
			val solver = new AssistSolver(model)
			
			switch (cmd.getOptionValue("strategy", "")) {
//				case "ff": heuristic = SearchType.MIN_DOMAIN_FIRST_AND_SHORTEST_DISTANCE break
//				case "ffmd": heuristic = SearchType.MAX_DEGREE_FIRST break
//				case "md": heuristic = SearchType.VARS_IN_MOST_DISLOC break
				case "domwd": solver.setSolverSearchStrategy(VariableSelectorTypes.DOM_OVER_WDEG, ValueSelectorTypes.CLOSEST_DISTANCE) 
				case "act": solver.setSolverSearchStrategy(VariableSelectorTypes.ACTIVITY, null)
				case "rand": solver.setSolverSearchStrategy(VariableSelectorTypes.RANDOM, ValueSelectorTypes.RANDOM)
				default: solver.setSolverSearchStrategy(VariableSelectorTypes.getDefault(), ValueSelectorTypes.getDefault())
			}	
			
			
			val numSolutions = Integer.parseInt(cmd.getOptionValue("solutions", "1"))
			solver.setSolverMaxSolutions(numSolutions)
			val timeout = Integer.parseInt(cmd.getOptionValue("timeout", "0"))
			if (timeout > 0) {
				solver.setSolverTimeLimit(timeout * 1000)
			}
			try {
				solver.propagation()
				solver.solutionSearch()
				solver.createSolutions()
				val results = solver.getResults()
				System::out.println(results.size() + " solutions found.")
				for (r: results) {
					for (c: r.getModel().getConnectors()) {
						System::out.println(c.fullName() + " { ")
						
						for (p : c.getPins()) {
							val iface = r.getEqInterfaceForPin(p)
							System::out.print("\t\t    Pin\t" + p.getName() +  "\t\t\t")
							if (iface!=null) System::out.println(r.getEqInterfaceForPin(p).getName())
							else System::out.println(" unused ")
						}
						
					}
					System::out.println(" } ")
				}
				System::out.println()
			}
			catch (BasicConstraintsException e) {
				System::err.println("Inconsistency found while processing constraint \"" + e.getConstraintName() + "\"")
				System::err.println("\""+ e.getExplanation() + "\"")
			}
		}
	}

}
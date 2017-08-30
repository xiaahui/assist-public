package ch.hilbri.assist.cli;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.testing.util.ParseHelper;

import com.google.inject.Inject;

import ch.hilbri.assist.mapping.dsl.tests.MappingDSLInjectorProvider;
import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.solver.AssistSolver;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;

public class Runner {

	@Inject
	protected ParseHelper<AssistModel> parser;

	public static void main(String[] args) throws Exception {
		final Options options = new Options();
		options.addOption("s", "solutions", true, "number of solution to find");
		options.addOption("l", "level", true, "hardware level(s) to use for location variables");
		options.addOption("a", "strategy", true, "strategy to use");
		options.addOption("t", "timeout", true, "timeout in seconds");
		options.addOption("O", "optimize", true, "switch on internal optimizations");
		options.addOption("m", "minimize", true, "solve the minimization problem on the variable");
		final CommandLineParser parser = new BasicParser();
		final CommandLine cmd = parser.parse(options, args);
		final int level = Integer.parseInt(cmd.getOptionValue("level", "0"));
		List<Integer> levels = new ArrayList<Integer>();
		switch (level) {
		case 2:
		case 21:
			levels.add(2);
		case 1:
			if (level == 21) {
				levels.add(1);
			}
		case 0:
			levels.add(0);
		}
		
	    ModelPackage.eINSTANCE.eClass();
		final Runner runner = new Runner();
		new MappingDSLInjectorProvider().getInjector().injectMembers(runner);

		for (String arg: cmd.getArgs()) {
			URI uri = URI.createFileURI(arg);
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.getResource(uri, true);
			
			// This may fix some lazy binding issues which are not yet recognized as errors
//			EcoreUtil.resolveAll(resource);
			
			/* Searching for errors inside the document? */
			/* 1) Error with the syntax of the dsl */
//			if (!resource.getErrors().isEmpty()) {
//				System.err.println("Could not parse " + arg + ".");
//				for (Resource.Diagnostic error:  resource.getErrors()) {
//					System.err.println(error.getMessage());
//				}
//				continue;
//			}
//			if (resource.getContents().size() == 0) { 
//				System.err.println(arg + " has no usable data.");
//				continue;
//			}
			final AssistModel model = (AssistModel) resource.getContents().get(0);
			/* 2) Custom validation rule errors // enabling those leads to an invalid jar, for a possible workaround see http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html?showComment=1279241626077#c7153662425903347274
			if (Diagnostician.INSTANCE.validate(model).getSeverity() == Diagnostic.ERROR) { 
				System.err.println("Errors on validating " + arg + ".");
				continue;
			}*/
			final AssistSolver solver = new AssistSolver(model);
//			SearchType heuristic = SearchType.getDefaultSearchType();
//			switch (cmd.getOptionValue("strategy", "")) {
//				case "ff": heuristic = SearchType.MIN_DOMAIN_FIRST; break;
//				case "domwd": heuristic = SearchType.DOM_OVER_WDEG; break;
////				case "act": heuristic = SearchType.ACTIVITY; break;
////				case "imp": heuristic = SearchType.IMPACT; break;
//				case "rand": heuristic = SearchType.RANDOM; break;
//				default: heuristic = SearchType.getDefaultSearchType(); break;
//			}	
//			solver.setSolverSearchStrategy(heuristic);
			final int numSolutions = Integer.parseInt(cmd.getOptionValue("solutions", "100"));
			solver.setSolverMaxSolutions(numSolutions);
			final int timeout = Integer.parseInt(cmd.getOptionValue("timeout", "0"));
			if (timeout > 0) {
				solver.setSolverTimeLimit(timeout * 1000);
			}
			try {
				solver.runInitialization();
				solver.runConstraintGeneration();
				solver.runSolutionSearch();
				final ArrayList<Result> results = solver.getResults();
				System.out.println(results.size() + " solutions found.");
				// FIXME: print results
			}
			catch (BasicConstraintsException e) {
				System.err.println("Inconsistency found while processing constraint \"" + e.getConstraintName() + "\"");
				System.err.println("\""+ e.getExplanation() + "\"");
			}
		}
	}

}

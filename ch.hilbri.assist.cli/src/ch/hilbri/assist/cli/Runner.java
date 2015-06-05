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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.junit4.util.ParseHelper;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.solver.AssistSolver;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;

import com.google.inject.Inject;

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
			EcoreUtil.resolveAll(resource);
			
			/* Searching for errors inside the document? */
			/* 1) Error with the syntax of the dsl */
			if (!resource.getErrors().isEmpty()) {
				System.err.println("Could not parse " + arg + ".");
				for (Resource.Diagnostic error:  resource.getErrors()) {
					System.err.println(error.getMessage());
				}
				continue;
			}
			if (resource.getContents().size() == 0) { 
				System.err.println(arg + " has no usable data.");
				continue;
			}
			final AssistModel model = (AssistModel) resource.getContents().get(0);
			/* 2) Custom validation rule errors // enabling those leads to an invalid jar, for a possible workaround see http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html?showComment=1279241626077#c7153662425903347274
			if (Diagnostician.INSTANCE.validate(model).getSeverity() == Diagnostic.ERROR) { 
				System.err.println("Errors on validating " + arg + ".");
				continue;
			}*/
			final int minimize = Integer.parseInt(cmd.getOptionValue("minimize", "0"));
			final AssistSolver solver = new AssistSolver(model, levels, minimize);
			SearchType heuristic = SearchType.getDefaultSearchType();
			switch (cmd.getOptionValue("strategy", "")) {
				case "ff": heuristic = SearchType.MIN_DOMAIN_FIRST_AND_SHORTEST_DISTANCE; break;
				case "ffmd": heuristic = SearchType.MAX_DEGREE_FIRST; break;
				case "hd": heuristic = SearchType.HARDEST_DISLOCALITIES_FIRST; break;
				case "hc": heuristic = SearchType.HARDEST_COLOCALITIES_FIRST; break;
				case "st": heuristic = SearchType.SCARCEST_IOTYPE_FIRST; break;
				case "md": heuristic = SearchType.VARS_IN_MOST_DISLOC; break;
				case "domwd": heuristic = SearchType.DOM_OVER_WDEG_CLOSEST_DISTANCE; break;
				case "act": heuristic = SearchType.ACTIVITY; break;
				case "imp": heuristic = SearchType.IMPACT; break;
				case "rand": heuristic = SearchType.RANDOM_RANDOM; break;
				default: heuristic = SearchType.getDefaultSearchType(); break;
			}	
			solver.setSolverSearchStrategy(heuristic);
			final int numSolutions = Integer.parseInt(cmd.getOptionValue("solutions", minimize == 0 ? "1" : "100"));
			solver.setSolverMaxSolutions(numSolutions);
			final int timeout = Integer.parseInt(cmd.getOptionValue("timeout", "0"));
			if (timeout > 0) {
				solver.setSolverTimeLimit(timeout * 1000);
			}
			try {
				solver.propagation();
				solver.solutionSearch();
				solver.createSolutions();
				final ArrayList<Result> results = solver.getResults();
				System.out.println(results.size() + " solutions found.");
				for (Result r: results) {
					for (Connector c: r.getModel().getAllConnectors()) {
						System.out.print(c.fullName() + " { ");
						for (EqInterface i: r.getAllMappedEqInterfacesForConnector(c)) {
							System.out.print(i.getName()+",");
						}
						System.out.println(" } ");
					}
					System.out.println();
				}
			}
			catch (BasicConstraintsException e) {
				System.err.println("Inconsistency found while processing constraint \"" + e.getConstraintName() + "\"");
				System.err.println("\""+ e.getExplanation() + "\"");
			}
		}
	}

}

package ch.hilbri.assist.cli;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
		final CommandLineParser parser = new BasicParser();
		final CommandLine cmd = parser.parse(options, args);
		final int numSolutions = Integer.parseInt(cmd.getOptionValue("solutions", "1"));
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
			final AssistSolver solver = new AssistSolver(model, levels);
			solver.setSolverSearchStrategy(SearchType.CONSECUTIVE);
			solver.setSolverMaxSolutions(numSolutions);
			try {
				solver.propagation();
				solver.solutionSearch();
				final ArrayList<Result> results = solver.getResults();
				System.out.println(results.size() + " solutions found.");
				for (Result r: results) {
					for (Entry<EqInterface, Connector> e: r.getMapping().entrySet()) {
						System.out.println(e.getKey().getName() + " -> " + e.getValue().getName());
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

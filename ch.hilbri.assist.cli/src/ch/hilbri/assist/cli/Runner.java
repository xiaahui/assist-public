package ch.hilbri.assist.cli;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
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
		options.addOption("s", "solutions", true, "the number of solution to find");
		final CommandLineParser parser = new BasicParser();
		final CommandLine cmd = parser.parse(options, args);
		final int numSolutions = Integer.parseInt(cmd.getOptionValue("solutions", "1"));
		
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
			/* 2) Custom validation rule errors */
			if (Diagnostician.INSTANCE.validate(model).getSeverity() == Diagnostic.ERROR) { 
				System.err.println("Errors on validating " + arg + ".");
				continue;
			}
			final AssistSolver solver = new AssistSolver(model);
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

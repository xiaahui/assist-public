package ch.hilbri.assist.cli;

import java.io.FileReader;
import java.util.ArrayList;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.io.IOUtils;
import org.eclipse.xtext.junit4.util.ParseHelper;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
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
			final AssistModel model = runner.parser.parse(IOUtils.toString(new FileReader(arg)));
			PostProcessor.createMissingThreads(model);
			final AssistSolver solver = new AssistSolver(model);
			solver.setSolverSearchStrategy(SearchType.CONSECUTIVE);
			solver.setSolverMaxSolutions(numSolutions);
			try {
				solver.propagation();
				solver.solutionSearch();
				final ArrayList<Result> results = solver.getResults();
				System.out.println(results.size() + " solutions found.");
				for (Result r: results) {
					for (ch.hilbri.assist.datamodel.result.mapping.Thread t: r.getAllThreads()) {
						System.out.println(t.getApplication().getName() + " -> " + t.getCore().getName());
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

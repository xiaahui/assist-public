package ch.hilbri.assist.cli;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.testing.util.ParseHelper;

import com.google.inject.Inject;

import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.MaxFreeCapacity;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.RandomScore;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.UniformCoreLoadDistribution;
import ch.hilbri.assist.mapping.dsl.tests.MappingDSLInjectorProvider;
import ch.hilbri.assist.mapping.model.AssistModelMapping;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.solver.AssistMappingSolver;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes;
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes;

public class Runner {

	@Inject
	protected ParseHelper<AssistModelMapping> parser;

	public static void main(String[] args) throws Exception {
		final Options options = new Options();
		options.addOption("s", "solutions", true, "number of solution to find");
		options.addOption("t", "timeout", true, "timeout in seconds");
		options.addOption("u", "uniform-load", false, "use metric: uniform load");
		options.addOption("c", "max-free-capacity", false, "use metric: max free capacity");
		options.addOption("r", "random-score", false, "use metric: random score");
		options.addOption("h", "help", false, "show help");
		
		
		final CommandLineParser parser = new BasicParser();
		final CommandLine cmd = parser.parse(options, args);
		
	    ModelPackage.eINSTANCE.eClass();
		final Runner runner = new Runner();
		new MappingDSLInjectorProvider().getInjector().injectMembers(runner);

		if (cmd.hasOption("h")) {
			// automatically generate the help statement
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp( "java -jar ASSIST-Mapping.jar <Options> file.mdsl", options );
			return;
		}
		
		
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
			final AssistModelMapping model = (AssistModelMapping) resource.getContents().get(0);
//			2) Custom validation rule errors // enabling those leads to an invalid jar, for a possible workaround see http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html?showComment=1279241626077#c7153662425903347274
//			if (Diagnostician.INSTANCE.validate(model).getSeverity() == Diagnostic.ERROR) { 
//				System.err.println("Errors on validating " + arg + ".");
//				continue;
//			}
			final AssistMappingSolver solver = new AssistMappingSolver(model);
			solver.setSolverSearchStrategy(VariableSelectorTypes.getDefault(), ValueSelectorTypes.getDefault());
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
				solver.createSolutions();
				final ArrayList<Result> results = solver.getResults();
				System.out.println(results.size() + " solutions found.");
				
				if (cmd.hasOption("u")) {
					List<AbstractMetric> list = new ArrayList<AbstractMetric>();
					AbstractMetric metric = new UniformCoreLoadDistribution();
					metric.setWeight(1);
					list.add(metric);
					System.out.println("Evaluating solutions according to uniform core load metric");
					ResultsAnalysis.evaluate(results, list);
				}
				else if (cmd.hasOption("c")) {
					List<AbstractMetric> list = new ArrayList<AbstractMetric>();
					AbstractMetric metric = new MaxFreeCapacity();
					metric.setWeight(1);
					list.add(metric);
					System.out.println("Evaluating solutions according to max free capacity metric");
					ResultsAnalysis.evaluate(results, list);
				}
				else if (cmd.hasOption("r")) {
					List<AbstractMetric> list = new ArrayList<AbstractMetric>();
					AbstractMetric metric = new RandomScore();
					metric.setWeight(1);
					list.add(metric);
					System.out.println("Evaluating solutions according to random score metric");
					ResultsAnalysis.evaluate(results, list);
				}
				
				for (Result result : results) {
					System.out.println(result);
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

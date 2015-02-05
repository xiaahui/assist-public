package ch.hilbri.assist.cli;

import java.io.FileReader;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.eclipse.xtext.junit4.util.ParseHelper;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.datamodel.PostProcessor;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.SolverJob;
import ch.hilbri.assist.mapping.tests.helpers.MyTestingMonitor;
import ch.hilbri.assist.mappingdsl.MappingDSLInjectorProvider;

import com.google.inject.Inject;

public class Runner {

	@Inject
	protected ParseHelper<AssistModel> parser;

	public static void main(String[] args) throws Exception {
	    ModelPackage.eINSTANCE.eClass();
		Runner runner = new Runner();
		new MappingDSLInjectorProvider().getInjector().injectMembers(runner);

		AssistModel model = runner.parser.parse(IOUtils.toString(new FileReader(args[0])));
		PostProcessor.createMissingThreads(model);
		final SolverJob findSolutionsJob = new SolverJob("", model, null);
		findSolutionsJob.setKindOfSolutions(SearchType.CONSECUTIVE);
		findSolutionsJob.setMaxSolutions(1000);
		findSolutionsJob.execute(new MyTestingMonitor(), false);
		ArrayList<Result> newMappingResults = findSolutionsJob.getNewMappingResults();
		for (Result r : newMappingResults) {
			for (ch.hilbri.assist.datamodel.result.mapping.Thread t: r.getAllThreads()) {
				System.out.println(t.getApplication().getName() + " -> " + t.getCore().getName());
			}
			System.out.println();
		}
	}
}

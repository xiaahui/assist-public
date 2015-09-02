package ch.hilbri.assist.mapping.solver;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.constraints.CoreUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DesignAssuranceLevelConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.IOAdapterConstraint;
import ch.hilbri.assist.mapping.solver.constraints.RAMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.ROMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.monitors.CloseMonitor;
import ch.hilbri.assist.mapping.solver.monitors.DownBranchMonitor;
import ch.hilbri.assist.mapping.solver.monitors.PartialSolutionSaveMonitor;
import ch.hilbri.assist.mapping.solver.monitors.RestartMonitor;
import ch.hilbri.assist.mapping.solver.monitors.SolutionFoundMonitor;
import ch.hilbri.assist.mapping.solver.preprocessors.AbstractModelPreprocessor;
import ch.hilbri.assist.mapping.solver.preprocessors.CreateMissingThreads;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.search.loop.ISearchLoop;
import org.chocosolver.solver.search.loop.monitors.SMF;
import org.chocosolver.solver.search.measure.IMeasures;
import org.chocosolver.solver.search.solution.AllSolutionsRecorder;
import org.chocosolver.solver.search.solution.Solution;
import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector;
import org.chocosolver.solver.search.strategy.selectors.VariableSelector;
import org.chocosolver.solver.search.strategy.strategy.AbstractStrategy;
import org.chocosolver.solver.search.strategy.strategy.IntStrategy;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class AssistSolver {
  private AssistModel model;
  
  private Solver solver;
  
  private AllSolutionsRecorder recorder;
  
  private SolverVariablesContainer solverVariables;
  
  private ArrayList<AbstractMappingConstraint> mappingConstraintsList;
  
  private ArrayList<Result> mappingResults;
  
  private ArrayList<AbstractModelPreprocessor> modelPreprocessors;
  
  private Logger logger;
  
  private boolean savePartialSolution = false;
  
  private PartialSolutionSaveMonitor partialSolutionSaveMonitor;
  
  public AssistSolver(final AssistModel model) {
    Class<? extends AssistSolver> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("******************************");
    this.logger.info(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(" ");
    _builder_1.append("Executing a new AssistSolver");
    this.logger.info(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("******************************");
    this.logger.info(_builder_2.toString());
    Bundle _bundle = Platform.getBundle("ch.hilbri.assist.application");
    boolean _notEquals = (!Objects.equal(_bundle, null));
    if (_notEquals) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("    ");
      _builder_3.append("Version : ");
      Bundle _bundle_1 = Platform.getBundle("ch.hilbri.assist.application");
      Dictionary<String, String> _headers = _bundle_1.getHeaders();
      String _get = _headers.get("Bundle-Version");
      _builder_3.append(_get, "    ");
      _builder_3.append(" ");
      this.logger.info(_builder_3.toString());
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("    ");
      _builder_4.append("Platform: ");
      String _property = System.getProperty("os.name");
      String _plus = (_property + " ");
      String _property_1 = System.getProperty("sun.arch.data.model");
      String _plus_1 = (_plus + _property_1);
      String _plus_2 = (_plus_1 + "bit");
      _builder_4.append(_plus_2, "    ");
      this.logger.info(_builder_4.toString());
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("******************************");
      this.logger.info(_builder_5.toString());
    }
    this.model = model;
    ArrayList<AbstractModelPreprocessor> _arrayList = new ArrayList<AbstractModelPreprocessor>();
    this.modelPreprocessors = _arrayList;
    CreateMissingThreads _createMissingThreads = new CreateMissingThreads(model);
    this.modelPreprocessors.add(_createMissingThreads);
    Solver _solver = new Solver();
    this.solver = _solver;
    AllSolutionsRecorder _allSolutionsRecorder = new AllSolutionsRecorder(this.solver);
    this.recorder = _allSolutionsRecorder;
    this.solver.set(this.recorder);
    SolverVariablesContainer _solverVariablesContainer = new SolverVariablesContainer(model, this.solver);
    this.solverVariables = _solverVariablesContainer;
    ISearchLoop _searchLoop = this.solver.getSearchLoop();
    DownBranchMonitor _downBranchMonitor = new DownBranchMonitor(this.solverVariables);
    _searchLoop.plugSearchMonitor(_downBranchMonitor);
    ISearchLoop _searchLoop_1 = this.solver.getSearchLoop();
    CloseMonitor _closeMonitor = new CloseMonitor();
    _searchLoop_1.plugSearchMonitor(_closeMonitor);
    ISearchLoop _searchLoop_2 = this.solver.getSearchLoop();
    RestartMonitor _restartMonitor = new RestartMonitor();
    _searchLoop_2.plugSearchMonitor(_restartMonitor);
    ArrayList<AbstractMappingConstraint> _arrayList_1 = new ArrayList<AbstractMappingConstraint>();
    this.mappingConstraintsList = _arrayList_1;
    SystemHierarchyConstraint _systemHierarchyConstraint = new SystemHierarchyConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_systemHierarchyConstraint);
    CoreUtilizationConstraint _coreUtilizationConstraint = new CoreUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_coreUtilizationConstraint);
    RAMUtilizationConstraint _rAMUtilizationConstraint = new RAMUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_rAMUtilizationConstraint);
    ROMUtilizationConstraint _rOMUtilizationConstraint = new ROMUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_rOMUtilizationConstraint);
    IOAdapterConstraint _iOAdapterConstraint = new IOAdapterConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_iOAdapterConstraint);
    DesignAssuranceLevelConstraint _designAssuranceLevelConstraint = new DesignAssuranceLevelConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_designAssuranceLevelConstraint);
    DislocalityConstraint _dislocalityConstraint = new DislocalityConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_dislocalityConstraint);
    ArrayList<Result> _arrayList_2 = new ArrayList<Result>();
    this.mappingResults = _arrayList_2;
  }
  
  public void setSavePartialSolution(final boolean value) {
    this.savePartialSolution = value;
    if (value) {
      this.logger.info("Enabled saving of partial solutions if no solutions are found");
      PartialSolutionSaveMonitor _partialSolutionSaveMonitor = new PartialSolutionSaveMonitor(this.solver, this.solverVariables);
      this.partialSolutionSaveMonitor = _partialSolutionSaveMonitor;
      ISearchLoop _searchLoop = this.solver.getSearchLoop();
      _searchLoop.plugSearchMonitor(this.partialSolutionSaveMonitor);
    } else {
      this.logger.info("Disabled saving of partial solutions if no solutions are found");
    }
  }
  
  public void setSolverTimeLimit(final long timeInMs) {
    SMF.limitTime(this.solver, timeInMs);
    this.logger.info((("Setting choco-solver search time limit to " + Long.valueOf(timeInMs)) + "ms"));
  }
  
  public void setSolverMaxSolutions(final int maxSolutions) {
    this.logger.info(("Setting choco-solver max solutions limit to " + Integer.valueOf(maxSolutions)));
    SMF.limitSolution(this.solver, maxSolutions);
  }
  
  public void setSolverSearchStrategy(final SearchType strategy) {
    final List<AbstractStrategy<IntVar>> heuristics = new ArrayList<AbstractStrategy<IntVar>>();
    final int seed = 23432;
    final IntVar[] vars = this.solverVariables.getLocationVariables();
    String _humanReadableName = strategy.getHumanReadableName();
    String _plus = ("Setting choco-solver search strategy to \'" + _humanReadableName);
    String _plus_1 = (_plus + "\'");
    this.logger.info(_plus_1);
    if (strategy != null) {
      switch (strategy) {
        case RANDOM:
          VariableSelector<IntVar> _random_var_selector = ISF.random_var_selector(0);
          IntValueSelector _random_value_selector = ISF.random_value_selector(0);
          IntStrategy _custom = ISF.custom(_random_var_selector, _random_value_selector, vars);
          heuristics.add(_custom);
          break;
        case MIN_DOMAIN_FIRST:
          IntStrategy _minDom_LB = ISF.minDom_LB(vars);
          heuristics.add(_minDom_LB);
          break;
        case DOM_OVER_WDEG:
          final IntValueSelector valueChooser = ISF.min_value_selector();
          AbstractStrategy<IntVar> _domOverWDeg = ISF.domOverWDeg(vars, seed, valueChooser);
          heuristics.add(_domOverWDeg);
          break;
        case ACTIVITY:
          AbstractStrategy<IntVar> _activity = ISF.activity(vars, seed);
          heuristics.add(_activity);
          ISearchLoop _searchLoop = this.solver.getSearchLoop();
          IntVar[] _locationVariables = this.solverVariables.getLocationVariables();
          SolutionFoundMonitor _solutionFoundMonitor = new SolutionFoundMonitor(_locationVariables);
          _searchLoop.plugSearchMonitor(_solutionFoundMonitor);
          break;
        case IMPACT:
          AbstractStrategy<IntVar> _impact = ISF.impact(vars, seed);
          heuristics.add(_impact);
          break;
        default:
          break;
      }
    }
    boolean _notEquals = (!Objects.equal(strategy, SearchType.ACTIVITY));
    if (_notEquals) {
      ISearchLoop _searchLoop_1 = this.solver.getSearchLoop();
      SolutionFoundMonitor _solutionFoundMonitor_1 = new SolutionFoundMonitor(null);
      _searchLoop_1.plugSearchMonitor(_solutionFoundMonitor_1);
    }
    this.solver.set(((AbstractStrategy[])Conversions.unwrapArray(heuristics, AbstractStrategy.class)));
  }
  
  public void runModelPreprocessors() {
    this.logger.info("Running pre-processors");
    for (final AbstractModelPreprocessor p : this.modelPreprocessors) {
      {
        this.logger.info((" - Processing " + p.name));
        boolean _execute = p.execute();
        boolean _not = (!_execute);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("      ");
          _builder.append("There is nothing to be done.");
          this.logger.info(_builder.toString());
        }
      }
    }
  }
  
  public void propagation() throws BasicConstraintsException {
    this.logger.info("Starting to generate constraints for the choco-solver");
    for (final AbstractMappingConstraint constraint : this.mappingConstraintsList) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("- Starting to generate constraints for \"");
        String _name = constraint.getName();
        _builder.append(_name, " ");
        _builder.append("\"...");
        this.logger.info(_builder.toString());
        boolean _generate = constraint.generate();
        boolean _not = (!_generate);
        if (_not) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("      ");
          _builder_1.append("No effective constraints found");
          this.logger.info(_builder_1.toString());
        }
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("   ");
        _builder_2.append("done.");
        this.logger.info(_builder_2.toString());
      }
    }
    final IntVar[] vars = this.solverVariables.getLocationVariables();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("After initial propagation:");
    this.logger.info(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("      ");
    final Function1<IntVar, Boolean> _function = (IntVar it) -> {
      return Boolean.valueOf(it.isInstantiated());
    };
    Iterable<IntVar> _filter = IterableExtensions.<IntVar>filter(((Iterable<IntVar>)Conversions.doWrapArray(vars)), _function);
    int _size = IterableExtensions.size(_filter);
    _builder_1.append(_size, "      ");
    _builder_1.append(" / ");
    int _size_1 = ((List<IntVar>)Conversions.doWrapArray(vars)).size();
    _builder_1.append(_size_1, "      ");
    _builder_1.append(" location variables instantiated");
    this.logger.info(_builder_1.toString());
  }
  
  public void solutionSearch() throws BasicConstraintsException {
    this.mappingResults.clear();
    this.logger.info("Initiating choco-solver - searching for a solution");
    this.solver.findAllSolutions();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Solutions found: ");
    List<Solution> _solutions = this.recorder.getSolutions();
    int _size = _solutions.size();
    _builder.append(_size, "");
    this.logger.info(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Internal solver statistics: ");
    IMeasures _measures = this.solver.getMeasures();
    String _oneLineString = _measures.toOneLineString();
    _builder_1.append(_oneLineString, "");
    this.logger.info(_builder_1.toString());
    boolean _hasReachedLimit = this.solver.hasReachedLimit();
    if (_hasReachedLimit) {
      this.logger.info("Solver reached a limit (max. number of solutions or max. allowed search time)");
    }
    List<Solution> _solutions_1 = this.recorder.getSolutions();
    int _size_1 = _solutions_1.size();
    boolean _greaterThan = (_size_1 > 0);
    if (_greaterThan) {
      List<Solution> _solutions_2 = this.recorder.getSolutions();
      ArrayList<Result> _create = ResultFactoryFromSolverSolutions.create(this.model, this.solverVariables, _solutions_2);
      this.mappingResults = _create;
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Results created:  ");
      int _size_2 = this.mappingResults.size();
      _builder_2.append(_size_2, "");
      this.logger.info(_builder_2.toString());
    } else {
      if (this.savePartialSolution) {
        Map<IntVar, Integer> _partialSolution = this.partialSolutionSaveMonitor.getPartialSolution();
        ArrayList<Result> _createPartialResult = ResultFactoryFromSolverSolutions.createPartialResult(this.model, this.solverVariables, _partialSolution);
        this.mappingResults = _createPartialResult;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Created �mappingResults.size� partial solution");
        this.logger.info(_builder_3.toString());
      }
    }
  }
  
  public ArrayList<Result> getResults() {
    return this.mappingResults;
  }
  
  public boolean hasReachedLimit() {
    return this.solver.hasReachedLimit();
  }
  
  public IntVar[] getLocationVariables() {
    return this.solverVariables.getLocationVariables();
  }
  
  public Solver getChocoSolver() {
    return this.solver;
  }
}

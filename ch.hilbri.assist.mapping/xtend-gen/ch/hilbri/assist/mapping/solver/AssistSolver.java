package ch.hilbri.assist.mapping.solver;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.result.ResultFactoryFromSolverSolutions;
import ch.hilbri.assist.mapping.solver.SearchType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.constraints.AllApplicationThreadsOnSameBoard;
import ch.hilbri.assist.mapping.solver.constraints.ApplicationProximityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.CoreUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DesignAssuranceLevelConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DislocalityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.DissimilarityConstraint;
import ch.hilbri.assist.mapping.solver.constraints.IOAdapterConstraint;
import ch.hilbri.assist.mapping.solver.constraints.NetworkConstraints;
import ch.hilbri.assist.mapping.solver.constraints.NoPermutationsConstraint;
import ch.hilbri.assist.mapping.solver.constraints.RAMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.ROMUtilizationConstraint;
import ch.hilbri.assist.mapping.solver.constraints.RestrictedDeploymentConstraint;
import ch.hilbri.assist.mapping.solver.constraints.SystemHierarchyConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.strategies.FirstFailWithProgressionOutput;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Settings;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.explanations.Explanation;
import org.chocosolver.solver.explanations.ExplanationEngine;
import org.chocosolver.solver.explanations.RecorderExplanationEngine;
import org.chocosolver.solver.explanations.strategies.ConflictBasedBackjumping;
import org.chocosolver.solver.propagation.IPropagationEngine;
import org.chocosolver.solver.search.loop.ISearchLoop;
import org.chocosolver.solver.search.loop.monitors.SMF;
import org.chocosolver.solver.search.solution.AllSolutionsRecorder;
import org.chocosolver.solver.search.solution.Solution;
import org.chocosolver.solver.search.strategy.ISF;
import org.chocosolver.solver.search.strategy.selectors.IntValueSelector;
import org.chocosolver.solver.search.strategy.strategy.IntStrategy;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  
  private Logger logger;
  
  public AssistSolver(final AssistModel model) {
    this.model = model;
    Class<? extends AssistSolver> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
    ArrayList<Result> _arrayList = new ArrayList<Result>();
    this.mappingResults = _arrayList;
    ArrayList<AbstractMappingConstraint> _arrayList_1 = new ArrayList<AbstractMappingConstraint>();
    this.mappingConstraintsList = _arrayList_1;
    Solver _solver = new Solver();
    this.solver = _solver;
    this.solver.set(new Settings() {
      public boolean enablePropagatorInExplanation() {
        return true;
      }
    });
    AllSolutionsRecorder _allSolutionsRecorder = new AllSolutionsRecorder(this.solver);
    this.recorder = _allSolutionsRecorder;
    this.solver.set(this.recorder);
    SolverVariablesContainer _solverVariablesContainer = new SolverVariablesContainer(this.model, this.solver);
    this.solverVariables = _solverVariablesContainer;
    SystemHierarchyConstraint _systemHierarchyConstraint = new SystemHierarchyConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_systemHierarchyConstraint);
    CoreUtilizationConstraint _coreUtilizationConstraint = new CoreUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_coreUtilizationConstraint);
    RAMUtilizationConstraint _rAMUtilizationConstraint = new RAMUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_rAMUtilizationConstraint);
    ROMUtilizationConstraint _rOMUtilizationConstraint = new ROMUtilizationConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_rOMUtilizationConstraint);
    NoPermutationsConstraint _noPermutationsConstraint = new NoPermutationsConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_noPermutationsConstraint);
    AllApplicationThreadsOnSameBoard _allApplicationThreadsOnSameBoard = new AllApplicationThreadsOnSameBoard(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_allApplicationThreadsOnSameBoard);
    IOAdapterConstraint _iOAdapterConstraint = new IOAdapterConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_iOAdapterConstraint);
    DesignAssuranceLevelConstraint _designAssuranceLevelConstraint = new DesignAssuranceLevelConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_designAssuranceLevelConstraint);
    RestrictedDeploymentConstraint _restrictedDeploymentConstraint = new RestrictedDeploymentConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_restrictedDeploymentConstraint);
    ApplicationProximityConstraint _applicationProximityConstraint = new ApplicationProximityConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_applicationProximityConstraint);
    DislocalityConstraint _dislocalityConstraint = new DislocalityConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_dislocalityConstraint);
    DissimilarityConstraint _dissimilarityConstraint = new DissimilarityConstraint(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_dissimilarityConstraint);
    NetworkConstraints _networkConstraints = new NetworkConstraints(model, this.solver, this.solverVariables);
    this.mappingConstraintsList.add(_networkConstraints);
  }
  
  public void setSolverTimeLimit(final long timeInMs) {
    SMF.limitTime(this.solver, timeInMs);
    this.logger.info((("Setting time limit to " + Long.valueOf(timeInMs)) + "ms"));
  }
  
  public void setSolverMaxSolutions(final int maxSolutions) {
    this.logger.info(("Setting max solutions limit to " + Integer.valueOf(maxSolutions)));
    SMF.limitSolution(this.solver, maxSolutions);
  }
  
  public void setSolverSearchStrategy(final SearchType strategy) {
    boolean _equals = Objects.equal(strategy, SearchType.CONSECUTIVE);
    if (_equals) {
      this.logger.info("Setting search strategy to minDomainSize + minValue");
      FirstFailWithProgressionOutput _firstFailWithProgressionOutput = new FirstFailWithProgressionOutput(this.solverVariables, this.model);
      IntValueSelector _min_value_selector = ISF.min_value_selector();
      IntVar[] _locationVariables = this.solverVariables.getLocationVariables();
      IntStrategy _custom = ISF.custom(_firstFailWithProgressionOutput, _min_value_selector, _locationVariables);
      this.solver.set(_custom);
    } else {
      this.logger.info("Unknown search strategy supplied");
    }
  }
  
  public void propagation() throws BasicConstraintsException {
    this.logger.info("Starting a solver propagation");
    for (final AbstractMappingConstraint constraint : this.mappingConstraintsList) {
      {
        constraint.generate();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Constraint \"");
        String _name = constraint.getName();
        _builder.append(_name, "");
        _builder.append("\" successfully generated");
        this.logger.info(_builder.toString());
      }
    }
  }
  
  public void solutionSearch() throws BasicConstraintsException {
    this.logger.info("Searching for a solution");
    this.solver.findAllSolutions();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Solutions found: ");
    List<Solution> _solutions = this.recorder.getSolutions();
    int _size = _solutions.size();
    _builder.append(_size, "");
    this.logger.info(_builder.toString());
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
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Results created:  ");
      int _size_2 = this.mappingResults.size();
      _builder_1.append(_size_2, "");
      this.logger.info(_builder_1.toString());
    } else {
      this.mappingResults.clear();
    }
  }
  
  public void getExplanation() {
    this.logger.info("Trying to get an explanation");
    ISearchLoop _searchLoop = this.solver.getSearchLoop();
    _searchLoop.reset();
    IPropagationEngine _engine = this.solver.getEngine();
    _engine.flush();
    RecorderExplanationEngine _recorderExplanationEngine = new RecorderExplanationEngine(this.solver);
    this.solver.set(_recorderExplanationEngine);
    ExplanationEngine _explainer = this.solver.getExplainer();
    final ConflictBasedBackjumping cbj = new ConflictBasedBackjumping(_explainer);
    cbj.activeUserExplanation(true);
    this.solver.findSolution();
    this.logger.debug("Solver contents: ");
    String _string = this.solver.toString();
    this.logger.debug(_string);
    this.logger.info("Explanation:");
    Explanation _userExplanation = cbj.getUserExplanation();
    String _string_1 = _userExplanation.toString();
    this.logger.info(_string_1);
  }
  
  public ArrayList<Result> getResults() {
    return this.mappingResults;
  }
  
  public boolean hasReachedLimit() {
    return this.solver.hasReachedLimit();
  }
}
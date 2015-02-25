package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.ioadapter.NoBoardOffersSufficientIOAdaptersForSingleApplication;
import ch.hilbri.assist.mapping.solver.exceptions.ioadapter.SingleBoardDoesNotOfferSufficientIOAdaptersForMultipleApplications;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class IOAdapterConstraint extends AbstractMappingConstraint {
  public IOAdapterConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("I/O adapter constraints", model, solver, solverVariables);
  }
  
  public boolean generate() {
    this.generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    this.generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints();
    return true;
  }
  
  public void generate_MultipleTheads_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    try {
      EList<Board> _allBoards = this.model.getAllBoards();
      for (final Board b : _allBoards) {
        {
          final ArrayList<BoolVar> factorList = new ArrayList<BoolVar>();
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
          for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
            {
              final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE);
              String _name = t.getName();
              String _plus = ("d2-" + _name);
              String _plus_1 = (_plus + "-");
              String _name_1 = b.getName();
              String _plus_2 = (_plus_1 + _name_1);
              final BoolVar delta = VF.bool(_plus_2, this.solver);
              EList<Board> _allBoards_1 = this.model.getAllBoards();
              int _indexOf = _allBoards_1.indexOf(b);
              final Constraint constraint = ICF.arithm(threadLocationsBoardLevel, "=", _indexOf);
              constraint.reifyWith(delta);
              factorList.add(delta);
            }
          }
          IOAdapterType[] _values = IOAdapterType.values();
          for (final IOAdapterType type : _values) {
            IOAdapterProtectionLevelType[] _values_1 = IOAdapterProtectionLevelType.values();
            for (final IOAdapterProtectionLevelType level : _values_1) {
              {
                String _name = b.getName();
                String _plus = ("SuiteableIOAdapterCount-" + _name);
                String _plus_1 = (_plus + "-");
                String _plus_2 = (_plus_1 + type);
                String _plus_3 = (_plus_2 + "-");
                String _plus_4 = (_plus_3 + level);
                int _suitableAdapterCount = b.getSuitableAdapterCount(type, level);
                final IntVar suiteableIOAdapterCountVar = VF.enumerated(_plus_4, 0, _suitableAdapterCount, this.solver);
                EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = this.model.getAllThreads();
                final Function1<ch.hilbri.assist.datamodel.model.Thread, Integer> _function = new Function1<ch.hilbri.assist.datamodel.model.Thread, Integer>() {
                  public Integer apply(final ch.hilbri.assist.datamodel.model.Thread it) {
                    return Integer.valueOf(it.getExclusiveAdapterRequestCount(type, level));
                  }
                };
                final List<Integer> requestCountForEachThreadWithProtectionLevelAndType = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, Integer>map(_allThreads_1, _function);
                Constraint _scalar = ICF.scalar(((IntVar[])Conversions.unwrapArray(factorList, IntVar.class)), ((int[])Conversions.unwrapArray(requestCountForEachThreadWithProtectionLevelAndType, int.class)), "=", suiteableIOAdapterCountVar);
                this.solver.post(_scalar);
                try {
                  this.solver.propagate();
                } catch (final Throwable _t) {
                  if (_t instanceof ContradictionException) {
                    final ContradictionException e = (ContradictionException)_t;
                    throw new SingleBoardDoesNotOfferSufficientIOAdaptersForMultipleApplications(this, b, type, level);
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
              }
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void generate_SingleThread_ExclusiveRequests_incl_ProtectionLevel_Constraints() {
    try {
      EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = this.model.getAllThreads();
      for (final ch.hilbri.assist.datamodel.model.Thread t : _allThreads) {
        Application _application = t.getApplication();
        EList<IOAdapterRequirement> _ioAdapterRequirements = _application.getIoAdapterRequirements();
        final Function1<IOAdapterRequirement, Boolean> _function = new Function1<IOAdapterRequirement, Boolean>() {
          public Boolean apply(final IOAdapterRequirement it) {
            return Boolean.valueOf(it.isIsExclusiveOnly());
          }
        };
        Iterable<IOAdapterRequirement> _filter = IterableExtensions.<IOAdapterRequirement>filter(_ioAdapterRequirements, _function);
        for (final IOAdapterRequirement exReq : _filter) {
          {
            EList<Board> _allBoards = this.model.getAllBoards();
            final Function1<Board, Integer> _function_1 = new Function1<Board, Integer>() {
              public Integer apply(final Board it) {
                IOAdapterType _adapterType = exReq.getAdapterType();
                Application _application = t.getApplication();
                IOAdapterProtectionLevelType _ioAdapterProtectionLevel = _application.getIoAdapterProtectionLevel();
                return Integer.valueOf(it.getSuitableAdapterCount(_adapterType, _ioAdapterProtectionLevel));
              }
            };
            final List<Integer> suiteableAdapterCountPerBoardList = ListExtensions.<Board, Integer>map(_allBoards, _function_1);
            String _name = t.getName();
            String _plus = ("IOVar-" + _name);
            String _plus_1 = (_plus + "-");
            IOAdapterType _adapterType = exReq.getAdapterType();
            String _plus_2 = (_plus_1 + _adapterType);
            String _plus_3 = (_plus_2 + "-");
            Application _application_1 = t.getApplication();
            IOAdapterProtectionLevelType _ioAdapterProtectionLevel = _application_1.getIoAdapterProtectionLevel();
            String _plus_4 = (_plus_3 + _ioAdapterProtectionLevel);
            List<Integer> _sort = IterableExtensions.<Integer>sort(suiteableAdapterCountPerBoardList);
            final IntVar suiteableAdapterCountPerBoardVariable = VF.enumerated(_plus_4, ((int[])Conversions.unwrapArray(_sort, int.class)), this.solver);
            final IntVar threadLocationsBoardLevel = this.solverVariables.getThreadLocationVariable(t, HardwareArchitectureLevelType.BOARD_VALUE);
            Constraint _element = ICF.element(suiteableAdapterCountPerBoardVariable, ((int[])Conversions.unwrapArray(suiteableAdapterCountPerBoardList, int.class)), threadLocationsBoardLevel);
            this.solver.post(_element);
            int _requiredAdapterCount = exReq.getRequiredAdapterCount();
            Constraint _arithm = ICF.arithm(suiteableAdapterCountPerBoardVariable, ">=", _requiredAdapterCount);
            this.solver.post(_arithm);
            try {
              this.solver.propagate();
            } catch (final Throwable _t) {
              if (_t instanceof ContradictionException) {
                final ContradictionException e = (ContradictionException)_t;
                Application _application_2 = t.getApplication();
                IOAdapterType _adapterType_1 = exReq.getAdapterType();
                Application _application_3 = t.getApplication();
                IOAdapterProtectionLevelType _ioAdapterProtectionLevel_1 = _application_3.getIoAdapterProtectionLevel();
                int _requiredAdapterCount_1 = exReq.getRequiredAdapterCount();
                throw new NoBoardOffersSufficientIOAdaptersForSingleApplication(this, _application_2, _adapterType_1, _ioAdapterProtectionLevel_1, _requiredAdapterCount_1);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

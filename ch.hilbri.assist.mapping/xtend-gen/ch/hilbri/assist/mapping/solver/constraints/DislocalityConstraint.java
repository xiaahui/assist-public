package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.dislocality.ApplicationsCannotBeMappedDislocal;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DislocalityConstraint extends AbstractMappingConstraint {
  public DislocalityConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Dislocality constraints", model, solver, solverVariables);
  }
  
  public boolean generate() {
    try {
      EList<DislocalityRelation> _dislocalityRelations = this.model.getDislocalityRelations();
      for (final DislocalityRelation r : _dislocalityRelations) {
        {
          final ArrayList<ArrayList<IntVar>> varList = new ArrayList<ArrayList<IntVar>>();
          EList<ApplicationOrApplicationGroup> _applicationsOrGroups = r.getApplicationsOrGroups();
          for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
            {
              final ArrayList<IntVar> aogList = new ArrayList<IntVar>();
              if ((aog instanceof Application)) {
                EList<ch.hilbri.assist.datamodel.model.Thread> _threads = ((Application) aog).getThreads();
                for (final ch.hilbri.assist.datamodel.model.Thread t : _threads) {
                  HardwareArchitectureLevelType _hardwareLevel = r.getHardwareLevel();
                  int _value = _hardwareLevel.getValue();
                  IntVar _threadLocationVariable = this.solverVariables.getThreadLocationVariable(t, _value);
                  aogList.add(_threadLocationVariable);
                }
              } else {
                if ((aog instanceof ApplicationGroup)) {
                  EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = ((ApplicationGroup) aog).getAllThreads();
                  for (final ch.hilbri.assist.datamodel.model.Thread t_1 : _allThreads) {
                    HardwareArchitectureLevelType _hardwareLevel_1 = r.getHardwareLevel();
                    int _value_1 = _hardwareLevel_1.getValue();
                    IntVar _threadLocationVariable_1 = this.solverVariables.getThreadLocationVariable(t_1, _value_1);
                    aogList.add(_threadLocationVariable_1);
                  }
                } else {
                  return false;
                }
              }
              varList.add(aogList);
            }
          }
          final ArrayList<ArrayList<IntVar>> varSetForAllDifferentConstraint = this.createDisjointVariableSets(varList);
          for (final ArrayList<IntVar> list : varSetForAllDifferentConstraint) {
            {
              Constraint _alldifferent = ICF.alldifferent(((IntVar[])Conversions.unwrapArray(list, IntVar.class)), "AC");
              this.solver.post(_alldifferent);
              try {
                this.solver.propagate();
              } catch (final Throwable _t) {
                if (_t instanceof ContradictionException) {
                  final ContradictionException e = (ContradictionException)_t;
                  final Function1<IntVar, Application> _function = new Function1<IntVar, Application>() {
                    public Application apply(final IntVar it) {
                      return DislocalityConstraint.this.solverVariables.getApplicationForLocationVariable(it);
                    }
                  };
                  List<Application> _map = ListExtensions.<IntVar, Application>map(list, _function);
                  HardwareArchitectureLevelType _hardwareLevel = r.getHardwareLevel();
                  throw new ApplicationsCannotBeMappedDislocal(this, _map, _hardwareLevel);
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
            }
          }
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ArrayList<ArrayList<IntVar>> createDisjointVariableSets(final ArrayList<ArrayList<IntVar>> locationVariables) {
    int _size = locationVariables.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      final ArrayList<ArrayList<IntVar>> newList = new ArrayList<ArrayList<IntVar>>();
      ArrayList<IntVar> _get = locationVariables.get(0);
      for (final IntVar v : _get) {
        {
          final ArrayList<IntVar> l = new ArrayList<IntVar>();
          l.add(v);
          newList.add(l);
        }
      }
      return newList;
    } else {
      final ArrayList<ArrayList<IntVar>> tmpList = new ArrayList<ArrayList<IntVar>>(locationVariables);
      tmpList.remove(0);
      final ArrayList<ArrayList<IntVar>> returnList = this.createDisjointVariableSets(tmpList);
      final ArrayList<ArrayList<IntVar>> newList_1 = new ArrayList<ArrayList<IntVar>>();
      ArrayList<IntVar> _get_1 = locationVariables.get(0);
      for (final IntVar v_1 : _get_1) {
        for (final ArrayList<IntVar> list : returnList) {
          {
            final ArrayList<IntVar> l = new ArrayList<IntVar>();
            l.add(v_1);
            l.addAll(list);
            newList_1.add(l);
          }
        }
      }
      return newList_1;
    }
  }
}

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.BoardAttributes;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.BoxAttributes;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompartmentAttributes;
import ch.hilbri.assist.datamodel.model.DesignAssuranceLevelType;
import ch.hilbri.assist.datamodel.model.DissimilarityClause;
import ch.hilbri.assist.datamodel.model.DissimilarityConjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityDisjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityEntry;
import ch.hilbri.assist.datamodel.model.DissimilarityRelation;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.Processor;
import ch.hilbri.assist.datamodel.model.ProcessorAttributes;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.LCF;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DissimilarityConstraint extends AbstractMappingConstraint {
  public DissimilarityConstraint(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Dissimilarity constraints", model, solver, solverVariables);
    Class<? extends DissimilarityConstraint> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  /**
   * Main method for all relations
   */
  public boolean generate() {
    try {
      EList<DissimilarityRelation> _dissimilarityRelations = this.model.getDissimilarityRelations();
      for (final DissimilarityRelation r : _dissimilarityRelations) {
        {
          DissimilarityClause _dissimilarityClause = r.getDissimilarityClause();
          final Constraint constraint = this.generateConstraint(r, _dissimilarityClause);
          boolean _notEquals = (!Objects.equal(constraint, null));
          if (_notEquals) {
            this.solver.post(constraint);
          }
        }
      }
      try {
        this.solver.propagate();
      } catch (final Throwable _t) {
        if (_t instanceof ContradictionException) {
          final ContradictionException e = (ContradictionException)_t;
          throw new BasicConstraintsException(this.name);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return true;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Recursive constraint generation
   */
  public Constraint generateConstraint(final DissimilarityRelation relation, final DissimilarityClause clause) {
    if ((clause instanceof DissimilarityEntry)) {
      return this.generateDissimilarityEntry(relation, ((DissimilarityEntry)clause));
    }
    if ((clause instanceof DissimilarityConjunction)) {
      final ArrayList<Constraint> list = new ArrayList<Constraint>();
      EList<DissimilarityClause> _dissimilarityClauses = ((DissimilarityConjunction) clause).getDissimilarityClauses();
      for (final DissimilarityClause c : _dissimilarityClauses) {
        Constraint _generateConstraint = this.generateConstraint(relation, c);
        list.add(_generateConstraint);
      }
      return LCF.and(((Constraint[])Conversions.unwrapArray(list, Constraint.class)));
    }
    if ((clause instanceof DissimilarityDisjunction)) {
      final ArrayList<Constraint> list_1 = new ArrayList<Constraint>();
      EList<DissimilarityClause> _dissimilarityClauses_1 = ((DissimilarityDisjunction) clause).getDissimilarityClauses();
      for (final DissimilarityClause c_1 : _dissimilarityClauses_1) {
        Constraint _generateConstraint_1 = this.generateConstraint(relation, c_1);
        list_1.add(_generateConstraint_1);
      }
      return LCF.or(((Constraint[])Conversions.unwrapArray(list_1, Constraint.class)));
    }
    return null;
  }
  
  /**
   * Helper method
   * 
   * This method creates a constraint which is required by this dissimilarity entry
   */
  public Constraint generateDissimilarityEntry(final DissimilarityRelation relation, final DissimilarityEntry entry) {
    HardwareArchitectureLevelType _level = entry.getLevel();
    ArrayList<ArrayList<IntVar>> _createAListOfLocationVariables = this.createAListOfLocationVariables(relation, _level);
    final ArrayList<ArrayList<IntVar>> varSetForAllDifferentConstraint = this.createDisjointVariableSets(_createAListOfLocationVariables);
    int[] dissimilarityValueList = null;
    HardwareArchitectureLevelType _level_1 = entry.getLevel();
    if (_level_1 != null) {
      switch (_level_1) {
        case COMPARTMENT:
          CompartmentAttributes _compartmentAttribute = entry.getCompartmentAttribute();
          if (_compartmentAttribute != null) {
            switch (_compartmentAttribute) {
              case NONE:
                break;
              case MANUFACTURER:
                EList<Compartment> _allCompartments = this.model.getAllCompartments();
                final Function1<Compartment, Integer> _function = new Function1<Compartment, Integer>() {
                  public Integer apply(final Compartment it) {
                    String _manufacturer = it.getManufacturer();
                    return Integer.valueOf(_manufacturer.hashCode());
                  }
                };
                List<Integer> _map = ListExtensions.<Compartment, Integer>map(_allCompartments, _function);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map, int.class));
                break;
              case POWERSUPPLY:
                EList<Compartment> _allCompartments_1 = this.model.getAllCompartments();
                final Function1<Compartment, Integer> _function_1 = new Function1<Compartment, Integer>() {
                  public Integer apply(final Compartment it) {
                    String _powerSupply = it.getPowerSupply();
                    return Integer.valueOf(_powerSupply.hashCode());
                  }
                };
                List<Integer> _map_1 = ListExtensions.<Compartment, Integer>map(_allCompartments_1, _function_1);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_1, int.class));
                break;
              case SIDE:
                EList<Compartment> _allCompartments_2 = this.model.getAllCompartments();
                final Function1<Compartment, Integer> _function_2 = new Function1<Compartment, Integer>() {
                  public Integer apply(final Compartment it) {
                    String _side = it.getSide();
                    return Integer.valueOf(_side.hashCode());
                  }
                };
                List<Integer> _map_2 = ListExtensions.<Compartment, Integer>map(_allCompartments_2, _function_2);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_2, int.class));
                break;
              case ZONE:
                EList<Compartment> _allCompartments_3 = this.model.getAllCompartments();
                final Function1<Compartment, Integer> _function_3 = new Function1<Compartment, Integer>() {
                  public Integer apply(final Compartment it) {
                    String _zone = it.getZone();
                    return Integer.valueOf(_zone.hashCode());
                  }
                };
                List<Integer> _map_3 = ListExtensions.<Compartment, Integer>map(_allCompartments_3, _function_3);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_3, int.class));
                break;
              default:
                break;
            }
          }
          break;
        case BOX:
          BoxAttributes _boxAttribute = entry.getBoxAttribute();
          if (_boxAttribute != null) {
            switch (_boxAttribute) {
              case NONE:
                break;
              case MANUFACTURER:
                EList<Box> _allBoxes = this.model.getAllBoxes();
                final Function1<Box, Integer> _function_4 = new Function1<Box, Integer>() {
                  public Integer apply(final Box it) {
                    String _manufacturer = it.getManufacturer();
                    return Integer.valueOf(_manufacturer.hashCode());
                  }
                };
                List<Integer> _map_4 = ListExtensions.<Box, Integer>map(_allBoxes, _function_4);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_4, int.class));
                break;
              default:
                break;
            }
          }
          break;
        case BOARD:
          BoardAttributes _boardAttribute = entry.getBoardAttribute();
          if (_boardAttribute != null) {
            switch (_boardAttribute) {
              case NONE:
                break;
              case MANUFACTURER:
                EList<Board> _allBoards = this.model.getAllBoards();
                final Function1<Board, Integer> _function_5 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    String _manufacturer = it.getManufacturer();
                    return Integer.valueOf(_manufacturer.hashCode());
                  }
                };
                List<Integer> _map_5 = ListExtensions.<Board, Integer>map(_allBoards, _function_5);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_5, int.class));
                break;
              case POWERSUPPLY:
                EList<Board> _allBoards_1 = this.model.getAllBoards();
                final Function1<Board, Integer> _function_6 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    String _powerSupply = it.getPowerSupply();
                    return Integer.valueOf(_powerSupply.hashCode());
                  }
                };
                List<Integer> _map_6 = ListExtensions.<Board, Integer>map(_allBoards_1, _function_6);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_6, int.class));
                break;
              case ASSURANCELEVEL:
                EList<Board> _allBoards_2 = this.model.getAllBoards();
                final Function1<Board, Integer> _function_7 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    DesignAssuranceLevelType _assuranceLevel = it.getAssuranceLevel();
                    return Integer.valueOf(_assuranceLevel.ordinal());
                  }
                };
                List<Integer> _map_7 = ListExtensions.<Board, Integer>map(_allBoards_2, _function_7);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_7, int.class));
                break;
              case BOARDTYPE:
                EList<Board> _allBoards_3 = this.model.getAllBoards();
                final Function1<Board, Integer> _function_8 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    String _boardType = it.getBoardType();
                    return Integer.valueOf(_boardType.hashCode());
                  }
                };
                List<Integer> _map_8 = ListExtensions.<Board, Integer>map(_allBoards_3, _function_8);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_8, int.class));
                break;
              case SIDE:
                EList<Board> _allBoards_4 = this.model.getAllBoards();
                final Function1<Board, Integer> _function_9 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    String _side = it.getSide();
                    return Integer.valueOf(_side.hashCode());
                  }
                };
                List<Integer> _map_9 = ListExtensions.<Board, Integer>map(_allBoards_4, _function_9);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_9, int.class));
                break;
              case ESS:
                EList<Board> _allBoards_5 = this.model.getAllBoards();
                final Function1<Board, Integer> _function_10 = new Function1<Board, Integer>() {
                  public Integer apply(final Board it) {
                    String _ess = it.getEss();
                    return Integer.valueOf(_ess.hashCode());
                  }
                };
                List<Integer> _map_10 = ListExtensions.<Board, Integer>map(_allBoards_5, _function_10);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_10, int.class));
                break;
              default:
                break;
            }
          }
          break;
        case PROCESSOR:
          ProcessorAttributes _processorAttribute = entry.getProcessorAttribute();
          if (_processorAttribute != null) {
            switch (_processorAttribute) {
              case NONE:
                break;
              case MANUFACTURER:
                EList<Processor> _allProcessors = this.model.getAllProcessors();
                final Function1<Processor, Integer> _function_11 = new Function1<Processor, Integer>() {
                  public Integer apply(final Processor it) {
                    String _manufacturer = it.getManufacturer();
                    return Integer.valueOf(_manufacturer.hashCode());
                  }
                };
                List<Integer> _map_11 = ListExtensions.<Processor, Integer>map(_allProcessors, _function_11);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_11, int.class));
                break;
              case PROCESSORTYPE:
                EList<Processor> _allProcessors_1 = this.model.getAllProcessors();
                final Function1<Processor, Integer> _function_12 = new Function1<Processor, Integer>() {
                  public Integer apply(final Processor it) {
                    String _processorType = it.getProcessorType();
                    return Integer.valueOf(_processorType.hashCode());
                  }
                };
                List<Integer> _map_12 = ListExtensions.<Processor, Integer>map(_allProcessors_1, _function_12);
                dissimilarityValueList = ((int[])Conversions.unwrapArray(_map_12, int.class));
                break;
              default:
                break;
            }
          }
          break;
        default:
          return null;
      }
    } else {
      return null;
    }
    final ArrayList<Constraint> constraintsList = new ArrayList<Constraint>();
    for (final ArrayList<IntVar> threadLocationVarGroup : varSetForAllDifferentConstraint) {
      {
        final ArrayList<IntVar> dissimilarityValueVarsForLocationVarGroup = new ArrayList<IntVar>();
        for (final IntVar threadLocationVar : threadLocationVarGroup) {
          {
            final int[] _converted_dissimilarityValueList = (int[])dissimilarityValueList;
            List<Integer> _sort = IterableExtensions.<Integer>sort(((Iterable<Integer>)Conversions.doWrapArray(_converted_dissimilarityValueList)));
            final IntVar threadDissimilarityValuesVar = VF.enumerated("DissimListVar", ((int[])Conversions.unwrapArray(_sort, int.class)), this.solver);
            dissimilarityValueVarsForLocationVarGroup.add(threadDissimilarityValuesVar);
            Constraint _element = ICF.element(threadDissimilarityValuesVar, dissimilarityValueList, threadLocationVar);
            this.solver.post(_element);
          }
        }
        Constraint _alldifferent = ICF.alldifferent(((IntVar[])Conversions.unwrapArray(dissimilarityValueVarsForLocationVarGroup, IntVar.class)));
        constraintsList.add(_alldifferent);
      }
    }
    final Constraint entireDissimEntryConstraint = LCF.and(((Constraint[])Conversions.unwrapArray(constraintsList, Constraint.class)));
    return entireDissimEntryConstraint;
  }
  
  /**
   * Helper method
   * 
   * Given a list of lists of location variables, this method computes another list of lists of location variables which can be directly used
   * for an allDifferent constraint
   */
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
  
  /**
   * Helper method
   * 
   * A relation may be specified for applications or applicationgroups;
   * 
   * This method creates a list of location variables for the specified architecture level
   */
  public ArrayList<ArrayList<IntVar>> createAListOfLocationVariables(final DissimilarityRelation relation, final HardwareArchitectureLevelType level) {
    final ArrayList<ArrayList<IntVar>> varList = new ArrayList<ArrayList<IntVar>>();
    EList<ApplicationOrApplicationGroup> _applicationsOrGroups = relation.getApplicationsOrGroups();
    for (final ApplicationOrApplicationGroup aog : _applicationsOrGroups) {
      {
        final ArrayList<IntVar> aogList = new ArrayList<IntVar>();
        if ((aog instanceof Application)) {
          EList<ch.hilbri.assist.datamodel.model.Thread> _threads = ((Application) aog).getThreads();
          for (final ch.hilbri.assist.datamodel.model.Thread t : _threads) {
            int _value = level.getValue();
            IntVar _threadLocationVariable = this.solverVariables.getThreadLocationVariable(t, _value);
            aogList.add(_threadLocationVariable);
          }
        } else {
          if ((aog instanceof ApplicationGroup)) {
            EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = ((ApplicationGroup) aog).getAllThreads();
            for (final ch.hilbri.assist.datamodel.model.Thread t_1 : _allThreads) {
              int _value_1 = level.getValue();
              IntVar _threadLocationVariable_1 = this.solverVariables.getThreadLocationVariable(t_1, _value_1);
              aogList.add(_threadLocationVariable_1);
            }
          } else {
            return null;
          }
        }
        varList.add(aogList);
      }
    }
    return varList;
  }
}

package ch.hilbri.assist.mapping.solver.constraints;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.CommunicationRelation;
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;
import ch.hilbri.assist.datamodel.model.Network;
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint;
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException;
import ch.hilbri.assist.mapping.solver.variables.SolverVariablesContainer;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.LCF;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class NetworkConstraints extends AbstractMappingConstraint {
  public NetworkConstraints(final AssistModel model, final Solver solver, final SolverVariablesContainer solverVariables) {
    super("Network constraints", model, solver, solverVariables);
    Class<? extends NetworkConstraints> _class = this.getClass();
    Logger _logger = LoggerFactory.getLogger(_class);
    this.logger = _logger;
  }
  
  public boolean generate() {
    try {
      final ArrayList<Integer> tableFromXToNetwork = new ArrayList<Integer>();
      EList<Network> _networks = this.model.getNetworks();
      for (final Network network : _networks) {
        EList<Board> _boards = network.getBoards();
        for (final Board board : _boards) {
          EList<Network> _networks_1 = this.model.getNetworks();
          int _indexOf = _networks_1.indexOf(network);
          tableFromXToNetwork.add(Integer.valueOf(_indexOf));
        }
      }
      final ArrayList<Integer> tableFromXToBoard = new ArrayList<Integer>();
      EList<Network> _networks_2 = this.model.getNetworks();
      for (final Network network_1 : _networks_2) {
        EList<Board> _boards_1 = network_1.getBoards();
        for (final Board board_1 : _boards_1) {
          EList<Board> _allBoards = this.model.getAllBoards();
          int _indexOf_1 = _allBoards.indexOf(board_1);
          tableFromXToBoard.add(Integer.valueOf(_indexOf_1));
        }
      }
      EList<CommunicationRelation> _communicationRelations = this.model.getCommunicationRelations();
      for (final CommunicationRelation commRelation : _communicationRelations) {
        EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads = commRelation.getAllThreads();
        for (final ch.hilbri.assist.datamodel.model.Thread thread : _allThreads) {
          {
            final IntVar commRelVar = this.solverVariables.getCommunicationRelationLocationVariable(commRelation);
            int _size = tableFromXToNetwork.size();
            int _minus = (_size - 1);
            final IntVar xVar = VF.enumerated("X", 0, _minus, this.solver);
            Constraint _element = ICF.element(commRelVar, ((int[])Conversions.unwrapArray(tableFromXToNetwork, int.class)), xVar);
            this.solver.post(_element);
            int _value = HardwareArchitectureLevelType.BOARD.getValue();
            final IntVar LocVar = this.solverVariables.getThreadLocationVariable(thread, _value);
            Constraint _element_1 = ICF.element(LocVar, ((int[])Conversions.unwrapArray(tableFromXToBoard, int.class)), xVar);
            this.solver.post(_element_1);
          }
        }
      }
      EList<Network> _networks_3 = this.model.getNetworks();
      final Function1<Network, Boolean> _function = new Function1<Network, Boolean>() {
        public Boolean apply(final Network it) {
          return Boolean.valueOf(it.isIsBoardLocal());
        }
      };
      Iterable<Network> _filter = IterableExtensions.<Network>filter(_networks_3, _function);
      final Function1<Network, Integer> _function_1 = new Function1<Network, Integer>() {
        public Integer apply(final Network it) {
          EList<Network> _networks = NetworkConstraints.this.model.getNetworks();
          return Integer.valueOf(_networks.indexOf(it));
        }
      };
      final Iterable<Integer> indicesOfVirtualNetworks = IterableExtensions.<Network, Integer>map(_filter, _function_1);
      EList<CommunicationRelation> _communicationRelations_1 = this.model.getCommunicationRelations();
      for (final CommunicationRelation commRelation_1 : _communicationRelations_1) {
        {
          final IntVar commRelVar = this.solverVariables.getCommunicationRelationLocationVariable(commRelation_1);
          final Constraint deploymentToRealNetworkConstraint = ICF.not_member(commRelVar, ((int[])Conversions.unwrapArray(indicesOfVirtualNetworks, int.class)));
          EList<ch.hilbri.assist.datamodel.model.Thread> _allThreads_1 = commRelation_1.getAllThreads();
          final Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar> _function_2 = new Function1<ch.hilbri.assist.datamodel.model.Thread, IntVar>() {
            public IntVar apply(final ch.hilbri.assist.datamodel.model.Thread it) {
              int _value = HardwareArchitectureLevelType.BOARD.getValue();
              return NetworkConstraints.this.solverVariables.getThreadLocationVariable(it, _value);
            }
          };
          final List<IntVar> allLocationVariablesOfCommRelation = ListExtensions.<ch.hilbri.assist.datamodel.model.Thread, IntVar>map(_allThreads_1, _function_2);
          IntVar _fixed = VF.fixed(2, this.solver);
          final Constraint useAtLeastTwoBoardsForRealNetworkDeploymentConstraint = ICF.atleast_nvalues(((IntVar[])Conversions.unwrapArray(allLocationVariablesOfCommRelation, IntVar.class)), _fixed, true);
          LCF.ifThen(deploymentToRealNetworkConstraint, useAtLeastTwoBoardsForRealNetworkDeploymentConstraint);
        }
      }
      EList<Network> _networks_4 = this.model.getNetworks();
      final Function1<Network, Boolean> _function_2 = new Function1<Network, Boolean>() {
        public Boolean apply(final Network it) {
          boolean _isIsBoardLocal = it.isIsBoardLocal();
          return Boolean.valueOf((_isIsBoardLocal == false));
        }
      };
      Iterable<Network> _filter_1 = IterableExtensions.<Network>filter(_networks_4, _function_2);
      for (final Network network_2 : _filter_1) {
        {
          final ArrayList<BoolVar> factorList = new ArrayList<BoolVar>();
          final ArrayList<Integer> bandwidthUtilizationList = new ArrayList<Integer>();
          EList<CommunicationRelation> _communicationRelations_2 = this.model.getCommunicationRelations();
          for (final CommunicationRelation commRelation_2 : _communicationRelations_2) {
            {
              final IntVar commRelVar = this.solverVariables.getCommunicationRelationLocationVariable(commRelation_2);
              EList<Network> _networks_5 = this.model.getNetworks();
              int _indexOf_2 = _networks_5.indexOf(network_2);
              final Constraint constraint = ICF.arithm(commRelVar, "=", _indexOf_2);
              final BoolVar delta = constraint.reif();
              factorList.add(delta);
              int _bandwidthUtilization = commRelation_2.getBandwidthUtilization();
              bandwidthUtilizationList.add(Integer.valueOf(_bandwidthUtilization));
            }
          }
          IntVar _absoluteBandwidthUtilizationVariable = this.solverVariables.getAbsoluteBandwidthUtilizationVariable(network_2);
          Constraint _scalar = ICF.scalar(((IntVar[])Conversions.unwrapArray(factorList, IntVar.class)), ((int[])Conversions.unwrapArray(bandwidthUtilizationList, int.class)), "=", _absoluteBandwidthUtilizationVariable);
          this.solver.post(_scalar);
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
}

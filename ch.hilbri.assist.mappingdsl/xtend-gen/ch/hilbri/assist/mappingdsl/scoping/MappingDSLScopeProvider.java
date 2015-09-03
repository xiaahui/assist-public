/**
 * generated by Xtext
 */
package ch.hilbri.assist.mappingdsl.scoping;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.HardwareElementContainer;
import ch.hilbri.assist.datamodel.model.Processor;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom scoping description.
 */
@SuppressWarnings("all")
public class MappingDSLScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private IQualifiedNameProvider nameprovider;
  
  /**
   * Referenzen auf ein HardwareElement (FixedDeployment) soll es nur
   * fuer Compartments, Boxen, Boards, Prozessoren und Cores geben;
   * daher bauen wir uns hier einen eigenen Scope zusammen.
   * 
   * Der QualifiedNameProvider ist wichtig, denn damit koennen auch gleichnamige
   * Boxen in unterschiedlichen Compartments referenziert werden.
   */
  public IScope scope_HardwareElement(final AssistModel ctx, final EReference ref) {
    EList<HardwareElementContainer> _hardwareContainer = ctx.getHardwareContainer();
    HardwareElementContainer _get = _hardwareContainer.get(0);
    if ((_get instanceof Compartment)) {
      final ArrayList<EObject> list = CollectionLiterals.<EObject>newArrayList();
      EList<HardwareElementContainer> _hardwareContainer_1 = ctx.getHardwareContainer();
      for (final HardwareElementContainer cont : _hardwareContainer_1) {
        {
          final Compartment compartment = ((Compartment) cont);
          list.add(compartment);
          EList<Box> _boxes = compartment.getBoxes();
          for (final Box box : _boxes) {
            {
              list.add(box);
              EList<Board> _boards = box.getBoards();
              for (final Board board : _boards) {
                {
                  list.add(board);
                  EList<Processor> _processors = board.getProcessors();
                  for (final Processor processor : _processors) {
                    {
                      list.add(processor);
                      EList<Core> _cores = processor.getCores();
                      for (final Core core : _cores) {
                        list.add(core);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return Scopes.<EObject>scopeFor(list, this.nameprovider, IScope.NULLSCOPE);
    } else {
      EList<HardwareElementContainer> _hardwareContainer_2 = ctx.getHardwareContainer();
      HardwareElementContainer _get_1 = _hardwareContainer_2.get(0);
      if ((_get_1 instanceof Box)) {
        final ArrayList<EObject> list_1 = CollectionLiterals.<EObject>newArrayList();
        EList<HardwareElementContainer> _hardwareContainer_3 = ctx.getHardwareContainer();
        for (final HardwareElementContainer cont_1 : _hardwareContainer_3) {
          {
            final Box box = ((Box) cont_1);
            list_1.add(box);
            EList<Board> _boards = box.getBoards();
            for (final Board board : _boards) {
              {
                list_1.add(board);
                EList<Processor> _processors = board.getProcessors();
                for (final Processor processor : _processors) {
                  {
                    list_1.add(processor);
                    EList<Core> _cores = processor.getCores();
                    for (final Core core : _cores) {
                      list_1.add(core);
                    }
                  }
                }
              }
            }
          }
        }
        return Scopes.<EObject>scopeFor(list_1, this.nameprovider, IScope.NULLSCOPE);
      } else {
        EList<HardwareElementContainer> _hardwareContainer_4 = ctx.getHardwareContainer();
        HardwareElementContainer _get_2 = _hardwareContainer_4.get(0);
        if ((_get_2 instanceof Board)) {
          final ArrayList<EObject> list_2 = CollectionLiterals.<EObject>newArrayList();
          EList<HardwareElementContainer> _hardwareContainer_5 = ctx.getHardwareContainer();
          for (final HardwareElementContainer cont_2 : _hardwareContainer_5) {
            {
              final Board board = ((Board) cont_2);
              list_2.add(board);
              EList<Processor> _processors = board.getProcessors();
              for (final Processor processor : _processors) {
                {
                  list_2.add(processor);
                  EList<Core> _cores = processor.getCores();
                  for (final Core core : _cores) {
                    list_2.add(core);
                  }
                }
              }
            }
          }
          return Scopes.<EObject>scopeFor(list_2, this.nameprovider, IScope.NULLSCOPE);
        } else {
          return IScope.NULLSCOPE;
        }
      }
    }
  }
}
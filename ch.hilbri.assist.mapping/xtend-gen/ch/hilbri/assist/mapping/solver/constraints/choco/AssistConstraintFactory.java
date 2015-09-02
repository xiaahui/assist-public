package ch.hilbri.assist.mapping.solver.constraints.choco;

import ch.hilbri.assist.mapping.solver.constraints.choco.PropAllDiffListsOfListsInst;
import ch.hilbri.assist.mapping.solver.constraints.choco.PropIntValuesUnion;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.nary.alldifferent.PropAllDiffAC;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AssistConstraintFactory {
  public static Constraint allDifferent(final List<List<IntVar>> VARS, final IntVar[] domainUnionVars) {
    final ArrayList<Integer> cumulLengths = new ArrayList<Integer>();
    for (int i = 0; (i < VARS.size()); i++) {
      {
        final List<IntVar> subList = VARS.get(i);
        final int subListSize = ((Object[])Conversions.unwrapArray(subList, Object.class)).length;
        if ((i == 0)) {
          cumulLengths.add(Integer.valueOf(subListSize));
        } else {
          Integer _last = IterableExtensions.<Integer>last(cumulLengths);
          int _plus = (subListSize + (_last).intValue());
          cumulLengths.add(Integer.valueOf(_plus));
        }
      }
    }
    final ArrayList<Propagator> props = CollectionLiterals.<Propagator>newArrayList();
    int _size = VARS.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final int i : _doubleDotLessThan) {
      List<IntVar> _get = VARS.get(i);
      IntVar _get_1 = domainUnionVars[i];
      PropIntValuesUnion _propIntValuesUnion = new PropIntValuesUnion(((IntVar[])Conversions.unwrapArray(_get, IntVar.class)), _get_1);
      props.add(_propIntValuesUnion);
    }
    Iterable<IntVar> _flatten = Iterables.<IntVar>concat(VARS);
    PropAllDiffListsOfListsInst _propAllDiffListsOfListsInst = new PropAllDiffListsOfListsInst(((int[])Conversions.unwrapArray(cumulLengths, int.class)), ((IntVar[])Conversions.unwrapArray(_flatten, IntVar.class)));
    props.add(_propAllDiffListsOfListsInst);
    PropAllDiffAC _propAllDiffAC = new PropAllDiffAC(domainUnionVars);
    props.add(_propAllDiffAC);
    int _size_1 = VARS.size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
    for (final int i_1 : _doubleDotLessThan_1) {
      List<IntVar> _get_2 = VARS.get(i_1);
      IntVar _get_3 = domainUnionVars[i_1];
      PropIntValuesUnion _propIntValuesUnion_1 = new PropIntValuesUnion(((IntVar[])Conversions.unwrapArray(_get_2, IntVar.class)), _get_3);
      props.add(_propIntValuesUnion_1);
    }
    return new Constraint("AllDifferent", ((Propagator[])Conversions.unwrapArray(props, Propagator.class)));
  }
}

package ch.hilbri.assist.datamodel;

import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ResultTestClass {
  public static void main(final String[] args) {
    final Function2<Integer, Integer, Integer> _function = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer i1, final Integer i2) {
        return Integer.valueOf(((i1).intValue() + (i2).intValue()));
      }
    };
    Integer _reduce = IterableExtensions.<Integer>reduce(new IntegerRange(1, 5), _function);
    System.out.println(_reduce);
  }
}

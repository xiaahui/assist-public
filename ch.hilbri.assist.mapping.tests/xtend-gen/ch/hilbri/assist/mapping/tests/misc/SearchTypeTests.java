package ch.hilbri.assist.mapping.tests.misc;

import ch.hilbri.assist.mapping.solver.SearchType;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class SearchTypeTests {
  @Test
  public void checkExactlyOneDefault() {
    SearchType[] _values = SearchType.values();
    final Function1<SearchType, Boolean> _function = (SearchType it) -> {
      return Boolean.valueOf(it.isDefault());
    };
    Iterable<SearchType> _filter = IterableExtensions.<SearchType>filter(((Iterable<SearchType>)Conversions.doWrapArray(_values)), _function);
    int _length = ((Object[])Conversions.unwrapArray(_filter, Object.class)).length;
    Assert.assertEquals(_length, 1);
  }
  
  @Test
  public void checkAvailableStrategieCount() {
    SearchType[] _values = SearchType.values();
    int _length = _values.length;
    boolean _greaterEqualsThan = (_length >= 1);
    Assert.assertTrue(_greaterEqualsThan);
  }
  
  @Test
  public void checkStaticDefaultIsDefault() {
    SearchType _defaultSearchType = SearchType.getDefaultSearchType();
    boolean _isDefault = _defaultSearchType.isDefault();
    Assert.assertTrue(_isDefault);
  }
}

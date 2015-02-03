package ch.hilbri.assist.mapping.importers.excel;

import java.util.Comparator;

@SuppressWarnings("all")
public class StringWithNumberPostFixComparator implements Comparator<String> {
  public int compare(final String o1, final String o2) {
    String _replaceAll = o1.replaceAll("^[a-zA-Z]*", "");
    final int o1Num = Integer.parseInt(_replaceAll);
    String _replaceAll_1 = o2.replaceAll("^[a-zA-Z]*", "");
    final int o2Num = Integer.parseInt(_replaceAll_1);
    return (o1Num - o2Num);
  }
}

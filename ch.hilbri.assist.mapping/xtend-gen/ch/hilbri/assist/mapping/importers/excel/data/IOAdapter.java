package ch.hilbri.assist.mapping.importers.excel.data;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class IOAdapter implements Comparable<IOAdapter> {
  private final String type;
  
  private final String ioProtectionLevel;
  
  private final String units;
  
  public int compareTo(final IOAdapter o) {
    String _replaceAll = this.type.replaceAll("^[a-zA-Z]*", "");
    final int myNumber = Integer.parseInt(_replaceAll);
    String _replaceAll_1 = o.type.replaceAll("^[a-zA-Z]*", "");
    final int otherNumber = Integer.parseInt(_replaceAll_1);
    return (myNumber - otherNumber);
  }
  
  public IOAdapter(final String type, final String ioProtectionLevel, final String units) {
    super();
    this.type = type;
    this.ioProtectionLevel = ioProtectionLevel;
    this.units = units;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.type== null) ? 0 : this.type.hashCode());
    result = prime * result + ((this.ioProtectionLevel== null) ? 0 : this.ioProtectionLevel.hashCode());
    result = prime * result + ((this.units== null) ? 0 : this.units.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    IOAdapter other = (IOAdapter) obj;
    if (this.type == null) {
      if (other.type != null)
        return false;
    } else if (!this.type.equals(other.type))
      return false;
    if (this.ioProtectionLevel == null) {
      if (other.ioProtectionLevel != null)
        return false;
    } else if (!this.ioProtectionLevel.equals(other.ioProtectionLevel))
      return false;
    if (this.units == null) {
      if (other.units != null)
        return false;
    } else if (!this.units.equals(other.units))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("type", this.type);
    b.add("ioProtectionLevel", this.ioProtectionLevel);
    b.add("units", this.units);
    return b.toString();
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  @Pure
  public String getIoProtectionLevel() {
    return this.ioProtectionLevel;
  }
  
  @Pure
  public String getUnits() {
    return this.units;
  }
}

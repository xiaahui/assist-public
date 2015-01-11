package ch.hilbri.assist.mapping.importers.excel.data;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class IOAdapter {
  private final String _name;
  
  private final String _type;
  
  private final String _ioProtectionLevel;
  
  private final String _units;
  
  public IOAdapter(final String name, final String type, final String ioProtectionLevel, final String units) {
    super();
    this._name = name;
    this._type = type;
    this._ioProtectionLevel = ioProtectionLevel;
    this._units = units;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + ((this._type== null) ? 0 : this._type.hashCode());
    result = prime * result + ((this._ioProtectionLevel== null) ? 0 : this._ioProtectionLevel.hashCode());
    result = prime * result + ((this._units== null) ? 0 : this._units.hashCode());
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
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (this._type == null) {
      if (other._type != null)
        return false;
    } else if (!this._type.equals(other._type))
      return false;
    if (this._ioProtectionLevel == null) {
      if (other._ioProtectionLevel != null)
        return false;
    } else if (!this._ioProtectionLevel.equals(other._ioProtectionLevel))
      return false;
    if (this._units == null) {
      if (other._units != null)
        return false;
    } else if (!this._units.equals(other._units))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public String getName() {
    return this._name;
  }
  
  @Pure
  public String getType() {
    return this._type;
  }
  
  @Pure
  public String getIoProtectionLevel() {
    return this._ioProtectionLevel;
  }
  
  @Pure
  public String getUnits() {
    return this._units;
  }
}

package ch.hilbri.assist.mapping.importers.excel.data;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class GenericParameter {
  private final String _name;
  
  private final String _value;
  
  public GenericParameter(final String name, final String value) {
    super();
    this._name = name;
    this._value = value;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + ((this._value== null) ? 0 : this._value.hashCode());
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
    GenericParameter other = (GenericParameter) obj;
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (this._value == null) {
      if (other._value != null)
        return false;
    } else if (!this._value.equals(other._value))
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
  public String getValue() {
    return this._value;
  }
}

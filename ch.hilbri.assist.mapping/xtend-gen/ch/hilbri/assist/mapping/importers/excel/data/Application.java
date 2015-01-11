package ch.hilbri.assist.mapping.importers.excel.data;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Application {
  private final String _name;
  
  private final String _protectionLevel;
  
  /**
   * String: ioAdapterType, Integer: Anzahl
   */
  private final Map<String, Integer> _ioAdapterRequirements = new HashMap<String, Integer>();
  
  private final Map<String, String> _genericParameters = new HashMap<String, String>();
  
  public Application(final String name, final String protectionLevel) {
    super();
    this._name = name;
    this._protectionLevel = protectionLevel;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + ((this._protectionLevel== null) ? 0 : this._protectionLevel.hashCode());
    result = prime * result + ((this._ioAdapterRequirements== null) ? 0 : this._ioAdapterRequirements.hashCode());
    result = prime * result + ((this._genericParameters== null) ? 0 : this._genericParameters.hashCode());
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
    Application other = (Application) obj;
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (this._protectionLevel == null) {
      if (other._protectionLevel != null)
        return false;
    } else if (!this._protectionLevel.equals(other._protectionLevel))
      return false;
    if (this._ioAdapterRequirements == null) {
      if (other._ioAdapterRequirements != null)
        return false;
    } else if (!this._ioAdapterRequirements.equals(other._ioAdapterRequirements))
      return false;
    if (this._genericParameters == null) {
      if (other._genericParameters != null)
        return false;
    } else if (!this._genericParameters.equals(other._genericParameters))
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
  public String getProtectionLevel() {
    return this._protectionLevel;
  }
  
  @Pure
  public Map<String, Integer> getIoAdapterRequirements() {
    return this._ioAdapterRequirements;
  }
  
  @Pure
  public Map<String, String> getGenericParameters() {
    return this._genericParameters;
  }
}

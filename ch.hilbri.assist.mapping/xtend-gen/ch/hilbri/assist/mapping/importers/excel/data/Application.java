package ch.hilbri.assist.mapping.importers.excel.data;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Application {
  private final String name;
  
  private final String protectionLevel;
  
  /**
   * String: ioAdapterType, Integer: Anzahl
   */
  private final Map<String, Integer> ioAdapterRequirements = new HashMap<String, Integer>();
  
  private final Map<String, String> genericParameters = new HashMap<String, String>();
  
  public Application(final String name, final String protectionLevel) {
    super();
    this.name = name;
    this.protectionLevel = protectionLevel;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.protectionLevel== null) ? 0 : this.protectionLevel.hashCode());
    result = prime * result + ((this.ioAdapterRequirements== null) ? 0 : this.ioAdapterRequirements.hashCode());
    result = prime * result + ((this.genericParameters== null) ? 0 : this.genericParameters.hashCode());
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
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.protectionLevel == null) {
      if (other.protectionLevel != null)
        return false;
    } else if (!this.protectionLevel.equals(other.protectionLevel))
      return false;
    if (this.ioAdapterRequirements == null) {
      if (other.ioAdapterRequirements != null)
        return false;
    } else if (!this.ioAdapterRequirements.equals(other.ioAdapterRequirements))
      return false;
    if (this.genericParameters == null) {
      if (other.genericParameters != null)
        return false;
    } else if (!this.genericParameters.equals(other.genericParameters))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("protectionLevel", this.protectionLevel);
    b.add("ioAdapterRequirements", this.ioAdapterRequirements);
    b.add("genericParameters", this.genericParameters);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public String getProtectionLevel() {
    return this.protectionLevel;
  }
  
  @Pure
  public Map<String, Integer> getIoAdapterRequirements() {
    return this.ioAdapterRequirements;
  }
  
  @Pure
  public Map<String, String> getGenericParameters() {
    return this.genericParameters;
  }
}

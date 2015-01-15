package ch.hilbri.assist.mapping.importers.excel.data;

import ch.hilbri.assist.mapping.importers.excel.data.IOAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class Board {
  private final String name;
  
  private final String type;
  
  private final String powersupply;
  
  private final String side;
  
  private final String ess;
  
  private final Map<String, String> genericParameters = new HashMap<String, String>();
  
  private final ArrayList<IOAdapter> ioAdapters = new ArrayList<IOAdapter>();
  
  public Board(final String name, final String type, final String powersupply, final String side, final String ess) {
    super();
    this.name = name;
    this.type = type;
    this.powersupply = powersupply;
    this.side = side;
    this.ess = ess;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.type== null) ? 0 : this.type.hashCode());
    result = prime * result + ((this.powersupply== null) ? 0 : this.powersupply.hashCode());
    result = prime * result + ((this.side== null) ? 0 : this.side.hashCode());
    result = prime * result + ((this.ess== null) ? 0 : this.ess.hashCode());
    result = prime * result + ((this.genericParameters== null) ? 0 : this.genericParameters.hashCode());
    result = prime * result + ((this.ioAdapters== null) ? 0 : this.ioAdapters.hashCode());
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
    Board other = (Board) obj;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.type == null) {
      if (other.type != null)
        return false;
    } else if (!this.type.equals(other.type))
      return false;
    if (this.powersupply == null) {
      if (other.powersupply != null)
        return false;
    } else if (!this.powersupply.equals(other.powersupply))
      return false;
    if (this.side == null) {
      if (other.side != null)
        return false;
    } else if (!this.side.equals(other.side))
      return false;
    if (this.ess == null) {
      if (other.ess != null)
        return false;
    } else if (!this.ess.equals(other.ess))
      return false;
    if (this.genericParameters == null) {
      if (other.genericParameters != null)
        return false;
    } else if (!this.genericParameters.equals(other.genericParameters))
      return false;
    if (this.ioAdapters == null) {
      if (other.ioAdapters != null)
        return false;
    } else if (!this.ioAdapters.equals(other.ioAdapters))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("type", this.type);
    b.add("powersupply", this.powersupply);
    b.add("side", this.side);
    b.add("ess", this.ess);
    b.add("genericParameters", this.genericParameters);
    b.add("ioAdapters", this.ioAdapters);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  @Pure
  public String getPowersupply() {
    return this.powersupply;
  }
  
  @Pure
  public String getSide() {
    return this.side;
  }
  
  @Pure
  public String getEss() {
    return this.ess;
  }
  
  @Pure
  public Map<String, String> getGenericParameters() {
    return this.genericParameters;
  }
  
  @Pure
  public ArrayList<IOAdapter> getIoAdapters() {
    return this.ioAdapters;
  }
}

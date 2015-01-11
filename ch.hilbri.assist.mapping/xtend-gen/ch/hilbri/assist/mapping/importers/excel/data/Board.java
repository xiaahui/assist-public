package ch.hilbri.assist.mapping.importers.excel.data;

import ch.hilbri.assist.mapping.importers.excel.data.IOAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Board {
  private final String _name;
  
  private final String _type;
  
  private final String _powersupply;
  
  private final String _side;
  
  private final String _route;
  
  private final Map<String, String> _genericParameters = new HashMap<String, String>();
  
  private final ArrayList<IOAdapter> _ioAdapters = new ArrayList<IOAdapter>();
  
  public Board(final String name, final String type, final String powersupply, final String side, final String route) {
    super();
    this._name = name;
    this._type = type;
    this._powersupply = powersupply;
    this._side = side;
    this._route = route;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + ((this._type== null) ? 0 : this._type.hashCode());
    result = prime * result + ((this._powersupply== null) ? 0 : this._powersupply.hashCode());
    result = prime * result + ((this._side== null) ? 0 : this._side.hashCode());
    result = prime * result + ((this._route== null) ? 0 : this._route.hashCode());
    result = prime * result + ((this._genericParameters== null) ? 0 : this._genericParameters.hashCode());
    result = prime * result + ((this._ioAdapters== null) ? 0 : this._ioAdapters.hashCode());
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
    if (this._powersupply == null) {
      if (other._powersupply != null)
        return false;
    } else if (!this._powersupply.equals(other._powersupply))
      return false;
    if (this._side == null) {
      if (other._side != null)
        return false;
    } else if (!this._side.equals(other._side))
      return false;
    if (this._route == null) {
      if (other._route != null)
        return false;
    } else if (!this._route.equals(other._route))
      return false;
    if (this._genericParameters == null) {
      if (other._genericParameters != null)
        return false;
    } else if (!this._genericParameters.equals(other._genericParameters))
      return false;
    if (this._ioAdapters == null) {
      if (other._ioAdapters != null)
        return false;
    } else if (!this._ioAdapters.equals(other._ioAdapters))
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
  public String getPowersupply() {
    return this._powersupply;
  }
  
  @Pure
  public String getSide() {
    return this._side;
  }
  
  @Pure
  public String getRoute() {
    return this._route;
  }
  
  @Pure
  public Map<String, String> getGenericParameters() {
    return this._genericParameters;
  }
  
  @Pure
  public ArrayList<IOAdapter> getIoAdapters() {
    return this._ioAdapters;
  }
}

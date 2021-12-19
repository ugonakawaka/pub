package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oreore.nrf.model.PlmnId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * Information of a SEPP Instance
 */
@ApiModel(description = "Information of a SEPP Instance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class SeppInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("seppPorts")
  @Valid
  private Map<String, Integer> seppPorts = null;

  @JsonProperty("remotePlmnList")
  @Valid
  private List<PlmnId> remotePlmnList = null;

  public SeppInfo seppPorts(Map<String, Integer> seppPorts) {
    this.seppPorts = seppPorts;
    return this;
  }

  public SeppInfo putSeppPortsItem(String key, Integer seppPortsItem) {
    if (this.seppPorts == null) {
      this.seppPorts = new HashMap<>();
    }
    this.seppPorts.put(key, seppPortsItem);
    return this;
  }

  /**
   * Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"
   * @return seppPorts
  */
  @ApiModelProperty(value = "Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"")

@Size(min = 1) 
  public Map<String, Integer> getSeppPorts() {
    return seppPorts;
  }

  public void setSeppPorts(Map<String, Integer> seppPorts) {
    this.seppPorts = seppPorts;
  }

  public SeppInfo remotePlmnList(List<PlmnId> remotePlmnList) {
    this.remotePlmnList = remotePlmnList;
    return this;
  }

  public SeppInfo addRemotePlmnListItem(PlmnId remotePlmnListItem) {
    if (this.remotePlmnList == null) {
      this.remotePlmnList = new ArrayList<>();
    }
    this.remotePlmnList.add(remotePlmnListItem);
    return this;
  }

  /**
   * Get remotePlmnList
   * @return remotePlmnList
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<PlmnId> getRemotePlmnList() {
    return remotePlmnList;
  }

  public void setRemotePlmnList(List<PlmnId> remotePlmnList) {
    this.remotePlmnList = remotePlmnList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeppInfo seppInfo = (SeppInfo) o;
    return Objects.equals(this.seppPorts, seppInfo.seppPorts) &&
        Objects.equals(this.remotePlmnList, seppInfo.remotePlmnList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seppPorts, remotePlmnList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeppInfo {\n");
    
    sb.append("    seppPorts: ").append(toIndentedString(seppPorts)).append("\n");
    sb.append("    remotePlmnList: ").append(toIndentedString(remotePlmnList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


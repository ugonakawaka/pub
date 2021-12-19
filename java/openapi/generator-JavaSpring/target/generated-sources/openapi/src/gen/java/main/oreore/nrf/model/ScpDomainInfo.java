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
import oreore.nrf.model.IpEndPoint;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * SCP Domain specific information
 */
@ApiModel(description = "SCP Domain specific information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class ScpDomainInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("scpFqdn")
  private String scpFqdn;

  @JsonProperty("scpIpEndPoints")
  @Valid
  private List<IpEndPoint> scpIpEndPoints = null;

  @JsonProperty("scpPrefix")
  private String scpPrefix;

  @JsonProperty("scpPorts")
  @Valid
  private Map<String, Integer> scpPorts = null;

  public ScpDomainInfo scpFqdn(String scpFqdn) {
    this.scpFqdn = scpFqdn;
    return this;
  }

  /**
   * Fully Qualified Domain Name
   * @return scpFqdn
  */
  @ApiModelProperty(value = "Fully Qualified Domain Name")


  public String getScpFqdn() {
    return scpFqdn;
  }

  public void setScpFqdn(String scpFqdn) {
    this.scpFqdn = scpFqdn;
  }

  public ScpDomainInfo scpIpEndPoints(List<IpEndPoint> scpIpEndPoints) {
    this.scpIpEndPoints = scpIpEndPoints;
    return this;
  }

  public ScpDomainInfo addScpIpEndPointsItem(IpEndPoint scpIpEndPointsItem) {
    if (this.scpIpEndPoints == null) {
      this.scpIpEndPoints = new ArrayList<>();
    }
    this.scpIpEndPoints.add(scpIpEndPointsItem);
    return this;
  }

  /**
   * Get scpIpEndPoints
   * @return scpIpEndPoints
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<IpEndPoint> getScpIpEndPoints() {
    return scpIpEndPoints;
  }

  public void setScpIpEndPoints(List<IpEndPoint> scpIpEndPoints) {
    this.scpIpEndPoints = scpIpEndPoints;
  }

  public ScpDomainInfo scpPrefix(String scpPrefix) {
    this.scpPrefix = scpPrefix;
    return this;
  }

  /**
   * Get scpPrefix
   * @return scpPrefix
  */
  @ApiModelProperty(value = "")


  public String getScpPrefix() {
    return scpPrefix;
  }

  public void setScpPrefix(String scpPrefix) {
    this.scpPrefix = scpPrefix;
  }

  public ScpDomainInfo scpPorts(Map<String, Integer> scpPorts) {
    this.scpPorts = scpPorts;
    return this;
  }

  public ScpDomainInfo putScpPortsItem(String key, Integer scpPortsItem) {
    if (this.scpPorts == null) {
      this.scpPorts = new HashMap<>();
    }
    this.scpPorts.put(key, scpPortsItem);
    return this;
  }

  /**
   * Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"
   * @return scpPorts
  */
  @ApiModelProperty(value = "Port numbers for HTTP and HTTPS. The key of the map shall be \"http\" or \"https\"")

@Size(min = 1) 
  public Map<String, Integer> getScpPorts() {
    return scpPorts;
  }

  public void setScpPorts(Map<String, Integer> scpPorts) {
    this.scpPorts = scpPorts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScpDomainInfo scpDomainInfo = (ScpDomainInfo) o;
    return Objects.equals(this.scpFqdn, scpDomainInfo.scpFqdn) &&
        Objects.equals(this.scpIpEndPoints, scpDomainInfo.scpIpEndPoints) &&
        Objects.equals(this.scpPrefix, scpDomainInfo.scpPrefix) &&
        Objects.equals(this.scpPorts, scpDomainInfo.scpPorts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scpFqdn, scpIpEndPoints, scpPrefix, scpPorts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScpDomainInfo {\n");
    
    sb.append("    scpFqdn: ").append(toIndentedString(scpFqdn)).append("\n");
    sb.append("    scpIpEndPoints: ").append(toIndentedString(scpIpEndPoints)).append("\n");
    sb.append("    scpPrefix: ").append(toIndentedString(scpPrefix)).append("\n");
    sb.append("    scpPorts: ").append(toIndentedString(scpPorts)).append("\n");
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


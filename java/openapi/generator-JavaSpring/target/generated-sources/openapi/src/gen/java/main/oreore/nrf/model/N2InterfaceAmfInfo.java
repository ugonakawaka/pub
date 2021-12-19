package oreore.nrf.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import oreore.nrf.model.Ipv6Addr;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * AMF N2 interface information
 */
@ApiModel(description = "AMF N2 interface information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-19T15:04:29.833052+09:00[Asia/Tokyo]")
public class N2InterfaceAmfInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ipv4EndpointAddress")
  @Valid
  private List<String> ipv4EndpointAddress = null;

  @JsonProperty("ipv6EndpointAddress")
  @Valid
  private List<Ipv6Addr> ipv6EndpointAddress = null;

  @JsonProperty("amfName")
  private String amfName;

  public N2InterfaceAmfInfo ipv4EndpointAddress(List<String> ipv4EndpointAddress) {
    this.ipv4EndpointAddress = ipv4EndpointAddress;
    return this;
  }

  public N2InterfaceAmfInfo addIpv4EndpointAddressItem(String ipv4EndpointAddressItem) {
    if (this.ipv4EndpointAddress == null) {
      this.ipv4EndpointAddress = new ArrayList<>();
    }
    this.ipv4EndpointAddress.add(ipv4EndpointAddressItem);
    return this;
  }

  /**
   * Get ipv4EndpointAddress
   * @return ipv4EndpointAddress
  */
  @ApiModelProperty(value = "")

@Size(min = 1) 
  public List<String> getIpv4EndpointAddress() {
    return ipv4EndpointAddress;
  }

  public void setIpv4EndpointAddress(List<String> ipv4EndpointAddress) {
    this.ipv4EndpointAddress = ipv4EndpointAddress;
  }

  public N2InterfaceAmfInfo ipv6EndpointAddress(List<Ipv6Addr> ipv6EndpointAddress) {
    this.ipv6EndpointAddress = ipv6EndpointAddress;
    return this;
  }

  public N2InterfaceAmfInfo addIpv6EndpointAddressItem(Ipv6Addr ipv6EndpointAddressItem) {
    if (this.ipv6EndpointAddress == null) {
      this.ipv6EndpointAddress = new ArrayList<>();
    }
    this.ipv6EndpointAddress.add(ipv6EndpointAddressItem);
    return this;
  }

  /**
   * Get ipv6EndpointAddress
   * @return ipv6EndpointAddress
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(min = 1) 
  public List<Ipv6Addr> getIpv6EndpointAddress() {
    return ipv6EndpointAddress;
  }

  public void setIpv6EndpointAddress(List<Ipv6Addr> ipv6EndpointAddress) {
    this.ipv6EndpointAddress = ipv6EndpointAddress;
  }

  public N2InterfaceAmfInfo amfName(String amfName) {
    this.amfName = amfName;
    return this;
  }

  /**
   * Get amfName
   * @return amfName
  */
  @ApiModelProperty(value = "")


  public String getAmfName() {
    return amfName;
  }

  public void setAmfName(String amfName) {
    this.amfName = amfName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    N2InterfaceAmfInfo n2InterfaceAmfInfo = (N2InterfaceAmfInfo) o;
    return Objects.equals(this.ipv4EndpointAddress, n2InterfaceAmfInfo.ipv4EndpointAddress) &&
        Objects.equals(this.ipv6EndpointAddress, n2InterfaceAmfInfo.ipv6EndpointAddress) &&
        Objects.equals(this.amfName, n2InterfaceAmfInfo.amfName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4EndpointAddress, ipv6EndpointAddress, amfName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class N2InterfaceAmfInfo {\n");
    
    sb.append("    ipv4EndpointAddress: ").append(toIndentedString(ipv4EndpointAddress)).append("\n");
    sb.append("    ipv6EndpointAddress: ").append(toIndentedString(ipv6EndpointAddress)).append("\n");
    sb.append("    amfName: ").append(toIndentedString(amfName)).append("\n");
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

